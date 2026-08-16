package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroupArray;

/* JADX INFO: loaded from: classes2.dex */
public final class TrackSelectionUtil {

    public interface AdaptiveTrackSelectionFactory {
        TrackSelection createAdaptiveTrackSelection(TrackSelection.Definition definition);
    }

    private TrackSelectionUtil() {
    }

    public static TrackSelection[] createTrackSelectionsForDefinitions(TrackSelection.Definition[] definitionArr, AdaptiveTrackSelectionFactory adaptiveTrackSelectionFactory) {
        TrackSelection[] trackSelectionArr = new TrackSelection[definitionArr.length];
        boolean z = false;
        for (int i = 0; i < definitionArr.length; i++) {
            TrackSelection.Definition definition = definitionArr[i];
            if (definition != null) {
                int[] iArr = definition.tracks;
                if (iArr.length <= 1 || z) {
                    trackSelectionArr[i] = new FixedTrackSelection(definition.group, iArr[0], definition.reason, definition.data);
                } else {
                    trackSelectionArr[i] = adaptiveTrackSelectionFactory.createAdaptiveTrackSelection(definition);
                    z = true;
                }
            }
        }
        return trackSelectionArr;
    }

    public static DefaultTrackSelector.Parameters updateParametersWithOverride(DefaultTrackSelector.Parameters parameters, int i, TrackGroupArray trackGroupArray, boolean z, @Nullable DefaultTrackSelector.SelectionOverride selectionOverride) {
        DefaultTrackSelector.ParametersBuilder rendererDisabled = parameters.buildUpon().clearSelectionOverrides(i).setRendererDisabled(i, z);
        if (selectionOverride != null) {
            rendererDisabled.setSelectionOverride(i, trackGroupArray, selectionOverride);
        }
        return rendererDisabled.build();
    }
}
