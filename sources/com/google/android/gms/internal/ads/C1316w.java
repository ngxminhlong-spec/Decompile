package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1316w implements C {

    /* renamed from: p, reason: collision with root package name */
    public final ZD f11098p;

    /* renamed from: q, reason: collision with root package name */
    public final long f11099q;

    /* renamed from: r, reason: collision with root package name */
    public long f11100r;

    /* renamed from: t, reason: collision with root package name */
    public int f11102t;

    /* renamed from: u, reason: collision with root package name */
    public int f11103u;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f11101s = new byte[65536];

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f11097o = new byte[4096];

    static {
        AbstractC0861la.a("media3.extractor");
    }

    public C1316w(ZD zd, long j4, long j5) {
        this.f11098p = zd;
        this.f11100r = j4;
        this.f11099q = j5;
    }

    @Override // com.google.android.gms.internal.ads.C
    public final void A(byte[] bArr, int i4, int i5) {
        E(bArr, i4, i5, false);
    }

    @Override // com.google.android.gms.internal.ads.C
    public final boolean C(byte[] bArr, int i4, int i5, boolean z4) {
        int min;
        int i6 = this.f11103u;
        if (i6 == 0) {
            min = 0;
        } else {
            min = Math.min(i6, i5);
            System.arraycopy(this.f11101s, 0, bArr, i4, min);
            k(min);
        }
        int i7 = min;
        while (i7 < i5 && i7 != -1) {
            i7 = g(bArr, i4, i5, i7, z4);
        }
        if (i7 != -1) {
            this.f11100r += i7;
        }
        return i7 != -1;
    }

    @Override // com.google.android.gms.internal.ads.C
    public final int D(byte[] bArr, int i4, int i5) {
        C1316w c1316w;
        int min;
        h(i5);
        int i6 = this.f11103u;
        int i7 = this.f11102t;
        int i8 = i6 - i7;
        if (i8 == 0) {
            c1316w = this;
            min = c1316w.g(this.f11101s, i7, i5, 0, true);
            if (min == -1) {
                return -1;
            }
            c1316w.f11103u += min;
        } else {
            c1316w = this;
            min = Math.min(i5, i8);
        }
        System.arraycopy(c1316w.f11101s, c1316w.f11102t, bArr, i4, min);
        c1316w.f11102t += min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.C
    public final boolean E(byte[] bArr, int i4, int i5, boolean z4) {
        if (!c(i5, z4)) {
            return false;
        }
        System.arraycopy(this.f11101s, this.f11102t - i5, bArr, i4, i5);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.C
    public final long a() {
        return this.f11100r + this.f11102t;
    }

    public final boolean c(int i4, boolean z4) {
        h(i4);
        int i5 = this.f11103u - this.f11102t;
        while (i5 < i4) {
            int i6 = i4;
            boolean z5 = z4;
            i5 = g(this.f11101s, this.f11102t, i6, i5, z5);
            if (i5 == -1) {
                return false;
            }
            this.f11103u = this.f11102t + i5;
            i4 = i6;
            z4 = z5;
        }
        this.f11102t += i4;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.C
    public final long d() {
        return this.f11100r;
    }

    @Override // com.google.android.gms.internal.ads.C
    public final int e() {
        C1316w c1316w;
        int min = Math.min(this.f11103u, 1);
        k(min);
        if (min == 0) {
            c1316w = this;
            min = c1316w.g(this.f11097o, 0, Math.min(1, 4096), 0, true);
        } else {
            c1316w = this;
        }
        if (min != -1) {
            c1316w.f11100r += min;
        }
        return min;
    }

    public final void f(int i4) {
        int min = Math.min(this.f11103u, i4);
        k(min);
        int i5 = min;
        while (i5 < i4 && i5 != -1) {
            i5 = g(this.f11097o, -i5, Math.min(i4, i5 + 4096), i5, false);
        }
        if (i5 != -1) {
            this.f11100r += i5;
        }
    }

    public final int g(byte[] bArr, int i4, int i5, int i6, boolean z4) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int r4 = this.f11098p.r(bArr, i4 + i6, i5 - i6);
        if (r4 != -1) {
            return i6 + r4;
        }
        if (i6 == 0 && z4) {
            return -1;
        }
        throw new EOFException();
    }

    public final void h(int i4) {
        int i5 = this.f11102t + i4;
        int length = this.f11101s.length;
        if (i5 > length) {
            this.f11101s = Arrays.copyOf(this.f11101s, Math.max(65536 + i5, Math.min(length + length, i5 + 524288)));
        }
    }

    @Override // com.google.android.gms.internal.ads.C
    public final long i() {
        return this.f11099q;
    }

    @Override // com.google.android.gms.internal.ads.C
    public final void j() {
        this.f11102t = 0;
    }

    public final void k(int i4) {
        int i5 = this.f11103u - i4;
        this.f11103u = i5;
        this.f11102t = 0;
        byte[] bArr = this.f11101s;
        byte[] bArr2 = i5 < bArr.length + (-524288) ? new byte[65536 + i5] : bArr;
        System.arraycopy(bArr, i4, bArr2, 0, i5);
        this.f11101s = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.ZD
    public final int r(byte[] bArr, int i4, int i5) {
        C1316w c1316w;
        int i6 = this.f11103u;
        int i7 = 0;
        if (i6 != 0) {
            int min = Math.min(i6, i5);
            System.arraycopy(this.f11101s, 0, bArr, i4, min);
            k(min);
            i7 = min;
        }
        if (i7 == 0) {
            c1316w = this;
            i7 = c1316w.g(bArr, i4, i5, 0, true);
        } else {
            c1316w = this;
        }
        if (i7 != -1) {
            c1316w.f11100r += i7;
        }
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.C
    public final void v(int i4) {
        c(i4, false);
    }

    @Override // com.google.android.gms.internal.ads.C
    public final void w(int i4) {
        f(i4);
    }

    @Override // com.google.android.gms.internal.ads.C
    public final void y(byte[] bArr, int i4, int i5) {
        C(bArr, i4, i5, false);
    }
}
