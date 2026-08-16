package org.bouncycastle.util.test;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleTestResult implements TestResult {
    private static final String SEPARATOR = System.getProperty("line.separator");
    private Throwable exception;
    private String message;
    private boolean success;

    /* JADX WARN: Invalid debug info offset */
    public SimpleTestResult(boolean z, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SimpleTestResult(boolean z, String str, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static TestResult failed(Test test, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static TestResult failed(Test test, String str, Object obj, Object obj2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static TestResult failed(Test test, String str, Throwable th) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String failedMessage(String str, String str2, String str3, String str4) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static TestResult successful(Test test, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.util.test.TestResult
    public Throwable getException() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.util.test.TestResult
    public boolean isSuccessful() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.util.test.TestResult
    public String toString() {
        return null;
    }
}
