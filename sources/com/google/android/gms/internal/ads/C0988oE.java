package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.oE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0988oE extends AbstractC0484ch {

    /* renamed from: b, reason: collision with root package name */
    public final Z9 f9831b;

    public C0988oE(Z9 z9) {
        this.f9831b = z9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final int a(Object obj) {
        return obj == C0945nE.f9728e ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final int b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final C1210tg d(int i4, C1210tg c1210tg, boolean z4) {
        Integer num = z4 ? 0 : null;
        Object obj = z4 ? C0945nE.f9728e : null;
        C0442bh c0442bh = C0442bh.f8264b;
        c1210tg.b(0, -9223372036854775807L, num, obj, true);
        return c1210tg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final Rg e(int i4, Rg rg, long j4) {
        Object obj = Rg.f6814n;
        rg.a(this.f9831b, false, true, null, -9223372036854775807L);
        rg.f6823j = true;
        return rg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final Object f(int i4) {
        return C0945nE.f9728e;
    }
}
