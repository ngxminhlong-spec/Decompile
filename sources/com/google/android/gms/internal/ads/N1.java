package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class N1 {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f6298f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f6299a;

    /* renamed from: b, reason: collision with root package name */
    public int f6300b;
    public int c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f6301e;

    public final void a(byte[] bArr, int i4, int i5) {
        if (this.f6299a) {
            int i6 = i5 - i4;
            byte[] bArr2 = this.f6301e;
            int length = bArr2.length;
            int i7 = this.c + i6;
            if (length < i7) {
                this.f6301e = Arrays.copyOf(bArr2, i7 + i7);
            }
            System.arraycopy(bArr, i4, this.f6301e, this.c, i6);
            this.c += i6;
        }
    }
}
