package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Rz extends AbstractC0459bz implements RandomAccess, Sz {

    /* renamed from: p, reason: collision with root package name */
    public final List f6872p;

    static {
        new Rz();
    }

    public Rz() {
        super(false);
        this.f6872p = Collections.EMPTY_LIST;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rz(int i4) {
        super(true);
        ArrayList arrayList = new ArrayList(i4);
        this.f6872p = arrayList;
    }

    public Rz(ArrayList arrayList) {
        super(true);
        this.f6872p = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.Sz
    public final Sz a() {
        return this.f8310o ? new C1327wA(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i4, Object obj) {
        g();
        this.f6872p.add(i4, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0459bz, java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        g();
        if (collection instanceof Sz) {
            collection = ((Sz) collection).f();
        }
        boolean addAll = this.f6872p.addAll(i4, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0459bz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f6872p.size(), collection);
    }

    @Override // com.google.android.gms.internal.ads.Lz
    public final Lz c(int i4) {
        List list = this.f6872p;
        if (i4 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i4);
        arrayList.addAll(list);
        return new Rz(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0459bz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        this.f6872p.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.Sz
    public final Object d(int i4) {
        return this.f6872p.get(i4);
    }

    @Override // com.google.android.gms.internal.ads.Sz
    public final List f() {
        return Collections.unmodifiableList(this.f6872p);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final String get(int i4) {
        List list = this.f6872p;
        Object obj = list.get(i4);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0886lz) {
            AbstractC0886lz abstractC0886lz = (AbstractC0886lz) obj;
            String u2 = abstractC0886lz.l() == 0 ? "" : abstractC0886lz.u(Mz.f6292a);
            if (abstractC0886lz.w()) {
                list.set(i4, u2);
            }
            return u2;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, Mz.f6292a);
        C0347Uc c0347Uc = DA.f4592a;
        int length = bArr.length;
        c0347Uc.getClass();
        if (C0347Uc.j(bArr, 0, length)) {
            list.set(i4, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.Sz
    public final void m(AbstractC0886lz abstractC0886lz) {
        g();
        this.f6872p.add(abstractC0886lz);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0459bz, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        g();
        Object remove = this.f6872p.remove(i4);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof AbstractC0886lz)) {
            return new String((byte[]) remove, Mz.f6292a);
        }
        AbstractC0886lz abstractC0886lz = (AbstractC0886lz) remove;
        return abstractC0886lz.l() == 0 ? "" : abstractC0886lz.u(Mz.f6292a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        g();
        Object obj2 = this.f6872p.set(i4, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof AbstractC0886lz)) {
            return new String((byte[]) obj2, Mz.f6292a);
        }
        AbstractC0886lz abstractC0886lz = (AbstractC0886lz) obj2;
        return abstractC0886lz.l() == 0 ? "" : abstractC0886lz.u(Mz.f6292a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6872p.size();
    }
}
