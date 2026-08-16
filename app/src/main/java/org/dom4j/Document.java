package org.dom4j;

import java.util.Map;
import org.xml.sax.EntityResolver;

/* JADX INFO: loaded from: classes2.dex */
public interface Document extends Branch {
    /* JADX INFO: renamed from: J7 */
    DocumentType mo23550J7();

    /* JADX INFO: renamed from: M4 */
    Element mo23551M4();

    /* JADX INFO: renamed from: P0 */
    Document mo23552P0(String str, String str2);

    /* JADX INFO: renamed from: Y1 */
    Document mo23553Y1(String str, String str2, String str3);

    /* JADX INFO: renamed from: Z0 */
    Document mo23554Z0(String str);

    /* JADX INFO: renamed from: d1 */
    EntityResolver mo23555d1();

    /* JADX INFO: renamed from: d7 */
    String mo23556d7();

    /* JADX INFO: renamed from: i3 */
    void mo23557i3(Element element);

    /* JADX INFO: renamed from: i7 */
    void mo23558i7(DocumentType documentType);

    /* JADX INFO: renamed from: k0 */
    void mo23559k0(EntityResolver entityResolver);

    /* JADX INFO: renamed from: r0 */
    Document mo23560r0(String str, Map map);

    /* JADX INFO: renamed from: r7 */
    void mo23561r7(String str);
}
