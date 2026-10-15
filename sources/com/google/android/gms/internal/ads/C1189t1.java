package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1189t1 {

    /* renamed from: a, reason: collision with root package name */
    public final C1061q1 f10661a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10662b;
    public final long[] c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10663e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f10664f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f10665g;

    /* renamed from: h, reason: collision with root package name */
    public final long f10666h;

    public C1189t1(C1061q1 c1061q1, long[] jArr, int[] iArr, int i4, long[] jArr2, int[] iArr2, long j4) {
        int length = iArr.length;
        int length2 = jArr2.length;
        Zf.O(length == length2);
        int length3 = jArr.length;
        Zf.O(length3 == length2);
        int length4 = iArr2.length;
        Zf.O(length4 == length2);
        this.f10661a = c1061q1;
        this.c = jArr;
        this.d = iArr;
        this.f10663e = i4;
        this.f10664f = jArr2;
        this.f10665g = iArr2;
        this.f10666h = j4;
        this.f10662b = length3;
        if (length4 > 0) {
            int i5 = length4 - 1;
            iArr2[i5] = iArr2[i5] | 536870912;
        }
    }

    public final int a(long j4) {
        int i4;
        int i5 = AbstractC0751is.f9071a;
        long[] jArr = this.f10664f;
        int binarySearch = Arrays.binarySearch(jArr, j4);
        if (binarySearch < 0) {
            i4 = ~binarySearch;
        } else {
            while (true) {
                int i6 = binarySearch + 1;
                if (i6 >= jArr.length || jArr[i6] != j4) {
                    break;
                }
                binarySearch = i6;
            }
            i4 = binarySearch;
        }
        while (i4 < jArr.length) {
            if ((this.f10665g[i4] & 1) != 0) {
                return i4;
            }
            i4++;
        }
        return -1;
    }
}
