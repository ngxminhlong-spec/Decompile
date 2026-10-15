package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.measurement.C1510e1;
import java.util.Collections;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final int f5354a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5355b;
    public final int c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5356e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5357f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5358g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5359h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5360i;

    /* renamed from: j, reason: collision with root package name */
    public final long f5361j;

    /* renamed from: k, reason: collision with root package name */
    public final C1510e1 f5362k;

    /* renamed from: l, reason: collision with root package name */
    public final C1120rc f5363l;

    public H(int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j4, C1510e1 c1510e1, C1120rc c1120rc) {
        this.f5354a = i4;
        this.f5355b = i5;
        this.c = i6;
        this.d = i7;
        this.f5356e = i8;
        this.f5357f = d(i8);
        this.f5358g = i9;
        this.f5359h = i10;
        this.f5360i = c(i10);
        this.f5361j = j4;
        this.f5362k = c1510e1;
        this.f5363l = c1120rc;
    }

    public H(int i4, byte[] bArr) {
        X x4 = new X(bArr.length, bArr);
        x4.q(i4 * 8);
        this.f5354a = x4.f(16);
        this.f5355b = x4.f(16);
        this.c = x4.f(24);
        this.d = x4.f(24);
        int f4 = x4.f(20);
        this.f5356e = f4;
        this.f5357f = d(f4);
        this.f5358g = x4.f(3) + 1;
        int f5 = x4.f(5) + 1;
        this.f5359h = f5;
        this.f5360i = c(f5);
        int f6 = x4.f(4);
        int f7 = x4.f(32);
        int i5 = AbstractC0751is.f9071a;
        this.f5361j = ((f6 & 4294967295L) << 32) | (f7 & 4294967295L);
        this.f5362k = null;
        this.f5363l = null;
    }

    public static int c(int i4) {
        if (i4 == 8) {
            return 1;
        }
        if (i4 == 12) {
            return 2;
        }
        if (i4 == 16) {
            return 4;
        }
        if (i4 != 20) {
            return i4 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int d(int i4) {
        switch (i4) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j4 = this.f5361j;
        if (j4 == 0) {
            return -9223372036854775807L;
        }
        return (j4 * 1000000) / this.f5356e;
    }

    public final C0976o2 b(byte[] bArr, C1120rc c1120rc) {
        bArr[4] = Byte.MIN_VALUE;
        C1120rc c1120rc2 = this.f5363l;
        if (c1120rc2 != null) {
            c1120rc = c1120rc2.b(c1120rc);
        }
        L1 l12 = new L1();
        l12.f6101j = "audio/flac";
        int i4 = this.d;
        if (i4 <= 0) {
            i4 = -1;
        }
        l12.f6102k = i4;
        l12.f6114w = this.f5358g;
        l12.f6115x = this.f5356e;
        l12.f6103l = Collections.singletonList(bArr);
        l12.f6099h = c1120rc;
        return new C0976o2(l12);
    }
}
