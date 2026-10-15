package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.measurement.C1510e1;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.yj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC1428yj implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final C1510e1 f11450a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11451b;
    public final C0658gk c;
    public final InterfaceC1263uq d;

    /* renamed from: e, reason: collision with root package name */
    public final Xl f11452e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f11453f;

    /* renamed from: g, reason: collision with root package name */
    public final I3 f11454g;

    /* renamed from: h, reason: collision with root package name */
    public final C0248Bc f11455h;

    /* renamed from: i, reason: collision with root package name */
    public final Oq f11456i;

    /* renamed from: j, reason: collision with root package name */
    public final BinderC0489cm f11457j;

    public CallableC1428yj(Context context, Executor executor, I3 i32, C0248Bc c0248Bc, C1510e1 c1510e1, C0347Uc c0347Uc, Xl xl, Oq oq, C0658gk c0658gk, InterfaceC1263uq interfaceC1263uq, BinderC0489cm binderC0489cm) {
        this.f11451b = context;
        this.f11453f = executor;
        this.f11454g = i32;
        this.f11455h = c0248Bc;
        this.f11450a = c1510e1;
        this.f11452e = xl;
        this.f11456i = oq;
        this.c = c0658gk;
        this.d = interfaceC1263uq;
        this.f11457j = binderC0489cm;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.a5, com.google.android.gms.internal.ads.Cu, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Aj aj = new Aj(this);
        synchronized (aj) {
            String str = (String) O1.r.d.c.a(AbstractC1066q6.f10233h3);
            Context context = aj.c;
            I3 i32 = aj.f3977g;
            C0248Bc c0248Bc = aj.f3978h;
            C1510e1 c1510e1 = aj.f3974b;
            BinderC0489cm binderC0489cm = aj.f3982l;
            ?? obj = new Object();
            obj.f8076o = context;
            obj.f8077p = i32;
            obj.f8078q = c0248Bc;
            obj.f8079r = c1510e1;
            obj.f8080s = binderC0489cm;
            obj.f8081t = str;
            C1310vu m02 = Bs.m0(Bs.k0(obj, AbstractC0266Ec.f4899e), new C0563eb(1, aj), aj.f3976f);
            aj.f3983m = m02;
            AbstractC1230u.k(m02, "NativeJavascriptExecutor.initializeEngine");
        }
        return aj;
    }
}
