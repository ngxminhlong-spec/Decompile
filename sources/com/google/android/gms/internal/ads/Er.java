package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Er extends AbstractC1717a {
    public static final Parcelable.Creator<Er> CREATOR = new C0295Ka(13);

    /* renamed from: o, reason: collision with root package name */
    public final int f4952o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f4953p;

    public Er(int i4, byte[] bArr) {
        this.f4952o = i4;
        this.f4953p = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f4952o);
        AbstractC1654b.S(parcel, 2, this.f4953p);
        AbstractC1654b.e0(parcel, a02);
    }
}
