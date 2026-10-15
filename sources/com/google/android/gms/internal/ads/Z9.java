package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Z9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7969a;

    /* renamed from: b, reason: collision with root package name */
    public final C1068q8 f7970b;
    public final Q7 c;
    public final C0265Eb d;

    /* renamed from: e, reason: collision with root package name */
    public final D5 f7971e;

    static {
        C1052pt c1052pt = AbstractC1137rt.f10543p;
        Gt gt = Gt.f5344s;
        List list = Collections.EMPTY_LIST;
        Gt gt2 = Gt.f5344s;
        W8 w8 = W8.f7349a;
        C0265Eb c0265Eb = C0265Eb.y;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ Z9(String str, D5 d5, C1068q8 c1068q8, Q7 q7, C0265Eb c0265Eb) {
        W8 w8 = W8.f7349a;
        this.f7969a = str;
        this.f7970b = c1068q8;
        this.c = q7;
        this.d = c0265Eb;
        this.f7971e = d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z9)) {
            return false;
        }
        Z9 z9 = (Z9) obj;
        String str = z9.f7969a;
        int i4 = AbstractC0751is.f9071a;
        if (!this.f7969a.equals(str) || !this.f7971e.equals(z9.f7971e) || !AbstractC0751is.c(this.f7970b, z9.f7970b) || !this.c.equals(z9.c) || !AbstractC0751is.c(this.d, z9.d)) {
            return false;
        }
        W8 w8 = W8.f7349a;
        return w8.equals(w8);
    }

    public final int hashCode() {
        int hashCode = this.f7969a.hashCode() * 31;
        C1068q8 c1068q8 = this.f7970b;
        return (this.d.hashCode() + ((this.f7971e.hashCode() + ((this.c.hashCode() + ((hashCode + (c1068q8 != null ? c1068q8.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
    }
}
