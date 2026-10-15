package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.play_billing.C1638t;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1583v1 implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12097o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f12098p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final int f12099q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f12100r;

    public C1583v1(C1591x1 c1591x1) {
        this.f12100r = c1591x1;
        this.f12099q = c1591x1.j();
    }

    public C1583v1(C1638t c1638t) {
        this.f12100r = c1638t;
        this.f12099q = c1638t.j();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12097o) {
            case 0:
                return this.f12098p < this.f12099q;
            default:
                return this.f12098p < this.f12099q;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f12097o) {
            case 0:
                int i4 = this.f12098p;
                if (i4 >= this.f12099q) {
                    throw new NoSuchElementException();
                }
                this.f12098p = i4 + 1;
                return Byte.valueOf(((C1591x1) this.f12100r).i(i4));
            default:
                int i5 = this.f12098p;
                if (i5 >= this.f12099q) {
                    throw new NoSuchElementException();
                }
                this.f12098p = i5 + 1;
                return Byte.valueOf(((C1638t) this.f12100r).i(i5));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12097o) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
