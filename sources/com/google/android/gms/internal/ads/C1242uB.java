package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.uB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1242uB extends AbstractList {

    /* renamed from: q, reason: collision with root package name */
    public static final AbstractC0587ez f10783q = AbstractC0587ez.k(C1242uB.class);

    /* renamed from: o, reason: collision with root package name */
    public final List f10784o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC1113rB f10785p;

    public C1242uB(ArrayList arrayList, AbstractC1113rB abstractC1113rB) {
        this.f10784o = arrayList;
        this.f10785p = abstractC1113rB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        List list = this.f10784o;
        if (list.size() > i4) {
            return list.get(i4);
        }
        AbstractC1113rB abstractC1113rB = this.f10785p;
        if (!abstractC1113rB.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(abstractC1113rB.next());
        return get(i4);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C1199tB(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        AbstractC0587ez abstractC0587ez = f10783q;
        abstractC0587ez.g("potentially expensive size() call");
        abstractC0587ez.g("blowup running");
        while (true) {
            AbstractC1113rB abstractC1113rB = this.f10785p;
            boolean hasNext = abstractC1113rB.hasNext();
            List list = this.f10784o;
            if (!hasNext) {
                return list.size();
            }
            list.add(abstractC1113rB.next());
        }
    }
}
