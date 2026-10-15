package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.hg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0697hg implements P1.g {

    /* renamed from: o, reason: collision with root package name */
    public final Vg f8953o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f8954p = new AtomicBoolean(false);

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f8955q = new AtomicBoolean(false);

    public C0697hg(Vg vg) {
        this.f8953o = vg;
    }

    @Override // P1.g
    public final void L2(int i4) {
        this.f8954p.set(true);
        AtomicBoolean atomicBoolean = this.f8955q;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f8953o.n1(BF.f4059H);
    }

    @Override // P1.g
    public final void O() {
    }

    @Override // P1.g
    public final void W2() {
    }

    @Override // P1.g
    public final void a0() {
        this.f8953o.n1(BF.f4061J);
    }

    @Override // P1.g
    public final void q1() {
    }

    @Override // P1.g
    public final void y3() {
        AtomicBoolean atomicBoolean = this.f8955q;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f8953o.n1(BF.f4059H);
    }
}
