package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1513f implements InterfaceC1550n {

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC1550n f11929o;

    /* renamed from: p, reason: collision with root package name */
    public final String f11930p;

    public C1513f(String str) {
        this.f11929o = InterfaceC1550n.f11977e;
        this.f11930p = str;
    }

    public C1513f(String str, InterfaceC1550n interfaceC1550n) {
        this.f11929o = interfaceC1550n;
        this.f11930p = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1513f)) {
            return false;
        }
        C1513f c1513f = (C1513f) obj;
        return this.f11930p.equals(c1513f.f11930p) && this.f11929o.equals(c1513f.f11929o);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Double f() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final String g() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Boolean h() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final int hashCode() {
        return this.f11929o.hashCode() + (this.f11930p.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final InterfaceC1550n i() {
        return new C1513f(this.f11930p, this.f11929o.i());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Iterator l() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final InterfaceC1550n n(String str, u0.g gVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }
}
