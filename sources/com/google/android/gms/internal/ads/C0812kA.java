package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.kA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0812kA {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0417az f9279a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9280b;
    public final Object[] c;
    public final int d;

    public C0812kA(AbstractC0417az abstractC0417az, String str, Object[] objArr) {
        this.f9279a = abstractC0417az;
        this.f9280b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i4 = charAt & 8191;
        int i5 = 1;
        int i6 = 13;
        while (true) {
            int i7 = i5 + 1;
            char charAt2 = str.charAt(i5);
            if (charAt2 < 55296) {
                this.d = i4 | (charAt2 << i6);
                return;
            } else {
                i4 |= (charAt2 & 8191) << i6;
                i6 += 13;
                i5 = i7;
            }
        }
    }

    public final int a() {
        int i4 = this.d;
        if ((i4 & 1) != 0) {
            return 1;
        }
        return (i4 & 4) == 4 ? 3 : 2;
    }
}
