package info.guardianproject.netcipher.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public class TlsOnlySocketFactory extends SSLSocketFactory {
    private static final int HANDSHAKE_TIMEOUT = 0;
    public static final String SSLV2 = "SSLv2";
    public static final String SSLV3 = "SSLv3";
    private static final String TAG = "TlsOnlySocketFactory";
    private final boolean compatible;
    private final SSLSocketFactory delegate;

    public class DelegateSSLSocket extends SSLSocket {
        protected final SSLSocket delegate;
        final /* synthetic */ TlsOnlySocketFactory this$0;

        /* JADX WARN: Invalid debug info offset */
        public DelegateSSLSocket(TlsOnlySocketFactory tlsOnlySocketFactory, SSLSocket sSLSocket) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocket
        public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public void bind(SocketAddress socketAddress) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws java.io.IOException {
            /*
                r1 = this;
                return
            L8:
            */
            throw new UnsupportedOperationException("Method not decompiled: info.guardianproject.netcipher.client.TlsOnlySocketFactory.DelegateSSLSocket.close():void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public void connect(SocketAddress socketAddress) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public void connect(SocketAddress socketAddress, int i) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        public boolean equals(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public SocketChannel getChannel() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocket
        public boolean getEnableSessionCreation() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocket
        public String[] getEnabledCipherSuites() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocket
        public String[] getEnabledProtocols() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public InetAddress getInetAddress() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public InputStream getInputStream() throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public boolean getKeepAlive() throws SocketException {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public InetAddress getLocalAddress() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public int getLocalPort() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public SocketAddress getLocalSocketAddress() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocket
        public boolean getNeedClientAuth() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public boolean getOOBInline() throws SocketException {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public OutputStream getOutputStream() throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public int getPort() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public synchronized int getReceiveBufferSize() throws SocketException {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public SocketAddress getRemoteSocketAddress() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public boolean getReuseAddress() throws SocketException {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public synchronized int getSendBufferSize() throws SocketException {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocket
        public SSLSession getSession() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public int getSoLinger() throws SocketException {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public synchronized int getSoTimeout() throws SocketException {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocket
        public String[] getSupportedCipherSuites() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocket
        public String[] getSupportedProtocols() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public boolean getTcpNoDelay() throws SocketException {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public int getTrafficClass() throws SocketException {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocket
        public boolean getUseClientMode() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocket
        public boolean getWantClientAuth() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public boolean isBound() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public boolean isClosed() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public boolean isConnected() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public boolean isInputShutdown() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public boolean isOutputShutdown() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocket
        public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public void sendUrgentData(int i) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocket
        public void setEnableSessionCreation(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocket
        public void setEnabledCipherSuites(String[] strArr) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocket
        public void setEnabledProtocols(String[] strArr) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        public info.guardianproject.netcipher.client.TlsOnlySocketFactory.DelegateSSLSocket setHostname(java.lang.String r7) {
            /*
                r6 = this;
                r0 = 0
                return r0
            L1e:
            */
            throw new UnsupportedOperationException("Method not decompiled: info.guardianproject.netcipher.client.TlsOnlySocketFactory.DelegateSSLSocket.setHostname(java.lang.String):info.guardianproject.netcipher.client.TlsOnlySocketFactory$DelegateSSLSocket");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public void setKeepAlive(boolean z) throws SocketException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocket
        public void setNeedClientAuth(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public void setOOBInline(boolean z) throws SocketException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public void setPerformancePreferences(int i, int i2, int i3) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.net.Socket
        public synchronized void setReceiveBufferSize(int r2) throws java.net.SocketException {
            /*
                r1 = this;
                return
            L8:
            */
            throw new UnsupportedOperationException("Method not decompiled: info.guardianproject.netcipher.client.TlsOnlySocketFactory.DelegateSSLSocket.setReceiveBufferSize(int):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public void setReuseAddress(boolean z) throws SocketException {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.net.Socket
        public synchronized void setSendBufferSize(int r2) throws java.net.SocketException {
            /*
                r1 = this;
                return
            L8:
            */
            throw new UnsupportedOperationException("Method not decompiled: info.guardianproject.netcipher.client.TlsOnlySocketFactory.DelegateSSLSocket.setSendBufferSize(int):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public void setSoLinger(boolean z, int i) throws SocketException {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.net.Socket
        public synchronized void setSoTimeout(int r2) throws java.net.SocketException {
            /*
                r1 = this;
                return
            L8:
            */
            throw new UnsupportedOperationException("Method not decompiled: info.guardianproject.netcipher.client.TlsOnlySocketFactory.DelegateSSLSocket.setSoTimeout(int):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public void setTcpNoDelay(boolean z) throws SocketException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public void setTrafficClass(int i) throws SocketException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocket
        public void setUseClientMode(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocket
        public void setWantClientAuth(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public void shutdownInput() throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.net.Socket
        public void shutdownOutput() throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocket
        public void startHandshake() throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // javax.net.ssl.SSLSocket, java.net.Socket
        public String toString() {
            return null;
        }
    }

    public class TlsOnlySSLSocket extends DelegateSSLSocket {
        final boolean compatible;
        final /* synthetic */ TlsOnlySocketFactory this$0;

        /* JADX WARN: Invalid debug info offset */
        private TlsOnlySSLSocket(TlsOnlySocketFactory tlsOnlySocketFactory, SSLSocket sSLSocket, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ TlsOnlySSLSocket(TlsOnlySocketFactory tlsOnlySocketFactory, SSLSocket sSLSocket, boolean z, C45661 c45661) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // info.guardianproject.netcipher.client.TlsOnlySocketFactory.DelegateSSLSocket, javax.net.ssl.SSLSocket
        public void setEnabledProtocols(String[] strArr) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public TlsOnlySocketFactory() {
    }

    /* JADX WARN: Invalid debug info offset */
    public TlsOnlySocketFactory(SSLSocketFactory sSLSocketFactory) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TlsOnlySocketFactory(SSLSocketFactory sSLSocketFactory, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    private Socket makeSocketSafe(Socket socket, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return null;
    }
}
