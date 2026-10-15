package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.oh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0997oh {

    /* renamed from: a, reason: collision with root package name */
    public final String f9846a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9847b;
    public final C0976o2[] c;
    public int d;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C0997oh(String str, C0976o2... c0976o2Arr) {
        this.f9846a = str;
        this.c = c0976o2Arr;
        int b4 = AbstractC0438bd.b(c0976o2Arr[0].f9813k);
        this.f9847b = b4 == -1 ? AbstractC0438bd.b(c0976o2Arr[0].f9812j) : b4;
        String str2 = c0976o2Arr[0].c;
        if (str2 != null) {
            str2.equals("und");
        }
        c0976o2Arr[0].getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0997oh.class == obj.getClass()) {
            C0997oh c0997oh = (C0997oh) obj;
            if (this.f9846a.equals(c0997oh.f9846a) && Arrays.equals(this.c, c0997oh.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.d;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = Arrays.hashCode(this.c) + ((this.f9846a.hashCode() + 527) * 31);
        this.d = hashCode;
        return hashCode;
    }
}
