package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.hh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0698hh extends AA implements Sg, InterfaceC0612fh {

    /* renamed from: q, reason: collision with root package name */
    public final C1434yp f8956q;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f8957r;

    public C0698hh(Set set, C1434yp c1434yp) {
        super(set);
        this.f8957r = new AtomicBoolean();
        this.f8956q = c1434yp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612fh
    public final void h() {
        if (this.f8956q.f11502b == 1) {
            r1();
        }
    }

    @Override // com.google.android.gms.internal.ads.Sg
    public final void p() {
        int i4 = this.f8956q.f11502b;
        if (i4 == 2 || i4 == 5 || i4 == 4 || i4 == 6 || i4 == 7) {
            r1();
        }
    }

    public final void r1() {
        O1.Y0 y02;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.O6)).booleanValue() && this.f8957r.compareAndSet(false, true) && (y02 = this.f8956q.f11507e0) != null && y02.f1333o == 3) {
            n1(new C0874ln(25, this));
        }
    }
}
