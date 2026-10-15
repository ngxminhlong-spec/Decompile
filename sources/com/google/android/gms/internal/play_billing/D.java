package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class D implements Cloneable {

    /* renamed from: o, reason: collision with root package name */
    public final E f12140o;

    /* renamed from: p, reason: collision with root package name */
    public E f12141p;

    public D(E e4) {
        this.f12140o = e4;
        if (e4.j()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f12141p = (E) e4.k(4);
    }

    public static void e(Object obj, Object obj2) {
        C1616h0.c.a(obj.getClass()).d(obj, obj2);
    }

    public final E a() {
        E b4 = b();
        b4.getClass();
        if (E.i(b4, true)) {
            return b4;
        }
        throw new C1626m0();
    }

    public final E b() {
        if (!this.f12141p.j()) {
            return this.f12141p;
        }
        E e4 = this.f12141p;
        e4.getClass();
        C1616h0.c.a(e4.getClass()).b(e4);
        e4.f();
        return this.f12141p;
    }

    public final void c() {
        if (this.f12141p.j()) {
            return;
        }
        d();
    }

    public final Object clone() {
        D d = (D) this.f12140o.k(5);
        d.f12141p = b();
        return d;
    }

    public final void d() {
        E e4 = (E) this.f12140o.k(4);
        e(e4, this.f12141p);
        this.f12141p = e4;
    }
}
