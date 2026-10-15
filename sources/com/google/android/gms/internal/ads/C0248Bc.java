package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Bc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248Bc extends AbstractC1717a {
    public static final Parcelable.Creator<C0248Bc> CREATOR = new C0295Ka(11);

    /* renamed from: o, reason: collision with root package name */
    public final String f4084o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4085p;

    /* renamed from: q, reason: collision with root package name */
    public final int f4086q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4087r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f4088s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0248Bc(int r9, int r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            if (r11 == 0) goto L5
            java.lang.String r0 = "0"
            goto L7
        L5:
            java.lang.String r0 = "1"
        L7:
            java.lang.String r1 = "afma-sdk-a-v"
            java.lang.String r2 = "."
            java.lang.StringBuilder r1 = U.a.m(r1, r9, r2, r10, r2)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0248Bc.<init>(int, int, boolean, boolean):void");
    }

    public C0248Bc(int i4, boolean z4) {
        this(234310000, i4, true, z4);
    }

    public C0248Bc(String str, int i4, int i5, boolean z4, boolean z5) {
        this.f4084o = str;
        this.f4085p = i4;
        this.f4086q = i5;
        this.f4087r = z4;
        this.f4088s = z5;
    }

    public static C0248Bc h() {
        return new C0248Bc(12451000, 12451000, true, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.V(parcel, 2, this.f4084o);
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(this.f4085p);
        AbstractC1654b.f0(parcel, 4, 4);
        parcel.writeInt(this.f4086q);
        AbstractC1654b.f0(parcel, 5, 4);
        parcel.writeInt(this.f4087r ? 1 : 0);
        AbstractC1654b.f0(parcel, 6, 4);
        parcel.writeInt(this.f4088s ? 1 : 0);
        AbstractC1654b.e0(parcel, a02);
    }
}
