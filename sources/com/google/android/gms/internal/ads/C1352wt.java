package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.wt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1352wt extends Tt {

    /* renamed from: p, reason: collision with root package name */
    public boolean f11217p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f11218q;

    public C1352wt(Object obj) {
        super(0);
        this.f11218q = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f11217p;
    }

    @Override // com.google.android.gms.internal.ads.Tt, java.util.Iterator
    public final Object next() {
        if (this.f11217p) {
            throw new NoSuchElementException();
        }
        this.f11217p = true;
        return this.f11218q;
    }
}
