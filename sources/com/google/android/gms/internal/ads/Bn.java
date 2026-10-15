package com.google.android.gms.internal.ads;

import O1.C0101z0;
import O1.InterfaceC0051a;
import O1.InterfaceC0074l0;
import O1.InterfaceC0096x;
import O1.InterfaceC0100z;
import android.os.RemoteException;
import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Bn implements I1.b, InterfaceC0954nh, Yg, Lg, Sg, InterfaceC0051a, Ig, InterfaceC0740ih, Pg, Sh {

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC1263uq f4182w;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicReference f4174o = new AtomicReference();

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReference f4175p = new AtomicReference();

    /* renamed from: q, reason: collision with root package name */
    public final AtomicReference f4176q = new AtomicReference();

    /* renamed from: r, reason: collision with root package name */
    public final AtomicReference f4177r = new AtomicReference();

    /* renamed from: s, reason: collision with root package name */
    public final AtomicReference f4178s = new AtomicReference();

    /* renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f4179t = new AtomicBoolean(true);

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f4180u = new AtomicBoolean(false);

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f4181v = new AtomicBoolean(false);

    /* renamed from: x, reason: collision with root package name */
    public final ArrayBlockingQueue f4183x = new ArrayBlockingQueue(((Integer) O1.r.d.c.a(AbstractC1066q6.M7)).intValue());

    public Bn(InterfaceC1263uq interfaceC1263uq) {
        this.f4182w = interfaceC1263uq;
    }

    @Override // I1.b
    public final synchronized void B(String str, String str2) {
        if (!this.f4179t.get()) {
            Object obj = this.f4175p.get();
            if (obj != null) {
                try {
                    try {
                        ((O1.O) obj).e2(str, str2);
                    } catch (RemoteException e4) {
                        Y9.u("#007 Could not call remote method.", e4);
                    }
                } catch (NullPointerException e5) {
                    Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
                }
            }
            return;
        }
        if (!this.f4183x.offer(new Pair(str, str2))) {
            Y9.m("The queue for app events is full, dropping the new event.");
            InterfaceC1263uq interfaceC1263uq = this.f4182w;
            if (interfaceC1263uq != null) {
                C1220tq b4 = C1220tq.b("dae_action");
                b4.a("dae_name", str);
                b4.a("dae_data", str2);
                interfaceC1263uq.b(b4);
            }
        }
    }

    @Override // O1.InterfaceC0051a
    public final void D() {
        Object obj;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f9)).booleanValue() || (obj = this.f4174o.get()) == null) {
            return;
        }
        try {
            ((InterfaceC0096x) obj).e();
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        } catch (NullPointerException e5) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    public final void F() {
        if (this.f4180u.get() && this.f4181v.get()) {
            ArrayBlockingQueue arrayBlockingQueue = this.f4183x;
            Iterator it = arrayBlockingQueue.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = this.f4175p.get();
                if (obj != null) {
                    try {
                        ((O1.O) obj).e2((String) pair.first, (String) pair.second);
                    } catch (RemoteException e4) {
                        Y9.u("#007 Could not call remote method.", e4);
                    } catch (NullPointerException e5) {
                        Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
                    }
                }
            }
            arrayBlockingQueue.clear();
            this.f4179t.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.Sh
    public final void G0() {
        Object obj;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f9)).booleanValue() && (obj = this.f4174o.get()) != null) {
            try {
                ((InterfaceC0096x) obj).e();
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            } catch (NullPointerException e5) {
                Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        Object obj2 = this.f4178s.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((O1.U) obj2).c();
        } catch (RemoteException e6) {
            Y9.u("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.Lg
    public final void J(C0101z0 c0101z0) {
        AtomicReference atomicReference = this.f4174o;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC0096x) obj).r(c0101z0);
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            } catch (NullPointerException e5) {
                Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((InterfaceC0096x) obj2).A(c0101z0.f1405o);
            } catch (RemoteException e6) {
                Y9.u("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj3 = this.f4177r.get();
        if (obj3 != null) {
            try {
                ((InterfaceC0100z) obj3).l3(c0101z0);
            } catch (RemoteException e8) {
                Y9.u("#007 Could not call remote method.", e8);
            } catch (NullPointerException e9) {
                Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        this.f4179t.set(false);
        this.f4183x.clear();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0954nh
    public final void K0(Ep ep) {
        this.f4179t.set(true);
        this.f4181v.set(false);
    }

    @Override // com.google.android.gms.internal.ads.Yg
    public final synchronized void M() {
        Object obj = this.f4174o.get();
        if (obj != null) {
            try {
                ((InterfaceC0096x) obj).g();
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            } catch (NullPointerException e5) {
                Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        Object obj2 = this.f4177r.get();
        if (obj2 != null) {
            try {
                ((InterfaceC0100z) obj2).e();
            } catch (RemoteException e6) {
                Y9.u("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        this.f4181v.set(true);
        F();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0954nh
    public final void N(C0370Za c0370Za) {
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void b() {
        Zf.r(this.f4174o, C1475zn.f11673q);
        Zf.r(this.f4178s, C1475zn.f11674r);
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void c() {
        Object obj = this.f4174o.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC0096x) obj).f();
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        } catch (NullPointerException e5) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void e() {
        Object obj = this.f4174o.get();
        if (obj != null) {
            try {
                ((InterfaceC0096x) obj).j();
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            } catch (NullPointerException e5) {
                Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        AtomicReference atomicReference = this.f4178s;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((O1.U) obj2).d();
            } catch (RemoteException e6) {
                Y9.u("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj3 = atomicReference.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((O1.U) obj3).a();
        } catch (RemoteException e8) {
            Y9.u("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    public final synchronized InterfaceC0096x l() {
        return (InterfaceC0096x) this.f4174o.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0740ih
    public final void o(O1.Y0 y02) {
        Object obj = this.f4176q.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC0074l0) obj).D3(y02);
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        } catch (NullPointerException e5) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.Sg
    public final void p() {
        Zf.r(this.f4174o, C1475zn.f11672p);
    }

    @Override // com.google.android.gms.internal.ads.Pg
    public final void r(C0101z0 c0101z0) {
        Object obj = this.f4178s.get();
        if (obj == null) {
            return;
        }
        try {
            ((O1.U) obj).T(c0101z0);
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        } catch (NullPointerException e5) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.Sh
    public final void u() {
        Object obj = this.f4174o.get();
        if (obj == null) {
            return;
        }
        try {
            ((InterfaceC0096x) obj).k();
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        } catch (NullPointerException e5) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    public final void v(O1.O o4) {
        this.f4175p.set(o4);
        this.f4180u.set(true);
        F();
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void y(BinderC0606fb binderC0606fb, String str, String str2) {
    }
}
