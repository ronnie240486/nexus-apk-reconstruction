package com.google.android.exoplayer2.p007ui;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.p007ui.TrackSelectionDialogBuilder;
import com.google.android.exoplayer2.p007ui.TrackSelectionView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionUtil;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class TrackSelectionDialogBuilder {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final DialogCallback callback;
    private final Context context;
    private boolean isDisabled;
    private final MappingTrackSelector.MappedTrackInfo mappedTrackInfo;
    private List<DefaultTrackSelector.SelectionOverride> overrides;
    private final int rendererIndex;
    private boolean showDisableOption;
    private final CharSequence title;

    @Nullable
    private TrackNameProvider trackNameProvider;

    public interface DialogCallback {
        void onTracksSelected(boolean z, List<DefaultTrackSelector.SelectionOverride> list);
    }

    public TrackSelectionDialogBuilder(Context context, CharSequence charSequence, final DefaultTrackSelector defaultTrackSelector, final int i) {
        this.context = context;
        this.title = charSequence;
        MappingTrackSelector.MappedTrackInfo mappedTrackInfo = (MappingTrackSelector.MappedTrackInfo) Assertions.checkNotNull(defaultTrackSelector.getCurrentMappedTrackInfo());
        this.mappedTrackInfo = mappedTrackInfo;
        this.rendererIndex = i;
        final TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i);
        final DefaultTrackSelector.Parameters parameters = defaultTrackSelector.getParameters();
        this.isDisabled = parameters.getRendererDisabled(i);
        DefaultTrackSelector.SelectionOverride selectionOverride = parameters.getSelectionOverride(i, trackGroups);
        this.overrides = selectionOverride == null ? Collections.emptyList() : Collections.singletonList(selectionOverride);
        this.callback = new DialogCallback(defaultTrackSelector, parameters, i, trackGroups) { // from class: PW

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DefaultTrackSelector f2490a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ DefaultTrackSelector.Parameters f2491b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f2492c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ TrackGroupArray f2493d;

            /* JADX WARN: Invalid debug info offset */
            @Override // com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder.DialogCallback
            public final void onTracksSelected(boolean z, List list) {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$build$1(TrackSelectionView trackSelectionView, DialogInterface dialogInterface, int i) {
        this.callback.onTracksSelected(trackSelectionView.getIsDisabled(), trackSelectionView.getOverrides());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(DefaultTrackSelector defaultTrackSelector, DefaultTrackSelector.Parameters parameters, int i, TrackGroupArray trackGroupArray, boolean z, List list) {
        defaultTrackSelector.setParameters(TrackSelectionUtil.updateParametersWithOverride(parameters, i, trackGroupArray, z, list.isEmpty() ? null : (DefaultTrackSelector.SelectionOverride) list.get(0)));
    }

    public AlertDialog build() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);
        View viewInflate = LayoutInflater.from(builder.getContext()).inflate(C3355R.layout.exo_track_selection_dialog, (ViewGroup) null);
        final TrackSelectionView trackSelectionView = (TrackSelectionView) viewInflate.findViewById(C3355R.id.exo_track_selection_view);
        trackSelectionView.setAllowMultipleOverrides(this.allowMultipleOverrides);
        trackSelectionView.setAllowAdaptiveSelections(this.allowAdaptiveSelections);
        trackSelectionView.setShowDisableOption(this.showDisableOption);
        TrackNameProvider trackNameProvider = this.trackNameProvider;
        if (trackNameProvider != null) {
            trackSelectionView.setTrackNameProvider(trackNameProvider);
        }
        trackSelectionView.init(this.mappedTrackInfo, this.rendererIndex, this.isDisabled, this.overrides, null);
        return builder.setTitle(this.title).setView(viewInflate).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener(this, trackSelectionView) { // from class: QW

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ TrackSelectionDialogBuilder f2770a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ TrackSelectionView f2771b;

            /* JADX WARN: Invalid debug info offset */
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
    }

    public TrackSelectionDialogBuilder setAllowAdaptiveSelections(boolean z) {
        this.allowAdaptiveSelections = z;
        return this;
    }

    public TrackSelectionDialogBuilder setAllowMultipleOverrides(boolean z) {
        this.allowMultipleOverrides = z;
        return this;
    }

    public TrackSelectionDialogBuilder setIsDisabled(boolean z) {
        this.isDisabled = z;
        return this;
    }

    public TrackSelectionDialogBuilder setOverride(@Nullable DefaultTrackSelector.SelectionOverride selectionOverride) {
        return setOverrides(selectionOverride == null ? Collections.emptyList() : Collections.singletonList(selectionOverride));
    }

    public TrackSelectionDialogBuilder setOverrides(List<DefaultTrackSelector.SelectionOverride> list) {
        this.overrides = list;
        return this;
    }

    public TrackSelectionDialogBuilder setShowDisableOption(boolean z) {
        this.showDisableOption = z;
        return this;
    }

    public TrackSelectionDialogBuilder setTrackNameProvider(@Nullable TrackNameProvider trackNameProvider) {
        this.trackNameProvider = trackNameProvider;
        return this;
    }

    public TrackSelectionDialogBuilder(Context context, CharSequence charSequence, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int i, DialogCallback dialogCallback) {
        this.context = context;
        this.title = charSequence;
        this.mappedTrackInfo = mappedTrackInfo;
        this.rendererIndex = i;
        this.callback = dialogCallback;
        this.overrides = Collections.emptyList();
    }
}
