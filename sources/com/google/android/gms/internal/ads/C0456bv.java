package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.bv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0456bv implements InterfaceC0479cc {
    public static final Parcelable.Creator<C0456bv> CREATOR = new C0295Ka(20);

    /* renamed from: o, reason: collision with root package name */
    public final long f8304o;

    /* renamed from: p, reason: collision with root package name */
    public final long f8305p;

    /* renamed from: q, reason: collision with root package name */
    public final long f8306q;

    public C0456bv(long j4, long j5, long j6) {
        this.f8304o = j4;
        this.f8305p = j5;
        this.f8306q = j6;
    }

    public /* synthetic */ C0456bv(Parcel parcel) {
        this.f8304o = parcel.readLong();
        this.f8305p = parcel.readLong();
        this.f8306q = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0456bv)) {
            return false;
        }
        C0456bv c0456bv = (C0456bv) obj;
        return this.f8304o == c0456bv.f8304o && this.f8305p == c0456bv.f8305p && this.f8306q == c0456bv.f8306q;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0479cc
    public final /* synthetic */ void g(C0365Ya c0365Ya) {
    }

    public final int hashCode() {
        long j4 = this.f8304o;
        int i4 = ((int) (j4 ^ (j4 >>> 32))) + 527;
        long j5 = this.f8306q;
        long j6 = j5 ^ (j5 >>> 32);
        long j7 = this.f8305p;
        return (((i4 * 31) + ((int) ((j7 >>> 32) ^ j7))) * 31) + ((int) j6);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f8304o + ", modification time=" + this.f8305p + ", timescale=" + this.f8306q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f8304o);
        parcel.writeLong(this.f8305p);
        parcel.writeLong(this.f8306q);
    }
}
