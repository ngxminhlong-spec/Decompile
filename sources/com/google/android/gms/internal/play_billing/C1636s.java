package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1636s extends C1638t {

    /* renamed from: r, reason: collision with root package name */
    public final int f12243r;

    public C1636s(int i4, byte[] bArr) {
        super(bArr);
        C1638t.k(0, i4, bArr.length);
        this.f12243r = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.C1638t
    public final byte h(int i4) {
        int i5 = this.f12243r;
        if (((i5 - (i4 + 1)) | i4) >= 0) {
            return this.f12246p[i4];
        }
        if (i4 < 0) {
            throw new ArrayIndexOutOfBoundsException(U.a.i("Index < 0: ", i4));
        }
        throw new ArrayIndexOutOfBoundsException(U.a.g(i4, i5, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.C1638t
    public final byte i(int i4) {
        return this.f12246p[i4];
    }

    @Override // com.google.android.gms.internal.play_billing.C1638t
    public final int j() {
        return this.f12243r;
    }
}
