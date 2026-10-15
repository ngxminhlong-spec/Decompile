package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.measurement.C1510e1;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1318w1 extends C1 {

    /* renamed from: n, reason: collision with root package name */
    public H f11106n;

    /* renamed from: o, reason: collision with root package name */
    public C0590f1 f11107o;

    @Override // com.google.android.gms.internal.ads.C1
    public final long a(C1134rq c1134rq) {
        byte[] bArr = c1134rq.f10536a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i4 = (bArr[2] & 255) >> 4;
        if (i4 != 6) {
            if (i4 == 7) {
                i4 = 7;
            }
            int c = AbstractC1230u.c(i4, c1134rq);
            c1134rq.e(0);
            return c;
        }
        c1134rq.f(4);
        c1134rq.w();
        int c2 = AbstractC1230u.c(i4, c1134rq);
        c1134rq.e(0);
        return c2;
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final void b(boolean z4) {
        super.b(z4);
        if (z4) {
            this.f11106n = null;
            this.f11107o = null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.google.android.gms.internal.ads.f1] */
    @Override // com.google.android.gms.internal.ads.C1
    public final boolean c(C1134rq c1134rq, long j4, C0783ji c0783ji) {
        byte[] bArr = c1134rq.f10536a;
        H h4 = this.f11106n;
        if (h4 == null) {
            H h5 = new H(17, bArr);
            this.f11106n = h5;
            c0783ji.f9211p = h5.b(Arrays.copyOfRange(bArr, 9, c1134rq.c), null);
            return true;
        }
        byte b4 = bArr[0];
        if ((b4 & Byte.MAX_VALUE) != 3) {
            if (b4 != -1) {
                return true;
            }
            C0590f1 c0590f1 = this.f11107o;
            if (c0590f1 != null) {
                c0590f1.f8669o = j4;
                c0783ji.f9212q = c0590f1;
            }
            ((C0976o2) c0783ji.f9211p).getClass();
            return false;
        }
        C1510e1 x4 = AbstractC1230u.x(c1134rq);
        H h6 = new H(h4.f5354a, h4.f5355b, h4.c, h4.d, h4.f5356e, h4.f5358g, h4.f5359h, h4.f5361j, x4, h4.f5363l);
        this.f11106n = h6;
        ?? obj = new Object();
        obj.f8671q = h6;
        obj.f8672r = x4;
        obj.f8669o = -1L;
        obj.f8670p = -1L;
        this.f11107o = obj;
        return true;
    }
}
