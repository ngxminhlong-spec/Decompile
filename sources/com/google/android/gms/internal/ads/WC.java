package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class WC {

    /* renamed from: a, reason: collision with root package name */
    public final String f7353a;

    /* renamed from: b, reason: collision with root package name */
    public int f7354b;
    public long c;
    public final C1202tE d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7355e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7356f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ XC f7357g;

    public WC(XC xc, String str, int i4, C1202tE c1202tE) {
        this.f7357g = xc;
        this.f7353a = str;
        this.f7354b = i4;
        this.c = c1202tE == null ? -1L : c1202tE.d;
        if (c1202tE == null || !c1202tE.b()) {
            return;
        }
        this.d = c1202tE;
    }

    public final boolean a(OC oc) {
        C1202tE c1202tE = oc.d;
        if (c1202tE == null) {
            return this.f7354b != oc.c;
        }
        long j4 = this.c;
        if (j4 == -1) {
            return false;
        }
        if (c1202tE.d > j4) {
            return true;
        }
        C1202tE c1202tE2 = this.d;
        if (c1202tE2 == null) {
            return false;
        }
        int i4 = c1202tE2.f10689b;
        AbstractC0484ch abstractC0484ch = oc.f6444b;
        int a4 = abstractC0484ch.a(c1202tE.f10688a);
        int a5 = abstractC0484ch.a(c1202tE2.f10688a);
        if (c1202tE.d < c1202tE2.d || a4 < a5) {
            return false;
        }
        if (a4 > a5) {
            return true;
        }
        if (!c1202tE.b()) {
            int i5 = c1202tE.f10690e;
            return i5 == -1 || i5 > i4;
        }
        int i6 = c1202tE.f10689b;
        int i7 = c1202tE.c;
        if (i6 <= i4) {
            return i6 == i4 && i7 > c1202tE2.c;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r2 < r10.c()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(com.google.android.gms.internal.ads.AbstractC0484ch r9, com.google.android.gms.internal.ads.AbstractC0484ch r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.XC r0 = r8.f7357g
            com.google.android.gms.internal.ads.Rg r1 = r0.f7617a
            int r2 = r8.f7354b
            int r3 = r9.c()
            r4 = 0
            r5 = -1
            if (r2 < r3) goto L17
            int r9 = r10.c()
            if (r2 >= r9) goto L15
            goto L38
        L15:
            r2 = r5
            goto L38
        L17:
            r6 = 0
            r9.e(r2, r1, r6)
            int r2 = r1.f6825l
        L1e:
            int r3 = r1.f6826m
            if (r2 > r3) goto L15
            java.lang.Object r3 = r9.f(r2)
            int r3 = r10.a(r3)
            if (r3 == r5) goto L35
            com.google.android.gms.internal.ads.tg r9 = r0.f7618b
            com.google.android.gms.internal.ads.tg r9 = r10.d(r3, r9, r4)
            int r2 = r9.c
            goto L38
        L35:
            int r2 = r2 + 1
            goto L1e
        L38:
            r8.f7354b = r2
            if (r2 != r5) goto L3d
            goto L4c
        L3d:
            com.google.android.gms.internal.ads.tE r9 = r8.d
            if (r9 != 0) goto L42
            goto L4a
        L42:
            java.lang.Object r9 = r9.f10688a
            int r9 = r10.a(r9)
            if (r9 == r5) goto L4c
        L4a:
            r9 = 1
            return r9
        L4c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.WC.b(com.google.android.gms.internal.ads.ch, com.google.android.gms.internal.ads.ch):boolean");
    }
}
