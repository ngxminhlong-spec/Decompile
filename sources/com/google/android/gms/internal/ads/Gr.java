package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Gr extends AbstractC1717a {
    public static final Parcelable.Creator<Gr> CREATOR = new C0295Ka(14);

    /* renamed from: o, reason: collision with root package name */
    public final int f5340o;

    /* renamed from: p, reason: collision with root package name */
    public final String f5341p;

    /* renamed from: q, reason: collision with root package name */
    public final String f5342q;

    public Gr(int i4, String str, String str2) {
        this.f5340o = i4;
        this.f5341p = str;
        this.f5342q = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f5340o);
        AbstractC1654b.V(parcel, 2, this.f5341p);
        AbstractC1654b.V(parcel, 3, this.f5342q);
        AbstractC1654b.e0(parcel, a02);
    }
}
