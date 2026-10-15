package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1560p1 implements Serializable, InterfaceC1556o1 {

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC1556o1 f11999o;

    /* renamed from: p, reason: collision with root package name */
    public volatile transient boolean f12000p;

    /* renamed from: q, reason: collision with root package name */
    public transient Object f12001q;

    public C1560p1(InterfaceC1556o1 interfaceC1556o1) {
        this.f11999o = interfaceC1556o1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1556o1
    public final Object b() {
        if (!this.f12000p) {
            synchronized (this) {
                try {
                    if (!this.f12000p) {
                        Object b4 = this.f11999o.b();
                        this.f12001q = b4;
                        this.f12000p = true;
                        return b4;
                    }
                } finally {
                }
            }
        }
        return this.f12001q;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f12000p) {
            obj = "<supplier that returned " + this.f12001q + ">";
        } else {
            obj = this.f11999o;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
