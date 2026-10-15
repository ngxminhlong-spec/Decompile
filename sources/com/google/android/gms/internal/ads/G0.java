package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class G0 extends F0 {
    public static final Parcelable.Creator<G0> CREATOR = new C0375a(12);

    /* renamed from: p, reason: collision with root package name */
    public final String f5108p;

    /* renamed from: q, reason: collision with root package name */
    public final String f5109q;

    /* renamed from: r, reason: collision with root package name */
    public final String f5110r;

    public G0(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i4 = AbstractC0751is.f9071a;
        this.f5108p = readString;
        this.f5109q = parcel.readString();
        this.f5110r = parcel.readString();
    }

    public G0(String str, String str2, String str3) {
        super("----");
        this.f5108p = str;
        this.f5109q = str2;
        this.f5110r = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && G0.class == obj.getClass()) {
            G0 g02 = (G0) obj;
            if (AbstractC0751is.c(this.f5109q, g02.f5109q) && AbstractC0751is.c(this.f5108p, g02.f5108p) && AbstractC0751is.c(this.f5110r, g02.f5110r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5108p;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f5109q;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i4 = hashCode + 527;
        String str3 = this.f5110r;
        return (((i4 * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.F0
    public final String toString() {
        return this.f4965o + ": domain=" + this.f5108p + ", description=" + this.f5109q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f4965o);
        parcel.writeString(this.f5108p);
        parcel.writeString(this.f5110r);
    }
}
