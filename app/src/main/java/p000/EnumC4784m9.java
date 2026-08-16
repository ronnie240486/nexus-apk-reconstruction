package p000;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: m9 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4784m9 {
    UNASSIGNED(0, "Cn"),
    UPPERCASE_LETTER(1, "Lu"),
    LOWERCASE_LETTER(2, "Ll"),
    TITLECASE_LETTER(3, "Lt"),
    MODIFIER_LETTER(4, "Lm"),
    OTHER_LETTER(5, "Lo"),
    NON_SPACING_MARK(6, "Mn"),
    ENCLOSING_MARK(7, "Me"),
    COMBINING_SPACING_MARK(8, "Mc"),
    DECIMAL_DIGIT_NUMBER(9, "Nd"),
    LETTER_NUMBER(10, "Nl"),
    OTHER_NUMBER(11, "No"),
    SPACE_SEPARATOR(12, "Zs"),
    LINE_SEPARATOR(13, "Zl"),
    PARAGRAPH_SEPARATOR(14, "Zp"),
    CONTROL(15, "Cc"),
    FORMAT(16, "Cf"),
    PRIVATE_USE(18, "Co"),
    SURROGATE(19, "Cs"),
    DASH_PUNCTUATION(20, "Pd"),
    START_PUNCTUATION(21, "Ps"),
    END_PUNCTUATION(22, "Pe"),
    CONNECTOR_PUNCTUATION(23, "Pc"),
    OTHER_PUNCTUATION(24, "Po"),
    MATH_SYMBOL(25, "Sm"),
    CURRENCY_SYMBOL(26, "Sc"),
    MODIFIER_SYMBOL(27, "Sk"),
    OTHER_SYMBOL(28, "So"),
    INITIAL_QUOTE_PUNCTUATION(29, "Pi"),
    FINAL_QUOTE_PUNCTUATION(30, "Pf");


    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private final String code;
    private final int value;

    /* JADX INFO: renamed from: m9$a */
    public static final class a {
        /* JADX WARN: Invalid debug info offset */
        public a() {
        }

        /* JADX WARN: Invalid debug info offset */
        public a(C1522Xd c1522Xd) {
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final EnumC4784m9 m22060a(int i) {
            return null;
        }
    }

    EnumC4784m9(int i, String str) {
        this.value = i;
        this.code = str;
    }

    public final boolean contains(char c) {
        return Character.getType(c) == this.value;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final int getValue() {
        return this.value;
    }
}
