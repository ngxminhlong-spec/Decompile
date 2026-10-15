package r;

import java.util.Arrays;
import s.AbstractC1969a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j implements Cloneable {

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ boolean f14742o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ int[] f14743p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object[] f14744q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ int f14745r;

    public j() {
        this(10);
    }

    public j(int i4) {
        if (i4 == 0) {
            this.f14743p = AbstractC1969a.f14757a;
            this.f14744q = AbstractC1969a.f14758b;
            return;
        }
        int i5 = i4 * 4;
        int i6 = 4;
        while (true) {
            if (i6 >= 32) {
                break;
            }
            int i7 = (1 << i6) - 12;
            if (i5 <= i7) {
                i5 = i7;
                break;
            }
            i6++;
        }
        int i8 = i5 / 4;
        this.f14743p = new int[i8];
        this.f14744q = new Object[i8];
    }

    public final void a(int i4, Object obj) {
        int i5 = this.f14745r;
        if (i5 != 0 && i4 <= this.f14743p[i5 - 1]) {
            e(i4, obj);
            return;
        }
        if (this.f14742o && i5 >= this.f14743p.length) {
            h.a(this);
        }
        int i6 = this.f14745r;
        if (i6 >= this.f14743p.length) {
            int i7 = (i6 + 1) * 4;
            int i8 = 4;
            while (true) {
                if (i8 >= 32) {
                    break;
                }
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
            int i10 = i7 / 4;
            int[] copyOf = Arrays.copyOf(this.f14743p, i10);
            S3.e.d(copyOf, "copyOf(this, newSize)");
            this.f14743p = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f14744q, i10);
            S3.e.d(copyOf2, "copyOf(this, newSize)");
            this.f14744q = copyOf2;
        }
        this.f14743p[i6] = i4;
        this.f14744q[i6] = obj;
        this.f14745r = i6 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j clone() {
        Object clone = super.clone();
        S3.e.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        j jVar = (j) clone;
        jVar.f14743p = (int[]) this.f14743p.clone();
        jVar.f14744q = (Object[]) this.f14744q.clone();
        return jVar;
    }

    public final Object c(int i4) {
        Object obj;
        int a4 = AbstractC1969a.a(this.f14745r, i4, this.f14743p);
        if (a4 < 0 || (obj = this.f14744q[a4]) == h.f14738b) {
            return null;
        }
        return obj;
    }

    public final int d(int i4) {
        if (this.f14742o) {
            h.a(this);
        }
        return this.f14743p[i4];
    }

    public final void e(int i4, Object obj) {
        int a4 = AbstractC1969a.a(this.f14745r, i4, this.f14743p);
        if (a4 >= 0) {
            this.f14744q[a4] = obj;
            return;
        }
        int i5 = ~a4;
        int i6 = this.f14745r;
        if (i5 < i6) {
            Object[] objArr = this.f14744q;
            if (objArr[i5] == h.f14738b) {
                this.f14743p[i5] = i4;
                objArr[i5] = obj;
                return;
            }
        }
        if (this.f14742o && i6 >= this.f14743p.length) {
            h.a(this);
            i5 = ~AbstractC1969a.a(this.f14745r, i4, this.f14743p);
        }
        int i7 = this.f14745r;
        if (i7 >= this.f14743p.length) {
            int i8 = (i7 + 1) * 4;
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
            int i11 = i8 / 4;
            int[] copyOf = Arrays.copyOf(this.f14743p, i11);
            S3.e.d(copyOf, "copyOf(this, newSize)");
            this.f14743p = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f14744q, i11);
            S3.e.d(copyOf2, "copyOf(this, newSize)");
            this.f14744q = copyOf2;
        }
        int i12 = this.f14745r;
        if (i12 - i5 != 0) {
            int[] iArr = this.f14743p;
            int i13 = i5 + 1;
            K3.b.j0(i13, i5, i12, iArr, iArr);
            Object[] objArr2 = this.f14744q;
            K3.b.k0(i13, i5, this.f14745r, objArr2, objArr2);
        }
        this.f14743p[i5] = i4;
        this.f14744q[i5] = obj;
        this.f14745r++;
    }

    public final int f() {
        if (this.f14742o) {
            h.a(this);
        }
        return this.f14745r;
    }

    public final Object g(int i4) {
        if (this.f14742o) {
            h.a(this);
        }
        return this.f14744q[i4];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f14745r * 28);
        sb.append('{');
        int i4 = this.f14745r;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(d(i5));
            sb.append('=');
            Object g4 = g(i5);
            if (g4 != this) {
                sb.append(g4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        S3.e.d(sb2, "buffer.toString()");
        return sb2;
    }
}
