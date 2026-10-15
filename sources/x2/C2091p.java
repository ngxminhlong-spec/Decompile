package x2;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2091p {

    /* renamed from: a, reason: collision with root package name */
    public final String f15752a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15753b;
    public final long c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15754e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15755f;

    /* renamed from: g, reason: collision with root package name */
    public final long f15756g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f15757h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f15758i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f15759j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f15760k;

    public C2091p(String str, String str2, long j4, long j5, long j6, long j7, long j8, Long l4, Long l5, Long l6, Boolean bool) {
        h2.y.e(str);
        h2.y.e(str2);
        h2.y.b(j4 >= 0);
        h2.y.b(j5 >= 0);
        h2.y.b(j6 >= 0);
        h2.y.b(j8 >= 0);
        this.f15752a = str;
        this.f15753b = str2;
        this.c = j4;
        this.d = j5;
        this.f15754e = j6;
        this.f15755f = j7;
        this.f15756g = j8;
        this.f15757h = l4;
        this.f15758i = l5;
        this.f15759j = l6;
        this.f15760k = bool;
    }

    public final C2091p a(Long l4, Long l5, Boolean bool) {
        return new C2091p(this.f15752a, this.f15753b, this.c, this.d, this.f15754e, this.f15755f, this.f15756g, this.f15757h, l4, l5, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public final C2091p b(long j4) {
        return new C2091p(this.f15752a, this.f15753b, this.c, this.d, this.f15754e, j4, this.f15756g, this.f15757h, this.f15758i, this.f15759j, this.f15760k);
    }
}
