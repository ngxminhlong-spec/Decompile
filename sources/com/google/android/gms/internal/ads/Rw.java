package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Rw {

    /* renamed from: a, reason: collision with root package name */
    public final Class f6868a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f6869b;

    public /* synthetic */ Rw(Class cls, Class cls2) {
        this.f6868a = cls;
        this.f6869b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Rw)) {
            return false;
        }
        Rw rw = (Rw) obj;
        return rw.f6868a.equals(this.f6868a) && rw.f6869b.equals(this.f6869b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6868a, this.f6869b});
    }

    public final String toString() {
        return n0.a.i(this.f6868a.getSimpleName(), " with primitive type: ", this.f6869b.getSimpleName());
    }
}
