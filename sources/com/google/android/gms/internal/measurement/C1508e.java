package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1508e implements InterfaceC1550n {

    /* renamed from: o, reason: collision with root package name */
    public final boolean f11906o;

    public C1508e(Boolean bool) {
        this.f11906o = bool == null ? false : bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1508e) && this.f11906o == ((C1508e) obj).f11906o;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Double f() {
        return Double.valueOf(true != this.f11906o ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final String g() {
        return Boolean.toString(this.f11906o);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Boolean h() {
        return Boolean.valueOf(this.f11906o);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f11906o).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final InterfaceC1550n i() {
        return new C1508e(Boolean.valueOf(this.f11906o));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Iterator l() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final InterfaceC1550n n(String str, u0.g gVar, ArrayList arrayList) {
        boolean equals = "toString".equals(str);
        boolean z4 = this.f11906o;
        if (equals) {
            return new C1562q(Boolean.toString(z4));
        }
        throw new IllegalArgumentException(Boolean.toString(z4) + "." + str + " is not a function.");
    }

    public final String toString() {
        return String.valueOf(this.f11906o);
    }
}
