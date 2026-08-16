package p000;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ug */
/* JADX INFO: loaded from: classes2.dex */
@J30(markerClass = {InterfaceC5195pi.class})
@InterfaceC4676kS(version = "1.6")
public enum EnumC1330Ug {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    @NotNull
    private final TimeUnit timeUnit;

    EnumC1330Ug(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    @NotNull
    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}
