package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Xw {

    /* renamed from: a, reason: collision with root package name */
    public final Class f7717a;

    /* renamed from: b, reason: collision with root package name */
    public final Zy f7718b;

    public /* synthetic */ Xw(Class cls, Zy zy) {
        this.f7717a = cls;
        this.f7718b = zy;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Xw)) {
            return false;
        }
        Xw xw = (Xw) obj;
        return xw.f7717a.equals(this.f7717a) && xw.f7718b.equals(this.f7718b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7717a, this.f7718b});
    }

    public final String toString() {
        return n0.a.i(this.f7717a.getSimpleName(), ", object identifier: ", String.valueOf(this.f7718b));
    }
}
