package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.nE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0945nE extends AbstractC0816kE {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f9728e = new Object();
    public final Object c;
    public final Object d;

    public C0945nE(AbstractC0484ch abstractC0484ch, Object obj, Object obj2) {
        super(abstractC0484ch);
        this.c = obj;
        this.d = obj2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0816kE, com.google.android.gms.internal.ads.AbstractC0484ch
    public final int a(Object obj) {
        Object obj2;
        if (f9728e.equals(obj) && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.f9283b.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0816kE, com.google.android.gms.internal.ads.AbstractC0484ch
    public final C1210tg d(int i4, C1210tg c1210tg, boolean z4) {
        this.f9283b.d(i4, c1210tg, z4);
        if (AbstractC0751is.c(c1210tg.f10712b, this.d) && z4) {
            c1210tg.f10712b = f9728e;
        }
        return c1210tg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0816kE, com.google.android.gms.internal.ads.AbstractC0484ch
    public final Rg e(int i4, Rg rg, long j4) {
        this.f9283b.e(i4, rg, j4);
        if (AbstractC0751is.c(rg.f6816a, this.c)) {
            rg.f6816a = Rg.f6814n;
        }
        return rg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0816kE, com.google.android.gms.internal.ads.AbstractC0484ch
    public final Object f(int i4) {
        Object f4 = this.f9283b.f(i4);
        return AbstractC0751is.c(f4, this.d) ? f9728e : f4;
    }
}
