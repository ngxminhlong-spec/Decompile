package x2;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2065c extends AbstractC1717a {
    public static final Parcelable.Creator<C2065c> CREATOR = new C2067d(0);

    /* renamed from: o, reason: collision with root package name */
    public String f15544o;

    /* renamed from: p, reason: collision with root package name */
    public String f15545p;

    /* renamed from: q, reason: collision with root package name */
    public Y0 f15546q;

    /* renamed from: r, reason: collision with root package name */
    public long f15547r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15548s;

    /* renamed from: t, reason: collision with root package name */
    public String f15549t;

    /* renamed from: u, reason: collision with root package name */
    public final C2096s f15550u;

    /* renamed from: v, reason: collision with root package name */
    public long f15551v;

    /* renamed from: w, reason: collision with root package name */
    public C2096s f15552w;

    /* renamed from: x, reason: collision with root package name */
    public final long f15553x;
    public final C2096s y;

    public C2065c(String str, String str2, Y0 y02, long j4, boolean z4, String str3, C2096s c2096s, long j5, C2096s c2096s2, long j6, C2096s c2096s3) {
        this.f15544o = str;
        this.f15545p = str2;
        this.f15546q = y02;
        this.f15547r = j4;
        this.f15548s = z4;
        this.f15549t = str3;
        this.f15550u = c2096s;
        this.f15551v = j5;
        this.f15552w = c2096s2;
        this.f15553x = j6;
        this.y = c2096s3;
    }

    public C2065c(C2065c c2065c) {
        h2.y.i(c2065c);
        this.f15544o = c2065c.f15544o;
        this.f15545p = c2065c.f15545p;
        this.f15546q = c2065c.f15546q;
        this.f15547r = c2065c.f15547r;
        this.f15548s = c2065c.f15548s;
        this.f15549t = c2065c.f15549t;
        this.f15550u = c2065c.f15550u;
        this.f15551v = c2065c.f15551v;
        this.f15552w = c2065c.f15552w;
        this.f15553x = c2065c.f15553x;
        this.y = c2065c.y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.V(parcel, 2, this.f15544o);
        AbstractC1654b.V(parcel, 3, this.f15545p);
        AbstractC1654b.U(parcel, 4, this.f15546q, i4);
        long j4 = this.f15547r;
        AbstractC1654b.f0(parcel, 5, 8);
        parcel.writeLong(j4);
        boolean z4 = this.f15548s;
        AbstractC1654b.f0(parcel, 6, 4);
        parcel.writeInt(z4 ? 1 : 0);
        AbstractC1654b.V(parcel, 7, this.f15549t);
        AbstractC1654b.U(parcel, 8, this.f15550u, i4);
        long j5 = this.f15551v;
        AbstractC1654b.f0(parcel, 9, 8);
        parcel.writeLong(j5);
        AbstractC1654b.U(parcel, 10, this.f15552w, i4);
        AbstractC1654b.f0(parcel, 11, 8);
        parcel.writeLong(this.f15553x);
        AbstractC1654b.U(parcel, 12, this.y, i4);
        AbstractC1654b.e0(parcel, a02);
    }
}
