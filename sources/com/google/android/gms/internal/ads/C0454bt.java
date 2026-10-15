package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.bt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0454bt implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public int f8297o;

    /* renamed from: p, reason: collision with root package name */
    public int f8298p;

    /* renamed from: q, reason: collision with root package name */
    public int f8299q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0624ft f8300r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f8301s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0624ft f8302t;

    public C0454bt(C0624ft c0624ft, int i4) {
        this.f8301s = i4;
        this.f8302t = c0624ft;
        this.f8300r = c0624ft;
        this.f8297o = c0624ft.f8757s;
        this.f8298p = c0624ft.isEmpty() ? -1 : 0;
        this.f8299q = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8298p >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        C0624ft c0624ft = this.f8300r;
        if (c0624ft.f8757s != this.f8297o) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f8298p;
        this.f8299q = i4;
        switch (this.f8301s) {
            case 0:
                Object[] objArr = this.f8302t.f8755q;
                objArr.getClass();
                obj = objArr[i4];
                break;
            case 1:
                obj = new C0581et(this.f8302t, i4);
                break;
            default:
                Object[] objArr2 = this.f8302t.f8756r;
                objArr2.getClass();
                obj = objArr2[i4];
                break;
        }
        int i5 = this.f8298p + 1;
        if (i5 >= c0624ft.f8758t) {
            i5 = -1;
        }
        this.f8298p = i5;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C0624ft c0624ft = this.f8300r;
        if (c0624ft.f8757s != this.f8297o) {
            throw new ConcurrentModificationException();
        }
        Bs.j0("no calls to next() since the last call to remove()", this.f8299q >= 0);
        this.f8297o += 32;
        int i4 = this.f8299q;
        Object[] objArr = c0624ft.f8755q;
        objArr.getClass();
        c0624ft.remove(objArr[i4]);
        this.f8298p--;
        this.f8299q = -1;
    }
}
