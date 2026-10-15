package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1360x0 implements InterfaceC0479cc {
    public static final Parcelable.Creator<C1360x0> CREATOR = new C0375a(5);

    /* renamed from: o, reason: collision with root package name */
    public final int f11223o;

    /* renamed from: p, reason: collision with root package name */
    public final String f11224p;

    /* renamed from: q, reason: collision with root package name */
    public final String f11225q;

    /* renamed from: r, reason: collision with root package name */
    public final String f11226r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f11227s;

    /* renamed from: t, reason: collision with root package name */
    public final int f11228t;

    public C1360x0(int i4, int i5, String str, String str2, String str3, boolean z4) {
        boolean z5 = true;
        if (i5 != -1 && i5 <= 0) {
            z5 = false;
        }
        Zf.O(z5);
        this.f11223o = i4;
        this.f11224p = str;
        this.f11225q = str2;
        this.f11226r = str3;
        this.f11227s = z4;
        this.f11228t = i5;
    }

    public C1360x0(Parcel parcel) {
        this.f11223o = parcel.readInt();
        this.f11224p = parcel.readString();
        this.f11225q = parcel.readString();
        this.f11226r = parcel.readString();
        int i4 = AbstractC0751is.f9071a;
        this.f11227s = parcel.readInt() != 0;
        this.f11228t = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1360x0.class == obj.getClass()) {
            C1360x0 c1360x0 = (C1360x0) obj;
            if (this.f11223o == c1360x0.f11223o && AbstractC0751is.c(this.f11224p, c1360x0.f11224p) && AbstractC0751is.c(this.f11225q, c1360x0.f11225q) && AbstractC0751is.c(this.f11226r, c1360x0.f11226r) && this.f11227s == c1360x0.f11227s && this.f11228t == c1360x0.f11228t) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0479cc
    public final void g(C0365Ya c0365Ya) {
        String str = this.f11225q;
        if (str != null) {
            c0365Ya.f7827v = str;
        }
        String str2 = this.f11224p;
        if (str2 != null) {
            c0365Ya.f7826u = str2;
        }
    }

    public final int hashCode() {
        String str = this.f11224p;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f11225q;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i4 = ((this.f11223o + 527) * 31) + hashCode;
        String str3 = this.f11226r;
        return (((((((i4 * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f11227s ? 1 : 0)) * 31) + this.f11228t;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f11225q + "\", genre=\"" + this.f11224p + "\", bitrate=" + this.f11223o + ", metadataInterval=" + this.f11228t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f11223o);
        parcel.writeString(this.f11224p);
        parcel.writeString(this.f11225q);
        parcel.writeString(this.f11226r);
        int i5 = AbstractC0751is.f9071a;
        parcel.writeInt(this.f11227s ? 1 : 0);
        parcel.writeInt(this.f11228t);
    }
}
