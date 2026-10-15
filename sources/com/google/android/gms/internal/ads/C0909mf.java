package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.mf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0909mf {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9629a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9630b;
    public final Z9 c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9631e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9632f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9633g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9634h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9635i;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public C0909mf(Object obj, int i4, Z9 z9, Object obj2, int i5, long j4, long j5, int i6, int i7) {
        this.f9629a = obj;
        this.f9630b = i4;
        this.c = z9;
        this.d = obj2;
        this.f9631e = i5;
        this.f9632f = j4;
        this.f9633g = j5;
        this.f9634h = i6;
        this.f9635i = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0909mf.class == obj.getClass()) {
            C0909mf c0909mf = (C0909mf) obj;
            if (this.f9630b == c0909mf.f9630b && this.f9631e == c0909mf.f9631e && this.f9632f == c0909mf.f9632f && this.f9633g == c0909mf.f9633g && this.f9634h == c0909mf.f9634h && this.f9635i == c0909mf.f9635i && Bs.r(this.c, c0909mf.c) && Bs.r(this.f9629a, c0909mf.f9629a) && Bs.r(this.d, c0909mf.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9629a, Integer.valueOf(this.f9630b), this.c, this.d, Integer.valueOf(this.f9631e), Long.valueOf(this.f9632f), Long.valueOf(this.f9633g), Integer.valueOf(this.f9634h), Integer.valueOf(this.f9635i)});
    }
}
