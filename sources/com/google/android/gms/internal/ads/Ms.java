package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ms implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public final Iterator f6275o;

    /* renamed from: p, reason: collision with root package name */
    public Object f6276p;

    /* renamed from: q, reason: collision with root package name */
    public Collection f6277q = null;

    /* renamed from: r, reason: collision with root package name */
    public Iterator f6278r = EnumC1395xt.f11308o;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Ct f6279s;

    public Ms(Ct ct) {
        this.f6279s = ct;
        this.f6275o = ct.f4555r.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6275o.hasNext() || this.f6278r.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f6278r.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f6275o.next();
            this.f6276p = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f6277q = collection;
            this.f6278r = collection.iterator();
        }
        return this.f6278r.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f6278r.remove();
        Collection collection = this.f6277q;
        collection.getClass();
        if (collection.isEmpty()) {
            this.f6275o.remove();
        }
        Ct ct = this.f6279s;
        ct.f4556s--;
    }
}
