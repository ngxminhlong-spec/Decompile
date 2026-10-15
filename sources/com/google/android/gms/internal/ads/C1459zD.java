package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.zD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1459zD extends AbstractC0659gl {

    /* renamed from: i, reason: collision with root package name */
    public int f11576i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11577j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f11578k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f11579l;

    /* renamed from: m, reason: collision with root package name */
    public int f11580m;

    /* renamed from: n, reason: collision with root package name */
    public int f11581n;

    /* renamed from: o, reason: collision with root package name */
    public int f11582o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11583p;

    /* renamed from: q, reason: collision with root package name */
    public long f11584q;

    @Override // com.google.android.gms.internal.ads.InterfaceC0403al
    public final void a(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f8862g.hasRemaining()) {
            int i4 = this.f11580m;
            if (i4 == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f11578k.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(limit2)) > 1024) {
                        int i5 = this.f11576i;
                        position = ((limit2 / i5) * i5) + i5;
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f11580m = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    j(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f11583p = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i4 != 1) {
                int limit3 = byteBuffer.limit();
                int n4 = n(byteBuffer);
                byteBuffer.limit(n4);
                this.f11584q += byteBuffer.remaining() / this.f11576i;
                p(byteBuffer, this.f11579l, this.f11582o);
                if (n4 < limit3) {
                    o(this.f11582o, this.f11579l);
                    this.f11580m = 0;
                    byteBuffer.limit(limit3);
                }
            } else {
                int limit4 = byteBuffer.limit();
                int n5 = n(byteBuffer);
                int position2 = n5 - byteBuffer.position();
                byte[] bArr = this.f11578k;
                int length = bArr.length;
                int i6 = this.f11581n;
                int i7 = length - i6;
                if (n5 >= limit4 || position2 >= i7) {
                    int min = Math.min(position2, i7);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f11578k, this.f11581n, min);
                    int i8 = this.f11581n + min;
                    this.f11581n = i8;
                    byte[] bArr2 = this.f11578k;
                    if (i8 == bArr2.length) {
                        if (this.f11583p) {
                            o(this.f11582o, bArr2);
                            long j4 = this.f11584q;
                            int i9 = this.f11581n;
                            int i10 = this.f11582o;
                            this.f11584q = j4 + ((i9 - (i10 + i10)) / this.f11576i);
                            i8 = i9;
                        } else {
                            this.f11584q += (i8 - this.f11582o) / this.f11576i;
                        }
                        p(byteBuffer, this.f11578k, i8);
                        this.f11581n = 0;
                        this.f11580m = 2;
                    }
                    byteBuffer.limit(limit4);
                } else {
                    o(i6, bArr);
                    this.f11581n = 0;
                    this.f11580m = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0659gl
    public final Fk g(Fk fk) {
        if (fk.c == 2) {
            return this.f11577j ? fk : Fk.f5070e;
        }
        throw new Sk(fk);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0659gl, com.google.android.gms.internal.ads.InterfaceC0403al
    public final boolean h() {
        return this.f11577j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0659gl
    public final void k() {
        if (this.f11577j) {
            Fk fk = this.f8859b;
            int i4 = fk.d;
            this.f11576i = i4;
            int i5 = fk.f5071a;
            int i6 = ((int) ((150000 * i5) / 1000000)) * i4;
            if (this.f11578k.length != i6) {
                this.f11578k = new byte[i6];
            }
            int i7 = ((int) ((20000 * i5) / 1000000)) * i4;
            this.f11582o = i7;
            if (this.f11579l.length != i7) {
                this.f11579l = new byte[i7];
            }
        }
        this.f11580m = 0;
        this.f11584q = 0L;
        this.f11581n = 0;
        this.f11583p = false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0659gl
    public final void l() {
        int i4 = this.f11581n;
        if (i4 > 0) {
            o(i4, this.f11578k);
        }
        if (this.f11583p) {
            return;
        }
        this.f11584q += this.f11582o / this.f11576i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0659gl
    public final void m() {
        this.f11577j = false;
        this.f11582o = 0;
        byte[] bArr = AbstractC0751is.f9074f;
        this.f11578k = bArr;
        this.f11579l = bArr;
    }

    public final int n(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > 1024) {
                int i4 = this.f11576i;
                return (position / i4) * i4;
            }
        }
        return byteBuffer.limit();
    }

    public final void o(int i4, byte[] bArr) {
        j(i4).put(bArr, 0, i4).flip();
        if (i4 > 0) {
            this.f11583p = true;
        }
    }

    public final void p(ByteBuffer byteBuffer, byte[] bArr, int i4) {
        int min = Math.min(byteBuffer.remaining(), this.f11582o);
        int i5 = this.f11582o - min;
        System.arraycopy(bArr, i4 - i5, this.f11579l, 0, i5);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f11579l, i5, min);
    }
}
