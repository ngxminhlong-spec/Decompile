package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7314a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f7315b;
    public int c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public int f7316e;

    /* renamed from: f, reason: collision with root package name */
    public int f7317f;

    /* renamed from: g, reason: collision with root package name */
    public int f7318g;

    public final void a(V v4, U u2) {
        if (this.c > 0) {
            v4.d(this.d, this.f7316e, this.f7317f, this.f7318g, u2);
            this.c = 0;
        }
    }

    public final void b(V v4, long j4, int i4, int i5, int i6, U u2) {
        if (this.f7318g > i5 + i6) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f7315b) {
            int i7 = this.c;
            int i8 = i7 + 1;
            this.c = i8;
            if (i7 == 0) {
                this.d = j4;
                this.f7316e = i4;
                this.f7317f = 0;
            }
            this.f7317f += i5;
            this.f7318g = i6;
            if (i8 >= 16) {
                a(v4, u2);
            }
        }
    }

    public final void c(C c) {
        if (this.f7315b) {
            return;
        }
        byte[] bArr = this.f7314a;
        c.A(bArr, 0, 10);
        c.j();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f7315b = true;
        }
    }
}
