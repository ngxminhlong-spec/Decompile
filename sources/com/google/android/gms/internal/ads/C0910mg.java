package com.google.android.gms.internal.ads;

import O1.InterfaceC0051a;
import android.os.SystemClock;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.mg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0910mg implements Yg, InterfaceC0051a, InterfaceC0954nh, Sg, Ig, InterfaceC1426yh {

    /* renamed from: o, reason: collision with root package name */
    public final C1798a f9636o;

    /* renamed from: p, reason: collision with root package name */
    public final C0906mc f9637p;

    public C0910mg(C1798a c1798a, C0906mc c0906mc) {
        this.f9636o = c1798a;
        this.f9637p = c0906mc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1426yh
    public final void B(boolean z4) {
    }

    @Override // O1.InterfaceC0051a
    public final void D() {
        C0906mc c0906mc = this.f9637p;
        synchronized (c0906mc.d) {
            try {
                if (c0906mc.f9624k != -1) {
                    C0863lc c0863lc = new C0863lc(c0906mc);
                    c0906mc.f9616a.getClass();
                    c0863lc.f9434a = SystemClock.elapsedRealtime();
                    c0906mc.c.add(c0863lc);
                    c0906mc.f9622i++;
                    c0906mc.f9617b.b();
                    c0906mc.f9617b.a(c0906mc);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1426yh
    public final void F0(C1236u5 c1236u5) {
        C0906mc c0906mc = this.f9637p;
        synchronized (c0906mc.d) {
            c0906mc.f9617b.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0954nh
    public final void K0(Ep ep) {
        C1798a c1798a = this.f9636o;
        C0906mc c0906mc = this.f9637p;
        c1798a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (c0906mc.d) {
            try {
                c0906mc.f9624k = elapsedRealtime;
                if (elapsedRealtime != -1) {
                    c0906mc.f9617b.a(c0906mc);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Yg
    public final void M() {
        C0906mc c0906mc = this.f9637p;
        synchronized (c0906mc.d) {
            try {
                if (c0906mc.f9624k != -1) {
                    c0906mc.f9616a.getClass();
                    c0906mc.f9621h = SystemClock.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0954nh
    public final void N(C0370Za c0370Za) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1426yh
    public final void X(C1236u5 c1236u5) {
        C0906mc c0906mc = this.f9637p;
        synchronized (c0906mc.d) {
            c0906mc.f9617b.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void b() {
        C0906mc c0906mc = this.f9637p;
        synchronized (c0906mc.d) {
            try {
                if (c0906mc.f9624k != -1 && !c0906mc.c.isEmpty()) {
                    C0863lc c0863lc = (C0863lc) c0906mc.c.getLast();
                    if (c0863lc.f9435b == -1) {
                        c0863lc.c.f9616a.getClass();
                        c0863lc.f9435b = SystemClock.elapsedRealtime();
                        c0906mc.f9617b.a(c0906mc);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1426yh
    public final void f() {
    }

    public final void l(O1.U0 u02) {
        C0906mc c0906mc = this.f9637p;
        synchronized (c0906mc.d) {
            c0906mc.f9616a.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c0906mc.f9623j = elapsedRealtime;
            c0906mc.f9617b.f(u02, elapsedRealtime);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1426yh
    public final void n0(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.Sg
    public final void p() {
        C0906mc c0906mc = this.f9637p;
        synchronized (c0906mc.d) {
            try {
                if (c0906mc.f9624k != -1 && c0906mc.f9620g == -1) {
                    c0906mc.f9616a.getClass();
                    c0906mc.f9620g = SystemClock.elapsedRealtime();
                    c0906mc.f9617b.a(c0906mc);
                }
                c0906mc.f9617b.c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1426yh
    public final void t0(C1236u5 c1236u5) {
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void y(BinderC0606fb binderC0606fb, String str, String str2) {
    }
}
