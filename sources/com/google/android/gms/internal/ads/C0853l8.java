package com.google.android.gms.internal.ads;

import O1.C0081p;
import O1.InterfaceC0051a;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.measurement.C1510e1;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.l8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0853l8 implements InterfaceC0597f8 {

    /* renamed from: o, reason: collision with root package name */
    public final N1.a f9369o;

    /* renamed from: p, reason: collision with root package name */
    public final C0658gk f9370p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC1263uq f9371q;

    /* renamed from: s, reason: collision with root package name */
    public final C0648ga f9373s;

    /* renamed from: t, reason: collision with root package name */
    public final Xl f9374t;

    /* renamed from: u, reason: collision with root package name */
    public final C0567ef f9375u;

    /* renamed from: v, reason: collision with root package name */
    public P1.j f9376v = null;

    /* renamed from: w, reason: collision with root package name */
    public final C0260Dc f9377w = AbstractC0266Ec.f4900f;

    /* renamed from: r, reason: collision with root package name */
    public final C0242Ac f9372r = new C0242Ac(null);

    public C0853l8(N1.a aVar, C0648ga c0648ga, Xl xl, C0658gk c0658gk, InterfaceC1263uq interfaceC1263uq, C0567ef c0567ef) {
        this.f9369o = aVar;
        this.f9373s = c0648ga;
        this.f9374t = xl;
        this.f9370p = c0658gk;
        this.f9371q = interfaceC1263uq;
        this.f9375u = c0567ef;
    }

    public static int a(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri b(Context context, I3 i32, Uri uri, View view, Activity activity) {
        if (i32 != null) {
            try {
                boolean z4 = false;
                if (i32.b(uri)) {
                    String[] strArr = I3.c;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= 3) {
                            break;
                        }
                        if (uri.getPath().endsWith(strArr[i4])) {
                            z4 = true;
                            break;
                        }
                        i4++;
                    }
                }
                if (z4) {
                    return i32.a(uri, context, view, activity);
                }
            } catch (J3 unused) {
            } catch (Exception e4) {
                N1.n.f1204A.f1209g.h("OpenGmsgHandler.maybeAddClickSignalsToUri", e4);
            }
        }
        return uri;
    }

    public static Uri c(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e4) {
            Y9.q("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e4);
            return uri;
        }
    }

    public final void d(Context context, String str, String str2) {
        this.f9374t.a(str);
        C0658gk c0658gk = this.f9370p;
        if (c0658gk != null) {
            Bs.F("dialog_not_shown_reason", str2);
            BinderC0489cm.K3(context, c0658gk, this.f9371q, this.f9374t, str, "dialog_not_shown", Lt.c(1, new Object[]{"dialog_not_shown_reason", str2}, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0106, code lost:
    
        if (com.google.android.gms.internal.ads.AbstractC1230u.O(r11, new java.util.ArrayList(), r5) == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0149, code lost:
    
        r5 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(O1.InterfaceC0051a r17, java.util.Map r18, boolean r19, java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0853l8.e(O1.a, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    public final void f(boolean z4) {
        C0648ga c0648ga = this.f9373s;
        if (c0648ga != null) {
            c0648ga.K(z4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) O1.r.d.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.t7)).booleanValue() : ((java.lang.Boolean) O1.r.d.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.s7)).booleanValue()) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(O1.InterfaceC0051a r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0853l8.g(O1.a, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0597f8
    public final void h(Object obj, Map map) {
        C0567ef c0567ef;
        InterfaceC0051a interfaceC0051a = (InterfaceC0051a) obj;
        String I4 = AbstractC1230u.I(((InterfaceC0308Md) interfaceC0051a).getContext(), (String) map.get("u"), true);
        String str = (String) map.get("a");
        if (str == null) {
            Y9.s("Action missing from an open GMSG.");
            return;
        }
        N1.a aVar = this.f9369o;
        if (aVar != null && !aVar.b()) {
            aVar.a(I4);
        } else {
            InterfaceFutureC0239a h02 = (!((Boolean) O1.r.d.c.a(AbstractC1066q6.G8)).booleanValue() || (c0567ef = this.f9375u) == null) ? Bs.h0(I4) : c0567ef.a(I4, C0081p.f1374f.f1377e);
            h02.a(new Nu(0, h02, new u0.g(this, interfaceC0051a, map, str, 4, false)), this.f9377w);
        }
    }

    public final void i(int i4) {
        C0658gk c0658gk = this.f9370p;
        if (c0658gk == null) {
            return;
        }
        String str = "CONTEXT_NOT_AN_ACTIVITY";
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.B7)).booleanValue()) {
            switch (i4) {
                case 2:
                    break;
                case 3:
                    str = "CONTEXT_NULL";
                    break;
                case 4:
                    str = "CCT_NOT_SUPPORTED";
                    break;
                case 5:
                    str = "CCT_READY_TO_OPEN";
                    break;
                case 6:
                    str = "ACTIVITY_NOT_FOUND";
                    break;
                case 7:
                    str = "EMPTY_URL";
                    break;
                case 8:
                    str = "UNKNOWN";
                    break;
                default:
                    str = "WRONG_EXP_SETUP";
                    break;
            }
            C1220tq b4 = C1220tq.b("cct_action");
            b4.a("cct_open_status", str);
            this.f9371q.b(b4);
            return;
        }
        C1510e1 a4 = c0658gk.a();
        a4.A("action", "cct_action");
        switch (i4) {
            case 2:
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            default:
                str = "WRONG_EXP_SETUP";
                break;
        }
        a4.A("cct_open_status", str);
        a4.E();
    }
}
