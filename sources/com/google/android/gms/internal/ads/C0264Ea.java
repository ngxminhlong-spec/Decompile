package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import d3.AbstractC1654b;
import i2.AbstractC1717a;
import java.util.Map;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Ea, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264Ea extends AbstractC1717a {
    public static final Parcelable.Creator<C0264Ea> CREATOR = new C0375a(29);

    /* renamed from: o, reason: collision with root package name */
    public final View f4873o;

    /* renamed from: p, reason: collision with root package name */
    public final Map f4874p;

    public C0264Ea(IBinder iBinder, IBinder iBinder2) {
        this.f4873o = (View) BinderC1813b.C2(BinderC1813b.G1(iBinder));
        this.f4874p = (Map) BinderC1813b.C2(BinderC1813b.G1(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.T(parcel, 1, new BinderC1813b(this.f4873o));
        AbstractC1654b.T(parcel, 2, new BinderC1813b(this.f4874p));
        AbstractC1654b.e0(parcel, a02);
    }
}
