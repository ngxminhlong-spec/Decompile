package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class L4 {

    /* renamed from: a, reason: collision with root package name */
    public final long f6121a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6122b;
    public final int c;

    public L4(int i4, long j4, String str) {
        this.f6121a = j4;
        this.f6122b = str;
        this.c = i4;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof L4)) {
            L4 l4 = (L4) obj;
            if (l4.f6121a == this.f6121a && l4.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f6121a;
    }
}
