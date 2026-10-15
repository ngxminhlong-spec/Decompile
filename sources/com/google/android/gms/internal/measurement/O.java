package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class O extends AbstractC1717a {
    public static final Parcelable.Creator<O> CREATOR = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final long f11788o;

    /* renamed from: p, reason: collision with root package name */
    public final long f11789p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f11790q;

    /* renamed from: r, reason: collision with root package name */
    public final String f11791r;

    /* renamed from: s, reason: collision with root package name */
    public final String f11792s;

    /* renamed from: t, reason: collision with root package name */
    public final String f11793t;

    /* renamed from: u, reason: collision with root package name */
    public final Bundle f11794u;

    /* renamed from: v, reason: collision with root package name */
    public final String f11795v;

    public O(long j4, long j5, boolean z4, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f11788o = j4;
        this.f11789p = j5;
        this.f11790q = z4;
        this.f11791r = str;
        this.f11792s = str2;
        this.f11793t = str3;
        this.f11794u = bundle;
        this.f11795v = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 8);
        parcel.writeLong(this.f11788o);
        AbstractC1654b.f0(parcel, 2, 8);
        parcel.writeLong(this.f11789p);
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(this.f11790q ? 1 : 0);
        AbstractC1654b.V(parcel, 4, this.f11791r);
        AbstractC1654b.V(parcel, 5, this.f11792s);
        AbstractC1654b.V(parcel, 6, this.f11793t);
        AbstractC1654b.R(parcel, 7, this.f11794u);
        AbstractC1654b.V(parcel, 8, this.f11795v);
        AbstractC1654b.e0(parcel, a02);
    }
}
