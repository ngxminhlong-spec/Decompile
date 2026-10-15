package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class C8 extends AbstractC1717a {
    public static final Parcelable.Creator<C8> CREATOR = new C0375a(27);

    /* renamed from: o, reason: collision with root package name */
    public final int f4403o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4404p;

    /* renamed from: q, reason: collision with root package name */
    public final String f4405q;

    /* renamed from: r, reason: collision with root package name */
    public final int f4406r;

    public C8(int i4, int i5, String str, int i6) {
        this.f4403o = i4;
        this.f4404p = i5;
        this.f4405q = str;
        this.f4406r = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f4404p);
        AbstractC1654b.V(parcel, 2, this.f4405q);
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(this.f4406r);
        AbstractC1654b.f0(parcel, 1000, 4);
        parcel.writeInt(this.f4403o);
        AbstractC1654b.e0(parcel, a02);
    }
}
