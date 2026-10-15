package com.google.android.gms.internal.ads;

import Q1.C0116o;
import Q1.C0117p;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.fl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0616fl extends AbstractBinderC1149s4 implements InterfaceC0360Xa {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0702hl f8730o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0616fl(AbstractC0702hl abstractC0702hl) {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
        this.f8730o = abstractC0702hl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0360Xa
    public final void J(ParcelFileDescriptor parcelFileDescriptor) {
        this.f8730o.f8979o.b(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC1192t4.a(parcel, ParcelFileDescriptor.CREATOR);
            AbstractC1192t4.b(parcel);
            J(parcelFileDescriptor);
        } else {
            if (i4 != 2) {
                return false;
            }
            C0117p c0117p = (C0117p) AbstractC1192t4.a(parcel, C0117p.CREATOR);
            AbstractC1192t4.b(parcel);
            c0(c0117p);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0360Xa
    public final void c0(C0117p c0117p) {
        C0272Fc c0272Fc = this.f8730o.f8979o;
        c0117p.getClass();
        c0272Fc.c(new C0116o(c0117p.f1721o, c0117p.f1722p));
    }
}
