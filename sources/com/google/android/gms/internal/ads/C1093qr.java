package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.qr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1093qr {

    /* renamed from: a, reason: collision with root package name */
    public final String f10417a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10418b;
    public final boolean c;

    public C1093qr(String str, boolean z4, boolean z5) {
        this.f10417a = str;
        this.f10418b = z4;
        this.c = z5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1093qr)) {
            return false;
        }
        C1093qr c1093qr = (C1093qr) obj;
        return this.f10417a.equals(c1093qr.f10417a) && this.f10418b == c1093qr.f10418b && this.c == c1093qr.c;
    }

    public final int hashCode() {
        return ((((this.f10417a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f10418b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.f10417a + ", shouldGetAdvertisingId=" + this.f10418b + ", isGooglePlayServicesAvailable=" + this.c + "}";
    }
}
