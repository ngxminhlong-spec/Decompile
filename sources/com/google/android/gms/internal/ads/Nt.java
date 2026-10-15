package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Nt extends Ft implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public final Ft f6407o;

    public Nt(Ft ft) {
        this.f6407o = ft;
    }

    @Override // com.google.android.gms.internal.ads.Ft
    public final Ft a() {
        return this.f6407o;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f6407o.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Nt) {
            return this.f6407o.equals(((Nt) obj).f6407o);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f6407o.hashCode();
    }

    public final String toString() {
        return this.f6407o.toString().concat(".reverse()");
    }
}
