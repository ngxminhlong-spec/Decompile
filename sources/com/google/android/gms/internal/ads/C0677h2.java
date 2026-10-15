package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.h2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0677h2 implements InterfaceC0720i2 {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f8905m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f8906n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a, reason: collision with root package name */
    public final D f8907a;

    /* renamed from: b, reason: collision with root package name */
    public final V f8908b;
    public final C0676h1 c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f8909e;

    /* renamed from: f, reason: collision with root package name */
    public final C1134rq f8910f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8911g;

    /* renamed from: h, reason: collision with root package name */
    public final C0976o2 f8912h;

    /* renamed from: i, reason: collision with root package name */
    public int f8913i;

    /* renamed from: j, reason: collision with root package name */
    public long f8914j;

    /* renamed from: k, reason: collision with root package name */
    public int f8915k;

    /* renamed from: l, reason: collision with root package name */
    public long f8916l;

    public C0677h2(D d, V v4, C0676h1 c0676h1) {
        this.f8907a = d;
        this.f8908b = v4;
        this.c = c0676h1;
        int i4 = c0676h1.f8903b;
        int max = Math.max(1, i4 / 10);
        this.f8911g = max;
        C1134rq c1134rq = new C1134rq((byte[]) c0676h1.f8904e);
        c1134rq.k();
        int k3 = c1134rq.k();
        this.d = k3;
        int i5 = c0676h1.f8902a;
        int i6 = c0676h1.c;
        int i7 = (((i6 - (i5 * 4)) * 8) / (c0676h1.d * i5)) + 1;
        if (k3 != i7) {
            throw C0907md.a("Expected frames per block: " + i7 + "; got: " + k3, null);
        }
        int i8 = AbstractC0751is.f9071a;
        int i9 = ((max + k3) - 1) / k3;
        this.f8909e = new byte[i9 * i6];
        this.f8910f = new C1134rq((k3 + k3) * i5 * i9);
        int i10 = ((i6 * i4) * 8) / k3;
        L1 l12 = new L1();
        l12.f6101j = "audio/raw";
        l12.f6096e = i10;
        l12.f6097f = i10;
        l12.f6102k = (max + max) * i5;
        l12.f6114w = i5;
        l12.f6115x = i4;
        l12.y = 2;
        this.f8912h = new C0976o2(l12);
    }

    public final void a(int i4) {
        C0676h1 c0676h1 = this.c;
        long v4 = this.f8914j + AbstractC0751is.v(this.f8916l, 1000000L, c0676h1.f8903b, RoundingMode.FLOOR);
        int i5 = (i4 + i4) * c0676h1.f8902a;
        this.f8908b.d(v4, 1, i5, this.f8915k - i5, null);
        this.f8916l += i4;
        this.f8915k -= i5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0720i2
    public final void b(long j4) {
        this.f8913i = 0;
        this.f8914j = j4;
        this.f8915k = 0;
        this.f8916l = 0L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0720i2
    public final void d(int i4, long j4) {
        this.f8907a.B(new C0890m2(this.c, this.d, i4, j4));
        this.f8908b.a(this.f8912h);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:49:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:5:0x0024->B:11:0x003f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:3:0x0021). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.InterfaceC0720i2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(com.google.android.gms.internal.ads.C r25, long r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0677h2.e(com.google.android.gms.internal.ads.C, long):boolean");
    }
}
