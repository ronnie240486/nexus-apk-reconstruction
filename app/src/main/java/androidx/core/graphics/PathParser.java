package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import androidx.annotation.Nullable;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import p000.C0060Av;
import p000.C5312rZ;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public class PathParser {
    private static final String LOGTAG = "PathParser";

    public static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;
    }

    public static class PathDataNode {
        public float[] mParams;
        public char mType;

        public PathDataNode(char c, float[] fArr) {
            this.mType = c;
            this.mParams = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private static void addCommand(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            int i2;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            char c3 = c2;
            float f9 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            switch (c3) {
                case DefaultScrollHandle.f11004h /* 65 */:
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case ModuleDescriptor.MODULE_VERSION /* 86 */:
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case SwipyRefreshLayout.f11497R /* 76 */:
                case IjkMediaMeta.FF_PROFILE_H264_MAIN /* 77 */:
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case TbsListener.ErrorCode.DOWNLOAD_FILE_CONTENTLENGTH_NOT_MATCH /* 113 */:
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f13, f14);
                    f9 = f13;
                    f11 = f9;
                    f10 = f14;
                    f12 = f10;
                    i = 2;
                    break;
            }
            float f15 = f9;
            float f16 = f10;
            float f17 = f13;
            float f18 = f14;
            int i3 = 0;
            char c4 = c;
            while (i3 < fArr2.length) {
                if (c3 != 'A') {
                    if (c3 == 'C') {
                        i2 = i3;
                        int i4 = i2 + 2;
                        int i5 = i2 + 3;
                        int i6 = i2 + 4;
                        int i7 = i2 + 5;
                        path.cubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i4], fArr2[i5], fArr2[i6], fArr2[i7]);
                        f15 = fArr2[i6];
                        float f19 = fArr2[i7];
                        float f20 = fArr2[i4];
                        float f21 = fArr2[i5];
                        f16 = f19;
                        f12 = f21;
                        f11 = f20;
                    } else if (c3 == 'H') {
                        i2 = i3;
                        path.lineTo(fArr2[i2], f16);
                        f15 = fArr2[i2];
                    } else if (c3 == 'Q') {
                        i2 = i3;
                        int i8 = i2 + 1;
                        int i9 = i2 + 2;
                        int i10 = i2 + 3;
                        path.quadTo(fArr2[i2], fArr2[i8], fArr2[i9], fArr2[i10]);
                        float f22 = fArr2[i2];
                        float f23 = fArr2[i8];
                        f15 = fArr2[i9];
                        f16 = fArr2[i10];
                        f11 = f22;
                        f12 = f23;
                    } else if (c3 == 'V') {
                        i2 = i3;
                        path.lineTo(f15, fArr2[i2]);
                        f16 = fArr2[i2];
                    } else if (c3 != 'a') {
                        if (c3 != 'c') {
                            if (c3 == 'h') {
                                path.rLineTo(fArr2[i3], 0.0f);
                                f15 += fArr2[i3];
                            } else if (c3 != 'q') {
                                if (c3 == 'v') {
                                    path.rLineTo(0.0f, fArr2[i3]);
                                    f4 = fArr2[i3];
                                } else if (c3 == 'L') {
                                    int i11 = i3 + 1;
                                    path.lineTo(fArr2[i3], fArr2[i11]);
                                    f15 = fArr2[i3];
                                    f16 = fArr2[i11];
                                } else if (c3 == 'M') {
                                    f15 = fArr2[i3];
                                    f16 = fArr2[i3 + 1];
                                    if (i3 > 0) {
                                        path.lineTo(f15, f16);
                                    } else {
                                        path.moveTo(f15, f16);
                                        i2 = i3;
                                        f18 = f16;
                                        f17 = f15;
                                    }
                                } else if (c3 == 'S') {
                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                        f15 = (f15 * 2.0f) - f11;
                                        f16 = (f16 * 2.0f) - f12;
                                    }
                                    float f24 = f16;
                                    float f25 = f15;
                                    int i12 = i3 + 1;
                                    int i13 = i3 + 2;
                                    int i14 = i3 + 3;
                                    path.cubicTo(f25, f24, fArr2[i3], fArr2[i12], fArr2[i13], fArr2[i14]);
                                    f = fArr2[i3];
                                    f2 = fArr2[i12];
                                    f15 = fArr2[i13];
                                    f16 = fArr2[i14];
                                    f11 = f;
                                    f12 = f2;
                                } else if (c3 == 'T') {
                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                        f15 = (f15 * 2.0f) - f11;
                                        f16 = (f16 * 2.0f) - f12;
                                    }
                                    int i15 = i3 + 1;
                                    path.quadTo(f15, f16, fArr2[i3], fArr2[i15]);
                                    i2 = i3;
                                    f12 = f16;
                                    f11 = f15;
                                    f15 = fArr2[i3];
                                    f16 = fArr2[i15];
                                } else if (c3 == 'l') {
                                    int i16 = i3 + 1;
                                    path.rLineTo(fArr2[i3], fArr2[i16]);
                                    f15 += fArr2[i3];
                                    f4 = fArr2[i16];
                                } else if (c3 == 'm') {
                                    float f26 = fArr2[i3];
                                    f15 += f26;
                                    float f27 = fArr2[i3 + 1];
                                    f16 += f27;
                                    if (i3 > 0) {
                                        path.rLineTo(f26, f27);
                                    } else {
                                        path.rMoveTo(f26, f27);
                                        i2 = i3;
                                        f18 = f16;
                                        f17 = f15;
                                    }
                                } else if (c3 == 's') {
                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                        float f28 = f15 - f11;
                                        f5 = f16 - f12;
                                        f6 = f28;
                                    } else {
                                        f6 = 0.0f;
                                        f5 = 0.0f;
                                    }
                                    int i17 = i3 + 1;
                                    int i18 = i3 + 2;
                                    int i19 = i3 + 3;
                                    path.rCubicTo(f6, f5, fArr2[i3], fArr2[i17], fArr2[i18], fArr2[i19]);
                                    f = fArr2[i3] + f15;
                                    f2 = fArr2[i17] + f16;
                                    f15 += fArr2[i18];
                                    f3 = fArr2[i19];
                                } else if (c3 == 't') {
                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                        f7 = f15 - f11;
                                        f8 = f16 - f12;
                                    } else {
                                        f8 = 0.0f;
                                        f7 = 0.0f;
                                    }
                                    int i20 = i3 + 1;
                                    path.rQuadTo(f7, f8, fArr2[i3], fArr2[i20]);
                                    float f29 = f7 + f15;
                                    float f30 = f8 + f16;
                                    f15 += fArr2[i3];
                                    f16 += fArr2[i20];
                                    f12 = f30;
                                    f11 = f29;
                                }
                                f16 += f4;
                            } else {
                                int i21 = i3 + 1;
                                int i22 = i3 + 2;
                                int i23 = i3 + 3;
                                path.rQuadTo(fArr2[i3], fArr2[i21], fArr2[i22], fArr2[i23]);
                                f = fArr2[i3] + f15;
                                f2 = fArr2[i21] + f16;
                                f15 += fArr2[i22];
                                f3 = fArr2[i23];
                            }
                            i2 = i3;
                        } else {
                            int i24 = i3 + 2;
                            int i25 = i3 + 3;
                            int i26 = i3 + 4;
                            int i27 = i3 + 5;
                            path.rCubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i24], fArr2[i25], fArr2[i26], fArr2[i27]);
                            f = fArr2[i24] + f15;
                            f2 = fArr2[i25] + f16;
                            f15 += fArr2[i26];
                            f3 = fArr2[i27];
                        }
                        f16 += f3;
                        f11 = f;
                        f12 = f2;
                        i2 = i3;
                    } else {
                        int i28 = i3 + 5;
                        int i29 = i3 + 6;
                        i2 = i3;
                        drawArc(path, f15, f16, fArr2[i28] + f15, fArr2[i29] + f16, fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                        f15 += fArr2[i28];
                        f16 += fArr2[i29];
                    }
                    i3 = i2 + i;
                    c4 = c2;
                    c3 = c4;
                } else {
                    i2 = i3;
                    int i30 = i2 + 5;
                    int i31 = i2 + 6;
                    drawArc(path, f15, f16, fArr2[i30], fArr2[i31], fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                    f15 = fArr2[i30];
                    f16 = fArr2[i31];
                }
                f12 = f16;
                f11 = f15;
                i3 = i2 + i;
                c4 = c2;
                c3 = c4;
            }
            fArr[0] = f15;
            fArr[1] = f16;
            fArr[2] = f11;
            fArr[3] = f12;
            fArr[4] = f17;
            fArr[5] = f18;
        }

        private static void arcToBezier(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int iCeil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d7);
            double dSin = Math.sin(d7);
            double dCos2 = Math.cos(d8);
            double dSin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * dCos;
            double d13 = d4 * dSin;
            double d14 = (d12 * dSin2) - (d13 * dCos2);
            double d15 = d11 * dSin;
            double d16 = d4 * dCos;
            double d17 = (dCos2 * d16) + (dSin2 * d15);
            double d18 = iCeil;
            Double.isNaN(d18);
            double d19 = d9 / d18;
            double d20 = d8;
            double d21 = d17;
            double d22 = d14;
            int i = 0;
            double d23 = d5;
            double d24 = d6;
            while (i < iCeil) {
                double d25 = d20 + d19;
                double dSin3 = Math.sin(d25);
                double dCos3 = Math.cos(d25);
                double d26 = (((d10 * dCos) * dCos3) + d) - (d13 * dSin3);
                double d27 = (d16 * dSin3) + (d10 * dSin * dCos3) + d2;
                double d28 = (d12 * dSin3) - (d13 * dCos3);
                double d29 = (dCos3 * d16) + (dSin3 * d15);
                double d30 = d25 - d20;
                double dTan = Math.tan(d30 / 2.0d);
                double dSqrt = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d30)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d22 * dSqrt) + d23), (float) ((d21 * dSqrt) + d24), (float) (d26 - (dSqrt * d28)), (float) (d27 - (dSqrt * d29)), (float) d26, (float) d27);
                i++;
                d19 = d19;
                dSin = dSin;
                d23 = d26;
                d15 = d15;
                dCos = dCos;
                d20 = d25;
                d21 = d29;
                d22 = d28;
                iCeil = iCeil;
                d24 = d27;
                d10 = d3;
            }
        }

        private static void drawArc(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians(f7);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d3 = f;
            Double.isNaN(d3);
            double d4 = d3 * dCos;
            double d5 = f2;
            Double.isNaN(d5);
            double d6 = f5;
            Double.isNaN(d6);
            double d7 = ((d5 * dSin) + d4) / d6;
            double d8 = -f;
            Double.isNaN(d8);
            Double.isNaN(d5);
            double d9 = (d5 * dCos) + (d8 * dSin);
            double d10 = f6;
            Double.isNaN(d10);
            double d11 = d9 / d10;
            double d12 = f3;
            Double.isNaN(d12);
            double d13 = f4;
            Double.isNaN(d13);
            Double.isNaN(d6);
            double d14 = ((d13 * dSin) + (d12 * dCos)) / d6;
            double d15 = -f3;
            Double.isNaN(d15);
            Double.isNaN(d13);
            Double.isNaN(d10);
            double d16 = ((d13 * dCos) + (d15 * dSin)) / d10;
            double d17 = d7 - d14;
            double d18 = d11 - d16;
            double d19 = (d7 + d14) / 2.0d;
            double d20 = (d11 + d16) / 2.0d;
            double d21 = (d18 * d18) + (d17 * d17);
            if (d21 == 0.0d) {
                Log.w(PathParser.LOGTAG, " Points are coincident");
                return;
            }
            double d22 = (1.0d / d21) - 0.25d;
            if (d22 < 0.0d) {
                Log.w(PathParser.LOGTAG, "Points are too far apart " + d21);
                float fSqrt = (float) (Math.sqrt(d21) / 1.99999d);
                drawArc(path, f, f2, f3, f4, f5 * fSqrt, f6 * fSqrt, f7, z, z2);
                return;
            }
            double dSqrt = Math.sqrt(d22);
            double d23 = d17 * dSqrt;
            double d24 = dSqrt * d18;
            if (z == z2) {
                d = d19 - d24;
                d2 = d20 + d23;
            } else {
                d = d19 + d24;
                d2 = d20 - d23;
            }
            double dAtan2 = Math.atan2(d11 - d2, d7 - d);
            double dAtan3 = Math.atan2(d16 - d2, d14 - d) - dAtan2;
            if (z2 != (dAtan3 >= 0.0d)) {
                dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
            }
            Double.isNaN(d6);
            double d25 = d * d6;
            Double.isNaN(d10);
            double d26 = d2 * d10;
            arcToBezier(path, (d25 * dCos) - (d26 * dSin), (d26 * dCos) + (d25 * dSin), d6, d10, d3, d5, radians, dAtan2, dAtan3);
        }

        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < pathDataNodeArr.length; i++) {
                PathDataNode pathDataNode = pathDataNodeArr[i];
                addCommand(path, fArr, c, pathDataNode.mType, pathDataNode.mParams);
                c = pathDataNodeArr[i].mType;
            }
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f) {
            this.mType = pathDataNode.mType;
            int i = 0;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (i >= fArr.length) {
                    return;
                }
                this.mParams[i] = (pathDataNode2.mParams[i] * f) + ((1.0f - f) * fArr[i]);
                i++;
            }
        }

        public PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            float[] fArr = pathDataNode.mParams;
            this.mParams = PathParser.copyOfRange(fArr, 0, fArr.length);
        }
    }

    private PathParser() {
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c, float[] fArr) {
        arrayList.add(new PathDataNode(c, fArr));
    }

    public static boolean canMorph(@Nullable PathDataNode[] pathDataNodeArr, @Nullable PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            PathDataNode pathDataNode = pathDataNodeArr[i];
            char c = pathDataNode.mType;
            PathDataNode pathDataNode2 = pathDataNodeArr2[i];
            if (c != pathDataNode2.mType || pathDataNode.mParams.length != pathDataNode2.mParams.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] copyOfRange(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int iMin = Math.min(i3, length - i);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, i, fArr2, 0, iMin);
        return fArr2;
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int iNextStart = nextStart(str, i);
            String strTrim = str.substring(i2, iNextStart).trim();
            if (strTrim.length() > 0) {
                addNode(arrayList, strTrim.charAt(0), getFloats(strTrim));
            }
            i2 = iNextStart;
            i = iNextStart + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            addNode(arrayList, str.charAt(i2), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[arrayList.size()]);
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        PathDataNode[] pathDataNodeArrCreateNodesFromPathData = createNodesFromPathData(str);
        if (pathDataNodeArrCreateNodesFromPathData == null) {
            return null;
        }
        try {
            PathDataNode.nodesToPath(pathDataNodeArrCreateNodesFromPathData, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException(C5312rZ.m27869a("Error in parsing ", str), e);
        }
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        if (pathDataNodeArr == null) {
            return null;
        }
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            pathDataNodeArr2[i] = new PathDataNode(pathDataNodeArr[i]);
        }
        return pathDataNodeArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:20:0x0031  */
    private static void extract(String str, int i, ExtractFloatResult extractFloatResult) {
        extractFloatResult.mEndWithNegOrDot = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = i; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == ' ') {
                z = false;
                z3 = true;
            } else if (cCharAt != 'E' && cCharAt != 'e') {
                switch (cCharAt) {
                    case ',':
                        z = false;
                        z3 = true;
                        break;
                    case '-':
                        if (i2 == i || z) {
                            z = false;
                        } else {
                            extractFloatResult.mEndWithNegOrDot = true;
                            z = false;
                            z3 = true;
                        }
                        break;
                    case '.':
                        if (z2) {
                            extractFloatResult.mEndWithNegOrDot = true;
                            z = false;
                            z3 = true;
                        } else {
                            z = false;
                            z2 = true;
                        }
                        break;
                    default:
                        z = false;
                        break;
                }
            } else {
                z = true;
            }
            if (z3) {
                extractFloatResult.mEndPosition = i2;
            }
        }
        extractFloatResult.mEndPosition = i2;
    }

    private static float[] getFloats(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                extract(str, i, extractFloatResult);
                int i3 = extractFloatResult.mEndPosition;
                if (i < i3) {
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                    i2++;
                }
                i = extractFloatResult.mEndWithNegOrDot ? i3 : i3 + 1;
            }
            return copyOfRange(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException(C0060Av.m278a("error in parsing \"", str, "\""), e);
        }
    }

    public static boolean interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3, float f) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr3 == null) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes cannot be null");
        }
        if (pathDataNodeArr.length != pathDataNodeArr2.length || pathDataNodeArr2.length != pathDataNodeArr3.length) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        if (!canMorph(pathDataNodeArr2, pathDataNodeArr3)) {
            return false;
        }
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            pathDataNodeArr[i].interpolatePathDataNode(pathDataNodeArr2[i], pathDataNodeArr3[i], f);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    private static int nextStart(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                    continue;
                } else if (cCharAt != 'e' && cCharAt != 'E') {
                    return i;
                }
            } else if (cCharAt != 'e') {
                continue;
            }
            i++;
        }
        return i;
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i = 0; i < pathDataNodeArr2.length; i++) {
            pathDataNodeArr[i].mType = pathDataNodeArr2[i].mType;
            int i2 = 0;
            while (true) {
                float[] fArr = pathDataNodeArr2[i].mParams;
                if (i2 < fArr.length) {
                    pathDataNodeArr[i].mParams[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }
}
