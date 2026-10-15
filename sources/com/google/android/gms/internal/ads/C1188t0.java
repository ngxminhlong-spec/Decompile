package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1188t0 extends I {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f10660b;
    public final /* synthetic */ N1.d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1188t0(N1.d dVar, P p3, P p4) {
        super(p3);
        this.c = dVar;
        this.f10660b = p4;
    }

    @Override // com.google.android.gms.internal.ads.I, com.google.android.gms.internal.ads.P
    public final O c(long j4) {
        O c = this.f10660b.c(j4);
        Q q4 = c.f6421a;
        long j5 = q4.f6627b;
        long j6 = this.c.f1157p;
        Q q5 = new Q(q4.f6626a, j5 + j6);
        Q q6 = c.f6422b;
        return new O(q5, new Q(q6.f6626a, q6.f6627b + j6));
    }
}
