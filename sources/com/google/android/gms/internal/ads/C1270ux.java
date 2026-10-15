package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ux, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1270ux {

    /* renamed from: a, reason: collision with root package name */
    public final C0753iv f10956a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10957b;
    public final String c;
    public final String d;

    public /* synthetic */ C1270ux(C0753iv c0753iv, int i4, String str, String str2) {
        this.f10956a = c0753iv;
        this.f10957b = i4;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1270ux)) {
            return false;
        }
        C1270ux c1270ux = (C1270ux) obj;
        return this.f10956a == c1270ux.f10956a && this.f10957b == c1270ux.f10957b && this.c.equals(c1270ux.c) && this.d.equals(c1270ux.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10956a, Integer.valueOf(this.f10957b), this.c, this.d});
    }

    public final String toString() {
        return "(status=" + this.f10956a + ", keyId=" + this.f10957b + ", keyType='" + this.c + "', keyPrefix='" + this.d + "')";
    }
}
