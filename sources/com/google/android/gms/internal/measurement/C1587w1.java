package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1587w1 extends C1591x1 {

    /* renamed from: r, reason: collision with root package name */
    public final int f12108r;

    public C1587w1(int i4, byte[] bArr) {
        super(bArr);
        C1591x1.k(0, i4, bArr.length);
        this.f12108r = i4;
    }

    @Override // com.google.android.gms.internal.measurement.C1591x1
    public final byte h(int i4) {
        int i5 = this.f12108r;
        if (((i5 - (i4 + 1)) | i4) >= 0) {
            return this.f12115p[i4];
        }
        if (i4 < 0) {
            throw new ArrayIndexOutOfBoundsException(U.a.i("Index < 0: ", i4));
        }
        throw new ArrayIndexOutOfBoundsException(U.a.g(i4, i5, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.measurement.C1591x1
    public final byte i(int i4) {
        return this.f12115p[i4];
    }

    @Override // com.google.android.gms.internal.measurement.C1591x1
    public final int j() {
        return this.f12108r;
    }
}
