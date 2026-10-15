package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.wC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1329wC {

    /* renamed from: a, reason: collision with root package name */
    public final C1202tE f11118a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11119b;
    public final long c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11120e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11121f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11122g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11123h;

    public C1329wC(C1202tE c1202tE, long j4, long j5, long j6, long j7, boolean z4, boolean z5, boolean z6) {
        Zf.O(!z6 || z4);
        Zf.O(!z5 || z4);
        this.f11118a = c1202tE;
        this.f11119b = j4;
        this.c = j5;
        this.d = j6;
        this.f11120e = j7;
        this.f11121f = z4;
        this.f11122g = z5;
        this.f11123h = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1329wC.class == obj.getClass()) {
            C1329wC c1329wC = (C1329wC) obj;
            if (this.f11119b == c1329wC.f11119b && this.c == c1329wC.c && this.d == c1329wC.d && this.f11120e == c1329wC.f11120e && this.f11121f == c1329wC.f11121f && this.f11122g == c1329wC.f11122g && this.f11123h == c1329wC.f11123h && AbstractC0751is.c(this.f11118a, c1329wC.f11118a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f11118a.hashCode() + 527) * 31) + ((int) this.f11119b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.f11120e)) * 961) + (this.f11121f ? 1 : 0)) * 31) + (this.f11122g ? 1 : 0)) * 31) + (this.f11123h ? 1 : 0);
    }
}
