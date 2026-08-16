package cn.dolit.DLBT;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class DLL {
    private static AtomicBoolean LIB_LOADED = new AtomicBoolean(false);
    protected static final String TAG = "Dolit/";
    protected Context m_applicationContext;

    static {
        StringBuilder sb;
        try {
            System.loadLibrary("DLBT");
            System.loadLibrary("DLBT_API");
            LIB_LOADED.set(true);
        } catch (SecurityException e) {
            e = e;
            LIB_LOADED.set(false);
            sb = new StringBuilder("Encountered a security issue when loading DLBT library: ");
            sb.append(e);
            Log.e(TAG, sb.toString());
        } catch (UnsatisfiedLinkError e2) {
            e = e2;
            LIB_LOADED.set(false);
            sb = new StringBuilder("Can't load DLBT library: ");
            sb.append(e);
            Log.e(TAG, sb.toString());
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isLibraryLoaded() {
        return false;
    }

    public native void AddBanServerUrl(String str);

    public native int AddHoleServer(String str, int i);

    public native void AddServerIP(String str);

    public native int DHT_IsStarted();

    public native void DHT_Start(int i);

    public native void DHT_Stop();

    public native void DownloaderAddHttpDownload(int i, String str);

    public native void DownloaderAddHttpTrackerExtraParams(int i, String str);

    public native void DownloaderAddPeerSource(int i, String str, int i2);

    public native void DownloaderAddTracker(int i, String str, int i2);

    public native void DownloaderApplyPrioritize(int i);

    public native void DownloaderBanServerDownload(int i, int i2);

    public native int DownloaderDeleteUnRelatedFiles(int i);

    public native int DownloaderGetDownloadSpeed(int i);

    public native long DownloaderGetDownloadedBytes(int i);

    public native int DownloaderGetFileCount(int i);

    public native String DownloaderGetFileHash(int i, int i2);

    public native String DownloaderGetFilePathName(int i, int i2, int i3);

    public native float DownloaderGetFileProgress(int i, int i2);

    public native long DownloaderGetFileSize(int i, int i2);

    public native String DownloaderGetInfoHash(int i);

    public native String DownloaderGetLastError(int i);

    public native int DownloaderGetPieceCount(int i);

    public native int DownloaderGetPieceSize(int i);

    public native String DownloaderGetPiecesStatus(int i);

    public native float DownloaderGetProgress(int i);

    public native double DownloaderGetShareRate(int i);

    public native int DownloaderGetState(int i);

    public native String DownloaderGetTorrentName(int i);

    public native long DownloaderGetTotalFileSize(int i);

    public native long DownloaderGetTotalWanted(int i);

    public native long DownloaderGetTotalWantedDone(int i);

    public native int DownloaderGetUploadSpeed(int i);

    public native long DownloaderGetUploadedBytes(int i);

    public native int DownloaderInitialize(String str, String str2, String str3, int i, int i2, int i3, String str4, String str5, int i4, int i5);

    public native int DownloaderInitializeFromUrl(String str, String str2, String str3, int i, int i2, String str4, int i3, int i4);

    public native int DownloaderIsHaveTorrentInfo(int i);

    public native int DownloaderIsPadFile(int i, int i2);

    public native int DownloaderIsPaused(int i);

    public native int DownloaderIsReleasingFiles(int i);

    public native String DownloaderMakeURL(int i);

    public native void DownloaderPause(int i);

    public native int DownloaderRelease(int i, int i2);

    public native void DownloaderReleaseAllFiles(int i);

    public native void DownloaderRemoveAllTracker(int i);

    public native void DownloaderRemoveHttpDownload(int i, String str);

    public native void DownloaderResume(int i);

    public native void DownloaderResumeInError(int i);

    public native void DownloaderSaveStatusFile(int i);

    public native int DownloaderSaveTorrentFile(int i, String str, String str2);

    public native void DownloaderSetDownloadLimit(int i, int i2);

    public native void DownloaderSetDownloadSequence(int i, int i2);

    public native int DownloaderSetFilePrioritize(int i, int i2, int i3, int i4);

    public native void DownloaderSetMaxSessionPerHttp(int i, int i2);

    public native void DownloaderSetMaxTotalConnections(int i, int i2);

    public native void DownloaderSetMaxUploadConnections(int i, int i2);

    public native int DownloaderSetPiecePrioritize(int i, int i2, int i3, int i4);

    public native void DownloaderSetServerDownloadLimit(int i, int i2);

    public native void DownloaderSetShareRateLimit(int i, float f);

    public native void DownloaderSetUploadLimit(int i, int i2);

    public native void EnableUDPTransfer(int i);

    public native String GetDownloaderInfo(int i);

    public native String GetKernelInfo();

    public native int GetListenPort();

    public native String GetReportIP();

    public native int Init(String str, String str2, Object obj);

    public native int OpenTorrent(String str, String str2);

    public native void PreShutdown();

    public native void ReleaseTorrent(int i);

    public native void SetDownloadSpeedLimit(int i);

    public native void SetFileScanDelay(int i, int i2);

    public native int SetIOWrapper(String str);

    public native void SetLocalNetworkLimit(int i, int i2, int i3);

    public native void SetMaxCacheSize(int i);

    public native void SetMaxHalfOpenConnection(int i);

    public native void SetMaxTotalConnection(int i);

    public native void SetMaxUploadConnection(int i);

    public native void SetP2PTransferAsHttp(int i, int i2);

    public native void SetPerformanceFactor(int i, int i2, int i3, int i4);

    public native void SetReportIP(String str);

    public native int SetStatusFileSavePeriod(int i, int i2);

    public native void SetUploadSpeedLimit(int i);

    public native void SetUserAgent(String str);

    public native void Shutdown();

    public native int Startup(String str, String str2, int i, String str3);
}
