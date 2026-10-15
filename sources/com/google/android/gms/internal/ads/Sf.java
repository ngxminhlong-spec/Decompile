package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Sf implements Yg, InterfaceC1450z4 {

    /* renamed from: o, reason: collision with root package name */
    public final C1434yp f6988o;

    /* renamed from: p, reason: collision with root package name */
    public final Qg f6989p;

    /* renamed from: q, reason: collision with root package name */
    public final C0569eh f6990q;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f6991r = new AtomicBoolean();

    /* renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f6992s = new AtomicBoolean();

    public Sf(C1434yp c1434yp, Qg qg, C0569eh c0569eh) {
        this.f6988o = c1434yp;
        this.f6989p = qg;
        this.f6990q = c0569eh;
    }

    @Override // com.google.android.gms.internal.ads.Yg
    public final synchronized void M() {
        if (this.f6988o.f11506e != 1) {
            if (this.f6991r.compareAndSet(false, true)) {
                this.f6989p.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1450z4
    public final void j0(C1407y4 c1407y4) {
        if (this.f6988o.f11506e == 1 && c1407y4.f11338j && this.f6991r.compareAndSet(false, true)) {
            this.f6989p.b();
        }
        if (c1407y4.f11338j && this.f6992s.compareAndSet(false, true)) {
            C0569eh c0569eh = this.f6990q;
            synchronized (c0569eh) {
                c0569eh.n1(BF.f4065O);
            }
        }
    }
}
