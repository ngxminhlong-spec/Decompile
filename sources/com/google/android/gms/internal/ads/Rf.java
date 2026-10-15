package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Rf implements Yg, Sg {

    /* renamed from: o, reason: collision with root package name */
    public final Context f6808o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC0308Md f6809p;

    /* renamed from: q, reason: collision with root package name */
    public final C1434yp f6810q;

    /* renamed from: r, reason: collision with root package name */
    public final C0248Bc f6811r;

    /* renamed from: s, reason: collision with root package name */
    public Pq f6812s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6813t;

    public Rf(Context context, InterfaceC0308Md interfaceC0308Md, C1434yp c1434yp, C0248Bc c0248Bc) {
        this.f6808o = context;
        this.f6809p = interfaceC0308Md;
        this.f6810q = c1434yp;
        this.f6811r = c0248Bc;
    }

    @Override // com.google.android.gms.internal.ads.Yg
    public final synchronized void M() {
        if (this.f6813t) {
            return;
        }
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map, r.i] */
    public final synchronized void a() {
        int i4;
        int i5;
        if (this.f6810q.f11493T && this.f6809p != null) {
            Context context = this.f6808o;
            N1.n nVar = N1.n.f1204A;
            nVar.f1224v.getClass();
            if (C0347Uc.n(context)) {
                C0248Bc c0248Bc = this.f6811r;
                String str = c0248Bc.f4085p + "." + c0248Bc.f4086q;
                Xj xj = this.f6810q.f11495V;
                String str2 = xj.q() + (-1) != 1 ? "javascript" : null;
                if (xj.q() == 1) {
                    i4 = 2;
                    i5 = 3;
                } else if (this.f6810q.f11506e == 1) {
                    i4 = 3;
                    i5 = 1;
                } else {
                    i4 = 1;
                    i5 = 1;
                }
                InterfaceC0308Md interfaceC0308Md = this.f6809p;
                C1434yp c1434yp = this.f6810q;
                C0347Uc c0347Uc = nVar.f1224v;
                WebView m02 = interfaceC0308Md.m0();
                String str3 = c1434yp.f11521l0;
                c0347Uc.getClass();
                Pq e4 = C0347Uc.e(i4, i5, m02, str, str2, str3);
                this.f6812s = e4;
                Object obj = this.f6809p;
                if (e4 != null) {
                    nVar.f1224v.getClass();
                    C0347Uc.s(new RunnableC0532dm(e4, (View) obj, 1));
                    this.f6809p.T(this.f6812s);
                    C0347Uc c0347Uc2 = nVar.f1224v;
                    Pq pq = this.f6812s;
                    c0347Uc2.getClass();
                    C0347Uc.m(pq);
                    this.f6813t = true;
                    this.f6809p.b("onSdkLoaded", new r.i(0));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, r.i] */
    @Override // com.google.android.gms.internal.ads.Sg
    public final synchronized void p() {
        InterfaceC0308Md interfaceC0308Md;
        try {
            if (!this.f6813t) {
                a();
            }
            if (!this.f6810q.f11493T || this.f6812s == null || (interfaceC0308Md = this.f6809p) == 0) {
                return;
            }
            interfaceC0308Md.b("onSdkImpression", new r.i(0));
        } catch (Throwable th) {
            throw th;
        }
    }
}
