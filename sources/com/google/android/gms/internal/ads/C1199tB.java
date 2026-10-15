package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.measurement.C1503d;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1199tB implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10676o;

    /* renamed from: p, reason: collision with root package name */
    public int f10677p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Iterable f10678q;

    public /* synthetic */ C1199tB(Iterable iterable, int i4) {
        this.f10676o = i4;
        this.f10678q = iterable;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10676o) {
            case 0:
                int i4 = this.f10677p;
                C1242uB c1242uB = (C1242uB) this.f10678q;
                return i4 < c1242uB.f10784o.size() || c1242uB.f10785p.hasNext();
            default:
                return this.f10677p < ((C1503d) this.f10678q).o();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10676o) {
            case 0:
                int i4 = this.f10677p;
                C1242uB c1242uB = (C1242uB) this.f10678q;
                List list = c1242uB.f10784o;
                if (i4 >= list.size()) {
                    list.add(c1242uB.f10785p.next());
                    return next();
                }
                int i5 = this.f10677p;
                this.f10677p = i5 + 1;
                return list.get(i5);
            default:
                int i6 = this.f10677p;
                C1503d c1503d = (C1503d) this.f10678q;
                if (i6 >= c1503d.o()) {
                    throw new NoSuchElementException(U.a.i("Out of bounds index: ", this.f10677p));
                }
                int i7 = this.f10677p;
                this.f10677p = i7 + 1;
                return c1503d.p(i7);
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
