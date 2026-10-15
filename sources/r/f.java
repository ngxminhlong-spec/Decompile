package r;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import s.AbstractC1969a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f implements Collection, Set {

    /* renamed from: o, reason: collision with root package name */
    public int[] f14730o = AbstractC1969a.f14757a;

    /* renamed from: p, reason: collision with root package name */
    public Object[] f14731p = AbstractC1969a.f14758b;

    /* renamed from: q, reason: collision with root package name */
    public int f14732q;

    public f(int i4) {
        if (i4 > 0) {
            h.b(this, i4);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i4;
        int c;
        int i5 = this.f14732q;
        if (obj == null) {
            c = h.c(this, null, 0);
            i4 = 0;
        } else {
            int hashCode = obj.hashCode();
            i4 = hashCode;
            c = h.c(this, obj, hashCode);
        }
        if (c >= 0) {
            return false;
        }
        int i6 = ~c;
        int[] iArr = this.f14730o;
        if (i5 >= iArr.length) {
            int i7 = 8;
            if (i5 >= 8) {
                i7 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i7 = 4;
            }
            Object[] objArr = this.f14731p;
            int[] iArr2 = new int[i7];
            this.f14730o = iArr2;
            this.f14731p = new Object[i7];
            if (i5 != this.f14732q) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                K3.b.j0(0, 0, iArr.length, iArr, iArr2);
                K3.b.l0(0, objArr.length, 6, objArr, this.f14731p);
            }
        }
        if (i6 < i5) {
            int[] iArr3 = this.f14730o;
            int i8 = i6 + 1;
            K3.b.j0(i8, i6, i5, iArr3, iArr3);
            Object[] objArr2 = this.f14731p;
            K3.b.k0(i8, i6, i5, objArr2, objArr2);
        }
        int i9 = this.f14732q;
        if (i5 == i9) {
            int[] iArr4 = this.f14730o;
            if (i6 < iArr4.length) {
                iArr4[i6] = i4;
                this.f14731p[i6] = obj;
                this.f14732q = i9 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        S3.e.e(collection, "elements");
        int size = collection.size() + this.f14732q;
        int i4 = this.f14732q;
        int[] iArr = this.f14730o;
        boolean z4 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f14731p;
            int[] iArr2 = new int[size];
            this.f14730o = iArr2;
            this.f14731p = new Object[size];
            if (i4 > 0) {
                K3.b.j0(0, 0, i4, iArr, iArr2);
                K3.b.l0(0, this.f14732q, 6, objArr, this.f14731p);
            }
        }
        if (this.f14732q != i4) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z4 |= add(it.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f14732q != 0) {
            this.f14730o = AbstractC1969a.f14757a;
            this.f14731p = AbstractC1969a.f14758b;
            this.f14732q = 0;
        }
        if (this.f14732q != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? h.c(this, null, 0) : h.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        S3.e.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f14732q != ((Set) obj).size()) {
            return false;
        }
        try {
            int i4 = this.f14732q;
            for (int i5 = 0; i5 < i4; i5++) {
                if (!((Set) obj).contains(this.f14731p[i5])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final void g(int i4) {
        int i5 = this.f14732q;
        Object[] objArr = this.f14731p;
        Object obj = objArr[i4];
        if (i5 <= 1) {
            clear();
            return;
        }
        int i6 = i5 - 1;
        int[] iArr = this.f14730o;
        if (iArr.length <= 8 || i5 >= iArr.length / 3) {
            if (i4 < i6) {
                int i7 = i4 + 1;
                K3.b.j0(i4, i7, i5, iArr, iArr);
                Object[] objArr2 = this.f14731p;
                K3.b.k0(i4, i7, i5, objArr2, objArr2);
            }
            this.f14731p[i6] = null;
        } else {
            int i8 = i5 > 8 ? i5 + (i5 >> 1) : 8;
            int[] iArr2 = new int[i8];
            this.f14730o = iArr2;
            this.f14731p = new Object[i8];
            if (i4 > 0) {
                K3.b.j0(0, 0, i4, iArr, iArr2);
                K3.b.l0(0, i4, 6, objArr, this.f14731p);
            }
            if (i4 < i6) {
                int i9 = i4 + 1;
                K3.b.j0(i4, i9, i5, iArr, this.f14730o);
                K3.b.k0(i4, i9, i5, objArr, this.f14731p);
            }
        }
        if (i5 != this.f14732q) {
            throw new ConcurrentModificationException();
        }
        this.f14732q = i6;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f14730o;
        int i4 = this.f14732q;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += iArr[i6];
        }
        return i5;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f14732q <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1964a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int c = obj == null ? h.c(this, null, 0) : h.c(this, obj, obj.hashCode());
        if (c < 0) {
            return false;
        }
        g(c);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        S3.e.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= remove(it.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z4;
        S3.e.e(collection, "elements");
        int i4 = this.f14732q - 1;
        boolean z5 = false;
        while (true) {
            int i5 = -1;
            if (-1 >= i4) {
                return z5;
            }
            Collection collection2 = collection;
            Object obj = this.f14731p[i4];
            if (collection2 instanceof Collection) {
                z4 = collection2.contains(obj);
            } else {
                if (!(collection2 instanceof List)) {
                    Iterator it = collection2.iterator();
                    int i6 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (i6 < 0) {
                            throw new ArithmeticException("Index overflow has happened.");
                        }
                        if (S3.e.a(obj, next)) {
                            i5 = i6;
                            break;
                        }
                        i6++;
                    }
                } else {
                    i5 = ((List) collection2).indexOf(obj);
                }
                z4 = i5 >= 0;
            }
            if (!z4) {
                g(i4);
                z5 = true;
            }
            i4--;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f14732q;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.f14731p;
        int i4 = this.f14732q;
        S3.e.e(objArr, "<this>");
        int length = objArr.length;
        if (i4 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i4);
            S3.e.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + length + ").");
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        S3.e.e(objArr, "array");
        int i4 = this.f14732q;
        if (objArr.length < i4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
        } else if (objArr.length > i4) {
            objArr[i4] = null;
        }
        K3.b.k0(0, 0, this.f14732q, this.f14731p, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f14732q * 14);
        sb.append('{');
        int i4 = this.f14732q;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object obj = this.f14731p[i5];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        S3.e.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
