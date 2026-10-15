package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.nD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0944nD extends AbstractC0659gl {

    /* renamed from: i, reason: collision with root package name */
    public int[] f9726i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f9727j;

    @Override // com.google.android.gms.internal.ads.InterfaceC0403al
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.f9727j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j4 = j(((limit - position) / this.f8859b.d) * this.c.d);
        while (position < limit) {
            for (int i4 : iArr) {
                j4.putShort(byteBuffer.getShort(i4 + i4 + position));
            }
            position += this.f8859b.d;
        }
        byteBuffer.position(limit);
        j4.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0659gl
    public final Fk g(Fk fk) {
        int[] iArr = this.f9726i;
        if (iArr == null) {
            return Fk.f5070e;
        }
        int i4 = fk.c;
        int i5 = fk.f5072b;
        if (i4 != 2) {
            throw new Sk(fk);
        }
        boolean z4 = i5 != iArr.length;
        int i6 = 0;
        while (true) {
            int length = iArr.length;
            if (i6 >= length) {
                return z4 ? new Fk(fk.f5071a, length, 2) : Fk.f5070e;
            }
            int i7 = iArr[i6];
            if (i7 >= i5) {
                throw new Sk(fk);
            }
            z4 |= i7 != i6;
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0659gl
    public final void k() {
        this.f9727j = this.f9726i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0659gl
    public final void m() {
        this.f9727j = null;
        this.f9726i = null;
    }
}
