package t2;

import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class B extends y {

    /* renamed from: v, reason: collision with root package name */
    public static final Object[] f14851v;

    /* renamed from: w, reason: collision with root package name */
    public static final B f14852w;

    /* renamed from: q, reason: collision with root package name */
    public final transient Object[] f14853q;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f14854r;

    /* renamed from: s, reason: collision with root package name */
    public final transient Object[] f14855s;

    /* renamed from: t, reason: collision with root package name */
    public final transient int f14856t;

    /* renamed from: u, reason: collision with root package name */
    public final transient int f14857u;

    static {
        Object[] objArr = new Object[0];
        f14851v = objArr;
        f14852w = new B(0, 0, 0, objArr, objArr);
    }

    public B(int i4, int i5, int i6, Object[] objArr, Object[] objArr2) {
        this.f14853q = objArr;
        this.f14854r = i4;
        this.f14855s = objArr2;
        this.f14856t = i5;
        this.f14857u = i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f14855s;
        if (objArr.length == 0) {
            return false;
        }
        int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i4 = rotateLeft & this.f14856t;
            Object obj2 = objArr[i4];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            rotateLeft = i4 + 1;
        }
    }

    @Override // t2.u
    public final int h(Object[] objArr) {
        Object[] objArr2 = this.f14853q;
        int i4 = this.f14857u;
        System.arraycopy(objArr2, 0, objArr, 0, i4);
        return i4;
    }

    @Override // t2.y, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f14854r;
    }

    @Override // t2.u
    public final int i() {
        return this.f14857u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        x xVar = this.f14946p;
        if (xVar == null) {
            v vVar = x.f14945p;
            int i4 = this.f14857u;
            xVar = i4 == 0 ? C1993A.f14848s : new C1993A(i4, this.f14853q);
            this.f14946p = xVar;
        }
        return xVar.listIterator(0);
    }

    @Override // t2.u
    public final int j() {
        return 0;
    }

    @Override // t2.u
    public final Object[] k() {
        return this.f14853q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14857u;
    }
}
