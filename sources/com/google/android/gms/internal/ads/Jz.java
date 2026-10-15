package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Jz extends AbstractList {

    /* renamed from: o, reason: collision with root package name */
    public final List f5950o;

    public Jz(List list) {
        this.f5950o = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        EnumC1279v5 a4 = EnumC1279v5.a(((Integer) this.f5950o.get(i4)).intValue());
        return a4 == null ? EnumC1279v5.f10983p : a4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5950o.size();
    }
}
