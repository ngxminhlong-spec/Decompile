package com.google.android.gms.internal.ads;

import O1.C0070j0;
import O1.InterfaceC0074l0;
import O1.InterfaceC0084q0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.vp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1305vp extends AbstractBinderC1119rb {

    /* renamed from: p, reason: collision with root package name */
    public final C1219tp f11066p;

    /* renamed from: q, reason: collision with root package name */
    public final C1133rp f11067q;

    /* renamed from: r, reason: collision with root package name */
    public final String f11068r;

    /* renamed from: s, reason: collision with root package name */
    public final Fp f11069s;

    /* renamed from: t, reason: collision with root package name */
    public final Context f11070t;

    /* renamed from: u, reason: collision with root package name */
    public final C0248Bc f11071u;

    /* renamed from: v, reason: collision with root package name */
    public final I3 f11072v;

    /* renamed from: w, reason: collision with root package name */
    public final C0658gk f11073w;

    /* renamed from: x, reason: collision with root package name */
    public Hj f11074x;
    public boolean y = ((Boolean) O1.r.d.c.a(AbstractC1066q6.f10286t0)).booleanValue();

    public BinderC1305vp(String str, C1219tp c1219tp, Context context, C1133rp c1133rp, Fp fp, C0248Bc c0248Bc, I3 i32, C0658gk c0658gk) {
        this.f11068r = str;
        this.f11066p = c1219tp;
        this.f11067q = c1133rp;
        this.f11069s = fp;
        this.f11070t = context;
        this.f11071u = c0248Bc;
        this.f11072v = i32;
        this.f11073w = c0658gk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1162sb
    public final synchronized void A0(boolean z4) {
        h2.y.d("setImmersiveMode must be called on the main UI thread.");
        this.y = z4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1162sb
    public final synchronized void I(InterfaceC1812a interfaceC1812a) {
        q2(interfaceC1812a, this.y);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1162sb
    public final synchronized void J1(C0259Db c0259Db) {
        h2.y.d("#008 Must be called on the main UI thread.");
        Fp fp = this.f11069s;
        fp.f5086a = c0259Db.f4620o;
        fp.f5087b = c0259Db.f4621p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, com.google.android.gms.internal.ads.Zf] */
    public final synchronized void K3(O1.U0 u02, InterfaceC1463zb interfaceC1463zb, int i4) {
        try {
            boolean z4 = false;
            if (((Boolean) L6.f6131k.r()).booleanValue()) {
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.x9)).booleanValue()) {
                    z4 = true;
                }
            }
            if (this.f11071u.f4086q < ((Integer) O1.r.d.c.a(AbstractC1066q6.y9)).intValue() || !z4) {
                h2.y.d("#008 Must be called on the main UI thread.");
            }
            this.f11067q.f10530q.set(interfaceC1463zb);
            Q1.N n4 = N1.n.f1204A.c;
            if (Q1.N.e(this.f11070t) && u02.f1299G == null) {
                Y9.p("Failed to load the ad because app ID is missing.");
                this.f11067q.J(Zf.L(4, null, null));
                return;
            }
            if (this.f11074x != null) {
                return;
            }
            ?? obj = new Object();
            C1219tp c1219tp = this.f11066p;
            c1219tp.f10749h.f5739o.f14098p = i4;
            c1219tp.a(u02, this.f11068r, obj, new Xj(15, this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1162sb
    public final synchronized void O0(O1.U0 u02, InterfaceC1463zb interfaceC1463zb) {
        K3(u02, interfaceC1463zb, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1162sb
    public final synchronized void O1(O1.U0 u02, InterfaceC1463zb interfaceC1463zb) {
        K3(u02, interfaceC1463zb, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1162sb
    public final void R0(InterfaceC0074l0 interfaceC0074l0) {
        h2.y.d("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!interfaceC0074l0.d()) {
                this.f11073w.b();
            }
        } catch (RemoteException e4) {
            Y9.o("Error in making CSI ping for reporting paid event callback", e4);
        }
        this.f11067q.f10535v.set(interfaceC0074l0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1162sb
    public final void Y0(InterfaceC1291vb interfaceC1291vb) {
        h2.y.d("#008 Must be called on the main UI thread.");
        this.f11067q.f10531r.set(interfaceC1291vb);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1162sb
    public final synchronized String a() {
        Fg fg;
        Hj hj = this.f11074x;
        if (hj == null || (fg = hj.f7861f) == null) {
            return null;
        }
        return fg.f5059o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1162sb
    public final Bundle c() {
        h2.y.d("#008 Must be called on the main UI thread.");
        Hj hj = this.f11074x;
        return hj != null ? hj.b() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1162sb
    public final InterfaceC0084q0 e() {
        Hj hj;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.V5)).booleanValue() && (hj = this.f11074x) != null) {
            return hj.f7861f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1162sb
    public final InterfaceC1034pb i() {
        h2.y.d("#008 Must be called on the main UI thread.");
        Hj hj = this.f11074x;
        if (hj != null) {
            return hj.f5487q;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1162sb
    public final void m2(C0241Ab c0241Ab) {
        h2.y.d("#008 Must be called on the main UI thread.");
        this.f11067q.f10533t.set(c0241Ab);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1162sb
    public final boolean n() {
        h2.y.d("#008 Must be called on the main UI thread.");
        Hj hj = this.f11074x;
        return (hj == null || hj.f5490t) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1162sb
    public final synchronized void q2(InterfaceC1812a interfaceC1812a, boolean z4) {
        h2.y.d("#008 Must be called on the main UI thread.");
        if (this.f11074x == null) {
            Y9.s("Rewarded can not be shown before loaded");
            this.f11067q.r(Zf.L(9, null, null));
            return;
        }
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10242j2)).booleanValue()) {
            this.f11072v.f5531b.c(new Throwable().getStackTrace());
        }
        this.f11074x.c((Activity) BinderC1813b.C2(interfaceC1812a), z4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1162sb
    public final void r2(C0070j0 c0070j0) {
        C1133rp c1133rp = this.f11067q;
        if (c0070j0 == null) {
            c1133rp.f10529p.set(null);
        } else {
            c1133rp.f10529p.set(new C1262up(this, c0070j0, 0));
        }
    }
}
