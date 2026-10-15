package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ov extends Av {

    /* renamed from: a, reason: collision with root package name */
    public final int f6538a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6539b;
    public final Iv c;

    public Ov(int i4, int i5, Iv iv) {
        this.f6538a = i4;
        this.f6539b = i5;
        this.c = iv;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1054pv
    public final boolean a() {
        return this.c != Iv.f5767x;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Ov)) {
            return false;
        }
        Ov ov = (Ov) obj;
        return ov.f6538a == this.f6538a && ov.f6539b == this.f6539b && ov.c == this.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Ov.class, Integer.valueOf(this.f6538a), Integer.valueOf(this.f6539b), 16, this.c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(this.f6539b);
        sb.append("-byte IV, 16-byte tag, and ");
        return U.a.l(sb, this.f6538a, "-byte key)");
    }
}
