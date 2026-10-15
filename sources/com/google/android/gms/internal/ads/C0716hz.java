package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.hz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0716hz extends C0800jz {

    /* renamed from: r, reason: collision with root package name */
    public final int f9015r;

    /* renamed from: s, reason: collision with root package name */
    public final int f9016s;

    public C0716hz(byte[] bArr, int i4, int i5) {
        super(bArr);
        AbstractC0886lz.x(i4, i4 + i5, bArr.length);
        this.f9015r = i4;
        this.f9016s = i5;
    }

    @Override // com.google.android.gms.internal.ads.C0800jz
    public final int C() {
        return this.f9015r;
    }

    @Override // com.google.android.gms.internal.ads.C0800jz, com.google.android.gms.internal.ads.AbstractC0886lz
    public final byte i(int i4) {
        AbstractC0886lz.B(i4, this.f9016s);
        return this.f9236q[this.f9015r + i4];
    }

    @Override // com.google.android.gms.internal.ads.C0800jz, com.google.android.gms.internal.ads.AbstractC0886lz
    public final byte j(int i4) {
        return this.f9236q[this.f9015r + i4];
    }

    @Override // com.google.android.gms.internal.ads.C0800jz, com.google.android.gms.internal.ads.AbstractC0886lz
    public final int l() {
        return this.f9016s;
    }

    @Override // com.google.android.gms.internal.ads.C0800jz, com.google.android.gms.internal.ads.AbstractC0886lz
    public final void n(int i4, int i5, int i6, byte[] bArr) {
        System.arraycopy(this.f9236q, this.f9015r + i4, bArr, i5, i6);
    }
}
