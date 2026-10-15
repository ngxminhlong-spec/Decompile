package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class OC {

    /* renamed from: a, reason: collision with root package name */
    public final long f6443a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0484ch f6444b;
    public final int c;
    public final C1202tE d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6445e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0484ch f6446f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6447g;

    /* renamed from: h, reason: collision with root package name */
    public final C1202tE f6448h;

    /* renamed from: i, reason: collision with root package name */
    public final long f6449i;

    /* renamed from: j, reason: collision with root package name */
    public final long f6450j;

    public OC(long j4, AbstractC0484ch abstractC0484ch, int i4, C1202tE c1202tE, long j5, AbstractC0484ch abstractC0484ch2, int i5, C1202tE c1202tE2, long j6, long j7) {
        this.f6443a = j4;
        this.f6444b = abstractC0484ch;
        this.c = i4;
        this.d = c1202tE;
        this.f6445e = j5;
        this.f6446f = abstractC0484ch2;
        this.f6447g = i5;
        this.f6448h = c1202tE2;
        this.f6449i = j6;
        this.f6450j = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && OC.class == obj.getClass()) {
            OC oc = (OC) obj;
            if (this.f6443a == oc.f6443a && this.c == oc.c && this.f6445e == oc.f6445e && this.f6447g == oc.f6447g && this.f6449i == oc.f6449i && this.f6450j == oc.f6450j && Bs.r(this.f6444b, oc.f6444b) && Bs.r(this.d, oc.d) && Bs.r(this.f6446f, oc.f6446f) && Bs.r(this.f6448h, oc.f6448h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f6443a), this.f6444b, Integer.valueOf(this.c), this.d, Long.valueOf(this.f6445e), this.f6446f, Integer.valueOf(this.f6447g), this.f6448h, Long.valueOf(this.f6449i), Long.valueOf(this.f6450j)});
    }
}
