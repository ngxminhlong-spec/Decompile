package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Bw extends AbstractC1054pv {

    /* renamed from: a, reason: collision with root package name */
    public final Uw f4209a;

    public Bw(Uw uw) {
        this.f4209a = uw;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Bw)) {
            return false;
        }
        Uw uw = ((Bw) obj).f4209a;
        Uw uw2 = this.f4209a;
        Jy y = uw2.f7210b.y();
        C1142ry c1142ry = uw.f7210b;
        C1142ry c1142ry2 = uw.f7210b;
        return y.equals(c1142ry.y()) && uw2.f7210b.A().equals(c1142ry2.A()) && uw2.f7210b.z().equals(c1142ry2.z());
    }

    public final int hashCode() {
        Uw uw = this.f4209a;
        return Arrays.hashCode(new Object[]{uw.f7210b, uw.f7209a});
    }

    public final String toString() {
        Uw uw = this.f4209a;
        String A3 = uw.f7210b.A();
        int ordinal = uw.f7210b.y().ordinal();
        return "(typeUrl=" + A3 + ", outputPrefixType=" + (ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK") + ")";
    }
}
