package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class C0 extends F0 {
    public static final Parcelable.Creator<C0> CREATOR = new C0375a(10);

    /* renamed from: p, reason: collision with root package name */
    public final String f4212p;

    /* renamed from: q, reason: collision with root package name */
    public final String f4213q;

    /* renamed from: r, reason: collision with root package name */
    public final String f4214r;

    public C0(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i4 = AbstractC0751is.f9071a;
        this.f4212p = readString;
        this.f4213q = parcel.readString();
        this.f4214r = parcel.readString();
    }

    public C0(String str, String str2, String str3) {
        super("COMM");
        this.f4212p = str;
        this.f4213q = str2;
        this.f4214r = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0.class == obj.getClass()) {
            C0 c02 = (C0) obj;
            if (AbstractC0751is.c(this.f4213q, c02.f4213q) && AbstractC0751is.c(this.f4212p, c02.f4212p) && AbstractC0751is.c(this.f4214r, c02.f4214r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4212p;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f4213q;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i4 = hashCode + 527;
        String str3 = this.f4214r;
        return (((i4 * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.F0
    public final String toString() {
        return this.f4965o + ": language=" + this.f4212p + ", description=" + this.f4213q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f4965o);
        parcel.writeString(this.f4212p);
        parcel.writeString(this.f4214r);
    }
}
