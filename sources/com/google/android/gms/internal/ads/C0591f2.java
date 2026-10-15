package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.f2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0591f2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8673a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8674b;
    public final int c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f8675e;

    public C0591f2(int i4, int i5, int i6) {
        String str;
        if (i4 != Integer.MIN_VALUE) {
            str = i4 + "/";
        } else {
            str = "";
        }
        this.f8673a = str;
        this.f8674b = i5;
        this.c = i6;
        this.d = Integer.MIN_VALUE;
        this.f8675e = "";
    }

    public final void a() {
        int i4 = this.d;
        int i5 = i4 == Integer.MIN_VALUE ? this.f8674b : i4 + this.c;
        this.d = i5;
        this.f8675e = this.f8673a + i5;
    }

    public final void b() {
        if (this.d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
