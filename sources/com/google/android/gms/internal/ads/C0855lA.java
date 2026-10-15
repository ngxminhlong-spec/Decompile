package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.lA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0855lA extends Tt {

    /* renamed from: p, reason: collision with root package name */
    public final C0898mA f9379p;

    /* renamed from: q, reason: collision with root package name */
    public Tt f9380q;

    public C0855lA(C0941nA c0941nA) {
        super(1);
        this.f9379p = new C0898mA(c0941nA);
        this.f9380q = b();
    }

    @Override // com.google.android.gms.internal.ads.Tt
    public final byte a() {
        Tt tt = this.f9380q;
        if (tt == null) {
            throw new NoSuchElementException();
        }
        byte a4 = tt.a();
        if (!this.f9380q.hasNext()) {
            this.f9380q = b();
        }
        return a4;
    }

    public final C0673gz b() {
        C0898mA c0898mA = this.f9379p;
        if (c0898mA.hasNext()) {
            return new C0673gz(c0898mA.a());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9380q != null;
    }
}
