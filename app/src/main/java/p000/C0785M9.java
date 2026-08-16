package p000;

import com.tencent.smtt.sdk.TbsListener;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: M9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0785M9 {

    /* JADX INFO: renamed from: a */
    public final String f2047a;

    /* JADX INFO: renamed from: b */
    public static final Comparator<String> f1980b = new a();

    /* JADX INFO: renamed from: c */
    public static final Map<String, C0785M9> f1983c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public static final C0785M9 f1986d = m3664c("SSL_RSA_WITH_NULL_MD5", 1);

    /* JADX INFO: renamed from: e */
    public static final C0785M9 f1989e = m3664c("SSL_RSA_WITH_NULL_SHA", 2);

    /* JADX INFO: renamed from: f */
    public static final C0785M9 f1992f = m3664c("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);

    /* JADX INFO: renamed from: g */
    public static final C0785M9 f1995g = m3664c("SSL_RSA_WITH_RC4_128_MD5", 4);

    /* JADX INFO: renamed from: h */
    public static final C0785M9 f1998h = m3664c("SSL_RSA_WITH_RC4_128_SHA", 5);

    /* JADX INFO: renamed from: i */
    public static final C0785M9 f2001i = m3664c("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);

    /* JADX INFO: renamed from: j */
    public static final C0785M9 f2004j = m3664c("SSL_RSA_WITH_DES_CBC_SHA", 9);

    /* JADX INFO: renamed from: k */
    public static final C0785M9 f2007k = m3664c("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* JADX INFO: renamed from: l */
    public static final C0785M9 f2010l = m3664c("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);

    /* JADX INFO: renamed from: m */
    public static final C0785M9 f2013m = m3664c("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);

    /* JADX INFO: renamed from: n */
    public static final C0785M9 f2016n = m3664c("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);

    /* JADX INFO: renamed from: o */
    public static final C0785M9 f2019o = m3664c("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);

    /* JADX INFO: renamed from: p */
    public static final C0785M9 f2022p = m3664c("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);

    /* JADX INFO: renamed from: q */
    public static final C0785M9 f2025q = m3664c("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);

    /* JADX INFO: renamed from: r */
    public static final C0785M9 f2028r = m3664c("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);

    /* JADX INFO: renamed from: s */
    public static final C0785M9 f2031s = m3664c("SSL_DH_anon_WITH_RC4_128_MD5", 24);

    /* JADX INFO: renamed from: t */
    public static final C0785M9 f2033t = m3664c("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);

    /* JADX INFO: renamed from: u */
    public static final C0785M9 f2035u = m3664c("SSL_DH_anon_WITH_DES_CBC_SHA", 26);

    /* JADX INFO: renamed from: v */
    public static final C0785M9 f2037v = m3664c("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);

    /* JADX INFO: renamed from: w */
    public static final C0785M9 f2039w = m3664c("TLS_KRB5_WITH_DES_CBC_SHA", 30);

    /* JADX INFO: renamed from: x */
    public static final C0785M9 f2041x = m3664c("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);

    /* JADX INFO: renamed from: y */
    public static final C0785M9 f2043y = m3664c("TLS_KRB5_WITH_RC4_128_SHA", 32);

    /* JADX INFO: renamed from: z */
    public static final C0785M9 f2045z = m3664c("TLS_KRB5_WITH_DES_CBC_MD5", 34);

    /* JADX INFO: renamed from: A */
    public static final C0785M9 f1926A = m3664c("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);

    /* JADX INFO: renamed from: B */
    public static final C0785M9 f1928B = m3664c("TLS_KRB5_WITH_RC4_128_MD5", 36);

    /* JADX INFO: renamed from: C */
    public static final C0785M9 f1930C = m3664c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);

    /* JADX INFO: renamed from: D */
    public static final C0785M9 f1932D = m3664c("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);

    /* JADX INFO: renamed from: E */
    public static final C0785M9 f1934E = m3664c("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);

    /* JADX INFO: renamed from: F */
    public static final C0785M9 f1936F = m3664c("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);

    /* JADX INFO: renamed from: G */
    public static final C0785M9 f1938G = m3664c("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* JADX INFO: renamed from: H */
    public static final C0785M9 f1940H = m3664c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);

    /* JADX INFO: renamed from: I */
    public static final C0785M9 f1942I = m3664c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);

    /* JADX INFO: renamed from: J */
    public static final C0785M9 f1944J = m3664c("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);

    /* JADX INFO: renamed from: K */
    public static final C0785M9 f1946K = m3664c("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* JADX INFO: renamed from: L */
    public static final C0785M9 f1948L = m3664c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);

    /* JADX INFO: renamed from: M */
    public static final C0785M9 f1950M = m3664c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);

    /* JADX INFO: renamed from: N */
    public static final C0785M9 f1952N = m3664c("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);

    /* JADX INFO: renamed from: O */
    public static final C0785M9 f1954O = m3664c("TLS_RSA_WITH_NULL_SHA256", 59);

    /* JADX INFO: renamed from: P */
    public static final C0785M9 f1956P = m3664c("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);

    /* JADX INFO: renamed from: Q */
    public static final C0785M9 f1958Q = m3664c("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);

    /* JADX INFO: renamed from: R */
    public static final C0785M9 f1960R = m3664c("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);

    /* JADX INFO: renamed from: S */
    public static final C0785M9 f1962S = m3664c("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);

    /* JADX INFO: renamed from: T */
    public static final C0785M9 f1964T = m3664c("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);

    /* JADX INFO: renamed from: U */
    public static final C0785M9 f1966U = m3664c("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);

    /* JADX INFO: renamed from: V */
    public static final C0785M9 f1968V = m3664c("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);

    /* JADX INFO: renamed from: W */
    public static final C0785M9 f1970W = m3664c("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", TbsListener.ErrorCode.FILE_DELETED);

    /* JADX INFO: renamed from: X */
    public static final C0785M9 f1972X = m3664c("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", TbsListener.ErrorCode.UNKNOWN_ERROR);

    /* JADX INFO: renamed from: Y */
    public static final C0785M9 f1974Y = m3664c("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);

    /* JADX INFO: renamed from: Z */
    public static final C0785M9 f1976Z = m3664c("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);

    /* JADX INFO: renamed from: a0 */
    public static final C0785M9 f1978a0 = m3664c("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", TbsListener.ErrorCode.DOWNLOAD_CDN_URL_IS_NULL);

    /* JADX INFO: renamed from: b0 */
    public static final C0785M9 f1981b0 = m3664c("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);

    /* JADX INFO: renamed from: c0 */
    public static final C0785M9 f1984c0 = m3664c("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);

    /* JADX INFO: renamed from: d0 */
    public static final C0785M9 f1987d0 = m3664c("TLS_PSK_WITH_RC4_128_SHA", 138);

    /* JADX INFO: renamed from: e0 */
    public static final C0785M9 f1990e0 = m3664c("TLS_PSK_WITH_3DES_EDE_CBC_SHA", CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA);

    /* JADX INFO: renamed from: f0 */
    public static final C0785M9 f1993f0 = m3664c("TLS_PSK_WITH_AES_128_CBC_SHA", CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA);

    /* JADX INFO: renamed from: g0 */
    public static final C0785M9 f1996g0 = m3664c("TLS_PSK_WITH_AES_256_CBC_SHA", CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: h0 */
    public static final C0785M9 f1999h0 = m3664c("TLS_RSA_WITH_SEED_CBC_SHA", 150);

    /* JADX INFO: renamed from: i0 */
    public static final C0785M9 f2002i0 = m3664c("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* JADX INFO: renamed from: j0 */
    public static final C0785M9 f2005j0 = m3664c("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* JADX INFO: renamed from: k0 */
    public static final C0785M9 f2008k0 = m3664c("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);

    /* JADX INFO: renamed from: l0 */
    public static final C0785M9 f2011l0 = m3664c("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);

    /* JADX INFO: renamed from: m0 */
    public static final C0785M9 f2014m0 = m3664c("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);

    /* JADX INFO: renamed from: n0 */
    public static final C0785M9 f2017n0 = m3664c("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);

    /* JADX INFO: renamed from: o0 */
    public static final C0785M9 f2020o0 = m3664c("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);

    /* JADX INFO: renamed from: p0 */
    public static final C0785M9 f2023p0 = m3664c("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);

    /* JADX INFO: renamed from: q0 */
    public static final C0785M9 f2026q0 = m3664c("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);

    /* JADX INFO: renamed from: r0 */
    public static final C0785M9 f2029r0 = m3664c("TLS_FALLBACK_SCSV", 22016);

    /* JADX INFO: renamed from: s0 */
    public static final C0785M9 f2032s0 = m3664c("TLS_ECDH_ECDSA_WITH_NULL_SHA", CipherSuite.TLS_ECDH_ECDSA_WITH_NULL_SHA);

    /* JADX INFO: renamed from: t0 */
    public static final C0785M9 f2034t0 = m3664c("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", CipherSuite.TLS_ECDH_ECDSA_WITH_RC4_128_SHA);

    /* JADX INFO: renamed from: u0 */
    public static final C0785M9 f2036u0 = m3664c("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", CipherSuite.TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA);

    /* JADX INFO: renamed from: v0 */
    public static final C0785M9 f2038v0 = m3664c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA);

    /* JADX INFO: renamed from: w0 */
    public static final C0785M9 f2040w0 = m3664c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: x0 */
    public static final C0785M9 f2042x0 = m3664c("TLS_ECDHE_ECDSA_WITH_NULL_SHA", CipherSuite.TLS_ECDHE_ECDSA_WITH_NULL_SHA);

    /* JADX INFO: renamed from: y0 */
    public static final C0785M9 f2044y0 = m3664c("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", CipherSuite.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA);

    /* JADX INFO: renamed from: z0 */
    public static final C0785M9 f2046z0 = m3664c("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", CipherSuite.TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA);

    /* JADX INFO: renamed from: A0 */
    public static final C0785M9 f1927A0 = m3664c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA);

    /* JADX INFO: renamed from: B0 */
    public static final C0785M9 f1929B0 = m3664c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: C0 */
    public static final C0785M9 f1931C0 = m3664c("TLS_ECDH_RSA_WITH_NULL_SHA", CipherSuite.TLS_ECDH_RSA_WITH_NULL_SHA);

    /* JADX INFO: renamed from: D0 */
    public static final C0785M9 f1933D0 = m3664c("TLS_ECDH_RSA_WITH_RC4_128_SHA", CipherSuite.TLS_ECDH_RSA_WITH_RC4_128_SHA);

    /* JADX INFO: renamed from: E0 */
    public static final C0785M9 f1935E0 = m3664c("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", CipherSuite.TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA);

    /* JADX INFO: renamed from: F0 */
    public static final C0785M9 f1937F0 = m3664c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA);

    /* JADX INFO: renamed from: G0 */
    public static final C0785M9 f1939G0 = m3664c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: H0 */
    public static final C0785M9 f1941H0 = m3664c("TLS_ECDHE_RSA_WITH_NULL_SHA", CipherSuite.TLS_ECDHE_RSA_WITH_NULL_SHA);

    /* JADX INFO: renamed from: I0 */
    public static final C0785M9 f1943I0 = m3664c("TLS_ECDHE_RSA_WITH_RC4_128_SHA", CipherSuite.TLS_ECDHE_RSA_WITH_RC4_128_SHA);

    /* JADX INFO: renamed from: J0 */
    public static final C0785M9 f1945J0 = m3664c("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", CipherSuite.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA);

    /* JADX INFO: renamed from: K0 */
    public static final C0785M9 f1947K0 = m3664c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA);

    /* JADX INFO: renamed from: L0 */
    public static final C0785M9 f1949L0 = m3664c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: M0 */
    public static final C0785M9 f1951M0 = m3664c("TLS_ECDH_anon_WITH_NULL_SHA", CipherSuite.TLS_ECDH_anon_WITH_NULL_SHA);

    /* JADX INFO: renamed from: N0 */
    public static final C0785M9 f1953N0 = m3664c("TLS_ECDH_anon_WITH_RC4_128_SHA", CipherSuite.TLS_ECDH_anon_WITH_RC4_128_SHA);

    /* JADX INFO: renamed from: O0 */
    public static final C0785M9 f1955O0 = m3664c("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", CipherSuite.TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA);

    /* JADX INFO: renamed from: P0 */
    public static final C0785M9 f1957P0 = m3664c("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", CipherSuite.TLS_ECDH_anon_WITH_AES_128_CBC_SHA);

    /* JADX INFO: renamed from: Q0 */
    public static final C0785M9 f1959Q0 = m3664c("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", CipherSuite.TLS_ECDH_anon_WITH_AES_256_CBC_SHA);

    /* JADX INFO: renamed from: R0 */
    public static final C0785M9 f1961R0 = m3664c("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256);

    /* JADX INFO: renamed from: S0 */
    public static final C0785M9 f1963S0 = m3664c("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384);

    /* JADX INFO: renamed from: T0 */
    public static final C0785M9 f1965T0 = m3664c("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256);

    /* JADX INFO: renamed from: U0 */
    public static final C0785M9 f1967U0 = m3664c("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384);

    /* JADX INFO: renamed from: V0 */
    public static final C0785M9 f1969V0 = m3664c("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256);

    /* JADX INFO: renamed from: W0 */
    public static final C0785M9 f1971W0 = m3664c("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384);

    /* JADX INFO: renamed from: X0 */
    public static final C0785M9 f1973X0 = m3664c("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256);

    /* JADX INFO: renamed from: Y0 */
    public static final C0785M9 f1975Y0 = m3664c("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384);

    /* JADX INFO: renamed from: Z0 */
    public static final C0785M9 f1977Z0 = m3664c("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256);

    /* JADX INFO: renamed from: a1 */
    public static final C0785M9 f1979a1 = m3664c("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384);

    /* JADX INFO: renamed from: b1 */
    public static final C0785M9 f1982b1 = m3664c("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256);

    /* JADX INFO: renamed from: c1 */
    public static final C0785M9 f1985c1 = m3664c("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384);

    /* JADX INFO: renamed from: d1 */
    public static final C0785M9 f1988d1 = m3664c("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256);

    /* JADX INFO: renamed from: e1 */
    public static final C0785M9 f1991e1 = m3664c("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384);

    /* JADX INFO: renamed from: f1 */
    public static final C0785M9 f1994f1 = m3664c("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256);

    /* JADX INFO: renamed from: g1 */
    public static final C0785M9 f1997g1 = m3664c("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384);

    /* JADX INFO: renamed from: h1 */
    public static final C0785M9 f2000h1 = m3664c("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);

    /* JADX INFO: renamed from: i1 */
    public static final C0785M9 f2003i1 = m3664c("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);

    /* JADX INFO: renamed from: j1 */
    public static final C0785M9 f2006j1 = m3664c("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* JADX INFO: renamed from: k1 */
    public static final C0785M9 f2009k1 = m3664c("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* JADX INFO: renamed from: l1 */
    public static final C0785M9 f2012l1 = m3664c("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);

    /* JADX INFO: renamed from: m1 */
    public static final C0785M9 f2015m1 = m3664c("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);

    /* JADX INFO: renamed from: n1 */
    public static final C0785M9 f2018n1 = m3664c("TLS_AES_128_GCM_SHA256", 4865);

    /* JADX INFO: renamed from: o1 */
    public static final C0785M9 f2021o1 = m3664c("TLS_AES_256_GCM_SHA384", 4866);

    /* JADX INFO: renamed from: p1 */
    public static final C0785M9 f2024p1 = m3664c("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* JADX INFO: renamed from: q1 */
    public static final C0785M9 f2027q1 = m3664c("TLS_AES_128_CCM_SHA256", 4868);

    /* JADX INFO: renamed from: r1 */
    public static final C0785M9 f2030r1 = m3664c("TLS_AES_256_CCM_8_SHA256", 4869);

    /* JADX INFO: renamed from: M9$a */
    public class a implements Comparator<String> {
        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public int m3667a(String str, String str2) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(String str, String str2) {
            return 0;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C0785M9(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static synchronized p000.C0785M9 m3662a(java.lang.String r3) {
        /*
            r0 = 0
            return r0
        L1f:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0785M9.m3662a(java.lang.String):M9");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static List<C0785M9> m3663b(String... strArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static C0785M9 m3664c(String str, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static String m3665e(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public String m3666d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
