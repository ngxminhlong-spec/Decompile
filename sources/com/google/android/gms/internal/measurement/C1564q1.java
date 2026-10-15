package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1564q1 implements InterfaceC1556o1 {

    /* renamed from: o, reason: collision with root package name */
    public volatile InterfaceC1556o1 f12004o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f12005p;

    /* renamed from: q, reason: collision with root package name */
    public Object f12006q;

    @Override // com.google.android.gms.internal.measurement.InterfaceC1556o1
    public final Object b() {
        if (!this.f12005p) {
            synchronized (this) {
                try {
                    if (!this.f12005p) {
                        InterfaceC1556o1 interfaceC1556o1 = this.f12004o;
                        interfaceC1556o1.getClass();
                        Object b4 = interfaceC1556o1.b();
                        this.f12006q = b4;
                        this.f12005p = true;
                        this.f12004o = null;
                        return b4;
                    }
                } finally {
                }
            }
        }
        return this.f12006q;
    }

    public final String toString() {
        Object obj = this.f12004o;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.f12006q + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
