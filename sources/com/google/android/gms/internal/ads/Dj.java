package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Dj {

    /* renamed from: a, reason: collision with root package name */
    public final Gg f4774a;

    /* renamed from: b, reason: collision with root package name */
    public final Vg f4775b;
    public final C0527dh c;
    public final C0655gh d;

    /* renamed from: e, reason: collision with root package name */
    public final C1254uh f4776e;

    /* renamed from: f, reason: collision with root package name */
    public final Rh f4777f;

    public Dj(Gg gg, Vg vg, C0527dh c0527dh, C0655gh c0655gh, C1254uh c1254uh, Rh rh) {
        this.f4774a = gg;
        this.f4775b = vg;
        this.c = c0527dh;
        this.d = c0655gh;
        this.f4776e = c1254uh;
        this.f4777f = rh;
    }

    public final void a(Ej ej) {
        Vg vg = this.f4775b;
        Cj cj = ej.f4914a;
        vg.getClass();
        C1342wj c1342wj = new C1342wj(1, vg);
        Rh rh = this.f4777f;
        Gg gg = this.f4774a;
        C0527dh c0527dh = this.c;
        C0655gh c0655gh = this.d;
        C1254uh c1254uh = this.f4776e;
        synchronized (cj) {
            cj.a(gg, c0527dh, c0655gh, c1254uh, c1342wj);
            cj.f4524t = rh;
        }
    }
}
