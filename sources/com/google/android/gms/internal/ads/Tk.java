package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Tk extends H1.b {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f7067o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ H1.g f7068p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f7069q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Vk f7070r;

    public Tk(Vk vk, String str, H1.g gVar, String str2) {
        this.f7070r = vk;
        this.f7067o = str;
        this.f7068p = gVar;
        this.f7069q = str2;
    }

    @Override // H1.b
    public final void b(H1.j jVar) {
        this.f7070r.P3(Vk.O3(jVar), this.f7069q);
    }

    @Override // H1.b
    public final void e() {
        this.f7070r.K3(this.f7068p, this.f7067o, this.f7069q);
    }
}
