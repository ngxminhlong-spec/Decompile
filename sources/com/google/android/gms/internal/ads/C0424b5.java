package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.b5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0424b5 extends AbstractC1717a {
    public static final Parcelable.Creator<C0424b5> CREATOR = new C0375a(20);

    /* renamed from: o, reason: collision with root package name */
    public ParcelFileDescriptor f8201o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f8202p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f8203q;

    /* renamed from: r, reason: collision with root package name */
    public final long f8204r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f8205s;

    public C0424b5() {
        this(null, false, false, 0L, false);
    }

    public C0424b5(ParcelFileDescriptor parcelFileDescriptor, boolean z4, boolean z5, long j4, boolean z6) {
        this.f8201o = parcelFileDescriptor;
        this.f8202p = z4;
        this.f8203q = z5;
        this.f8204r = j4;
        this.f8205s = z6;
    }

    public final synchronized long h() {
        return this.f8204r;
    }

    public final synchronized ParcelFileDescriptor.AutoCloseInputStream i() {
        if (this.f8201o == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f8201o);
        this.f8201o = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean j() {
        return this.f8202p;
    }

    public final synchronized boolean k() {
        return this.f8201o != null;
    }

    public final synchronized boolean l() {
        return this.f8203q;
    }

    public final synchronized boolean n() {
        return this.f8205s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        ParcelFileDescriptor parcelFileDescriptor;
        int a02 = AbstractC1654b.a0(parcel, 20293);
        synchronized (this) {
            parcelFileDescriptor = this.f8201o;
        }
        AbstractC1654b.U(parcel, 2, parcelFileDescriptor, i4);
        boolean j4 = j();
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(j4 ? 1 : 0);
        boolean l4 = l();
        AbstractC1654b.f0(parcel, 4, 4);
        parcel.writeInt(l4 ? 1 : 0);
        long h4 = h();
        AbstractC1654b.f0(parcel, 5, 8);
        parcel.writeLong(h4);
        boolean n4 = n();
        AbstractC1654b.f0(parcel, 6, 4);
        parcel.writeInt(n4 ? 1 : 0);
        AbstractC1654b.e0(parcel, a02);
    }
}
