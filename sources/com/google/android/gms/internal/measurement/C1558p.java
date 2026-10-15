package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1558p implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11996o;

    /* renamed from: p, reason: collision with root package name */
    public int f11997p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1562q f11998q;

    public /* synthetic */ C1558p(C1562q c1562q, int i4) {
        this.f11996o = i4;
        this.f11998q = c1562q;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11996o) {
            case 0:
                return this.f11997p < this.f11998q.f12003o.length();
            default:
                return this.f11997p < this.f11998q.f12003o.length();
        }
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        switch (this.f11996o) {
            case 0:
                int i4 = this.f11997p;
                if (i4 >= this.f11998q.f12003o.length()) {
                    throw new NoSuchElementException();
                }
                this.f11997p = i4 + 1;
                return new C1562q(String.valueOf(i4));
            default:
                int i5 = this.f11997p;
                C1562q c1562q = this.f11998q;
                if (i5 >= c1562q.f12003o.length()) {
                    throw new NoSuchElementException();
                }
                String str = c1562q.f12003o;
                this.f11997p = i5 + 1;
                return new C1562q(String.valueOf(str.charAt(i5)));
        }
    }
}
