package info.guardianproject.netcipher.proxy;

/* JADX INFO: loaded from: classes2.dex */
public class TorServiceUtils {
    public static final String CHMOD_EXE_VALUE = "700";
    public static final String SHELL_CMD_CHMOD = "chmod";
    public static final String SHELL_CMD_KILL = "kill -9";
    public static final String SHELL_CMD_PIDOF = "pidof";
    public static final String SHELL_CMD_PS = "ps";
    public static final String SHELL_CMD_RM = "rm";
    private static final String TAG = "TorUtils";

    /* JADX WARN: Invalid debug info offset */
    private TorServiceUtils() {
    }

    /* JADX WARN: Invalid debug info offset */
    public static int doShellCommand(String[] strArr, StringBuilder sb, boolean z, boolean z2) throws Exception {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0017
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static int findProcessId(android.content.Context r4) {
        /*
            r0 = 0
            return r0
        L22:
        L23:
        L28:
        */
        throw new UnsupportedOperationException("Method not decompiled: info.guardianproject.netcipher.proxy.TorServiceUtils.findProcessId(android.content.Context):int");
    }

    /* JADX WARN: Invalid debug info offset */
    public static int findProcessIdWithPS(String str) throws Exception {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x002b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static int findProcessIdWithPidOf(java.lang.String r3) throws java.lang.Exception {
        /*
            r0 = 0
            return r0
        L34:
        */
        throw new UnsupportedOperationException("Method not decompiled: info.guardianproject.netcipher.proxy.TorServiceUtils.findProcessIdWithPidOf(java.lang.String):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static boolean isRootPossible() {
        /*
            r0 = 0
            return r0
        L42:
        L44:
        */
        throw new UnsupportedOperationException("Method not decompiled: info.guardianproject.netcipher.proxy.TorServiceUtils.isRootPossible():boolean");
    }
}
