package x2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import d3.AbstractC1654b;
import i2.AbstractC1717a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d1 extends AbstractC1717a {
    public static final Parcelable.Creator<d1> CREATOR = new C2067d(4);

    /* renamed from: A, reason: collision with root package name */
    public final long f15591A;

    /* renamed from: B, reason: collision with root package name */
    public final int f15592B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f15593C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f15594D;

    /* renamed from: E, reason: collision with root package name */
    public final String f15595E;

    /* renamed from: F, reason: collision with root package name */
    public final Boolean f15596F;

    /* renamed from: G, reason: collision with root package name */
    public final long f15597G;

    /* renamed from: H, reason: collision with root package name */
    public final List f15598H;

    /* renamed from: I, reason: collision with root package name */
    public final String f15599I;

    /* renamed from: J, reason: collision with root package name */
    public final String f15600J;

    /* renamed from: K, reason: collision with root package name */
    public final String f15601K;

    /* renamed from: L, reason: collision with root package name */
    public final String f15602L;

    /* renamed from: o, reason: collision with root package name */
    public final String f15603o;

    /* renamed from: p, reason: collision with root package name */
    public final String f15604p;

    /* renamed from: q, reason: collision with root package name */
    public final String f15605q;

    /* renamed from: r, reason: collision with root package name */
    public final String f15606r;

    /* renamed from: s, reason: collision with root package name */
    public final long f15607s;

    /* renamed from: t, reason: collision with root package name */
    public final long f15608t;

    /* renamed from: u, reason: collision with root package name */
    public final String f15609u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f15610v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f15611w;

    /* renamed from: x, reason: collision with root package name */
    public final long f15612x;
    public final String y;

    /* renamed from: z, reason: collision with root package name */
    public final long f15613z;

    public d1(String str, String str2, String str3, long j4, String str4, long j5, long j6, String str5, boolean z4, boolean z5, String str6, long j7, int i4, boolean z6, boolean z7, String str7, Boolean bool, long j8, List list, String str8, String str9, String str10) {
        h2.y.e(str);
        this.f15603o = str;
        this.f15604p = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f15605q = str3;
        this.f15612x = j4;
        this.f15606r = str4;
        this.f15607s = j5;
        this.f15608t = j6;
        this.f15609u = str5;
        this.f15610v = z4;
        this.f15611w = z5;
        this.y = str6;
        this.f15613z = 0L;
        this.f15591A = j7;
        this.f15592B = i4;
        this.f15593C = z6;
        this.f15594D = z7;
        this.f15595E = str7;
        this.f15596F = bool;
        this.f15597G = j8;
        this.f15598H = list;
        this.f15599I = null;
        this.f15600J = str8;
        this.f15601K = str9;
        this.f15602L = str10;
    }

    public d1(String str, String str2, String str3, String str4, long j4, long j5, String str5, boolean z4, boolean z5, long j6, String str6, long j7, long j8, int i4, boolean z6, boolean z7, String str7, Boolean bool, long j9, ArrayList arrayList, String str8, String str9, String str10, String str11) {
        this.f15603o = str;
        this.f15604p = str2;
        this.f15605q = str3;
        this.f15612x = j6;
        this.f15606r = str4;
        this.f15607s = j4;
        this.f15608t = j5;
        this.f15609u = str5;
        this.f15610v = z4;
        this.f15611w = z5;
        this.y = str6;
        this.f15613z = j7;
        this.f15591A = j8;
        this.f15592B = i4;
        this.f15593C = z6;
        this.f15594D = z7;
        this.f15595E = str7;
        this.f15596F = bool;
        this.f15597G = j9;
        this.f15598H = arrayList;
        this.f15599I = str8;
        this.f15600J = str9;
        this.f15601K = str10;
        this.f15602L = str11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.V(parcel, 2, this.f15603o);
        AbstractC1654b.V(parcel, 3, this.f15604p);
        AbstractC1654b.V(parcel, 4, this.f15605q);
        AbstractC1654b.V(parcel, 5, this.f15606r);
        AbstractC1654b.f0(parcel, 6, 8);
        parcel.writeLong(this.f15607s);
        AbstractC1654b.f0(parcel, 7, 8);
        parcel.writeLong(this.f15608t);
        AbstractC1654b.V(parcel, 8, this.f15609u);
        AbstractC1654b.f0(parcel, 9, 4);
        parcel.writeInt(this.f15610v ? 1 : 0);
        AbstractC1654b.f0(parcel, 10, 4);
        parcel.writeInt(this.f15611w ? 1 : 0);
        AbstractC1654b.f0(parcel, 11, 8);
        parcel.writeLong(this.f15612x);
        AbstractC1654b.V(parcel, 12, this.y);
        AbstractC1654b.f0(parcel, 13, 8);
        parcel.writeLong(this.f15613z);
        AbstractC1654b.f0(parcel, 14, 8);
        parcel.writeLong(this.f15591A);
        AbstractC1654b.f0(parcel, 15, 4);
        parcel.writeInt(this.f15592B);
        AbstractC1654b.f0(parcel, 16, 4);
        parcel.writeInt(this.f15593C ? 1 : 0);
        AbstractC1654b.f0(parcel, 18, 4);
        parcel.writeInt(this.f15594D ? 1 : 0);
        AbstractC1654b.V(parcel, 19, this.f15595E);
        Boolean bool = this.f15596F;
        if (bool != null) {
            AbstractC1654b.f0(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        AbstractC1654b.f0(parcel, 22, 8);
        parcel.writeLong(this.f15597G);
        AbstractC1654b.X(parcel, 23, this.f15598H);
        AbstractC1654b.V(parcel, 24, this.f15599I);
        AbstractC1654b.V(parcel, 25, this.f15600J);
        AbstractC1654b.V(parcel, 26, this.f15601K);
        AbstractC1654b.V(parcel, 27, this.f15602L);
        AbstractC1654b.e0(parcel, a02);
    }
}
