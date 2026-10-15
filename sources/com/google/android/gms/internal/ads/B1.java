package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class B1 extends C1 {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f4019o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f4020p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f4021n;

    public static boolean e(C1134rq c1134rq, byte[] bArr) {
        if (c1134rq.g() < 8) {
            return false;
        }
        int i4 = c1134rq.f10537b;
        byte[] bArr2 = new byte[8];
        c1134rq.a(bArr2, 0, 8);
        c1134rq.e(i4);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final long a(C1134rq c1134rq) {
        byte[] bArr = c1134rq.f10536a;
        return (this.f4221i * AbstractC1230u.Z(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final void b(boolean z4) {
        super.b(z4);
        if (z4) {
            this.f4021n = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final boolean c(C1134rq c1134rq, long j4, C0783ji c0783ji) {
        if (e(c1134rq, f4019o)) {
            byte[] copyOf = Arrays.copyOf(c1134rq.f10536a, c1134rq.c);
            int i4 = copyOf[9] & 255;
            ArrayList Y4 = AbstractC1230u.Y(copyOf);
            if (((C0976o2) c0783ji.f9211p) == null) {
                L1 l12 = new L1();
                l12.f6101j = "audio/opus";
                l12.f6114w = i4;
                l12.f6115x = 48000;
                l12.f6103l = Y4;
                c0783ji.f9211p = new C0976o2(l12);
                return true;
            }
        } else {
            if (!e(c1134rq, f4020p)) {
                Zf.C((C0976o2) c0783ji.f9211p);
                return false;
            }
            Zf.C((C0976o2) c0783ji.f9211p);
            if (!this.f4021n) {
                this.f4021n = true;
                c1134rq.f(8);
                C1120rc w2 = AbstractC1230u.w(AbstractC1137rt.s((String[]) AbstractC1230u.H(c1134rq, false, false).f6208p));
                if (w2 != null) {
                    C0976o2 c0976o2 = (C0976o2) c0783ji.f9211p;
                    c0976o2.getClass();
                    L1 l13 = new L1(c0976o2);
                    l13.f6099h = w2.b(((C0976o2) c0783ji.f9211p).f9811i);
                    c0783ji.f9211p = new C0976o2(l13);
                }
            }
        }
        return true;
    }
}
