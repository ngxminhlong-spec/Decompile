package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Ma, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305Ma extends AbstractC1717a {
    public static final Parcelable.Creator<C0305Ma> CREATOR = new C0295Ka(1);

    /* renamed from: o, reason: collision with root package name */
    public final ApplicationInfo f6235o;

    /* renamed from: p, reason: collision with root package name */
    public final String f6236p;

    /* renamed from: q, reason: collision with root package name */
    public final PackageInfo f6237q;

    /* renamed from: r, reason: collision with root package name */
    public final String f6238r;

    /* renamed from: s, reason: collision with root package name */
    public final int f6239s;

    /* renamed from: t, reason: collision with root package name */
    public final String f6240t;

    /* renamed from: u, reason: collision with root package name */
    public final List f6241u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f6242v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f6243w;

    public C0305Ma(ApplicationInfo applicationInfo, String str, PackageInfo packageInfo, String str2, int i4, String str3, List list, boolean z4, boolean z5) {
        this.f6236p = str;
        this.f6235o = applicationInfo;
        this.f6237q = packageInfo;
        this.f6238r = str2;
        this.f6239s = i4;
        this.f6240t = str3;
        this.f6241u = list;
        this.f6242v = z4;
        this.f6243w = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.U(parcel, 1, this.f6235o, i4);
        AbstractC1654b.V(parcel, 2, this.f6236p);
        AbstractC1654b.U(parcel, 3, this.f6237q, i4);
        AbstractC1654b.V(parcel, 4, this.f6238r);
        AbstractC1654b.f0(parcel, 5, 4);
        parcel.writeInt(this.f6239s);
        AbstractC1654b.V(parcel, 6, this.f6240t);
        AbstractC1654b.X(parcel, 7, this.f6241u);
        AbstractC1654b.f0(parcel, 8, 4);
        parcel.writeInt(this.f6242v ? 1 : 0);
        AbstractC1654b.f0(parcel, 9, 4);
        parcel.writeInt(this.f6243w ? 1 : 0);
        AbstractC1654b.e0(parcel, a02);
    }
}
