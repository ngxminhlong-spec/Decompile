package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ys, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1437ys implements Es {

    /* renamed from: o, reason: collision with root package name */
    public final char f11545o;

    public C1437ys(char c) {
        this.f11545o = c;
    }

    public final boolean a(char c) {
        return c == this.f11545o;
    }

    @Override // com.google.android.gms.internal.ads.Es
    public final /* synthetic */ boolean l(Object obj) {
        return a(((Character) obj).charValue());
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i4 = this.f11545o;
        for (int i5 = 0; i5 < 4; i5++) {
            cArr[5 - i5] = "0123456789ABCDEF".charAt(i4 & 15);
            i4 >>= 4;
        }
        return U.a.k("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }
}
