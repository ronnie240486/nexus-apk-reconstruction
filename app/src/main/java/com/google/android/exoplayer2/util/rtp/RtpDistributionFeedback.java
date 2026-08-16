package com.google.android.exoplayer2.util.rtp;

import android.net.Uri;
import android.os.ConditionVariable;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.rtp.rtcp.RtcpCompoundPacket;
import com.google.android.exoplayer2.util.rtp.rtcp.RtcpFeedbackPacket;
import com.google.android.exoplayer2.util.rtp.rtcp.RtcpSdesPacket;
import com.google.android.exoplayer2.util.rtp.rtcp.RtcpSrPacket;
import com.google.android.exoplayer2.util.rtp.rtcp.RtcpTokenPacket;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface RtpDistributionFeedback {
    public static final int ERROR_NO_RETRY = -99876;
    public static final int MAX_PACKET_SEQ = 65536;
    public static final int UNKNOWN_SEQ = -1;

    public interface Factory {
        RtpDistributionFeedback createDistributionFeedback();
    }

    public interface Properties {
        public static final int FB_CONGESTION_CONTROL_URI = 4;
        public static final int FB_EVENTS_CALLBACK = 6;
        public static final int FB_PORT_MAPPING_URI = 5;
        public static final int FB_RAMS_URI = 3;
        public static final int FB_SCHEME = 1;
        public static final int FB_VENDOR = 2;
    }

    public interface Providers {
        public static final int ADTEC_DIGITAL = 1;
        public static final int ALTICAST = 2;
        public static final int ALU = 3;
        public static final int BCC = 4;
        public static final int BEENIUS = 6;
        public static final int BEE_MEDIASOFT = 5;
        public static final int CASCADE = 7;
        public static final int COMIGO = 8;
        public static final int CONKLIN_INTRACOM = 9;
        public static final int CUBIWARE = 10;
        public static final int DIGISOFT_TV = 11;
        public static final int EASY_TV = 12;
        public static final int ERICSSON = 13;
        public static final int ESPIAL = 14;
        public static final int HUAWEI = 15;
        public static final int IKON = 16;
        public static final int LEV_TV = 17;
        public static final int MICROSOFT = 18;
        public static final int MINERVA = 19;
        public static final int MIRADA = 20;
        public static final int NANGU_TV = 21;
        public static final int NETGEM = 22;
        public static final int NOKIA = 24;
        public static final int NORDIJA = 23;
        public static final int OCILION = 25;
        public static final int QUADRILLE = 26;
        public static final int SEACHANGE = 27;
        public static final int SIEMENS = 28;
        public static final int SMARTLABS = 29;
        public static final int THOMSON = 30;
        public static final int TIVO = 31;
        public static final int UTSTART = 32;
        public static final int VIANEOS = 33;
        public static final int ZAPPWARE = 34;
        public static final int ZENTERIO = 35;
        public static final int ZTE = 36;
    }

    public static abstract class RtpAuthTokenSource implements RtpFeedbackTarget, RtpFeedbackTarget.AuthTokenMessages, RtcpCompoundPacket.RtcpCompoundPacketEventListener, Loader.Loadable, Loader.Callback<RtpAuthTokenSource> {
        private InetAddress address;
        private RtpFeedbackTargetSource.AuthTokenEventListener eventListener;
        private long expirationTime;
        protected DatagramSocket socket;
        private InetSocketAddress socketAddress;
        private final int socketTimeoutMillis;
        private byte[] token;
        private Uri uri;
        private volatile boolean loadCanceled = false;
        private boolean authReponsePending = false;
        private final ConditionVariable loadCondition = new ConditionVariable(false);
        private byte[] inBuffer = new byte[1500];
        private byte[] outBuffer = new byte[1500];
        private final DatagramPacket inPacket = new DatagramPacket(this.inBuffer, 0, 1500);
        protected final DatagramPacket outPacket = new DatagramPacket(this.outBuffer, 0, 1500);

        public RtpAuthTokenSource(int i, RtpFeedbackTargetSource.AuthTokenEventListener authTokenEventListener) {
            this.eventListener = authTokenEventListener;
            this.socketTimeoutMillis = i;
        }

        private void handlePacket(byte[] bArr, int i) throws RtcpCompoundPacket.RtcpCompoundPacketException {
            new RtcpCompoundPacket(this).fromBytes(bArr, i);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
            this.loadCanceled = true;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTarget
        public void close() {
            try {
                DatagramSocket datagramSocket = this.socket;
                if (datagramSocket != null) {
                    datagramSocket.close();
                    this.socket = null;
                }
                this.loadCondition.close();
            } catch (Exception unused) {
            }
            this.address = null;
            this.socketAddress = null;
        }

        public RtpFeedbackTargetSource.AuthTokenEventListener getEventListener() {
            return this.eventListener;
        }

        public final long getExpirationTime() {
            return this.expirationTime;
        }

        public abstract byte[] getRandomNonce();

        public final byte[] getToken() {
            return this.token;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTarget
        public Uri getUri() {
            return this.uri;
        }

        public boolean isLoadCanceled() {
            return this.loadCanceled;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() throws InterruptedException, IOException {
            while (!this.loadCanceled) {
                try {
                    this.loadCondition.block();
                    if (this.authReponsePending) {
                        this.socket.receive(this.inPacket);
                        handlePacket(this.inPacket.getData(), this.inPacket.getLength());
                    }
                } catch (RtcpCompoundPacket.RtcpCompoundPacketException unused) {
                    if (this.authReponsePending) {
                        this.authReponsePending = false;
                        this.eventListener.onAuthTokenResponseBeforeError();
                    }
                } catch (SocketTimeoutException unused2) {
                    this.authReponsePending = false;
                    this.eventListener.onAuthTokenResponseBeforeTimeout();
                }
                if (this.authReponsePending) {
                    this.authReponsePending = false;
                    this.eventListener.onAuthTokenResponseBeforeError();
                }
            }
        }

        public int onLoadError(RtpAuthTokenSource rtpAuthTokenSource, long j, long j2, IOException iOException) {
            this.eventListener.onRtpAuthTokenSourceError();
            return RtpDistributionFeedback.ERROR_NO_RETRY;
        }

        @Override // com.google.android.exoplayer2.util.rtp.rtcp.RtcpCompoundPacket.RtcpCompoundPacketEventListener
        public void onRtpFeedbackPacket(RtcpFeedbackPacket rtcpFeedbackPacket) {
        }

        @Override // com.google.android.exoplayer2.util.rtp.rtcp.RtcpCompoundPacket.RtcpCompoundPacketEventListener
        public void onSenderReportPacket(RtcpSrPacket rtcpSrPacket) {
        }

        @Override // com.google.android.exoplayer2.util.rtp.rtcp.RtcpCompoundPacket.RtcpCompoundPacketEventListener
        public void onSourceDescriptionPacket(RtcpSdesPacket rtcpSdesPacket) {
        }

        @Override // com.google.android.exoplayer2.util.rtp.rtcp.RtcpCompoundPacket.RtcpCompoundPacketEventListener
        public void onTokenPacket(RtcpTokenPacket rtcpTokenPacket) {
            if (rtcpTokenPacket.getPayloadType() != 210 || rtcpTokenPacket.getSmt() != 2) {
                this.eventListener.onAuthTokenResponseUnexpected();
                return;
            }
            this.token = rtcpTokenPacket.getTokenElement();
            this.expirationTime = rtcpTokenPacket.getRelativeExpirationTime();
            this.authReponsePending = false;
            this.eventListener.onAuthTokenResponse();
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTarget
        public void open(Uri uri) throws RtpFeedbackTarget.RtpFeedbackTargetException {
            this.uri = (Uri) Assertions.checkNotNull(uri);
            String host = uri.getHost();
            int port = uri.getPort();
            try {
                this.address = InetAddress.getByName(host);
                this.socketAddress = new InetSocketAddress(this.address, port);
                DatagramSocket datagramSocket = new DatagramSocket();
                this.socket = datagramSocket;
                datagramSocket.connect(this.socketAddress);
                try {
                    this.socket.setSoTimeout(this.socketTimeoutMillis);
                } catch (SocketException e) {
                    throw new RtpFeedbackTarget.RtpFeedbackTargetException(e);
                }
            } catch (IOException e2) {
                throw new RtpFeedbackTarget.RtpFeedbackTargetException(e2);
            }
        }

        public void sendMessageFromBytes(byte[] bArr, int i) throws IOException {
            this.outPacket.setData(bArr, 0, i);
            this.socket.send(this.outPacket);
            this.loadCondition.open();
        }

        public final void setAuthTokenResponsePending(boolean z) {
            this.authReponsePending = z;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCanceled(RtpAuthTokenSource rtpAuthTokenSource, long j, long j2, boolean z) {
            this.eventListener.onRtpAuthTokenSourceCanceled();
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCompleted(RtpAuthTokenSource rtpAuthTokenSource, long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(RtpAuthTokenSource rtpAuthTokenSource, long j, long j2, IOException iOException, int i) {
            getEventListener().onRtpAuthTokenSourceError();
            return Loader.DONT_RETRY;
        }
    }

    public static abstract class RtpBurstSource implements RtpFeedbackTarget, RtpFeedbackTarget.BurstMessages, RtcpCompoundPacket.RtcpCompoundPacketEventListener, Loader.Loadable, Loader.Callback<RtpBurstSource> {
        private InetAddress address;
        private final RtpFeedbackTargetSource.BurstEventListener eventListener;
        private DatagramSocket socket;
        private InetSocketAddress socketAddress;
        private final int socketTimeoutMillis;
        private Uri uri;
        private volatile boolean loadCanceled = false;
        private byte[] inBuffer = new byte[1500];
        private byte[] outBuffer = new byte[1500];
        private final DatagramPacket inPacket = new DatagramPacket(this.inBuffer, 0, 1500);
        private final DatagramPacket outPacket = new DatagramPacket(this.outBuffer, 0, 1500);

        public RtpBurstSource(int i, RtpFeedbackTargetSource.BurstEventListener burstEventListener) {
            this.eventListener = burstEventListener;
            this.socketTimeoutMillis = i;
        }

        private void handlePacket(byte[] bArr, int i) throws RtcpCompoundPacket.RtcpCompoundPacketException {
            try {
                RtpPacket rtpPacket = new RtpPacket();
                rtpPacket.fromBytes(bArr, i);
                if (processRtpPacket(rtpPacket)) {
                    this.eventListener.onRtpPacketBurstReceived(rtpPacket);
                }
            } catch (RtpPacket.RtpPacketException unused) {
                new RtcpCompoundPacket(this).fromBytes(bArr, i);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
            this.loadCanceled = true;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTarget
        public void close() {
            try {
                DatagramSocket datagramSocket = this.socket;
                if (datagramSocket != null) {
                    datagramSocket.close();
                    this.socket = null;
                }
            } catch (Exception unused) {
            }
            this.address = null;
            this.socketAddress = null;
        }

        public RtpFeedbackTargetSource.BurstEventListener getEventListener() {
            return this.eventListener;
        }

        public abstract int getMaxBufferCapacity();

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTarget
        public Uri getUri() {
            return this.uri;
        }

        public abstract boolean isAuthTokenRejected(RtcpTokenPacket rtcpTokenPacket);

        public boolean isLoadCanceled() {
            return this.loadCanceled;
        }

        public abstract boolean isRapidAcquisitionAccepted(RtcpFeedbackPacket rtcpFeedbackPacket);

        public abstract boolean isRapidAcquisitionResponse(RtcpFeedbackPacket rtcpFeedbackPacket);

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() throws InterruptedException, IOException {
            while (!this.loadCanceled) {
                try {
                    if (!this.loadCanceled) {
                        this.socket.receive(this.inPacket);
                        handlePacket(this.inPacket.getData(), this.inPacket.getLength());
                    }
                } catch (RtcpCompoundPacket.RtcpCompoundPacketException unused) {
                } catch (SocketTimeoutException e) {
                    throw new SocketTimeoutException(e.getMessage());
                }
            }
        }

        public int onLoadError(RtpBurstSource rtpBurstSource, long j, long j2, IOException iOException) {
            this.eventListener.onRtpBurstSourceError();
            return RtpDistributionFeedback.ERROR_NO_RETRY;
        }

        @Override // com.google.android.exoplayer2.util.rtp.rtcp.RtcpCompoundPacket.RtcpCompoundPacketEventListener
        public void onRtpFeedbackPacket(RtcpFeedbackPacket rtcpFeedbackPacket) {
            if (isRapidAcquisitionResponse(rtcpFeedbackPacket)) {
                if (isRapidAcquisitionAccepted(rtcpFeedbackPacket)) {
                    this.eventListener.onBurstRapidAcquisitionAccepted();
                } else {
                    this.eventListener.onBurstRapidAcquisitionRejected();
                }
            }
        }

        @Override // com.google.android.exoplayer2.util.rtp.rtcp.RtcpCompoundPacket.RtcpCompoundPacketEventListener
        public void onSenderReportPacket(RtcpSrPacket rtcpSrPacket) {
        }

        @Override // com.google.android.exoplayer2.util.rtp.rtcp.RtcpCompoundPacket.RtcpCompoundPacketEventListener
        public void onSourceDescriptionPacket(RtcpSdesPacket rtcpSdesPacket) {
        }

        @Override // com.google.android.exoplayer2.util.rtp.rtcp.RtcpCompoundPacket.RtcpCompoundPacketEventListener
        public void onTokenPacket(RtcpTokenPacket rtcpTokenPacket) {
            if (isAuthTokenRejected(rtcpTokenPacket)) {
                this.eventListener.onInvalidToken();
            }
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTarget
        public void open(Uri uri) throws RtpFeedbackTarget.RtpFeedbackTargetException {
            this.uri = (Uri) Assertions.checkNotNull(uri);
            String host = uri.getHost();
            int port = uri.getPort();
            try {
                this.address = InetAddress.getByName(host);
                this.socketAddress = new InetSocketAddress(this.address, port);
                DatagramSocket datagramSocket = new DatagramSocket();
                this.socket = datagramSocket;
                datagramSocket.connect(this.socketAddress);
                try {
                    this.socket.setSoTimeout(this.socketTimeoutMillis);
                } catch (SocketException e) {
                    throw new RtpFeedbackTarget.RtpFeedbackTargetException(e);
                }
            } catch (IOException e2) {
                throw new RtpFeedbackTarget.RtpFeedbackTargetException(e2);
            }
        }

        public abstract boolean processRtpPacket(RtpPacket rtpPacket);

        public void sendMessageFromBytes(byte[] bArr, int i) throws IOException {
            this.outPacket.setData(bArr, 0, i);
            this.socket.send(this.outPacket);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCanceled(RtpBurstSource rtpBurstSource, long j, long j2, boolean z) {
            this.eventListener.onRtpBurstSourceCanceled();
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCompleted(RtpBurstSource rtpBurstSource, long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(RtpBurstSource rtpBurstSource, long j, long j2, IOException iOException, int i) {
            getEventListener().onRtpBurstSourceError();
            return Loader.DONT_RETRY;
        }
    }

    public interface RtpDistributionEventListener {
        void onRtpDistributionSourceCanceled();

        void onRtpDistributionSourceError();

        void onRtpLostPacketDetected(int i, int i2);

        void onRtpPacketReceived(RtpPacket rtpPacket);
    }

    public static abstract class RtpDistributionSource implements Loader.Loadable, Loader.Callback<RtpDistributionSource> {
        private InetAddress address;
        private final RtpDistributionEventListener eventListener;
        private MulticastSocket mcastSocket;
        private DatagramSocket socket;
        private InetSocketAddress socketAddress;
        private final int socketTimeoutMillis;
        private Uri uri;
        private volatile boolean loadCanceled = false;
        private byte[] inBuffer = new byte[1500];
        private final DatagramPacket inPacket = new DatagramPacket(this.inBuffer, 0, 1500);

        public final class RtpDistributionSourceException extends IOException {
            public RtpDistributionSourceException(IOException iOException) {
                super(iOException);
            }
        }

        public RtpDistributionSource(int i, RtpDistributionEventListener rtpDistributionEventListener) {
            this.eventListener = rtpDistributionEventListener;
            this.socketTimeoutMillis = i;
        }

        private void handlePacket(byte[] bArr, int i) throws RtpPacket.RtpPacketException {
            RtpPacket rtpPacket = new RtpPacket();
            rtpPacket.fromBytes(bArr, i);
            if (processRtpPacket(rtpPacket)) {
                this.eventListener.onRtpPacketReceived(rtpPacket);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public final void cancelLoad() {
            this.loadCanceled = true;
        }

        public void close() {
            try {
                DatagramSocket datagramSocket = this.socket;
                if (datagramSocket != null) {
                    datagramSocket.close();
                    this.socket = null;
                }
            } catch (Exception unused) {
            }
            this.address = null;
            this.socketAddress = null;
        }

        public abstract int getMaxBufferCapacity();

        public Uri getUri() {
            return this.uri;
        }

        public final boolean isLoadCanceled() {
            return this.loadCanceled;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public final void load() throws InterruptedException, IOException {
            while (!this.loadCanceled) {
                try {
                    if (!this.loadCanceled) {
                        this.socket.receive(this.inPacket);
                        handlePacket(this.inPacket.getData(), this.inPacket.getLength());
                    }
                } catch (RtpPacket.RtpPacketException unused) {
                } catch (SocketTimeoutException e) {
                    throw new SocketTimeoutException(e.getMessage());
                }
            }
        }

        public int onLoadError(RtpDistributionSource rtpDistributionSource, long j, long j2, IOException iOException) {
            this.eventListener.onRtpDistributionSourceError();
            return RtpDistributionFeedback.ERROR_NO_RETRY;
        }

        public void open(Uri uri) throws RtpDistributionSourceException {
            this.uri = (Uri) Assertions.checkNotNull(uri);
            String host = uri.getHost();
            int port = uri.getPort();
            try {
                this.address = InetAddress.getByName(host);
                this.socketAddress = new InetSocketAddress(this.address, port);
                if (this.address.isMulticastAddress()) {
                    MulticastSocket multicastSocket = new MulticastSocket(this.socketAddress);
                    this.mcastSocket = multicastSocket;
                    multicastSocket.joinGroup(this.address);
                    this.socket = this.mcastSocket;
                } else {
                    DatagramSocket datagramSocket = new DatagramSocket();
                    this.socket = datagramSocket;
                    datagramSocket.connect(this.socketAddress);
                }
                try {
                    this.socket.setSoTimeout(this.socketTimeoutMillis);
                } catch (SocketException e) {
                    throw new RtpDistributionSourceException(e);
                }
            } catch (IOException e2) {
                throw new RtpDistributionSourceException(e2);
            }
        }

        public abstract boolean processRtpPacket(RtpPacket rtpPacket);

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCanceled(RtpDistributionSource rtpDistributionSource, long j, long j2, boolean z) {
            this.eventListener.onRtpDistributionSourceCanceled();
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCompleted(RtpDistributionSource rtpDistributionSource, long j, long j2) {
        }
    }

    public interface RtpFeedbackEvent {
    }

    public interface RtpFeedbackEventListener {
        void onRtpFeedbackEvent(RtpFeedbackEvent rtpFeedbackEvent);
    }

    public static final class RtpFeedbackProperties {
        private final Map<Integer, Object> properties = new HashMap();
        private Map<Integer, Object> propertiesSnapshot;

        public synchronized void clear() {
            this.propertiesSnapshot = null;
            this.properties.clear();
        }

        public synchronized void clearAndSet(Map<Integer, Object> map) {
            this.propertiesSnapshot = null;
            map.clear();
            map.putAll(map);
        }

        public synchronized Map<Integer, Object> getSnapshot() {
            try {
                if (this.propertiesSnapshot == null) {
                    this.propertiesSnapshot = Collections.unmodifiableMap(new HashMap(this.properties));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.propertiesSnapshot;
        }

        public synchronized void remove(Integer num) {
            this.propertiesSnapshot = null;
            this.properties.remove(num);
        }

        public synchronized void set(Integer num, Object obj) {
            this.propertiesSnapshot = null;
            this.properties.put(num, obj);
        }

        public synchronized void set(Map<Integer, Object> map) {
            this.propertiesSnapshot = null;
            map.putAll(map);
        }
    }

    public interface RtpFeedbackTarget {

        public interface AuthTokenMessages {
            void sendAuthTokenRequest() throws IOException;
        }

        public interface BurstMessages {
            void sendBurstRapidAcquisitionRequest(Uri uri) throws IOException;

            void sendBurstTerminationRequest() throws IOException;
        }

        public interface RetransmissionMessages {
            void sendRetransmissionPacketRequest(int i, int i2) throws IOException;

            void sendRetransmissionTerminationRequest() throws IOException;
        }

        public static final class RtpFeedbackTargetException extends IOException {
            public RtpFeedbackTargetException(IOException iOException) {
                super(iOException);
            }
        }

        void close();

        Uri getUri();

        void open(Uri uri) throws RtpFeedbackTargetException;
    }

    public interface RtpFeedbackTargetSource {

        public interface AuthTokenEventListener {
            void onAuthTokenResponse();

            void onAuthTokenResponseBeforeError();

            void onAuthTokenResponseBeforeTimeout();

            void onAuthTokenResponseUnexpected();

            void onRtpAuthTokenSourceCanceled();

            void onRtpAuthTokenSourceError();
        }

        public interface BurstEventListener {
            void oBurstRapidAcquisitionResponseBeforeTimeout();

            void onBurstRapidAcquisitionAccepted();

            void onBurstRapidAcquisitionCompleted();

            void onBurstRapidAcquisitionRejected();

            void onInvalidToken();

            void onMulticastJoinSignal();

            void onRtpBurstSourceCanceled();

            void onRtpBurstSourceError();

            void onRtpPacketBurstReceived(RtpPacket rtpPacket);
        }

        public interface RetransmissionEventListener {
            void onInvalidToken();

            void onRtpPacketLossReceived(RtpPacket rtpPacket);

            void onRtpRetransmissionSourceCanceled();

            void onRtpRetransmissionSourceError();
        }
    }

    public static abstract class RtpRetransmissionSource implements RtpFeedbackTarget, RtpFeedbackTarget.RetransmissionMessages, RtcpCompoundPacket.RtcpCompoundPacketEventListener, Loader.Loadable, Loader.Callback<RtpRetransmissionSource> {
        protected static final int BITMASK_LENGTH = 16;
        private InetAddress address;
        private final RtpFeedbackTargetSource.RetransmissionEventListener eventListener;
        private DatagramSocket socket;
        private InetSocketAddress socketAddress;
        private Uri uri;
        private volatile boolean loadCanceled = false;
        private byte[] inBuffer = new byte[1500];
        private byte[] outBuffer = new byte[1500];
        private final DatagramPacket inPacket = new DatagramPacket(this.inBuffer, 0, 1500);
        private final DatagramPacket outPacket = new DatagramPacket(this.outBuffer, 0, 1500);

        public RtpRetransmissionSource(RtpFeedbackTargetSource.RetransmissionEventListener retransmissionEventListener) {
            this.eventListener = retransmissionEventListener;
        }

        private void handlePacket(byte[] bArr, int i) throws RtcpCompoundPacket.RtcpCompoundPacketException {
            try {
                RtpPacket rtpPacket = new RtpPacket();
                rtpPacket.fromBytes(bArr, i);
                if (processRtpPacket(rtpPacket)) {
                    this.eventListener.onRtpPacketLossReceived(rtpPacket);
                }
            } catch (RtpPacket.RtpPacketException unused) {
                new RtcpCompoundPacket(this).fromBytes(bArr, i);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
            this.loadCanceled = true;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTarget
        public void close() {
            try {
                DatagramSocket datagramSocket = this.socket;
                if (datagramSocket != null) {
                    datagramSocket.close();
                    this.socket = null;
                }
            } catch (Exception unused) {
            }
            this.address = null;
            this.socketAddress = null;
        }

        public RtpFeedbackTargetSource.RetransmissionEventListener getEventListener() {
            return this.eventListener;
        }

        public abstract int getMaxBufferCapacity();

        public abstract long getMaxDelayTimeForPending();

        public abstract int getMaxPacketsRecoveryPending();

        public abstract int getPacketsRecoveryPending();

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTarget
        public Uri getUri() {
            return this.uri;
        }

        public abstract boolean isAuthTokenRejected(RtcpTokenPacket rtcpTokenPacket);

        public boolean isLoadCanceled() {
            return this.loadCanceled;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() throws InterruptedException, IOException {
            while (!this.loadCanceled) {
                try {
                    if (!this.loadCanceled) {
                        this.socket.receive(this.inPacket);
                        handlePacket(this.inPacket.getData(), this.inPacket.getLength());
                    }
                } catch (RtcpCompoundPacket.RtcpCompoundPacketException unused) {
                }
            }
        }

        public int onLoadError(RtpRetransmissionSource rtpRetransmissionSource, long j, long j2, IOException iOException) {
            this.eventListener.onRtpRetransmissionSourceError();
            return RtpDistributionFeedback.ERROR_NO_RETRY;
        }

        @Override // com.google.android.exoplayer2.util.rtp.rtcp.RtcpCompoundPacket.RtcpCompoundPacketEventListener
        public void onRtpFeedbackPacket(RtcpFeedbackPacket rtcpFeedbackPacket) {
        }

        @Override // com.google.android.exoplayer2.util.rtp.rtcp.RtcpCompoundPacket.RtcpCompoundPacketEventListener
        public void onSenderReportPacket(RtcpSrPacket rtcpSrPacket) {
        }

        @Override // com.google.android.exoplayer2.util.rtp.rtcp.RtcpCompoundPacket.RtcpCompoundPacketEventListener
        public void onSourceDescriptionPacket(RtcpSdesPacket rtcpSdesPacket) {
        }

        @Override // com.google.android.exoplayer2.util.rtp.rtcp.RtcpCompoundPacket.RtcpCompoundPacketEventListener
        public void onTokenPacket(RtcpTokenPacket rtcpTokenPacket) {
            if (isAuthTokenRejected(rtcpTokenPacket)) {
                this.eventListener.onInvalidToken();
            }
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTarget
        public void open(Uri uri) throws RtpFeedbackTarget.RtpFeedbackTargetException {
            this.uri = (Uri) Assertions.checkNotNull(uri);
            String host = uri.getHost();
            int port = uri.getPort();
            try {
                this.address = InetAddress.getByName(host);
                this.socketAddress = new InetSocketAddress(this.address, port);
                DatagramSocket datagramSocket = new DatagramSocket();
                this.socket = datagramSocket;
                datagramSocket.connect(this.socketAddress);
            } catch (IOException e) {
                throw new RtpFeedbackTarget.RtpFeedbackTargetException(e);
            }
        }

        public abstract boolean processRtpPacket(RtpPacket rtpPacket);

        public abstract void resetAllPacketsRecoveryPending(long j);

        public void sendMessageFromBytes(byte[] bArr, int i) throws IOException {
            this.outPacket.setData(bArr, 0, i);
            this.socket.send(this.outPacket);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCanceled(RtpRetransmissionSource rtpRetransmissionSource, long j, long j2, boolean z) {
            this.eventListener.onRtpRetransmissionSourceCanceled();
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCompleted(RtpRetransmissionSource rtpRetransmissionSource, long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(RtpRetransmissionSource rtpRetransmissionSource, long j, long j2, IOException iOException, int i) {
            this.eventListener.onRtpRetransmissionSourceError();
            return Loader.DONT_RETRY;
        }
    }

    public interface Schemes {
        public static final int FB_CONGESTION_CONTROL = 4;
        public static final int FB_PORT_MAPPING = 8;
        public static final int FB_RAMS = 2;
        public static final int FB_REPORT = 1;
    }

    public static final class UnsupportedRtpDistributionFeedbackSourceException extends Exception {
        public UnsupportedRtpDistributionFeedbackSourceException(String str) {
            super(str);
        }

        public UnsupportedRtpDistributionFeedbackSourceException(String str, Throwable th) {
            super(str, th);
        }

        public UnsupportedRtpDistributionFeedbackSourceException(Throwable th) {
            super(th);
        }
    }

    RtpAuthTokenSource createAuthTokenSource(RtpFeedbackTargetSource.AuthTokenEventListener authTokenEventListener) throws UnsupportedRtpDistributionFeedbackSourceException;

    RtpBurstSource createBurstSource(RtpFeedbackTargetSource.BurstEventListener burstEventListener) throws UnsupportedRtpDistributionFeedbackSourceException;

    RtpDistributionSource createDistributionSource(RtpDistributionEventListener rtpDistributionEventListener) throws UnsupportedRtpDistributionFeedbackSourceException;

    RtpRetransmissionSource createRetransmissionSource(RtpFeedbackTargetSource.RetransmissionEventListener retransmissionEventListener) throws UnsupportedRtpDistributionFeedbackSourceException;

    void setFeedbackEventListener(RtpFeedbackEventListener rtpFeedbackEventListener);
}
