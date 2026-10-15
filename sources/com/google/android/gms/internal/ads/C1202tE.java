package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1202tE {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10688a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10689b;
    public final int c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10690e;

    public C1202tE(long j4, Object obj) {
        this(obj, -1, -1, j4, -1);
    }

    public C1202tE(Object obj, int i4, int i5, long j4, int i6) {
        this.f10688a = obj;
        this.f10689b = i4;
        this.c = i5;
        this.d = j4;
        this.f10690e = i6;
    }

    public C1202tE(Object obj, long j4, int i4) {
        this(obj, -1, -1, j4, i4);
    }

    public final C1202tE a(Object obj) {
        return this.f10688a.equals(obj) ? this : new C1202tE(obj, this.f10689b, this.c, this.d, this.f10690e);
    }

    public final boolean b() {
        return this.f10689b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1202tE)) {
            return false;
        }
        C1202tE c1202tE = (C1202tE) obj;
        return this.f10688a.equals(c1202tE.f10688a) && this.f10689b == c1202tE.f10689b && this.c == c1202tE.c && this.d == c1202tE.d && this.f10690e == c1202tE.f10690e;
    }

    public final int hashCode() {
        return ((((((((this.f10688a.hashCode() + 527) * 31) + this.f10689b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.f10690e;
    }
}
