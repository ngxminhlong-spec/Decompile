package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1510e1;
import x2.C2066c0;
import x2.C2103v0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590f1 implements A1 {

    /* renamed from: o, reason: collision with root package name */
    public long f8669o;

    /* renamed from: p, reason: collision with root package name */
    public long f8670p;

    /* renamed from: q, reason: collision with root package name */
    public Object f8671q;

    /* renamed from: r, reason: collision with root package name */
    public Object f8672r;

    public C0590f1(long j4) {
        Zf.X(((C0860lF) this.f8671q) == null);
        this.f8669o = j4;
        this.f8670p = j4 + 65536;
    }

    public C0590f1(String str, byte[] bArr, long j4, long j5) {
        this.f8671q = str;
        this.f8672r = bArr;
        this.f8669o = j4;
        this.f8670p = j5;
    }

    @Override // com.google.android.gms.internal.ads.A1
    public P a() {
        Zf.X(this.f8669o != -1);
        return new G((H) this.f8671q, this.f8669o, 0);
    }

    public boolean b(long j4, boolean z4, boolean z5) {
        x2.P0 p02 = (x2.P0) this.f8671q;
        x2.Q0 q02 = (x2.Q0) this.f8672r;
        q02.g();
        q02.e();
        ((com.google.android.gms.internal.measurement.Z2) com.google.android.gms.internal.measurement.Y2.f11856p.f11857o.b()).getClass();
        C2066c0 c2066c0 = (C2066c0) q02.f1719a;
        if (!c2066c0.f15566g.p(null, x2.B.f15294d0)) {
            x2.T t4 = c2066c0.f15567h;
            C2066c0.g(t4);
            x2.Q q4 = t4.f15449n;
            c2066c0.f15573n.getClass();
            q4.b(System.currentTimeMillis());
        } else if (c2066c0.e()) {
            x2.T t5 = c2066c0.f15567h;
            C2066c0.g(t5);
            x2.Q q5 = t5.f15449n;
            c2066c0.f15573n.getClass();
            q5.b(System.currentTimeMillis());
        }
        long j5 = j4 - this.f8669o;
        if (!z4 && j5 < 1000) {
            x2.K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15402n.b(Long.valueOf(j5), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z5) {
            j5 = j4 - this.f8670p;
            this.f8670p = j4;
        }
        x2.K k4 = c2066c0.f15568i;
        C2066c0.i(k4);
        k4.f15402n.b(Long.valueOf(j5), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j5);
        boolean r4 = c2066c0.f15566g.r();
        x2.C0 c02 = c2066c0.f15574o;
        C2066c0.h(c02);
        x2.b1.s(c02.l(!r4), bundle, true);
        if (!z5) {
            C2103v0 c2103v0 = c2066c0.f15575p;
            C2066c0.h(c2103v0);
            c2103v0.m("auto", "_e", bundle);
        }
        this.f8669o = j4;
        p02.a();
        p02.c(3600000L);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.A1
    public void c(long j4) {
        long[] jArr = (long[]) ((C1510e1) this.f8672r).f11914p;
        this.f8670p = jArr[AbstractC0751is.k(jArr, j4, true)];
    }

    @Override // com.google.android.gms.internal.ads.A1
    public long e(C c) {
        long j4 = this.f8670p;
        if (j4 < 0) {
            return -1L;
        }
        this.f8670p = -1L;
        return -(j4 + 2);
    }
}
