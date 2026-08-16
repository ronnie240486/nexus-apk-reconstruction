package org.w3c.dom.events;

import org.w3c.dom.views.AbstractView;

/* JADX INFO: loaded from: classes.dex */
public interface UIEvent extends Event {
    AbstractView getView();

    /* JADX INFO: renamed from: l */
    void m25925l(String str, boolean z, boolean z2, AbstractView abstractView, int i);

    /* JADX INFO: renamed from: r */
    int m25926r();
}
