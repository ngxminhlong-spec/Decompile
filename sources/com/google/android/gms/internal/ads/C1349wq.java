package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.wq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1349wq {

    /* renamed from: a, reason: collision with root package name */
    public final String f11213a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11214b;

    public C1349wq(String str, String str2) {
        this.f11213a = str;
        this.f11214b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1349wq)) {
            return false;
        }
        C1349wq c1349wq = (C1349wq) obj;
        return this.f11213a.equals(c1349wq.f11213a) && this.f11214b.equals(c1349wq.f11214b);
    }

    public final int hashCode() {
        return String.valueOf(this.f11213a).concat(String.valueOf(this.f11214b)).hashCode();
    }
}
