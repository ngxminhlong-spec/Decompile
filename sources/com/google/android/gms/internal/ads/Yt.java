package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Yt implements InterfaceC0479cc {
    public static final Parcelable.Creator<Yt> CREATOR = new C0295Ka(19);

    /* renamed from: o, reason: collision with root package name */
    public final float f7902o;

    /* renamed from: p, reason: collision with root package name */
    public final float f7903p;

    public Yt(float f4, float f5) {
        boolean z4 = false;
        if (f4 >= -90.0f && f4 <= 90.0f && f5 >= -180.0f && f5 <= 180.0f) {
            z4 = true;
        }
        Zf.S("Invalid latitude or longitude", z4);
        this.f7902o = f4;
        this.f7903p = f5;
    }

    public /* synthetic */ Yt(Parcel parcel) {
        this.f7902o = parcel.readFloat();
        this.f7903p = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Yt.class == obj.getClass()) {
            Yt yt = (Yt) obj;
            if (this.f7902o == yt.f7902o && this.f7903p == yt.f7903p) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0479cc
    public final /* synthetic */ void g(C0365Ya c0365Ya) {
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f7902o).hashCode() + 527) * 31) + Float.valueOf(this.f7903p).hashCode();
    }

    public final String toString() {
        return "xyz: latitude=" + this.f7902o + ", longitude=" + this.f7903p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeFloat(this.f7902o);
        parcel.writeFloat(this.f7903p);
    }
}
