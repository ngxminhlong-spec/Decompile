package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ip {

    /* renamed from: a, reason: collision with root package name */
    public O1.U0 f5727a;

    /* renamed from: b, reason: collision with root package name */
    public O1.X0 f5728b;
    public String c;
    public O1.R0 d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5729e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f5730f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f5731g;

    /* renamed from: h, reason: collision with root package name */
    public C0766j7 f5732h;

    /* renamed from: i, reason: collision with root package name */
    public O1.a1 f5733i;

    /* renamed from: j, reason: collision with root package name */
    public K1.a f5734j;

    /* renamed from: k, reason: collision with root package name */
    public K1.d f5735k;

    /* renamed from: l, reason: collision with root package name */
    public O1.O f5736l;

    /* renamed from: m, reason: collision with root package name */
    public int f5737m = 1;

    /* renamed from: n, reason: collision with root package name */
    public C8 f5738n;

    /* renamed from: o, reason: collision with root package name */
    public final n0.n f5739o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5740p;

    /* renamed from: q, reason: collision with root package name */
    public Bn f5741q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5742r;

    /* renamed from: s, reason: collision with root package name */
    public O1.S f5743s;

    public Ip() {
        n0.n nVar = new n0.n();
        nVar.f14098p = 2;
        this.f5739o = nVar;
        this.f5740p = false;
        this.f5742r = false;
    }

    public final Jp a() {
        h2.y.j(this.c, "ad unit must not be null");
        h2.y.j(this.f5728b, "ad size must not be null");
        h2.y.j(this.f5727a, "ad request must not be null");
        return new Jp(this);
    }
}
