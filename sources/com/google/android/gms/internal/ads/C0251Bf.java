package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.measurement.C1510e1;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Bf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251Bf extends Yf {

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0308Md f4138j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4139k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f4140l;

    /* renamed from: m, reason: collision with root package name */
    public final Op f4141m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0570ei f4142n;

    /* renamed from: o, reason: collision with root package name */
    public final C0963nq f4143o;

    /* renamed from: p, reason: collision with root package name */
    public final Og f4144p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f4145q;

    /* renamed from: r, reason: collision with root package name */
    public final C1163sc f4146r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4147s;

    public C0251Bf(C1151s6 c1151s6, Context context, InterfaceC0308Md interfaceC0308Md, int i4, Op op, InterfaceC0570ei interfaceC0570ei, C0963nq c0963nq, Og og, C1163sc c1163sc) {
        super(c1151s6);
        this.f4147s = false;
        this.f4138j = interfaceC0308Md;
        this.f4140l = context;
        this.f4139k = i4;
        this.f4141m = op;
        this.f4142n = interfaceC0570ei;
        this.f4143o = c0963nq;
        this.f4144p = og;
        this.f4145q = ((Boolean) O1.r.d.c.a(AbstractC1066q6.B4)).booleanValue();
        this.f4146r = c1163sc;
    }

    public final void b() {
        Ug ug = this.c;
        ug.getClass();
        ug.n1(new C0894m6(null, 3));
        InterfaceC0308Md interfaceC0308Md = this.f4138j;
        if (interfaceC0308Md != null) {
            interfaceC0308Md.destroy();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v15, types: [android.content.Context] */
    public final void c(Activity activity, boolean z4) {
        InterfaceC0308Md interfaceC0308Md;
        C1434yp x4;
        int a4;
        C0963nq c0963nq = this.f4143o;
        boolean z5 = this.f4145q;
        Og og = this.f4144p;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f4140l;
        }
        if (z5) {
            c0963nq.n1(C0782jh.f9207x);
        }
        C0937n6 c0937n6 = AbstractC1066q6.f10277r0;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            N1.n nVar = N1.n.f1204A;
            Q1.N n4 = nVar.c;
            if (Q1.N.d(activity2)) {
                Y9.s("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                og.c();
                if (((Boolean) rVar.c.a(AbstractC1066q6.f10281s0)).booleanValue()) {
                    new C1221tr(activity2.getApplicationContext(), nVar.f1220r.b()).a(((Ap) this.f7858a.f4943b.f6526q).f3998b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) rVar.c.a(AbstractC1066q6.aa)).booleanValue() && (interfaceC0308Md = this.f4138j) != null && (x4 = interfaceC0308Md.x()) != null && x4.f11531q0) {
            int i4 = x4.f11533r0;
            C1163sc c1163sc = this.f4146r;
            synchronized (c1163sc.f10603a) {
                a4 = c1163sc.d.a();
            }
            if (i4 != a4) {
                Y9.s("The app open consent form has been shown.");
                og.r(Zf.L(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.f4147s) {
            Y9.s("App open interstitial ad is already visible.");
            og.r(Zf.L(10, null, null));
        }
        if (this.f4147s) {
            return;
        }
        try {
            this.f4142n.j(z4, activity2, og);
            if (z5) {
                c0963nq.n1(C0782jh.y);
            }
            this.f4147s = true;
        } catch (C0528di e4) {
            og.M0(e4);
        }
    }

    public final void d(int i4, long j4) {
        Op op = this.f4141m;
        Ep ep = (Ep) op.f6527r;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.B7)).booleanValue()) {
            InterfaceC1263uq interfaceC1263uq = (InterfaceC1263uq) op.f6525p;
            C1220tq b4 = C1220tq.b("ad_closed");
            b4.e((Ap) ep.f4943b.f6526q);
            b4.a("show_time", String.valueOf(j4));
            b4.a("ad_format", "app_open_ad");
            b4.a("acr", Op.s(i4));
            interfaceC1263uq.b(b4);
            return;
        }
        C1510e1 a4 = ((C0658gk) op.f6526q).a();
        ((ConcurrentHashMap) a4.f11914p).put("gqi", ((Ap) ep.f4943b.f6526q).f3998b);
        a4.A("action", "ad_closed");
        a4.A("show_time", String.valueOf(j4));
        a4.A("ad_format", "app_open_ad");
        a4.A("acr", Op.s(i4));
        a4.E();
    }
}
