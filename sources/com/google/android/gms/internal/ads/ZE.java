package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class ZE extends C0912mi {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f7979t = 0;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7980k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7981l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f7982m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f7983n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f7984o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7985p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f7986q;

    /* renamed from: r, reason: collision with root package name */
    public final SparseArray f7987r;

    /* renamed from: s, reason: collision with root package name */
    public final SparseBooleanArray f7988s;

    static {
        new ZE(new YE());
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public ZE(YE ye) {
        super(ye);
        this.f7980k = ye.f7799k;
        this.f7981l = ye.f7800l;
        this.f7982m = ye.f7801m;
        this.f7983n = ye.f7802n;
        this.f7984o = ye.f7803o;
        this.f7985p = ye.f7804p;
        this.f7986q = ye.f7805q;
        this.f7987r = ye.f7806r;
        this.f7988s = ye.f7807s;
    }

    @Override // com.google.android.gms.internal.ads.C0912mi
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ZE.class == obj.getClass()) {
            ZE ze = (ZE) obj;
            if (super.equals(ze) && this.f7980k == ze.f7980k && this.f7981l == ze.f7981l && this.f7982m == ze.f7982m && this.f7983n == ze.f7983n && this.f7984o == ze.f7984o && this.f7985p == ze.f7985p && this.f7986q == ze.f7986q) {
                SparseBooleanArray sparseBooleanArray = ze.f7988s;
                SparseBooleanArray sparseBooleanArray2 = this.f7988s;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            SparseArray sparseArray = ze.f7987r;
                            SparseArray sparseArray2 = this.f7987r;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i5 = 0; i5 < size2; i5++) {
                                    int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i5));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i5);
                                        Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                RE re = (RE) entry.getKey();
                                                if (map2.containsKey(re) && AbstractC0751is.c(entry.getValue(), map2.get(re))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i4)) < 0) {
                                break;
                            }
                            i4++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.C0912mi
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f7980k ? 1 : 0)) * 961) + (this.f7981l ? 1 : 0)) * 961) + (this.f7982m ? 1 : 0)) * 28629151) + (this.f7983n ? 1 : 0)) * 31) + (this.f7984o ? 1 : 0)) * 31) + (this.f7985p ? 1 : 0)) * 961) + (this.f7986q ? 1 : 0)) * 31;
    }
}
