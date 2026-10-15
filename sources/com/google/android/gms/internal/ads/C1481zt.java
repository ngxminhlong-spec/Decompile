package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.zt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1481zt extends AbstractSequentialList implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public final Jz f11695o;

    public C1481zt(Jz jz) {
        this.f11695o = jz;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ListIterator, com.google.android.gms.internal.ads.St] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        return new St(this.f11695o.listIterator(i4));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        this.f11695o.subList(i4, i5).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11695o.f5950o.size();
    }
}
