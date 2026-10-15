package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.jb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0776jb extends AbstractC1717a {
    public static final Parcelable.Creator<C0776jb> CREATOR = new C0295Ka(5);

    /* renamed from: o, reason: collision with root package name */
    public final O1.U0 f9161o;

    /* renamed from: p, reason: collision with root package name */
    public final String f9162p;

    public C0776jb(O1.U0 u02, String str) {
        this.f9161o = u02;
        this.f9162p = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.U(parcel, 2, this.f9161o, i4);
        AbstractC1654b.V(parcel, 3, this.f9162p);
        AbstractC1654b.e0(parcel, a02);
    }
}
