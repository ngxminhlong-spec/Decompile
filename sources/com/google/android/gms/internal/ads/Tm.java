package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Tm {

    /* renamed from: a, reason: collision with root package name */
    public final String f7075a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7076b;
    public int c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f7077e;

    public Tm(String str, String str2, int i4, long j4, Integer num) {
        this.f7075a = str;
        this.f7076b = str2;
        this.c = i4;
        this.d = j4;
        this.f7077e = num;
    }

    public final String toString() {
        Integer num;
        String str = this.f7075a + "." + this.c + "." + this.d;
        String str2 = this.f7076b;
        if (!TextUtils.isEmpty(str2)) {
            str = n0.a.i(str, ".", str2);
        }
        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.f10269p1)).booleanValue() || (num = this.f7077e) == null || TextUtils.isEmpty(str2)) {
            return str;
        }
        return str + "." + num;
    }
}
