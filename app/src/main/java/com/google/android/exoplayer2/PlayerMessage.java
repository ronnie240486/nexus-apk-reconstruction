package com.google.android.exoplayer2;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes2.dex */
public final class PlayerMessage {
    private Handler handler;
    private boolean isCanceled;
    private boolean isDelivered;
    private boolean isProcessed;
    private boolean isSent;

    @Nullable
    private Object payload;
    private final Sender sender;
    private final Target target;
    private final Timeline timeline;
    private int type;
    private int windowIndex;
    private long positionMs = C3219C.TIME_UNSET;
    private boolean deleteAfterDelivery = true;

    public interface Sender {
        void sendMessage(PlayerMessage playerMessage);
    }

    public interface Target {
        void handleMessage(int i, @Nullable Object obj) throws ExoPlaybackException;
    }

    public PlayerMessage(Sender sender, Target target, Timeline timeline, int i, Handler handler) {
        this.sender = sender;
        this.target = target;
        this.timeline = timeline;
        this.handler = handler;
        this.windowIndex = i;
    }

    public synchronized boolean blockUntilDelivered() throws InterruptedException {
        try {
            Assertions.checkState(this.isSent);
            Assertions.checkState(this.handler.getLooper().getThread() != Thread.currentThread());
            while (!this.isProcessed) {
                wait();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.isDelivered;
    }

    public synchronized PlayerMessage cancel() {
        Assertions.checkState(this.isSent);
        this.isCanceled = true;
        markAsProcessed(false);
        return this;
    }

    public boolean getDeleteAfterDelivery() {
        return this.deleteAfterDelivery;
    }

    public Handler getHandler() {
        return this.handler;
    }

    @Nullable
    public Object getPayload() {
        return this.payload;
    }

    public long getPositionMs() {
        return this.positionMs;
    }

    public Target getTarget() {
        return this.target;
    }

    public Timeline getTimeline() {
        return this.timeline;
    }

    public int getType() {
        return this.type;
    }

    public int getWindowIndex() {
        return this.windowIndex;
    }

    public synchronized boolean isCanceled() {
        return this.isCanceled;
    }

    public synchronized void markAsProcessed(boolean z) {
        this.isDelivered = z | this.isDelivered;
        this.isProcessed = true;
        notifyAll();
    }

    public PlayerMessage send() {
        Assertions.checkState(!this.isSent);
        if (this.positionMs == C3219C.TIME_UNSET) {
            Assertions.checkArgument(this.deleteAfterDelivery);
        }
        this.isSent = true;
        this.sender.sendMessage(this);
        return this;
    }

    public PlayerMessage setDeleteAfterDelivery(boolean z) {
        Assertions.checkState(!this.isSent);
        this.deleteAfterDelivery = z;
        return this;
    }

    public PlayerMessage setHandler(Handler handler) {
        Assertions.checkState(!this.isSent);
        this.handler = handler;
        return this;
    }

    public PlayerMessage setPayload(@Nullable Object obj) {
        Assertions.checkState(!this.isSent);
        this.payload = obj;
        return this;
    }

    public PlayerMessage setPosition(int i, long j) {
        Assertions.checkState(!this.isSent);
        Assertions.checkArgument(j != C3219C.TIME_UNSET);
        if (i < 0 || (!this.timeline.isEmpty() && i >= this.timeline.getWindowCount())) {
            throw new IllegalSeekPositionException(this.timeline, i, j);
        }
        this.windowIndex = i;
        this.positionMs = j;
        return this;
    }

    public PlayerMessage setType(int i) {
        Assertions.checkState(!this.isSent);
        this.type = i;
        return this;
    }

    public PlayerMessage setPosition(long j) {
        Assertions.checkState(!this.isSent);
        this.positionMs = j;
        return this;
    }
}
