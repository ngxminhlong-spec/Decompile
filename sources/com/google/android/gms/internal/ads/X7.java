package com.google.android.gms.internal.ads;

import O1.C0069j;
import O1.C0077n;
import O1.C0081p;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class X7 implements InterfaceC0597f8 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7603o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f7604p;

    public /* synthetic */ X7(int i4, Object obj) {
        this.f7603o = i4;
        this.f7604p = obj;
    }

    /* JADX WARN: Type inference failed for: r9v11, types: [O1.J0, O1.E] */
    private final void a(Object obj, Map map) {
        H1.d dVar;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.n8)).booleanValue()) {
            String str = (String) map.get("action");
            String str2 = (String) map.get("adUnitId");
            String str3 = (String) map.get("redirectUrl");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            String str4 = (String) map.get("format");
            if (!str.equals("load") || TextUtils.isEmpty(str4)) {
                if (str.equals("show")) {
                    ((Vk) this.f7604p).L3(str2, str3);
                    return;
                }
                return;
            }
            Vk vk = (Vk) this.f7604p;
            synchronized (vk) {
                switch (str4.hashCode()) {
                    case -1999289321:
                        if (str4.equals("NATIVE")) {
                            Context M32 = vk.M3();
                            h2.y.j(M32, "context cannot be null");
                            C0077n c0077n = C0081p.f1374f.f1376b;
                            BinderC0983o9 binderC0983o9 = new BinderC0983o9();
                            c0077n.getClass();
                            O1.F f4 = (O1.F) new C0069j(c0077n, M32, str2, binderC0983o9).d(M32, false);
                            try {
                                f4.S0(new W7(1, new Op((Object) vk, (Object) str2, (Object) str3, 16, (byte) 0)));
                            } catch (RemoteException e4) {
                                Y9.t("Failed to add google native ad listener", e4);
                            }
                            try {
                                f4.m0(new O1.S0(new com.google.ads.mediation.e(vk, str3)));
                            } catch (RemoteException e5) {
                                Y9.t("Failed to set AdListener.", e5);
                            }
                            try {
                                dVar = new H1.d(M32, f4.a());
                            } catch (RemoteException e6) {
                                Y9.q("Failed to build AdLoader.", e6);
                                dVar = new H1.d(M32, new O1.I0(new O1.E()));
                            }
                            dVar.a(Vk.N3());
                            return;
                        }
                        return;
                    case -1372958932:
                        if (str4.equals("INTERSTITIAL")) {
                            R1.a.a(vk.M3(), str2, Vk.N3(), new Uk(vk, str2, str3));
                            return;
                        }
                        return;
                    case -428325382:
                        if (str4.equals("APP_OPEN_AD")) {
                            P4.a(vk.M3(), str2, Vk.N3(), new Rk(vk, str2, str3, 0));
                            return;
                        }
                        return;
                    case 543046670:
                        if (str4.equals("REWARDED")) {
                            C0247Bb.a(vk.M3(), str2, Vk.N3(), new Rk(vk, str2, str3, 1));
                            return;
                        }
                        return;
                    case 1854800829:
                        if (str4.equals("REWARDED_INTERSTITIAL")) {
                            C0281Hb.a(vk.M3(), str2, Vk.N3(), new Rk(vk, str2, str3, 2));
                            return;
                        }
                        return;
                    case 1951953708:
                        if (str4.equals("BANNER")) {
                            H1.g gVar = new H1.g(vk.M3());
                            gVar.setAdSize(H1.f.f864h);
                            gVar.setAdUnitId(str2);
                            gVar.setAdListener(new Tk(vk, str2, gVar, str3));
                            gVar.a(Vk.N3());
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    private final void b(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j4 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j4 = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        Ok ok = (Ok) this.f7604p;
        String str = (String) map.get("extras");
        synchronized (ok) {
            ok.f6503l = str;
            ok.f6505n = j4;
            ok.j();
        }
    }

    private final /* bridge */ /* synthetic */ void c(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (((ViewTreeObserverOnGlobalLayoutListenerC0358Wd) this.f7604p)) {
                    try {
                        ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = (ViewTreeObserverOnGlobalLayoutListenerC0358Wd) this.f7604p;
                        if (viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7482T != parseInt) {
                            viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7482T = parseInt;
                            viewTreeObserverOnGlobalLayoutListenerC0358Wd.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e4) {
                Y9.t("Exception occurred while getting webview content height", e4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0597f8
    public final void h(Object obj, Map map) {
        switch (this.f7603o) {
            case 0:
                Y7 y7 = (Y7) this.f7604p;
                if (y7 == null) {
                    return;
                }
                String str = (String) map.get("name");
                if (str == null) {
                    Y9.r("Ad metadata with no name parameter.");
                    str = "";
                }
                Bundle bundle = null;
                if (map.containsKey("info")) {
                    try {
                        bundle = android.support.v4.media.session.a.x(new JSONObject((String) map.get("info")));
                    } catch (JSONException e4) {
                        Y9.q("Failed to convert ad metadata to JSON.", e4);
                    }
                }
                if (bundle == null) {
                    Y9.p("Failed to convert ad metadata to Bundle.");
                    return;
                } else {
                    y7.l(bundle, str);
                    return;
                }
            case 1:
                String str2 = (String) map.get("name");
                if (str2 == null) {
                    Y9.s("App event with no name parameter.");
                    return;
                } else {
                    ((Z7) this.f7604p).v(str2, (String) map.get("info"));
                    return;
                }
            case 2:
                InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) obj;
                boolean equals = "1".equals(map.get("transparentBackground"));
                boolean equals2 = "1".equals(map.get("blur"));
                float f4 = 0.0f;
                try {
                    if (map.get("blurRadius") != null) {
                        f4 = Float.parseFloat((String) map.get("blurRadius"));
                    }
                } catch (NumberFormatException e5) {
                    Y9.q("Fail to parse float", e5);
                }
                C0640g8 c0640g8 = (C0640g8) this.f7604p;
                synchronized (c0640g8) {
                    c0640g8.f8787a = equals;
                    c0640g8.d.set(true);
                }
                ((C0640g8) this.f7604p).b(equals2, f4);
                interfaceC0308Md.f0(equals);
                return;
            case 3:
                a(obj, map);
                return;
            case 4:
                InterfaceC0982o8 interfaceC0982o8 = (InterfaceC0982o8) this.f7604p;
                String str3 = (String) map.get("action");
                if (!"grant".equals(str3)) {
                    if ("video_start".equals(str3)) {
                        interfaceC0982o8.e();
                        return;
                    } else {
                        if ("video_complete".equals(str3)) {
                            interfaceC0982o8.c();
                            return;
                        }
                        return;
                    }
                }
                C0948nb c0948nb = null;
                try {
                    int parseInt = Integer.parseInt((String) map.get("amount"));
                    String str4 = (String) map.get("type");
                    if (!TextUtils.isEmpty(str4)) {
                        c0948nb = new C0948nb(str4, parseInt);
                    }
                } catch (NumberFormatException e6) {
                    Y9.t("Unable to parse reward amount.", e6);
                }
                interfaceC0982o8.L0(c0948nb);
                return;
            case 5:
                b(obj, map);
                return;
            case 6:
                c(obj, map);
                return;
            default:
                ((Ti) this.f7604p).f7064b.b(map);
                return;
        }
    }
}
