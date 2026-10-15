package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506d2 implements B {

    /* renamed from: a, reason: collision with root package name */
    public final List f8437a;

    /* renamed from: b, reason: collision with root package name */
    public final C1134rq f8438b = new C1134rq(0, new byte[9400]);
    public final SparseIntArray c;
    public final M3 d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f8439e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseBooleanArray f8440f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f8441g;

    /* renamed from: h, reason: collision with root package name */
    public final X1 f8442h;

    /* renamed from: i, reason: collision with root package name */
    public C0759j0 f8443i;

    /* renamed from: j, reason: collision with root package name */
    public D f8444j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8445k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8446l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8447m;

    /* renamed from: n, reason: collision with root package name */
    public int f8448n;

    public C0506d2(Sr sr, M3 m32) {
        this.d = m32;
        this.f8437a = Collections.singletonList(sr);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f8440f = sparseBooleanArray;
        this.f8441g = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f8439e = sparseArray;
        this.c = new SparseIntArray();
        this.f8442h = new X1(1);
        this.f8444j = D.d;
        this.f8448n = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f8439e.put(sparseArray2.keyAt(i4), (InterfaceC0634g2) sparseArray2.valueAt(i4));
        }
        this.f8439e.put(0, new C0421b2(new C0783ji(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(com.google.android.gms.internal.ads.C r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.rq r0 = r6.f8438b
            byte[] r0 = r0.f10536a
            com.google.android.gms.internal.ads.w r7 = (com.google.android.gms.internal.ads.C1316w) r7
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.E(r0, r2, r1, r2)
            r1 = r2
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = r2
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.f(r1)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0506d2.d(com.google.android.gms.internal.ads.C):boolean");
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void g(D d) {
        this.f8444j = d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x028a, code lost:
    
        if (r5 == false) goto L154;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.C r25, com.google.android.gms.internal.ads.F r26) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0506d2.h(com.google.android.gms.internal.ads.C, com.google.android.gms.internal.ads.F):int");
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void i(long j4, long j5) {
        C0759j0 c0759j0;
        List list = this.f8437a;
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Sr sr = (Sr) list.get(i5);
            if (sr.d() != -9223372036854775807L) {
                long c = sr.c();
                if (c != -9223372036854775807L) {
                    if (c != 0) {
                        if (c == j5) {
                        }
                    }
                }
            }
            sr.e(j5);
        }
        if (j5 != 0 && (c0759j0 = this.f8443i) != null) {
            c0759j0.b(j5);
        }
        this.f8438b.b(0);
        this.c.clear();
        while (true) {
            SparseArray sparseArray = this.f8439e;
            if (i4 >= sparseArray.size()) {
                return;
            }
            ((InterfaceC0634g2) sparseArray.valueAt(i4)).e();
            i4++;
        }
    }
}
