package com.google.android.gms.internal.play_billing;

import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1607d extends AbstractC1609e {

    /* renamed from: q, reason: collision with root package name */
    public final transient int f12195q;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f12196r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC1609e f12197s;

    public C1607d(AbstractC1609e abstractC1609e, int i4, int i5) {
        this.f12197s = abstractC1609e;
        this.f12195q = i4;
        this.f12196r = i5;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC1895f.E(i4, this.f12196r);
        return this.f12197s.get(i4 + this.f12195q);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1603b
    public final int i() {
        return this.f12197s.j() + this.f12195q + this.f12196r;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1603b
    public final int j() {
        return this.f12197s.j() + this.f12195q;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1603b
    public final Object[] k() {
        return this.f12197s.k();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1609e, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final AbstractC1609e subList(int i4, int i5) {
        AbstractC1895f.J(i4, i5, this.f12196r);
        int i6 = this.f12195q;
        return this.f12197s.subList(i4 + i6, i5 + i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12196r;
    }
}
