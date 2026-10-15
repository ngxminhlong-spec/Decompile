package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class BD extends AbstractC0659gl {

    /* renamed from: i, reason: collision with root package name */
    public int f4043i;

    /* renamed from: j, reason: collision with root package name */
    public int f4044j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4045k;

    /* renamed from: l, reason: collision with root package name */
    public int f4046l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f4047m;

    /* renamed from: n, reason: collision with root package name */
    public int f4048n;

    /* renamed from: o, reason: collision with root package name */
    public long f4049o;

    @Override // com.google.android.gms.internal.ads.InterfaceC0403al
    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i4 = limit - position;
        if (i4 == 0) {
            return;
        }
        int min = Math.min(i4, this.f4046l);
        this.f4049o += min / this.f8859b.d;
        this.f4046l -= min;
        byteBuffer.position(position + min);
        if (this.f4046l <= 0) {
            int i5 = i4 - min;
            int length = (this.f4048n + i5) - this.f4047m.length;
            ByteBuffer j4 = j(length);
            int max = Math.max(0, Math.min(length, this.f4048n));
            j4.put(this.f4047m, 0, max);
            int max2 = Math.max(0, Math.min(length - max, i5));
            byteBuffer.limit(byteBuffer.position() + max2);
            j4.put(byteBuffer);
            byteBuffer.limit(limit);
            int i6 = i5 - max2;
            int i7 = this.f4048n - max;
            this.f4048n = i7;
            byte[] bArr = this.f4047m;
            System.arraycopy(bArr, max, bArr, 0, i7);
            byteBuffer.get(this.f4047m, this.f4048n, i6);
            this.f4048n += i6;
            j4.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0659gl, com.google.android.gms.internal.ads.InterfaceC0403al
    public final ByteBuffer c() {
        int i4;
        if (super.f() && (i4 = this.f4048n) > 0) {
            j(i4).put(this.f4047m, 0, this.f4048n).flip();
            this.f4048n = 0;
        }
        return super.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0659gl, com.google.android.gms.internal.ads.InterfaceC0403al
    public final boolean f() {
        return super.f() && this.f4048n == 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0659gl
    public final Fk g(Fk fk) {
        if (fk.c != 2) {
            throw new Sk(fk);
        }
        this.f4045k = true;
        return (this.f4043i == 0 && this.f4044j == 0) ? Fk.f5070e : fk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0659gl
    public final void k() {
        if (this.f4045k) {
            this.f4045k = false;
            int i4 = this.f4044j;
            int i5 = this.f8859b.d;
            this.f4047m = new byte[i4 * i5];
            this.f4046l = this.f4043i * i5;
        }
        this.f4048n = 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0659gl
    public final void l() {
        if (this.f4045k) {
            if (this.f4048n > 0) {
                this.f4049o += r0 / this.f8859b.d;
            }
            this.f4048n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0659gl
    public final void m() {
        this.f4047m = AbstractC0751is.f9074f;
    }
}
