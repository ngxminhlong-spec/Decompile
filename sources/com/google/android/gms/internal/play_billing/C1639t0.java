package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1639t0 extends AbstractC1643v0 {
    @Override // com.google.android.gms.internal.play_billing.AbstractC1643v0
    public final double a(long j4, Object obj) {
        return Double.longBitsToDouble(this.f12253a.getLong(obj, j4));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1643v0
    public final float b(long j4, Object obj) {
        return Float.intBitsToFloat(this.f12253a.getInt(obj, j4));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1643v0
    public final void c(Object obj, long j4, boolean z4) {
        if (AbstractC1645w0.f12259g) {
            AbstractC1645w0.c(obj, j4, z4 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC1645w0.d(obj, j4, z4 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1643v0
    public final void d(Object obj, long j4, byte b4) {
        if (AbstractC1645w0.f12259g) {
            AbstractC1645w0.c(obj, j4, b4);
        } else {
            AbstractC1645w0.d(obj, j4, b4);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1643v0
    public final void e(Object obj, long j4, double d) {
        this.f12253a.putLong(obj, j4, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1643v0
    public final void f(Object obj, long j4, float f4) {
        this.f12253a.putInt(obj, j4, Float.floatToIntBits(f4));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1643v0
    public final boolean g(long j4, Object obj) {
        return AbstractC1645w0.f12259g ? AbstractC1645w0.m(j4, obj) : AbstractC1645w0.n(j4, obj);
    }
}
