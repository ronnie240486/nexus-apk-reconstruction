package org.bouncycastle.x509;

import java.io.InputStream;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Collection;
import org.bouncycastle.x509.util.StreamParser;
import org.bouncycastle.x509.util.StreamParsingException;

/* JADX INFO: loaded from: classes2.dex */
public class X509StreamParser implements StreamParser {
    private Provider _provider;
    private X509StreamParserSpi _spi;

    /* JADX WARN: Invalid debug info offset */
    private X509StreamParser(Provider provider, X509StreamParserSpi x509StreamParserSpi) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static X509StreamParser createParser(X509Util.Implementation implementation) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static X509StreamParser getInstance(String str) throws NoSuchParserException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static X509StreamParser getInstance(String str, String str2) throws NoSuchParserException, NoSuchProviderException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static X509StreamParser getInstance(String str, Provider provider) throws NoSuchParserException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Provider getProvider() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void init(InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void init(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.util.StreamParser
    public Object read() throws StreamParsingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.util.StreamParser
    public Collection readAll() throws StreamParsingException {
        return null;
    }
}
