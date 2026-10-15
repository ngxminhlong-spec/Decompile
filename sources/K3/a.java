package K3;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends AbstractList implements List {

    /* renamed from: r, reason: collision with root package name */
    public static final Object[] f1062r = new Object[0];

    /* renamed from: o, reason: collision with root package name */
    public int f1063o;

    /* renamed from: p, reason: collision with root package name */
    public Object[] f1064p = f1062r;

    /* renamed from: q, reason: collision with root package name */
    public int f1065q;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        int i6 = this.f1065q;
        if (i4 < 0 || i4 > i6) {
            throw new IndexOutOfBoundsException(U.a.g(i4, i6, "index: ", ", size: "));
        }
        if (i4 == i6) {
            addLast(obj);
            return;
        }
        if (i4 == 0) {
            addFirst(obj);
            return;
        }
        n();
        h(this.f1065q + 1);
        int l4 = l(this.f1063o + i4);
        int i7 = this.f1065q;
        if (i4 < ((i7 + 1) >> 1)) {
            if (l4 == 0) {
                Object[] objArr = this.f1064p;
                S3.e.e(objArr, "<this>");
                l4 = objArr.length;
            }
            int i8 = l4 - 1;
            int i9 = this.f1063o;
            if (i9 == 0) {
                Object[] objArr2 = this.f1064p;
                S3.e.e(objArr2, "<this>");
                i5 = objArr2.length - 1;
            } else {
                i5 = i9 - 1;
            }
            int i10 = this.f1063o;
            if (i8 >= i10) {
                Object[] objArr3 = this.f1064p;
                objArr3[i5] = objArr3[i10];
                b.k0(i10, i10 + 1, i8 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f1064p;
                b.k0(i10 - 1, i10, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f1064p;
                objArr5[objArr5.length - 1] = objArr5[0];
                b.k0(0, 1, i8 + 1, objArr5, objArr5);
            }
            this.f1064p[i8] = obj;
            this.f1063o = i5;
        } else {
            int l5 = l(this.f1063o + i7);
            if (l4 < l5) {
                Object[] objArr6 = this.f1064p;
                b.k0(l4 + 1, l4, l5, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f1064p;
                b.k0(1, 0, l5, objArr7, objArr7);
                Object[] objArr8 = this.f1064p;
                objArr8[0] = objArr8[objArr8.length - 1];
                b.k0(l4 + 1, l4, objArr8.length - 1, objArr8, objArr8);
            }
            this.f1064p[l4] = obj;
        }
        this.f1065q++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        S3.e.e(collection, "elements");
        int i5 = this.f1065q;
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(U.a.g(i4, i5, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i4 == this.f1065q) {
            return addAll(collection);
        }
        n();
        h(collection.size() + this.f1065q);
        int l4 = l(this.f1063o + this.f1065q);
        int l5 = l(this.f1063o + i4);
        int size = collection.size();
        if (i4 >= ((this.f1065q + 1) >> 1)) {
            int i6 = l5 + size;
            if (l5 < l4) {
                int i7 = size + l4;
                Object[] objArr = this.f1064p;
                if (i7 <= objArr.length) {
                    b.k0(i6, l5, l4, objArr, objArr);
                } else if (i6 >= objArr.length) {
                    b.k0(i6 - objArr.length, l5, l4, objArr, objArr);
                } else {
                    int length = l4 - (i7 - objArr.length);
                    b.k0(0, length, l4, objArr, objArr);
                    Object[] objArr2 = this.f1064p;
                    b.k0(i6, l5, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f1064p;
                b.k0(size, 0, l4, objArr3, objArr3);
                Object[] objArr4 = this.f1064p;
                if (i6 >= objArr4.length) {
                    b.k0(i6 - objArr4.length, l5, objArr4.length, objArr4, objArr4);
                } else {
                    b.k0(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f1064p;
                    b.k0(i6, l5, objArr5.length - size, objArr5, objArr5);
                }
            }
            g(l5, collection);
            return true;
        }
        int i8 = this.f1063o;
        int i9 = i8 - size;
        if (l5 < i8) {
            Object[] objArr6 = this.f1064p;
            b.k0(i9, i8, objArr6.length, objArr6, objArr6);
            if (size >= l5) {
                Object[] objArr7 = this.f1064p;
                b.k0(objArr7.length - size, 0, l5, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f1064p;
                b.k0(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f1064p;
                b.k0(0, size, l5, objArr9, objArr9);
            }
        } else if (i9 >= 0) {
            Object[] objArr10 = this.f1064p;
            b.k0(i9, i8, l5, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f1064p;
            i9 += objArr11.length;
            int i10 = l5 - i8;
            int length2 = objArr11.length - i9;
            if (length2 >= i10) {
                b.k0(i9, i8, l5, objArr11, objArr11);
            } else {
                b.k0(i9, i8, i8 + length2, objArr11, objArr11);
                Object[] objArr12 = this.f1064p;
                b.k0(0, this.f1063o + length2, l5, objArr12, objArr12);
            }
        }
        this.f1063o = i9;
        g(j(l5 - size), collection);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        S3.e.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        n();
        h(collection.size() + this.f1065q);
        g(l(this.f1063o + this.f1065q), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        n();
        h(this.f1065q + 1);
        int i4 = this.f1063o;
        if (i4 == 0) {
            Object[] objArr = this.f1064p;
            S3.e.e(objArr, "<this>");
            i4 = objArr.length;
        }
        int i5 = i4 - 1;
        this.f1063o = i5;
        this.f1064p[i5] = obj;
        this.f1065q++;
    }

    public final void addLast(Object obj) {
        n();
        h(this.f1065q + 1);
        this.f1064p[l(this.f1063o + this.f1065q)] = obj;
        this.f1065q++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            n();
            k(this.f1063o, l(this.f1063o + this.f1065q));
        }
        this.f1063o = 0;
        this.f1065q = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void g(int i4, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f1064p.length;
        while (i4 < length && it.hasNext()) {
            this.f1064p[i4] = it.next();
            i4++;
        }
        int i5 = this.f1063o;
        for (int i6 = 0; i6 < i5 && it.hasNext(); i6++) {
            this.f1064p[i6] = it.next();
        }
        this.f1065q = collection.size() + this.f1065q;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        int i5 = this.f1065q;
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException(U.a.g(i4, i5, "index: ", ", size: "));
        }
        return this.f1064p[l(this.f1063o + i4)];
    }

    public final void h(int i4) {
        if (i4 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f1064p;
        if (i4 <= objArr.length) {
            return;
        }
        if (objArr == f1062r) {
            if (i4 < 10) {
                i4 = 10;
            }
            this.f1064p = new Object[i4];
            return;
        }
        int length = objArr.length;
        int i5 = length + (length >> 1);
        if (i5 - i4 < 0) {
            i5 = i4;
        }
        if (i5 - 2147483639 > 0) {
            i5 = i4 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i5];
        b.k0(0, this.f1063o, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f1064p;
        int length2 = objArr3.length;
        int i6 = this.f1063o;
        b.k0(length2 - i6, 0, i6, objArr3, objArr2);
        this.f1063o = 0;
        this.f1064p = objArr2;
    }

    public final int i(int i4) {
        S3.e.e(this.f1064p, "<this>");
        if (i4 == r0.length - 1) {
            return 0;
        }
        return i4 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i4;
        int l4 = l(this.f1063o + this.f1065q);
        int i5 = this.f1063o;
        if (i5 < l4) {
            while (i5 < l4) {
                if (S3.e.a(obj, this.f1064p[i5])) {
                    i4 = this.f1063o;
                } else {
                    i5++;
                }
            }
            return -1;
        }
        if (i5 < l4) {
            return -1;
        }
        int length = this.f1064p.length;
        while (true) {
            if (i5 >= length) {
                for (int i6 = 0; i6 < l4; i6++) {
                    if (S3.e.a(obj, this.f1064p[i6])) {
                        i5 = i6 + this.f1064p.length;
                        i4 = this.f1063o;
                    }
                }
                return -1;
            }
            if (S3.e.a(obj, this.f1064p[i5])) {
                i4 = this.f1063o;
                break;
            }
            i5++;
        }
        return i5 - i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f1065q == 0;
    }

    public final int j(int i4) {
        return i4 < 0 ? i4 + this.f1064p.length : i4;
    }

    public final void k(int i4, int i5) {
        if (i4 < i5) {
            Object[] objArr = this.f1064p;
            S3.e.e(objArr, "<this>");
            Arrays.fill(objArr, i4, i5, (Object) null);
        } else {
            Object[] objArr2 = this.f1064p;
            Arrays.fill(objArr2, i4, objArr2.length, (Object) null);
            Object[] objArr3 = this.f1064p;
            S3.e.e(objArr3, "<this>");
            Arrays.fill(objArr3, 0, i5, (Object) null);
        }
    }

    public final int l(int i4) {
        Object[] objArr = this.f1064p;
        return i4 >= objArr.length ? i4 - objArr.length : i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i4;
        int l4 = l(this.f1063o + this.f1065q);
        int i5 = this.f1063o;
        if (i5 < l4) {
            length = l4 - 1;
            if (i5 <= length) {
                while (!S3.e.a(obj, this.f1064p[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i4 = this.f1063o;
                return length - i4;
            }
            return -1;
        }
        if (i5 > l4) {
            int i6 = l4 - 1;
            while (true) {
                if (-1 >= i6) {
                    Object[] objArr = this.f1064p;
                    S3.e.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i7 = this.f1063o;
                    if (i7 <= length) {
                        while (!S3.e.a(obj, this.f1064p[length])) {
                            if (length != i7) {
                                length--;
                            }
                        }
                        i4 = this.f1063o;
                    }
                } else {
                    if (S3.e.a(obj, this.f1064p[i6])) {
                        length = i6 + this.f1064p.length;
                        i4 = this.f1063o;
                        break;
                    }
                    i6--;
                }
            }
        }
        return -1;
    }

    public final void n() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        int i5 = this.f1065q;
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException(U.a.g(i4, i5, "index: ", ", size: "));
        }
        if (i4 == this.f1065q - 1) {
            return removeLast();
        }
        if (i4 == 0) {
            return removeFirst();
        }
        n();
        int l4 = l(this.f1063o + i4);
        Object[] objArr = this.f1064p;
        Object obj = objArr[l4];
        if (i4 < (this.f1065q >> 1)) {
            int i6 = this.f1063o;
            if (l4 >= i6) {
                b.k0(i6 + 1, i6, l4, objArr, objArr);
            } else {
                b.k0(1, 0, l4, objArr, objArr);
                Object[] objArr2 = this.f1064p;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i7 = this.f1063o;
                b.k0(i7 + 1, i7, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f1064p;
            int i8 = this.f1063o;
            objArr3[i8] = null;
            this.f1063o = i(i8);
        } else {
            int l5 = l((this.f1065q - 1) + this.f1063o);
            if (l4 <= l5) {
                Object[] objArr4 = this.f1064p;
                b.k0(l4, l4 + 1, l5 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f1064p;
                b.k0(l4, l4 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f1064p;
                objArr6[objArr6.length - 1] = objArr6[0];
                b.k0(0, 1, l5 + 1, objArr6, objArr6);
            }
            this.f1064p[l5] = null;
        }
        this.f1065q--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int l4;
        S3.e.e(collection, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f1064p.length != 0) {
            int l5 = l(this.f1063o + this.f1065q);
            int i4 = this.f1063o;
            if (i4 < l5) {
                l4 = i4;
                while (i4 < l5) {
                    Object obj = this.f1064p[i4];
                    if (collection.contains(obj)) {
                        z4 = true;
                    } else {
                        this.f1064p[l4] = obj;
                        l4++;
                    }
                    i4++;
                }
                Object[] objArr = this.f1064p;
                S3.e.e(objArr, "<this>");
                Arrays.fill(objArr, l4, l5, (Object) null);
            } else {
                int length = this.f1064p.length;
                boolean z5 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr2 = this.f1064p;
                    Object obj2 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj2)) {
                        z5 = true;
                    } else {
                        this.f1064p[i5] = obj2;
                        i5++;
                    }
                    i4++;
                }
                l4 = l(i5);
                for (int i6 = 0; i6 < l5; i6++) {
                    Object[] objArr3 = this.f1064p;
                    Object obj3 = objArr3[i6];
                    objArr3[i6] = null;
                    if (collection.contains(obj3)) {
                        z5 = true;
                    } else {
                        this.f1064p[l4] = obj3;
                        l4 = i(l4);
                    }
                }
                z4 = z5;
            }
            if (z4) {
                n();
                this.f1065q = j(l4 - this.f1063o);
            }
        }
        return z4;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        n();
        Object[] objArr = this.f1064p;
        int i4 = this.f1063o;
        Object obj = objArr[i4];
        objArr[i4] = null;
        this.f1063o = i(i4);
        this.f1065q--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        n();
        int l4 = l((this.f1065q - 1) + this.f1063o);
        Object[] objArr = this.f1064p;
        Object obj = objArr[l4];
        objArr[l4] = null;
        this.f1065q--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        int i6 = this.f1065q;
        if (i4 < 0 || i5 > i6) {
            StringBuilder m4 = U.a.m("fromIndex: ", i4, ", toIndex: ", i5, ", size: ");
            m4.append(i6);
            throw new IndexOutOfBoundsException(m4.toString());
        }
        if (i4 > i5) {
            throw new IllegalArgumentException(U.a.g(i4, i5, "fromIndex: ", " > toIndex: "));
        }
        int i7 = i5 - i4;
        if (i7 == 0) {
            return;
        }
        if (i7 == this.f1065q) {
            clear();
            return;
        }
        if (i7 == 1) {
            remove(i4);
            return;
        }
        n();
        if (i4 < this.f1065q - i5) {
            int l4 = l((i4 - 1) + this.f1063o);
            int l5 = l((i5 - 1) + this.f1063o);
            while (i4 > 0) {
                int i8 = l4 + 1;
                int min = Math.min(i4, Math.min(i8, l5 + 1));
                Object[] objArr = this.f1064p;
                int i9 = l5 - min;
                int i10 = l4 - min;
                b.k0(i9 + 1, i10 + 1, i8, objArr, objArr);
                l4 = j(i10);
                l5 = j(i9);
                i4 -= min;
            }
            int l6 = l(this.f1063o + i7);
            k(this.f1063o, l6);
            this.f1063o = l6;
        } else {
            int l7 = l(this.f1063o + i5);
            int l8 = l(this.f1063o + i4);
            int i11 = this.f1065q;
            while (true) {
                i11 -= i5;
                if (i11 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f1064p;
                i5 = Math.min(i11, Math.min(objArr2.length - l7, objArr2.length - l8));
                Object[] objArr3 = this.f1064p;
                int i12 = l7 + i5;
                b.k0(l8, l7, i12, objArr3, objArr3);
                l7 = l(i12);
                l8 = l(l8 + i5);
            }
            int l9 = l(this.f1063o + this.f1065q);
            k(j(l9 - i7), l9);
        }
        this.f1065q -= i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int l4;
        S3.e.e(collection, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f1064p.length != 0) {
            int l5 = l(this.f1063o + this.f1065q);
            int i4 = this.f1063o;
            if (i4 < l5) {
                l4 = i4;
                while (i4 < l5) {
                    Object obj = this.f1064p[i4];
                    if (collection.contains(obj)) {
                        this.f1064p[l4] = obj;
                        l4++;
                    } else {
                        z4 = true;
                    }
                    i4++;
                }
                Object[] objArr = this.f1064p;
                S3.e.e(objArr, "<this>");
                Arrays.fill(objArr, l4, l5, (Object) null);
            } else {
                int length = this.f1064p.length;
                boolean z5 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr2 = this.f1064p;
                    Object obj2 = objArr2[i4];
                    objArr2[i4] = null;
                    if (collection.contains(obj2)) {
                        this.f1064p[i5] = obj2;
                        i5++;
                    } else {
                        z5 = true;
                    }
                    i4++;
                }
                l4 = l(i5);
                for (int i6 = 0; i6 < l5; i6++) {
                    Object[] objArr3 = this.f1064p;
                    Object obj3 = objArr3[i6];
                    objArr3[i6] = null;
                    if (collection.contains(obj3)) {
                        this.f1064p[l4] = obj3;
                        l4 = i(l4);
                    } else {
                        z5 = true;
                    }
                }
                z4 = z5;
            }
            if (z4) {
                n();
                this.f1065q = j(l4 - this.f1063o);
            }
        }
        return z4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        int i5 = this.f1065q;
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException(U.a.g(i4, i5, "index: ", ", size: "));
        }
        int l4 = l(this.f1063o + i4);
        Object[] objArr = this.f1064p;
        Object obj2 = objArr[l4];
        objArr[l4] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1065q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f1065q]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        S3.e.e(objArr, "array");
        int length = objArr.length;
        int i4 = this.f1065q;
        if (length < i4) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i4);
            S3.e.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int l4 = l(this.f1063o + this.f1065q);
        int i5 = this.f1063o;
        if (i5 < l4) {
            b.l0(i5, l4, 2, this.f1064p, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f1064p;
            b.k0(0, this.f1063o, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f1064p;
            b.k0(objArr3.length - this.f1063o, 0, l4, objArr3, objArr);
        }
        int i6 = this.f1065q;
        if (i6 < objArr.length) {
            objArr[i6] = null;
        }
        return objArr;
    }
}
