package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f6628a;

    public final int a(int i4) {
        SparseBooleanArray sparseBooleanArray = this.f6628a;
        Zf.m(i4, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q0)) {
            return false;
        }
        Q0 q02 = (Q0) obj;
        SparseBooleanArray sparseBooleanArray = q02.f6628a;
        int i4 = AbstractC0751is.f9071a;
        SparseBooleanArray sparseBooleanArray2 = this.f6628a;
        if (i4 >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i5 = 0; i5 < sparseBooleanArray2.size(); i5++) {
            if (a(i5) != q02.a(i5)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i4 = AbstractC0751is.f9071a;
        SparseBooleanArray sparseBooleanArray = this.f6628a;
        if (i4 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i5 = 0; i5 < sparseBooleanArray.size(); i5++) {
            size = (size * 31) + a(i5);
        }
        return size;
    }
}
