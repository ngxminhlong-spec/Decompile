package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Hr extends AbstractC1717a {
    public static final Parcelable.Creator<Hr> CREATOR = new C0295Ka(15);

    /* renamed from: o, reason: collision with root package name */
    public final int f5512o;

    /* renamed from: p, reason: collision with root package name */
    public C0977o3 f5513p = null;

    /* renamed from: q, reason: collision with root package name */
    public byte[] f5514q;

    public Hr(int i4, byte[] bArr) {
        this.f5512o = i4;
        this.f5514q = bArr;
        h();
    }

    public final void h() {
        C0977o3 c0977o3 = this.f5513p;
        if (c0977o3 != null || this.f5514q == null) {
            if (c0977o3 == null || this.f5514q != null) {
                if (c0977o3 != null && this.f5514q != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (c0977o3 != null || this.f5514q != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f5512o);
        byte[] bArr = this.f5514q;
        if (bArr == null) {
            bArr = this.f5513p.e();
        }
        AbstractC1654b.S(parcel, 2, bArr);
        AbstractC1654b.e0(parcel, a02);
    }
}
