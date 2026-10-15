package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.vt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1309vt extends Tt {

    /* renamed from: p, reason: collision with root package name */
    public Object f11090p;

    /* renamed from: q, reason: collision with root package name */
    public int f11091q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Iterator f11092r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Es f11093s;

    public C1309vt(Iterator it, Es es) {
        super(0);
        this.f11092r = it;
        this.f11093s = es;
        this.f11091q = 2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4 = this.f11091q;
        if (i4 == 4) {
            throw new IllegalStateException();
        }
        int i5 = i4 - 1;
        Object obj = null;
        if (i4 == 0) {
            throw null;
        }
        if (i5 == 0) {
            return true;
        }
        if (i5 != 2) {
            this.f11091q = 4;
            while (true) {
                Iterator it = this.f11092r;
                if (!it.hasNext()) {
                    this.f11091q = 3;
                    break;
                }
                Object next = it.next();
                if (this.f11093s.l(next)) {
                    obj = next;
                    break;
                }
            }
            this.f11090p = obj;
            if (this.f11091q != 3) {
                this.f11091q = 1;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Tt, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f11091q = 2;
        Object obj = this.f11090p;
        this.f11090p = null;
        return obj;
    }
}
