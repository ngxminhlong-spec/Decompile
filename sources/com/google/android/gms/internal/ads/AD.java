package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class AD extends AbstractC0659gl {

    /* renamed from: i, reason: collision with root package name */
    public static final int f3938i = Float.floatToIntBits(Float.NaN);

    public static void n(int i4, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i4 * 4.656612875245797E-10d));
        if (floatToIntBits == f3938i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0403al
    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer j4;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i4 = limit - position;
        int i5 = this.f8859b.c;
        if (i5 == 536870912) {
            j4 = j((i4 / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), j4);
                position += 3;
            }
        } else if (i5 == 805306368) {
            j4 = j(i4);
            while (position < limit) {
                int i6 = byteBuffer.get(position) & 255;
                int i7 = (byteBuffer.get(position + 1) & 255) << 8;
                n(i6 | i7 | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), j4);
                position += 4;
            }
        } else if (i5 == 1342177280) {
            j4 = j((i4 / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), j4);
                position += 3;
            }
        } else {
            if (i5 != 1610612736) {
                throw new IllegalStateException();
            }
            j4 = j(i4);
            while (position < limit) {
                int i8 = byteBuffer.get(position + 3) & 255;
                int i9 = (byteBuffer.get(position + 2) & 255) << 8;
                n(i8 | i9 | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), j4);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        j4.flip();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0659gl
    public final Fk g(Fk fk) {
        int i4 = fk.c;
        int i5 = AbstractC0751is.f9071a;
        if (i4 == 536870912 || i4 == 1342177280 || i4 == 805306368 || i4 == 1610612736) {
            return new Fk(fk.f5071a, fk.f5072b, 4);
        }
        if (i4 == 4) {
            return Fk.f5070e;
        }
        throw new Sk(fk);
    }
}
