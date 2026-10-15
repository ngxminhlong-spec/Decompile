package com.google.android.gms.internal.ads;

import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.xp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1391xp {

    /* renamed from: a, reason: collision with root package name */
    public final C1798a f11302a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11303b = new Object();
    public volatile int d = 1;
    public volatile long c = 0;

    public C1391xp(C1798a c1798a) {
        this.f11302a = c1798a;
    }

    public final boolean a() {
        boolean z4;
        synchronized (this.f11303b) {
            b();
            z4 = this.d == 3;
        }
        return z4;
    }

    public final void b() {
        this.f11302a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f11303b) {
            try {
                if (this.d == 3) {
                    if (this.c + ((Long) O1.r.d.c.a(AbstractC1066q6.f5)).longValue() <= currentTimeMillis) {
                        this.d = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(int i4, int i5) {
        b();
        Object obj = this.f11303b;
        this.f11302a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.d != i4) {
                    return;
                }
                this.d = i5;
                if (this.d == 3) {
                    this.c = currentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
