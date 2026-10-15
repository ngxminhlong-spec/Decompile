package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.jz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0800jz extends AbstractC0886lz {

    /* renamed from: q, reason: collision with root package name */
    public final byte[] f9236q;

    public C0800jz(byte[] bArr) {
        bArr.getClass();
        this.f9236q = bArr;
    }

    public int C() {
        return 0;
    }

    public final boolean D(C0800jz c0800jz, int i4, int i5) {
        if (i5 > c0800jz.l()) {
            throw new IllegalArgumentException("Length too large: " + i5 + l());
        }
        if (i4 + i5 > c0800jz.l()) {
            int l4 = c0800jz.l();
            StringBuilder m4 = U.a.m("Ran off end of other: ", i4, ", ", i5, ", ");
            m4.append(l4);
            throw new IllegalArgumentException(m4.toString());
        }
        byte[] bArr = c0800jz.f9236q;
        int C4 = C() + i5;
        int C5 = C();
        int C6 = c0800jz.C() + i4;
        while (C5 < C4) {
            if (this.f9236q[C5] != bArr[C6]) {
                return false;
            }
            C5++;
            C6++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC0886lz) && l() == ((AbstractC0886lz) obj).l()) {
            if (l() == 0) {
                return true;
            }
            if (!(obj instanceof C0800jz)) {
                return obj.equals(this);
            }
            C0800jz c0800jz = (C0800jz) obj;
            int i4 = this.f9511o;
            int i5 = c0800jz.f9511o;
            if (i4 == 0 || i5 == 0 || i4 == i5) {
                return D(c0800jz, 0, l());
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public byte i(int i4) {
        return this.f9236q[i4];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public byte j(int i4) {
        return this.f9236q[i4];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public int l() {
        return this.f9236q.length;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public void n(int i4, int i5, int i6, byte[] bArr) {
        System.arraycopy(this.f9236q, i4, bArr, i5, i6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final int o() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final boolean p() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final int q(int i4, int i5, int i6) {
        int C4 = C() + i5;
        Charset charset = Mz.f6292a;
        for (int i7 = C4; i7 < C4 + i6; i7++) {
            i4 = (i4 * 31) + this.f9236q[i7];
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final int r(int i4, int i5, int i6) {
        int C4 = C() + i5;
        DA.f4592a.getClass();
        return C0347Uc.a(i4, C4, i6 + C4, this.f9236q);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final AbstractC0886lz s(int i4, int i5) {
        int x4 = AbstractC0886lz.x(i4, i5, l());
        if (x4 == 0) {
            return AbstractC0886lz.f9510p;
        }
        return new C0716hz(this.f9236q, C() + i4, x4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final AbstractC1012ow t() {
        int C4 = C();
        int l4 = l();
        C0929mz c0929mz = new C0929mz(this.f9236q, C4, l4);
        try {
            c0929mz.l(l4);
            return c0929mz;
        } catch (Oz e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final String u(Charset charset) {
        return new String(this.f9236q, C(), l(), charset);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final void v(AbstractC1229tz abstractC1229tz) {
        abstractC1229tz.i(this.f9236q, C(), l());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0886lz
    public final boolean w() {
        int C4 = C();
        int l4 = l() + C4;
        DA.f4592a.getClass();
        return C0347Uc.j(this.f9236q, C4, l4);
    }
}
