package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Rg {

    /* renamed from: n, reason: collision with root package name */
    public static final Object f6814n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public static final Z9 f6815o;

    /* renamed from: a, reason: collision with root package name */
    public Object f6816a = f6814n;

    /* renamed from: b, reason: collision with root package name */
    public Z9 f6817b = f6815o;
    public long c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f6818e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6819f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6820g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6821h;

    /* renamed from: i, reason: collision with root package name */
    public Q7 f6822i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6823j;

    /* renamed from: k, reason: collision with root package name */
    public long f6824k;

    /* renamed from: l, reason: collision with root package name */
    public int f6825l;

    /* renamed from: m, reason: collision with root package name */
    public int f6826m;

    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.D5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.gms.internal.ads.Q7, java.lang.Object] */
    static {
        C1052pt c1052pt = AbstractC1137rt.f10543p;
        Gt gt = Gt.f5344s;
        List list = Collections.EMPTY_LIST;
        Gt gt2 = Gt.f5344s;
        W8 w8 = W8.f7349a;
        Uri uri = Uri.EMPTY;
        f6815o = new Z9("androidx.media3.common.Timeline", new Object(), uri != null ? new C1068q8(uri, gt2) : null, new Object(), C0265Eb.y);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final void a(Z9 z9, boolean z4, boolean z5, Q7 q7, long j4) {
        this.f6816a = f6814n;
        if (z9 == null) {
            z9 = f6815o;
        }
        this.f6817b = z9;
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.f6818e = -9223372036854775807L;
        this.f6819f = z4;
        this.f6820g = z5;
        this.f6821h = q7 != null;
        this.f6822i = q7;
        this.f6824k = j4;
        this.f6825l = 0;
        this.f6826m = 0;
        this.f6823j = false;
    }

    public final boolean b() {
        Zf.X(this.f6821h == (this.f6822i != null));
        return this.f6822i != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Rg.class.equals(obj.getClass())) {
            return false;
        }
        Rg rg = (Rg) obj;
        return AbstractC0751is.c(this.f6816a, rg.f6816a) && AbstractC0751is.c(this.f6817b, rg.f6817b) && AbstractC0751is.c(this.f6822i, rg.f6822i) && this.c == rg.c && this.d == rg.d && this.f6818e == rg.f6818e && this.f6819f == rg.f6819f && this.f6820g == rg.f6820g && this.f6823j == rg.f6823j && this.f6824k == rg.f6824k && this.f6825l == rg.f6825l && this.f6826m == rg.f6826m;
    }

    public final int hashCode() {
        int hashCode = ((this.f6816a.hashCode() + 217) * 31) + this.f6817b.hashCode();
        Q7 q7 = this.f6822i;
        int hashCode2 = ((hashCode * 961) + (q7 == null ? 0 : q7.hashCode())) * 31;
        long j4 = this.c;
        int i4 = (hashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.d;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f6818e;
        int i6 = ((((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.f6819f ? 1 : 0)) * 31) + (this.f6820g ? 1 : 0)) * 31) + (this.f6823j ? 1 : 0);
        long j7 = this.f6824k;
        return ((((((i6 * 961) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.f6825l) * 31) + this.f6826m) * 31;
    }
}
