package com.google.android.exoplayer2.util.rtp;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.p006ts.TsExtractor;

/* JADX INFO: loaded from: classes2.dex */
public final class RtpExtractorsFactory implements ExtractorsFactory {
    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public synchronized Extractor[] createExtractors() {
        return new Extractor[]{new TsExtractor(1)};
    }
}
