package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.gp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0663gp implements As {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0.g f8870b;

    public /* synthetic */ C0663gp(u0.g gVar, int i4) {
        this.f8869a = i4;
        this.f8870b = gVar;
    }

    @Override // com.google.android.gms.internal.ads.As
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        switch (this.f8869a) {
            case 0:
                Y9.q("", (C1001ol) obj);
                Q1.I.w("Failed to get a cache key, reverting to legacy flow.");
                u0.g gVar = this.f8870b;
                C0706hp c0706hp = new C0706hp(null, gVar.D());
                gVar.f14986s = c0706hp;
                return c0706hp;
            default:
                C0370Za c0370Za = (C0370Za) obj;
                C0706hp c0706hp2 = new C0706hp(c0370Za, new C0451bq(c0370Za.f7998x));
                this.f8870b.f14986s = c0706hp2;
                return c0706hp2;
        }
    }
}
