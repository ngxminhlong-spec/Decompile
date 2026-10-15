package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6545a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f6546b = new ArrayDeque();
    public final T0 c = new T0();
    public M3 d;

    /* renamed from: e, reason: collision with root package name */
    public int f6547e;

    /* renamed from: f, reason: collision with root package name */
    public int f6548f;

    /* renamed from: g, reason: collision with root package name */
    public long f6549g;

    public final long a(C c, int i4) {
        ((C1316w) c).C(this.f6545a, 0, i4, false);
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            j4 = (j4 << 8) | (r0[i5] & 255);
        }
        return j4;
    }
}
