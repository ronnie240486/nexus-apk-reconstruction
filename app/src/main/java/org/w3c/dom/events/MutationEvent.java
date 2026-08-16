package org.w3c.dom.events;

import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes.dex */
public interface MutationEvent extends Event {

    /* JADX INFO: renamed from: d */
    public static final short f17812d = 1;

    /* JADX INFO: renamed from: e */
    public static final short f17813e = 2;

    /* JADX INFO: renamed from: f */
    public static final short f17814f = 3;

    /* JADX INFO: renamed from: A */
    String m25919A();

    /* JADX INFO: renamed from: g */
    String m25920g();

    /* JADX INFO: renamed from: k */
    String m25921k();

    /* JADX INFO: renamed from: n */
    void m25922n(String str, boolean z, boolean z2, Node node, String str2, String str3, String str4, short s2);

    /* JADX INFO: renamed from: t */
    short m25923t();

    /* JADX INFO: renamed from: w */
    Node m25924w();
}
