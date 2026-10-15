package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.measurement.C1510e1;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.hi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0699hi implements Ig, Jh {

    /* renamed from: o, reason: collision with root package name */
    public final C0331Rb f8958o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f8959p;

    /* renamed from: q, reason: collision with root package name */
    public final C0356Wb f8960q;

    /* renamed from: r, reason: collision with root package name */
    public final View f8961r;

    /* renamed from: s, reason: collision with root package name */
    public String f8962s;

    /* renamed from: t, reason: collision with root package name */
    public final EnumC0807k5 f8963t;

    public C0699hi(C0331Rb c0331Rb, Context context, C0356Wb c0356Wb, WebView webView, EnumC0807k5 enumC0807k5) {
        this.f8958o = c0331Rb;
        this.f8959p = context;
        this.f8960q = c0356Wb;
        this.f8961r = webView;
        this.f8963t = enumC0807k5;
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void b() {
        this.f8958o.a(false);
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void e() {
        View view = this.f8961r;
        if (view != null && this.f8962s != null) {
            Context context = view.getContext();
            String str = this.f8962s;
            C0356Wb c0356Wb = this.f8960q;
            ConcurrentHashMap concurrentHashMap = c0356Wb.f7453i;
            AtomicReference atomicReference = c0356Wb.f7452h;
            if (c0356Wb.j(context) && (context instanceof Activity)) {
                if (C0356Wb.k(context)) {
                    c0356Wb.d("setScreenName", new C1510e1(context, (Object) str, 20, false));
                } else if (c0356Wb.e(context, "com.google.firebase.analytics.FirebaseAnalytics", atomicReference, false)) {
                    Method method = (Method) concurrentHashMap.get("setCurrentScreen");
                    if (method == null) {
                        try {
                            method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                            concurrentHashMap.put("setCurrentScreen", method);
                        } catch (Exception unused) {
                            c0356Wb.c("setCurrentScreen", false);
                            method = null;
                        }
                    }
                    try {
                        method.invoke(atomicReference.get(), (Activity) context, str, context.getPackageName());
                    } catch (Exception unused2) {
                        c0356Wb.c("setCurrentScreen", false);
                    }
                }
            }
        }
        this.f8958o.a(true);
    }

    @Override // com.google.android.gms.internal.ads.Jh
    public final void k() {
    }

    @Override // com.google.android.gms.internal.ads.Jh
    public final void l() {
        EnumC0807k5 enumC0807k5 = EnumC0807k5.f9272z;
        EnumC0807k5 enumC0807k52 = this.f8963t;
        if (enumC0807k52 == enumC0807k5) {
            return;
        }
        C0356Wb c0356Wb = this.f8960q;
        AtomicReference atomicReference = c0356Wb.f7451g;
        Context context = this.f8959p;
        String str = "";
        if (c0356Wb.j(context)) {
            if (C0356Wb.k(context)) {
                str = (String) c0356Wb.l("getCurrentScreenNameOrScreenClass", "", BF.y);
            } else if (c0356Wb.e(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                try {
                    String str2 = (String) c0356Wb.n(context, "getCurrentScreenName").invoke(atomicReference.get(), null);
                    if (str2 == null) {
                        str2 = (String) c0356Wb.n(context, "getCurrentScreenClass").invoke(atomicReference.get(), null);
                    }
                    if (str2 != null) {
                        str = str2;
                    }
                } catch (Exception unused) {
                    c0356Wb.c("getCurrentScreenName", false);
                }
            }
        }
        this.f8962s = str;
        this.f8962s = String.valueOf(str).concat(enumC0807k52 == EnumC0807k5.f9270w ? "/Rewarded" : "/Interstitial");
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void y(BinderC0606fb binderC0606fb, String str, String str2) {
        C0356Wb c0356Wb = this.f8960q;
        Context context = this.f8959p;
        if (c0356Wb.j(context)) {
            try {
                c0356Wb.i(context, c0356Wb.f(context), this.f8958o.f6801q, binderC0606fb.f8704o, binderC0606fb.f8705p);
            } catch (RemoteException e4) {
                Y9.t("Remote Exception to get reward item.", e4);
            }
        }
    }
}
