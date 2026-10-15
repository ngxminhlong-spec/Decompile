package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.mi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0912mi {

    /* renamed from: a, reason: collision with root package name */
    public final int f9638a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9639b;
    public final AbstractC1137rt c;
    public final AbstractC1137rt d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1137rt f9640e;

    /* renamed from: f, reason: collision with root package name */
    public final Yh f9641f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC1137rt f9642g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9643h;

    /* renamed from: i, reason: collision with root package name */
    public final Lt f9644i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC1266ut f9645j;

    static {
        new C0912mi(new C0485ci());
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
    }

    public C0912mi(C0485ci c0485ci) {
        this.f9638a = c0485ci.f8375a;
        this.f9639b = c0485ci.f8376b;
        this.c = c0485ci.c;
        this.d = c0485ci.d;
        this.f9640e = c0485ci.f8377e;
        this.f9641f = c0485ci.f8378f;
        this.f9642g = c0485ci.f8379g;
        this.f9643h = c0485ci.f8380h;
        this.f9644i = Lt.a(c0485ci.f8381i);
        HashSet hashSet = c0485ci.f8382j;
        int i4 = AbstractC1266ut.f10952q;
        Object[] array = hashSet.toArray();
        this.f9645j = AbstractC1266ut.t(array.length, array);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0912mi c0912mi = (C0912mi) obj;
        if (this.f9638a != c0912mi.f9638a || this.f9639b != c0912mi.f9639b || !this.c.equals(c0912mi.c) || !this.d.equals(c0912mi.d) || !this.f9640e.equals(c0912mi.f9640e) || !this.f9641f.equals(c0912mi.f9641f) || !this.f9642g.equals(c0912mi.f9642g) || this.f9643h != c0912mi.f9643h) {
            return false;
        }
        Lt lt = c0912mi.f9644i;
        Lt lt2 = this.f9644i;
        lt2.getClass();
        return Bs.I(lt, lt2) && this.f9645j.equals(c0912mi.f9645j);
    }

    public int hashCode() {
        return this.f9645j.hashCode() + ((this.f9644i.hashCode() + ((((this.f9642g.hashCode() + ((((this.f9640e.hashCode() + ((((((this.d.hashCode() + ((this.c.hashCode() + ((((1871669920 + this.f9638a) * 31) + this.f9639b) * 31)) * 961)) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31)) * 31) + 29791) * 31)) * 31) + this.f9643h) * 28629151)) * 31);
    }
}
