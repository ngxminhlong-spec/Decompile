package com.google.android.gms.internal.ads;

import O1.C0081p;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.measurement.C1510e1;
import d3.AbstractC1654b;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ja, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0775ja extends C1510e1 implements InterfaceC0597f8 {

    /* renamed from: A, reason: collision with root package name */
    public int f9149A;

    /* renamed from: B, reason: collision with root package name */
    public int f9150B;

    /* renamed from: C, reason: collision with root package name */
    public int f9151C;

    /* renamed from: D, reason: collision with root package name */
    public int f9152D;

    /* renamed from: E, reason: collision with root package name */
    public int f9153E;

    /* renamed from: s, reason: collision with root package name */
    public final C0348Ud f9154s;

    /* renamed from: t, reason: collision with root package name */
    public final Context f9155t;

    /* renamed from: u, reason: collision with root package name */
    public final WindowManager f9156u;

    /* renamed from: v, reason: collision with root package name */
    public final C0894m6 f9157v;

    /* renamed from: w, reason: collision with root package name */
    public DisplayMetrics f9158w;

    /* renamed from: x, reason: collision with root package name */
    public float f9159x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public int f9160z;

    public C0775ja(C0348Ud c0348Ud, Context context, C0894m6 c0894m6) {
        super((Object) c0348Ud, (Object) "", 19, false);
        this.y = -1;
        this.f9160z = -1;
        this.f9150B = -1;
        this.f9151C = -1;
        this.f9152D = -1;
        this.f9153E = -1;
        this.f9154s = c0348Ud;
        this.f9155t = context;
        this.f9157v = c0894m6;
        this.f9156u = (WindowManager) context.getSystemService("window");
    }

    public final void K(int i4, int i5) {
        int i6;
        C0348Ud c0348Ud = this.f9154s;
        ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = c0348Ud.f7165o;
        Context context = this.f9155t;
        int i7 = 0;
        if (context instanceof Activity) {
            Q1.N n4 = N1.n.f1204A.c;
            i6 = Q1.N.m((Activity) context)[0];
        } else {
            i6 = 0;
        }
        if (viewTreeObserverOnGlobalLayoutListenerC0358Wd.P() == null || !viewTreeObserverOnGlobalLayoutListenerC0358Wd.P().b()) {
            int width = c0348Ud.getWidth();
            int height = c0348Ud.getHeight();
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10127L)).booleanValue()) {
                if (width == 0) {
                    width = viewTreeObserverOnGlobalLayoutListenerC0358Wd.P() != null ? viewTreeObserverOnGlobalLayoutListenerC0358Wd.P().c : 0;
                }
                if (height == 0) {
                    if (viewTreeObserverOnGlobalLayoutListenerC0358Wd.P() != null) {
                        i7 = viewTreeObserverOnGlobalLayoutListenerC0358Wd.P().f9513b;
                    }
                    C0081p c0081p = C0081p.f1374f;
                    this.f9152D = c0081p.f1375a.d(context, width);
                    this.f9153E = c0081p.f1375a.d(context, i7);
                }
            }
            i7 = height;
            C0081p c0081p2 = C0081p.f1374f;
            this.f9152D = c0081p2.f1375a.d(context, width);
            this.f9153E = c0081p2.f1375a.d(context, i7);
        }
        try {
            ((InterfaceC0308Md) this.f11914p).c("onDefaultPositionReceived", new JSONObject().put("x", i4).put("y", i5 - i6).put("width", this.f9152D).put("height", this.f9153E));
        } catch (JSONException e4) {
            Y9.q("Error occurred while dispatching default position.", e4);
        }
        C0648ga c0648ga = viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7464A.f8133K;
        if (c0648ga != null) {
            c0648ga.f8815u = i4;
            c0648ga.f8816v = i5;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0597f8
    public final void h(Object obj, Map map) {
        JSONObject jSONObject;
        this.f9158w = new DisplayMetrics();
        Display defaultDisplay = this.f9156u.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f9158w);
        this.f9159x = this.f9158w.density;
        this.f9149A = defaultDisplay.getRotation();
        C1335wc c1335wc = C0081p.f1374f.f1375a;
        this.y = Math.round(r11.widthPixels / this.f9158w.density);
        this.f9160z = Math.round(r11.heightPixels / this.f9158w.density);
        C0348Ud c0348Ud = this.f9154s;
        ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = c0348Ud.f7165o;
        Activity g4 = c0348Ud.g();
        if (g4 == null || g4.getWindow() == null) {
            this.f9150B = this.y;
            this.f9151C = this.f9160z;
        } else {
            Q1.N n4 = N1.n.f1204A.c;
            int[] l4 = Q1.N.l(g4);
            this.f9150B = Math.round(l4[0] / this.f9158w.density);
            this.f9151C = Math.round(l4[1] / this.f9158w.density);
        }
        if (viewTreeObserverOnGlobalLayoutListenerC0358Wd.P().b()) {
            this.f9152D = this.y;
            this.f9153E = this.f9160z;
        } else {
            c0348Ud.measure(0, 0);
        }
        H(this.y, this.f9160z, this.f9150B, this.f9151C, this.f9159x, this.f9149A);
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        C0894m6 c0894m6 = this.f9157v;
        boolean a4 = c0894m6.a(intent);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        boolean a5 = c0894m6.a(intent2);
        boolean a6 = c0894m6.a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
        Context context = c0894m6.f9566p;
        try {
            jSONObject = new JSONObject().put("sms", a5).put("tel", a4).put("calendar", a6).put("storePicture", ((Boolean) AbstractC1654b.c0(context, CallableC0851l6.f9364b)).booleanValue() && m2.c.a(context).f14053a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0).put("inlineVideo", true);
        } catch (JSONException e4) {
            Y9.q("Error occurred while obtaining the MRAID capabilities.", e4);
            jSONObject = null;
        }
        c0348Ud.c("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        c0348Ud.getLocationOnScreen(iArr);
        C0081p c0081p = C0081p.f1374f;
        C1335wc c1335wc2 = c0081p.f1375a;
        int i4 = iArr[0];
        Context context2 = this.f9155t;
        K(c1335wc2.d(context2, i4), c0081p.f1375a.d(context2, iArr[1]));
        if (Y9.v(2)) {
            Y9.r("Dispatching Ready Event.");
        }
        try {
            ((InterfaceC0308Md) this.f11914p).c("onReadyEventReceived", new JSONObject().put("js", viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7501r.f4084o));
        } catch (JSONException e5) {
            Y9.q("Error occurred while dispatching ready Event.", e5);
        }
    }
}
