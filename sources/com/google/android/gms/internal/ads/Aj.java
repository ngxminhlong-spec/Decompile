package com.google.android.gms.internal.ads;

import android.content.Context;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.measurement.C1510e1;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Aj {

    /* renamed from: b, reason: collision with root package name */
    public final C1510e1 f3974b;
    public final Context c;
    public final C0658gk d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1263uq f3975e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f3976f;

    /* renamed from: g, reason: collision with root package name */
    public final I3 f3977g;

    /* renamed from: h, reason: collision with root package name */
    public final C0248Bc f3978h;

    /* renamed from: j, reason: collision with root package name */
    public final Xl f3980j;

    /* renamed from: k, reason: collision with root package name */
    public final Oq f3981k;

    /* renamed from: l, reason: collision with root package name */
    public final BinderC0489cm f3982l;

    /* renamed from: m, reason: collision with root package name */
    public C1310vu f3983m;

    /* renamed from: a, reason: collision with root package name */
    public final C1299vj f3973a = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final C0469c8 f3979i = new C0469c8();

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.vj, java.lang.Object] */
    public Aj(CallableC1428yj callableC1428yj) {
        this.c = callableC1428yj.f11451b;
        this.f3976f = callableC1428yj.f11453f;
        this.f3977g = callableC1428yj.f11454g;
        this.f3978h = callableC1428yj.f11455h;
        this.f3974b = callableC1428yj.f11450a;
        this.f3980j = callableC1428yj.f11452e;
        this.f3981k = callableC1428yj.f11456i;
        this.d = callableC1428yj.c;
        this.f3975e = callableC1428yj.d;
        this.f3982l = callableC1428yj.f11457j;
    }

    public final synchronized InterfaceFutureC0239a a(String str, JSONObject jSONObject) {
        C1310vu c1310vu = this.f3983m;
        if (c1310vu == null) {
            return Pu.f6608p;
        }
        return Bs.n0(c1310vu, new C0568eg(this, str, jSONObject, 1), this.f3976f);
    }

    public final synchronized void b(Map map) {
        C1310vu c1310vu = this.f3983m;
        if (c1310vu == null) {
            return;
        }
        C0874ln c0874ln = new C0874ln(29, map);
        c1310vu.a(new Nu(0, c1310vu, c0874ln), this.f3976f);
    }

    public final synchronized void c(String str, InterfaceC0597f8 interfaceC0597f8) {
        C1310vu c1310vu = this.f3983m;
        if (c1310vu == null) {
            return;
        }
        C1510e1 c1510e1 = new C1510e1((Object) str, (Object) interfaceC0597f8, 25, false);
        c1310vu.a(new Nu(0, c1310vu, c1510e1), this.f3976f);
    }

    public final synchronized void d(String str, InterfaceC0597f8 interfaceC0597f8) {
        C1310vu c1310vu = this.f3983m;
        if (c1310vu == null) {
            return;
        }
        C0258Da c0258Da = new C0258Da(22, str, interfaceC0597f8);
        c1310vu.a(new Nu(0, c1310vu, c0258Da), this.f3976f);
    }
}
