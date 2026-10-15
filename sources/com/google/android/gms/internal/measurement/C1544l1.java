package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1544l1 extends AbstractC1548m1 {

    /* renamed from: o, reason: collision with root package name */
    public static final C1544l1 f11964o = new Object();

    @Override // com.google.android.gms.internal.measurement.AbstractC1548m1
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1548m1
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
