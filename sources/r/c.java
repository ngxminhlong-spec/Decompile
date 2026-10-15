package r;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* renamed from: o, reason: collision with root package name */
    public int f14722o;

    /* renamed from: p, reason: collision with root package name */
    public int f14723p = -1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14724q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f14725r;

    public c(e eVar) {
        this.f14725r = eVar;
        this.f14722o = eVar.f14741q - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f14724q) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i4 = this.f14723p;
        e eVar = this.f14725r;
        return S3.e.a(key, eVar.f(i4)) && S3.e.a(entry.getValue(), eVar.i(this.f14723p));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f14724q) {
            return this.f14725r.f(this.f14723p);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f14724q) {
            return this.f14725r.i(this.f14723p);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14723p < this.f14722o;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f14724q) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i4 = this.f14723p;
        e eVar = this.f14725r;
        Object f4 = eVar.f(i4);
        Object i5 = eVar.i(this.f14723p);
        return (f4 == null ? 0 : f4.hashCode()) ^ (i5 != null ? i5.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f14723p++;
        this.f14724q = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f14724q) {
            throw new IllegalStateException();
        }
        this.f14725r.g(this.f14723p);
        this.f14723p--;
        this.f14722o--;
        this.f14724q = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f14724q) {
            return this.f14725r.h(this.f14723p, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
