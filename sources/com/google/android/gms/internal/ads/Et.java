package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Et extends Ft implements Serializable {

    /* renamed from: p, reason: collision with root package name */
    public static final Et f4954p = new Et(0);

    /* renamed from: q, reason: collision with root package name */
    public static final Et f4955q = new Et(1);

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4956o;

    public /* synthetic */ Et(int i4) {
        this.f4956o = i4;
    }

    @Override // com.google.android.gms.internal.ads.Ft
    public final Ft a() {
        switch (this.f4956o) {
            case 0:
                return f4955q;
            default:
                return f4954p;
        }
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f4956o) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f4956o) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
