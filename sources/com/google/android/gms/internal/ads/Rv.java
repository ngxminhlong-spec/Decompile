package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Rv extends Av {

    /* renamed from: a, reason: collision with root package name */
    public final int f6866a;

    /* renamed from: b, reason: collision with root package name */
    public final C0753iv f6867b;

    public Rv(int i4, C0753iv c0753iv) {
        this.f6866a = i4;
        this.f6867b = c0753iv;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1054pv
    public final boolean a() {
        return this.f6867b != C0753iv.y;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Rv)) {
            return false;
        }
        Rv rv = (Rv) obj;
        return rv.f6866a == this.f6866a && rv.f6867b == this.f6867b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Rv.class, Integer.valueOf(this.f6866a), 12, 16, this.f6867b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f6867b);
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", 12-byte IV, 16-byte tag, and ");
        return U.a.l(sb, this.f6866a, "-byte key)");
    }
}
