package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Mw extends AbstractC1398xw {

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f6287s;

    /* renamed from: t, reason: collision with root package name */
    public Uri f6288t;

    /* renamed from: u, reason: collision with root package name */
    public int f6289u;

    /* renamed from: v, reason: collision with root package name */
    public int f6290v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6291w;

    public Mw(byte[] bArr) {
        super(false);
        Zf.O(bArr.length > 0);
        this.f6287s = bArr;
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final Uri e() {
        return this.f6288t;
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final void i() {
        if (this.f6291w) {
            this.f6291w = false;
            c();
        }
        this.f6288t = null;
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final long o(C0757iz c0757iz) {
        Uri uri = c0757iz.f9104a;
        long j4 = c0757iz.f9106e;
        this.f6288t = uri;
        f(c0757iz);
        long j5 = c0757iz.d;
        int length = this.f6287s.length;
        if (j5 > length) {
            throw new C0715hy();
        }
        int i4 = (int) j5;
        this.f6289u = i4;
        int i5 = length - i4;
        this.f6290v = i5;
        if (j4 != -1) {
            this.f6290v = (int) Math.min(i5, j4);
        }
        this.f6291w = true;
        g(c0757iz);
        return j4 != -1 ? j4 : this.f6290v;
    }

    @Override // com.google.android.gms.internal.ads.ZD
    public final int r(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        int i6 = this.f6290v;
        if (i6 == 0) {
            return -1;
        }
        int min = Math.min(i5, i6);
        System.arraycopy(this.f6287s, this.f6289u, bArr, i4, min);
        this.f6289u += min;
        this.f6290v -= min;
        v(min);
        return min;
    }
}
