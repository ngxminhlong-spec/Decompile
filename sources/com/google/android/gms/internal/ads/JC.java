package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class JC extends AbstractC0484ch {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f5789k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f5790b;
    public final NE c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5791e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f5792f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f5793g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC0484ch[] f5794h;

    /* renamed from: i, reason: collision with root package name */
    public final Object[] f5795i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f5796j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public JC(java.util.List r7, com.google.android.gms.internal.ads.NE r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            com.google.android.gms.internal.ads.ch[] r0 = new com.google.android.gms.internal.ads.AbstractC0484ch[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            com.google.android.gms.internal.ads.yC r4 = (com.google.android.gms.internal.ads.InterfaceC1415yC) r4
            int r5 = r3 + 1
            com.google.android.gms.internal.ads.ch r4 = r4.b()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            com.google.android.gms.internal.ads.yC r3 = (com.google.android.gms.internal.ads.InterfaceC1415yC) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.c()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.JC.<init>(java.util.List, com.google.android.gms.internal.ads.NE):void");
    }

    public JC(AbstractC0484ch[] abstractC0484chArr, Object[] objArr, NE ne) {
        this.c = ne;
        this.f5790b = ne.f6315b.length;
        this.f5794h = abstractC0484chArr;
        int length = abstractC0484chArr.length;
        this.f5792f = new int[length];
        this.f5793g = new int[length];
        this.f5795i = objArr;
        this.f5796j = new HashMap();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < abstractC0484chArr.length) {
            AbstractC0484ch abstractC0484ch = abstractC0484chArr[i4];
            this.f5794h[i7] = abstractC0484ch;
            this.f5793g[i7] = i5;
            this.f5792f[i7] = i6;
            i5 += abstractC0484ch.c();
            i6 += this.f5794h[i7].b();
            this.f5796j.put(objArr[i7], Integer.valueOf(i7));
            i4++;
            i7++;
        }
        this.d = i5;
        this.f5791e = i6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final int a(Object obj) {
        int a4;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f5796j.get(obj2);
            int intValue = num == null ? -1 : num.intValue();
            if (intValue != -1 && (a4 = this.f5794h[intValue].a(obj3)) != -1) {
                return this.f5792f[intValue] + a4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final int b() {
        return this.f5791e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final int c() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final C1210tg d(int i4, C1210tg c1210tg, boolean z4) {
        int[] iArr = this.f5792f;
        int j4 = AbstractC0751is.j(iArr, i4 + 1, false, false);
        int i5 = this.f5793g[j4];
        this.f5794h[j4].d(i4 - iArr[j4], c1210tg, z4);
        c1210tg.c += i5;
        if (z4) {
            Object obj = this.f5795i[j4];
            Object obj2 = c1210tg.f10712b;
            obj2.getClass();
            c1210tg.f10712b = Pair.create(obj, obj2);
        }
        return c1210tg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final Rg e(int i4, Rg rg, long j4) {
        int[] iArr = this.f5793g;
        int j5 = AbstractC0751is.j(iArr, i4 + 1, false, false);
        int i5 = iArr[j5];
        int i6 = this.f5792f[j5];
        this.f5794h[j5].e(i4 - i5, rg, j4);
        Object obj = this.f5795i[j5];
        if (!Rg.f6814n.equals(rg.f6816a)) {
            obj = Pair.create(obj, rg.f6816a);
        }
        rg.f6816a = obj;
        rg.f6825l += i6;
        rg.f6826m += i6;
        return rg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final Object f(int i4) {
        int[] iArr = this.f5792f;
        int j4 = AbstractC0751is.j(iArr, i4 + 1, false, false);
        return Pair.create(this.f5795i[j4], this.f5794h[j4].f(i4 - iArr[j4]));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final int g(boolean z4) {
        if (this.f5790b != 0) {
            int i4 = 0;
            if (z4) {
                int[] iArr = this.c.f6315b;
                i4 = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                AbstractC0484ch[] abstractC0484chArr = this.f5794h;
                if (!abstractC0484chArr[i4].o()) {
                    return abstractC0484chArr[i4].g(z4) + this.f5793g[i4];
                }
                i4 = p(i4, z4);
            } while (i4 != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final int h(boolean z4) {
        int i4;
        int i5 = this.f5790b;
        if (i5 != 0) {
            if (z4) {
                int[] iArr = this.c.f6315b;
                int length = iArr.length;
                i4 = length > 0 ? iArr[length - 1] : -1;
            } else {
                i4 = i5 - 1;
            }
            do {
                AbstractC0484ch[] abstractC0484chArr = this.f5794h;
                if (!abstractC0484chArr[i4].o()) {
                    return abstractC0484chArr[i4].h(z4) + this.f5793g[i4];
                }
                i4 = q(i4, z4);
            } while (i4 != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final int j(int i4, int i5, boolean z4) {
        int[] iArr = this.f5793g;
        int j4 = AbstractC0751is.j(iArr, i4 + 1, false, false);
        int i6 = iArr[j4];
        AbstractC0484ch[] abstractC0484chArr = this.f5794h;
        int j5 = abstractC0484chArr[j4].j(i4 - i6, i5 != 2 ? i5 : 0, z4);
        if (j5 != -1) {
            return i6 + j5;
        }
        int p3 = p(j4, z4);
        while (p3 != -1 && abstractC0484chArr[p3].o()) {
            p3 = p(p3, z4);
        }
        if (p3 != -1) {
            return abstractC0484chArr[p3].g(z4) + iArr[p3];
        }
        if (i5 == 2) {
            return g(z4);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final int k(int i4) {
        int[] iArr = this.f5793g;
        int j4 = AbstractC0751is.j(iArr, i4 + 1, false, false);
        int i5 = iArr[j4];
        AbstractC0484ch[] abstractC0484chArr = this.f5794h;
        int k3 = abstractC0484chArr[j4].k(i4 - i5);
        if (k3 != -1) {
            return i5 + k3;
        }
        int q4 = q(j4, false);
        while (q4 != -1 && abstractC0484chArr[q4].o()) {
            q4 = q(q4, false);
        }
        if (q4 == -1) {
            return -1;
        }
        return abstractC0484chArr[q4].h(false) + iArr[q4];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0484ch
    public final C1210tg n(Object obj, C1210tg c1210tg) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f5796j.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i4 = this.f5793g[intValue];
        this.f5794h[intValue].n(obj3, c1210tg);
        c1210tg.c += i4;
        c1210tg.f10712b = obj;
        return c1210tg;
    }

    public final int p(int i4, boolean z4) {
        if (!z4) {
            if (i4 >= this.f5790b - 1) {
                return -1;
            }
            return i4 + 1;
        }
        NE ne = this.c;
        int i5 = ne.c[i4] + 1;
        int[] iArr = ne.f6315b;
        if (i5 < iArr.length) {
            return iArr[i5];
        }
        return -1;
    }

    public final int q(int i4, boolean z4) {
        if (!z4) {
            if (i4 <= 0) {
                return -1;
            }
            return i4 - 1;
        }
        NE ne = this.c;
        int i5 = ne.c[i4] - 1;
        if (i5 >= 0) {
            return ne.f6315b[i5];
        }
        return -1;
    }
}
