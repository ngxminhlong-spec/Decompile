package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Hj extends Yf {

    /* renamed from: j, reason: collision with root package name */
    public final Context f5480j;

    /* renamed from: k, reason: collision with root package name */
    public final WeakReference f5481k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0570ei f5482l;

    /* renamed from: m, reason: collision with root package name */
    public final C0963nq f5483m;

    /* renamed from: n, reason: collision with root package name */
    public final Og f5484n;

    /* renamed from: o, reason: collision with root package name */
    public final C0527dh f5485o;

    /* renamed from: p, reason: collision with root package name */
    public final C0697hg f5486p;

    /* renamed from: q, reason: collision with root package name */
    public final BinderC0271Fb f5487q;

    /* renamed from: r, reason: collision with root package name */
    public final C1221tr f5488r;

    /* renamed from: s, reason: collision with root package name */
    public final Gp f5489s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5490t;

    public Hj(C1151s6 c1151s6, Context context, InterfaceC0308Md interfaceC0308Md, InterfaceC0570ei interfaceC0570ei, C0963nq c0963nq, Og og, C0527dh c0527dh, C0697hg c0697hg, C1434yp c1434yp, C1221tr c1221tr, Gp gp) {
        super(c1151s6);
        this.f5490t = false;
        this.f5480j = context;
        this.f5482l = interfaceC0570ei;
        this.f5481k = new WeakReference(interfaceC0308Md);
        this.f5483m = c0963nq;
        this.f5484n = og;
        this.f5485o = c0527dh;
        this.f5486p = c0697hg;
        this.f5488r = c1221tr;
        C0948nb c0948nb = c1434yp.f11520l;
        this.f5487q = new BinderC0271Fb(c0948nb != null ? c0948nb.f9731o : "", c0948nb != null ? c0948nb.f9732p : 1);
        this.f5489s = gp;
    }

    public final Bundle b() {
        Bundle bundle;
        C0527dh c0527dh = this.f5485o;
        synchronized (c0527dh) {
            bundle = new Bundle(c0527dh.f8496q);
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Activity activity, boolean z4) {
        C0937n6 c0937n6 = AbstractC1066q6.f10277r0;
        O1.r rVar = O1.r.d;
        boolean booleanValue = ((Boolean) rVar.c.a(c0937n6)).booleanValue();
        Context context = this.f5480j;
        Og og = this.f5484n;
        if (booleanValue) {
            Q1.N n4 = N1.n.f1204A.c;
            if (Q1.N.d(context)) {
                Y9.s("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                og.c();
                if (((Boolean) rVar.c.a(AbstractC1066q6.f10281s0)).booleanValue()) {
                    this.f5488r.a(((Ap) this.f7858a.f4943b.f6526q).f3998b);
                    return;
                }
                return;
            }
        }
        if (this.f5490t) {
            Y9.s("The rewarded ad have been showed.");
            og.r(Zf.L(10, null, null));
            return;
        }
        this.f5490t = true;
        C0782jh c0782jh = C0782jh.f9207x;
        C0963nq c0963nq = this.f5483m;
        c0963nq.n1(c0782jh);
        if (activity == null) {
            activity = context;
        }
        try {
            this.f5482l.j(z4, activity, og);
            c0963nq.n1(C0782jh.y);
        } catch (C0528di e4) {
            og.M0(e4);
        }
    }

    public final void finalize() {
        try {
            InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) this.f5481k.get();
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.T5)).booleanValue()) {
                if (!this.f5490t && interfaceC0308Md != null) {
                    AbstractC0266Ec.f4899e.execute(new RunnableC0343Td(interfaceC0308Md, 3));
                }
            } else if (interfaceC0308Md != null) {
                interfaceC0308Md.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}
