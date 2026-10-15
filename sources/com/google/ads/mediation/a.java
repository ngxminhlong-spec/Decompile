package com.google.ads.mediation;

import N1.i;
import N1.n;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.net.TrafficStats;
import com.google.android.gms.internal.ads.A6;
import com.google.android.gms.internal.ads.Ap;
import com.google.android.gms.internal.ads.BinderC0489cm;
import com.google.android.gms.internal.ads.C0248Bc;
import com.google.android.gms.internal.ads.C0303Ld;
import com.google.android.gms.internal.ads.C0348Ud;
import com.google.android.gms.internal.ads.C0396ae;
import com.google.android.gms.internal.ads.C0764j5;
import com.google.android.gms.internal.ads.C0887m;
import com.google.android.gms.internal.ads.C1434yp;
import com.google.android.gms.internal.ads.I3;
import com.google.android.gms.internal.ads.Ls;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC0358Wd;
import com.google.android.gms.internal.measurement.C1510e1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements Ls {

    /* renamed from: A, reason: collision with root package name */
    public Object f3832A;

    /* renamed from: B, reason: collision with root package name */
    public Object f3833B;

    /* renamed from: o, reason: collision with root package name */
    public String f3834o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3835p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3836q;

    /* renamed from: r, reason: collision with root package name */
    public Object f3837r;

    /* renamed from: s, reason: collision with root package name */
    public Object f3838s;

    /* renamed from: t, reason: collision with root package name */
    public Object f3839t;

    /* renamed from: u, reason: collision with root package name */
    public Object f3840u;

    /* renamed from: v, reason: collision with root package name */
    public Object f3841v;

    /* renamed from: w, reason: collision with root package name */
    public Object f3842w;

    /* renamed from: x, reason: collision with root package name */
    public Object f3843x;
    public Object y;

    /* renamed from: z, reason: collision with root package name */
    public Object f3844z;

    public /* synthetic */ a(Context context, C0887m c0887m, String str, boolean z4, boolean z5, I3 i32, A6 a6, C0248Bc c0248Bc, i iVar, C1510e1 c1510e1, C0764j5 c0764j5, C1434yp c1434yp, Ap ap, BinderC0489cm binderC0489cm) {
        this.f3837r = context;
        this.f3838s = c0887m;
        this.f3834o = str;
        this.f3835p = z4;
        this.f3836q = z5;
        this.f3839t = i32;
        this.f3840u = a6;
        this.f3841v = c0248Bc;
        this.f3842w = iVar;
        this.f3843x = c1510e1;
        this.y = c0764j5;
        this.f3844z = c1434yp;
        this.f3832A = ap;
        this.f3833B = binderC0489cm;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [com.google.android.gms.internal.ads.ee, android.content.MutableContextWrapper] */
    @Override // com.google.android.gms.internal.ads.Ls
    public Object b() {
        C0887m c0887m = (C0887m) this.f3838s;
        String str = this.f3834o;
        boolean z4 = this.f3835p;
        C0764j5 c0764j5 = (C0764j5) this.y;
        boolean z5 = this.f3836q;
        I3 i32 = (I3) this.f3839t;
        A6 a6 = (A6) this.f3840u;
        i iVar = (i) this.f3842w;
        C1434yp c1434yp = (C1434yp) this.f3844z;
        Context context = (Context) this.f3837r;
        C0248Bc c0248Bc = (C0248Bc) this.f3841v;
        C1510e1 c1510e1 = (C1510e1) this.f3843x;
        Ap ap = (Ap) this.f3832A;
        BinderC0489cm binderC0489cm = (BinderC0489cm) this.f3833B;
        try {
            TrafficStats.setThreadStatsTag(264);
            int i4 = ViewTreeObserverOnGlobalLayoutListenerC0358Wd.f7463m0;
            ?? mutableContextWrapper = new MutableContextWrapper(context);
            mutableContextWrapper.setBaseContext(context);
            C0348Ud c0348Ud = new C0348Ud(new ViewTreeObserverOnGlobalLayoutListenerC0358Wd(mutableContextWrapper, c0887m, str, z4, i32, a6, c0248Bc, iVar, c1510e1, c0764j5, c1434yp, ap));
            n.f1204A.f1207e.getClass();
            c0348Ud.setWebViewClient(new C0396ae(c0348Ud, c0764j5, z5, binderC0489cm));
            c0348Ud.setWebChromeClient(new C0303Ld(c0348Ud));
            return c0348Ud;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
