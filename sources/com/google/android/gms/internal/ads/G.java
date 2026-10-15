package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.measurement.C1510e1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class G implements P {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5106a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5107b;
    public final Object c;

    public G(long j4, long j5) {
        this.f5106a = 1;
        this.f5107b = j4;
        Q q4 = j5 == 0 ? Q.c : new Q(0L, j5);
        this.c = new O(q4, q4);
    }

    public /* synthetic */ G(Object obj, long j4, int i4) {
        this.f5106a = i4;
        this.c = obj;
        this.f5107b = j4;
    }

    @Override // com.google.android.gms.internal.ads.P
    public final long b() {
        switch (this.f5106a) {
            case 0:
                return ((H) this.c).a();
            case 1:
                return this.f5107b;
            default:
                return this.f5107b;
        }
    }

    @Override // com.google.android.gms.internal.ads.P
    public final O c(long j4) {
        switch (this.f5106a) {
            case 0:
                H h4 = (H) this.c;
                Zf.C(h4.f5362k);
                C1510e1 c1510e1 = h4.f5362k;
                long[] jArr = (long[]) c1510e1.f11914p;
                long[] jArr2 = (long[]) c1510e1.f11915q;
                int k3 = AbstractC0751is.k(jArr, Math.max(0L, Math.min((h4.f5356e * j4) / 1000000, h4.f5361j - 1)), false);
                long j5 = k3 == -1 ? 0L : jArr[k3];
                long j6 = k3 != -1 ? jArr2[k3] : 0L;
                int i4 = h4.f5356e;
                long j7 = (j5 * 1000000) / i4;
                long j8 = this.f5107b;
                Q q4 = new Q(j7, j8 + j6);
                if (j7 == j4 || k3 == jArr.length - 1) {
                    return new O(q4, q4);
                }
                int i5 = k3 + 1;
                return new O(q4, new Q((jArr[i5] * 1000000) / i4, j8 + jArr2[i5]));
            case 1:
                return (O) this.c;
            default:
                C0419b0 c0419b0 = (C0419b0) this.c;
                O a4 = c0419b0.f8185g[0].a(j4);
                int i6 = 1;
                while (true) {
                    C0546e0[] c0546e0Arr = c0419b0.f8185g;
                    if (i6 >= c0546e0Arr.length) {
                        return a4;
                    }
                    O a5 = c0546e0Arr[i6].a(j4);
                    if (a5.f6421a.f6627b < a4.f6421a.f6627b) {
                        a4 = a5;
                    }
                    i6++;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.P
    public final boolean f() {
        switch (this.f5106a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }
}
