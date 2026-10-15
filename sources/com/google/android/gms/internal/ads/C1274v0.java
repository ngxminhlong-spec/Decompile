package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1274v0 implements InterfaceC0479cc {
    public static final Parcelable.Creator<C1274v0> CREATOR = new C0375a(3);

    /* renamed from: o, reason: collision with root package name */
    public final int f10962o;

    /* renamed from: p, reason: collision with root package name */
    public final String f10963p;

    /* renamed from: q, reason: collision with root package name */
    public final String f10964q;

    /* renamed from: r, reason: collision with root package name */
    public final int f10965r;

    /* renamed from: s, reason: collision with root package name */
    public final int f10966s;

    /* renamed from: t, reason: collision with root package name */
    public final int f10967t;

    /* renamed from: u, reason: collision with root package name */
    public final int f10968u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f10969v;

    public C1274v0(int i4, String str, String str2, int i5, int i6, int i7, int i8, byte[] bArr) {
        this.f10962o = i4;
        this.f10963p = str;
        this.f10964q = str2;
        this.f10965r = i5;
        this.f10966s = i6;
        this.f10967t = i7;
        this.f10968u = i8;
        this.f10969v = bArr;
    }

    public C1274v0(Parcel parcel) {
        this.f10962o = parcel.readInt();
        String readString = parcel.readString();
        int i4 = AbstractC0751is.f9071a;
        this.f10963p = readString;
        this.f10964q = parcel.readString();
        this.f10965r = parcel.readInt();
        this.f10966s = parcel.readInt();
        this.f10967t = parcel.readInt();
        this.f10968u = parcel.readInt();
        this.f10969v = parcel.createByteArray();
    }

    public static C1274v0 a(C1134rq c1134rq) {
        int h4 = c1134rq.h();
        String z4 = c1134rq.z(c1134rq.h(), AbstractC1480zs.f11691a);
        String z5 = c1134rq.z(c1134rq.h(), AbstractC1480zs.c);
        int h5 = c1134rq.h();
        int h6 = c1134rq.h();
        int h7 = c1134rq.h();
        int h8 = c1134rq.h();
        int h9 = c1134rq.h();
        byte[] bArr = new byte[h9];
        c1134rq.a(bArr, 0, h9);
        return new C1274v0(h4, z4, z5, h5, h6, h7, h8, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1274v0.class == obj.getClass()) {
            C1274v0 c1274v0 = (C1274v0) obj;
            if (this.f10962o == c1274v0.f10962o && this.f10963p.equals(c1274v0.f10963p) && this.f10964q.equals(c1274v0.f10964q) && this.f10965r == c1274v0.f10965r && this.f10966s == c1274v0.f10966s && this.f10967t == c1274v0.f10967t && this.f10968u == c1274v0.f10968u && Arrays.equals(this.f10969v, c1274v0.f10969v)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0479cc
    public final void g(C0365Ya c0365Ya) {
        c0365Ya.a(this.f10962o, this.f10969v);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10969v) + ((((((((((this.f10964q.hashCode() + ((this.f10963p.hashCode() + ((this.f10962o + 527) * 31)) * 31)) * 31) + this.f10965r) * 31) + this.f10966s) * 31) + this.f10967t) * 31) + this.f10968u) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f10963p + ", description=" + this.f10964q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f10962o);
        parcel.writeString(this.f10963p);
        parcel.writeString(this.f10964q);
        parcel.writeInt(this.f10965r);
        parcel.writeInt(this.f10966s);
        parcel.writeInt(this.f10967t);
        parcel.writeInt(this.f10968u);
        parcel.writeByteArray(this.f10969v);
    }
}
