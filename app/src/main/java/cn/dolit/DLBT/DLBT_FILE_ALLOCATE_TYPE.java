package cn.dolit.DLBT;

/* JADX INFO: loaded from: classes.dex */
public enum DLBT_FILE_ALLOCATE_TYPE {
    FILE_ALLOCATE_REVERSED,
    FILE_ALLOCATE_SPARSE,
    FILE_ALLOCATE_COMPACT;

    /* JADX INFO: renamed from: cn.dolit.DLBT.DLBT_FILE_ALLOCATE_TYPE$1 */
    public static /* synthetic */ class C30611 {
        static final /* synthetic */ int[] $SwitchMap$cn$dolit$DLBT$DLBT_FILE_ALLOCATE_TYPE;

        static {
            int[] iArr = new int[DLBT_FILE_ALLOCATE_TYPE.values().length];
            $SwitchMap$cn$dolit$DLBT$DLBT_FILE_ALLOCATE_TYPE = iArr;
            try {
                iArr[DLBT_FILE_ALLOCATE_TYPE.FILE_ALLOCATE_REVERSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cn$dolit$DLBT$DLBT_FILE_ALLOCATE_TYPE[DLBT_FILE_ALLOCATE_TYPE.FILE_ALLOCATE_SPARSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cn$dolit$DLBT$DLBT_FILE_ALLOCATE_TYPE[DLBT_FILE_ALLOCATE_TYPE.FILE_ALLOCATE_COMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static DLBT_FILE_ALLOCATE_TYPE fromInteger(int i) {
        if (i == 0) {
            return FILE_ALLOCATE_REVERSED;
        }
        if (i != 1 && i == 2) {
            return FILE_ALLOCATE_COMPACT;
        }
        return FILE_ALLOCATE_SPARSE;
    }

    public static int toInt(DLBT_FILE_ALLOCATE_TYPE dlbt_file_allocate_type) {
        int i = C30611.$SwitchMap$cn$dolit$DLBT$DLBT_FILE_ALLOCATE_TYPE[dlbt_file_allocate_type.ordinal()];
        if (i != 1) {
            return i != 3 ? 1 : 2;
        }
        return 0;
    }
}
