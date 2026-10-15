package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Yw {

    /* renamed from: a, reason: collision with root package name */
    public final Class f7933a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f7934b;

    public /* synthetic */ Yw(Class cls, Class cls2) {
        this.f7933a = cls;
        this.f7934b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Yw)) {
            return false;
        }
        Yw yw = (Yw) obj;
        return yw.f7933a.equals(this.f7933a) && yw.f7934b.equals(this.f7934b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7933a, this.f7934b});
    }

    public final String toString() {
        return n0.a.i(this.f7933a.getSimpleName(), " with serialization type: ", this.f7934b.getSimpleName());
    }
}
