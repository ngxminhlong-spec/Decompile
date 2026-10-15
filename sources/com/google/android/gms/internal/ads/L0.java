package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class L0 implements InterfaceC0479cc {
    public static final Parcelable.Creator<L0> CREATOR = new C0375a(17);

    /* renamed from: o, reason: collision with root package name */
    public final long f6084o;

    /* renamed from: p, reason: collision with root package name */
    public final long f6085p;

    /* renamed from: q, reason: collision with root package name */
    public final long f6086q;

    /* renamed from: r, reason: collision with root package name */
    public final long f6087r;

    /* renamed from: s, reason: collision with root package name */
    public final long f6088s;

    public L0(long j4, long j5, long j6, long j7, long j8) {
        this.f6084o = j4;
        this.f6085p = j5;
        this.f6086q = j6;
        this.f6087r = j7;
        this.f6088s = j8;
    }

    public /* synthetic */ L0(Parcel parcel) {
        this.f6084o = parcel.readLong();
        this.f6085p = parcel.readLong();
        this.f6086q = parcel.readLong();
        this.f6087r = parcel.readLong();
        this.f6088s = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && L0.class == obj.getClass()) {
            L0 l02 = (L0) obj;
            if (this.f6084o == l02.f6084o && this.f6085p == l02.f6085p && this.f6086q == l02.f6086q && this.f6087r == l02.f6087r && this.f6088s == l02.f6088s) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0479cc
    public final /* synthetic */ void g(C0365Ya c0365Ya) {
    }

    public final int hashCode() {
        long j4 = this.f6084o;
        int i4 = ((int) (j4 ^ (j4 >>> 32))) + 527;
        long j5 = this.f6088s;
        long j6 = j5 ^ (j5 >>> 32);
        long j7 = this.f6087r;
        long j8 = j7 ^ (j7 >>> 32);
        long j9 = this.f6086q;
        long j10 = j9 ^ (j9 >>> 32);
        long j11 = this.f6085p;
        return (((((((i4 * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + ((int) j10)) * 31) + ((int) j8)) * 31) + ((int) j6);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f6084o + ", photoSize=" + this.f6085p + ", photoPresentationTimestampUs=" + this.f6086q + ", videoStartPosition=" + this.f6087r + ", videoSize=" + this.f6088s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f6084o);
        parcel.writeLong(this.f6085p);
        parcel.writeLong(this.f6086q);
        parcel.writeLong(this.f6087r);
        parcel.writeLong(this.f6088s);
    }
}
