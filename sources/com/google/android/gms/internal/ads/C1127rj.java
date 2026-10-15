package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1127rj implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10497a;

    /* renamed from: b, reason: collision with root package name */
    public final C0654gg f10498b;
    public final Eo c;
    public final Lf d;

    public /* synthetic */ C1127rj(C0654gg c0654gg, Eo eo, Lf lf, int i4) {
        this.f10497a = i4;
        this.f10498b = c0654gg;
        this.c = eo;
        this.d = lf;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f10497a) {
            case 0:
                return new BinderC1085qj((String) this.f10498b.f8840b.f6527r, (C1427yi) this.c.c(), this.d.a());
            default:
                return new BinderC1170sj((String) this.f10498b.f8840b.f6527r, (C1427yi) this.c.c(), this.d.a());
        }
    }
}
