package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import d3.AbstractC1654b;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.j7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0766j7 extends AbstractC1717a {
    public static final Parcelable.Creator<C0766j7> CREATOR = new C0375a(22);

    /* renamed from: o, reason: collision with root package name */
    public final int f9125o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f9126p;

    /* renamed from: q, reason: collision with root package name */
    public final int f9127q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f9128r;

    /* renamed from: s, reason: collision with root package name */
    public final int f9129s;

    /* renamed from: t, reason: collision with root package name */
    public final O1.R0 f9130t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f9131u;

    /* renamed from: v, reason: collision with root package name */
    public final int f9132v;

    /* renamed from: w, reason: collision with root package name */
    public final int f9133w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f9134x;
    public final int y;

    public C0766j7(int i4, boolean z4, int i5, boolean z5, int i6, O1.R0 r02, boolean z6, int i7, int i8, boolean z7, int i9) {
        this.f9125o = i4;
        this.f9126p = z4;
        this.f9127q = i5;
        this.f9128r = z5;
        this.f9129s = i6;
        this.f9130t = r02;
        this.f9131u = z6;
        this.f9132v = i7;
        this.f9134x = z7;
        this.f9133w = i8;
        this.y = i9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0766j7(K1.c r13) {
        /*
            r12 = this;
            boolean r2 = r13.f1053a
            int r3 = r13.f1054b
            boolean r4 = r13.d
            int r5 = r13.f1055e
            java.lang.Object r0 = r13.f1056f
            H1.p r0 = (H1.p) r0
            if (r0 == 0) goto L15
            O1.R0 r1 = new O1.R0
            r1.<init>(r0)
        L13:
            r6 = r1
            goto L17
        L15:
            r1 = 0
            goto L13
        L17:
            boolean r7 = r13.f1057g
            int r8 = r13.c
            r10 = 0
            r11 = 0
            r1 = 4
            r9 = 0
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0766j7.<init>(K1.c):void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f9125o);
        AbstractC1654b.f0(parcel, 2, 4);
        parcel.writeInt(this.f9126p ? 1 : 0);
        AbstractC1654b.f0(parcel, 3, 4);
        parcel.writeInt(this.f9127q);
        AbstractC1654b.f0(parcel, 4, 4);
        parcel.writeInt(this.f9128r ? 1 : 0);
        AbstractC1654b.f0(parcel, 5, 4);
        parcel.writeInt(this.f9129s);
        AbstractC1654b.U(parcel, 6, this.f9130t, i4);
        AbstractC1654b.f0(parcel, 7, 4);
        parcel.writeInt(this.f9131u ? 1 : 0);
        AbstractC1654b.f0(parcel, 8, 4);
        parcel.writeInt(this.f9132v);
        AbstractC1654b.f0(parcel, 9, 4);
        parcel.writeInt(this.f9133w);
        AbstractC1654b.f0(parcel, 10, 4);
        parcel.writeInt(this.f9134x ? 1 : 0);
        AbstractC1654b.f0(parcel, 11, 4);
        parcel.writeInt(this.y);
        AbstractC1654b.e0(parcel, a02);
    }
}
