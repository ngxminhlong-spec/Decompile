package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.yA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1413yA extends AA {
    @Override // com.google.android.gms.internal.ads.AA
    public final byte R0(long j4) {
        return Memory.peekByte((int) j4);
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final double U0(long j4, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.f3928o).getLong(obj, j4));
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final float W0(long j4, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.f3928o).getInt(obj, j4));
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final void Z0(long j4, byte[] bArr, long j5, long j6) {
        Memory.peekByteArray((int) j4, bArr, (int) j5, (int) j6);
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final void b1(Object obj, long j4, boolean z4) {
        if (BA.f4036h) {
            BA.d(obj, j4, z4 ? (byte) 1 : (byte) 0);
        } else {
            BA.e(obj, j4, z4 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final void c1(Object obj, long j4, byte b4) {
        if (BA.f4036h) {
            BA.d(obj, j4, b4);
        } else {
            BA.e(obj, j4, b4);
        }
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final void d1(Object obj, long j4, double d) {
        ((Unsafe) this.f3928o).putLong(obj, j4, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final void e1(Object obj, long j4, float f4) {
        ((Unsafe) this.f3928o).putInt(obj, j4, Float.floatToIntBits(f4));
    }

    @Override // com.google.android.gms.internal.ads.AA
    public final boolean f1(long j4, Object obj) {
        return BA.f4036h ? BA.p(j4, obj) : BA.q(j4, obj);
    }
}
