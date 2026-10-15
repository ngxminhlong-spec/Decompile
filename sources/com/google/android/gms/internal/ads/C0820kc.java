package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.kc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0820kc extends AbstractC1717a {
    public static final Parcelable.Creator<C0820kc> CREATOR = new C0295Ka(10);

    /* renamed from: o, reason: collision with root package name */
    public final String f9291o;

    /* renamed from: p, reason: collision with root package name */
    public final String f9292p;

    /* renamed from: q, reason: collision with root package name */
    public final O1.X0 f9293q;

    /* renamed from: r, reason: collision with root package name */
    public final O1.U0 f9294r;

    public C0820kc(String str, String str2, O1.X0 x02, O1.U0 u02) {
        this.f9291o = str;
        this.f9292p = str2;
        this.f9293q = x02;
        this.f9294r = u02;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.V(parcel, 1, this.f9291o);
        AbstractC1654b.V(parcel, 2, this.f9292p);
        AbstractC1654b.U(parcel, 3, this.f9293q, i4);
        AbstractC1654b.U(parcel, 4, this.f9294r, i4);
        AbstractC1654b.e0(parcel, a02);
    }
}
