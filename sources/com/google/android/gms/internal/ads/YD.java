package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class YD {

    /* renamed from: a, reason: collision with root package name */
    public final String f7797a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7798b;
    public final boolean c;

    public YD(String str, boolean z4, boolean z5) {
        this.f7797a = str;
        this.f7798b = z4;
        this.c = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != YD.class) {
            return false;
        }
        YD yd = (YD) obj;
        return TextUtils.equals(this.f7797a, yd.f7797a) && this.f7798b == yd.f7798b && this.c == yd.c;
    }

    public final int hashCode() {
        return ((((this.f7797a.hashCode() + 31) * 31) + (true != this.f7798b ? 1237 : 1231)) * 31) + (true != this.c ? 1237 : 1231);
    }
}
