package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class C1 {

    /* renamed from: b, reason: collision with root package name */
    public V f4216b;
    public D c;
    public A1 d;

    /* renamed from: e, reason: collision with root package name */
    public long f4217e;

    /* renamed from: f, reason: collision with root package name */
    public long f4218f;

    /* renamed from: g, reason: collision with root package name */
    public long f4219g;

    /* renamed from: h, reason: collision with root package name */
    public int f4220h;

    /* renamed from: i, reason: collision with root package name */
    public int f4221i;

    /* renamed from: k, reason: collision with root package name */
    public long f4223k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4224l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4225m;

    /* renamed from: a, reason: collision with root package name */
    public final C1404y1 f4215a = new C1404y1();

    /* renamed from: j, reason: collision with root package name */
    public C0783ji f4222j = new C0783ji(14);

    public abstract long a(C1134rq c1134rq);

    public void b(boolean z4) {
        int i4;
        if (z4) {
            this.f4222j = new C0783ji(14);
            this.f4218f = 0L;
            i4 = 0;
        } else {
            i4 = 1;
        }
        this.f4220h = i4;
        this.f4217e = -1L;
        this.f4219g = 0L;
    }

    public abstract boolean c(C1134rq c1134rq, long j4, C0783ji c0783ji);

    public void d(long j4) {
        this.f4219g = j4;
    }
}
