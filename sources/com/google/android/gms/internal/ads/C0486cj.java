package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.cj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0486cj {

    /* renamed from: b, reason: collision with root package name */
    public static final C0486cj f8383b;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1137rt f8384a;

    static {
        C1052pt c1052pt = AbstractC1137rt.f10543p;
        f8383b = new C0486cj(Gt.f5344s);
        Integer.toString(0, 36);
    }

    public C0486cj(Gt gt) {
        this.f8384a = AbstractC1137rt.r(gt);
    }

    public final boolean a(int i4) {
        int i5 = 0;
        while (true) {
            AbstractC1137rt abstractC1137rt = this.f8384a;
            if (i5 >= abstractC1137rt.size()) {
                return false;
            }
            Ri ri = (Ri) abstractC1137rt.get(i5);
            boolean[] zArr = ri.c;
            int length = zArr.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (!zArr[i6]) {
                    i6++;
                } else if (ri.f6827a.f9847b == i4) {
                    return true;
                }
            }
            i5++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0486cj.class != obj.getClass()) {
            return false;
        }
        return this.f8384a.equals(((C0486cj) obj).f8384a);
    }

    public final int hashCode() {
        return this.f8384a.hashCode();
    }
}
