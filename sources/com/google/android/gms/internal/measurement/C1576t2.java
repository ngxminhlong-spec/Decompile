package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1576t2 extends AbstractC1580u2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12029b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1576t2(Unsafe unsafe, int i4) {
        super(unsafe);
        this.f12029b = i4;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1580u2
    public final double a(long j4, Object obj) {
        switch (this.f12029b) {
            case 0:
                return Double.longBitsToDouble(k(j4, obj));
            default:
                return Double.longBitsToDouble(k(j4, obj));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1580u2
    public final float b(long j4, Object obj) {
        switch (this.f12029b) {
            case 0:
                return Float.intBitsToFloat(j(j4, obj));
            default:
                return Float.intBitsToFloat(j(j4, obj));
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1580u2
    public final void c(Object obj, long j4, boolean z4) {
        switch (this.f12029b) {
            case 0:
                if (AbstractC1584v2.f12105g) {
                    AbstractC1584v2.c(obj, j4, z4 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    AbstractC1584v2.d(obj, j4, z4 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (AbstractC1584v2.f12105g) {
                    AbstractC1584v2.c(obj, j4, z4 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    AbstractC1584v2.d(obj, j4, z4 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1580u2
    public final void d(Object obj, long j4, byte b4) {
        switch (this.f12029b) {
            case 0:
                if (AbstractC1584v2.f12105g) {
                    AbstractC1584v2.c(obj, j4, b4);
                    return;
                } else {
                    AbstractC1584v2.d(obj, j4, b4);
                    return;
                }
            default:
                if (AbstractC1584v2.f12105g) {
                    AbstractC1584v2.c(obj, j4, b4);
                    return;
                } else {
                    AbstractC1584v2.d(obj, j4, b4);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1580u2
    public final void e(Object obj, long j4, double d) {
        switch (this.f12029b) {
            case 0:
                o(obj, j4, Double.doubleToLongBits(d));
                return;
            default:
                o(obj, j4, Double.doubleToLongBits(d));
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1580u2
    public final void f(Object obj, long j4, float f4) {
        switch (this.f12029b) {
            case 0:
                n(j4, obj, Float.floatToIntBits(f4));
                return;
            default:
                n(j4, obj, Float.floatToIntBits(f4));
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1580u2
    public final boolean g(long j4, Object obj) {
        switch (this.f12029b) {
            case 0:
                return AbstractC1584v2.f12105g ? AbstractC1584v2.i(j4, obj) : AbstractC1584v2.j(j4, obj);
            default:
                return AbstractC1584v2.f12105g ? AbstractC1584v2.i(j4, obj) : AbstractC1584v2.j(j4, obj);
        }
    }
}
