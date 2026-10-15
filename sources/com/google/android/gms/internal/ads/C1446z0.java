package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1446z0 extends F0 {
    public static final Parcelable.Creator<C1446z0> CREATOR = new C0375a(7);

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f11562p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1446z0(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.AbstractC0751is.f9071a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f11562p = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1446z0.<init>(android.os.Parcel):void");
    }

    public C1446z0(String str, byte[] bArr) {
        super(str);
        this.f11562p = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1446z0.class == obj.getClass()) {
            C1446z0 c1446z0 = (C1446z0) obj;
            if (this.f4965o.equals(c1446z0.f4965o) && Arrays.equals(this.f11562p, c1446z0.f11562p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11562p) + ((this.f4965o.hashCode() + 527) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f4965o);
        parcel.writeByteArray(this.f11562p);
    }
}
