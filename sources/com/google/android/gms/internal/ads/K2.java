package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class K2 {

    /* renamed from: a, reason: collision with root package name */
    public long f5963a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5964b;
    public final String c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5965e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5966f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5967g;

    /* renamed from: h, reason: collision with root package name */
    public final List f5968h;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K2(java.lang.String r14, com.google.android.gms.internal.ads.C1190t2 r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.f10668b
            long r3 = r15.c
            long r5 = r15.d
            long r7 = r15.f10669e
            long r9 = r15.f10670f
            java.util.List r0 = r15.f10672h
            if (r0 == 0) goto L12
        Le:
            r1 = r14
            r11 = r0
            r0 = r13
            goto L46
        L12:
            java.util.Map r15 = r15.f10671g
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L25:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto Le
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.x2 r11 = new com.google.android.gms.internal.ads.x2
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L25
        L46:
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.K2.<init>(java.lang.String, com.google.android.gms.internal.ads.t2):void");
    }

    public K2(String str, String str2, long j4, long j5, long j6, long j7, List list) {
        this.f5964b = str;
        this.c = true == "".equals(str2) ? null : str2;
        this.d = j4;
        this.f5965e = j5;
        this.f5966f = j6;
        this.f5967g = j7;
        this.f5968h = list;
    }

    public static K2 a(L2 l22) {
        if (N2.d(l22) != 538247942) {
            throw new IOException();
        }
        String g4 = N2.g(l22);
        String g5 = N2.g(l22);
        long e4 = N2.e(l22);
        long e5 = N2.e(l22);
        long e6 = N2.e(l22);
        long e7 = N2.e(l22);
        int d = N2.d(l22);
        if (d < 0) {
            throw new IOException(U.a.i("readHeaderList size=", d));
        }
        List arrayList = d == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i4 = 0; i4 < d; i4++) {
            arrayList.add(new C1362x2(N2.g(l22).intern(), N2.g(l22).intern()));
        }
        return new K2(g4, g5, e4, e5, e6, e7, arrayList);
    }
}
