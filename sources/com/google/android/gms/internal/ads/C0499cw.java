package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.cw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0499cw extends Av {

    /* renamed from: a, reason: collision with root package name */
    public final String f8429a;

    public C0499cw(String str) {
        this.f8429a = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1054pv
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0499cw) {
            return ((C0499cw) obj).f8429a.equals(this.f8429a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C0499cw.class, this.f8429a});
    }

    public final String toString() {
        return n0.a.j(new StringBuilder("LegacyKmsAead Parameters (keyUri: "), this.f8429a, ")");
    }
}
