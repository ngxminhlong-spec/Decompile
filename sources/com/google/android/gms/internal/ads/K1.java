package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class K1 {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f5960e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f5961a;

    /* renamed from: b, reason: collision with root package name */
    public int f5962b;
    public int c;
    public byte[] d;

    public final void a(byte[] bArr, int i4, int i5) {
        if (this.f5961a) {
            int i6 = i5 - i4;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i7 = this.f5962b + i6;
            if (length < i7) {
                this.d = Arrays.copyOf(bArr2, i7 + i7);
            }
            System.arraycopy(bArr, i4, this.d, this.f5962b, i6);
            this.f5962b += i6;
        }
    }
}
