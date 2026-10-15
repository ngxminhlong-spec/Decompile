package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1552n1 extends AbstractC1548m1 {

    /* renamed from: o, reason: collision with root package name */
    public final Object f11985o;

    public C1552n1(Object obj) {
        this.f11985o = obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1548m1
    public final Object a() {
        return this.f11985o;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1548m1
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1552n1) {
            return this.f11985o.equals(((C1552n1) obj).f11985o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11985o.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f11985o + ")";
    }
}
