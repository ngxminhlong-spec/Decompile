package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Uv extends Av {

    /* renamed from: a, reason: collision with root package name */
    public final int f7207a;

    /* renamed from: b, reason: collision with root package name */
    public final Iv f7208b;

    public Uv(int i4, Iv iv) {
        this.f7207a = i4;
        this.f7208b = iv;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1054pv
    public final boolean a() {
        return this.f7208b != Iv.f5749A;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Uv)) {
            return false;
        }
        Uv uv = (Uv) obj;
        return uv.f7207a == this.f7207a && uv.f7208b == this.f7208b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Uv.class, Integer.valueOf(this.f7207a), this.f7208b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7208b);
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        return U.a.l(sb, this.f7207a, "-byte key)");
    }
}
