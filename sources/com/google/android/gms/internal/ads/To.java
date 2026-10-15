package com.google.android.gms.internal.ads;

import O1.C0101z0;
import O1.InterfaceC0074l0;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class To implements Lg, InterfaceC0612fh, InterfaceC0748ip, P1.g, InterfaceC0740ih, Pg, Sh {

    /* renamed from: o, reason: collision with root package name */
    public final Sp f7080o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReference f7081p = new AtomicReference();

    /* renamed from: q, reason: collision with root package name */
    public final AtomicReference f7082q = new AtomicReference();

    /* renamed from: r, reason: collision with root package name */
    public final AtomicReference f7083r = new AtomicReference();

    /* renamed from: s, reason: collision with root package name */
    public final AtomicReference f7084s = new AtomicReference();

    /* renamed from: t, reason: collision with root package name */
    public final AtomicReference f7085t = new AtomicReference();

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f7086u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    public To f7087v = null;

    public To(Sp sp) {
        this.f7080o = sp;
    }

    @Override // com.google.android.gms.internal.ads.Sh
    public final void G0() {
        To to = this.f7087v;
        if (to != null) {
            to.G0();
            return;
        }
        Object obj = this.f7083r.get();
        if (obj == null) {
            return;
        }
        try {
            ((X4) obj).c();
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        } catch (NullPointerException e5) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.Lg
    public final void J(C0101z0 c0101z0) {
        To to = this.f7087v;
        if (to != null) {
            to.J(c0101z0);
            return;
        }
        AtomicReference atomicReference = this.f7081p;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((U4) obj).R2(c0101z0);
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            } catch (NullPointerException e5) {
                Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((U4) obj2).u(c0101z0.f1405o);
        } catch (RemoteException e6) {
            Y9.u("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // P1.g
    public final void L2(int i4) {
        To to = this.f7087v;
        if (to != null) {
            to.L2(i4);
            return;
        }
        Object obj = this.f7085t.get();
        if (obj == null) {
            return;
        }
        try {
            ((P1.g) obj).L2(i4);
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        } catch (NullPointerException e5) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // P1.g
    public final void O() {
    }

    @Override // P1.g
    public final void W2() {
        To to = this.f7087v;
        if (to != null) {
            to.W2();
        } else {
            Zf.r(this.f7085t, C1475zn.f11679w);
        }
    }

    public final void a() {
        To to = this.f7087v;
        if (to != null) {
            to.a();
            return;
        }
        C1384xi c1384xi = this.f7080o.f7010a;
        if (c1384xi != null) {
            C0817kF c0817kF = (C0817kF) c1384xi.f11290p;
            synchronized (c0817kF) {
                c0817kF.f9284o = 1;
                c0817kF.e();
            }
        }
        if (this.f7082q.get() != null) {
            try {
                throw new ClassCastException();
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            } catch (NullPointerException e5) {
                Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        Object obj = this.f7083r.get();
        if (obj == null) {
            return;
        }
        try {
            ((X4) obj).e();
        } catch (RemoteException e6) {
            Y9.u("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // P1.g
    public final void a0() {
        To to = this.f7087v;
        if (to != null) {
            to.a0();
            return;
        }
        Zf.r(this.f7085t, C1475zn.f11680x);
        C1475zn c1475zn = C1475zn.f11675s;
        AtomicReference atomicReference = this.f7083r;
        Zf.r(atomicReference, c1475zn);
        Zf.r(atomicReference, C1475zn.f11676t);
    }

    public final void b(BinderC0257Cf binderC0257Cf) {
        To to = this.f7087v;
        if (to != null) {
            to.b(binderC0257Cf);
            return;
        }
        Object obj = this.f7081p.get();
        if (obj == null) {
            return;
        }
        try {
            ((U4) obj).r3(binderC0257Cf);
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        } catch (NullPointerException e5) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0612fh
    public final void h() {
        To to = this.f7087v;
        if (to != null) {
            to.h();
        } else {
            Zf.r(this.f7084s, C1475zn.f11678v);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0740ih
    public final void o(O1.Y0 y02) {
        To to = this.f7087v;
        if (to != null) {
            to.o(y02);
            return;
        }
        Object obj = this.f7086u.get();
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

    @Override // P1.g
    public final void q1() {
    }

    @Override // com.google.android.gms.internal.ads.Pg
    public final void r(C0101z0 c0101z0) {
        To to = this.f7087v;
        if (to != null) {
            to.r(c0101z0);
            return;
        }
        Object obj = this.f7083r.get();
        if (obj == null) {
            return;
        }
        try {
            ((X4) obj).T(c0101z0);
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        } catch (NullPointerException e5) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.Sh
    public final void u() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0748ip
    public final void v(InterfaceC0748ip interfaceC0748ip) {
        this.f7087v = (To) interfaceC0748ip;
    }

    @Override // P1.g
    public final void y3() {
        To to = this.f7087v;
        if (to != null) {
            to.y3();
        } else {
            Zf.r(this.f7085t, C1475zn.f11677u);
        }
    }
}
