package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class K0 extends F0 {
    public static final Parcelable.Creator<K0> CREATOR = new C0375a(16);

    /* renamed from: p, reason: collision with root package name */
    public final String f5958p;

    /* renamed from: q, reason: collision with root package name */
    public final String f5959q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K0(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.AbstractC0751is.f9071a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f5958p = r0
            java.lang.String r3 = r3.readString()
            r2.f5959q = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.K0.<init>(android.os.Parcel):void");
    }

    public K0(String str, String str2, String str3) {
        super(str);
        this.f5958p = str2;
        this.f5959q = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && K0.class == obj.getClass()) {
            K0 k02 = (K0) obj;
            if (this.f4965o.equals(k02.f4965o) && AbstractC0751is.c(this.f5958p, k02.f5958p) && AbstractC0751is.c(this.f5959q, k02.f5959q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f4965o.hashCode() + 527;
        String str = this.f5958p;
        int hashCode2 = str != null ? str.hashCode() : 0;
        int i4 = hashCode * 31;
        String str2 = this.f5959q;
        return ((i4 + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.F0
    public final String toString() {
        return this.f4965o + ": url=" + this.f5959q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f4965o);
        parcel.writeString(this.f5958p);
        parcel.writeString(this.f5959q);
    }
}
