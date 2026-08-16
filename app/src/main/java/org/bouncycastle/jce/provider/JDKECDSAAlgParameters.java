package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JDKECDSAAlgParameters extends AlgorithmParametersSpi {

    public static class SigAlgParameters extends JDKAlgorithmParameters {
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

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
        }
    }
}
