package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class WB {

    /* renamed from: a, reason: collision with root package name */
    public final String f7350a;

    /* renamed from: b, reason: collision with root package name */
    public final C0976o2 f7351b;
    public final C0976o2 c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7352e;

    public WB(String str, C0976o2 c0976o2, C0976o2 c0976o22, int i4, int i5) {
        boolean z4 = true;
        if (i4 != 0) {
            if (i5 == 0) {
                i5 = 0;
            } else {
                z4 = false;
            }
        }
        Zf.O(z4);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f7350a = str;
        this.f7351b = c0976o2;
        c0976o22.getClass();
        this.c = c0976o22;
        this.d = i4;
        this.f7352e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && WB.class == obj.getClass()) {
            WB wb = (WB) obj;
            if (this.d == wb.d && this.f7352e == wb.f7352e && this.f7350a.equals(wb.f7350a) && this.f7351b.equals(wb.f7351b) && this.c.equals(wb.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.f7351b.hashCode() + ((this.f7350a.hashCode() + ((((this.d + 527) * 31) + this.f7352e) * 31)) * 31)) * 31);
    }
}
