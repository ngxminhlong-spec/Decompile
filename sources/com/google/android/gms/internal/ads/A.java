package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class A implements V {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3902a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.V
    public final void a(C0976o2 c0976o2) {
    }

    @Override // com.google.android.gms.internal.ads.V
    public final int b(C c, int i4, boolean z4) {
        return e(c, i4, z4);
    }

    @Override // com.google.android.gms.internal.ads.V
    public final void c(int i4, C1134rq c1134rq) {
        c1134rq.f(i4);
    }

    @Override // com.google.android.gms.internal.ads.V
    public final void d(long j4, int i4, int i5, int i6, U u2) {
    }

    @Override // com.google.android.gms.internal.ads.V
    public final int e(ZD zd, int i4, boolean z4) {
        int r4 = zd.r(this.f3902a, 0, Math.min(4096, i4));
        if (r4 != -1) {
            return r4;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.V
    public final void f(int i4, C1134rq c1134rq) {
        c1134rq.f(i4);
    }
}
