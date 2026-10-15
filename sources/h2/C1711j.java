package h2;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: h2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1711j extends AbstractC1717a {
    public static final Parcelable.Creator<C1711j> CREATOR = new e2.l(5);

    /* renamed from: o, reason: collision with root package name */
    public final int f13207o;

    /* renamed from: p, reason: collision with root package name */
    public final int f13208p;

    /* renamed from: q, reason: collision with root package name */
    public final int f13209q;

    /* renamed from: r, reason: collision with root package name */
    public final long f13210r;

    /* renamed from: s, reason: collision with root package name */
    public final long f13211s;

    /* renamed from: t, reason: collision with root package name */
    public final String f13212t;

    /* renamed from: u, reason: collision with root package name */
    public final String f13213u;

    /* renamed from: v, reason: collision with root package name */
    public final int f13214v;

    /* renamed from: w, reason: collision with root package name */
    public final int f13215w;

    public C1711j(int i4, int i5, int i6, long j4, long j5, String str, String str2, int i7, int i8) {
        this.f13207o = i4;
        this.f13208p = i5;
        this.f13209q = i6;
        this.f13210r = j4;
        this.f13211s = j5;
        this.f13212t = str;
        this.f13213u = str2;
        this.f13214v = i7;
        this.f13215w = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f13207o);
        AbstractC1654b.f0(parcel, 2, 4);
        parcel.writeInt(this.f13208p);
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(this.f13209q);
        AbstractC1654b.f0(parcel, 4, 8);
        parcel.writeLong(this.f13210r);
        AbstractC1654b.f0(parcel, 5, 8);
        parcel.writeLong(this.f13211s);
        AbstractC1654b.V(parcel, 6, this.f13212t);
        AbstractC1654b.V(parcel, 7, this.f13213u);
        AbstractC1654b.f0(parcel, 8, 4);
        parcel.writeInt(this.f13214v);
        AbstractC1654b.f0(parcel, 9, 4);
        parcel.writeInt(this.f13215w);
        AbstractC1654b.e0(parcel, a02);
    }
}
