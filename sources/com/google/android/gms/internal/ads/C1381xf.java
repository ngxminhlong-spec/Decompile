package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import b0.RunnableC0203p;
import java.util.concurrent.Executor;
import l2.C1798a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.xf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1381xf implements InterfaceC1450z4 {

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0308Md f11273o;

    /* renamed from: p, reason: collision with root package name */
    public final Executor f11274p;

    /* renamed from: q, reason: collision with root package name */
    public final C1081qf f11275q;

    /* renamed from: r, reason: collision with root package name */
    public final C1798a f11276r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11277s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f11278t = false;

    /* renamed from: u, reason: collision with root package name */
    public final C1166sf f11279u = new C1166sf();

    public C1381xf(Executor executor, C1081qf c1081qf, C1798a c1798a) {
        this.f11274p = executor;
        this.f11275q = c1081qf;
        this.f11276r = c1798a;
    }

    public final void a() {
        try {
            JSONObject r4 = this.f11275q.r(this.f11279u);
            if (this.f11273o != null) {
                this.f11274p.execute(new RunnableC0203p(19, this, r4));
            }
        } catch (JSONException e4) {
            Q1.I.x("Failed to call video active view js", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1450z4
    public final void j0(C1407y4 c1407y4) {
        boolean z4 = this.f11278t ? false : c1407y4.f11338j;
        C1166sf c1166sf = this.f11279u;
        c1166sf.f10613a = z4;
        this.f11276r.getClass();
        c1166sf.c = SystemClock.elapsedRealtime();
        c1166sf.f10615e = c1407y4;
        if (this.f11277s) {
            a();
        }
    }
}
