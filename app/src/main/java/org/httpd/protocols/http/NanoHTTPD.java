package org.httpd.protocols.http;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.KeyStore;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLServerSocketFactory;
import org.httpd.protocols.http.response.Response;
import org.httpd.protocols.http.response.Status;
import org.httpd.protocols.http.tempfiles.ITempFileManager;
import org.httpd.protocols.http.threading.IAsyncRunner;
import org.httpd.util.IFactory;
import org.httpd.util.IFactoryThrowing;
import org.httpd.util.IHandler;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NanoHTTPD {
    public static final String MIME_HTML = "text/html";
    public static final String MIME_PLAINTEXT = "text/plain";
    public static Map<String, String> MIME_TYPES = null;
    private static final String QUERY_STRING_PARAMETER = "NanoHttpd.QUERY_STRING";
    public static final int SOCKET_READ_TIMEOUT = 5000;
    public IAsyncRunner asyncRunner;
    public final String hostname;
    private IHandler<IHTTPSession, Response> httpHandler;
    public List<IHandler<IHTTPSession, Response>> interceptors;
    public final int myPort;
    private volatile ServerSocket myServerSocket;
    private Thread myThread;
    private IFactoryThrowing<ServerSocket, IOException> serverSocketFactory;
    private IFactory<ITempFileManager> tempFileManagerFactory;
    public static final String CONTENT_DISPOSITION_REGEX = "([ |\t]*Content-Disposition[ |\t]*:)(.*)";
    public static final Pattern CONTENT_DISPOSITION_PATTERN = Pattern.compile(CONTENT_DISPOSITION_REGEX, 2);
    public static final String CONTENT_TYPE_REGEX = "([ |\t]*content-type[ |\t]*:)(.*)";
    public static final Pattern CONTENT_TYPE_PATTERN = Pattern.compile(CONTENT_TYPE_REGEX, 2);
    public static final String CONTENT_DISPOSITION_ATTRIBUTE_REGEX = "[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]";
    public static final Pattern CONTENT_DISPOSITION_ATTRIBUTE_PATTERN = Pattern.compile(CONTENT_DISPOSITION_ATTRIBUTE_REGEX);
    public static final Logger LOG = Logger.getLogger(NanoHTTPD.class.getName());

    /* JADX INFO: renamed from: org.httpd.protocols.http.NanoHTTPD$1 */
    public class C50651 implements IHandler<IHTTPSession, Response> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ NanoHTTPD f16967a;

        /* JADX WARN: Invalid debug info offset */
        public C50651(NanoHTTPD nanoHTTPD) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.httpd.util.IHandler
        /* JADX INFO: renamed from: a */
        public Response mo24903a(IHTTPSession iHTTPSession) {
            return null;
        }
    }

    public static final class ResponseException extends Exception {

        /* JADX INFO: renamed from: b */
        public static final long f16968b = 6569838532917408380L;

        /* JADX INFO: renamed from: a */
        public final Status f16969a;

        /* JADX WARN: Invalid debug info offset */
        public ResponseException(Status status, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public ResponseException(Status status, String str, Exception exc) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Status m24904a() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public NanoHTTPD(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public NanoHTTPD(String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x001c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static void m24902a(java.util.Map<java.lang.String, java.lang.String> r9, java.lang.String r10) {
        /*
            return
        L24:
        L26:
        L4a:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.httpd.protocols.http.NanoHTTPD.m24902a(java.util.Map, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static Map<String, List<String>> decodeParameters(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Map<String, List<String>> decodeParameters(Map<String, String> map) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String decodePercent(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getMimeTypeForFile(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static javax.net.ssl.SSLServerSocketFactory makeSSLSocketFactory(java.lang.String r3, char[] r4) {
        /*
            r0 = 0
            return r0
        L25:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.httpd.protocols.http.NanoHTTPD.makeSSLSocketFactory(java.lang.String, char[]):javax.net.ssl.SSLServerSocketFactory");
    }

    /* JADX WARN: Invalid debug info offset */
    public static SSLServerSocketFactory makeSSLSocketFactory(KeyStore keyStore, KeyManagerFactory keyManagerFactory) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static SSLServerSocketFactory makeSSLSocketFactory(KeyStore keyStore, KeyManager[] keyManagerArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Map<String, String> mimeTypes() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static final void safeClose(java.lang.Object r3) {
        /*
            return
        Lc:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.httpd.protocols.http.NanoHTTPD.safeClose(java.lang.Object):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public void addHTTPInterceptor(IHandler<IHTTPSession, Response> iHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void closeAllConnections() {
        /*
            r1 = this;
            return
        L6:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.httpd.protocols.http.NanoHTTPD.closeAllConnections():void");
    }

    /* JADX WARN: Invalid debug info offset */
    public ClientHandler createClientHandler(Socket socket, InputStream inputStream) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ServerRunnable createServerRunnable(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getHostname() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final int getListeningPort() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public ServerSocket getMyServerSocket() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public IFactoryThrowing<ServerSocket, IOException> getServerSocketFactory() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public IFactory<ITempFileManager> getTempFileManagerFactory() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Response handle(IHTTPSession iHTTPSession) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean isAlive() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void makeSecure(SSLServerSocketFactory sSLServerSocketFactory, String[] strArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Response serve(IHTTPSession iHTTPSession) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setAsyncRunner(IAsyncRunner iAsyncRunner) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setHTTPHandler(IHandler<IHTTPSession, Response> iHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setServerSocketFactory(IFactoryThrowing<ServerSocket, IOException> iFactoryThrowing) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTempFileManagerFactory(IFactory<ITempFileManager> iFactory) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void start() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void start(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0036
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void start(int r3, boolean r4) {
        /*
            r2 = this;
            return
        L3a:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.httpd.protocols.http.NanoHTTPD.start(int, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public void stop() {
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean wasStarted() {
        return false;
    }
}
