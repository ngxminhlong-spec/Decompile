package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1562q implements Iterable, InterfaceC1550n {

    /* renamed from: o, reason: collision with root package name */
    public final String f12003o;

    public C1562q(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f12003o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1562q) {
            return this.f12003o.equals(((C1562q) obj).f12003o);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Double f() {
        String str = this.f12003o;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final String g() {
        return this.f12003o;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Boolean h() {
        return Boolean.valueOf(!this.f12003o.isEmpty());
    }

    public final int hashCode() {
        return this.f12003o.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final InterfaceC1550n i() {
        return new C1562q(this.f12003o);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1558p(this, 1);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    public final Iterator l() {
        return new C1558p(this, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02cb, code lost:
    
        if (r4[r1].isEmpty() == false) goto L104;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00b8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1550n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC1550n n(java.lang.String r28, u0.g r29, java.util.ArrayList r30) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1562q.n(java.lang.String, u0.g, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    public final String toString() {
        return U.a.k("\"", this.f12003o, "\"");
    }
}
