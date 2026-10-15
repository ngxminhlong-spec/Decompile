package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Z implements B {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f7937k = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f7938l;

    /* renamed from: m, reason: collision with root package name */
    public static final byte[] f7939m;

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f7940n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f7941o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7943b;
    public long c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f7944e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7945f;

    /* renamed from: h, reason: collision with root package name */
    public D f7947h;

    /* renamed from: i, reason: collision with root package name */
    public V f7948i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7949j;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7942a = new byte[1];

    /* renamed from: g, reason: collision with root package name */
    public int f7946g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f7938l = iArr;
        int i4 = AbstractC0751is.f9071a;
        Charset charset = AbstractC1480zs.c;
        f7939m = "#!AMR\n".getBytes(charset);
        f7940n = "#!AMR-WB\n".getBytes(charset);
        f7941o = iArr[8];
    }

    public final boolean a(C c) {
        c.j();
        byte[] bArr = f7939m;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        C1316w c1316w = (C1316w) c;
        c1316w.E(bArr2, 0, length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f7943b = false;
            c1316w.f(bArr.length);
            return true;
        }
        c.j();
        byte[] bArr3 = f7940n;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        c1316w.E(bArr4, 0, length2, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f7943b = true;
        c1316w.f(bArr3.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.B
    public final boolean d(C c) {
        return a(c);
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void g(D d) {
        this.f7947h = d;
        this.f7948i = d.z(0, 1);
        d.x();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091 A[Catch: EOFException -> 0x00ae, TryCatch #0 {EOFException -> 0x00ae, blocks: (B:32:0x0062, B:34:0x0073, B:42:0x0091, B:44:0x009c, B:48:0x0097, B:58:0x00d5, B:59:0x00ed, B:60:0x00ee, B:61:0x00fe), top: B:31:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097 A[Catch: EOFException -> 0x00ae, TryCatch #0 {EOFException -> 0x00ae, blocks: (B:32:0x0062, B:34:0x0073, B:42:0x0091, B:44:0x009c, B:48:0x0097, B:58:0x00d5, B:59:0x00ed, B:60:0x00ee, B:61:0x00fe), top: B:31:0x0062 }] */
    @Override // com.google.android.gms.internal.ads.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.C r19, com.google.android.gms.internal.ads.F r20) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Z.h(com.google.android.gms.internal.ads.C, com.google.android.gms.internal.ads.F):int");
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void i(long j4, long j5) {
        this.c = 0L;
        this.d = 0;
        this.f7944e = 0;
    }
}
