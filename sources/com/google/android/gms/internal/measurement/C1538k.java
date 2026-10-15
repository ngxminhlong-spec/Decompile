package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1538k implements InterfaceC1550n, InterfaceC1533j {

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f11957o = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC1533j
    public final boolean K(String str) {
        return this.f11957o.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1538k) {
            return this.f11957o.equals(((C1538k) obj).f11957o);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final String g() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Boolean h() {
        return Boolean.TRUE;
    }

    public final int hashCode() {
        return this.f11957o.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final InterfaceC1550n i() {
        C1538k c1538k = new C1538k();
        for (Map.Entry entry : this.f11957o.entrySet()) {
            boolean z4 = entry.getValue() instanceof InterfaceC1533j;
            HashMap hashMap = c1538k.f11957o;
            if (z4) {
                hashMap.put((String) entry.getKey(), (InterfaceC1550n) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((InterfaceC1550n) entry.getValue()).i());
            }
        }
        return c1538k;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1533j
    public final InterfaceC1550n j(String str) {
        HashMap hashMap = this.f11957o;
        return hashMap.containsKey(str) ? (InterfaceC1550n) hashMap.get(str) : InterfaceC1550n.f11977e;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1533j
    public final void k(String str, InterfaceC1550n interfaceC1550n) {
        HashMap hashMap = this.f11957o;
        if (interfaceC1550n == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, interfaceC1550n);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Iterator l() {
        return new C1528i(this.f11957o.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public InterfaceC1550n n(String str, u0.g gVar, ArrayList arrayList) {
        return "toString".equals(str) ? new C1562q(toString()) : AbstractC1515f1.c(this, new C1562q(str), gVar, arrayList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap hashMap = this.f11957o;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(String.format("%s: %s,", str, hashMap.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
