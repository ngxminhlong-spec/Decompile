package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1113rB implements Iterator, Closeable {

    /* renamed from: u, reason: collision with root package name */
    public static final Y2 f10459u = new Y2("eof ", 1);

    /* renamed from: o, reason: collision with root package name */
    public T2 f10460o;

    /* renamed from: p, reason: collision with root package name */
    public C0737id f10461p;

    /* renamed from: q, reason: collision with root package name */
    public V2 f10462q = null;

    /* renamed from: r, reason: collision with root package name */
    public long f10463r = 0;

    /* renamed from: s, reason: collision with root package name */
    public long f10464s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f10465t = new ArrayList();

    static {
        AbstractC0587ez.k(AbstractC1113rB.class);
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final V2 next() {
        V2 a4;
        V2 v22 = this.f10462q;
        if (v22 != null && v22 != f10459u) {
            this.f10462q = null;
            return v22;
        }
        C0737id c0737id = this.f10461p;
        if (c0737id == null || this.f10463r >= this.f10464s) {
            this.f10462q = f10459u;
            throw new NoSuchElementException();
        }
        try {
            synchronized (c0737id) {
                this.f10461p.f9044o.position((int) this.f10463r);
                a4 = ((S2) this.f10460o).a(this.f10461p, this);
                this.f10463r = this.f10461p.b();
            }
            return a4;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public void close() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        V2 v22 = this.f10462q;
        Y2 y22 = f10459u;
        if (v22 == y22) {
            return false;
        }
        if (v22 != null) {
            return true;
        }
        try {
            this.f10462q = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f10462q = y22;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f10465t;
            if (i4 >= arrayList.size()) {
                sb.append("]");
                return sb.toString();
            }
            if (i4 > 0) {
                sb.append(";");
            }
            sb.append(((V2) arrayList.get(i4)).toString());
            i4++;
        }
    }
}
