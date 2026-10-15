package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.xF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1375xF {

    /* renamed from: a, reason: collision with root package name */
    public long f11255a;

    /* renamed from: b, reason: collision with root package name */
    public long f11256b;
    public long c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f11257e;

    /* renamed from: f, reason: collision with root package name */
    public long f11258f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f11259g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    public int f11260h;

    public final void a(long j4) {
        long j5 = this.d;
        if (j5 == 0) {
            this.f11255a = j4;
        } else if (j5 == 1) {
            long j6 = j4 - this.f11255a;
            this.f11256b = j6;
            this.f11258f = j6;
            this.f11257e = 1L;
        } else {
            long j7 = j4 - this.c;
            long abs = Math.abs(j7 - this.f11256b);
            int i4 = (int) (j5 % 15);
            boolean[] zArr = this.f11259g;
            if (abs <= 1000000) {
                this.f11257e++;
                this.f11258f += j7;
                if (zArr[i4]) {
                    zArr[i4] = false;
                    this.f11260h--;
                }
            } else if (!zArr[i4]) {
                zArr[i4] = true;
                this.f11260h++;
            }
        }
        this.d++;
        this.c = j4;
    }

    public final void b() {
        this.d = 0L;
        this.f11257e = 0L;
        this.f11258f = 0L;
        this.f11260h = 0;
        Arrays.fill(this.f11259g, false);
    }

    public final boolean c() {
        return this.d > 15 && this.f11260h == 0;
    }
}
