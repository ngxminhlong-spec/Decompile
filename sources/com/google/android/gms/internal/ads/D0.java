package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class D0 extends F0 {
    public static final Parcelable.Creator<D0> CREATOR = new C0375a(11);

    /* renamed from: p, reason: collision with root package name */
    public final String f4562p;

    /* renamed from: q, reason: collision with root package name */
    public final String f4563q;

    /* renamed from: r, reason: collision with root package name */
    public final String f4564r;

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f4565s;

    public D0(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i4 = AbstractC0751is.f9071a;
        this.f4562p = readString;
        this.f4563q = parcel.readString();
        this.f4564r = parcel.readString();
        this.f4565s = parcel.createByteArray();
    }

    public D0(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f4562p = str;
        this.f4563q = str2;
        this.f4564r = str3;
        this.f4565s = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && D0.class == obj.getClass()) {
            D0 d02 = (D0) obj;
            if (AbstractC0751is.c(this.f4562p, d02.f4562p) && AbstractC0751is.c(this.f4563q, d02.f4563q) && AbstractC0751is.c(this.f4564r, d02.f4564r) && Arrays.equals(this.f4565s, d02.f4565s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4562p;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f4563q;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i4 = hashCode + 527;
        String str3 = this.f4564r;
        return Arrays.hashCode(this.f4565s) + (((((i4 * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.F0
    public final String toString() {
        return this.f4965o + ": mimeType=" + this.f4562p + ", filename=" + this.f4563q + ", description=" + this.f4564r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f4562p);
        parcel.writeString(this.f4563q);
        parcel.writeString(this.f4564r);
        parcel.writeByteArray(this.f4565s);
    }
}
