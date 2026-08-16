package com.google.android.exoplayer2.mediacodec;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface MediaCodecSelector {
    public static final MediaCodecSelector DEFAULT = new MediaCodecSelector() { // from class: com.google.android.exoplayer2.mediacodec.MediaCodecSelector.1
        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecSelector
        public List<MediaCodecInfo> getDecoderInfos(String str, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException {
            return MediaCodecUtil.getDecoderInfos(str, z, z2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecSelector
        @Nullable
        public MediaCodecInfo getPassthroughDecoderInfo() throws MediaCodecUtil.DecoderQueryException {
            return MediaCodecUtil.getPassthroughDecoderInfo();
        }
    };

    List<MediaCodecInfo> getDecoderInfos(String str, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException;

    @Nullable
    MediaCodecInfo getPassthroughDecoderInfo() throws MediaCodecUtil.DecoderQueryException;
}
