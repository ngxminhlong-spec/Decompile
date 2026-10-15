package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.bC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0431bC {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8216a;

    /* renamed from: b, reason: collision with root package name */
    public final C1475zn f8217b;
    public final Xj c;
    public final C0536dr d;

    /* renamed from: e, reason: collision with root package name */
    public Ls f8218e;

    /* renamed from: f, reason: collision with root package name */
    public Ls f8219f;

    /* renamed from: g, reason: collision with root package name */
    public final C0536dr f8220g;

    /* renamed from: h, reason: collision with root package name */
    public final Looper f8221h;

    /* renamed from: i, reason: collision with root package name */
    public final C0644gC f8222i;

    /* renamed from: j, reason: collision with root package name */
    public final int f8223j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f8224k;

    /* renamed from: l, reason: collision with root package name */
    public final LC f8225l;

    /* renamed from: m, reason: collision with root package name */
    public final long f8226m;

    /* renamed from: n, reason: collision with root package name */
    public final long f8227n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f8228o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8229p;

    /* renamed from: q, reason: collision with root package name */
    public final XB f8230q;

    public C0431bC(Context context, C0874ln c0874ln) {
        Xj xj = new Xj(26, c0874ln);
        C0536dr c0536dr = new C0536dr(context, 4);
        C0894m6 c0894m6 = new C0894m6(context, 5);
        Yv yv = Yv.f7914K;
        C0536dr c0536dr2 = new C0536dr(context, 5);
        context.getClass();
        this.f8216a = context;
        this.c = xj;
        this.d = c0536dr;
        this.f8218e = c0894m6;
        this.f8219f = yv;
        this.f8220g = c0536dr2;
        int i4 = AbstractC0751is.f9071a;
        Looper myLooper = Looper.myLooper();
        this.f8221h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f8222i = C0644gC.f8792b;
        this.f8223j = 1;
        this.f8224k = true;
        this.f8225l = LC.c;
        this.f8230q = new XB(AbstractC0751is.t(20L), AbstractC0751is.t(500L));
        this.f8217b = C1475zn.f11653A;
        this.f8226m = 500L;
        this.f8227n = 2000L;
        this.f8228o = true;
    }
}
