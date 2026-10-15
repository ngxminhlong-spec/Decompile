package com.google.android.gms.internal.ads;

import O1.C0101z0;
import O1.InterfaceC0051a;
import android.content.Context;
import android.os.SystemClock;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.pk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1043pk implements I1.b, InterfaceC0954nh, InterfaceC0051a, Ig, Sg, Tg, Yg, Lg, InterfaceC1049pq {

    /* renamed from: o, reason: collision with root package name */
    public final List f10034o;

    /* renamed from: p, reason: collision with root package name */
    public final C0957nk f10035p;

    /* renamed from: q, reason: collision with root package name */
    public long f10036q;

    public C1043pk(C0957nk c0957nk, C1423ye c1423ye) {
        this.f10035p = c0957nk;
        this.f10034o = Collections.singletonList(c1423ye);
    }

    @Override // I1.b
    public final void B(String str, String str2) {
        X(I1.b.class, "onAppEvent", str, str2);
    }

    @Override // O1.InterfaceC0051a
    public final void D() {
        X(InterfaceC0051a.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.Tg
    public final void F(Context context) {
        X(Tg.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.Lg
    public final void J(C0101z0 c0101z0) {
        X(Lg.class, "onAdFailedToLoad", Integer.valueOf(c0101z0.f1405o), c0101z0.f1406p, c0101z0.f1407q);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0954nh
    public final void K0(Ep ep) {
    }

    @Override // com.google.android.gms.internal.ads.Yg
    public final void M() {
        N1.n.f1204A.f1212j.getClass();
        Q1.I.w("Ad Request Latency : " + (SystemClock.elapsedRealtime() - this.f10036q));
        X(Yg.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0954nh
    public final void N(C0370Za c0370Za) {
        N1.n.f1204A.f1212j.getClass();
        this.f10036q = SystemClock.elapsedRealtime();
        X(InterfaceC0954nh.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1049pq
    public final void O(String str) {
        X(C0963nq.class, "onTaskCreated", str);
    }

    public final void X(Class cls, String str, Object... objArr) {
        String simpleName = cls.getSimpleName();
        List list = this.f10034o;
        String concat = "Event-".concat(simpleName);
        C0957nk c0957nk = this.f10035p;
        c0957nk.getClass();
        if (((Boolean) Q6.f6646a.r()).booleanValue()) {
            c0957nk.f9772a.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(currentTimeMillis);
                jsonWriter.name("source").value(concat);
                jsonWriter.name("event").value(str);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    Object obj = objArr[i4];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e4) {
                Y9.q("unable to log", e4);
            }
            Y9.r("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void a() {
        X(Ig.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void b() {
        X(Ig.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void c() {
        X(Ig.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void d() {
        X(Ig.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void e() {
        X(Ig.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.Tg
    public final void l(Context context) {
        X(Tg.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.Tg
    public final void o(Context context) {
        X(Tg.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.Sg
    public final void p() {
        X(Sg.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1049pq
    public final void r(EnumC0877lq enumC0877lq, String str, Throwable th) {
        X(C0963nq.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1049pq
    public final void u(EnumC0877lq enumC0877lq, String str) {
        X(C0963nq.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1049pq
    public final void v(EnumC0877lq enumC0877lq, String str) {
        X(C0963nq.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void y(BinderC0606fb binderC0606fb, String str, String str2) {
        X(Ig.class, "onRewarded", binderC0606fb, str, str2);
    }
}
