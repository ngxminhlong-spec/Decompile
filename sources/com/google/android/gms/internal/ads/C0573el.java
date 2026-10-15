package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import c3.InterfaceFutureC0239a;
import e2.C1664b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.el, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0573el extends AbstractC0702hl {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8635u;

    public /* synthetic */ C0573el(int i4) {
        this.f8635u = i4;
    }

    private final void b() {
        synchronized (this.f8980p) {
            try {
                if (!this.f8982r) {
                    this.f8982r = true;
                    try {
                        try {
                            ((InterfaceC0325Qa) this.f8984t.t()).Q0(this.f8983s, new BinderC0616fl(this));
                        } catch (RemoteException | IllegalArgumentException unused) {
                            this.f8979o.c(new Xk(1));
                        }
                    } catch (Throwable th) {
                        N1.n.f1204A.f1209g.h("RemoteAdRequestClientTask.onConnected", th);
                        this.f8979o.c(new Xk(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // h2.InterfaceC1703b
    public final void Q() {
        switch (this.f8635u) {
            case 0:
                b();
                return;
            default:
                synchronized (this.f8980p) {
                    try {
                        if (!this.f8982r) {
                            this.f8982r = true;
                            try {
                                ((InterfaceC0325Qa) this.f8984t.t()).I1(this.f8983s, new BinderC0616fl(this));
                            } catch (RemoteException | IllegalArgumentException unused) {
                                this.f8979o.c(new Xk(1));
                            } catch (Throwable th) {
                                N1.n.f1204A.f1209g.h("RemoteSignalsClientTask.onConnected", th);
                                this.f8979o.c(new Xk(1));
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0702hl, h2.InterfaceC1704c
    public void a0(C1664b c1664b) {
        switch (this.f8635u) {
            case 0:
                Y9.m("Cannot connect to remote service, fallback to local instance.");
                this.f8979o.c(new Xk(1));
                return;
            default:
                super.a0(c1664b);
                return;
        }
    }

    public InterfaceFutureC0239a c(C0370Za c0370Za) {
        synchronized (this.f8980p) {
            try {
                if (this.f8981q) {
                    return this.f8979o;
                }
                this.f8981q = true;
                this.f8983s = c0370Za;
                this.f8984t.n();
                C0272Fc c0272Fc = this.f8979o;
                c0272Fc.f5017o.a(new RunnableC0744il(0, this), AbstractC0266Ec.f4900f);
                return this.f8979o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
