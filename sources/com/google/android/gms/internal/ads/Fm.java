package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Fm implements InterfaceC0570ei {

    /* renamed from: o, reason: collision with root package name */
    public boolean f5075o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f5076p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f5077q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f5078r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f5079s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f5080t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f5081u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f5082v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f5083w;

    public Fm() {
        this.f5076p = new HashMap();
        this.f5077q = new HashMap();
        this.f5078r = new HashMap();
        this.f5079s = new HashSet();
        this.f5080t = new HashSet();
        this.f5081u = new HashSet();
        this.f5082v = new HashMap();
        this.f5083w = new WeakHashMap();
    }

    public Fm(Context context, C0248Bc c0248Bc, C0272Fc c0272Fc, C1434yp c1434yp, C0348Ud c0348Ud, Jp jp, boolean z4, C0640g8 c0640g8, BinderC0489cm binderC0489cm) {
        this.f5076p = context;
        this.f5077q = c0248Bc;
        this.f5078r = c0272Fc;
        this.f5079s = c1434yp;
        this.f5080t = c0348Ud;
        this.f5081u = jp;
        this.f5082v = c0640g8;
        this.f5075o = z4;
        this.f5083w = binderC0489cm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0570ei
    public void j(boolean z4, Context context, Og og) {
        C1434yp c1434yp = (C1434yp) this.f5079s;
        C0640g8 c0640g8 = (C0640g8) this.f5082v;
        C0274Fe c0274Fe = (C0274Fe) Bs.q0((C0272Fc) this.f5078r);
        ((C0348Ud) this.f5080t).y0(true);
        boolean z5 = this.f5075o;
        boolean z6 = false;
        boolean c = z5 ? c0640g8.c(false) : false;
        Q1.N n4 = N1.n.f1204A.c;
        boolean f4 = Q1.N.f((Context) this.f5076p);
        if (z5) {
            synchronized (c0640g8) {
                z6 = c0640g8.f8788b;
            }
        }
        N1.h hVar = new N1.h(c, f4, z6, z5 ? c0640g8.a() : 0.0f, z4, c1434yp.f11488O, false);
        if (og != null) {
            og.d();
        }
        C0443bi c0443bi = (C0443bi) c0274Fe.f5058x.c();
        C0348Ud c0348Ud = (C0348Ud) this.f5080t;
        C0248Bc c0248Bc = (C0248Bc) this.f5077q;
        int i4 = c1434yp.f11490Q;
        String str = c1434yp.f11476B;
        Cp cp = c1434yp.f11534s;
        C2033d.m(context, new AdOverlayInfoParcel(c0443bi, c0348Ud, i4, c0248Bc, str, hVar, cp.f4552b, cp.f4551a, ((Jp) this.f5081u).f5911f, og, c1434yp.f11515i0 ? (BinderC0489cm) this.f5083w : null), true);
    }
}
