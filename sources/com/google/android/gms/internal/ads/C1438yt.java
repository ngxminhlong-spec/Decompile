package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.yt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1438yt extends St implements ListIterator {
    @Override // com.google.android.gms.internal.ads.St
    public final Object a(Object obj) {
        return ((EnumC1279v5) obj).name();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f7020o).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f7020o).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return ((EnumC1279v5) ((ListIterator) this.f7020o).previous()).name();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f7020o).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
