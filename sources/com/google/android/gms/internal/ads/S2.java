package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class S2 implements T2 {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f6945b = Logger.getLogger(S2.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final R2 f6946a = new R2(0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.android.gms.internal.ads.pB, com.google.android.gms.internal.ads.X2] */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.google.android.gms.internal.ads.rB] */
    /* JADX WARN: Type inference failed for: r13v12, types: [com.google.android.gms.internal.ads.rB] */
    public final V2 a(C0737id c0737id, AbstractC1113rB abstractC1113rB) {
        int a4;
        long limit;
        Y2 y22;
        Y2 y23;
        long b4 = c0737id.b();
        ByteBuffer byteBuffer = c0737id.f9044o;
        R2 r22 = this.f6946a;
        ((ByteBuffer) r22.get()).rewind().limit(8);
        do {
            a4 = c0737id.a((ByteBuffer) r22.get());
            if (a4 == 8) {
                ((ByteBuffer) r22.get()).rewind();
                long W4 = AbstractC1230u.W((ByteBuffer) r22.get());
                if (W4 < 8 && W4 > 1) {
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(W4);
                    sb.append("). Stop parsing!");
                    f6945b.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr = new byte[4];
                ((ByteBuffer) r22.get()).get(bArr);
                try {
                    String str = new String(bArr, "ISO-8859-1");
                    if (W4 == 1) {
                        ((ByteBuffer) r22.get()).limit(16);
                        c0737id.a((ByteBuffer) r22.get());
                        ((ByteBuffer) r22.get()).position(8);
                        limit = AbstractC1230u.a0((ByteBuffer) r22.get()) - 16;
                    } else {
                        limit = W4 == 0 ? byteBuffer.limit() - c0737id.b() : W4 - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) r22.get()).limit(((ByteBuffer) r22.get()).limit() + 16);
                        c0737id.a((ByteBuffer) r22.get());
                        byte[] bArr2 = new byte[16];
                        for (int position = ((ByteBuffer) r22.get()).position() - 16; position < ((ByteBuffer) r22.get()).position(); position++) {
                            bArr2[position - (((ByteBuffer) r22.get()).position() - 16)] = ((ByteBuffer) r22.get()).get(position);
                        }
                        limit -= 16;
                    }
                    long j4 = limit;
                    if (abstractC1113rB instanceof V2) {
                    }
                    if ("moov".equals(str)) {
                        y23 = new AbstractC1113rB();
                    } else {
                        if ("mvhd".equals(str)) {
                            ?? abstractC1028pB = new AbstractC1028pB("mvhd");
                            abstractC1028pB.f7592B = 1.0d;
                            abstractC1028pB.f7593C = 1.0f;
                            abstractC1028pB.f7594D = C1285vB.f10998j;
                            y22 = abstractC1028pB;
                            ((ByteBuffer) r22.get()).rewind();
                            y22.a(c0737id, (ByteBuffer) r22.get(), j4, this);
                            return y22;
                        }
                        y23 = new Y2(str, 0);
                    }
                    y22 = y23;
                    ((ByteBuffer) r22.get()).rewind();
                    y22.a(c0737id, (ByteBuffer) r22.get(), j4, this);
                    return y22;
                } catch (UnsupportedEncodingException e4) {
                    throw new RuntimeException(e4);
                }
            }
        } while (a4 >= 0);
        byteBuffer.position((int) b4);
        throw new EOFException();
    }
}
