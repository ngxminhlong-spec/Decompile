package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1567r1 implements Serializable, InterfaceC1556o1 {

    /* renamed from: o, reason: collision with root package name */
    public final Object f12010o;

    public C1567r1(Object obj) {
        this.f12010o = obj;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1556o1
    public final Object b() {
        return this.f12010o;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1567r1)) {
            return false;
        }
        Object obj2 = ((C1567r1) obj).f12010o;
        Object obj3 = this.f12010o;
        return obj3 == obj2 || obj3.equals(obj2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12010o});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f12010o + ")";
    }
}
