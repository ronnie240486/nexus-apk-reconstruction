package org.xutils.http;

import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.xutils.common.util.KeyValue;
import org.xutils.http.body.RequestBody;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseParams {

    /* JADX INFO: renamed from: a */
    public String f18077a;

    /* JADX INFO: renamed from: b */
    public HttpMethod f18078b;

    /* JADX INFO: renamed from: c */
    public String f18079c;

    /* JADX INFO: renamed from: d */
    public String f18080d;

    /* JADX INFO: renamed from: e */
    public boolean f18081e;

    /* JADX INFO: renamed from: f */
    public boolean f18082f;

    /* JADX INFO: renamed from: g */
    public RequestBody f18083g;

    /* JADX INFO: renamed from: h */
    public final List<Header> f18084h;

    /* JADX INFO: renamed from: i */
    public final List<KeyValue> f18085i;

    /* JADX INFO: renamed from: j */
    public final List<KeyValue> f18086j;

    public static final class ArrayItem extends KeyValue {
        /* JADX WARN: Invalid debug info offset */
        public ArrayItem(String str, Object obj) {
        }
    }

    public final class BodyItemWrapper extends KeyValue {

        /* JADX INFO: renamed from: c */
        public final String f18087c;

        /* JADX INFO: renamed from: d */
        public final String f18088d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ BaseParams f18089e;

        /* JADX WARN: Invalid debug info offset */
        public BodyItemWrapper(BaseParams baseParams, String str, Object obj, String str2, String str3) {
        }
    }

    public static final class Header extends KeyValue {

        /* JADX INFO: renamed from: c */
        public final boolean f18090c;

        /* JADX WARN: Invalid debug info offset */
        public Header(String str, String str2, boolean z) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public void m26992A(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public void m26993B(RequestBody requestBody) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public String m26994C() throws JSONException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m26995a(String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public void m26996b(String str, Object obj, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public void m26997c(String str, Object obj, String str2, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public void m26998d(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public void m26999e(String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public void m27000f(String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g */
    public final synchronized void m27001g() {
        /*
            r3 = this;
            return
        L2c:
        L2e:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.BaseParams.m27001g():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public void m27002h() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public String m27003i() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public List<KeyValue> m27004j() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public String m27005k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public List<Header> m27006l() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public HttpMethod m27007m() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public List<KeyValue> m27008n(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public List<KeyValue> m27009o() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public RequestBody m27010p() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public boolean m27011q() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public boolean m27012r() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public final void m27013s(JSONObject jSONObject, List<KeyValue> list) throws JSONException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public void m27014t(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public void m27015u(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public void m27016v(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public void m27017w(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public void m27018x(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public void m27019y(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public void m27020z(HttpMethod httpMethod) {
    }
}
