package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.r8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1110r8 extends AbstractC1717a {
    public static final Parcelable.Creator<C1110r8> CREATOR = new C0375a(23);

    /* renamed from: o, reason: collision with root package name */
    public final String f10456o;

    /* renamed from: p, reason: collision with root package name */
    public final String[] f10457p;

    /* renamed from: q, reason: collision with root package name */
    public final String[] f10458q;

    public C1110r8(String str, String[] strArr, String[] strArr2) {
        this.f10456o = str;
        this.f10457p = strArr;
        this.f10458q = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.V(parcel, 1, this.f10456o);
        AbstractC1654b.W(parcel, 2, this.f10457p);
        AbstractC1654b.W(parcel, 3, this.f10458q);
        AbstractC1654b.e0(parcel, a02);
    }
}
