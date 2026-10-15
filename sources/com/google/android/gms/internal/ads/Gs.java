package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Gs extends Cs {

    /* renamed from: o, reason: collision with root package name */
    public final Object f5343o;

    public Gs(Object obj) {
        this.f5343o = obj;
    }

    @Override // com.google.android.gms.internal.ads.Cs
    public final Cs a(As as) {
        Object apply = as.apply(this.f5343o);
        Bs.S(apply, "the Function passed to Optional.transform() must not return null.");
        return new Gs(apply);
    }

    @Override // com.google.android.gms.internal.ads.Cs
    public final Object b() {
        return this.f5343o;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Gs) {
            return this.f5343o.equals(((Gs) obj).f5343o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5343o.hashCode() + 1502476572;
    }

    public final String toString() {
        return U.a.k("Optional.of(", this.f5343o.toString(), ")");
    }
}
