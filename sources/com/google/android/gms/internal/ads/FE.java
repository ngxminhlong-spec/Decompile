package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class FE {

    /* renamed from: a, reason: collision with root package name */
    public final int f5011a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5012b;

    public FE(int i4, boolean z4) {
        this.f5011a = i4;
        this.f5012b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FE.class != obj.getClass()) {
            return false;
        }
        FE fe = (FE) obj;
        return this.f5011a == fe.f5011a && this.f5012b == fe.f5012b;
    }

    public final int hashCode() {
        return (this.f5011a * 31) + (this.f5012b ? 1 : 0);
    }
}
