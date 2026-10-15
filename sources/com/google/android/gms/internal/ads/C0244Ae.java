package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Ae, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244Ae {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3963a;

    /* renamed from: b, reason: collision with root package name */
    public final C1423ye f3964b;
    public C0919mp c;
    public C0492cp d;

    /* renamed from: e, reason: collision with root package name */
    public Dh f3965e;

    /* renamed from: f, reason: collision with root package name */
    public C1468zg f3966f;

    public /* synthetic */ C0244Ae(C1423ye c1423ye, int i4) {
        this.f3963a = i4;
        this.f3964b = c1423ye;
    }

    public C0250Be a() {
        AbstractC0587ez.p(this.f3965e, Dh.class);
        AbstractC0587ez.p(this.f3966f, C1468zg.class);
        return new C0250Be(this.f3964b, this.f3965e, this.f3966f, new Xj(7, false), this.c, this.d);
    }

    public C0289Ie b() {
        AbstractC0587ez.p(this.f3965e, Dh.class);
        AbstractC0587ez.p(this.f3966f, C1468zg.class);
        return new C0289Ie(this.f3964b, this.f3965e, this.f3966f, new Xj(7, false), this.c, this.d);
    }

    public final /* bridge */ Object c() {
        switch (this.f3963a) {
            case 0:
                return a();
            default:
                return b();
        }
    }
}
