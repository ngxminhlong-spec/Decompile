package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0676h1 implements InterfaceC0633g1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8902a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8903b;
    public int c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8904e;

    public C0676h1(int i4, int i5, int i6, int i7, int i8, byte[] bArr) {
        this.f8902a = i5;
        this.f8903b = i6;
        this.c = i7;
        this.d = i8;
        this.f8904e = bArr;
    }

    public C0676h1(C0462c1 c0462c1) {
        C1134rq c1134rq = c0462c1.c;
        this.f8904e = c1134rq;
        c1134rq.e(12);
        this.f8903b = c1134rq.p() & 255;
        this.f8902a = c1134rq.p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0633g1
    public int b() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0633g1
    public int c() {
        return this.f8902a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0633g1
    public int e() {
        C1134rq c1134rq = (C1134rq) this.f8904e;
        int i4 = this.f8903b;
        if (i4 == 8) {
            return c1134rq.m();
        }
        if (i4 == 16) {
            return c1134rq.q();
        }
        int i5 = this.c;
        this.c = i5 + 1;
        if (i5 % 2 != 0) {
            return this.d & 15;
        }
        int m4 = c1134rq.m();
        this.d = m4;
        return (m4 & 240) >> 4;
    }
}
