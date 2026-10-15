package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1139rv implements Comparable {

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f10551o;

    public /* synthetic */ C1139rv(byte[] bArr) {
        this.f10551o = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C1139rv c1139rv = (C1139rv) obj;
        byte[] bArr = this.f10551o;
        int length = bArr.length;
        int length2 = c1139rv.f10551o.length;
        if (length != length2) {
            return length - length2;
        }
        for (int i4 = 0; i4 < bArr.length; i4++) {
            byte b4 = bArr[i4];
            byte b5 = c1139rv.f10551o[i4];
            if (b4 != b5) {
                return b4 - b5;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1139rv) {
            return Arrays.equals(this.f10551o, ((C1139rv) obj).f10551o);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10551o);
    }

    public final String toString() {
        return Bs.k(this.f10551o);
    }
}
