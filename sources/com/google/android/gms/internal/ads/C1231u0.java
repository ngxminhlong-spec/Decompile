package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1231u0 implements InterfaceC0479cc {
    public static final Parcelable.Creator<C1231u0> CREATOR;

    /* renamed from: o, reason: collision with root package name */
    public final String f10764o;

    /* renamed from: p, reason: collision with root package name */
    public final String f10765p;

    /* renamed from: q, reason: collision with root package name */
    public final long f10766q;

    /* renamed from: r, reason: collision with root package name */
    public final long f10767r;

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f10768s;

    /* renamed from: t, reason: collision with root package name */
    public int f10769t;

    static {
        L1 l12 = new L1();
        l12.f6101j = "application/id3";
        new C0976o2(l12);
        L1 l13 = new L1();
        l13.f6101j = "application/x-scte35";
        new C0976o2(l13);
        CREATOR = new C0375a(2);
    }

    public C1231u0(Parcel parcel) {
        String readString = parcel.readString();
        int i4 = AbstractC0751is.f9071a;
        this.f10764o = readString;
        this.f10765p = parcel.readString();
        this.f10766q = parcel.readLong();
        this.f10767r = parcel.readLong();
        this.f10768s = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1231u0.class == obj.getClass()) {
            C1231u0 c1231u0 = (C1231u0) obj;
            if (this.f10766q == c1231u0.f10766q && this.f10767r == c1231u0.f10767r && AbstractC0751is.c(this.f10764o, c1231u0.f10764o) && AbstractC0751is.c(this.f10765p, c1231u0.f10765p) && Arrays.equals(this.f10768s, c1231u0.f10768s)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0479cc
    public final /* synthetic */ void g(C0365Ya c0365Ya) {
    }

    public final int hashCode() {
        int i4 = this.f10769t;
        if (i4 != 0) {
            return i4;
        }
        String str = this.f10764o;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f10765p;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j4 = this.f10767r;
        long j5 = this.f10766q;
        int hashCode3 = Arrays.hashCode(this.f10768s) + ((((((((hashCode + 527) * 31) + hashCode2) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31);
        this.f10769t = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f10764o + ", id=" + this.f10767r + ", durationMs=" + this.f10766q + ", value=" + this.f10765p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f10764o);
        parcel.writeString(this.f10765p);
        parcel.writeLong(this.f10766q);
        parcel.writeLong(this.f10767r);
        parcel.writeByteArray(this.f10768s);
    }
}
