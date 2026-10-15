package A;

import android.graphics.Path;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public char f3a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f4b;

    public e(char c, float[] fArr) {
        this.f3a = c;
        this.f4b = fArr;
    }

    public e(e eVar) {
        this.f3a = eVar.f3a;
        float[] fArr = eVar.f4b;
        this.f4b = android.support.v4.media.session.a.d(fArr, fArr.length);
    }

    public static void a(Path path, float f4, float f5, float f6, float f7, float f8, float f9, float f10, boolean z4, boolean z5) {
        double d;
        double d4;
        double radians = Math.toRadians(f10);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d5 = f4;
        double d6 = f5;
        double d7 = f8;
        double d8 = ((d6 * sin) + (d5 * cos)) / d7;
        double d9 = f9;
        double d10 = ((d6 * cos) + ((-f4) * sin)) / d9;
        double d11 = f7;
        double d12 = ((d11 * sin) + (f6 * cos)) / d7;
        double d13 = ((d11 * cos) + ((-f6) * sin)) / d9;
        double d14 = d8 - d12;
        double d15 = d10 - d13;
        double d16 = (d8 + d12) / 2.0d;
        double d17 = (d10 + d13) / 2.0d;
        double d18 = (d15 * d15) + (d14 * d14);
        if (d18 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d19 = (1.0d / d18) - 0.25d;
        if (d19 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d18);
            float sqrt = (float) (Math.sqrt(d18) / 1.99999d);
            a(path, f4, f5, f6, f7, f8 * sqrt, sqrt * f9, f10, z4, z5);
            return;
        }
        double sqrt2 = Math.sqrt(d19);
        double d20 = sqrt2 * d14;
        double d21 = sqrt2 * d15;
        if (z4 == z5) {
            d = d16 - d21;
            d4 = d17 + d20;
        } else {
            d = d16 + d21;
            d4 = d17 - d20;
        }
        double atan2 = Math.atan2(d10 - d4, d8 - d);
        double atan22 = Math.atan2(d13 - d4, d12 - d) - atan2;
        if (z5 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d22 = d * d7;
        double d23 = d4 * d9;
        double d24 = (d22 * cos) - (d23 * sin);
        double d25 = (d23 * cos) + (d22 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d26 = -d7;
        double d27 = d26 * cos2;
        double d28 = d9 * sin2;
        double d29 = (d27 * sin3) - (d28 * cos3);
        double d30 = d26 * sin2;
        double d31 = d9 * cos2;
        double d32 = atan22 / ceil;
        double d33 = (cos3 * d31) + (sin3 * d30);
        double d34 = d5;
        double d35 = d6;
        int i4 = 0;
        double d36 = atan2;
        while (i4 < ceil) {
            double d37 = d36 + d32;
            double sin4 = Math.sin(d37);
            double cos4 = Math.cos(d37);
            int i5 = ceil;
            double d38 = (((d7 * cos2) * cos4) + d24) - (d28 * sin4);
            double d39 = (d31 * sin4) + (d7 * sin2 * cos4) + d25;
            double d40 = (d27 * sin4) - (d28 * cos4);
            double d41 = (cos4 * d31) + (sin4 * d30);
            double d42 = d37 - d36;
            double tan = Math.tan(d42 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d42)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d29 * sqrt3) + d34), (float) ((d33 * sqrt3) + d35), (float) (d38 - (sqrt3 * d40)), (float) (d39 - (sqrt3 * d41)), (float) d38, (float) d39);
            i4++;
            d35 = d39;
            cos2 = cos2;
            d30 = d30;
            d36 = d37;
            d33 = d41;
            d34 = d38;
            ceil = i5;
            d29 = d40;
            d32 = d32;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(e[] eVarArr, Path path) {
        int i4;
        float[] fArr;
        int i5;
        e eVar;
        int i6;
        char c;
        float f4;
        float f5;
        e eVar2;
        boolean z4;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        e[] eVarArr2 = eVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = eVarArr2.length;
        int i7 = 0;
        int i8 = 0;
        char c2 = 'm';
        while (i8 < length) {
            e eVar3 = eVarArr2[i8];
            char c4 = eVar3.f3a;
            float[] fArr3 = eVar3.f4b;
            float f14 = fArr2[i7];
            float f15 = fArr2[1];
            float f16 = fArr2[2];
            float f17 = fArr2[3];
            float f18 = fArr2[4];
            int i9 = i7;
            float f19 = fArr2[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i4 = 7;
                    break;
                case 'C':
                case 'c':
                    i4 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i4 = 1;
                    break;
                case 'Q':
                case ModuleDescriptor.MODULE_VERSION /* 83 */:
                case 'q':
                case 's':
                    i4 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f18, f19);
                    f14 = f18;
                    f16 = f14;
                    f15 = f19;
                    f17 = f15;
                    break;
            }
            i4 = 2;
            float f20 = f18;
            float f21 = f19;
            float f22 = f14;
            float f23 = f15;
            int i10 = i9;
            while (i10 < fArr3.length) {
                if (c4 == 'A') {
                    fArr = fArr3;
                    i5 = i10;
                    eVar = eVar3;
                    float f24 = f22;
                    float f25 = f23;
                    i6 = i8;
                    c = c4;
                    int i11 = i5 + 5;
                    int i12 = i5 + 6;
                    a(path, f24, f25, fArr[i11], fArr[i12], fArr[i5], fArr[i5 + 1], fArr[i5 + 2], fArr[i5 + 3] != 0.0f ? 1 : i9, fArr[i5 + 4] != 0.0f ? 1 : i9);
                    f16 = fArr[i11];
                    f4 = fArr[i12];
                    f17 = f4;
                    f5 = f16;
                } else if (c4 == 'C') {
                    fArr = fArr3;
                    i5 = i10;
                    i6 = i8;
                    eVar = eVar3;
                    c = c4;
                    int i13 = i5 + 2;
                    int i14 = i5 + 3;
                    int i15 = i5 + 4;
                    int i16 = i5 + 5;
                    path2.cubicTo(fArr[i5], fArr[i5 + 1], fArr[i13], fArr[i14], fArr[i15], fArr[i16]);
                    float f26 = fArr[i15];
                    float f27 = fArr[i16];
                    f16 = fArr[i13];
                    f17 = fArr[i14];
                    f4 = f27;
                    f5 = f26;
                } else if (c4 == 'H') {
                    fArr = fArr3;
                    i5 = i10;
                    eVar = eVar3;
                    c = c4;
                    f4 = f23;
                    i6 = i8;
                    path2.lineTo(fArr[i5], f4);
                    f5 = fArr[i5];
                } else if (c4 == 'Q') {
                    fArr = fArr3;
                    i5 = i10;
                    i6 = i8;
                    eVar = eVar3;
                    c = c4;
                    int i17 = i5 + 1;
                    int i18 = i5 + 2;
                    int i19 = i5 + 3;
                    path2.quadTo(fArr[i5], fArr[i17], fArr[i18], fArr[i19]);
                    float f28 = fArr[i5];
                    float f29 = fArr[i17];
                    float f30 = fArr[i18];
                    float f31 = fArr[i19];
                    f16 = f28;
                    f17 = f29;
                    f5 = f30;
                    f4 = f31;
                } else if (c4 == 'V') {
                    fArr = fArr3;
                    i5 = i10;
                    i6 = i8;
                    eVar = eVar3;
                    f5 = f22;
                    c = c4;
                    path2.lineTo(f5, fArr[i5]);
                    f4 = fArr[i5];
                } else if (c4 != 'a') {
                    if (c4 == 'c') {
                        fArr = fArr3;
                        i5 = i10;
                        int i20 = i5 + 2;
                        int i21 = i5 + 3;
                        int i22 = i5 + 4;
                        int i23 = i5 + 5;
                        path2.rCubicTo(fArr[i5], fArr[i5 + 1], fArr[i20], fArr[i21], fArr[i22], fArr[i23]);
                        float f32 = fArr[i20] + f22;
                        float f33 = fArr[i21] + f23;
                        f22 += fArr[i22];
                        f23 += fArr[i23];
                        f16 = f32;
                        f17 = f33;
                    } else if (c4 != 'h') {
                        if (c4 != 'q') {
                            if (c4 != 'v') {
                                if (c4 == 'L') {
                                    fArr = fArr3;
                                    i5 = i10;
                                    int i24 = i5 + 1;
                                    path2.lineTo(fArr[i5], fArr[i24]);
                                    f5 = fArr[i5];
                                    f4 = fArr[i24];
                                } else if (c4 == 'M') {
                                    fArr = fArr3;
                                    i5 = i10;
                                    f5 = fArr[i5];
                                    f4 = fArr[i5 + 1];
                                    if (i5 > 0) {
                                        path2.lineTo(f5, f4);
                                    } else {
                                        path2.moveTo(f5, f4);
                                        f20 = f5;
                                        f21 = f4;
                                    }
                                } else if (c4 != 'S') {
                                    if (c4 == 'T') {
                                        fArr = fArr3;
                                        i5 = i10;
                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                            f22 = (f22 * 2.0f) - f16;
                                            f23 = (f23 * 2.0f) - f17;
                                        }
                                        int i25 = i5 + 1;
                                        path2.quadTo(f22, f23, fArr[i5], fArr[i25]);
                                        f5 = fArr[i5];
                                        f4 = fArr[i25];
                                        eVar = eVar3;
                                        f16 = f22;
                                        f17 = f23;
                                    } else if (c4 == 'l') {
                                        fArr = fArr3;
                                        i5 = i10;
                                        int i26 = i5 + 1;
                                        path2.rLineTo(fArr[i5], fArr[i26]);
                                        f22 += fArr[i5];
                                        f9 = fArr[i26];
                                    } else if (c4 == 'm') {
                                        fArr = fArr3;
                                        i5 = i10;
                                        float f34 = fArr[i5];
                                        f22 += f34;
                                        float f35 = fArr[i5 + 1];
                                        f23 += f35;
                                        if (i5 > 0) {
                                            path2.rLineTo(f34, f35);
                                        } else {
                                            path2.rMoveTo(f34, f35);
                                            eVar = eVar3;
                                            f5 = f22;
                                            f20 = f5;
                                            f4 = f23;
                                            f21 = f4;
                                        }
                                    } else if (c4 != 's') {
                                        if (c4 != 't') {
                                            fArr = fArr3;
                                            i5 = i10;
                                            eVar = eVar3;
                                            f5 = f22;
                                        } else {
                                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                f12 = f22 - f16;
                                                f13 = f23 - f17;
                                            } else {
                                                f13 = 0.0f;
                                                f12 = 0.0f;
                                            }
                                            int i27 = i10 + 1;
                                            path2.rQuadTo(f12, f13, fArr3[i10], fArr3[i27]);
                                            float f36 = f12 + f22;
                                            float f37 = f13 + f23;
                                            float f38 = f22 + fArr3[i10];
                                            f23 += fArr3[i27];
                                            f17 = f37;
                                            fArr = fArr3;
                                            i5 = i10;
                                            eVar = eVar3;
                                            f5 = f38;
                                            f16 = f36;
                                        }
                                        f4 = f23;
                                    } else {
                                        if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                            f10 = f23 - f17;
                                            f11 = f22 - f16;
                                        } else {
                                            f11 = 0.0f;
                                            f10 = 0.0f;
                                        }
                                        int i28 = i10;
                                        int i29 = i28 + 1;
                                        int i30 = i28 + 2;
                                        int i31 = i28 + 3;
                                        fArr = fArr3;
                                        i5 = i28;
                                        path2.rCubicTo(f11, f10, fArr3[i28], fArr3[i29], fArr3[i30], fArr3[i31]);
                                        f6 = fArr[i5] + f22;
                                        f7 = fArr[i29] + f23;
                                        f22 += fArr[i30];
                                        f8 = fArr[i31];
                                    }
                                    i6 = i8;
                                    c = c4;
                                } else {
                                    fArr = fArr3;
                                    i5 = i10;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f22 = (f22 * 2.0f) - f16;
                                        f23 = (f23 * 2.0f) - f17;
                                    }
                                    float f39 = f22;
                                    float f40 = f23;
                                    int i32 = i5 + 1;
                                    int i33 = i5 + 2;
                                    int i34 = i5 + 3;
                                    path2.cubicTo(f39, f40, fArr[i5], fArr[i32], fArr[i33], fArr[i34]);
                                    f16 = fArr[i5];
                                    f17 = fArr[i32];
                                    f5 = fArr[i33];
                                    f4 = fArr[i34];
                                }
                                i6 = i8;
                                eVar = eVar3;
                                c = c4;
                            } else {
                                fArr = fArr3;
                                i5 = i10;
                                path2.rLineTo(0.0f, fArr[i5]);
                                f9 = fArr[i5];
                            }
                            f23 += f9;
                        } else {
                            fArr = fArr3;
                            i5 = i10;
                            int i35 = i5 + 1;
                            int i36 = i5 + 2;
                            int i37 = i5 + 3;
                            path2.rQuadTo(fArr[i5], fArr[i35], fArr[i36], fArr[i37]);
                            f6 = fArr[i5] + f22;
                            f7 = fArr[i35] + f23;
                            f22 += fArr[i36];
                            f8 = fArr[i37];
                        }
                        f23 += f8;
                        f16 = f6;
                        f17 = f7;
                    } else {
                        fArr = fArr3;
                        i5 = i10;
                        path2.rLineTo(fArr[i5], 0.0f);
                        f22 += fArr[i5];
                    }
                    eVar = eVar3;
                    f5 = f22;
                    f4 = f23;
                    i6 = i8;
                    c = c4;
                } else {
                    fArr = fArr3;
                    i5 = i10;
                    int i38 = i5 + 5;
                    float f41 = fArr[i38] + f22;
                    int i39 = i5 + 6;
                    float f42 = fArr[i39] + f23;
                    float f43 = fArr[i5];
                    float f44 = fArr[i5 + 1];
                    float f45 = fArr[i5 + 2];
                    if (fArr[i5 + 3] != 0.0f) {
                        eVar2 = eVar3;
                        z4 = 1;
                    } else {
                        eVar2 = eVar3;
                        z4 = i9;
                    }
                    eVar = eVar2;
                    float f46 = f22;
                    c = c4;
                    float f47 = f23;
                    i6 = i8;
                    a(path, f46, f47, f41, f42, f43, f44, f45, z4, fArr[i5 + 4] != 0.0f ? 1 : i9);
                    f5 = f46 + fArr[i38];
                    f4 = f47 + fArr[i39];
                    f16 = f5;
                    f17 = f4;
                }
                i10 = i5 + i4;
                path2 = path;
                eVar3 = eVar;
                c4 = c;
                i8 = i6;
                f22 = f5;
                f23 = f4;
                c2 = c4;
                fArr3 = fArr;
            }
            fArr2[i9] = f22;
            fArr2[1] = f23;
            fArr2[2] = f16;
            fArr2[3] = f17;
            fArr2[4] = f20;
            fArr2[5] = f21;
            c2 = eVar3.f3a;
            i8++;
            eVarArr2 = eVarArr;
            path2 = path;
            i7 = i9;
        }
    }
}
