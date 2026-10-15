package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class O1 {

    /* renamed from: a, reason: collision with root package name */
    public final V f6425a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6426b;
    public boolean c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public int f6427e;

    /* renamed from: f, reason: collision with root package name */
    public int f6428f;

    /* renamed from: g, reason: collision with root package name */
    public long f6429g;

    /* renamed from: h, reason: collision with root package name */
    public long f6430h;

    public O1(V v4) {
        this.f6425a = v4;
    }

    public final void a(byte[] bArr, int i4, int i5) {
        if (this.c) {
            int i6 = this.f6428f;
            int i7 = (i4 + 1) - i6;
            if (i7 >= i5) {
                this.f6428f = (i5 - i4) + i6;
            } else {
                this.d = ((bArr[i7] & 192) >> 6) == 0;
                this.c = false;
            }
        }
    }

    public final void b(int i4, long j4, boolean z4) {
        if (this.f6427e == 182 && z4 && this.f6426b) {
            long j5 = this.f6430h;
            if (j5 != -9223372036854775807L) {
                long j6 = j4 - this.f6429g;
                int i5 = (int) j6;
                this.f6425a.d(j5, this.d ? 1 : 0, i5, i4, null);
            }
        }
        if (this.f6427e != 179) {
            this.f6429g = j4;
        }
    }
}
