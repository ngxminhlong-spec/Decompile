package com.google.android.gms.internal.ads;

import O1.InterfaceC0089t0;
import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.sj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1170sj extends AbstractBinderC1149s4 implements A7 {

    /* renamed from: o, reason: collision with root package name */
    public final String f10624o;

    /* renamed from: p, reason: collision with root package name */
    public final C1427yi f10625p;

    /* renamed from: q, reason: collision with root package name */
    public final Ci f10626q;

    public BinderC1170sj(String str, C1427yi c1427yi, Ci ci) {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        this.f10624o = str;
        this.f10625p = c1427yi;
        this.f10626q = ci;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        InterfaceC1109r7 interfaceC1109r7;
        switch (i4) {
            case 2:
                BinderC1813b binderC1813b = new BinderC1813b(this.f10625p);
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, binderC1813b);
                return true;
            case 3:
                String b4 = this.f10626q.b();
                parcel2.writeNoException();
                parcel2.writeString(b4);
                return true;
            case 4:
                List f4 = this.f10626q.f();
                parcel2.writeNoException();
                parcel2.writeList(f4);
                return true;
            case 5:
                String W4 = this.f10626q.W();
                parcel2.writeNoException();
                parcel2.writeString(W4);
                return true;
            case 6:
                Ci ci = this.f10626q;
                synchronized (ci) {
                    interfaceC1109r7 = ci.f4519t;
                }
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, interfaceC1109r7);
                return true;
            case 7:
                String X4 = this.f10626q.X();
                parcel2.writeNoException();
                parcel2.writeString(X4);
                return true;
            case 8:
                String V4 = this.f10626q.V();
                parcel2.writeNoException();
                parcel2.writeString(V4);
                return true;
            case 9:
                Bundle E4 = this.f10626q.E();
                parcel2.writeNoException();
                AbstractC1192t4.d(parcel2, E4);
                return true;
            case 10:
                this.f10625p.x();
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC0089t0 J4 = this.f10626q.J();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, J4);
                return true;
            case 12:
                Bundle bundle = (Bundle) AbstractC1192t4.a(parcel, Bundle.CREATOR);
                AbstractC1192t4.b(parcel);
                this.f10625p.f(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) AbstractC1192t4.a(parcel, Bundle.CREATOR);
                AbstractC1192t4.b(parcel);
                boolean o4 = this.f10625p.o(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(o4 ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) AbstractC1192t4.a(parcel, Bundle.CREATOR);
                AbstractC1192t4.b(parcel);
                this.f10625p.i(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC0895m7 L4 = this.f10626q.L();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, L4);
                return true;
            case 16:
                InterfaceC1812a T4 = this.f10626q.T();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, T4);
                return true;
            case 17:
                String str = this.f10624o;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
