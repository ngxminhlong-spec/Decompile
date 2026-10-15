package com.google.android.gms.internal.ads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class D9 implements S1.d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4588a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4589b;
    public int c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4590e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4591f;

    public D9(Date date, int i4, HashSet hashSet, boolean z4, int i5, boolean z5) {
        this.f4590e = date;
        this.c = i4;
        this.f4591f = hashSet;
        this.f4588a = z4;
        this.d = i5;
        this.f4589b = z5;
    }

    @Override // S1.d
    public boolean a() {
        return this.f4589b;
    }

    @Override // S1.d
    public Date b() {
        return (Date) this.f4590e;
    }

    @Override // S1.d
    public boolean c() {
        return this.f4588a;
    }

    @Override // S1.d
    public Set d() {
        return (Set) this.f4591f;
    }

    @Override // S1.d
    public int e() {
        return this.d;
    }

    @Override // S1.d
    public int f() {
        return this.c;
    }
}
