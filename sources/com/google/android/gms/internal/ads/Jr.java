package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Jr extends AbstractC1717a {
    public static final Parcelable.Creator<Jr> CREATOR = new C0295Ka(16);

    /* renamed from: o, reason: collision with root package name */
    public final int f5924o;

    /* renamed from: p, reason: collision with root package name */
    public final int f5925p;

    /* renamed from: q, reason: collision with root package name */
    public final String f5926q;

    /* renamed from: r, reason: collision with root package name */
    public final String f5927r;

    /* renamed from: s, reason: collision with root package name */
    public final int f5928s;

    public Jr(int i4, int i5, int i6, String str, String str2) {
        this.f5924o = i4;
        this.f5925p = i5;
        this.f5926q = str;
        this.f5927r = str2;
        this.f5928s = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f5924o);
        AbstractC1654b.f0(parcel, 2, 4);
        parcel.writeInt(this.f5925p);
        AbstractC1654b.V(parcel, 3, this.f5926q);
        AbstractC1654b.V(parcel, 4, this.f5927r);
        AbstractC1654b.f0(parcel, 5, 4);
        parcel.writeInt(this.f5928s);
        AbstractC1654b.e0(parcel, a02);
    }
}
