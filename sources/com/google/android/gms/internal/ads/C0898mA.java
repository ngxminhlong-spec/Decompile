package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.measurement.C1562q;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.mA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0898mA implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9571o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final Object f9572p;

    /* renamed from: q, reason: collision with root package name */
    public Object f9573q;

    public C0898mA(AbstractC0886lz abstractC0886lz) {
        if (!(abstractC0886lz instanceof C0941nA)) {
            this.f9572p = null;
            this.f9573q = (C0800jz) abstractC0886lz;
            return;
        }
        C0941nA c0941nA = (C0941nA) abstractC0886lz;
        ArrayDeque arrayDeque = new ArrayDeque(c0941nA.f9723u);
        this.f9572p = arrayDeque;
        arrayDeque.push(c0941nA);
        AbstractC0886lz abstractC0886lz2 = c0941nA.f9720r;
        while (abstractC0886lz2 instanceof C0941nA) {
            C0941nA c0941nA2 = (C0941nA) abstractC0886lz2;
            ((ArrayDeque) this.f9572p).push(c0941nA2);
            abstractC0886lz2 = c0941nA2.f9720r;
        }
        this.f9573q = (C0800jz) abstractC0886lz2;
    }

    public C0898mA(Iterator it, Iterator it2) {
        this.f9572p = it;
        this.f9573q = it2;
    }

    public C0800jz a() {
        C0800jz c0800jz;
        ArrayDeque arrayDeque = (ArrayDeque) this.f9572p;
        C0800jz c0800jz2 = (C0800jz) this.f9573q;
        if (c0800jz2 == null) {
            throw new NoSuchElementException();
        }
        do {
            c0800jz = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            AbstractC0886lz abstractC0886lz = ((C0941nA) arrayDeque.pop()).f9721s;
            while (abstractC0886lz instanceof C0941nA) {
                C0941nA c0941nA = (C0941nA) abstractC0886lz;
                arrayDeque.push(c0941nA);
                abstractC0886lz = c0941nA.f9720r;
            }
            c0800jz = (C0800jz) abstractC0886lz;
        } while (c0800jz.l() == 0);
        this.f9573q = c0800jz;
        return c0800jz2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9571o) {
            case 0:
                return ((C0800jz) this.f9573q) != null;
            default:
                if (((Iterator) this.f9572p).hasNext()) {
                    return true;
                }
                return ((Iterator) this.f9573q).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        switch (this.f9571o) {
            case 0:
                return a();
            default:
                Iterator it = (Iterator) this.f9573q;
                Iterator it2 = (Iterator) this.f9572p;
                if (it2.hasNext()) {
                    return new C1562q(((Integer) it2.next()).toString());
                }
                if (it.hasNext()) {
                    return new C1562q((String) it.next());
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
