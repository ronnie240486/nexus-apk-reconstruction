package com.google.firebase.installations.remote;

import androidx.annotation.GuardedBy;
import com.google.firebase.installations.Utils;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class RequestLimiter {
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS = TimeUnit.HOURS.toMillis(24);
    private static final long MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS = TimeUnit.MINUTES.toMillis(30);

    @GuardedBy("this")
    private int attemptCount;

    @GuardedBy("this")
    private long nextRequestTime;
    private final Utils utils;

    public RequestLimiter() {
        this.utils = Utils.getInstance();
    }

    private synchronized long getBackoffDuration(int i) {
        if (!isRetryableError(i)) {
            return MAXIMUM_BACKOFF_DURATION_FOR_CONFIGURATION_ERRORS;
        }
        double dPow = Math.pow(2.0d, this.attemptCount);
        double randomDelayForSyncPrevention = this.utils.getRandomDelayForSyncPrevention();
        Double.isNaN(randomDelayForSyncPrevention);
        return (long) Math.min(dPow + randomDelayForSyncPrevention, MAXIMUM_BACKOFF_DURATION_FOR_SERVER_ERRORS);
    }

    private static boolean isRetryableError(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    private static boolean isSuccessfulOrRequiresNewFidCreation(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    private synchronized void resetBackoffStrategy() {
        this.attemptCount = 0;
    }

    public synchronized boolean isRequestAllowed() {
        return this.attemptCount == 0 || this.utils.currentTimeInMillis() > this.nextRequestTime;
    }

    public synchronized void setNextRequestTime(int i) {
        if (isSuccessfulOrRequiresNewFidCreation(i)) {
            resetBackoffStrategy();
            return;
        }
        this.attemptCount++;
        this.nextRequestTime = this.utils.currentTimeInMillis() + getBackoffDuration(i);
    }

    public RequestLimiter(Utils utils) {
        this.utils = utils;
    }
}
