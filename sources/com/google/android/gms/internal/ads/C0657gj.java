package com.google.android.gms.internal.ads;

import Q1.C0121u;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.measurement.C1510e1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.gj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0657gj {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8842a;

    /* renamed from: b, reason: collision with root package name */
    public final Zi f8843b;
    public final I3 c;
    public final C0248Bc d;

    /* renamed from: e, reason: collision with root package name */
    public final C1510e1 f8844e;

    /* renamed from: f, reason: collision with root package name */
    public final C0764j5 f8845f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f8846g;

    /* renamed from: h, reason: collision with root package name */
    public final C0766j7 f8847h;

    /* renamed from: i, reason: collision with root package name */
    public final C0956nj f8848i;

    /* renamed from: j, reason: collision with root package name */
    public final Oj f8849j;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f8850k;

    /* renamed from: l, reason: collision with root package name */
    public final Ej f8851l;

    /* renamed from: m, reason: collision with root package name */
    public final C0658gk f8852m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC1263uq f8853n;

    /* renamed from: o, reason: collision with root package name */
    public final Oq f8854o;

    /* renamed from: p, reason: collision with root package name */
    public final Xl f8855p;

    /* renamed from: q, reason: collision with root package name */
    public final BinderC0489cm f8856q;

    public C0657gj(Context context, Zi zi, I3 i32, C0248Bc c0248Bc, C1510e1 c1510e1, C0764j5 c0764j5, C0260Dc c0260Dc, Jp jp, C0956nj c0956nj, Oj oj, ScheduledExecutorService scheduledExecutorService, C0658gk c0658gk, InterfaceC1263uq interfaceC1263uq, Oq oq, Xl xl, Ej ej, BinderC0489cm binderC0489cm) {
        this.f8842a = context;
        this.f8843b = zi;
        this.c = i32;
        this.d = c0248Bc;
        this.f8844e = c1510e1;
        this.f8845f = c0764j5;
        this.f8846g = c0260Dc;
        this.f8847h = jp.f5914i;
        this.f8848i = c0956nj;
        this.f8849j = oj;
        this.f8850k = scheduledExecutorService;
        this.f8852m = c0658gk;
        this.f8853n = interfaceC1263uq;
        this.f8854o = oq;
        this.f8855p = xl;
        this.f8851l = ej;
        this.f8856q = binderC0489cm;
    }

    public static Integer d(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final O1.F0 e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new O1.F0(optString, optString2);
    }

    public final InterfaceFutureC0239a a(JSONObject jSONObject, boolean z4) {
        if (jSONObject == null) {
            return Pu.f6608p;
        }
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return Pu.f6608p;
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z4) {
            return Bs.h0(new BinderC0682h7(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        final Zi zi = this.f8843b;
        zi.f8025a.getClass();
        C0272Fc c0272Fc = new C0272Fc();
        Q1.v.f1733a.b(new C0121u(optString, c0272Fc));
        C1310vu m02 = Bs.m0(Bs.m0(c0272Fc, new As() { // from class: com.google.android.gms.internal.ads.Yi
            @Override // com.google.android.gms.internal.ads.As
            public final Object apply(Object obj) {
                Zi zi2 = Zi.this;
                zi2.getClass();
                byte[] bArr = ((B2) obj).f4023b;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDensity = (int) (optDouble * 160.0d);
                if (!optBoolean) {
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                }
                C0937n6 c0937n6 = AbstractC1066q6.o5;
                O1.r rVar = O1.r.d;
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    options.inJustDecodeBounds = true;
                    zi2.a(bArr, options);
                    options.inJustDecodeBounds = false;
                    int i4 = options.outWidth * options.outHeight;
                    if (i4 > 0) {
                        options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i4 - 1) / ((Integer) rVar.c.a(AbstractC1066q6.p5)).intValue())) / 2);
                    }
                }
                return zi2.a(bArr, options);
            }
        }, zi.c), new As() { // from class: com.google.android.gms.internal.ads.dj
            @Override // com.google.android.gms.internal.ads.As
            public final Object apply(Object obj) {
                return new BinderC0682h7(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2);
            }
        }, this.f8846g);
        return jSONObject.optBoolean("require") ? Bs.n0(m02, new C0512d8(10, m02), AbstractC0266Ec.f4900f) : Bs.c0(m02, Exception.class, new C0364Xe(18), AbstractC0266Ec.f4900f);
    }

    public final InterfaceFutureC0239a b(JSONArray jSONArray, boolean z4, boolean z5) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return Bs.h0(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z5 ? jSONArray.length() : 1;
        for (int i4 = 0; i4 < length; i4++) {
            arrayList.add(a(jSONArray.optJSONObject(i4), z4));
        }
        return Bs.m0(new Eu(AbstractC1137rt.r(arrayList), true), C0932n1.f9698h, this.f8846g);
    }

    public final C1267uu c(JSONObject jSONObject, C1434yp c1434yp, Ap ap) {
        O1.X0 x02;
        String optString = jSONObject.optString("base_url");
        String optString2 = jSONObject.optString("html");
        int i4 = 0;
        int optInt = jSONObject.optInt("width", 0);
        int optInt2 = jSONObject.optInt("height", 0);
        if (optInt != 0) {
            i4 = optInt;
        } else if (optInt2 == 0) {
            x02 = O1.X0.i();
            C0956nj c0956nj = this.f8848i;
            c0956nj.getClass();
            C1267uu n02 = Bs.n0(Pu.f6608p, new C0614fj(c0956nj, x02, c1434yp, ap, optString, optString2, 1), c0956nj.f9766b);
            return Bs.n0(n02, new C0571ej(n02, 0), AbstractC0266Ec.f4900f);
        }
        x02 = new O1.X0(this.f8842a, new H1.f(i4, optInt2));
        C0956nj c0956nj2 = this.f8848i;
        c0956nj2.getClass();
        C1267uu n022 = Bs.n0(Pu.f6608p, new C0614fj(c0956nj2, x02, c1434yp, ap, optString, optString2, 1), c0956nj2.f9766b);
        return Bs.n0(n022, new C0571ej(n022, 0), AbstractC0266Ec.f4900f);
    }
}
