package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.es, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0580es {

    /* renamed from: a, reason: collision with root package name */
    public final int f8651a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8652b;

    public C0580es(String str, int i4) {
        this.f8651a = i4;
        this.f8652b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0580es) {
            C0580es c0580es = (C0580es) obj;
            String str2 = c0580es.f8652b;
            if (this.f8651a == c0580es.f8651a && ((str = this.f8652b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8652b;
        return (str == null ? 0 : str.hashCode()) ^ ((this.f8651a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayState{statusCode=");
        sb.append(this.f8651a);
        sb.append(", sessionToken=");
        return n0.a.j(sb, this.f8652b, "}");
    }
}
