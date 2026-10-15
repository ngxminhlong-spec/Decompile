package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1362x2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11231a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11232b;

    public C1362x2(String str, String str2) {
        this.f11231a = str;
        this.f11232b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1362x2.class == obj.getClass()) {
            C1362x2 c1362x2 = (C1362x2) obj;
            if (TextUtils.equals(this.f11231a, c1362x2.f11231a) && TextUtils.equals(this.f11232b, c1362x2.f11232b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11232b.hashCode() + (this.f11231a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.f11231a);
        sb.append(",value=");
        return n0.a.j(sb, this.f11232b, "]");
    }
}
