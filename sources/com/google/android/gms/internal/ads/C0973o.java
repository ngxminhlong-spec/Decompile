package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0973o implements P {

    /* renamed from: a, reason: collision with root package name */
    public final r f9791a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9792b;
    public final long c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9793e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9794f;

    public C0973o(r rVar, long j4, long j5, long j6, long j7, long j8) {
        this.f9791a = rVar;
        this.f9792b = j4;
        this.c = j5;
        this.d = j6;
        this.f9793e = j7;
        this.f9794f = j8;
    }

    @Override // com.google.android.gms.internal.ads.P
    public final long b() {
        return this.f9792b;
    }

    @Override // com.google.android.gms.internal.ads.P
    public final O c(long j4) {
        Q q4 = new Q(j4, C1059q.a(this.f9791a.d(j4), 0L, this.c, this.d, this.f9793e, this.f9794f));
        return new O(q4, q4);
    }

    @Override // com.google.android.gms.internal.ads.P
    public final boolean f() {
        return true;
    }
}
