package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class A0 extends F0 {
    public static final Parcelable.Creator<A0> CREATOR = new C0375a(8);

    /* renamed from: p, reason: collision with root package name */
    public final String f3903p;

    /* renamed from: q, reason: collision with root package name */
    public final int f3904q;

    /* renamed from: r, reason: collision with root package name */
    public final int f3905r;

    /* renamed from: s, reason: collision with root package name */
    public final long f3906s;

    /* renamed from: t, reason: collision with root package name */
    public final long f3907t;

    /* renamed from: u, reason: collision with root package name */
    public final F0[] f3908u;

    public A0(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i4 = AbstractC0751is.f9071a;
        this.f3903p = readString;
        this.f3904q = parcel.readInt();
        this.f3905r = parcel.readInt();
        this.f3906s = parcel.readLong();
        this.f3907t = parcel.readLong();
        int readInt = parcel.readInt();
        this.f3908u = new F0[readInt];
        for (int i5 = 0; i5 < readInt; i5++) {
            this.f3908u[i5] = (F0) parcel.readParcelable(F0.class.getClassLoader());
        }
    }

    public A0(String str, int i4, int i5, long j4, long j5, F0[] f0Arr) {
        super("CHAP");
        this.f3903p = str;
        this.f3904q = i4;
        this.f3905r = i5;
        this.f3906s = j4;
        this.f3907t = j5;
        this.f3908u = f0Arr;
    }

    @Override // com.google.android.gms.internal.ads.F0, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && A0.class == obj.getClass()) {
            A0 a02 = (A0) obj;
            if (this.f3904q == a02.f3904q && this.f3905r == a02.f3905r && this.f3906s == a02.f3906s && this.f3907t == a02.f3907t && AbstractC0751is.c(this.f3903p, a02.f3903p) && Arrays.equals(this.f3908u, a02.f3908u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f3903p;
        return ((((((((this.f3904q + 527) * 31) + this.f3905r) * 31) + ((int) this.f3906s)) * 31) + ((int) this.f3907t)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f3903p);
        parcel.writeInt(this.f3904q);
        parcel.writeInt(this.f3905r);
        parcel.writeLong(this.f3906s);
        parcel.writeLong(this.f3907t);
        F0[] f0Arr = this.f3908u;
        parcel.writeInt(f0Arr.length);
        for (F0 f02 : f0Arr) {
            parcel.writeParcelable(f02, 0);
        }
    }
}
