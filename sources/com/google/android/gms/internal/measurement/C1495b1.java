package com.google.android.gms.internal.measurement;

import android.content.Context;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1495b1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11885a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1556o1 f11886b;

    public C1495b1(Context context, InterfaceC1556o1 interfaceC1556o1) {
        this.f11885a = context;
        this.f11886b = interfaceC1556o1;
    }

    public final boolean equals(Object obj) {
        InterfaceC1556o1 interfaceC1556o1;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1495b1) {
            C1495b1 c1495b1 = (C1495b1) obj;
            InterfaceC1556o1 interfaceC1556o12 = c1495b1.f11886b;
            if (this.f11885a.equals(c1495b1.f11885a) && ((interfaceC1556o1 = this.f11886b) != null ? interfaceC1556o1.equals(interfaceC1556o12) : interfaceC1556o12 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f11885a.hashCode() ^ 1000003) * 1000003;
        InterfaceC1556o1 interfaceC1556o1 = this.f11886b;
        return hashCode ^ (interfaceC1556o1 == null ? 0 : interfaceC1556o1.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + this.f11885a.toString() + ", hermeticFileOverrides=" + String.valueOf(this.f11886b) + "}";
    }
}
