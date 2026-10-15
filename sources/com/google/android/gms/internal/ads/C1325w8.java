package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.w8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1325w8 extends AbstractC1717a {
    public static final Parcelable.Creator<C1325w8> CREATOR = new C0375a(25);

    /* renamed from: o, reason: collision with root package name */
    public final String f11113o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f11114p;

    /* renamed from: q, reason: collision with root package name */
    public final int f11115q;

    /* renamed from: r, reason: collision with root package name */
    public final String f11116r;

    public C1325w8(String str, int i4, String str2, boolean z4) {
        this.f11113o = str;
        this.f11114p = z4;
        this.f11115q = i4;
        this.f11116r = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.V(parcel, 1, this.f11113o);
        AbstractC1654b.f0(parcel, 2, 4);
        parcel.writeInt(this.f11114p ? 1 : 0);
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(this.f11115q);
        AbstractC1654b.V(parcel, 4, this.f11116r);
        AbstractC1654b.e0(parcel, a02);
    }
}
