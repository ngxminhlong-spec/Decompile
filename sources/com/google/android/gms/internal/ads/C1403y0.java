package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1403y0 extends F0 {
    public static final Parcelable.Creator<C1403y0> CREATOR = new C0375a(6);

    /* renamed from: p, reason: collision with root package name */
    public final String f11321p;

    /* renamed from: q, reason: collision with root package name */
    public final String f11322q;

    /* renamed from: r, reason: collision with root package name */
    public final int f11323r;

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f11324s;

    public C1403y0(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i4 = AbstractC0751is.f9071a;
        this.f11321p = readString;
        this.f11322q = parcel.readString();
        this.f11323r = parcel.readInt();
        this.f11324s = parcel.createByteArray();
    }

    public C1403y0(String str, String str2, int i4, byte[] bArr) {
        super("APIC");
        this.f11321p = str;
        this.f11322q = str2;
        this.f11323r = i4;
        this.f11324s = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1403y0.class == obj.getClass()) {
            C1403y0 c1403y0 = (C1403y0) obj;
            if (this.f11323r == c1403y0.f11323r && AbstractC0751is.c(this.f11321p, c1403y0.f11321p) && AbstractC0751is.c(this.f11322q, c1403y0.f11322q) && Arrays.equals(this.f11324s, c1403y0.f11324s)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.F0, com.google.android.gms.internal.ads.InterfaceC0479cc
    public final void g(C0365Ya c0365Ya) {
        c0365Ya.a(this.f11323r, this.f11324s);
    }

    public final int hashCode() {
        String str = this.f11321p;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f11322q;
        return Arrays.hashCode(this.f11324s) + ((((((this.f11323r + 527) * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.F0
    public final String toString() {
        return this.f4965o + ": mimeType=" + this.f11321p + ", description=" + this.f11322q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f11321p);
        parcel.writeString(this.f11322q);
        parcel.writeInt(this.f11323r);
        parcel.writeByteArray(this.f11324s);
    }
}
