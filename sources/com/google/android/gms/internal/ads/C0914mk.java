package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.mk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0914mk {

    /* renamed from: e, reason: collision with root package name */
    public static final C0914mk f9648e = new C0914mk(0, 0, 0, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final int f9649a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9650b;
    public final int c;
    public final float d;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public C0914mk(int i4, int i5, int i6, float f4) {
        this.f9649a = i4;
        this.f9650b = i5;
        this.c = i6;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0914mk) {
            C0914mk c0914mk = (C0914mk) obj;
            if (this.f9649a == c0914mk.f9649a && this.f9650b == c0914mk.f9650b && this.c == c0914mk.c && this.d == c0914mk.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((this.f9649a + 217) * 31) + this.f9650b) * 31) + this.c) * 31);
    }
}
