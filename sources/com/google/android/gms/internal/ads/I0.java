package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class I0 extends F0 {
    public static final Parcelable.Creator<I0> CREATOR = new C0375a(14);

    /* renamed from: p, reason: collision with root package name */
    public final String f5521p;

    /* renamed from: q, reason: collision with root package name */
    public final byte[] f5522q;

    public I0(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i4 = AbstractC0751is.f9071a;
        this.f5521p = readString;
        this.f5522q = parcel.createByteArray();
    }

    public I0(String str, byte[] bArr) {
        super("PRIV");
        this.f5521p = str;
        this.f5522q = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && I0.class == obj.getClass()) {
            I0 i02 = (I0) obj;
            if (AbstractC0751is.c(this.f5521p, i02.f5521p) && Arrays.equals(this.f5522q, i02.f5522q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5521p;
        return Arrays.hashCode(this.f5522q) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.F0
    public final String toString() {
        return this.f4965o + ": owner=" + this.f5521p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f5521p);
        parcel.writeByteArray(this.f5522q);
    }
}
