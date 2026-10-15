package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import c3.InterfaceFutureC0239a;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.e8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0554e8 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0427b8 f8561a = new C0427b8(19);

    /* renamed from: b, reason: collision with root package name */
    public static final C0427b8 f8562b = new C0427b8(20);
    public static final C0427b8 c = new C0427b8(21);
    public static final C0427b8 d = new C0427b8(22);

    /* renamed from: e, reason: collision with root package name */
    public static final C0427b8 f8563e = new C0427b8(23);

    /* renamed from: f, reason: collision with root package name */
    public static final C0427b8 f8564f = new C0427b8(24);

    /* renamed from: g, reason: collision with root package name */
    public static final C0821kd f8565g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final C0427b8 f8566h = new C0427b8(27);

    /* renamed from: i, reason: collision with root package name */
    public static final C0427b8 f8567i = new C0427b8(6);

    /* renamed from: j, reason: collision with root package name */
    public static final C0469c8 f8568j = new C0469c8();

    /* renamed from: k, reason: collision with root package name */
    public static final C0427b8 f8569k = new C0427b8(25);

    /* renamed from: l, reason: collision with root package name */
    public static final C0427b8 f8570l = new C0427b8(26);

    /* renamed from: m, reason: collision with root package name */
    public static final C0427b8 f8571m = new C0427b8(7);

    /* renamed from: n, reason: collision with root package name */
    public static final C0427b8 f8572n = new C0427b8(8);

    /* renamed from: o, reason: collision with root package name */
    public static final C0427b8 f8573o = new C0427b8(9);

    /* renamed from: p, reason: collision with root package name */
    public static final C0427b8 f8574p = new C0427b8(10);

    /* renamed from: q, reason: collision with root package name */
    public static final C0427b8 f8575q = new C0427b8(11);

    /* renamed from: r, reason: collision with root package name */
    public static final C0427b8 f8576r = new C0427b8(12);

    /* renamed from: s, reason: collision with root package name */
    public static final C0427b8 f8577s = new C0427b8(13);

    /* renamed from: t, reason: collision with root package name */
    public static final C0427b8 f8578t = new C0427b8(14);

    /* renamed from: u, reason: collision with root package name */
    public static final C0427b8 f8579u = new C0427b8(15);

    /* renamed from: v, reason: collision with root package name */
    public static final C0427b8 f8580v = new C0427b8(16);

    /* renamed from: w, reason: collision with root package name */
    public static final C0427b8 f8581w = new C0427b8(17);

    /* renamed from: x, reason: collision with root package name */
    public static final C0427b8 f8582x = new C0427b8(18);

    public static InterfaceFutureC0239a a(InterfaceC0308Md interfaceC0308Md, String str) {
        String str2;
        Uri parse = Uri.parse(str);
        try {
            I3 d02 = interfaceC0308Md.d0();
            if (d02 != null && d02.b(parse)) {
                parse = d02.a(parse, interfaceC0308Md.getContext(), interfaceC0308Md.L(), interfaceC0308Md.g());
            }
        } catch (J3 unused) {
            Y9.s("Unable to append parameter to URL: ".concat(str));
        }
        Context context = interfaceC0308Md.getContext();
        C0356Wb c0356Wb = N1.n.f1204A.f1225w;
        if (c0356Wb.j(context)) {
            String f4 = c0356Wb.f(context);
            if (f4 == null) {
                str2 = parse.toString();
            } else {
                C0937n6 c0937n6 = AbstractC1066q6.f10188Y;
                O1.r rVar = O1.r.d;
                String str3 = (String) rVar.c.a(c0937n6);
                String uri = parse.toString();
                if (((Boolean) rVar.c.a(AbstractC1066q6.f10184X)).booleanValue() && uri.contains(str3)) {
                    c0356Wb.b(context, "_ac", f4, null);
                    str2 = AbstractC1230u.R(context, uri).replace(str3, f4);
                } else if (TextUtils.isEmpty(parse.getQueryParameter("fbs_aeid"))) {
                    String uri2 = AbstractC1230u.g(AbstractC1230u.R(context, uri), "fbs_aeid", f4).toString();
                    c0356Wb.b(context, "_ac", f4, null);
                    str2 = uri2;
                } else {
                    str2 = uri;
                }
            }
        } else {
            str2 = parse.toString();
        }
        long longValue = ((Long) M6.f6214e.r()).longValue();
        if (longValue <= 0 || longValue > 234310600) {
            return Bs.h0(str2);
        }
        Ku q4 = Ku.q(interfaceC0308Md.h0());
        C0932n1 c0932n1 = C0932n1.c;
        C0260Dc c0260Dc = AbstractC0266Ec.f4900f;
        return Bs.Z(Bs.m0(Bs.Z(q4, Throwable.class, c0932n1, c0260Dc), new C0384a8(str2, 0), c0260Dc), Throwable.class, new C0384a8(str2, 1), c0260Dc);
    }

    public static void b(Map map, Sh sh) {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.e9)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && sh != null) {
            sh.G0();
        }
    }
}
