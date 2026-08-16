package org.bouncycastle.openssl;

import java.io.IOException;
import java.io.Reader;
import java.util.Map;
import org.bouncycastle.util.p019io.pem.PemObject;
import org.bouncycastle.util.p019io.pem.PemObjectParser;
import org.bouncycastle.util.p019io.pem.PemReader;

/* JADX INFO: loaded from: classes2.dex */
public class PEMReader extends PemReader {
    private PasswordFinder pFinder;
    private final Map parsers;

    public class DSAKeyPairParser extends KeyPairParser {
        final /* synthetic */ PEMReader this$0;

        /* JADX WARN: Invalid debug info offset */
        public DSAKeyPairParser(PEMReader pEMReader, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0070
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
            */
        @Override // org.bouncycastle.util.p019io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.p019io.pem.PemObject r9) throws java.io.IOException {
            /*
                r8 = this;
                r0 = 0
                return r0
            L6e:
            L70:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.openssl.PEMReader.DSAKeyPairParser.parseObject(org.bouncycastle.util.io.pem.PemObject):java.lang.Object");
        }
    }

    public class ECDSAKeyPairParser extends KeyPairParser {
        final /* synthetic */ PEMReader this$0;

        /* JADX WARN: Invalid debug info offset */
        public ECDSAKeyPairParser(PEMReader pEMReader, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0054
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
            */
        @Override // org.bouncycastle.util.p019io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.p019io.pem.PemObject r4) throws java.io.IOException {
            /*
                r3 = this;
                r0 = 0
                return r0
            L52:
            L54:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.openssl.PEMReader.ECDSAKeyPairParser.parseObject(org.bouncycastle.util.io.pem.PemObject):java.lang.Object");
        }
    }

    public class ECNamedCurveSpecParser implements PemObjectParser {
        final /* synthetic */ PEMReader this$0;

        /* JADX WARN: Invalid debug info offset */
        private ECNamedCurveSpecParser(PEMReader pEMReader) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ ECNamedCurveSpecParser(PEMReader pEMReader, C50571 c50571) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x001f
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
            */
        @Override // org.bouncycastle.util.p019io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.p019io.pem.PemObject r4) throws java.io.IOException {
            /*
                r3 = this;
                r0 = 0
                return r0
            L1d:
            L1f:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.openssl.PEMReader.ECNamedCurveSpecParser.parseObject(org.bouncycastle.util.io.pem.PemObject):java.lang.Object");
        }
    }

    public class EncryptedPrivateKeyParser implements PemObjectParser {
        private String asymProvider;
        private String symProvider;
        final /* synthetic */ PEMReader this$0;

        /* JADX WARN: Invalid debug info offset */
        public EncryptedPrivateKeyParser(PEMReader pEMReader, String str, String str2) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // org.bouncycastle.util.p019io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.p019io.pem.PemObject r8) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 475
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.openssl.PEMReader.EncryptedPrivateKeyParser.parseObject(org.bouncycastle.util.io.pem.PemObject):java.lang.Object");
        }
    }

    public abstract class KeyPairParser implements PemObjectParser {
        protected String provider;
        final /* synthetic */ PEMReader this$0;

        /* JADX WARN: Invalid debug info offset */
        public KeyPairParser(PEMReader pEMReader, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0088
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        public org.bouncycastle.asn1.ASN1Sequence readKeyPair(org.bouncycastle.util.p019io.pem.PemObject r11) throws java.io.IOException {
            /*
                r10 = this;
                r0 = 0
                return r0
            L8f:
            L91:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.openssl.PEMReader.KeyPairParser.readKeyPair(org.bouncycastle.util.io.pem.PemObject):org.bouncycastle.asn1.ASN1Sequence");
        }
    }

    public class PKCS10CertificationRequestParser implements PemObjectParser {
        final /* synthetic */ PEMReader this$0;

        /* JADX WARN: Invalid debug info offset */
        private PKCS10CertificationRequestParser(PEMReader pEMReader) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ PKCS10CertificationRequestParser(PEMReader pEMReader, C50571 c50571) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.util.p019io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) throws IOException {
            return null;
        }
    }

    public class PKCS7Parser implements PemObjectParser {
        final /* synthetic */ PEMReader this$0;

