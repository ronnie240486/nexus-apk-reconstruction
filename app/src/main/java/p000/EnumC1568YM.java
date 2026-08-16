package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'IGNORE_CASE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: YM */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1568YM implements InterfaceC4829ml {
    private static final /* synthetic */ EnumC1568YM[] $VALUES = $values();
    public static final EnumC1568YM CANON_EQ;
    public static final EnumC1568YM COMMENTS;
    public static final EnumC1568YM DOT_MATCHES_ALL;
    public static final EnumC1568YM IGNORE_CASE;
    public static final EnumC1568YM LITERAL;
    public static final EnumC1568YM MULTILINE;
    public static final EnumC1568YM UNIX_LINES;
    private final int mask;
    private final int value;

    private static final /* synthetic */ EnumC1568YM[] $values() {
        return new EnumC1568YM[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    static {
        int i = 2;
        IGNORE_CASE = new EnumC1568YM("IGNORE_CASE", 0, i, 0, 2, null);
        int i2 = 2;
        C1522Xd c1522Xd = null;
        int i3 = 0;
        MULTILINE = new EnumC1568YM("MULTILINE", 1, 8, i3, i2, c1522Xd);
        int i4 = 2;
        C1522Xd c1522Xd2 = null;
        int i5 = 0;
        LITERAL = new EnumC1568YM("LITERAL", i, 16, i5, i4, c1522Xd2);
        UNIX_LINES = new EnumC1568YM("UNIX_LINES", 3, 1, i3, i2, c1522Xd);
        COMMENTS = new EnumC1568YM("COMMENTS", 4, 4, i5, i4, c1522Xd2);
        DOT_MATCHES_ALL = new EnumC1568YM("DOT_MATCHES_ALL", 5, 32, i3, i2, c1522Xd);
        CANON_EQ = new EnumC1568YM("CANON_EQ", 6, 128, i5, i4, c1522Xd2);
    }

    private EnumC1568YM(String str, int i, int i2, int i3) {
        super(str, i);
        this.value = i2;
        this.mask = i3;
    }

    public static EnumC1568YM valueOf(String str) {
        return (EnumC1568YM) Enum.valueOf(EnumC1568YM.class, str);
    }

    public static EnumC1568YM[] values() {
        return (EnumC1568YM[]) $VALUES.clone();
    }

    @Override // p000.InterfaceC4829ml
    public int getMask() {
        return this.mask;
    }

    @Override // p000.InterfaceC4829ml
    public int getValue() {
        return this.value;
    }

    public /* synthetic */ EnumC1568YM(String str, int i, int i2, int i3, int i4, C1522Xd c1522Xd) {
        this(str, i, i2, (i4 & 2) != 0 ? i2 : i3);
    }
}
