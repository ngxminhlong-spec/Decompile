package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class X1 {

    /* renamed from: a, reason: collision with root package name */
    public final Sr f7585a;

    /* renamed from: b, reason: collision with root package name */
    public final C1134rq f7586b;
    public boolean c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7587e;

    /* renamed from: f, reason: collision with root package name */
    public long f7588f;

    /* renamed from: g, reason: collision with root package name */
    public long f7589g;

    /* renamed from: h, reason: collision with root package name */
    public long f7590h;

    public X1(int i4) {
        switch (i4) {
            case 1:
                this.f7585a = new Sr();
                this.f7588f = -9223372036854775807L;
                this.f7589g = -9223372036854775807L;
                this.f7590h = -9223372036854775807L;
                this.f7586b = new C1134rq();
                return;
            default:
                this.f7585a = new Sr();
                this.f7588f = -9223372036854775807L;
                this.f7589g = -9223372036854775807L;
                this.f7590h = -9223372036854775807L;
                this.f7586b = new C1134rq();
                return;
        }
    }

    public static long a(C1134rq c1134rq) {
        int i4 = c1134rq.f10537b;
        if (c1134rq.g() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c1134rq.a(bArr, 0, 9);
        c1134rq.e(i4);
        byte b4 = bArr[0];
        if ((b4 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b5 = bArr[2];
        if ((b5 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b6 = bArr[4];
        if ((b6 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j4 = b4;
        long j5 = b5;
        long j6 = (248 & j5) >> 3;
        long j7 = (bArr[1] & 255) << 20;
        long j8 = (j5 & 3) << 13;
        return j8 | j7 | ((j4 & 3) << 28) | (((j4 & 56) >> 3) << 30) | (j6 << 15) | ((bArr[3] & 255) << 5) | ((b6 & 248) >> 3);
    }

    public static final int c(int i4, byte[] bArr) {
        return (bArr[i4 + 3] & 255) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8);
    }

    public void b(C c) {
        byte[] bArr = AbstractC0751is.f9074f;
        int length = bArr.length;
        this.f7586b.c(0, bArr);
        this.c = true;
        c.j();
    }
}
