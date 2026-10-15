package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ow, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1012ow {

    /* renamed from: a, reason: collision with root package name */
    public int f9864a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9865b;

    public static int d(int i4) {
        return (i4 >>> 1) ^ (-(i4 & 1));
    }

    public static long e(long j4) {
        return (j4 >>> 1) ^ (-(1 & j4));
    }

    public abstract String A();

    public abstract void B(int i4);

    public abstract void a(int i4);

    public abstract boolean b();

    public abstract boolean c();

    public abstract int f();

    public abstract double g();

    public abstract int[] h(int[] iArr, int i4);

    public abstract float i();

    public ByteBuffer j(int i4, byte[] bArr) {
        int[] h4 = h(AbstractC0883lw.c(bArr), i4);
        int[] iArr = (int[]) h4.clone();
        AbstractC0883lw.b(iArr);
        for (int i5 = 0; i5 < 16; i5++) {
            h4[i5] = h4[i5] + iArr[i5];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(h4, 0, 16);
        return order;
    }

    public abstract int k();

    public abstract int l(int i4);

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract int q();

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract long w();

    public abstract long x();

    public abstract C0800jz y();

    public abstract String z();
}
