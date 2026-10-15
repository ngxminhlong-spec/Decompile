package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.kz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0843kz extends OutputStream {

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f9338t = new byte[0];

    /* renamed from: q, reason: collision with root package name */
    public int f9341q;

    /* renamed from: s, reason: collision with root package name */
    public int f9343s;

    /* renamed from: o, reason: collision with root package name */
    public final int f9339o = 128;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f9340p = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public byte[] f9342r = new byte[128];

    public final synchronized AbstractC0886lz a() {
        try {
            int i4 = this.f9343s;
            byte[] bArr = this.f9342r;
            if (i4 >= bArr.length) {
                this.f9340p.add(new C0800jz(this.f9342r));
                this.f9342r = f9338t;
            } else if (i4 > 0) {
                this.f9340p.add(new C0800jz(Arrays.copyOf(bArr, i4)));
            }
            this.f9341q += this.f9343s;
            this.f9343s = 0;
        } catch (Throwable th) {
            throw th;
        }
        return AbstractC0886lz.z(this.f9340p);
    }

    public final void b(int i4) {
        this.f9340p.add(new C0800jz(this.f9342r));
        int length = this.f9341q + this.f9342r.length;
        this.f9341q = length;
        this.f9342r = new byte[Math.max(this.f9339o, Math.max(i4, length >>> 1))];
        this.f9343s = 0;
    }

    public final String toString() {
        int i4;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i4 = this.f9341q + this.f9343s;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i4));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i4) {
        try {
            if (this.f9343s == this.f9342r.length) {
                b(1);
            }
            byte[] bArr = this.f9342r;
            int i5 = this.f9343s;
            this.f9343s = i5 + 1;
            bArr[i5] = (byte) i4;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i4, int i5) {
        byte[] bArr2 = this.f9342r;
        int length = bArr2.length;
        int i6 = this.f9343s;
        int i7 = length - i6;
        if (i5 <= i7) {
            System.arraycopy(bArr, i4, bArr2, i6, i5);
            this.f9343s += i5;
            return;
        }
        System.arraycopy(bArr, i4, bArr2, i6, i7);
        int i8 = i5 - i7;
        b(i8);
        System.arraycopy(bArr, i4 + i7, this.f9342r, 0, i8);
        this.f9343s = i8;
    }
}
