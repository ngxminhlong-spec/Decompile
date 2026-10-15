package r;

import java.util.Arrays;
import s.AbstractC1969a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g implements Cloneable {

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ boolean f14733o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ long[] f14734p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object[] f14735q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ int f14736r;

    public g() {
        int i4;
        int i5 = 4;
        while (true) {
            i4 = 80;
            if (i5 >= 32) {
                break;
            }
            int i6 = (1 << i5) - 12;
            if (80 <= i6) {
                i4 = i6;
                break;
            }
            i5++;
        }
        int i7 = i4 / 8;
        this.f14734p = new long[i7];
        this.f14735q = new Object[i7];
    }

    public final void a(long j4, Long l4) {
        int i4 = this.f14736r;
        if (i4 != 0 && j4 <= this.f14734p[i4 - 1]) {
            g(j4, l4);
            return;
        }
        if (this.f14733o) {
            long[] jArr = this.f14734p;
            if (i4 >= jArr.length) {
                Object[] objArr = this.f14735q;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    Object obj = objArr[i6];
                    if (obj != h.f14737a) {
                        if (i6 != i5) {
                            jArr[i5] = jArr[i6];
                            objArr[i5] = obj;
                            objArr[i6] = null;
                        }
                        i5++;
                    }
                }
                this.f14733o = false;
                this.f14736r = i5;
            }
        }
        int i7 = this.f14736r;
        if (i7 >= this.f14734p.length) {
            int i8 = (i7 + 1) * 8;
            int i9 = 4;
            while (true) {
                if (i9 >= 32) {
                    break;
                }
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
                i9++;
            }
            int i11 = i8 / 8;
            long[] copyOf = Arrays.copyOf(this.f14734p, i11);
            S3.e.d(copyOf, "copyOf(this, newSize)");
            this.f14734p = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f14735q, i11);
            S3.e.d(copyOf2, "copyOf(this, newSize)");
            this.f14735q = copyOf2;
        }
        this.f14734p[i7] = j4;
        this.f14735q[i7] = l4;
        this.f14736r = i7 + 1;
    }

    public final void b() {
        int i4 = this.f14736r;
        Object[] objArr = this.f14735q;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.f14736r = 0;
        this.f14733o = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final g clone() {
        Object clone = super.clone();
        S3.e.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        g gVar = (g) clone;
        gVar.f14734p = (long[]) this.f14734p.clone();
        gVar.f14735q = (Object[]) this.f14735q.clone();
        return gVar;
    }

    public final Object d(long j4) {
        Object obj;
        int b4 = AbstractC1969a.b(this.f14734p, this.f14736r, j4);
        if (b4 < 0 || (obj = this.f14735q[b4]) == h.f14737a) {
            return null;
        }
        return obj;
    }

    public final Object e(long j4) {
        Object obj;
        int b4 = AbstractC1969a.b(this.f14734p, this.f14736r, j4);
        if (b4 < 0 || (obj = this.f14735q[b4]) == h.f14737a) {
            return -1L;
        }
        return obj;
    }

    public final long f(int i4) {
        int i5;
        if (i4 < 0 || i4 >= (i5 = this.f14736r)) {
            throw new IllegalArgumentException(U.a.i("Expected index to be within 0..size()-1, but was ", i4).toString());
        }
        if (this.f14733o) {
            long[] jArr = this.f14734p;
            Object[] objArr = this.f14735q;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != h.f14737a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.f14733o = false;
            this.f14736r = i6;
        }
        return this.f14734p[i4];
    }

    public final void g(long j4, Object obj) {
        Object obj2 = h.f14737a;
        int b4 = AbstractC1969a.b(this.f14734p, this.f14736r, j4);
        if (b4 >= 0) {
            this.f14735q[b4] = obj;
            return;
        }
        int i4 = ~b4;
        int i5 = this.f14736r;
        if (i4 < i5) {
            Object[] objArr = this.f14735q;
            if (objArr[i4] == obj2) {
                this.f14734p[i4] = j4;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.f14733o) {
            long[] jArr = this.f14734p;
            if (i5 >= jArr.length) {
                Object[] objArr2 = this.f14735q;
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    Object obj3 = objArr2[i7];
                    if (obj3 != obj2) {
                        if (i7 != i6) {
                            jArr[i6] = jArr[i7];
                            objArr2[i6] = obj3;
                            objArr2[i7] = null;
                        }
                        i6++;
                    }
                }
                this.f14733o = false;
                this.f14736r = i6;
                i4 = ~AbstractC1969a.b(this.f14734p, i6, j4);
            }
        }
        int i8 = this.f14736r;
        if (i8 >= this.f14734p.length) {
            int i9 = (i8 + 1) * 8;
            int i10 = 4;
            while (true) {
                if (i10 >= 32) {
                    break;
                }
                int i11 = (1 << i10) - 12;
                if (i9 <= i11) {
                    i9 = i11;
                    break;
                }
                i10++;
            }
            int i12 = i9 / 8;
            long[] copyOf = Arrays.copyOf(this.f14734p, i12);
            S3.e.d(copyOf, "copyOf(this, newSize)");
            this.f14734p = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f14735q, i12);
            S3.e.d(copyOf2, "copyOf(this, newSize)");
            this.f14735q = copyOf2;
        }
        int i13 = this.f14736r - i4;
        if (i13 != 0) {
            long[] jArr2 = this.f14734p;
            int i14 = i4 + 1;
            S3.e.e(jArr2, "<this>");
            System.arraycopy(jArr2, i4, jArr2, i14, i13);
            Object[] objArr3 = this.f14735q;
            K3.b.k0(i14, i4, this.f14736r, objArr3, objArr3);
        }
        this.f14734p[i4] = j4;
        this.f14735q[i4] = obj;
        this.f14736r++;
    }

    public final int h() {
        if (this.f14733o) {
            int i4 = this.f14736r;
            long[] jArr = this.f14734p;
            Object[] objArr = this.f14735q;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj = objArr[i6];
                if (obj != h.f14737a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f14733o = false;
            this.f14736r = i5;
        }
        return this.f14736r;
    }

    public final Object i(int i4) {
        int i5;
        if (i4 < 0 || i4 >= (i5 = this.f14736r)) {
            throw new IllegalArgumentException(U.a.i("Expected index to be within 0..size()-1, but was ", i4).toString());
        }
        if (this.f14733o) {
            long[] jArr = this.f14734p;
            Object[] objArr = this.f14735q;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != h.f14737a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.f14733o = false;
            this.f14736r = i6;
        }
        return this.f14735q[i4];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f14736r * 28);
        sb.append('{');
        int i4 = this.f14736r;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(f(i5));
            sb.append('=');
            Object i6 = i(i5);
            if (i6 != sb) {
                sb.append(i6);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        S3.e.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
