package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Xp extends AbstractC1717a {
    public static final Parcelable.Creator<Xp> CREATOR = new C0295Ka(12);

    /* renamed from: o, reason: collision with root package name */
    public final Context f7693o;

    /* renamed from: p, reason: collision with root package name */
    public final int f7694p;

    /* renamed from: q, reason: collision with root package name */
    public final Wp f7695q;

    /* renamed from: r, reason: collision with root package name */
    public final int f7696r;

    /* renamed from: s, reason: collision with root package name */
    public final int f7697s;

    /* renamed from: t, reason: collision with root package name */
    public final int f7698t;

    /* renamed from: u, reason: collision with root package name */
    public final String f7699u;

    /* renamed from: v, reason: collision with root package name */
    public final int f7700v;

    /* renamed from: w, reason: collision with root package name */
    public final int f7701w;

    /* renamed from: x, reason: collision with root package name */
    public final int f7702x;

    public Xp(int i4, int i5, int i6, int i7, String str, int i8, int i9) {
        Wp[] values = Wp.values();
        this.f7693o = null;
        this.f7694p = i4;
        this.f7695q = values[i4];
        this.f7696r = i5;
        this.f7697s = i6;
        this.f7698t = i7;
        this.f7699u = str;
        this.f7700v = i8;
        this.f7702x = new int[]{1, 2, 3}[i8];
        this.f7701w = i9;
        int i10 = new int[]{1}[i9];
    }

    public Xp(Context context, Wp wp, int i4, int i5, int i6, String str, String str2, String str3) {
        Wp.values();
        this.f7693o = context;
        this.f7694p = wp.ordinal();
        this.f7695q = wp;
        this.f7696r = i4;
        this.f7697s = i5;
        this.f7698t = i6;
        this.f7699u = str;
        int i7 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.f7702x = i7;
        this.f7700v = i7 - 1;
        "onAdClosed".equals(str3);
        this.f7701w = 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f7694p);
        AbstractC1654b.f0(parcel, 2, 4);
        parcel.writeInt(this.f7696r);
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(this.f7697s);
        AbstractC1654b.f0(parcel, 4, 4);
        parcel.writeInt(this.f7698t);
        AbstractC1654b.V(parcel, 5, this.f7699u);
        AbstractC1654b.f0(parcel, 6, 4);
        parcel.writeInt(this.f7700v);
        AbstractC1654b.f0(parcel, 7, 4);
        parcel.writeInt(this.f7701w);
        AbstractC1654b.e0(parcel, a02);
    }
}
