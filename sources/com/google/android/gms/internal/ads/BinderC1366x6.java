package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.View;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.x6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1366x6 extends AbstractBinderC1149s4 {

    /* renamed from: o, reason: collision with root package name */
    public final N1.e f11239o;

    /* renamed from: p, reason: collision with root package name */
    public final String f11240p;

    /* renamed from: q, reason: collision with root package name */
    public final String f11241q;

    public BinderC1366x6(N1.e eVar, String str, String str2) {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
        this.f11239o = eVar;
        this.f11240p = str;
        this.f11241q = str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f11240p);
            return true;
        }
        if (i4 == 2) {
            parcel2.writeNoException();
            parcel2.writeString(this.f11241q);
            return true;
        }
        N1.e eVar = this.f11239o;
        if (i4 == 3) {
            InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
            AbstractC1192t4.b(parcel);
            if (G12 != null) {
                eVar.f((View) BinderC1813b.C2(G12));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i4 == 4) {
            eVar.c();
            parcel2.writeNoException();
            return true;
        }
        if (i4 != 5) {
            return false;
        }
        eVar.e();
        parcel2.writeNoException();
        return true;
    }
}
