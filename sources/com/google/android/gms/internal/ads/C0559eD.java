package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.eD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0559eD {

    /* renamed from: b, reason: collision with root package name */
    public static final C0559eD f8591b = new C0559eD(new int[]{2});
    public static final Lt c;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f8592a;

    static {
        Object[] objArr = {2, 5, 6};
        Bs.D(3, objArr);
        AbstractC1137rt.q(3, objArr);
        J2 j22 = new J2(4);
        j22.a(5, 6);
        j22.a(17, 6);
        j22.a(7, 6);
        j22.a(30, 10);
        j22.a(18, 6);
        j22.a(6, 8);
        j22.a(8, 8);
        j22.a(14, 8);
        c = j22.k();
    }

    public C0559eD(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, 1);
        this.f8592a = copyOf;
        Arrays.sort(copyOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0041, code lost:
    
        if (java.util.Arrays.binarySearch(r1, 30) < 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair a(com.google.android.gms.internal.ads.C0976o2 r9) {
        /*
            r8 = this;
            java.lang.String r0 = r9.f9813k
            r0.getClass()
            java.lang.String r1 = r9.f9810h
            int r0 = com.google.android.gms.internal.ads.AbstractC0438bd.a(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.google.android.gms.internal.ads.Lt r2 = com.google.android.gms.internal.ads.C0559eD.c
            boolean r1 = r2.containsKey(r1)
            if (r1 != 0) goto L19
            goto Lc6
        L19:
            int[] r1 = r8.f8592a
            r3 = 7
            r4 = 8
            r5 = 6
            r6 = 18
            if (r0 != r6) goto L2d
            int r0 = java.util.Arrays.binarySearch(r1, r6)
            if (r0 < 0) goto L2b
            r0 = r6
            goto L2d
        L2b:
            r0 = r5
            goto L43
        L2d:
            if (r0 != r4) goto L39
            int r0 = java.util.Arrays.binarySearch(r1, r4)
            if (r0 < 0) goto L37
            r0 = r4
            goto L39
        L37:
            r0 = r3
            goto L43
        L39:
            r7 = 30
            if (r0 != r7) goto L43
            int r7 = java.util.Arrays.binarySearch(r1, r7)
            if (r7 < 0) goto L37
        L43:
            int r1 = java.util.Arrays.binarySearch(r1, r0)
            if (r1 < 0) goto Lc6
            int r1 = r9.f9826x
            r7 = -1
            if (r1 == r7) goto L64
            if (r0 != r6) goto L51
            goto L64
        L51:
            java.lang.String r9 = r9.f9813k
            java.lang.String r2 = "audio/vnd.dts.uhd;profile=p2"
            boolean r9 = r9.equals(r2)
            r2 = 10
            if (r9 == 0) goto L61
            if (r1 <= r2) goto L8c
            goto Lc6
        L61:
            if (r1 <= r2) goto L8c
            goto Lc6
        L64:
            int r9 = r9.y
            if (r9 != r7) goto L6b
            r9 = 48000(0xbb80, float:6.7262E-41)
        L6b:
            int r1 = com.google.android.gms.internal.ads.AbstractC0751is.f9071a
            r6 = 29
            if (r1 < r6) goto L76
            int r1 = com.google.android.gms.internal.ads.AbstractC0517dD.a(r0, r9)
            goto L8c
        L76:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r9 = r2.get(r9)
            if (r9 == 0) goto L86
            r1 = r9
        L86:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
        L8c:
            int r9 = com.google.android.gms.internal.ads.AbstractC0751is.f9071a
            r2 = 28
            if (r9 > r2) goto La0
            if (r1 != r3) goto L95
            goto La1
        L95:
            r2 = 3
            if (r1 == r2) goto L9e
            r2 = 4
            if (r1 == r2) goto L9e
            r2 = 5
            if (r1 != r2) goto La0
        L9e:
            r4 = r5
            goto La1
        La0:
            r4 = r1
        La1:
            r1 = 26
            if (r9 > r1) goto Lb3
            java.lang.String r9 = "fugu"
            java.lang.String r1 = com.google.android.gms.internal.ads.AbstractC0751is.f9072b
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto Lb3
            r9 = 1
            if (r4 != r9) goto Lb3
            r4 = 2
        Lb3:
            int r9 = com.google.android.gms.internal.ads.AbstractC0751is.n(r4)
            if (r9 == 0) goto Lc6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r9 = android.util.Pair.create(r0, r9)
            return r9
        Lc6:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0559eD.a(com.google.android.gms.internal.ads.o2):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0559eD) && Arrays.equals(this.f8592a, ((C0559eD) obj).f8592a);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f8592a) * 31) + 10;
    }

    public final String toString() {
        return U.a.k("AudioCapabilities[maxChannelCount=10, supportedEncodings=", Arrays.toString(this.f8592a), "]");
    }
}
