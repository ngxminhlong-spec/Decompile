package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ht, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0710ht extends AbstractC0837kt {
    public static final AbstractC0837kt f(int i4) {
        return i4 < 0 ? AbstractC0837kt.f9330b : i4 > 0 ? AbstractC0837kt.c : AbstractC0837kt.f9329a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0837kt
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0837kt
    public final AbstractC0837kt b(int i4, int i5) {
        return f(i4 < i5 ? -1 : i4 > i5 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0837kt
    public final AbstractC0837kt c(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0837kt
    public final AbstractC0837kt d(boolean z4, boolean z5) {
        return f(z4 == z5 ? 0 : !z4 ? -1 : 1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0837kt
    public final AbstractC0837kt e() {
        return f(0);
    }
}
