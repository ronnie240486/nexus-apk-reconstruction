package com.google.android.exoplayer2.util.rtp;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultRtpDistributionFeedbackFactory implements RtpDistributionFeedback.Factory {
    private final String cname;
    private final long ssrc;

    public DefaultRtpDistributionFeedbackFactory(long j, String str) {
        this.ssrc = j;
        this.cname = str;
    }

    @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.Factory
    public RtpDistributionFeedback createDistributionFeedback() {
        return new DefaultRtpDistributionFeedback(this.ssrc, this.cname);
    }
}
