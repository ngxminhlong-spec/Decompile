package com.google.android.gms.internal.play_billing;

import java.util.Objects;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1623l extends AbstractC1609e {

    /* renamed from: q, reason: collision with root package name */
    public final transient Object[] f12221q;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f12222r;

    /* renamed from: s, reason: collision with root package name */
    public final transient int f12223s;

    public C1623l(Object[] objArr, int i4, int i5) {
        this.f12221q = objArr;
        this.f12222r = i4;
        this.f12223s = i5;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        AbstractC1895f.E(i4, this.f12223s);
        Object obj = this.f12221q[i4 + i4 + this.f12222r];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12223s;
    }
}
