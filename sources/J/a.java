package J;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f924a;

    /* renamed from: b, reason: collision with root package name */
    public int f925b;
    public float c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public long f926e;

    /* renamed from: f, reason: collision with root package name */
    public long f927f;

    /* renamed from: g, reason: collision with root package name */
    public long f928g;

    /* renamed from: h, reason: collision with root package name */
    public float f929h;

    /* renamed from: i, reason: collision with root package name */
    public int f930i;

    public final float a(long j4) {
        long j5 = this.f926e;
        if (j4 < j5) {
            return 0.0f;
        }
        long j6 = this.f928g;
        if (j6 < 0 || j4 < j6) {
            return e.b(((float) (j4 - j5)) / this.f924a, 0.0f, 1.0f) * 0.5f;
        }
        float f4 = this.f929h;
        return (e.b(((float) (j4 - j6)) / this.f930i, 0.0f, 1.0f) * f4) + (1.0f - f4);
    }
}