        /* JADX WARN: Invalid debug info offset */
        private PKCS7Parser(PEMReader pEMReader) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ PKCS7Parser(PEMReader pEMReader, C50571 c50571) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.util.p019io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) throws IOException {
            return null;
        }
    }

    public class PrivateKeyParser implements PemObjectParser {
        private String provider;
        final /* synthetic */ PEMReader this$0;

        /* JADX WARN: Invalid debug info offset */
        public PrivateKeyParser(PEMReader pEMReader, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.util.p019io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) throws IOException {
            return null;
        }
    }

    public class PublicKeyParser implements PemObjectParser {
        private String provider;
        final /* synthetic */ PEMReader this$0;

        /* JADX WARN: Invalid debug info offset */
        public PublicKeyParser(PEMReader pEMReader, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0015
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // org.bouncycastle.util.p019io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.p019io.pem.PemObject r5) throws java.io.IOException {
            /*
                r4 = this;
                r0 = 0
                return r0
            L22:
            L38:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.openssl.PEMReader.PublicKeyParser.parseObject(org.bouncycastle.util.io.pem.PemObject):java.lang.Object");
        }
    }

    public class RSAKeyPairParser extends KeyPairParser {
        final /* synthetic */ PEMReader this$0;

        /* JADX WARN: Invalid debug info offset */
        public RSAKeyPairParser(PEMReader pEMReader, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x007c
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // org.bouncycastle.util.p019io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.p019io.pem.PemObject r21) throws java.io.IOException {
            /*
                r20 = this;
                r0 = 0
                return r0
            L90:
            L92:
            L94:
            L98:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.openssl.PEMReader.RSAKeyPairParser.parseObject(org.bouncycastle.util.io.pem.PemObject):java.lang.Object");
        }
    }

    public class RSAPublicKeyParser implements PemObjectParser {
        private String provider;
        final /* synthetic */ PEMReader this$0;

        /* JADX WARN: Invalid debug info offset */
        public RSAPublicKeyParser(PEMReader pEMReader, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0030
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
            */
        @Override // org.bouncycastle.util.p019io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.p019io.pem.PemObject r4) throws java.io.IOException {
            /*
                r3 = this;
                r0 = 0
                return r0
            L2e:
            L30:
            L43:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.openssl.PEMReader.RSAPublicKeyParser.parseObject(org.bouncycastle.util.io.pem.PemObject):java.lang.Object");
        }
    }

    public class X509AttributeCertificateParser implements PemObjectParser {
        final /* synthetic */ PEMReader this$0;

        /* JADX WARN: Invalid debug info offset */
        private X509AttributeCertificateParser(PEMReader pEMReader) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ X509AttributeCertificateParser(PEMReader pEMReader, C50571 c50571) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.util.p019io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) throws IOException {
            return null;
        }
    }

    public class X509CRLParser implements PemObjectParser {
        private String provider;
        final /* synthetic */ PEMReader this$0;

        /* JADX WARN: Invalid debug info offset */
        public X509CRLParser(PEMReader pEMReader, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // org.bouncycastle.util.p019io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.p019io.pem.PemObject r4) throws java.io.IOException {
            /*
                r3 = this;
                r0 = 0
                return r0
            L16:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.openssl.PEMReader.X509CRLParser.parseObject(org.bouncycastle.util.io.pem.PemObject):java.lang.Object");
        }
    }

    public class X509CertificateParser implements PemObjectParser {
        private String provider;
        final /* synthetic */ PEMReader this$0;

        /* JADX WARN: Invalid debug info offset */
        public X509CertificateParser(PEMReader pEMReader, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // org.bouncycastle.util.p019io.pem.PemObjectParser
        public java.lang.Object parseObject(org.bouncycastle.util.p019io.pem.PemObject r4) throws java.io.IOException {
            /*
                r3 = this;
                r0 = 0
                return r0
            L16:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.openssl.PEMReader.X509CertificateParser.parseObject(org.bouncycastle.util.io.pem.PemObject):java.lang.Object");
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public PEMReader(Reader reader) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PEMReader(Reader reader, PasswordFinder passwordFinder) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PEMReader(Reader reader, PasswordFinder passwordFinder, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PEMReader(Reader reader, PasswordFinder passwordFinder, String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ PasswordFinder access$400(PEMReader pEMReader) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Object readObject() throws IOException {
        return null;
    }
}
