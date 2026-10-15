package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1617i extends AbstractC1609e {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1619j f12210q;

    public C1617i(C1619j c1619j) {
        this.f12210q = c1619j;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i4) {
        C1619j c1619j = this.f12210q;
        AbstractC1895f.E(i4, c1619j.f12216s);
        Object[] objArr = c1619j.f12215r;
        int i5 = i4 + i4;
        Object obj = objArr[i5];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i5 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12210q.f12216s;
    }
}
