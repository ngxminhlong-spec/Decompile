package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class B0 extends F0 {
    public static final Parcelable.Creator<B0> CREATOR = new C0375a(9);

    /* renamed from: p, reason: collision with root package name */
    public final String f4014p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f4015q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4016r;

    /* renamed from: s, reason: collision with root package name */
    public final String[] f4017s;

    /* renamed from: t, reason: collision with root package name */
    public final F0[] f4018t;

    public B0(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i4 = AbstractC0751is.f9071a;
        this.f4014p = readString;
        this.f4015q = parcel.readByte() != 0;
        this.f4016r = parcel.readByte() != 0;
        this.f4017s = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f4018t = new F0[readInt];
        for (int i5 = 0; i5 < readInt; i5++) {
            this.f4018t[i5] = (F0) parcel.readParcelable(F0.class.getClassLoader());
        }
    }

    public B0(String str, boolean z4, boolean z5, String[] strArr, F0[] f0Arr) {
        super("CTOC");
        this.f4014p = str;
        this.f4015q = z4;
        this.f4016r = z5;
        this.f4017s = strArr;
        this.f4018t = f0Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && B0.class == obj.getClass()) {
            B0 b02 = (B0) obj;
            if (this.f4015q == b02.f4015q && this.f4016r == b02.f4016r && AbstractC0751is.c(this.f4014p, b02.f4014p) && Arrays.equals(this.f4017s, b02.f4017s) && Arrays.equals(this.f4018t, b02.f4018t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4014p;
        return (((((this.f4015q ? 1 : 0) + 527) * 31) + (this.f4016r ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f4014p);
        parcel.writeByte(this.f4015q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4016r ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f4017s);
        F0[] f0Arr = this.f4018t;
        parcel.writeInt(f0Arr.length);
        for (F0 f02 : f0Arr) {
            parcel.writeParcelable(f02, 0);
        }
    }
}
