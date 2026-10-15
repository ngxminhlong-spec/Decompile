package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Kb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296Kb extends AbstractC1717a {
    public static final Parcelable.Creator<C0296Kb> CREATOR = new C0295Ka(8);

    /* renamed from: o, reason: collision with root package name */
    public final String f6024o;

    /* renamed from: p, reason: collision with root package name */
    public final String f6025p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f6026q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f6027r;

    /* renamed from: s, reason: collision with root package name */
    public final List f6028s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f6029t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f6030u;

    /* renamed from: v, reason: collision with root package name */
    public final List f6031v;

    public C0296Kb(String str, String str2, boolean z4, boolean z5, List list, boolean z6, boolean z7, List list2) {
        this.f6024o = str;
        this.f6025p = str2;
        this.f6026q = z4;
        this.f6027r = z5;
        this.f6028s = list;
        this.f6029t = z6;
        this.f6030u = z7;
        this.f6031v = list2 == null ? new ArrayList() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.V(parcel, 2, this.f6024o);
        AbstractC1654b.V(parcel, 3, this.f6025p);
        AbstractC1654b.f0(parcel, 4, 4);
        parcel.writeInt(this.f6026q ? 1 : 0);
        AbstractC1654b.f0(parcel, 5, 4);
        parcel.writeInt(this.f6027r ? 1 : 0);
        AbstractC1654b.X(parcel, 6, this.f6028s);
        AbstractC1654b.f0(parcel, 7, 4);
        parcel.writeInt(this.f6029t ? 1 : 0);
        AbstractC1654b.f0(parcel, 8, 4);
        parcel.writeInt(this.f6030u ? 1 : 0);
        AbstractC1654b.X(parcel, 9, this.f6031v);
        AbstractC1654b.e0(parcel, a02);
    }
}
