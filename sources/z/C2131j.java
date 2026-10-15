package z;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: z.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2131j {

    /* renamed from: k, reason: collision with root package name */
    public static final C2131j f15937k;

    /* renamed from: a, reason: collision with root package name */
    public final float f15938a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15939b;
    public final float c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15940e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15941f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f15942g;

    /* renamed from: h, reason: collision with root package name */
    public final float f15943h;

    /* renamed from: i, reason: collision with root package name */
    public final float f15944i;

    /* renamed from: j, reason: collision with root package name */
    public final float f15945j;

    static {
        float m4 = (float) ((AbstractC2123b.m() * 63.66197723675813d) / 100.0d);
        float[] fArr = AbstractC2123b.c;
        float f4 = fArr[0];
        float[][] fArr2 = AbstractC2123b.f15924a;
        float[] fArr3 = fArr2[0];
        float f5 = fArr3[0] * f4;
        float f6 = fArr[1];
        float f7 = (fArr3[1] * f6) + f5;
        float f8 = fArr[2];
        float f9 = (fArr3[2] * f8) + f7;
        float[] fArr4 = fArr2[1];
        float f10 = (fArr4[2] * f8) + (fArr4[1] * f6) + (fArr4[0] * f4);
        float[] fArr5 = fArr2[2];
        float f11 = (f8 * fArr5[2]) + (f6 * fArr5[1]) + (f4 * fArr5[0]);
        float f12 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-m4) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float f13 = 1.0f / ((5.0f * m4) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float cbrt = (0.1f * f15 * f15 * ((float) Math.cbrt(m4 * 5.0d))) + (f14 * m4);
        float m5 = AbstractC2123b.m() / fArr[1];
        double d4 = m5;
        float sqrt = ((float) Math.sqrt(d4)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d4, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * cbrt) * f9) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * cbrt) * f10) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * cbrt) * f11) / 100.0d, 0.42d)};
        float f16 = fArr6[0];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr6[1];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr6[2];
        float[] fArr7 = {f17, f19, (400.0f * f20) / (f20 + 27.13f)};
        f15937k = new C2131j(m5, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f12, 1.0f, new float[]{(((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp, (((100.0f / f11) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public C2131j(float f4, float f5, float f6, float f7, float f8, float f9, float[] fArr, float f10, float f11, float f12) {
        this.f15941f = f4;
        this.f15938a = f5;
        this.f15939b = f6;
        this.c = f7;
        this.d = f8;
        this.f15940e = f9;
        this.f15942g = fArr;
        this.f15943h = f10;
        this.f15944i = f11;
        this.f15945j = f12;
    }
}
