package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ho {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5509a;

    /* renamed from: b, reason: collision with root package name */
    public B0.q f5510b = new B0.q();
    public boolean c;
    public boolean d;

    public Ho(Object obj) {
        this.f5509a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Ho.class != obj.getClass()) {
            return false;
        }
        return this.f5509a.equals(((Ho) obj).f5509a);
    }

    public final int hashCode() {
        return this.f5509a.hashCode();
    }
}
