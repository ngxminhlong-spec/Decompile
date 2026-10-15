package O1;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.AbstractC1230u;
import d3.AbstractC1654b;
import i2.AbstractC1717a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class U0 extends AbstractC1717a {
    public static final Parcelable.Creator<U0> CREATOR = new C0066h0(7);

    /* renamed from: A, reason: collision with root package name */
    public final Bundle f1293A;

    /* renamed from: B, reason: collision with root package name */
    public final Bundle f1294B;

    /* renamed from: C, reason: collision with root package name */
    public final List f1295C;

    /* renamed from: D, reason: collision with root package name */
    public final String f1296D;

    /* renamed from: E, reason: collision with root package name */
    public final String f1297E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f1298F;

    /* renamed from: G, reason: collision with root package name */
    public final N f1299G;

    /* renamed from: H, reason: collision with root package name */
    public final int f1300H;

    /* renamed from: I, reason: collision with root package name */
    public final String f1301I;

    /* renamed from: J, reason: collision with root package name */
    public final List f1302J;

    /* renamed from: K, reason: collision with root package name */
    public final int f1303K;

    /* renamed from: L, reason: collision with root package name */
    public final String f1304L;

    /* renamed from: M, reason: collision with root package name */
    public final int f1305M;

    /* renamed from: o, reason: collision with root package name */
    public final int f1306o;

    /* renamed from: p, reason: collision with root package name */
    public final long f1307p;

    /* renamed from: q, reason: collision with root package name */
    public final Bundle f1308q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1309r;

    /* renamed from: s, reason: collision with root package name */
    public final List f1310s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1311t;

    /* renamed from: u, reason: collision with root package name */
    public final int f1312u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f1313v;

    /* renamed from: w, reason: collision with root package name */
    public final String f1314w;

    /* renamed from: x, reason: collision with root package name */
    public final Q0 f1315x;
    public final Location y;

    /* renamed from: z, reason: collision with root package name */
    public final String f1316z;

    public U0(int i4, long j4, Bundle bundle, int i5, List list, boolean z4, int i6, boolean z5, String str, Q0 q02, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z6, N n4, int i7, String str5, List list3, int i8, String str6, int i9) {
        this.f1306o = i4;
        this.f1307p = j4;
        this.f1308q = bundle == null ? new Bundle() : bundle;
        this.f1309r = i5;
        this.f1310s = list;
        this.f1311t = z4;
        this.f1312u = i6;
        this.f1313v = z5;
        this.f1314w = str;
        this.f1315x = q02;
        this.y = location;
        this.f1316z = str2;
        this.f1293A = bundle2 == null ? new Bundle() : bundle2;
        this.f1294B = bundle3;
        this.f1295C = list2;
        this.f1296D = str3;
        this.f1297E = str4;
        this.f1298F = z6;
        this.f1299G = n4;
        this.f1300H = i7;
        this.f1301I = str5;
        this.f1302J = list3 == null ? new ArrayList() : list3;
        this.f1303K = i8;
        this.f1304L = str6;
        this.f1305M = i9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof U0)) {
            return false;
        }
        U0 u02 = (U0) obj;
        return this.f1306o == u02.f1306o && this.f1307p == u02.f1307p && AbstractC1230u.n(this.f1308q, u02.f1308q) && this.f1309r == u02.f1309r && h2.y.m(this.f1310s, u02.f1310s) && this.f1311t == u02.f1311t && this.f1312u == u02.f1312u && this.f1313v == u02.f1313v && h2.y.m(this.f1314w, u02.f1314w) && h2.y.m(this.f1315x, u02.f1315x) && h2.y.m(this.y, u02.y) && h2.y.m(this.f1316z, u02.f1316z) && AbstractC1230u.n(this.f1293A, u02.f1293A) && AbstractC1230u.n(this.f1294B, u02.f1294B) && h2.y.m(this.f1295C, u02.f1295C) && h2.y.m(this.f1296D, u02.f1296D) && h2.y.m(this.f1297E, u02.f1297E) && this.f1298F == u02.f1298F && this.f1300H == u02.f1300H && h2.y.m(this.f1301I, u02.f1301I) && h2.y.m(this.f1302J, u02.f1302J) && this.f1303K == u02.f1303K && h2.y.m(this.f1304L, u02.f1304L) && this.f1305M == u02.f1305M;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1306o), Long.valueOf(this.f1307p), this.f1308q, Integer.valueOf(this.f1309r), this.f1310s, Boolean.valueOf(this.f1311t), Integer.valueOf(this.f1312u), Boolean.valueOf(this.f1313v), this.f1314w, this.f1315x, this.y, this.f1316z, this.f1293A, this.f1294B, this.f1295C, this.f1296D, this.f1297E, Boolean.valueOf(this.f1298F), Integer.valueOf(this.f1300H), this.f1301I, this.f1302J, Integer.valueOf(this.f1303K), this.f1304L, Integer.valueOf(this.f1305M)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f1306o);
        AbstractC1654b.f0(parcel, 2, 8);
        parcel.writeLong(this.f1307p);
        AbstractC1654b.R(parcel, 3, this.f1308q);
        AbstractC1654b.f0(parcel, 4, 4);
        parcel.writeInt(this.f1309r);
        AbstractC1654b.X(parcel, 5, this.f1310s);
        AbstractC1654b.f0(parcel, 6, 4);
        parcel.writeInt(this.f1311t ? 1 : 0);
        AbstractC1654b.f0(parcel, 7, 4);
        parcel.writeInt(this.f1312u);
        AbstractC1654b.f0(parcel, 8, 4);
        parcel.writeInt(this.f1313v ? 1 : 0);
        AbstractC1654b.V(parcel, 9, this.f1314w);
        AbstractC1654b.U(parcel, 10, this.f1315x, i4);
        AbstractC1654b.U(parcel, 11, this.y, i4);
        AbstractC1654b.V(parcel, 12, this.f1316z);
        AbstractC1654b.R(parcel, 13, this.f1293A);
        AbstractC1654b.R(parcel, 14, this.f1294B);
        AbstractC1654b.X(parcel, 15, this.f1295C);
        AbstractC1654b.V(parcel, 16, this.f1296D);
        AbstractC1654b.V(parcel, 17, this.f1297E);
        AbstractC1654b.f0(parcel, 18, 4);
        parcel.writeInt(this.f1298F ? 1 : 0);
        AbstractC1654b.U(parcel, 19, this.f1299G, i4);
        AbstractC1654b.f0(parcel, 20, 4);
        parcel.writeInt(this.f1300H);
        AbstractC1654b.V(parcel, 21, this.f1301I);
        AbstractC1654b.X(parcel, 22, this.f1302J);
        AbstractC1654b.f0(parcel, 23, 4);
        parcel.writeInt(this.f1303K);
        AbstractC1654b.V(parcel, 24, this.f1304L);
        AbstractC1654b.f0(parcel, 25, 4);
        parcel.writeInt(this.f1305M);
        AbstractC1654b.e0(parcel, a02);
    }
}
