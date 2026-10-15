package com.google.android.gms.internal.ads;

import O1.InterfaceC0068i0;
import android.content.Context;
import android.os.RemoteException;
import b0.RunnableC0203p;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Qk implements P1.g, InterfaceC0481ce {

    /* renamed from: o, reason: collision with root package name */
    public final Context f6680o;

    /* renamed from: p, reason: collision with root package name */
    public final C0248Bc f6681p;

    /* renamed from: q, reason: collision with root package name */
    public Ok f6682q;

    /* renamed from: r, reason: collision with root package name */
    public C0348Ud f6683r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6684s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6685t;

    /* renamed from: u, reason: collision with root package name */
    public long f6686u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0068i0 f6687v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6688w;

    public Qk(Context context, C0248Bc c0248Bc) {
        this.f6680o = context;
        this.f6681p = c0248Bc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0481ce
    public final synchronized void F(String str, int i4, String str2, boolean z4) {
        if (z4) {
            Q1.I.w("Ad inspector loaded.");
            this.f6684s = true;
            b("");
            return;
        }
        Y9.s("Ad inspector failed to load.");
        try {
            N1.n.f1204A.f1209g.h("InspectorUi.onAdWebViewFinishedLoading 0", new Exception("Failed to load UI. Error code: " + i4 + ", Description: " + str + ", Failing URL: " + str2));
            InterfaceC0068i0 interfaceC0068i0 = this.f6687v;
            if (interfaceC0068i0 != null) {
                interfaceC0068i0.Z0(Zf.L(17, null, null));
            }
        } catch (RemoteException e4) {
            N1.n.f1204A.f1209g.h("InspectorUi.onAdWebViewFinishedLoading 1", e4);
        }
        this.f6688w = true;
        this.f6683r.destroy();
    }

    @Override // P1.g
    public final synchronized void L2(int i4) {
        this.f6683r.destroy();
        if (!this.f6688w) {
            Q1.I.w("Inspector closed.");
            InterfaceC0068i0 interfaceC0068i0 = this.f6687v;
            if (interfaceC0068i0 != null) {
                try {
                    interfaceC0068i0.Z0(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f6685t = false;
        this.f6684s = false;
        this.f6686u = 0L;
        this.f6688w = false;
        this.f6687v = null;
    }

    @Override // P1.g
    public final void O() {
    }

    @Override // P1.g
    public final void W2() {
    }

    public final synchronized void a(InterfaceC0068i0 interfaceC0068i0, X7 x7, X7 x72) {
        if (c(interfaceC0068i0)) {
            try {
                N1.n nVar = N1.n.f1204A;
                C0347Uc c0347Uc = nVar.d;
                C0348Ud c = C0347Uc.c(this.f6680o, new C0887m(0, 0, 0), "", false, false, null, null, this.f6681p, null, null, new C0764j5(), null, null, null);
                this.f6683r = c;
                C0396ae c0396ae = c.f7165o.f7464A;
                if (c0396ae == null) {
                    Y9.s("Failed to obtain a web view for the ad inspector");
                    try {
                        nVar.f1209g.h("InspectorUi.openInspector 2", new NullPointerException("Failed to obtain a web view for the ad inspector"));
                        interfaceC0068i0.Z0(Zf.L(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e4) {
                        N1.n.f1204A.f1209g.h("InspectorUi.openInspector 3", e4);
                        return;
                    }
                }
                this.f6687v = interfaceC0068i0;
                c0396ae.l(null, null, null, null, null, false, null, null, null, null, null, null, null, null, x7, null, new C0683h8(this.f6680o, 1), x72, null);
                c0396ae.f8147u = this;
                C0348Ud c0348Ud = this.f6683r;
                c0348Ud.f7165o.loadUrl((String) O1.r.d.c.a(AbstractC1066q6.Q7));
                C2033d.m(this.f6680o, new AdOverlayInfoParcel(this, this.f6683r, this.f6681p), true);
                nVar.f1212j.getClass();
                this.f6686u = System.currentTimeMillis();
            } catch (C0333Rd e5) {
                Y9.t("Failed to obtain a web view for the ad inspector", e5);
                try {
                    N1.n.f1204A.f1209g.h("InspectorUi.openInspector 0", e5);
                    interfaceC0068i0.Z0(Zf.L(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e6) {
                    N1.n.f1204A.f1209g.h("InspectorUi.openInspector 1", e6);
                }
            }
        }
    }

    @Override // P1.g
    public final synchronized void a0() {
        this.f6685t = true;
        b("");
    }

    public final synchronized void b(String str) {
        if (this.f6684s && this.f6685t) {
            AbstractC0266Ec.f4899e.execute(new RunnableC0203p(28, this, str));
        }
    }

    public final synchronized boolean c(InterfaceC0068i0 interfaceC0068i0) {
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.P7)).booleanValue()) {
            Y9.s("Ad inspector had an internal error.");
            try {
                interfaceC0068i0.Z0(Zf.L(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f6682q == null) {
            Y9.s("Ad inspector had an internal error.");
            try {
                N1.n.f1204A.f1209g.h("InspectorUi.shouldOpenUi", new NullPointerException("InspectorManager null"));
                interfaceC0068i0.Z0(Zf.L(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f6684s && !this.f6685t) {
            N1.n.f1204A.f1212j.getClass();
            if (System.currentTimeMillis() >= this.f6686u + ((Integer) r1.c.a(AbstractC1066q6.S7)).intValue()) {
                return true;
            }
        }
        Y9.s("Ad inspector cannot be opened because it is already open.");
        try {
            interfaceC0068i0.Z0(Zf.L(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // P1.g
    public final void q1() {
    }

    @Override // P1.g
    public final void y3() {
    }
}
