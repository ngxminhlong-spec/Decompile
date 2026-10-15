package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class X2 extends AbstractC1028pB {

    /* renamed from: A, reason: collision with root package name */
    public long f7591A;

    /* renamed from: B, reason: collision with root package name */
    public double f7592B;

    /* renamed from: C, reason: collision with root package name */
    public float f7593C;

    /* renamed from: D, reason: collision with root package name */
    public C1285vB f7594D;

    /* renamed from: E, reason: collision with root package name */
    public long f7595E;

    /* renamed from: w, reason: collision with root package name */
    public int f7596w;

    /* renamed from: x, reason: collision with root package name */
    public Date f7597x;
    public Date y;

    /* renamed from: z, reason: collision with root package name */
    public long f7598z;

    @Override // com.google.android.gms.internal.ads.AbstractC1028pB
    public final void c(ByteBuffer byteBuffer) {
        int i4 = byteBuffer.get();
        if (i4 < 0) {
            i4 += 256;
        }
        this.f7596w = i4;
        byteBuffer.get();
        byteBuffer.get();
        byteBuffer.get();
        if (!this.f9913p) {
            d();
        }
        if (this.f7596w == 1) {
            this.f7597x = AbstractC0587ez.d(AbstractC1230u.a0(byteBuffer));
            this.y = AbstractC0587ez.d(AbstractC1230u.a0(byteBuffer));
            this.f7598z = AbstractC1230u.W(byteBuffer);
            this.f7591A = AbstractC1230u.a0(byteBuffer);
        } else {
            this.f7597x = AbstractC0587ez.d(AbstractC1230u.W(byteBuffer));
            this.y = AbstractC0587ez.d(AbstractC1230u.W(byteBuffer));
            this.f7598z = AbstractC1230u.W(byteBuffer);
            this.f7591A = AbstractC1230u.W(byteBuffer);
        }
        this.f7592B = AbstractC1230u.r(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.f7593C = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        byteBuffer.get();
        byteBuffer.get();
        AbstractC1230u.W(byteBuffer);
        AbstractC1230u.W(byteBuffer);
        this.f7594D = new C1285vB(AbstractC1230u.r(byteBuffer), AbstractC1230u.r(byteBuffer), AbstractC1230u.r(byteBuffer), AbstractC1230u.r(byteBuffer), AbstractC1230u.a(byteBuffer), AbstractC1230u.a(byteBuffer), AbstractC1230u.a(byteBuffer), AbstractC1230u.r(byteBuffer), AbstractC1230u.r(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f7595E = AbstractC1230u.W(byteBuffer);
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f7597x + ";modificationTime=" + this.y + ";timescale=" + this.f7598z + ";duration=" + this.f7591A + ";rate=" + this.f7592B + ";volume=" + this.f7593C + ";matrix=" + this.f7594D + ";nextTrackId=" + this.f7595E + "]";
    }
}
