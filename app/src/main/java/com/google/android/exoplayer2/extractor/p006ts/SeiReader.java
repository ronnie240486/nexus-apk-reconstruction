package com.google.android.exoplayer2.extractor.p006ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.text.cea.CeaUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SeiReader {
    private final List<Format> closedCaptionFormats;
    private final TrackOutput[] outputs;

    public SeiReader(List<Format> list) {
        this.closedCaptionFormats = list;
        this.outputs = new TrackOutput[list.size()];
    }

    public void consume(long j, ParsableByteArray parsableByteArray) {
        CeaUtil.consume(j, parsableByteArray, this.outputs);
    }

    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        for (int i = 0; i < this.outputs.length; i++) {
            trackIdGenerator.generateNewId();
            TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 3);
            Format format = this.closedCaptionFormats.get(i);
            String str = format.sampleMimeType;
            Assertions.checkArgument(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption mime type provided: " + str);
            String formatId = format.f11055id;
            if (formatId == null) {
                formatId = trackIdGenerator.getFormatId();
            }
            trackOutputTrack.format(Format.createTextSampleFormat(formatId, str, null, -1, format.selectionFlags, format.language, format.accessibilityChannel, null, Long.MAX_VALUE, format.initializationData));
            this.outputs[i] = trackOutputTrack;
        }
    }
}
