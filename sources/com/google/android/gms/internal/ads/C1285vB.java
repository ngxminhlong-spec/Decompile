package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.vB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1285vB {

    /* renamed from: j, reason: collision with root package name */
    public static final C1285vB f10998j = new C1285vB(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k, reason: collision with root package name */
    public static final C1285vB f10999k = new C1285vB(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l, reason: collision with root package name */
    public static final C1285vB f11000l = new C1285vB(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m, reason: collision with root package name */
    public static final C1285vB f11001m = new C1285vB(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    public final double f11002a;

    /* renamed from: b, reason: collision with root package name */
    public final double f11003b;
    public final double c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f11004e;

    /* renamed from: f, reason: collision with root package name */
    public final double f11005f;

    /* renamed from: g, reason: collision with root package name */
    public final double f11006g;

    /* renamed from: h, reason: collision with root package name */
    public final double f11007h;

    /* renamed from: i, reason: collision with root package name */
    public final double f11008i;

    public C1285vB(double d, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11) {
        this.f11002a = d7;
        this.f11003b = d8;
        this.c = d9;
        this.d = d;
        this.f11004e = d4;
        this.f11005f = d5;
        this.f11006g = d6;
        this.f11007h = d10;
        this.f11008i = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1285vB.class != obj.getClass()) {
            return false;
        }
        C1285vB c1285vB = (C1285vB) obj;
        return Double.compare(c1285vB.d, this.d) == 0 && Double.compare(c1285vB.f11004e, this.f11004e) == 0 && Double.compare(c1285vB.f11005f, this.f11005f) == 0 && Double.compare(c1285vB.f11006g, this.f11006g) == 0 && Double.compare(c1285vB.f11007h, this.f11007h) == 0 && Double.compare(c1285vB.f11008i, this.f11008i) == 0 && Double.compare(c1285vB.f11002a, this.f11002a) == 0 && Double.compare(c1285vB.f11003b, this.f11003b) == 0 && Double.compare(c1285vB.c, this.c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f11002a);
        long j4 = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f11003b);
        long j5 = doubleToLongBits2 ^ (doubleToLongBits2 >>> 32);
        long doubleToLongBits3 = Double.doubleToLongBits(this.c);
        long j6 = doubleToLongBits3 ^ (doubleToLongBits3 >>> 32);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long j7 = doubleToLongBits4 ^ (doubleToLongBits4 >>> 32);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f11004e);
        long j8 = doubleToLongBits5 ^ (doubleToLongBits5 >>> 32);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f11005f);
        long j9 = doubleToLongBits6 ^ (doubleToLongBits6 >>> 32);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f11006g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f11007h);
        long j10 = doubleToLongBits8 ^ (doubleToLongBits8 >>> 32);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f11008i);
        return (((((((((((((((((int) j4) * 31) + ((int) j5)) * 31) + ((int) j6)) * 31) + ((int) j7)) * 31) + ((int) j8)) * 31) + ((int) j9)) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) j10)) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f10998j)) {
            return "Rotate 0°";
        }
        if (equals(f10999k)) {
            return "Rotate 90°";
        }
        if (equals(f11000l)) {
            return "Rotate 180°";
        }
        if (equals(f11001m)) {
            return "Rotate 270°";
        }
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(this.f11002a);
        sb.append(", v=");
        sb.append(this.f11003b);
        sb.append(", w=");
        sb.append(this.c);
        sb.append(", a=");
        sb.append(this.d);
        sb.append(", b=");
        sb.append(this.f11004e);
        sb.append(", c=");
        sb.append(this.f11005f);
        sb.append(", d=");
        sb.append(this.f11006g);
        sb.append(", tx=");
        sb.append(this.f11007h);
        sb.append(", ty=");
        sb.append(this.f11008i);
        sb.append("}");
        return sb.toString();
    }
}
