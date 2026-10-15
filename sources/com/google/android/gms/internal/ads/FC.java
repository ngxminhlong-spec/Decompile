package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class FC {

    /* renamed from: s, reason: collision with root package name */
    public static final C1202tE f4993s = new C1202tE(-1, new Object());

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0484ch f4994a;

    /* renamed from: b, reason: collision with root package name */
    public final C1202tE f4995b;
    public final long c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4996e;

    /* renamed from: f, reason: collision with root package name */
    public final ZB f4997f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4998g;

    /* renamed from: h, reason: collision with root package name */
    public final RE f4999h;

    /* renamed from: i, reason: collision with root package name */
    public final C0817kF f5000i;

    /* renamed from: j, reason: collision with root package name */
    public final List f5001j;

    /* renamed from: k, reason: collision with root package name */
    public final C1202tE f5002k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5003l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5004m;

    /* renamed from: n, reason: collision with root package name */
    public final C0951ne f5005n;

    /* renamed from: o, reason: collision with root package name */
    public volatile long f5006o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f5007p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f5008q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f5009r;

    public FC(AbstractC0484ch abstractC0484ch, C1202tE c1202tE, long j4, long j5, int i4, ZB zb, boolean z4, RE re, C0817kF c0817kF, List list, C1202tE c1202tE2, boolean z5, int i5, C0951ne c0951ne, long j6, long j7, long j8, long j9) {
        this.f4994a = abstractC0484ch;
        this.f4995b = c1202tE;
        this.c = j4;
        this.d = j5;
        this.f4996e = i4;
        this.f4997f = zb;
        this.f4998g = z4;
        this.f4999h = re;
        this.f5000i = c0817kF;
        this.f5001j = list;
        this.f5002k = c1202tE2;
        this.f5003l = z5;
        this.f5004m = i5;
        this.f5005n = c0951ne;
        this.f5006o = j6;
        this.f5007p = j7;
        this.f5008q = j8;
        this.f5009r = j9;
    }

    public static FC g(C0817kF c0817kF) {
        C0824kg c0824kg = AbstractC0484ch.f8374a;
        RE re = RE.d;
        Gt gt = Gt.f5344s;
        C0951ne c0951ne = C0951ne.d;
        C1202tE c1202tE = f4993s;
        return new FC(c0824kg, c1202tE, -9223372036854775807L, 0L, 1, null, false, re, c0817kF, gt, c1202tE, false, 0, c0951ne, 0L, 0L, 0L, 0L);
    }

    public final FC a(C1202tE c1202tE) {
        return new FC(this.f4994a, this.f4995b, this.c, this.d, this.f4996e, this.f4997f, this.f4998g, this.f4999h, this.f5000i, this.f5001j, c1202tE, this.f5003l, this.f5004m, this.f5005n, this.f5006o, this.f5007p, this.f5008q, this.f5009r);
    }

    public final FC b(C1202tE c1202tE, long j4, long j5, long j6, long j7, RE re, C0817kF c0817kF, List list) {
        C1202tE c1202tE2 = this.f5002k;
        boolean z4 = this.f5003l;
        int i4 = this.f5004m;
        C0951ne c0951ne = this.f5005n;
        long j8 = this.f5006o;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new FC(this.f4994a, c1202tE, j5, j6, this.f4996e, this.f4997f, this.f4998g, re, c0817kF, list, c1202tE2, z4, i4, c0951ne, j8, j7, j4, elapsedRealtime);
    }

    public final FC c(int i4, boolean z4) {
        return new FC(this.f4994a, this.f4995b, this.c, this.d, this.f4996e, this.f4997f, this.f4998g, this.f4999h, this.f5000i, this.f5001j, this.f5002k, z4, i4, this.f5005n, this.f5006o, this.f5007p, this.f5008q, this.f5009r);
    }

    public final FC d(ZB zb) {
        return new FC(this.f4994a, this.f4995b, this.c, this.d, this.f4996e, zb, this.f4998g, this.f4999h, this.f5000i, this.f5001j, this.f5002k, this.f5003l, this.f5004m, this.f5005n, this.f5006o, this.f5007p, this.f5008q, this.f5009r);
    }

    public final FC e(int i4) {
        return new FC(this.f4994a, this.f4995b, this.c, this.d, i4, this.f4997f, this.f4998g, this.f4999h, this.f5000i, this.f5001j, this.f5002k, this.f5003l, this.f5004m, this.f5005n, this.f5006o, this.f5007p, this.f5008q, this.f5009r);
    }

    public final FC f(AbstractC0484ch abstractC0484ch) {
        return new FC(abstractC0484ch, this.f4995b, this.c, this.d, this.f4996e, this.f4997f, this.f4998g, this.f4999h, this.f5000i, this.f5001j, this.f5002k, this.f5003l, this.f5004m, this.f5005n, this.f5006o, this.f5007p, this.f5008q, this.f5009r);
    }

    public final boolean h() {
        return this.f4996e == 3 && this.f5003l && this.f5004m == 0;
    }
}
