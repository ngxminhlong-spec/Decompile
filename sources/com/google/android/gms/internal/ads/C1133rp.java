package com.google.android.gms.internal.ads;

import O1.C0101z0;
import O1.InterfaceC0074l0;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1133rp implements Y1.a, Yg, Lg, Ig, Pg, InterfaceC0740ih, InterfaceC0748ip, Sh {

    /* renamed from: o, reason: collision with root package name */
    public final Sp f10528o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReference f10529p = new AtomicReference();

    /* renamed from: q, reason: collision with root package name */
    public final AtomicReference f10530q = new AtomicReference();

    /* renamed from: r, reason: collision with root package name */
    public final AtomicReference f10531r = new AtomicReference();

    /* renamed from: s, reason: collision with root package name */
    public final AtomicReference f10532s = new AtomicReference();

    /* renamed from: t, reason: collision with root package name */
    public final AtomicReference f10533t = new AtomicReference();

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f10534u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f10535v = new AtomicReference();

    public C1133rp(Sp sp) {
        this.f10528o = sp;
    }

    @Override // com.google.android.gms.internal.ads.Sh
    public final void G0() {
        Zf.r(this.f10531r, C1475zn.f11681z);
    }

    @Override // com.google.android.gms.internal.ads.Lg
    public final void J(C0101z0 c0101z0) {
        int i4 = c0101z0.f1405o;
        AtomicReference atomicReference = this.f10530q;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC1463zb) obj).r(c0101z0);
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            } catch (NullPointerException e5) {
                Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((InterfaceC1463zb) obj2).A(i4);
            } catch (RemoteException e6) {
                Y9.u("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj3 = this.f10532s.get();
        if (obj3 == null) {
            return;
        }
        try {
            C0735ib c0735ib = (C0735ib) obj3;
            Parcel Q3 = c0735ib.Q();
            Q3.writeInt(i4);
            c0735ib.G1(Q3, 7);
        } catch (RemoteException e8) {
            Y9.u("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.Yg
    public final void M() {
        Object obj = this.f10530q.get();
        if (obj != null) {
            try {
                ((InterfaceC1463zb) obj).h();
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            } catch (NullPointerException e5) {
                Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        Object obj2 = this.f10532s.get();
        if (obj2 == null) {
            return;
        }
        try {
            C0735ib c0735ib = (C0735ib) obj2;
            c0735ib.G1(c0735ib.Q(), 1);
        } catch (RemoteException e6) {
            Y9.u("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void a() {
        Object obj = this.f10532s.get();
        if (obj == null) {
            return;
        }
        try {
            C0735ib c0735ib = (C0735ib) obj;
            c0735ib.G1(c0735ib.Q(), 8);
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        } catch (NullPointerException e5) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void b() {
        C1384xi c1384xi = this.f10528o.f7010a;
        if (c1384xi != null) {
            C0817kF c0817kF = (C0817kF) c1384xi.f11290p;
            synchronized (c0817kF) {
                c0817kF.f9284o = 1;
                c0817kF.e();
            }
        }
        Object obj = this.f10531r.get();
        if (obj != null) {
            try {
                ((InterfaceC1291vb) obj).h();
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            } catch (NullPointerException e5) {
                Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        Object obj2 = this.f10532s.get();
        if (obj2 == null) {
            return;
        }
        try {
            C0735ib c0735ib = (C0735ib) obj2;
            c0735ib.G1(c0735ib.Q(), 4);
        } catch (RemoteException e6) {
            Y9.u("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void c() {
        Object obj = this.f10532s.get();
        if (obj == null) {
            return;
        }
        try {
            C0735ib c0735ib = (C0735ib) obj;
            c0735ib.G1(c0735ib.Q(), 6);
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        } catch (NullPointerException e5) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void d() {
        Object obj = this.f10532s.get();
        if (obj == null) {
            return;
        }
        try {
            C0735ib c0735ib = (C0735ib) obj;
            c0735ib.G1(c0735ib.Q(), 3);
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        } catch (NullPointerException e5) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void e() {
        AtomicReference atomicReference = this.f10531r;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC1291vb) obj).j();
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            } catch (NullPointerException e5) {
                Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        Object obj2 = this.f10532s.get();
        if (obj2 != null) {
            try {
                C0735ib c0735ib = (C0735ib) obj2;
                c0735ib.G1(c0735ib.Q(), 2);
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
            ((InterfaceC1291vb) obj3).d();
        } catch (RemoteException e8) {
            Y9.u("#007 Could not call remote method.", e8);
        } catch (NullPointerException e9) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e9);
        }
    }

    @Override // Y1.a
    public final void l() {
        Zf.r(this.f10529p, C1475zn.y);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0740ih
    public final void o(O1.Y0 y02) {
        Object obj = this.f10535v.get();
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

    @Override // com.google.android.gms.internal.ads.Pg
    public final void r(C0101z0 c0101z0) {
        AtomicReference atomicReference = this.f10531r;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((InterfaceC1291vb) obj).N0(c0101z0);
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
            ((InterfaceC1291vb) obj2).i0(c0101z0.f1405o);
        } catch (RemoteException e6) {
            Y9.u("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.Sh
    public final void u() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0748ip
    public final void v(InterfaceC0748ip interfaceC0748ip) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void y(BinderC0606fb binderC0606fb, String str, String str2) {
        int i4 = binderC0606fb.f8705p;
        String str3 = binderC0606fb.f8704o;
        Object obj = this.f10531r.get();
        if (obj != null) {
            try {
                ((InterfaceC1291vb) obj).l1(new BinderC0271Fb(str3, i4));
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            } catch (NullPointerException e5) {
                Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e5);
            }
        }
        Object obj2 = this.f10533t.get();
        if (obj2 != null) {
            try {
                C0241Ab c0241Ab = (C0241Ab) obj2;
                BinderC0271Fb binderC0271Fb = new BinderC0271Fb(str3, i4);
                Parcel Q3 = c0241Ab.Q();
                AbstractC1192t4.e(Q3, binderC0271Fb);
                Q3.writeString(str);
                Q3.writeString(str2);
                c0241Ab.G1(Q3, 2);
            } catch (RemoteException e6) {
                Y9.u("#007 Could not call remote method.", e6);
            } catch (NullPointerException e7) {
                Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e7);
            }
        }
        Object obj3 = this.f10532s.get();
        if (obj3 != null) {
            try {
                C0735ib c0735ib = (C0735ib) obj3;
                Parcel Q4 = c0735ib.Q();
                AbstractC1192t4.e(Q4, binderC0606fb);
                c0735ib.G1(Q4, 5);
            } catch (RemoteException e8) {
                Y9.u("#007 Could not call remote method.", e8);
            } catch (NullPointerException e9) {
                Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e9);
            }
        }
        Object obj4 = this.f10534u.get();
        if (obj4 == null) {
            return;
        }
        try {
            C0692hb c0692hb = (C0692hb) obj4;
            Parcel Q5 = c0692hb.Q();
            AbstractC1192t4.e(Q5, binderC0606fb);
            Q5.writeString(str);
            Q5.writeString(str2);
            c0692hb.G1(Q5, 2);
        } catch (RemoteException e10) {
            Y9.u("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            Y9.t("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }
}
