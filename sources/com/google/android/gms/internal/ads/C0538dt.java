package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.dt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0538dt implements InterfaceC0479cc {
    public static final Parcelable.Creator<C0538dt> CREATOR = new C0295Ka(18);

    /* renamed from: o, reason: collision with root package name */
    public final String f8521o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f8522p;

    /* renamed from: q, reason: collision with root package name */
    public final int f8523q;

    /* renamed from: r, reason: collision with root package name */
    public final int f8524r;

    public /* synthetic */ C0538dt(Parcel parcel) {
        String readString = parcel.readString();
        int i4 = AbstractC0751is.f9071a;
        this.f8521o = readString;
        this.f8522p = parcel.createByteArray();
        this.f8523q = parcel.readInt();
        this.f8524r = parcel.readInt();
    }

    public C0538dt(String str, byte[] bArr, int i4, int i5) {
        this.f8521o = str;
        this.f8522p = bArr;
        this.f8523q = i4;
        this.f8524r = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0538dt.class == obj.getClass()) {
            C0538dt c0538dt = (C0538dt) obj;
            if (this.f8521o.equals(c0538dt.f8521o) && Arrays.equals(this.f8522p, c0538dt.f8522p) && this.f8523q == c0538dt.f8523q && this.f8524r == c0538dt.f8524r) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0479cc
    public final /* synthetic */ void g(C0365Ya c0365Ya) {
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f8522p) + ((this.f8521o.hashCode() + 527) * 31)) * 31) + this.f8523q) * 31) + this.f8524r;
    }

    public final String toString() {
        String str;
        byte[] bArr = this.f8522p;
        int i4 = this.f8524r;
        if (i4 != 1) {
            if (i4 == 23) {
                int i5 = AbstractC0751is.f9071a;
                Zf.O(bArr.length == 4);
                str = String.valueOf(Float.intBitsToFloat((bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8)));
            } else if (i4 != 67) {
                int length = bArr.length;
                StringBuilder sb = new StringBuilder(length + length);
                for (int i6 = 0; i6 < bArr.length; i6++) {
                    sb.append(Character.forDigit((bArr[i6] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr[i6] & 15, 16));
                }
                str = sb.toString();
            } else {
                int i7 = AbstractC0751is.f9071a;
                Zf.O(bArr.length == 4);
                str = String.valueOf(bArr[3] | (bArr[0] << 24) | (bArr[1] << 16) | (bArr[2] << 8));
            }
        } else {
            str = new String(bArr, AbstractC1480zs.c);
        }
        return "mdta: key=" + this.f8521o + ", value=" + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f8521o);
        parcel.writeByteArray(this.f8522p);
        parcel.writeInt(this.f8523q);
        parcel.writeInt(this.f8524r);
    }
}
