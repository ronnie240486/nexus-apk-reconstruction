package org.bouncycastle.math.p018ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
interface ECMultiplier {
    ECPoint multiply(ECPoint eCPoint, BigInteger bigInteger, PreCompInfo preCompInfo);
}
