package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d implements Collection {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e f14726o;

    public d(e eVar) {
        this.f14726o = eVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f14726o.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f14726o.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f14726o.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1964a(this.f14726o, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f14726o;
        int a4 = eVar.a(obj);
        if (a4 < 0) {
            return false;
        }
        eVar.g(a4);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f14726o;
        int i4 = eVar.f14741q;
        int i5 = 0;
        boolean z4 = false;
        while (i5 < i4) {
            if (collection.contains(eVar.i(i5))) {
                eVar.g(i5);
                i5--;
                i4--;
                z4 = true;
            }
            i5++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f14726o;
        int i4 = eVar.f14741q;
        int i5 = 0;
        boolean z4 = false;
        while (i5 < i4) {
            if (!collection.contains(eVar.i(i5))) {
                eVar.g(i5);
                i5--;
                i4--;
                z4 = true;
            }
            i5++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f14726o.f14741q;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f14726o;
        int i4 = eVar.f14741q;
        Object[] objArr = new Object[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = eVar.i(i5);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f14726o;
        int i4 = eVar.f14741q;
        if (objArr.length < i4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = eVar.i(i5);
        }
        if (objArr.length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
