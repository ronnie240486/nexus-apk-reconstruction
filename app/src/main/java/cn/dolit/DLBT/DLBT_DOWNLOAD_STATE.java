package cn.dolit.DLBT;

/* JADX INFO: loaded from: classes.dex */
public enum DLBT_DOWNLOAD_STATE {
    BTDS_QUEUED(0),
    BTDS_CHECKING_FILES(1),
    BTDS_DOWNLOADING_TORRENT(2),
    BTDS_DOWNLOADING(3),
    BTDS_PAUSED(4),
    BTDS_FINISHED(5),
    BTDS_SEEDING(6),
    BTDS_ALLOCATING(7),
    BTDS_ERROR(8);

    private int intValue;

    /* JADX INFO: renamed from: cn.dolit.DLBT.DLBT_DOWNLOAD_STATE$1 */
    public static /* synthetic */ class C30601 {
        static final /* synthetic */ int[] $SwitchMap$cn$dolit$DLBT$DLBT_DOWNLOAD_STATE;

        static {
            int[] iArr = new int[DLBT_DOWNLOAD_STATE.values().length];
            $SwitchMap$cn$dolit$DLBT$DLBT_DOWNLOAD_STATE = iArr;
            try {
                iArr[DLBT_DOWNLOAD_STATE.BTDS_QUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cn$dolit$DLBT$DLBT_DOWNLOAD_STATE[DLBT_DOWNLOAD_STATE.BTDS_CHECKING_FILES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cn$dolit$DLBT$DLBT_DOWNLOAD_STATE[DLBT_DOWNLOAD_STATE.BTDS_DOWNLOADING_TORRENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cn$dolit$DLBT$DLBT_DOWNLOAD_STATE[DLBT_DOWNLOAD_STATE.BTDS_DOWNLOADING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cn$dolit$DLBT$DLBT_DOWNLOAD_STATE[DLBT_DOWNLOAD_STATE.BTDS_PAUSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cn$dolit$DLBT$DLBT_DOWNLOAD_STATE[DLBT_DOWNLOAD_STATE.BTDS_FINISHED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$cn$dolit$DLBT$DLBT_DOWNLOAD_STATE[DLBT_DOWNLOAD_STATE.BTDS_SEEDING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$cn$dolit$DLBT$DLBT_DOWNLOAD_STATE[DLBT_DOWNLOAD_STATE.BTDS_ALLOCATING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$cn$dolit$DLBT$DLBT_DOWNLOAD_STATE[DLBT_DOWNLOAD_STATE.BTDS_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    DLBT_DOWNLOAD_STATE(int i) {
        this.intValue = i;
    }

    public static DLBT_DOWNLOAD_STATE fromInteger(int i) {
        switch (i) {
            case 0:
                return BTDS_QUEUED;
            case 1:
                return BTDS_CHECKING_FILES;
            case 2:
                return BTDS_DOWNLOADING_TORRENT;
            case 3:
                return BTDS_DOWNLOADING;
            case 4:
                return BTDS_PAUSED;
            case 5:
                return BTDS_FINISHED;
            case 6:
                return BTDS_SEEDING;
            case 7:
                return BTDS_ALLOCATING;
            case 8:
                return BTDS_ERROR;
            default:
                return BTDS_ERROR;
        }
    }

    public static boolean isFinished(int i) {
        return i == BTDS_FINISHED.intValue() || i == BTDS_SEEDING.intValue();
    }

    public static int toInt(DLBT_DOWNLOAD_STATE dlbt_download_state) {
        switch (C30601.$SwitchMap$cn$dolit$DLBT$DLBT_DOWNLOAD_STATE[dlbt_download_state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            default:
                return 8;
        }
    }

    public int intValue() {
        return this.intValue;
    }
}
