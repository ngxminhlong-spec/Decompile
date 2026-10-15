package z;

import android.graphics.Color;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2122a {

    /* renamed from: a, reason: collision with root package name */
    public final float f15920a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15921b;
    public final float c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15922e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15923f;

    public C2122a(float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f15920a = f4;
        this.f15921b = f5;
        this.c = f6;
        this.d = f7;
        this.f15922e = f8;
        this.f15923f = f9;
    }

    public static C2122a a(int i4) {
        C2131j c2131j = C2131j.f15937k;
        float f4 = AbstractC2123b.f(Color.red(i4));
        float f5 = AbstractC2123b.f(Color.green(i4));
        float f6 = AbstractC2123b.f(Color.blue(i4));
        float[][] fArr = AbstractC2123b.d;
        float[] fArr2 = fArr[0];
        float f7 = (fArr2[2] * f6) + (fArr2[1] * f5) + (fArr2[0] * f4);
        float[] fArr3 = fArr[1];
        float f8 = (fArr3[2] * f6) + (fArr3[1] * f5) + (fArr3[0] * f4);
        float[] fArr4 = fArr[2];
        float f9 = (f6 * fArr4[2]) + (f5 * fArr4[1]) + (f4 * fArr4[0]);
        float[][] fArr5 = AbstractC2123b.f15924a;
        float[] fArr6 = fArr5[0];
        float f10 = (fArr6[2] * f9) + (fArr6[1] * f8) + (fArr6[0] * f7);
        float[] fArr7 = fArr5[1];
        float f11 = (fArr7[2] * f9) + (fArr7[1] * f8) + (fArr7[0] * f7);
        float[] fArr8 = fArr5[2];
        float f12 = (f9 * fArr8[2]) + (f8 * fArr8[1]) + (f7 * fArr8[0]);
        float[] fArr9 = c2131j.f15942g;
        float f13 = c2131j.f15944i;
        float f14 = c2131j.d;
        float f15 = c2131j.f15938a;
        float f16 = fArr9[0] * f10;
        float f17 = fArr9[1] * f11;
        float f18 = fArr9[2] * f12;
        float f19 = c2131j.f15943h;
        float pow = (float) Math.pow((Math.abs(f16) * f19) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f17) * f19) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f18) * f19) / 100.0d, 0.42d);
        float signum = ((Math.signum(f16) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f17) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f18) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float f20 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f21 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f22 = signum2 * 20.0f;
        float f23 = ((21.0f * signum3) + ((signum * 20.0f) + f22)) / 20.0f;
        float f24 = (((signum * 40.0f) + f22) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f21, f20)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f25 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f24 * c2131j.f15939b) / f15, c2131j.f15945j * f14)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f26 = f15 + 4.0f;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c2131j.f15941f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c2131j.f15940e) * c2131j.c) * ((float) Math.sqrt((f21 * f21) + (f20 * f20)))) / (f23 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        Math.sqrt((r0 * f14) / f26);
        float f27 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f13 * pow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d4 = f25;
        return new C2122a(atan2, pow5, pow4, f27, log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    public static C2122a b(float f4, float f5, float f6) {
        C2131j c2131j = C2131j.f15937k;
        float f7 = c2131j.d;
        Math.sqrt(f4 / 100.0d);
        float f8 = c2131j.f15938a + 4.0f;
        float f9 = c2131j.f15944i * f5;
        Math.sqrt(((f5 / ((float) Math.sqrt(r1))) * c2131j.d) / f8);
        float f10 = (1.7f * f4) / ((0.007f * f4) + 1.0f);
        float log = ((float) Math.log((f9 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f6) / 180.0f;
        return new C2122a(f6, f5, f4, f10, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    public final int c(C2131j c2131j) {
        float f4;
        float f5 = this.f15921b;
        double d = f5;
        float f6 = this.c;
        if (d != 0.0d) {
            double d4 = f6;
            if (d4 != 0.0d) {
                f4 = f5 / ((float) Math.sqrt(d4 / 100.0d));
                float f7 = c2131j.f15941f;
                float f8 = c2131j.f15943h;
                float pow = (float) Math.pow(f4 / Math.pow(1.64d - Math.pow(0.29d, f7), 0.73d), 1.1111111111111112d);
                double d5 = (this.f15920a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d5) + 3.8d)) * 0.25f;
                float pow2 = c2131j.f15938a * ((float) Math.pow(f6 / 100.0d, (1.0d / c2131j.d) / c2131j.f15945j));
                float f9 = cos * 3846.1538f * c2131j.f15940e * c2131j.c;
                float f10 = pow2 / c2131j.f15939b;
                float sin = (float) Math.sin(d5);
                float cos2 = (float) Math.cos(d5);
                float f11 = (((0.305f + f10) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f9 * 23.0f)));
                float f12 = cos2 * f11;
                float f13 = f11 * sin;
                float f14 = f10 * 460.0f;
                float f15 = ((288.0f * f13) + ((451.0f * f12) + f14)) / 1403.0f;
                float f16 = ((f14 - (891.0f * f12)) - (261.0f * f13)) / 1403.0f;
                float f17 = ((f14 - (f12 * 220.0f)) - (f13 * 6300.0f)) / 1403.0f;
                float f18 = 100.0f / f8;
                float signum = Math.signum(f15) * f18 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f15) * 27.13d) / (400.0d - Math.abs(f15))), 2.380952380952381d));
                float signum2 = Math.signum(f16) * f18 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f16) * 27.13d) / (400.0d - Math.abs(f16))), 2.380952380952381d));
                float signum3 = Math.signum(f17) * f18 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f17) * 27.13d) / (400.0d - Math.abs(f17))), 2.380952380952381d));
                float[] fArr = c2131j.f15942g;
                float f19 = signum / fArr[0];
                float f20 = signum2 / fArr[1];
                float f21 = signum3 / fArr[2];
                float[][] fArr2 = AbstractC2123b.f15925b;
                float[] fArr3 = fArr2[0];
                float f22 = (fArr3[2] * f21) + (fArr3[1] * f20) + (fArr3[0] * f19);
                float[] fArr4 = fArr2[1];
                float f23 = (fArr4[2] * f21) + (fArr4[1] * f20) + (fArr4[0] * f19);
                float[] fArr5 = fArr2[2];
                return A.a.a(f22, f23, (f21 * fArr5[2]) + (f20 * fArr5[1]) + (f19 * fArr5[0]));
            }
        }
        f4 = 0.0f;
        float f72 = c2131j.f15941f;
        float f82 = c2131j.f15943h;
        float pow3 = (float) Math.pow(f4 / Math.pow(1.64d - Math.pow(0.29d, f72), 0.73d), 1.1111111111111112d);
        double d52 = (this.f15920a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d52) + 3.8d)) * 0.25f;
        float pow22 = c2131j.f15938a * ((float) Math.pow(f6 / 100.0d, (1.0d / c2131j.d) / c2131j.f15945j));
        float f92 = cos3 * 3846.1538f * c2131j.f15940e * c2131j.c;
        float f102 = pow22 / c2131j.f15939b;
        float sin2 = (float) Math.sin(d52);
        float cos22 = (float) Math.cos(d52);
        float f112 = (((0.305f + f102) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (f92 * 23.0f)));
        float f122 = cos22 * f112;
        float f132 = f112 * sin2;
        float f142 = f102 * 460.0f;
        float f152 = ((288.0f * f132) + ((451.0f * f122) + f142)) / 1403.0f;
        float f162 = ((f142 - (891.0f * f122)) - (261.0f * f132)) / 1403.0f;
        float f172 = ((f142 - (f122 * 220.0f)) - (f132 * 6300.0f)) / 1403.0f;
        float f182 = 100.0f / f82;
        float signum4 = Math.signum(f152) * f182 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f152) * 27.13d) / (400.0d - Math.abs(f152))), 2.380952380952381d));
        float signum22 = Math.signum(f162) * f182 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f162) * 27.13d) / (400.0d - Math.abs(f162))), 2.380952380952381d));
        float signum32 = Math.signum(f172) * f182 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f172) * 27.13d) / (400.0d - Math.abs(f172))), 2.380952380952381d));
        float[] fArr6 = c2131j.f15942g;
        float f192 = signum4 / fArr6[0];
        float f202 = signum22 / fArr6[1];
        float f212 = signum32 / fArr6[2];
        float[][] fArr22 = AbstractC2123b.f15925b;
        float[] fArr32 = fArr22[0];
        float f222 = (fArr32[2] * f212) + (fArr32[1] * f202) + (fArr32[0] * f192);
        float[] fArr42 = fArr22[1];
        float f232 = (fArr42[2] * f212) + (fArr42[1] * f202) + (fArr42[0] * f192);
        float[] fArr52 = fArr22[2];
        return A.a.a(f222, f232, (f212 * fArr52[2]) + (f202 * fArr52[1]) + (f192 * fArr52[0]));
    }
}
