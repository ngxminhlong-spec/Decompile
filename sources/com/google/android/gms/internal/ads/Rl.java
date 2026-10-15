package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Rl {

    /* renamed from: a, reason: collision with root package name */
    public long f6833a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f6834b = 0;
    public long c = 0;
    public long d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f6835e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6836f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final Object f6837g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final Object f6838h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final Object f6839i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final Object f6840j = new Object();

    public final int a() {
        int i4;
        synchronized (this.f6837g) {
            i4 = this.f6834b;
        }
        return i4;
    }

    public final synchronized long b() {
        long j4;
        synchronized (this.f6840j) {
            j4 = this.f6835e;
        }
        return j4;
    }

    public final synchronized long c() {
        long j4;
        synchronized (this.f6839i) {
            j4 = this.d;
        }
        return j4;
    }

    public final synchronized long d() {
        long j4;
        synchronized (this.f6836f) {
            j4 = this.f6833a;
        }
        return j4;
    }

    public final synchronized void e(long j4) {
        synchronized (this.f6836f) {
            this.f6833a = j4;
        }
    }

    public final void f(int i4) {
        synchronized (this.f6837g) {
            this.f6834b = i4;
        }
    }
}
