package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Sr {

    /* renamed from: a, reason: collision with root package name */
    public long f7017a;

    /* renamed from: b, reason: collision with root package name */
    public long f7018b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public Sr() {
        e(0L);
    }

    public final synchronized long a(long j4) {
        try {
            if (!f()) {
                long j5 = this.f7017a;
                if (j5 == 9223372036854775806L) {
                    Long l4 = (Long) this.d.get();
                    if (l4 == null) {
                        throw null;
                    }
                    j5 = l4.longValue();
                }
                this.f7018b = j5 - j4;
                notifyAll();
            }
            this.c = j4;
        } catch (Throwable th) {
            throw th;
        }
        return j4 + this.f7018b;
    }

    public final synchronized long b(long j4) {
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j5 = this.c;
            if (j5 != -9223372036854775807L) {
                long j6 = (j5 * 90000) / 1000000;
                long j7 = (4294967296L + j6) / 8589934592L;
                long j8 = (((-1) + j7) * 8589934592L) + j4;
                long j9 = (j7 * 8589934592L) + j4;
                j4 = Math.abs(j8 - j6) < Math.abs(j9 - j6) ? j8 : j9;
            }
            return a((j4 * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c() {
        long j4 = this.f7017a;
        if (j4 == Long.MAX_VALUE || j4 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j4;
    }

    public final synchronized long d() {
        return this.f7018b;
    }

    public final synchronized void e(long j4) {
        this.f7017a = j4;
        this.f7018b = j4 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public final synchronized boolean f() {
        return this.f7018b != -9223372036854775807L;
    }
}
