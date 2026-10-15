package q1;

import C0.K;
import O1.C0;
import O1.D0;
import O1.InterfaceC0052a0;
import O1.r;
import android.app.Activity;
import android.os.RemoteException;
import android.util.Log;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1249uc;
import com.google.android.gms.internal.ads.BinderC0983o9;
import com.google.android.gms.internal.ads.C0831kn;
import com.google.android.gms.internal.ads.L6;
import com.google.android.gms.internal.ads.Wl;
import com.google.android.gms.internal.ads.Y9;
import d3.AbstractC1654b;
import f.AbstractActivityC1671f;
import g2.x;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import k.C1748e;
import k.o;
import t2.C1995b;
import t2.C1996c;
import t2.C2000g;
import t2.C2003j;
import t2.C2004k;
import t2.E;
import t2.G;
import t2.L;
import t2.N;
import t2.s;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: q1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1949d {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f14650a;
    public static int d;

    /* renamed from: e, reason: collision with root package name */
    public static int f14652e;

    /* renamed from: f, reason: collision with root package name */
    public static L f14653f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f14654g;

    /* renamed from: b, reason: collision with root package name */
    public static Date f14651b = new Date(0);
    public static final int c = 5000;

    /* renamed from: h, reason: collision with root package name */
    public static final HashSet f14655h = new HashSet();

    public static void a() {
        Iterator it = f14655h.iterator();
        while (it.hasNext()) {
            final MainActivity mainActivity = (MainActivity) ((InterfaceC1948c) it.next());
            mainActivity.getClass();
            if (b(mainActivity)) {
                if (mainActivity.f3576M) {
                    continue;
                } else {
                    mainActivity.f3576M = true;
                    K k3 = new K(mainActivity);
                    final D0 f4 = D0.f();
                    synchronized (f4.f1268a) {
                        try {
                            if (f4.f1269b) {
                                ((ArrayList) f4.f1270e).add(k3);
                            } else if (f4.c) {
                                f4.d();
                                k3.a();
                            } else {
                                f4.f1269b = true;
                                ((ArrayList) f4.f1270e).add(k3);
                                synchronized (f4.d) {
                                    try {
                                        f4.a(mainActivity);
                                        ((InterfaceC0052a0) f4.f1271f).g1(new C0(0, f4));
                                        ((InterfaceC0052a0) f4.f1271f).p0(new BinderC0983o9());
                                        ((H1.m) f4.f1272g).getClass();
                                        ((H1.m) f4.f1272g).getClass();
                                    } catch (RemoteException e4) {
                                        Y9.t("MobileAdsSettingManager initialization failed", e4);
                                    }
                                    AbstractC1066q6.a(mainActivity);
                                    if (((Boolean) L6.f6123a.r()).booleanValue()) {
                                        if (((Boolean) r.d.c.a(AbstractC1066q6.w9)).booleanValue()) {
                                            Y9.m("Initializing on bg thread");
                                            final int i4 = 0;
                                            AbstractC1249uc.f10788a.execute(new Runnable() { // from class: O1.B0
                                                private final void a() {
                                                    D0 d02 = f4;
                                                    MainActivity mainActivity2 = mainActivity;
                                                    synchronized (d02.d) {
                                                        d02.p(mainActivity2);
                                                    }
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i4) {
                                                        case 0:
                                                            a();
                                                            return;
                                                        default:
                                                            D0 d02 = f4;
                                                            MainActivity mainActivity2 = mainActivity;
                                                            synchronized (d02.d) {
                                                                d02.p(mainActivity2);
                                                            }
                                                            return;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    if (((Boolean) L6.f6124b.r()).booleanValue()) {
                                        if (((Boolean) r.d.c.a(AbstractC1066q6.w9)).booleanValue()) {
                                            final int i5 = 1;
                                            AbstractC1249uc.f10789b.execute(new Runnable() { // from class: O1.B0
                                                private final void a() {
                                                    D0 d02 = f4;
                                                    MainActivity mainActivity2 = mainActivity;
                                                    synchronized (d02.d) {
                                                        d02.p(mainActivity2);
                                                    }
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    switch (i5) {
                                                        case 0:
                                                            a();
                                                            return;
                                                        default:
                                                            D0 d02 = f4;
                                                            MainActivity mainActivity2 = mainActivity;
                                                            synchronized (d02.d) {
                                                                d02.p(mainActivity2);
                                                            }
                                                            return;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    Y9.m("Initializing on calling thread");
                                    f4.p(mainActivity);
                                }
                            }
                        } finally {
                        }
                    }
                }
            } else if (f14652e == 0) {
                AbstractC1654b.E("FIRST_NO_ADS");
            }
        }
    }

    public static boolean b(Activity activity) {
        boolean z4;
        if (!AbstractC1959n.d(activity) && !AbstractC1959n.b(activity) && !AbstractC1959n.c(activity)) {
            Boolean bool = f14650a;
            if (bool != null) {
                z4 = bool.booleanValue();
            } else {
                z4 = activity.getPreferences(0).getBoolean("can_show_ads_new2", false);
                f14650a = Boolean.valueOf(z4);
            }
            if (z4 && f14654g) {
                return true;
            }
        }
        return false;
    }

    public static void c(final AbstractActivityC1671f abstractActivityC1671f, final boolean z4) {
        if (f14653f == null) {
            f14653f = (L) ((E) C1995b.s(abstractActivityC1671f).f14886u).c();
        }
        C2033d c2033d = new C2033d(17);
        L l4 = f14653f;
        b3.b bVar = new b3.b() { // from class: q1.a
            @Override // b3.b
            public final void f() {
                boolean z5;
                Activity activity = abstractActivityC1671f;
                boolean z6 = z4;
                final C1947b c1947b = new C1947b(activity);
                if (!z6) {
                    if (((L) ((E) C1995b.s(activity).f14886u).c()).a()) {
                        c1947b.a();
                        return;
                    }
                    C2003j c2003j = (C2003j) ((E) C1995b.s(activity).f14884s).c();
                    s.a();
                    Wl wl = new Wl(21, activity, c1947b);
                    o oVar = new o(14, c1947b);
                    c2003j.getClass();
                    s.a();
                    C2004k c2004k = (C2004k) c2003j.c.get();
                    if (c2004k == null) {
                        oVar.b(new t2.K("No available form can be built.", 3).a());
                        return;
                    }
                    C1748e c1748e = (C1748e) c2003j.f14910a.c();
                    c1748e.getClass();
                    C1995b c1995b = (C1995b) c1748e.f13386p;
                    E a4 = E.a(new C1748e(15, (G) c1995b.f14881p));
                    G g4 = new G(c2004k);
                    o oVar2 = new o(16);
                    G g5 = (G) c1995b.f14881p;
                    E e4 = (E) c1995b.f14885t;
                    C1996c c1996c = (C1996c) c1995b.f14887v;
                    E e5 = (E) c1995b.f14882q;
                    E a5 = E.a(new N1.l(g5, (E) c1995b.f14883r, a4, e5, g4, new C0831kn(19, a4, new N1.l(g5, a4, e4, c1996c, oVar2, e5, 5)), 4));
                    if (((E) oVar2.f13452p) != null) {
                        throw new IllegalStateException();
                    }
                    oVar2.f13452p = a5;
                    ((C2000g) oVar2.c()).b(wl, oVar);
                    return;
                }
                C2003j c2003j2 = (C2003j) ((E) C1995b.s(activity).f14884s).c();
                c2003j2.getClass();
                s.a();
                L l5 = (L) ((E) C1995b.s(activity).f14886u).c();
                if (l5 == null) {
                    final int i4 = 0;
                    s.f14935a.post(new Runnable() { // from class: t2.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    new K("No consentInformation.", 1).a();
                                    c1947b.a();
                                    return;
                                case 1:
                                    new K("No valid response received yet.", 3).a();
                                    c1947b.a();
                                    return;
                                case 2:
                                    new K("Privacy options form is not required.", 3).a();
                                    c1947b.a();
                                    return;
                                default:
                                    new K("Privacy options form is being loading. Please try again later.", 3).a();
                                    c1947b.a();
                                    return;
                            }
                        }
                    });
                    return;
                }
                if (l5.c.c.get() != null || l5.b() == 2) {
                    if (l5.b() == 2) {
                        final int i5 = 2;
                        s.f14935a.post(new Runnable() { // from class: t2.i
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i5) {
                                    case 0:
                                        new K("No consentInformation.", 1).a();
                                        c1947b.a();
                                        return;
                                    case 1:
                                        new K("No valid response received yet.", 3).a();
                                        c1947b.a();
                                        return;
                                    case 2:
                                        new K("Privacy options form is not required.", 3).a();
                                        c1947b.a();
                                        return;
                                    default:
                                        new K("Privacy options form is being loading. Please try again later.", 3).a();
                                        c1947b.a();
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    C2000g c2000g = (C2000g) c2003j2.d.get();
                    if (c2000g == null) {
                        final int i6 = 3;
                        s.f14935a.post(new Runnable() { // from class: t2.i
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i6) {
                                    case 0:
                                        new K("No consentInformation.", 1).a();
                                        c1947b.a();
                                        return;
                                    case 1:
                                        new K("No valid response received yet.", 3).a();
                                        c1947b.a();
                                        return;
                                    case 2:
                                        new K("Privacy options form is not required.", 3).a();
                                        c1947b.a();
                                        return;
                                    default:
                                        new K("Privacy options form is being loading. Please try again later.", 3).a();
                                        c1947b.a();
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        c2000g.a(activity, c1947b);
                        c2003j2.f14911b.execute(new x(13, c2003j2));
                        return;
                    }
                }
                final int i7 = 1;
                s.f14935a.post(new Runnable() { // from class: t2.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                new K("No consentInformation.", 1).a();
                                c1947b.a();
                                return;
                            case 1:
                                new K("No valid response received yet.", 3).a();
                                c1947b.a();
                                return;
                            case 2:
                                new K("Privacy options form is not required.", 3).a();
                                c1947b.a();
                                return;
                            default:
                                new K("Privacy options form is being loading. Please try again later.", 3).a();
                                c1947b.a();
                                return;
                        }
                    }
                });
                if (l5.d()) {
                    synchronized (l5.f14866e) {
                        z5 = l5.f14868g;
                    }
                    if (!z5) {
                        l5.c(true);
                        C1995b c1995b2 = l5.f14865b;
                        ((Executor) c1995b2.f14882q).execute(new N(c1995b2, activity, l5.f14869h, new o(17, l5), new C1748e(16, l5)));
                        return;
                    }
                }
                Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + l5.d() + ", retryRequestIsInProgress=" + l5.e());
            }
        };
        D3.b bVar2 = new D3.b(14);
        synchronized (l4.d) {
            l4.f14867f = true;
        }
        l4.f14869h = c2033d;
        C1995b c1995b = l4.f14865b;
        ((Executor) c1995b.f14882q).execute(new N(c1995b, abstractActivityC1671f, c2033d, bVar, bVar2));
        f14654g = f14653f.a();
        a();
    }
}
