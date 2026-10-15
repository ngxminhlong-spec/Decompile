package com.google.android.gms.internal.ads;

import O1.C0081p;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.kd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0821kd implements InterfaceC0597f8 {

    /* renamed from: o, reason: collision with root package name */
    public boolean f9295o;

    public static int a(Context context, Map map, String str, int i4) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                C1335wc c1335wc = C0081p.f1374f.f1375a;
                i4 = C1335wc.l(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                Y9.s("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (Q1.I.y()) {
            StringBuilder n4 = U.a.n("Parse pixels for ", str, ", got string ", str2, ", int ");
            n4.append(i4);
            n4.append(".");
            Q1.I.w(n4.toString());
        }
        return i4;
    }

    public static void b(C0337Sc c0337Sc, Map map) {
        AbstractC0322Pc abstractC0322Pc = c0337Sc.f6979u;
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                if (abstractC0322Pc != null) {
                    abstractC0322Pc.c(parseInt);
                }
            } catch (NumberFormatException unused) {
                Y9.s("Could not parse buffer parameters in loadControl video GMSG: (" + str + ", " + str2 + ")");
                return;
            }
        }
        if (str2 != null) {
            int parseInt2 = Integer.parseInt(str2);
            if (abstractC0322Pc != null) {
                abstractC0322Pc.D(parseInt2);
            }
        }
        if (str3 != null) {
            int parseInt3 = Integer.parseInt(str3);
            if (abstractC0322Pc != null) {
                abstractC0322Pc.B(parseInt3);
            }
        }
        if (str4 != null) {
            int parseInt4 = Integer.parseInt(str4);
            if (abstractC0322Pc != null) {
                abstractC0322Pc.C(parseInt4);
            }
        }
        if (str5 != null) {
            int parseInt5 = Integer.parseInt(str5);
            if (abstractC0322Pc == null) {
                return;
            }
            abstractC0322Pc.f(parseInt5);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0597f8
    public final void h(Object obj, Map map) {
        int min;
        int min2;
        int i4;
        C0337Sc c0337Sc;
        AbstractC0322Pc abstractC0322Pc;
        InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) obj;
        String str = (String) map.get("action");
        if (str == null) {
            Y9.s("Action missing from video GMSG.");
            return;
        }
        Integer num = null;
        Integer valueOf = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer A3 = (interfaceC0308Md.n() == null || (c0337Sc = (C0337Sc) interfaceC0308Md.n().f6662r) == null || (abstractC0322Pc = c0337Sc.f6979u) == null) ? null : abstractC0322Pc.A();
        if (valueOf != null && A3 != null && !valueOf.equals(A3) && !str.equals("load")) {
            Locale locale = Locale.US;
            Y9.r("Event intended for player " + valueOf + ", but sent to player " + A3 + " - event ignored");
            return;
        }
        if (Y9.v(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            Y9.m("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                Y9.s("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                interfaceC0308Md.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                Y9.s("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if ("playerBackground".equals(str)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                Y9.s("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                interfaceC0308Md.C(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                Y9.s("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if ("decoderProps".equals(str)) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                Y9.s("No MIME types specified for decoder properties inspection.");
                HashMap hashMap = new HashMap();
                hashMap.put("event", "decoderProps");
                hashMap.put("error", "missingMimeTypes");
                interfaceC0308Md.b("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            for (String str5 : str4.split(",")) {
                hashMap2.put(str5, Q1.G.a(str5.trim()));
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("event", "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            interfaceC0308Md.b("onVideoEvent", hashMap3);
            return;
        }
        C0326Qb n4 = interfaceC0308Md.n();
        if (n4 == null) {
            Y9.s("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = "new".equals(str);
        boolean equals2 = "position".equals(str);
        if (equals || equals2) {
            Context context = interfaceC0308Md.getContext();
            int a4 = a(context, map, "x", 0);
            int a5 = a(context, map, "y", 0);
            int a6 = a(context, map, "w", -1);
            C0937n6 c0937n6 = AbstractC1066q6.f10266o3;
            O1.r rVar = O1.r.d;
            if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                min = a6 == -1 ? interfaceC0308Md.f() : Math.min(a6, interfaceC0308Md.f());
            } else {
                if (Q1.I.y()) {
                    StringBuilder m4 = U.a.m("Calculate width with original width ", a6, ", videoHost.getVideoBoundingWidth() ", interfaceC0308Md.f(), ", x ");
                    m4.append(a4);
                    m4.append(".");
                    Q1.I.w(m4.toString());
                }
                min = Math.min(a6, interfaceC0308Md.f() - a4);
            }
            int a7 = a(context, map, "h", -1);
            if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                min2 = a7 == -1 ? interfaceC0308Md.h() : Math.min(a7, interfaceC0308Md.h());
            } else {
                if (Q1.I.y()) {
                    StringBuilder m5 = U.a.m("Calculate height with original height ", a7, ", videoHost.getVideoBoundingHeight() ", interfaceC0308Md.h(), ", y ");
                    m5.append(a5);
                    m5.append(".");
                    Q1.I.w(m5.toString());
                }
                min2 = Math.min(a7, interfaceC0308Md.h() - a5);
            }
            try {
                i4 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i4 = 0;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (!equals || ((C0337Sc) n4.f6662r) != null) {
                h2.y.d("The underlay may only be modified from the UI thread.");
                C0337Sc c0337Sc2 = (C0337Sc) n4.f6662r;
                if (c0337Sc2 != null) {
                    c0337Sc2.a(a4, a5, min, min2);
                    return;
                }
                return;
            }
            C0367Yc c0367Yc = new C0367Yc((String) map.get("flags"));
            C0348Ud c0348Ud = (C0348Ud) n4.f6660p;
            if (((C0337Sc) n4.f6662r) == null) {
                ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = c0348Ud.f7165o;
                AbstractC1230u.l((C1323w6) viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7486a0.f9212q, viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7484V, "vpr2");
                C0337Sc c0337Sc3 = new C0337Sc((Context) n4.f6659o, c0348Ud, i4, parseBoolean, (C1323w6) c0348Ud.f7165o.f7486a0.f9212q, c0367Yc);
                n4.f6662r = c0337Sc3;
                ((C0348Ud) n4.f6661q).addView(c0337Sc3, 0, new ViewGroup.LayoutParams(-1, -1));
                ((C0337Sc) n4.f6662r).a(a4, a5, min, min2);
                c0348Ud.f7165o.f7464A.f8151z = false;
            }
            C0337Sc c0337Sc4 = (C0337Sc) n4.f6662r;
            if (c0337Sc4 != null) {
                b(c0337Sc4, map);
                return;
            }
            return;
        }
        BinderC0368Yd p3 = interfaceC0308Md.p();
        if (p3 != null) {
            if ("timeupdate".equals(str)) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    Y9.s("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    float parseFloat = Float.parseFloat(str6);
                    synchronized (p3.f7846p) {
                        p3.f7854x = parseFloat;
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    Y9.s("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if ("skip".equals(str)) {
                p3.s();
                return;
            }
        }
        C0337Sc c0337Sc5 = (C0337Sc) n4.f6662r;
        if (c0337Sc5 == null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("event", "no_video_view");
            interfaceC0308Md.b("onVideoEvent", hashMap4);
            return;
        }
        if ("click".equals(str)) {
            Context context2 = interfaceC0308Md.getContext();
            int a8 = a(context2, map, "x", 0);
            float a9 = a(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, a8, a9, 0);
            AbstractC0322Pc abstractC0322Pc2 = c0337Sc5.f6979u;
            if (abstractC0322Pc2 != null) {
                abstractC0322Pc2.dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            return;
        }
        if ("currentTime".equals(str)) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                Y9.s("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                int parseFloat2 = (int) (Float.parseFloat(str7) * 1000.0f);
                AbstractC0322Pc abstractC0322Pc3 = c0337Sc5.f6979u;
                if (abstractC0322Pc3 == null) {
                    return;
                }
                abstractC0322Pc3.v(parseFloat2);
                return;
            } catch (NumberFormatException unused5) {
                Y9.s("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if ("hide".equals(str)) {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10079A)).booleanValue()) {
                c0337Sc5.setVisibility(8);
                return;
            } else {
                c0337Sc5.setVisibility(4);
                return;
            }
        }
        if ("load".equals(str)) {
            AbstractC0322Pc abstractC0322Pc4 = c0337Sc5.f6979u;
            if (abstractC0322Pc4 == null) {
                return;
            }
            if (TextUtils.isEmpty(c0337Sc5.f6968B)) {
                c0337Sc5.c("no_src", new String[0]);
                return;
            } else {
                abstractC0322Pc4.i(c0337Sc5.f6968B, c0337Sc5.f6969C, valueOf);
                return;
            }
        }
        if ("loadControl".equals(str)) {
            b(c0337Sc5, map);
            return;
        }
        if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                AbstractC0322Pc abstractC0322Pc5 = c0337Sc5.f6979u;
                if (abstractC0322Pc5 == null) {
                    return;
                }
                C0480cd c0480cd = abstractC0322Pc5.f6585p;
                c0480cd.f8369e = true;
                c0480cd.a();
                abstractC0322Pc5.m();
                return;
            }
            AbstractC0322Pc abstractC0322Pc6 = c0337Sc5.f6979u;
            if (abstractC0322Pc6 == null) {
                return;
            }
            C0480cd c0480cd2 = abstractC0322Pc6.f6585p;
            c0480cd2.f8369e = false;
            c0480cd2.a();
            abstractC0322Pc6.m();
            return;
        }
        if ("pause".equals(str)) {
            AbstractC0322Pc abstractC0322Pc7 = c0337Sc5.f6979u;
            if (abstractC0322Pc7 == null) {
                return;
            }
            abstractC0322Pc7.t();
            return;
        }
        if ("play".equals(str)) {
            AbstractC0322Pc abstractC0322Pc8 = c0337Sc5.f6979u;
            if (abstractC0322Pc8 == null) {
                return;
            }
            abstractC0322Pc8.u();
            return;
        }
        if ("show".equals(str)) {
            c0337Sc5.setVisibility(0);
            return;
        }
        if ("src".equals(str)) {
            String str8 = (String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    Y9.s("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        strArr2[i5] = jSONArray.getString(i5);
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    Y9.s("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (num != null) {
                interfaceC0308Md.E0(num.intValue());
            }
            c0337Sc5.f6968B = str8;
            c0337Sc5.f6969C = strArr;
            return;
        }
        if ("touchMove".equals(str)) {
            Context context3 = interfaceC0308Md.getContext();
            int a10 = a(context3, map, "dx", 0);
            int a11 = a(context3, map, "dy", 0);
            float f4 = a10;
            float f5 = a11;
            AbstractC0322Pc abstractC0322Pc9 = c0337Sc5.f6979u;
            if (abstractC0322Pc9 != null) {
                abstractC0322Pc9.z(f4, f5);
            }
            if (this.f9295o) {
                return;
            }
            interfaceC0308Md.s();
            this.f9295o = true;
            return;
        }
        if (!"volume".equals(str)) {
            if ("watermark".equals(str)) {
                c0337Sc5.i();
                return;
            } else {
                Y9.s("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            Y9.s("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            float parseFloat3 = Float.parseFloat(str10);
            AbstractC0322Pc abstractC0322Pc10 = c0337Sc5.f6979u;
            if (abstractC0322Pc10 == null) {
                return;
            }
            C0480cd c0480cd3 = abstractC0322Pc10.f6585p;
            c0480cd3.f8370f = parseFloat3;
            c0480cd3.a();
            abstractC0322Pc10.m();
        } catch (NumberFormatException unused8) {
            Y9.s("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
