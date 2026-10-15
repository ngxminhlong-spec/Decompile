package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Fs implements Serializable, Es {

    /* renamed from: o, reason: collision with root package name */
    public final List f5100o;

    public final boolean equals(Object obj) {
        if (obj instanceof Fs) {
            return this.f5100o.equals(((Fs) obj).f5100o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5100o.hashCode() + 306654252;
    }

    @Override // com.google.android.gms.internal.ads.Es
    public final boolean l(Object obj) {
        int i4 = 0;
        while (true) {
            List list = this.f5100o;
            if (i4 >= list.size()) {
                return true;
            }
            if (!((Es) list.get(i4)).l(obj)) {
                return false;
            }
            i4++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z4 = true;
        for (Object obj : this.f5100o) {
            if (!z4) {
                sb.append(',');
            }
            sb.append(obj);
            z4 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
