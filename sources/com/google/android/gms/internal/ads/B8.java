package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class B8 extends AbstractC1717a {
    public static final Parcelable.Creator<B8> CREATOR = new C0375a(26);

    /* renamed from: o, reason: collision with root package name */
    public final String f4029o;

    /* renamed from: p, reason: collision with root package name */
    public final Bundle f4030p;

    public B8(Bundle bundle, String str) {
        this.f4029o = str;
        this.f4030p = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.V(parcel, 1, this.f4029o);
        AbstractC1654b.R(parcel, 2, this.f4030p);
        AbstractC1654b.e0(parcel, a02);
    }
}
