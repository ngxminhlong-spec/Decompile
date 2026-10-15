package com.google.android.gms.internal.ads;

import O1.C0101z0;
import O1.InterfaceC0051a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Yj implements InterfaceC0954nh, Yg, Lg, Sg, InterfaceC0051a, InterfaceC1426yh {

    /* renamed from: o, reason: collision with root package name */
    public final C0764j5 f7868o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7869p = false;

    public Yj(C0764j5 c0764j5, C0919mp c0919mp) {
        this.f7868o = c0764j5;
        c0764j5.b(2);
        if (c0919mp != null) {
            c0764j5.b(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1426yh
    public final void B(boolean z4) {
        this.f7868o.b(true != z4 ? 1108 : 1107);
    }

    @Override // O1.InterfaceC0051a
    public final synchronized void D() {
        if (this.f7869p) {
            this.f7868o.b(8);
        } else {
            this.f7868o.b(7);
            this.f7869p = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1426yh
    public final void F0(C1236u5 c1236u5) {
        C0764j5 c0764j5 = this.f7868o;
        synchronized (c0764j5) {
            if (c0764j5.c) {
                try {
                    c0764j5.f9124b.e(c1236u5);
                } catch (NullPointerException e4) {
                    N1.n.f1204A.f1209g.h("AdMobClearcutLogger.modify", e4);
                }
            }
        }
        this.f7868o.b(1103);
    }

    @Override // com.google.android.gms.internal.ads.Lg
    public final void J(C0101z0 c0101z0) {
        int i4 = c0101z0.f1405o;
        C0764j5 c0764j5 = this.f7868o;
        switch (i4) {
            case 1:
                c0764j5.b(101);
                return;
            case 2:
                c0764j5.b(102);
                return;
            case 3:
                c0764j5.b(5);
                return;
            case 4:
                c0764j5.b(103);
                return;
            case 5:
                c0764j5.b(104);
                return;
            case 6:
                c0764j5.b(105);
                return;
            case 7:
                c0764j5.b(106);
                return;
            default:
                c0764j5.b(4);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0954nh
    public final void K0(Ep ep) {
        this.f7868o.a(new Xj(0, ep));
    }

    @Override // com.google.android.gms.internal.ads.Yg
    public final void M() {
        this.f7868o.b(3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0954nh
    public final void N(C0370Za c0370Za) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1426yh
    public final void X(C1236u5 c1236u5) {
        C0764j5 c0764j5 = this.f7868o;
        synchronized (c0764j5) {
            if (c0764j5.c) {
                try {
                    c0764j5.f9124b.e(c1236u5);
                } catch (NullPointerException e4) {
                    N1.n.f1204A.f1209g.h("AdMobClearcutLogger.modify", e4);
                }
            }
        }
        this.f7868o.b(1104);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1426yh
    public final void f() {
        this.f7868o.b(1109);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1426yh
    public final void n0(boolean z4) {
        this.f7868o.b(true != z4 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.Sg
    public final synchronized void p() {
        this.f7868o.b(6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1426yh
    public final void t0(C1236u5 c1236u5) {
        C0764j5 c0764j5 = this.f7868o;
        synchronized (c0764j5) {
            if (c0764j5.c) {
                try {
                    c0764j5.f9124b.e(c1236u5);
                } catch (NullPointerException e4) {
                    N1.n.f1204A.f1209g.h("AdMobClearcutLogger.modify", e4);
                }
            }
        }
        this.f7868o.b(1102);
    }
}
