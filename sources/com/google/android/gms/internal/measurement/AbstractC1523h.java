package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1523h implements InterfaceC1550n, InterfaceC1533j {

    /* renamed from: o, reason: collision with root package name */
    public final String f11938o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f11939p = new HashMap();

    public AbstractC1523h(String str) {
        this.f11938o = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1533j
    public final boolean K(String str) {
        return this.f11939p.containsKey(str);
    }

    public abstract InterfaceC1550n a(u0.g gVar, List list);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1523h)) {
            return false;
        }
        AbstractC1523h abstractC1523h = (AbstractC1523h) obj;
        String str = this.f11938o;
        if (str != null) {
            return str.equals(abstractC1523h.f11938o);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final String g() {
        return this.f11938o;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Boolean h() {
        return Boolean.TRUE;
    }

    public final int hashCode() {
        String str = this.f11938o;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public InterfaceC1550n i() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1533j
    public final InterfaceC1550n j(String str) {
        HashMap hashMap = this.f11939p;
        return hashMap.containsKey(str) ? (InterfaceC1550n) hashMap.get(str) : InterfaceC1550n.f11977e;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1533j
    public final void k(String str, InterfaceC1550n interfaceC1550n) {
        HashMap hashMap = this.f11939p;
        if (interfaceC1550n == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, interfaceC1550n);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Iterator l() {
        return new C1528i(this.f11939p.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final InterfaceC1550n n(String str, u0.g gVar, ArrayList arrayList) {
        return "toString".equals(str) ? new C1562q(this.f11938o) : AbstractC1515f1.c(this, new C1562q(str), gVar, arrayList);
    }
}
