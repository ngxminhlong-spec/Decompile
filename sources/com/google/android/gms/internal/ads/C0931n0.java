package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0931n0 extends AA {

    /* renamed from: q, reason: collision with root package name */
    public long f9691q;

    /* renamed from: r, reason: collision with root package name */
    public long[] f9692r;

    /* renamed from: s, reason: collision with root package name */
    public long[] f9693s;

    public static Serializable r1(int i4, C1134rq c1134rq) {
        if (i4 == 0) {
            return Double.valueOf(Double.longBitsToDouble(c1134rq.t()));
        }
        if (i4 == 1) {
            return Boolean.valueOf(c1134rq.m() == 1);
        }
        if (i4 == 2) {
            return s1(c1134rq);
        }
        if (i4 != 3) {
            if (i4 == 8) {
                return t1(c1134rq);
            }
            if (i4 != 10) {
                if (i4 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c1134rq.t()));
                c1134rq.f(2);
                return date;
            }
            int p3 = c1134rq.p();
            ArrayList arrayList = new ArrayList(p3);
            for (int i5 = 0; i5 < p3; i5++) {
                Serializable r1 = r1(c1134rq.m(), c1134rq);
                if (r1 != null) {
                    arrayList.add(r1);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String s12 = s1(c1134rq);
            int m4 = c1134rq.m();
            if (m4 == 9) {
                return hashMap;
            }
            Serializable r12 = r1(m4, c1134rq);
            if (r12 != null) {
                hashMap.put(s12, r12);
            }
        }
    }

    public static String s1(C1134rq c1134rq) {
        int q4 = c1134rq.q();
        int i4 = c1134rq.f10537b;
        c1134rq.f(q4);
        return new String(c1134rq.f10536a, i4, q4);
    }

    public static HashMap t1(C1134rq c1134rq) {
        int p3 = c1134rq.p();
        HashMap hashMap = new HashMap(p3);
        for (int i4 = 0; i4 < p3; i4++) {
            String s12 = s1(c1134rq);
            Serializable r1 = r1(c1134rq.m(), c1134rq);
            if (r1 != null) {
                hashMap.put(s12, r1);
            }
        }
        return hashMap;
    }
}
