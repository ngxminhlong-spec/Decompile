package com.google.android.gms.internal.ads;

import O1.C0091u0;
import O1.InterfaceC0089t0;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.RemoteException;
import android.view.View;
import java.util.Collections;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.jh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0782jh implements Bh, InterfaceC0513d9, InterfaceC0749iq, Xf, InterfaceC0570ei {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9209o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9199p = new C0782jh(0);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9200q = new C0782jh(1);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9201r = new C0782jh(2);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9202s = new C0782jh(3);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9203t = new C0782jh(4);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9204u = new C0782jh(5);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9205v = new C0782jh(6);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9206w = new C0782jh(7);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9207x = new C0782jh(8);
    public static final /* synthetic */ C0782jh y = new C0782jh(9);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9208z = new C0782jh(10);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9181A = new C0782jh(11);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9182B = new C0782jh(12);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9183C = new C0782jh(13);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9184D = new C0782jh(14);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9185E = new C0782jh(15);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9186F = new C0782jh(16);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9187G = new C0782jh(17);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9188H = new C0782jh(18);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9189I = new C0782jh(19);

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9190J = new C0782jh(20);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9191K = new C0782jh(21);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9192L = new C0782jh(22);

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9193M = new C0782jh(23);
    public static final /* synthetic */ C0782jh N = new C0782jh(24);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9194O = new C0782jh(25);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9195P = new C0782jh(26);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9196Q = new C0782jh(27);

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9197R = new C0782jh(28);

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ C0782jh f9198S = new C0782jh(29);

    public /* synthetic */ C0782jh(int i4) {
        this.f9209o = i4;
    }

    @Override // com.google.android.gms.internal.ads.Xf, com.google.android.gms.internal.ads.Ls
    public InterfaceC0089t0 b() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0513d9
    public Object f(JSONObject jSONObject) {
        switch (this.f9209o) {
            case 24:
                return new C0393ab(jSONObject);
            default:
                return new C0393ab(jSONObject);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0570ei
    public void j(boolean z4, Context context, Og og) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0749iq
    public Object l(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        switch (this.f9209o) {
            case 25:
                Q1.I.w("Ad request signals:");
                Q1.I.w(jSONObject.toString(2));
                return jSONObject;
            default:
                Q1.I.w("GMS AdRequest Signals: ");
                Q1.I.w(jSONObject.toString(2));
                return jSONObject;
        }
    }

    @Override // com.google.android.gms.internal.ads.Bh
    /* renamed from: l */
    public void mo3l(Object obj) {
        boolean n4;
        switch (this.f9209o) {
            case 0:
                BinderC1432yn binderC1432yn = (BinderC1432yn) ((InterfaceC0868lh) obj);
                synchronized (binderC1432yn) {
                    try {
                        Object parent = binderC1432yn.f11462p.f8048f.getParent();
                        if (parent instanceof View) {
                            View view = (View) parent;
                            Q1.N n5 = N1.n.f1204A.c;
                            Context context = view.getContext();
                            Context applicationContext = context.getApplicationContext();
                            KeyguardManager keyguardManager = null;
                            PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
                            Object systemService = context.getSystemService("keyguard");
                            if (systemService != null && (systemService instanceof KeyguardManager)) {
                                keyguardManager = (KeyguardManager) systemService;
                            }
                            n4 = Q1.N.n(view, powerManager, keyguardManager);
                        } else {
                            n4 = false;
                        }
                        if (!n4) {
                            Zo zo = binderC1432yn.f11462p;
                            zo.f8050h.r1(zo.f8052j.a());
                            return;
                        }
                        O1.X0 x02 = binderC1432yn.f11466t.f5728b;
                        Ff ff = binderC1432yn.f11469w;
                        if (ff != null && ff.f() != null && binderC1432yn.f11466t.f5740p) {
                            x02 = Zf.c(binderC1432yn.f11461o, Collections.singletonList(binderC1432yn.f11469w.f()));
                        }
                        binderC1432yn.K3(x02);
                        try {
                            binderC1432yn.L3(binderC1432yn.f11466t.f5727a);
                            return;
                        } catch (RemoteException unused) {
                            Y9.s("Failed to refresh the banner ad.");
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 1:
                ((InterfaceC1125rh) obj).b();
                return;
            case 2:
                ((InterfaceC1211th) obj).g();
                return;
            case 3:
                ((InterfaceC1211th) obj).j();
                return;
            case 4:
                ((InterfaceC1426yh) obj).f();
                return;
            case 5:
                ((Ah) obj).b();
                return;
            case 6:
                ((Ih) obj).d();
                return;
            case 7:
                ((Ih) obj).a();
                return;
            case 8:
                ((Jh) obj).l();
                return;
            case 9:
                ((Jh) obj).k();
                return;
            case 10:
                ((Lh) obj).b();
                return;
            case 11:
                ((Lh) obj).c();
                return;
            case 12:
                ((Oh) obj).u();
                return;
            case 13:
                ((Sh) obj).u();
                return;
            case 14:
                ((Sh) obj).G0();
                return;
            case 15:
                Uh uh = (Uh) obj;
                if (uh.c) {
                    return;
                }
                uh.f7171b.b(uh.f7170a);
                uh.c = true;
                return;
            case 16:
                ((InterfaceC0982o8) obj).e();
                return;
            case 17:
                ((InterfaceC0982o8) obj).c();
                return;
            case 18:
                InterfaceC0089t0 J4 = ((Fj) obj).f5069a.J();
                C0091u0 c0091u0 = null;
                if (J4 != null) {
                    try {
                        c0091u0 = J4.g();
                    } catch (RemoteException unused2) {
                    }
                }
                if (c0091u0 == null) {
                    return;
                }
                try {
                    c0091u0.h();
                    return;
                } catch (RemoteException e4) {
                    Y9.t("Unable to call onVideoEnd()", e4);
                    return;
                }
            case 19:
                InterfaceC0089t0 J5 = ((Fj) obj).f5069a.J();
                C0091u0 c0091u02 = null;
                if (J5 != null) {
                    try {
                        c0091u02 = J5.g();
                    } catch (RemoteException unused3) {
                    }
                }
                if (c0091u02 == null) {
                    return;
                }
                try {
                    c0091u02.a();
                    return;
                } catch (RemoteException e5) {
                    Y9.t("Unable to call onVideoEnd()", e5);
                    return;
                }
            case 20:
                InterfaceC0089t0 J6 = ((Fj) obj).f5069a.J();
                C0091u0 c0091u03 = null;
                if (J6 != null) {
                    try {
                        c0091u03 = J6.g();
                    } catch (RemoteException unused4) {
                    }
                }
                if (c0091u03 == null) {
                    return;
                }
                try {
                    c0091u03.g();
                    return;
                } catch (RemoteException e6) {
                    Y9.t("Unable to call onVideoEnd()", e6);
                    return;
                }
            default:
                ((Fj) obj).getClass();
                return;
        }
    }
}
