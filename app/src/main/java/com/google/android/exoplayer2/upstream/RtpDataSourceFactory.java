package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback;

/* JADX INFO: loaded from: classes2.dex */
public final class RtpDataSourceFactory implements DataSource.Factory {
    private final RtpDistributionFeedback.RtpFeedbackProperties feedbackProperties;
    private final TransferListener listener;

    public RtpDataSourceFactory() {
        this(null);
    }

    public final void clearFeedbackProperty(Integer num) {
        this.feedbackProperties.remove(num);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public DataSource createDataSource() {
        return new RtpDataSource(this.listener, this.feedbackProperties);
    }

    public final RtpDistributionFeedback.RtpFeedbackProperties getFeedbackProperties() {
        return this.feedbackProperties;
    }

    public final void setFeedbackProperty(Integer num, Object obj) {
        this.feedbackProperties.set(num, obj);
    }

    public RtpDataSourceFactory(TransferListener transferListener) {
        this.listener = transferListener;
        this.feedbackProperties = new RtpDistributionFeedback.RtpFeedbackProperties();
    }
}
