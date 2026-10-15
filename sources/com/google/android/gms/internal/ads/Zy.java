package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Zy {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8067a;

    public Zy(int i4, byte[] bArr) {
        byte[] bArr2 = new byte[i4];
        this.f8067a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i4);
    }

    public static Zy a(byte[] bArr) {
        if (bArr != null) {
            return new Zy(bArr.length, bArr);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final byte[] b() {
        byte[] bArr = this.f8067a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Zy) {
            return Arrays.equals(((Zy) obj).f8067a, this.f8067a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8067a);
    }

    public final String toString() {
        return U.a.k("Bytes(", Bs.k(this.f8067a), ")");
    }
}
