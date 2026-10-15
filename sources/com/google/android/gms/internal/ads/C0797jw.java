package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.jw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0797jw extends Av {

    /* renamed from: a, reason: collision with root package name */
    public final C0753iv f9232a;

    public C0797jw(C0753iv c0753iv) {
        this.f9232a = c0753iv;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1054pv
    public final boolean a() {
        return this.f9232a != C0753iv.f9087E;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0797jw) && ((C0797jw) obj).f9232a == this.f9232a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C0797jw.class, this.f9232a});
    }

    public final String toString() {
        return U.a.k("XChaCha20Poly1305 Parameters (variant: ", this.f9232a.f9098p, ")");
    }
}
