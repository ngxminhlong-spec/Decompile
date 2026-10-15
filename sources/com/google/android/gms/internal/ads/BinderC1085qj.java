package com.google.android.gms.internal.ads;

import O1.InterfaceC0089t0;
import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.qj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1085qj extends AbstractBinderC1149s4 implements InterfaceC1453z7 {

    /* renamed from: o, reason: collision with root package name */
    public final String f10393o;

    /* renamed from: p, reason: collision with root package name */
    public final C1427yi f10394p;

    /* renamed from: q, reason: collision with root package name */
    public final Ci f10395q;

    public BinderC1085qj(String str, C1427yi c1427yi, Ci ci) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        this.f10393o = str;
        this.f10394p = c1427yi;
        this.f10395q = ci;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        C1427yi c1427yi = this.f10394p;
        Ci ci = this.f10395q;
        switch (i4) {
            case 2:
                BinderC1813b binderC1813b = new BinderC1813b(c1427yi);
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, binderC1813b);
                return true;
            case 3:
                String b4 = ci.b();
                parcel2.writeNoException();
                parcel2.writeString(b4);
                return true;
            case 4:
                List f4 = ci.f();
                parcel2.writeNoException();
                parcel2.writeList(f4);
                return true;
            case 5:
                String W4 = ci.W();
                parcel2.writeNoException();
                parcel2.writeString(W4);
                return true;
            case 6:
                InterfaceC1109r7 M4 = ci.M();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, M4);
                return true;
            case 7:
                String X4 = ci.X();
                parcel2.writeNoException();
                parcel2.writeString(X4);
                return true;
            case 8:
                double v4 = ci.v();
                parcel2.writeNoException();
                parcel2.writeDouble(v4);
                return true;
            case 9:
                String d = ci.d();
                parcel2.writeNoException();
                parcel2.writeString(d);
                return true;
            case 10:
                String c = ci.c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 11:
                Bundle E4 = ci.E();
                parcel2.writeNoException();
                AbstractC1192t4.d(parcel2, E4);
                return true;
            case 12:
                c1427yi.x();
                parcel2.writeNoException();
                return true;
            case 13:
                InterfaceC0089t0 J4 = ci.J();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, J4);
                return true;
            case 14:
                Bundle bundle = (Bundle) AbstractC1192t4.a(parcel, Bundle.CREATOR);
                AbstractC1192t4.b(parcel);
                c1427yi.f(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) AbstractC1192t4.a(parcel, Bundle.CREATOR);
                AbstractC1192t4.b(parcel);
                boolean o4 = c1427yi.o(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(o4 ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) AbstractC1192t4.a(parcel, Bundle.CREATOR);
                AbstractC1192t4.b(parcel);
                c1427yi.i(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                InterfaceC0895m7 L4 = ci.L();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, L4);
                return true;
            case 18:
                InterfaceC1812a T4 = ci.T();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, T4);
                return true;
            case 19:
                parcel2.writeNoException();
                parcel2.writeString(this.f10393o);
                return true;
            default:
                return false;
        }
    }
}
