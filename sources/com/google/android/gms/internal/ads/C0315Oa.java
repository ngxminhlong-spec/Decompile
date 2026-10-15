package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Oa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315Oa extends AbstractC1717a {
    public static final Parcelable.Creator<C0315Oa> CREATOR = new C0295Ka(3);

    /* renamed from: o, reason: collision with root package name */
    public final String f6457o;

    /* renamed from: p, reason: collision with root package name */
    public final int f6458p;

    /* renamed from: q, reason: collision with root package name */
    public final Bundle f6459q;

    /* renamed from: r, reason: collision with root package name */
    public final byte[] f6460r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f6461s;

    /* renamed from: t, reason: collision with root package name */
    public final String f6462t;

    /* renamed from: u, reason: collision with root package name */
    public final String f6463u;

    public C0315Oa(String str, int i4, Bundle bundle, byte[] bArr, boolean z4, String str2, String str3) {
        this.f6457o = str;
        this.f6458p = i4;
        this.f6459q = bundle;
        this.f6460r = bArr;
        this.f6461s = z4;
        this.f6462t = str2;
        this.f6463u = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.V(parcel, 1, this.f6457o);
        AbstractC1654b.f0(parcel, 2, 4);
        parcel.writeInt(this.f6458p);
        AbstractC1654b.R(parcel, 3, this.f6459q);
        AbstractC1654b.S(parcel, 4, this.f6460r);
        AbstractC1654b.f0(parcel, 5, 4);
        parcel.writeInt(this.f6461s ? 1 : 0);
        AbstractC1654b.V(parcel, 6, this.f6462t);
        AbstractC1654b.V(parcel, 7, this.f6463u);
        AbstractC1654b.e0(parcel, a02);
    }
}
