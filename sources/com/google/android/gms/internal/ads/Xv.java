package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Xv extends Av {

    /* renamed from: a, reason: collision with root package name */
    public final C0753iv f7716a;

    public Xv(C0753iv c0753iv) {
        this.f7716a = c0753iv;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1054pv
    public final boolean a() {
        return this.f7716a != C0753iv.f9084B;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Xv) && ((Xv) obj).f7716a == this.f7716a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Xv.class, this.f7716a});
    }

    public final String toString() {
        return U.a.k("ChaCha20Poly1305 Parameters (variant: ", this.f7716a.f9098p, ")");
    }
}
