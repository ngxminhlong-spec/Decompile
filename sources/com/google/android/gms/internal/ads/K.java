package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final List f5951a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5952b;
    public final int c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5953e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5954f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5955g;

    /* renamed from: h, reason: collision with root package name */
    public final float f5956h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5957i;

    public K(List list, int i4, int i5, int i6, int i7, int i8, int i9, float f4, String str) {
        this.f5951a = list;
        this.f5952b = i4;
        this.c = i5;
        this.d = i6;
        this.f5953e = i7;
        this.f5954f = i8;
        this.f5955g = i9;
        this.f5956h = f4;
        this.f5957i = str;
    }

    public static K a(C1134rq c1134rq) {
        boolean z4;
        int i4;
        try {
            c1134rq.f(21);
            int m4 = c1134rq.m() & 3;
            int m5 = c1134rq.m();
            int i5 = c1134rq.f10537b;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                z4 = true;
                if (i7 >= m5) {
                    break;
                }
                c1134rq.f(1);
                int q4 = c1134rq.q();
                for (int i9 = 0; i9 < q4; i9++) {
                    int q5 = c1134rq.q();
                    i8 += q5 + 4;
                    c1134rq.f(q5);
                }
                i7++;
            }
            c1134rq.e(i5);
            byte[] bArr = new byte[i8];
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            String str = null;
            float f4 = 1.0f;
            int i15 = 0;
            int i16 = 0;
            while (i15 < m5) {
                int m6 = c1134rq.m() & 63;
                int q6 = c1134rq.q();
                int i17 = i6;
                while (i17 < q6) {
                    int q7 = c1134rq.q();
                    boolean z5 = z4;
                    int i18 = m4;
                    System.arraycopy(Wj.f7530G, i6, bArr, i16, 4);
                    int i19 = i16 + 4;
                    System.arraycopy(c1134rq.f10536a, c1134rq.f10537b, bArr, i19, q7);
                    int i20 = i19 + q7;
                    if (m6 == 33 && i17 == 0) {
                        C0925mv g4 = Wj.g(bArr, i16 + 6, i20);
                        i10 = g4.f9665e + 8;
                        i11 = g4.f9666f + 8;
                        i12 = g4.f9672l;
                        int i21 = g4.f9673m;
                        int i22 = g4.f9674n;
                        float f5 = g4.f9671k;
                        i4 = i20;
                        str = Wj.d(g4.f9663a, g4.f9664b, g4.c, g4.d, g4.f9667g, g4.f9668h);
                        i13 = i21;
                        i14 = i22;
                        f4 = f5;
                        i17 = 0;
                    } else {
                        i4 = i20;
                    }
                    c1134rq.f(q7);
                    i17++;
                    z4 = z5;
                    m4 = i18;
                    i16 = i4;
                    i6 = 0;
                }
                i15++;
                i6 = 0;
            }
            return new K(i8 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), m4 + 1, i10, i11, i12, i13, i14, f4, str);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw C0907md.a("Error parsing HEVC config", e4);
        }
    }
}
