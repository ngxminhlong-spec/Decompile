package com.google.android.gms.internal.ads;

import java.util.Locale;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ne, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0951ne {
    public static final C0951ne d = new C0951ne(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f9742a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9743b;
    public final int c;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C0951ne(float f4, float f5) {
        Zf.O(f4 > 0.0f);
        Zf.O(f5 > 0.0f);
        this.f9742a = f4;
        this.f9743b = f5;
        this.c = Math.round(f4 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0951ne.class == obj.getClass()) {
            C0951ne c0951ne = (C0951ne) obj;
            if (this.f9742a == c0951ne.f9742a && this.f9743b == c0951ne.f9743b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f9743b) + ((Float.floatToRawIntBits(this.f9742a) + 527) * 31);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f9742a), Float.valueOf(this.f9743b));
    }
}
