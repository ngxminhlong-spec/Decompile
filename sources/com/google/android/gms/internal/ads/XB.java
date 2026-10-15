package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class XB {

    /* renamed from: a, reason: collision with root package name */
    public final long f7606a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7607b;
    public long c = -9223372036854775807L;
    public long d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    public long f7609f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f7610g = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public float f7612i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public long f7613j = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public long f7608e = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f7611h = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public long f7614k = -9223372036854775807L;

    /* renamed from: l, reason: collision with root package name */
    public long f7615l = -9223372036854775807L;

    public /* synthetic */ XB(long j4, long j5) {
        this.f7606a = j4;
        this.f7607b = j5;
    }

    public final long a() {
        return this.f7611h;
    }

    public final void b() {
        long j4 = this.f7611h;
        if (j4 == -9223372036854775807L) {
            return;
        }
        long j5 = j4 + this.f7607b;
        this.f7611h = j5;
        long j6 = this.f7610g;
        if (j6 != -9223372036854775807L && j5 > j6) {
            this.f7611h = j6;
        }
        this.f7613j = -9223372036854775807L;
    }

    public final void c() {
        long j4 = this.c;
        if (j4 != -9223372036854775807L) {
            long j5 = this.d;
            if (j5 != -9223372036854775807L) {
                j4 = j5;
            }
            long j6 = this.f7609f;
            if (j6 != -9223372036854775807L && j4 < j6) {
                j4 = j6;
            }
            long j7 = this.f7610g;
            if (j7 != -9223372036854775807L && j4 > j7) {
                j4 = j7;
            }
        } else {
            j4 = -9223372036854775807L;
        }
        if (this.f7608e == j4) {
            return;
        }
        this.f7608e = j4;
        this.f7611h = j4;
        this.f7614k = -9223372036854775807L;
        this.f7615l = -9223372036854775807L;
        this.f7613j = -9223372036854775807L;
    }
}
