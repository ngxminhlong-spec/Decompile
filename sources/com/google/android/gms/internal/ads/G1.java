package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class G1 implements J1 {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f5111v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5112a;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public String f5114e;

    /* renamed from: f, reason: collision with root package name */
    public V f5115f;

    /* renamed from: g, reason: collision with root package name */
    public V f5116g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5120k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5121l;

    /* renamed from: o, reason: collision with root package name */
    public int f5124o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5125p;

    /* renamed from: r, reason: collision with root package name */
    public int f5127r;

    /* renamed from: t, reason: collision with root package name */
    public V f5129t;

    /* renamed from: u, reason: collision with root package name */
    public long f5130u;

    /* renamed from: b, reason: collision with root package name */
    public final X f5113b = new X(7, new byte[7]);
    public final C1134rq c = new C1134rq(Arrays.copyOf(f5111v, 10));

    /* renamed from: h, reason: collision with root package name */
    public int f5117h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f5118i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f5119j = 256;

    /* renamed from: m, reason: collision with root package name */
    public int f5122m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f5123n = -1;

    /* renamed from: q, reason: collision with root package name */
    public long f5126q = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    public long f5128s = -9223372036854775807L;

    public G1(boolean z4, String str) {
        this.f5112a = z4;
        this.d = str;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void a() {
        this.f5128s = -9223372036854775807L;
        this.f5121l = false;
        this.f5117h = 0;
        this.f5118i = 0;
        this.f5119j = 256;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0203, code lost:
    
        r19 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02f7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.J1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.google.android.gms.internal.ads.C1134rq r21) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.G1.f(com.google.android.gms.internal.ads.rq):void");
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void g(boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void h(D d, C0591f2 c0591f2) {
        c0591f2.a();
        c0591f2.b();
        this.f5114e = c0591f2.f8675e;
        c0591f2.b();
        V z4 = d.z(c0591f2.d, 1);
        this.f5115f = z4;
        this.f5129t = z4;
        if (!this.f5112a) {
            this.f5116g = new A();
            return;
        }
        c0591f2.a();
        c0591f2.b();
        V z5 = d.z(c0591f2.d, 5);
        this.f5116g = z5;
        L1 l12 = new L1();
        c0591f2.b();
        l12.f6094a = c0591f2.f8675e;
        l12.f6101j = "application/id3";
        z5.a(new C0976o2(l12));
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void i(int i4, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f5128s = j4;
        }
    }
}
