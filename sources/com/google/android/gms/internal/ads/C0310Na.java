package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Na, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310Na extends AbstractC1717a {
    public static final Parcelable.Creator<C0310Na> CREATOR = new C0295Ka(2);

    /* renamed from: o, reason: collision with root package name */
    public final boolean f6316o;

    /* renamed from: p, reason: collision with root package name */
    public final List f6317p;

    public C0310Na(List list, boolean z4) {
        this.f6316o = z4;
        this.f6317p = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 2, 4);
        parcel.writeInt(this.f6316o ? 1 : 0);
        AbstractC1654b.X(parcel, 3, this.f6317p);
        AbstractC1654b.e0(parcel, a02);
    }
}
