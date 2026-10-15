package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Kr extends AbstractC1717a {
    public static final Parcelable.Creator<Kr> CREATOR = new C0295Ka(17);

    /* renamed from: o, reason: collision with root package name */
    public final int f6073o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f6074p;

    /* renamed from: q, reason: collision with root package name */
    public final int f6075q;

    public Kr(byte[] bArr, int i4, int i5) {
        this.f6073o = i4;
        this.f6074p = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f6075q = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f6073o);
        AbstractC1654b.S(parcel, 2, this.f6074p);
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(this.f6075q);
        AbstractC1654b.e0(parcel, a02);
    }
}
