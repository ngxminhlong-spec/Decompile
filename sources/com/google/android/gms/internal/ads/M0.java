package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class M0 implements InterfaceC0479cc {
    public static final Parcelable.Creator<M0> CREATOR = new C0375a(18);

    /* renamed from: o, reason: collision with root package name */
    public final float f6190o;

    /* renamed from: p, reason: collision with root package name */
    public final int f6191p;

    public M0(int i4, float f4) {
        this.f6190o = f4;
        this.f6191p = i4;
    }

    public /* synthetic */ M0(Parcel parcel) {
        this.f6190o = parcel.readFloat();
        this.f6191p = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && M0.class == obj.getClass()) {
            M0 m02 = (M0) obj;
            if (this.f6190o == m02.f6190o && this.f6191p == m02.f6191p) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0479cc
    public final /* synthetic */ void g(C0365Ya c0365Ya) {
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f6190o).hashCode() + 527) * 31) + this.f6191p;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f6190o + ", svcTemporalLayerCount=" + this.f6191p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeFloat(this.f6190o);
        parcel.writeInt(this.f6191p);
    }
}
