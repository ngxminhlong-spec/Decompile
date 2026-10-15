package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0547e1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8543a;

    /* renamed from: b, reason: collision with root package name */
    public int f8544b;
    public int c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8545e;

    /* renamed from: f, reason: collision with root package name */
    public final C1134rq f8546f;

    /* renamed from: g, reason: collision with root package name */
    public final C1134rq f8547g;

    /* renamed from: h, reason: collision with root package name */
    public int f8548h;

    /* renamed from: i, reason: collision with root package name */
    public int f8549i;

    public C0547e1(C1134rq c1134rq, C1134rq c1134rq2, boolean z4) {
        this.f8547g = c1134rq;
        this.f8546f = c1134rq2;
        this.f8545e = z4;
        c1134rq2.e(12);
        this.f8543a = c1134rq2.p();
        c1134rq.e(12);
        this.f8549i = c1134rq.p();
        AbstractC1230u.C("first_chunk must be 1", c1134rq.h() == 1);
        this.f8544b = -1;
    }

    public final boolean a() {
        int i4 = this.f8544b + 1;
        this.f8544b = i4;
        if (i4 == this.f8543a) {
            return false;
        }
        boolean z4 = this.f8545e;
        C1134rq c1134rq = this.f8546f;
        this.d = z4 ? c1134rq.v() : c1134rq.u();
        if (this.f8544b == this.f8548h) {
            C1134rq c1134rq2 = this.f8547g;
            this.c = c1134rq2.p();
            c1134rq2.f(4);
            int i5 = this.f8549i - 1;
            this.f8549i = i5;
            this.f8548h = i5 > 0 ? (-1) + c1134rq2.p() : -1;
        }
        return true;
    }
}
