package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ba, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0435ba extends AbstractC1717a {
    public static final Parcelable.Creator<C0435ba> CREATOR = new C0375a(28);

    /* renamed from: o, reason: collision with root package name */
    public final int f8240o;

    /* renamed from: p, reason: collision with root package name */
    public final int f8241p;

    /* renamed from: q, reason: collision with root package name */
    public final int f8242q;

    public C0435ba(int i4, int i5, int i6) {
        this.f8240o = i4;
        this.f8241p = i5;
        this.f8242q = i6;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0435ba)) {
            C0435ba c0435ba = (C0435ba) obj;
            if (c0435ba.f8242q == this.f8242q && c0435ba.f8241p == this.f8241p && c0435ba.f8240o == this.f8240o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f8240o, this.f8241p, this.f8242q});
    }

    public final String toString() {
        return this.f8240o + "." + this.f8241p + "." + this.f8242q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f8240o);
        AbstractC1654b.f0(parcel, 2, 4);
        parcel.writeInt(this.f8241p);
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(this.f8242q);
        AbstractC1654b.e0(parcel, a02);
    }
}
