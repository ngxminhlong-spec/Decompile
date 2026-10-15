package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class NC implements InterfaceC1243uC {

    /* renamed from: o, reason: collision with root package name */
    public boolean f6307o;

    /* renamed from: p, reason: collision with root package name */
    public long f6308p;

    /* renamed from: q, reason: collision with root package name */
    public long f6309q;

    /* renamed from: r, reason: collision with root package name */
    public C0951ne f6310r;

    public final void a(long j4) {
        this.f6308p = j4;
        if (this.f6307o) {
            this.f6309q = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1243uC
    public final long b() {
        long j4 = this.f6308p;
        if (!this.f6307o) {
            return j4;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f6309q;
        return (this.f6310r.f9742a == 1.0f ? AbstractC0751is.t(elapsedRealtime) : elapsedRealtime * r4.c) + j4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1243uC
    public final void c(C0951ne c0951ne) {
        if (this.f6307o) {
            a(b());
        }
        this.f6310r = c0951ne;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1243uC
    public final C0951ne e() {
        return this.f6310r;
    }
}
