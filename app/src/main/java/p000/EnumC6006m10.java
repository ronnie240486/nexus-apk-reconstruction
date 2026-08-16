package p000;

/* JADX INFO: renamed from: m10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC6006m10 {
    DEFAULT(0),
    X4_3(1),
    X16_9(2),
    FULL_FILL(5);

    private int intVal;

    EnumC6006m10(int i) {
        this.intVal = i;
    }

    public static EnumC6006m10 fromInt(int i) {
        EnumC6006m10[] enumC6006m10ArrValues = values();
        if (enumC6006m10ArrValues == null) {
            return DEFAULT;
        }
        for (EnumC6006m10 enumC6006m10 : enumC6006m10ArrValues) {
            if (enumC6006m10.intVal == i) {
                return enumC6006m10;
            }
        }
        return DEFAULT;
    }

    public static EnumC6006m10 next(int i) {
        EnumC6006m10[] enumC6006m10ArrValues = values();
        if (enumC6006m10ArrValues == null) {
            return DEFAULT;
        }
        int i2 = 0;
        while (i2 < enumC6006m10ArrValues.length) {
            if (enumC6006m10ArrValues[i2].intVal == i) {
                return i2 == enumC6006m10ArrValues.length + (-1) ? DEFAULT : enumC6006m10ArrValues[i2 + 1];
            }
            i2++;
        }
        return DEFAULT;
    }

    public static EnumC6006m10 previous(int i) {
        EnumC6006m10[] enumC6006m10ArrValues = values();
        if (enumC6006m10ArrValues == null) {
            return DEFAULT;
        }
        int i2 = 0;
        while (i2 < enumC6006m10ArrValues.length) {
            if (enumC6006m10ArrValues[i2].intVal == i) {
                return i2 == 0 ? FULL_FILL : enumC6006m10ArrValues[i2 - 1];
            }
            i2++;
        }
        return DEFAULT;
    }

    public int intVal() {
        return this.intVal;
    }

    public static EnumC6006m10 next(EnumC6006m10 enumC6006m10) {
        return next(enumC6006m10.intVal());
    }

    public static EnumC6006m10 previous(EnumC6006m10 enumC6006m10) {
        return previous(enumC6006m10.intVal());
    }
}
