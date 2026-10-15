package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public int f6185a;

    /* renamed from: b, reason: collision with root package name */
    public int f6186b;
    public int c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f6187e;

    /* renamed from: f, reason: collision with root package name */
    public int f6188f;

    /* renamed from: g, reason: collision with root package name */
    public Serializable f6189g;

    public boolean a(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if ((i4 & (-2097152)) != -2097152 || (i5 = (i4 >>> 19) & 3) == 1 || (i6 = (i4 >>> 17) & 3) == 0 || (i7 = (i4 >>> 12) & 15) == 0 || i7 == 15 || (i8 = (i4 >>> 10) & 3) == 3) {
            return false;
        }
        int i9 = i7 - 1;
        this.f6185a = i5;
        this.f6189g = Y9.f7778m[3 - i6];
        int i10 = Y9.f7779n[i8];
        this.c = i10;
        if (i5 == 2) {
            i10 /= 2;
            this.c = i10;
        } else if (i5 == 0) {
            i10 /= 4;
            this.c = i10;
        }
        int i11 = (i4 >>> 9) & 1;
        int i12 = 1152;
        if (i6 != 1) {
            if (i6 != 2) {
                i12 = 384;
            }
        } else if (i5 != 3) {
            i12 = 576;
        }
        this.f6188f = i12;
        if (i6 == 3) {
            int i13 = i5 == 3 ? Y9.f7780o[i9] : Y9.f7781p[i9];
            this.f6187e = i13;
            this.f6186b = (((i13 * 12) / i10) + i11) * 4;
        } else {
            if (i5 == 3) {
                int i14 = i6 == 2 ? Y9.f7782q[i9] : Y9.f7783r[i9];
                this.f6187e = i14;
                this.f6186b = ((i14 * 144) / i10) + i11;
            } else {
                int i15 = Y9.f7784s[i9];
                this.f6187e = i15;
                this.f6186b = (((i6 == 1 ? 72 : 144) * i15) / i10) + i11;
            }
        }
        this.d = ((i4 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
