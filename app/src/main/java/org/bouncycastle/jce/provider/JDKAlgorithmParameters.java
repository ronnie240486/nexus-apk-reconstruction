package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.PSSParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.crypto.tls.AlertDescription;
import org.bouncycastle.jce.spec.ElGamalParameterSpec;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.spec.IESParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JDKAlgorithmParameters extends AlgorithmParametersSpi {

    /* JADX INFO: renamed from: org.bouncycastle.jce.provider.JDKAlgorithmParameters$DH */
    public static class C5045DH extends JDKAlgorithmParameters {
        DHParameterSpec currentSpec;

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0017
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            /*
                r4 = this;
                r0 = 0
                return r0
            L1e:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKAlgorithmParameters.C5045DH.engineGetEncoded():byte[]");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] r5) throws java.io.IOException {
            /*
                r4 = this;
                return
            L3a:
            L40:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKAlgorithmParameters.C5045DH.engineInit(byte[]):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            return null;
        }
    }

    public static class DSA extends JDKAlgorithmParameters {
        DSAParameterSpec currentSpec;

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0017
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            /*
                r4 = this;
                r0 = 0
                return r0
            L1e:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKAlgorithmParameters.DSA.engineGetEncoded():byte[]");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] r5) throws java.io.IOException {
            /*
                r4 = this;
                return
            L21:
            L27:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKAlgorithmParameters.DSA.engineInit(byte[]):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            return null;
        }
    }

    public static class ElGamal extends JDKAlgorithmParameters {
        ElGamalParameterSpec currentSpec;

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0011
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            /*
                r3 = this;
                r0 = 0
                return r0
            L18:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKAlgorithmParameters.ElGamal.engineGetEncoded():byte[]");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] r4) throws java.io.IOException {
            /*
                r3 = this;
                return
            L1d:
            L23:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKAlgorithmParameters.ElGamal.engineInit(byte[]):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            return null;
        }
    }

    public static class GOST3410 extends JDKAlgorithmParameters {
        GOST3410ParameterSpec currentSpec;

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0026
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            /*
                r5 = this;
                r0 = 0
                return r0
            L2d:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKAlgorithmParameters.GOST3410.engineGetEncoded():byte[]");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] r3) throws java.io.IOException {
            /*
                r2 = this;
                return
            L14:
            L1a:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKAlgorithmParameters.GOST3410.engineInit(byte[]):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            return null;
        }
    }

    public static class IES extends JDKAlgorithmParameters {
        IESParameterSpec currentSpec;

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] r6) throws java.io.IOException {
            /*
                r5 = this;
                return
            L33:
            L39:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKAlgorithmParameters.IES.engineInit(byte[]):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            return null;
        }
    }

    public static class IVAlgorithmParameters extends JDKAlgorithmParameters {

        /* JADX INFO: renamed from: iv */
        private byte[] f16374iv;

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0006
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] r3, java.lang.String r4) throws java.io.IOException {
            /*
                r2 = this;
                return
            L14:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKAlgorithmParameters.IVAlgorithmParameters.engineInit(byte[], java.lang.String):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            return null;
        }
    }

    public static class OAEP extends JDKAlgorithmParameters {
        OAEPParameterSpec currentSpec;

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0052
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            /*
                r6 = this;
                r0 = 0
                return r0
            L59:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKAlgorithmParameters.OAEP.engineGetEncoded():byte[]");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] r7) throws java.io.IOException {
            /*
                r6 = this;
                return
            L5b:
            L61:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKAlgorithmParameters.OAEP.engineInit(byte[]):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            return null;
        }
    }

    public static class PBKDF2 extends JDKAlgorithmParameters {
        PBKDF2Params params;

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            return null;
        }
    }

    public static class PKCS12PBE extends JDKAlgorithmParameters {
        PKCS12PBEParams params;

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            return null;
        }
    }

    public static class PSS extends JDKAlgorithmParameters {
        PSSParameterSpec currentSpec;

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] r9) throws java.io.IOException {
            /*
                r8 = this;
                return
            L5f:
            L65:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKAlgorithmParameters.PSS.engineInit(byte[]):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            return null;
        }
    }

    public static class RC2AlgorithmParameters extends JDKAlgorithmParameters {

        /* JADX INFO: renamed from: iv */
        private byte[] f16375iv;
        private int parameterVersion;
        private static final short[] table = {189, 86, 234, 242, 162, 241, 172, 42, 176, 147, 209, 156, 27, 51, 253, 208, 48, 4, 182, 220, 125, 223, 50, 75, 247, 203, 69, 155, 49, 187, 33, 90, 65, 159, 225, 217, 74, 77, 158, 218, 160, 104, 44, 195, 39, 95, 128, 54, 62, 238, 251, 149, 26, 254, 206, 168, 52, 169, 19, 240, 166, 63, 216, 12, 120, 36, 175, 35, 82, 193, 103, 23, 245, 102, 144, 231, 232, 7, 184, 96, 72, 230, 30, 83, 243, 146, 164, AlertDescription.bad_certificate_hash_value, 140, 8, 21, AlertDescription.unsupported_extension, 134, 0, 132, 250, 244, 127, 138, 66, 25, 246, 219, 205, 20, 141, 80, 18, 186, 60, 6, 78, 236, 179, 53, 17, 161, 136, 142, 43, 148, 153, 183, AlertDescription.bad_certificate_status_response, 116, 211, 228, 191, 58, 222, 150, 14, 188, 10, 237, 119, 252, 55, 107, 3, 121, 137, 98, 198, 215, 192, 210, 124, 106, 139, 34, 163, 91, 5, 93, 2, 117, 213, 97, 227, 24, 143, 85, 81, 173, 31, 11, 94, 133, 229, 194, 87, 99, 202, 61, 108, 180, 197, 204, AlertDescription.unrecognized_name, 178, 145, 89, 13, 71, 32, 200, 79, 88, 224, 1, 226, 22, 56, 196, AlertDescription.certificate_unobtainable, 59, 15, 101, 70, 190, 126, 45, 123, 130, 249, 64, 181, 29, AlertDescription.unknown_psk_identity, 248, 235, 38, 199, 135, 151, 37, 84, 177, 40, 170, 152, 157, 165, 100, 109, 122, 212, 16, 129, 68, 239, 73, 214, 174, 46, 221, 118, 92, 47, 167, 28, 201, 9, 105, 154, 131, 207, 41, 57, 185, 233, 76, 255, 67, 171};
        private static final short[] ekb = {93, 190, 155, 139, 17, 153, AlertDescription.unsupported_extension, 77, 89, 243, 133, 166, 63, 183, 131, 197, 228, AlertDescription.unknown_psk_identity, 107, 58, 104, 90, 192, 71, 160, 100, 52, 12, 241, 208, 82, 165, 185, 30, 150, 67, 65, 216, 212, 44, 219, 248, 7, 119, 42, 202, 235, 239, 16, 28, 22, 13, 56, AlertDescription.bad_certificate_hash_value, 47, 137, 193, 249, 128, 196, 109, 174, 48, 61, 206, 32, 99, 254, 230, 26, 199, 184, 80, 232, 36, 23, 252, 37, AlertDescription.certificate_unobtainable, 187, 106, 163, 68, 83, 217, 162, 1, 171, 188, 182, 31, 152, 238, 154, 167, 45, 79, 158, 142, 172, 224, 198, 73, 70, 41, 244, 148, 138, 175, 225, 91, 195, 179, 123, 87, 209, 124, 156, 237, 135, 64, 140, 226, 203, 147, 20, 201, 97, 46, 229, 204, 246, 94, 168, 92, 214, 117, 141, 98, 149, 88, 105, 118, 161, 74, 181, 85, 9, 120, 51, 130, 215, 221, 121, 245, 27, 11, 222, 38, 33, 40, 116, 4, 151, 86, 223, 60, 240, 55, 57, 220, 255, 6, 164, 234, 66, 8, 218, 180, AlertDescription.bad_certificate_status_response, 176, 207, 18, 122, 78, 250, 108, 29, 132, 0, 200, 127, 145, 69, 170, 43, 194, 177, 143, 213, 186, 242, 173, 25, 178, 103, 54, 247, 15, 10, 146, 125, 227, 157, 233, 144, 62, 35, 39, 102, 19, 236, 129, 21, 189, 34, 191, 159, 126, 169, 81, 75, 76, 251, 2, 211, AlertDescription.unrecognized_name, 134, 49, 231, 59, 5, 3, 84, 96, 72, 101, 24, 210, 205, 95, 50, 136, 14, 53, 253};

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JDKAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.AlgorithmParametersSpi
    public AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isASN1FormatString(String str) {
        return false;
    }

    public abstract AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException;
}
