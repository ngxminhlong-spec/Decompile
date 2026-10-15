package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public long f4964a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.internal.ads.uB] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.uB] */
    public long a(ByteBuffer byteBuffer) {
        X2 x22;
        W2 w2;
        long j4 = this.f4964a;
        if (j4 > 0) {
            return j4;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            U2 u2 = new U2(new C0737id(duplicate), C0778jd.c);
            ArrayList arrayList = u2.f10465t;
            if (u2.f10461p != null && u2.f10462q != AbstractC1113rB.f10459u) {
                arrayList = new C1242uB(arrayList, u2);
            }
            Iterator it = arrayList.iterator();
            while (true) {
                x22 = null;
                if (!it.hasNext()) {
                    w2 = null;
                    break;
                }
                V2 v22 = (V2) it.next();
                if (v22 instanceof W2) {
                    w2 = (W2) v22;
                    break;
                }
            }
            ArrayList arrayList2 = w2.f10465t;
            if (w2.f10461p != null && w2.f10462q != AbstractC1113rB.f10459u) {
                arrayList2 = new C1242uB(arrayList2, w2);
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                V2 v23 = (V2) it2.next();
                if (v23 instanceof X2) {
                    x22 = (X2) v23;
                    break;
                }
            }
            long j5 = (x22.f7591A * 1000) / x22.f7598z;
            this.f4964a = j5;
            return j5;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
