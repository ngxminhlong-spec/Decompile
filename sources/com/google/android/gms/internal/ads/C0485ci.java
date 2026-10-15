package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ci, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0485ci {

    /* renamed from: a, reason: collision with root package name */
    public int f8375a;

    /* renamed from: b, reason: collision with root package name */
    public int f8376b;
    public final AbstractC1137rt c;
    public final AbstractC1137rt d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1137rt f8377e;

    /* renamed from: f, reason: collision with root package name */
    public final Yh f8378f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC1137rt f8379g;

    /* renamed from: h, reason: collision with root package name */
    public int f8380h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f8381i;

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f8382j;

    public C0485ci() {
        this.f8375a = Integer.MAX_VALUE;
        this.f8376b = Integer.MAX_VALUE;
        C1052pt c1052pt = AbstractC1137rt.f10543p;
        Gt gt = Gt.f5344s;
        this.c = gt;
        this.d = gt;
        this.f8377e = gt;
        this.f8378f = Yh.f7865a;
        this.f8379g = gt;
        this.f8380h = 0;
        this.f8381i = new HashMap();
        this.f8382j = new HashSet();
    }

    public C0485ci(ZE ze) {
        this.f8375a = ze.f9638a;
        this.f8376b = ze.f9639b;
        this.c = ze.c;
        this.d = ze.d;
        this.f8377e = ze.f9640e;
        this.f8378f = ze.f9641f;
        this.f8379g = ze.f9642g;
        this.f8380h = ze.f9643h;
        this.f8382j = new HashSet(ze.f9645j);
        this.f8381i = new HashMap(ze.f9644i);
    }
}
