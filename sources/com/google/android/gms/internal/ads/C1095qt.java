package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.qt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1095qt extends AbstractC1137rt {

    /* renamed from: q, reason: collision with root package name */
    public final transient int f10421q;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f10422r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC1137rt f10423s;

    public C1095qt(AbstractC1137rt abstractC1137rt, int i4, int i5) {
        this.f10423s = abstractC1137rt;
        this.f10421q = i4;
        this.f10422r = i5;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        Bs.l(i4, this.f10422r);
        return this.f10423s.get(i4 + this.f10421q);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final int i() {
        return this.f10423s.j() + this.f10421q + this.f10422r;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final int j() {
        return this.f10423s.j() + this.f10421q;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final boolean n() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0923mt
    public final Object[] o() {
        return this.f10423s.o();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1137rt, java.util.List
    /* renamed from: p */
    public final AbstractC1137rt subList(int i4, int i5) {
        Bs.i0(i4, i5, this.f10422r);
        int i6 = this.f10421q;
        return this.f10423s.subList(i4 + i6, i5 + i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10422r;
    }
}
