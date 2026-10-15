package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class SE {

    /* renamed from: a, reason: collision with root package name */
    public final long f6963a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6964b;

    public SE(long j4, long j5) {
        this.f6963a = j4;
        this.f6964b = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SE)) {
            return false;
        }
        SE se = (SE) obj;
        return this.f6963a == se.f6963a && this.f6964b == se.f6964b;
    }

    public final int hashCode() {
        return (((int) this.f6963a) * 31) + ((int) this.f6964b);
    }
}
