package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Db, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259Db extends AbstractC1717a {
    public static final Parcelable.Creator<C0259Db> CREATOR = new C0295Ka(7);

    /* renamed from: o, reason: collision with root package name */
    public final String f4620o;

    /* renamed from: p, reason: collision with root package name */
    public final String f4621p;

    public C0259Db(String str, String str2) {
        this.f4620o = str;
        this.f4621p = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.V(parcel, 1, this.f4620o);
        AbstractC1654b.V(parcel, 2, this.f4621p);
        AbstractC1654b.e0(parcel, a02);
    }
}
