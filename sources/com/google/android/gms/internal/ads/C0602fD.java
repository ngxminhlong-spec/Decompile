package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.fD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0602fD {
    public static final C0602fD d = new Object().a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8691a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8692b;
    public final boolean c;

    public /* synthetic */ C0602fD(H1.p pVar) {
        this.f8691a = pVar.f880a;
        this.f8692b = pVar.f881b;
        this.c = pVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0602fD.class != obj.getClass()) {
            return false;
        }
        C0602fD c0602fD = (C0602fD) obj;
        return this.f8691a == c0602fD.f8691a && this.f8692b == c0602fD.f8692b && this.c == c0602fD.c;
    }

    public final int hashCode() {
        int i4 = (this.f8691a ? 1 : 0) << 2;
        boolean z4 = this.f8692b;
        return (z4 ? 1 : 0) + (z4 ? 1 : 0) + i4 + (this.c ? 1 : 0);
    }
}
