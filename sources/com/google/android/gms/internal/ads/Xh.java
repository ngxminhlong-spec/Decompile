package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Xh extends Yf {

    /* renamed from: j, reason: collision with root package name */
    public final Context f7675j;

    /* renamed from: k, reason: collision with root package name */
    public final WeakReference f7676k;

    /* renamed from: l, reason: collision with root package name */
    public final C0963nq f7677l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC0570ei f7678m;

    /* renamed from: n, reason: collision with root package name */
    public final C0697hg f7679n;

    /* renamed from: o, reason: collision with root package name */
    public final C1221tr f7680o;

    /* renamed from: p, reason: collision with root package name */
    public final Og f7681p;

    /* renamed from: q, reason: collision with root package name */
    public final C1163sc f7682q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7683r;

    public Xh(C1151s6 c1151s6, Context context, InterfaceC0308Md interfaceC0308Md, C0963nq c0963nq, InterfaceC0570ei interfaceC0570ei, C0697hg c0697hg, C1221tr c1221tr, Og og, C1163sc c1163sc) {
        super(c1151s6);
        this.f7683r = false;
        this.f7675j = context;
        this.f7676k = new WeakReference(interfaceC0308Md);
        this.f7677l = c0963nq;
        this.f7678m = interfaceC0570ei;
        this.f7679n = c0697hg;
        this.f7680o = c1221tr;
        this.f7681p = og;
        this.f7682q = c1163sc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Activity activity, boolean z4) {
        C1434yp x4;
        int a4;
        Context context = this.f7675j;
        Og og = this.f7681p;
        C0963nq c0963nq = this.f7677l;
        c0963nq.n1(C0782jh.f9207x);
        C0937n6 c0937n6 = AbstractC1066q6.f10277r0;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            Q1.N n4 = N1.n.f1204A.c;
            if (Q1.N.d(context)) {
                Y9.s("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                og.c();
                if (((Boolean) rVar.c.a(AbstractC1066q6.f10281s0)).booleanValue()) {
                    this.f7680o.a(((Ap) this.f7858a.f4943b.f6526q).f3998b);
                    return;
                }
                return;
            }
        }
        InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) this.f7676k.get();
        if (((Boolean) rVar.c.a(AbstractC1066q6.aa)).booleanValue() && interfaceC0308Md != null && (x4 = interfaceC0308Md.x()) != null && x4.f11531q0) {
            int i4 = x4.f11533r0;
            C1163sc c1163sc = this.f7682q;
            synchronized (c1163sc.f10603a) {
                a4 = c1163sc.d.a();
            }
            if (i4 != a4) {
                Y9.s("The interstitial consent form has been shown.");
                og.r(Zf.L(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f7683r) {
            Y9.s("The interstitial ad has been shown.");
            og.r(Zf.L(10, null, null));
        }
        if (this.f7683r) {
            return;
        }
        if (activity == null) {
            activity = context;
        }
        try {
            this.f7678m.j(z4, activity, og);
            c0963nq.n1(C0782jh.y);
            this.f7683r = true;
        } catch (C0528di e4) {
            og.M0(e4);
        }
    }

    public final void finalize() {
        try {
            InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) this.f7676k.get();
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.T5)).booleanValue()) {
                if (!this.f7683r && interfaceC0308Md != null) {
                    AbstractC0266Ec.f4899e.execute(new RunnableC0343Td(interfaceC0308Md, 1));
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
