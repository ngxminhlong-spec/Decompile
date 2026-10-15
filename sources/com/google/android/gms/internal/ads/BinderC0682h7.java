package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.h7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0682h7 extends AbstractBinderC1149s4 implements InterfaceC1109r7 {

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f8923o;

    /* renamed from: p, reason: collision with root package name */
    public final Uri f8924p;

    /* renamed from: q, reason: collision with root package name */
    public final double f8925q;

    /* renamed from: r, reason: collision with root package name */
    public final int f8926r;

    /* renamed from: s, reason: collision with root package name */
    public final int f8927s;

    public BinderC0682h7(Drawable drawable, Uri uri, double d, int i4, int i5) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.f8923o = drawable;
        this.f8924p = uri;
        this.f8925q = d;
        this.f8926r = i4;
        this.f8927s = i5;
    }

    public static InterfaceC1109r7 K3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof InterfaceC1109r7 ? (InterfaceC1109r7) queryLocalInterface : new C1067q7(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            InterfaceC1812a d = d();
            parcel2.writeNoException();
            AbstractC1192t4.e(parcel2, d);
            return true;
        }
        if (i4 == 2) {
            parcel2.writeNoException();
            AbstractC1192t4.d(parcel2, this.f8924p);
            return true;
        }
        if (i4 == 3) {
            parcel2.writeNoException();
            parcel2.writeDouble(this.f8925q);
            return true;
        }
        if (i4 == 4) {
            parcel2.writeNoException();
            parcel2.writeInt(this.f8926r);
            return true;
        }
        if (i4 != 5) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f8927s);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1109r7
    public final Uri a() {
        return this.f8924p;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1109r7
    public final double c() {
        return this.f8925q;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1109r7
    public final InterfaceC1812a d() {
        return new BinderC1813b(this.f8923o);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1109r7
    public final int e() {
        return this.f8927s;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1109r7
    public final int i() {
        return this.f8926r;
    }
}
