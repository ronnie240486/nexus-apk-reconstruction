package p000;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: q9 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5223q9 {
    UNDEFINED(-1),
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1),
    RIGHT_TO_LEFT_ARABIC(2),
    EUROPEAN_NUMBER(3),
    EUROPEAN_NUMBER_SEPARATOR(4),
    EUROPEAN_NUMBER_TERMINATOR(5),
    ARABIC_NUMBER(6),
    COMMON_NUMBER_SEPARATOR(7),
    NONSPACING_MARK(8),
    BOUNDARY_NEUTRAL(9),
    PARAGRAPH_SEPARATOR(10),
    SEGMENT_SEPARATOR(11),
    WHITESPACE(12),
    OTHER_NEUTRALS(13),
    LEFT_TO_RIGHT_EMBEDDING(14),
    LEFT_TO_RIGHT_OVERRIDE(15),
    RIGHT_TO_LEFT_EMBEDDING(16),
    RIGHT_TO_LEFT_OVERRIDE(17),
    POP_DIRECTIONAL_FORMAT(18);

    private final int value;

    @NotNull
    public static final b Companion = new b(null);

    @NotNull
    private static final InterfaceC0895Nu<Map<Integer, EnumC5223q9>> directionalityMap$delegate = C1152Ru.m5386a(a.f18506a);

    /* JADX INFO: renamed from: q9$a */
    public static final class a extends AbstractC0123Bu implements InterfaceC4245dm<Map<Integer, ? extends EnumC5223q9>> {

        /* JADX INFO: renamed from: a */
        public static final a f18506a = new a();

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Map<Integer, EnumC5223q9> m27622a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4245dm
        public /* bridge */ /* synthetic */ Map<Integer, ? extends EnumC5223q9> invoke() {
            return null;
        }
    }

    /* JADX INFO: renamed from: q9$b */
    public static final class b {
        /* JADX WARN: Invalid debug info offset */
        public b() {
        }

        /* JADX WARN: Invalid debug info offset */
        public b(C1522Xd c1522Xd) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public final Map<Integer, EnumC5223q9> m27623a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @NotNull
        /* JADX INFO: renamed from: b */
        public final EnumC5223q9 m27624b(int i) {
            return null;
        }
    }

    EnumC5223q9(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
