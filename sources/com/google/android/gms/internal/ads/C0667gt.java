package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.gt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0667gt extends Ft implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public final Comparator f8880o;

    public C0667gt(Comparator comparator) {
        this.f8880o = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f8880o.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0667gt) {
            return this.f8880o.equals(((C0667gt) obj).f8880o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8880o.hashCode();
    }

    public final String toString() {
        return this.f8880o.toString();
    }
}
