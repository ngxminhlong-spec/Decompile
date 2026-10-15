package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class O extends AbstractC1631p implements RandomAccess, P {

    /* renamed from: p, reason: collision with root package name */
    public final List f12164p;

    static {
        new O();
    }

    public O() {
        super(false);
        this.f12164p = Collections.EMPTY_LIST;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(int i4) {
        super(true);
        ArrayList arrayList = new ArrayList(i4);
        this.f12164p = arrayList;
    }

    public O(ArrayList arrayList) {
        super(true);
        this.f12164p = arrayList;
    }

    @Override // com.google.android.gms.internal.play_billing.P
    public final P a() {
        return this.f12238o ? new C1635r0(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i4, Object obj) {
        g();
        this.f12164p.add(i4, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1631p, java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        g();
        if (collection instanceof P) {
            collection = ((P) collection).f();
        }
        boolean addAll = this.f12164p.addAll(i4, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1631p, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f12164p.size(), collection);
    }

    @Override // com.google.android.gms.internal.play_billing.J
    public final J c(int i4) {
        List list = this.f12164p;
        if (i4 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i4);
        arrayList.addAll(list);
        return new O(arrayList);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1631p, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        this.f12164p.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.P
    public final Object d(int i4) {
        return this.f12164p.get(i4);
    }

    @Override // com.google.android.gms.internal.play_billing.P
    public final List f() {
        return Collections.unmodifiableList(this.f12164p);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final String get(int i4) {
        String str;
        List list = this.f12164p;
        Object obj = list.get(i4);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof C1638t)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, K.f12151a);
            x0 x0Var = z0.f12267a;
            int length = bArr.length;
            x0Var.getClass();
            if (x0.a(bArr, 0, length)) {
                list.set(i4, str2);
            }
            return str2;
        }
        C1638t c1638t = (C1638t) obj;
        Charset charset = K.f12151a;
        if (c1638t.j() == 0) {
            str = "";
        } else {
            str = new String(c1638t.f12246p, 0, c1638t.j(), charset);
        }
        int j4 = c1638t.j();
        byte[] bArr2 = c1638t.f12246p;
        z0.f12267a.getClass();
        if (x0.a(bArr2, 0, j4)) {
            list.set(i4, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1631p, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        g();
        Object remove = this.f12164p.remove(i4);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof C1638t)) {
            return new String((byte[]) remove, K.f12151a);
        }
        C1638t c1638t = (C1638t) remove;
        Charset charset = K.f12151a;
        if (c1638t.j() == 0) {
            return "";
        }
        return new String(c1638t.f12246p, 0, c1638t.j(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        g();
        Object obj2 = this.f12164p.set(i4, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C1638t)) {
            return new String((byte[]) obj2, K.f12151a);
        }
        C1638t c1638t = (C1638t) obj2;
        Charset charset = K.f12151a;
        if (c1638t.j() == 0) {
            return "";
        }
        return new String(c1638t.f12246p, 0, c1638t.j(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12164p.size();
    }
}
