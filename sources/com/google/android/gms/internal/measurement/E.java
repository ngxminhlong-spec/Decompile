package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C0326Qb;
import com.google.android.gms.internal.ads.Wl;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final C0326Qb f11724a;

    /* renamed from: b, reason: collision with root package name */
    public u0.g f11725b;
    public final C1498c c;
    public final Wl d;

    public E() {
        C0326Qb c0326Qb = new C0326Qb(19);
        this.f11724a = c0326Qb;
        this.f11725b = ((u0.g) c0326Qb.f6660p).k();
        this.c = new C1498c();
        this.d = new Wl(13, (byte) 0);
        final int i4 = 0;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E f11870b;

            {
                this.f11870b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i4) {
                    case 0:
                        return new G1(this.f11870b.d);
                    default:
                        return new G1(this.f11870b.c);
                }
            }
        };
        C1599z1 c1599z1 = (C1599z1) c0326Qb.f6662r;
        ((HashMap) c1599z1.f12124p).put("internal.registerCallback", callable);
        final int i5 = 1;
        ((HashMap) c1599z1.f12124p).put("internal.eventLogger", new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ E f11870b;

            {
                this.f11870b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i5) {
                    case 0:
                        return new G1(this.f11870b.d);
                    default:
                        return new G1(this.f11870b.c);
                }
            }
        });
    }

    public final void a(W0 w02) {
        AbstractC1523h abstractC1523h;
        C0326Qb c0326Qb = this.f11724a;
        try {
            this.f11725b = ((u0.g) c0326Qb.f6660p).k();
            if (c0326Qb.C(this.f11725b, (X0[]) w02.m().toArray(new X0[0])) instanceof C1513f) {
                throw new IllegalStateException("Program loading failed");
            }
            for (V0 v02 : w02.l().n()) {
                N1 m4 = v02.m();
                String l4 = v02.l();
                Iterator it = m4.iterator();
                while (it.hasNext()) {
                    InterfaceC1550n C4 = c0326Qb.C(this.f11725b, (X0) it.next());
                    if (!(C4 instanceof C1538k)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    u0.g gVar = this.f11725b;
                    if (gVar.J(l4)) {
                        InterfaceC1550n C5 = gVar.C(l4);
                        if (!(C5 instanceof AbstractC1523h)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(l4)));
                        }
                        abstractC1523h = (AbstractC1523h) C5;
                    } else {
                        abstractC1523h = null;
                    }
                    if (abstractC1523h == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(l4)));
                    }
                    abstractC1523h.a(this.f11725b, Collections.singletonList(C4));
                }
            }
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }

    public final boolean b(C1493b c1493b) {
        C1498c c1498c = this.c;
        try {
            c1498c.f11889a = c1493b;
            c1498c.f11890b = c1493b.clone();
            c1498c.c.clear();
            ((u0.g) this.f11724a.f6661q).I("runtime.counter", new C1518g(Double.valueOf(0.0d)));
            this.d.j(this.f11725b.k(), c1498c);
            if (c1498c.f11890b.equals(c1498c.f11889a)) {
                return !c1498c.c.isEmpty();
            }
            return true;
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }
}
