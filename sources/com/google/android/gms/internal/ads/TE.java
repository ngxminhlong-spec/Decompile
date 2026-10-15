package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class TE implements InterfaceC0690hF {

    /* renamed from: a, reason: collision with root package name */
    public final C0997oh f7054a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7055b;
    public final int[] c;
    public final C0976o2[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f7056e;

    public TE(C0997oh c0997oh, int[] iArr) {
        int length = iArr.length;
        Zf.X(length > 0);
        c0997oh.getClass();
        C0976o2[] c0976o2Arr = c0997oh.c;
        this.f7054a = c0997oh;
        this.f7055b = length;
        this.d = new C0976o2[length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            this.d[i4] = c0976o2Arr[iArr[i4]];
        }
        Arrays.sort(this.d, UE.f7154p);
        this.c = new int[this.f7055b];
        for (int i5 = 0; i5 < this.f7055b; i5++) {
            int[] iArr2 = this.c;
            C0976o2 c0976o2 = this.d[i5];
            int i6 = 0;
            while (true) {
                if (i6 > 0) {
                    i6 = -1;
                    break;
                } else if (c0976o2 == c0976o2Arr[i6]) {
                    break;
                } else {
                    i6++;
                }
            }
            iArr2[i5] = i6;
        }
    }

    public static void d(ArrayList arrayList, long[] jArr) {
        long j4 = 0;
        for (int i4 = 0; i4 < 2; i4++) {
            j4 += jArr[i4];
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            C1009ot c1009ot = (C1009ot) arrayList.get(i5);
            if (c1009ot != null) {
                c1009ot.a(new SE(j4, jArr[i5]));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0690hF
    public final C0997oh a() {
        return this.f7054a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0690hF
    public final int b() {
        return this.c[0];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0690hF
    public final C0976o2 c(int i4) {
        return this.d[i4];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0690hF
    public final int e() {
        return this.c.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TE te = (TE) obj;
            if (this.f7054a.equals(te.f7054a) && Arrays.equals(this.c, te.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f7056e;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = Arrays.hashCode(this.c) + (System.identityHashCode(this.f7054a) * 31);
        this.f7056e = hashCode;
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0690hF
    public final int u(int i4) {
        for (int i5 = 0; i5 < this.f7055b; i5++) {
            if (this.c[i5] == i4) {
                return i5;
            }
        }
        return -1;
    }
}
