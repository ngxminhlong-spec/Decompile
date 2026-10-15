package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.InputEvent;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.i9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0727i9 implements Du {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9030a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9031b;
    public final Object c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9032e;

    public C0727i9(Z8 z8, String str, InterfaceC0555e9 interfaceC0555e9, InterfaceC0513d9 interfaceC0513d9) {
        this.f9030a = 0;
        this.f9032e = z8;
        this.f9031b = str;
        this.d = interfaceC0555e9;
        this.c = interfaceC0513d9;
    }

    public /* synthetic */ C0727i9(C0567ef c0567ef, Uri.Builder builder, String str, InputEvent inputEvent) {
        this.f9030a = 1;
        this.c = c0567ef;
        this.d = builder;
        this.f9031b = str;
        this.f9032e = inputEvent;
    }

    public /* synthetic */ C0727i9(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.f9030a = i4;
        this.c = obj;
        this.d = obj2;
        this.f9032e = obj3;
        this.f9031b = obj4;
    }

    public InterfaceFutureC0239a a(Object obj) {
        C0272Fc c0272Fc = new C0272Fc();
        X8 b4 = ((Z8) this.f9032e).b();
        Q1.I.w("callJs > getEngine: Promise created");
        b4.m(new u0.g(this, b4, obj, c0272Fc, 5, false), new C0783ji(18, c0272Fc, b4));
        return c0272Fc;
    }

    @Override // com.google.android.gms.internal.ads.Du
    public final InterfaceFutureC0239a l(Object obj) {
        Pu h02;
        switch (this.f9030a) {
            case 0:
                return a(obj);
            case 1:
                C0567ef c0567ef = (C0567ef) this.c;
                Uri.Builder builder = (Uri.Builder) this.d;
                String str = (String) this.f9031b;
                InputEvent inputEvent = (InputEvent) this.f9032e;
                if (((Integer) obj).intValue() != 1) {
                    builder.appendQueryParameter((String) O1.r.d.c.a(AbstractC1066q6.J8), "10");
                    return Bs.h0(builder.toString());
                }
                Uri.Builder buildUpon = builder.build().buildUpon();
                C0937n6 c0937n6 = AbstractC1066q6.K8;
                SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = O1.r.d.c;
                buildUpon.appendQueryParameter((String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6), "1");
                buildUpon.appendQueryParameter((String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.J8), "12");
                if (str.contains((CharSequence) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.L8))) {
                    buildUpon.authority((String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.M8));
                }
                C0660gm c0660gm = c0567ef.c;
                Uri build = buildUpon.build();
                V.d dVar = c0660gm.f8864a;
                dVar.getClass();
                return Bs.n0(Ku.q(dVar.c(build, inputEvent)), new C0512d8(5, builder), c0567ef.f8626f);
            case 2:
                C0381a5 c0381a5 = (C0381a5) this.c;
                return Bs.n0(((InterfaceC1087ql) this.d).o((C0370Za) this.f9032e), (Du) this.f9031b, (Su) c0381a5.f8077p);
            case 3:
                Bm bm = (Bm) this.c;
                Uri uri = (Uri) this.d;
                Ep ep = (Ep) this.f9032e;
                C1434yp c1434yp = (C1434yp) this.f9031b;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    Object obj2 = null;
                    if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                        Bundle bundle = new Bundle();
                        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                        intent.putExtras(bundle);
                    }
                    intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                    intent.putExtras(new Bundle());
                    intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                    intent.setData(uri);
                    P1.b bVar = new P1.b(intent, null);
                    C0272Fc c0272Fc = new C0272Fc();
                    C0274Fe a4 = ((C0279Ge) bm.c).a(new Op(ep, c1434yp, (String) null), new C0783ji(24, new C1282v8(c0272Fc), obj2));
                    c0272Fc.b(new AdOverlayInfoParcel(bVar, null, (C0655gh) a4.f5053s.c(), null, new C0248Bc(0, 0, false, false), null, null));
                    ((C1391xp) bm.f4173e).c(2, 3);
                    return Bs.h0(a4.f0());
                } catch (Throwable th) {
                    Y9.q("Error in CustomTabsAdRenderer", th);
                    throw th;
                }
            case 4:
                Ym ym = (Ym) this.c;
                C1434yp c1434yp2 = (C1434yp) this.d;
                Ep ep2 = (Ep) this.f9032e;
                InterfaceC0745im interfaceC0745im = (InterfaceC0745im) this.f9031b;
                Aq f4 = Zf.f(ym.f7883j, 12);
                f4.F(c1434yp2.f11479E);
                f4.f();
                InterfaceFutureC0239a o02 = Bs.o0(interfaceC0745im.a(ep2, c1434yp2), c1434yp2.f11491R, TimeUnit.MILLISECONDS, ym.f7879f);
                ym.f7881h.b(ep2, c1434yp2, o02, ym.c);
                Zf.Z(o02, ym.f7884k, f4, false);
                return o02;
            default:
                Xq xq = (Xq) this.c;
                C1384xi c1384xi = (C1384xi) this.d;
                Op op = (Op) this.f9032e;
                C0450bp c0450bp = (C0450bp) this.f9031b;
                Yp yp = (Yp) obj;
                synchronized (xq) {
                    try {
                        xq.f7705p = true;
                        yp.f7898a = (InterfaceC1425yg) ((Xj) c1384xi.f11290p).f7687p;
                        if (xq.f7704o) {
                            h02 = Bs.h0(new C0578eq(yp, c0450bp));
                        } else {
                            op.w(c0450bp.f8290g, yp);
                            h02 = Pu.f6608p;
                        }
                    } finally {
                    }
                }
                return h02;
        }
    }
}
