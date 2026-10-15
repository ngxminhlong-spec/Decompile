package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1210tg {

    /* renamed from: a, reason: collision with root package name */
    public Object f10711a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10712b;
    public int c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10713e;

    /* renamed from: f, reason: collision with root package name */
    public C0442bh f10714f = C0442bh.f8264b;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final long a(int i4, int i5) {
        C0437bc a4 = this.f10714f.a(i4);
        if (a4.f8256a != -1) {
            return a4.d[i5];
        }
        return -9223372036854775807L;
    }

    public final void b(int i4, long j4, Object obj, Object obj2, boolean z4) {
        C0442bh c0442bh = C0442bh.f8264b;
        this.f10711a = obj;
        this.f10712b = obj2;
        this.c = i4;
        this.d = j4;
        this.f10714f = c0442bh;
        this.f10713e = z4;
    }

    public final void c(int i4) {
        this.f10714f.a(i4).getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C1210tg.class.equals(obj.getClass())) {
            return false;
        }
        C1210tg c1210tg = (C1210tg) obj;
        return AbstractC0751is.c(this.f10711a, c1210tg.f10711a) && AbstractC0751is.c(this.f10712b, c1210tg.f10712b) && this.c == c1210tg.c && this.d == c1210tg.d && this.f10713e == c1210tg.f10713e && AbstractC0751is.c(this.f10714f, c1210tg.f10714f);
    }

    public final int hashCode() {
        Object obj = this.f10711a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f10712b;
        int hashCode2 = ((((hashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c;
        long j4 = this.d;
        return this.f10714f.hashCode() + (((((hashCode2 * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 961) + (this.f10713e ? 1 : 0)) * 31);
    }
}
