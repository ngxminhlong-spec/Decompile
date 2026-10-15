package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1275v1 implements A1 {

    /* renamed from: o, reason: collision with root package name */
    public final C1447z1 f10970o;

    /* renamed from: p, reason: collision with root package name */
    public final long f10971p;

    /* renamed from: q, reason: collision with root package name */
    public final long f10972q;

    /* renamed from: r, reason: collision with root package name */
    public final C1 f10973r;

    /* renamed from: s, reason: collision with root package name */
    public int f10974s;

    /* renamed from: t, reason: collision with root package name */
    public long f10975t;

    /* renamed from: u, reason: collision with root package name */
    public long f10976u;

    /* renamed from: v, reason: collision with root package name */
    public long f10977v;

    /* renamed from: w, reason: collision with root package name */
    public long f10978w;

    /* renamed from: x, reason: collision with root package name */
    public long f10979x;
    public long y;

    /* renamed from: z, reason: collision with root package name */
    public long f10980z;

    public C1275v1(C1 c12, long j4, long j5, long j6, long j7, boolean z4) {
        Zf.O(j4 >= 0 && j5 > j4);
        this.f10973r = c12;
        this.f10971p = j4;
        this.f10972q = j5;
        if (j6 == j5 - j4 || z4) {
            this.f10975t = j7;
            this.f10974s = 4;
        } else {
            this.f10974s = 0;
        }
        this.f10970o = new C1447z1();
    }

    @Override // com.google.android.gms.internal.ads.A1
    public final /* bridge */ /* synthetic */ P a() {
        if (this.f10975t != 0) {
            return new C1232u1(this);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.A1
    public final void c(long j4) {
        this.f10977v = Math.max(0L, Math.min(j4, this.f10975t - 1));
        this.f10974s = 2;
        this.f10978w = this.f10971p;
        this.f10979x = this.f10972q;
        this.y = 0L;
        this.f10980z = this.f10975t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.A1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(com.google.android.gms.internal.ads.C r28) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1275v1.e(com.google.android.gms.internal.ads.C):long");
    }
}
