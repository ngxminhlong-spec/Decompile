package com.google.android.gms.internal.play_billing;

import java.util.Objects;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1615h extends AbstractC1609e {

    /* renamed from: s, reason: collision with root package name */
    public static final C1615h f12205s = new C1615h(0, new Object[0]);

    /* renamed from: q, reason: collision with root package name */
    public final transient Object[] f12206q;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f12207r;

    public C1615h(int i4, Object[] objArr) {
        this.f12206q = objArr;
        this.f12207r = i4;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC1895f.E(i4, this.f12207r);
        Object obj = this.f12206q[i4];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1609e, com.google.android.gms.internal.play_billing.AbstractC1603b
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f12206q;
        int i4 = this.f12207r;
        System.arraycopy(objArr2, 0, objArr, 0, i4);
        return i4;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1603b
    public final int i() {
        return this.f12207r;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1603b
    public final int j() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1603b
    public final Object[] k() {
        return this.f12206q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12207r;
    }
}
