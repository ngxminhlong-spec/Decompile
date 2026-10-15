package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1621k extends AbstractC1613g {

    /* renamed from: q, reason: collision with root package name */
    public final transient C1625m f12219q;

    /* renamed from: r, reason: collision with root package name */
    public final transient C1623l f12220r;

    public C1621k(C1625m c1625m, C1623l c1623l) {
        this.f12219q = c1625m;
        this.f12220r = c1623l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f12219q.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1603b
    public final int h(Object[] objArr) {
        return this.f12220r.h(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f12220r.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12219q.f12232t;
    }
}
