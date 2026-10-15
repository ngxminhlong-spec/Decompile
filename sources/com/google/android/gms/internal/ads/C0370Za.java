package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Za, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370Za extends AbstractC1717a {
    public static final Parcelable.Creator<C0370Za> CREATOR = new C0295Ka(4);

    /* renamed from: o, reason: collision with root package name */
    public final Bundle f7989o;

    /* renamed from: p, reason: collision with root package name */
    public final C0248Bc f7990p;

    /* renamed from: q, reason: collision with root package name */
    public final ApplicationInfo f7991q;

    /* renamed from: r, reason: collision with root package name */
    public final String f7992r;

    /* renamed from: s, reason: collision with root package name */
    public final List f7993s;

    /* renamed from: t, reason: collision with root package name */
    public final PackageInfo f7994t;

    /* renamed from: u, reason: collision with root package name */
    public final String f7995u;

    /* renamed from: v, reason: collision with root package name */
    public final String f7996v;

    /* renamed from: w, reason: collision with root package name */
    public Xp f7997w;

    /* renamed from: x, reason: collision with root package name */
    public String f7998x;
    public final boolean y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f7999z;

    public C0370Za(Bundle bundle, C0248Bc c0248Bc, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, String str2, String str3, Xp xp, String str4, boolean z4, boolean z5) {
        this.f7989o = bundle;
        this.f7990p = c0248Bc;
        this.f7992r = str;
        this.f7991q = applicationInfo;
        this.f7993s = arrayList;
        this.f7994t = packageInfo;
        this.f7995u = str2;
        this.f7996v = str3;
        this.f7997w = xp;
        this.f7998x = str4;
        this.y = z4;
        this.f7999z = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.R(parcel, 1, this.f7989o);
        AbstractC1654b.U(parcel, 2, this.f7990p, i4);
        AbstractC1654b.U(parcel, 3, this.f7991q, i4);
        AbstractC1654b.V(parcel, 4, this.f7992r);
        AbstractC1654b.X(parcel, 5, this.f7993s);
        AbstractC1654b.U(parcel, 6, this.f7994t, i4);
        AbstractC1654b.V(parcel, 7, this.f7995u);
        AbstractC1654b.V(parcel, 9, this.f7996v);
        AbstractC1654b.U(parcel, 10, this.f7997w, i4);
        AbstractC1654b.V(parcel, 11, this.f7998x);
        AbstractC1654b.f0(parcel, 12, 4);
        parcel.writeInt(this.y ? 1 : 0);
        AbstractC1654b.f0(parcel, 13, 4);
        parcel.writeInt(this.f7999z ? 1 : 0);
        AbstractC1654b.e0(parcel, a02);
    }
}
