package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1445z implements Parcelable {
    public static final Parcelable.Creator<C1445z> CREATOR = new C0375a(1);

    /* renamed from: o, reason: collision with root package name */
    public int f11557o;

    /* renamed from: p, reason: collision with root package name */
    public final UUID f11558p;

    /* renamed from: q, reason: collision with root package name */
    public final String f11559q;

    /* renamed from: r, reason: collision with root package name */
    public final String f11560r;

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f11561s;

    public C1445z(Parcel parcel) {
        this.f11558p = new UUID(parcel.readLong(), parcel.readLong());
        this.f11559q = parcel.readString();
        String readString = parcel.readString();
        int i4 = AbstractC0751is.f9071a;
        this.f11560r = readString;
        this.f11561s = parcel.createByteArray();
    }

    public C1445z(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f11558p = uuid;
        this.f11559q = null;
        this.f11560r = str;
        this.f11561s = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1445z)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C1445z c1445z = (C1445z) obj;
        return AbstractC0751is.c(this.f11559q, c1445z.f11559q) && AbstractC0751is.c(this.f11560r, c1445z.f11560r) && AbstractC0751is.c(this.f11558p, c1445z.f11558p) && Arrays.equals(this.f11561s, c1445z.f11561s);
    }

    public final int hashCode() {
        int i4 = this.f11557o;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = this.f11558p.hashCode() * 31;
        String str = this.f11559q;
        int hashCode2 = Arrays.hashCode(this.f11561s) + ((this.f11560r.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        this.f11557o = hashCode2;
        return hashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        UUID uuid = this.f11558p;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f11559q);
        parcel.writeString(this.f11560r);
        parcel.writeByteArray(this.f11561s);
    }
}
