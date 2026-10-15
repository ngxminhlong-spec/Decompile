package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1554o implements InterfaceC1550n {

    /* renamed from: o, reason: collision with root package name */
    public final String f11990o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f11991p;

    public C1554o(String str, ArrayList arrayList) {
        this.f11990o = str;
        ArrayList arrayList2 = new ArrayList();
        this.f11991p = arrayList2;
        arrayList2.addAll(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1554o)) {
            return false;
        }
        C1554o c1554o = (C1554o) obj;
        String str = c1554o.f11990o;
        String str2 = this.f11990o;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.f11991p.equals(c1554o.f11991p);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Double f() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final String g() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Boolean h() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final int hashCode() {
        String str = this.f11990o;
        return this.f11991p.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final InterfaceC1550n i() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Iterator l() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final InterfaceC1550n n(String str, u0.g gVar, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
