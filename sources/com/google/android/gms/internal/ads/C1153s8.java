package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.s8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1153s8 extends AbstractC1717a {
    public static final Parcelable.Creator<C1153s8> CREATOR = new C0375a(24);

    /* renamed from: o, reason: collision with root package name */
    public final boolean f10588o;

    /* renamed from: p, reason: collision with root package name */
    public final String f10589p;

    /* renamed from: q, reason: collision with root package name */
    public final int f10590q;

    /* renamed from: r, reason: collision with root package name */
    public final byte[] f10591r;

    /* renamed from: s, reason: collision with root package name */
    public final String[] f10592s;

    /* renamed from: t, reason: collision with root package name */
    public final String[] f10593t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f10594u;

    /* renamed from: v, reason: collision with root package name */
    public final long f10595v;

    public C1153s8(boolean z4, String str, int i4, byte[] bArr, String[] strArr, String[] strArr2, boolean z5, long j4) {
        this.f10588o = z4;
        this.f10589p = str;
        this.f10590q = i4;
        this.f10591r = bArr;
        this.f10592s = strArr;
        this.f10593t = strArr2;
        this.f10594u = z5;
        this.f10595v = j4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f10588o ? 1 : 0);
        AbstractC1654b.V(parcel, 2, this.f10589p);
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(this.f10590q);
        AbstractC1654b.S(parcel, 4, this.f10591r);
        AbstractC1654b.W(parcel, 5, this.f10592s);
        AbstractC1654b.W(parcel, 6, this.f10593t);
        AbstractC1654b.f0(parcel, 7, 4);
        parcel.writeInt(this.f10594u ? 1 : 0);
        AbstractC1654b.f0(parcel, 8, 8);
        parcel.writeLong(this.f10595v);
        AbstractC1654b.e0(parcel, a02);
    }
}
