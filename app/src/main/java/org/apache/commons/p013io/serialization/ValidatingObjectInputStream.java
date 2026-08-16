package org.apache.commons.p013io.serialization;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class ValidatingObjectInputStream extends ObjectInputStream {

    /* JADX INFO: renamed from: a */
    public final List<ClassNameMatcher> f15971a;

    /* JADX INFO: renamed from: b */
    public final List<ClassNameMatcher> f15972b;

    /* JADX WARN: Invalid debug info offset */
    public ValidatingObjectInputStream(InputStream inputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public void m23432P(String str) throws InvalidClassException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public ValidatingObjectInputStream m23433R(Pattern pattern) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public ValidatingObjectInputStream m23434S(ClassNameMatcher classNameMatcher) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public ValidatingObjectInputStream m23435V(Class<?>... clsArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public ValidatingObjectInputStream m23436b0(String... strArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public final void m23437g0(String str) throws InvalidClassException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public ValidatingObjectInputStream m23438j(Pattern pattern) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public ValidatingObjectInputStream m23439k(ClassNameMatcher classNameMatcher) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public ValidatingObjectInputStream m23440p(Class<?>... clsArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public ValidatingObjectInputStream m23441w(String... strArr) {
        return null;
    }
}
