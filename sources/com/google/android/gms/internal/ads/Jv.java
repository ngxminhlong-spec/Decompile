package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Jv extends Av {

    /* renamed from: a, reason: collision with root package name */
    public final int f5936a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5937b;
    public final int c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final C0753iv f5938e;

    /* renamed from: f, reason: collision with root package name */
    public final Iv f5939f;

    public Jv(int i4, int i5, int i6, int i7, C0753iv c0753iv, Iv iv) {
        this.f5936a = i4;
        this.f5937b = i5;
        this.c = i6;
        this.d = i7;
        this.f5938e = c0753iv;
        this.f5939f = iv;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1054pv
    public final boolean a() {
        return this.f5938e != C0753iv.f9093v;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Jv)) {
            return false;
        }
        Jv jv = (Jv) obj;
        return jv.f5936a == this.f5936a && jv.f5937b == this.f5937b && jv.c == this.c && jv.d == this.d && jv.f5938e == this.f5938e && jv.f5939f == this.f5939f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Jv.class, Integer.valueOf(this.f5936a), Integer.valueOf(this.f5937b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.f5938e, this.f5939f});
    }

    public final String toString() {
        StringBuilder n4 = U.a.n("AesCtrHmacAead Parameters (variant: ", String.valueOf(this.f5938e), ", hashType: ", String.valueOf(this.f5939f), ", ");
        n4.append(this.c);
        n4.append("-byte IV, and ");
        n4.append(this.d);
        n4.append("-byte tags, and ");
        n4.append(this.f5936a);
        n4.append("-byte AES key, and ");
        return U.a.l(n4, this.f5937b, "-byte HMAC key)");
    }
}
