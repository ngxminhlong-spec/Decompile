package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.fi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0613fi implements Yg, P1.g, Sg {

    /* renamed from: o, reason: collision with root package name */
    public final Context f8717o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC0308Md f8718p;

    /* renamed from: q, reason: collision with root package name */
    public final C1434yp f8719q;

    /* renamed from: r, reason: collision with root package name */
    public final C0248Bc f8720r;

    /* renamed from: s, reason: collision with root package name */
    public final EnumC0807k5 f8721s;

    /* renamed from: t, reason: collision with root package name */
    public Pq f8722t;

    public C0613fi(Context context, InterfaceC0308Md interfaceC0308Md, C1434yp c1434yp, C0248Bc c0248Bc, EnumC0807k5 enumC0807k5) {
        this.f8717o = context;
        this.f8718p = interfaceC0308Md;
        this.f8719q = c1434yp;
        this.f8720r = c0248Bc;
        this.f8721s = enumC0807k5;
    }

    @Override // P1.g
    public final void L2(int i4) {
        this.f8722t = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, r.i] */
    @Override // com.google.android.gms.internal.ads.Yg
    public final void M() {
        InterfaceC0308Md interfaceC0308Md;
        EnumC0807k5 enumC0807k5 = EnumC0807k5.f9270w;
        EnumC0807k5 enumC0807k52 = this.f8721s;
        if (enumC0807k52 == enumC0807k5 || enumC0807k52 == EnumC0807k5.f9266s || enumC0807k52 == EnumC0807k5.f9272z) {
            C1434yp c1434yp = this.f8719q;
            if (!c1434yp.f11493T || (interfaceC0308Md = this.f8718p) == 0) {
                return;
            }
            N1.n nVar = N1.n.f1204A;
            C0347Uc c0347Uc = nVar.f1224v;
            C0347Uc c0347Uc2 = nVar.f1224v;
            c0347Uc.getClass();
            if (C0347Uc.n(this.f8717o)) {
                C0248Bc c0248Bc = this.f8720r;
                String str = c0248Bc.f4085p + "." + c0248Bc.f4086q;
                Xj xj = c1434yp.f11495V;
                int i4 = 1;
                String str2 = xj.q() + (-1) != 1 ? "javascript" : null;
                int i5 = 2;
                if (xj.q() == 1) {
                    i4 = 3;
                } else {
                    i5 = c1434yp.f11498Y == 2 ? 4 : 1;
                }
                int i6 = i5;
                int i7 = i4;
                WebView m02 = interfaceC0308Md.m0();
                String str3 = c1434yp.f11521l0;
                c0347Uc2.getClass();
                Pq e4 = C0347Uc.e(i6, i7, m02, str, str2, str3);
                this.f8722t = e4;
                if (e4 != null) {
                    c0347Uc2.getClass();
                    C0347Uc.s(new RunnableC0532dm(e4, (View) interfaceC0308Md, 1));
                    interfaceC0308Md.T(this.f8722t);
                    Pq pq = this.f8722t;
                    c0347Uc2.getClass();
                    C0347Uc.m(pq);
                    interfaceC0308Md.b("onSdkLoaded", new r.i(0));
                }
            }
        }
    }

    @Override // P1.g
    public final void O() {
    }

    @Override // P1.g
    public final void W2() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, r.i] */
    @Override // P1.g
    public final void a0() {
        InterfaceC0308Md interfaceC0308Md;
        if (this.f8722t == null || (interfaceC0308Md = this.f8718p) == 0) {
            return;
        }
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.v4)).booleanValue()) {
            return;
        }
        interfaceC0308Md.b("onSdkImpression", new r.i(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, r.i] */
    @Override // com.google.android.gms.internal.ads.Sg
    public final void p() {
        InterfaceC0308Md interfaceC0308Md;
        if (this.f8722t == null || (interfaceC0308Md = this.f8718p) == 0) {
            return;
        }
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.v4)).booleanValue()) {
            interfaceC0308Md.b("onSdkImpression", new r.i(0));
        }
    }

    @Override // P1.g
    public final void q1() {
    }

    @Override // P1.g
    public final void y3() {
    }
}
