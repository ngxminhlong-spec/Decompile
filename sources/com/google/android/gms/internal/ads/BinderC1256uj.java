package com.google.android.gms.internal.ads;

import O1.C0056c0;
import O1.InterfaceC0060e0;
import O1.InterfaceC0074l0;
import O1.InterfaceC0084q0;
import O1.InterfaceC0089t0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.uj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1256uj extends AbstractBinderC1149s4 implements T7 {

    /* renamed from: o, reason: collision with root package name */
    public final String f10922o;

    /* renamed from: p, reason: collision with root package name */
    public final C1427yi f10923p;

    /* renamed from: q, reason: collision with root package name */
    public final Ci f10924q;

    /* renamed from: r, reason: collision with root package name */
    public final C0658gk f10925r;

    public BinderC1256uj(String str, C1427yi c1427yi, Ci ci, C0658gk c0658gk) {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        this.f10922o = str;
        this.f10923p = c1427yi;
        this.f10924q = ci;
        this.f10925r = c0658gk;
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final String D() {
        return this.f10924q.c();
    }

    public final void G() {
        C1427yi c1427yi = this.f10923p;
        synchronized (c1427yi) {
            AbstractBinderC1149s4 abstractBinderC1149s4 = c1427yi.f11445u;
            if (abstractBinderC1149s4 == null) {
                Y9.m("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            } else {
                c1427yi.f11434j.execute(new N1.f(c1427yi, abstractBinderC1149s4 instanceof Ii, 1));
            }
        }
    }

    public final boolean G2() {
        List list;
        Ci ci = this.f10924q;
        synchronized (ci) {
            list = ci.f4505f;
        }
        return (list.isEmpty() || ci.K() == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.r4] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.ads.r4] */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        R7 r7 = null;
        C0056c0 c0056c0 = null;
        switch (i4) {
            case 2:
                String b4 = this.f10924q.b();
                parcel2.writeNoException();
                parcel2.writeString(b4);
                return true;
            case 3:
                List f4 = this.f10924q.f();
                parcel2.writeNoException();
                parcel2.writeList(f4);
                return true;
            case 4:
                String W4 = this.f10924q.W();
                parcel2.writeNoException();
                parcel2.writeString(W4);
                return true;
            case 5:
                InterfaceC1109r7 M4 = this.f10924q.M();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, M4);
                return true;
            case 6:
                String X4 = this.f10924q.X();
                parcel2.writeNoException();
                parcel2.writeString(X4);
                return true;
            case 7:
                String V4 = this.f10924q.V();
                parcel2.writeNoException();
                parcel2.writeString(V4);
                return true;
            case 8:
                double v4 = this.f10924q.v();
                parcel2.writeNoException();
                parcel2.writeDouble(v4);
                return true;
            case 9:
                String d = this.f10924q.d();
                parcel2.writeNoException();
                parcel2.writeString(d);
                return true;
            case 10:
                String c = this.f10924q.c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 11:
                InterfaceC0089t0 J4 = this.f10924q.J();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, J4);
                return true;
            case 12:
                String str = this.f10922o;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                this.f10923p.x();
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC0895m7 L4 = this.f10924q.L();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, L4);
                return true;
            case 15:
                Bundle bundle = (Bundle) AbstractC1192t4.a(parcel, Bundle.CREATOR);
                AbstractC1192t4.b(parcel);
                this.f10923p.f(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) AbstractC1192t4.a(parcel, Bundle.CREATOR);
                AbstractC1192t4.b(parcel);
                boolean o4 = this.f10923p.o(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(o4 ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) AbstractC1192t4.a(parcel, Bundle.CREATOR);
                AbstractC1192t4.b(parcel);
                this.f10923p.i(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                InterfaceC1812a q4 = q();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, q4);
                return true;
            case 19:
                InterfaceC1812a T4 = this.f10924q.T();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, T4);
                return true;
            case 20:
                Bundle E4 = this.f10924q.E();
                parcel2.writeNoException();
                AbstractC1192t4.d(parcel2, E4);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    r7 = queryLocalInterface instanceof R7 ? (R7) queryLocalInterface : new AbstractC1106r4(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener", 0);
                }
                AbstractC1192t4.b(parcel);
                M3(r7);
                parcel2.writeNoException();
                return true;
            case 22:
                this.f10923p.B();
                parcel2.writeNoException();
                return true;
            case 23:
                List t4 = t();
                parcel2.writeNoException();
                parcel2.writeList(t4);
                return true;
            case 24:
                boolean G22 = G2();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC1192t4.f10673a;
                parcel2.writeInt(G22 ? 1 : 0);
                return true;
            case 25:
                InterfaceC0060e0 K32 = O1.F0.K3(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                O3(K32);
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    c0056c0 = queryLocalInterface2 instanceof C0056c0 ? (C0056c0) queryLocalInterface2 : new AbstractC1106r4(readStrongBinder2, "com.google.android.gms.ads.internal.client.IMuteThisAdListener", 0);
                }
                AbstractC1192t4.b(parcel);
                L3(c0056c0);
                parcel2.writeNoException();
                return true;
            case 27:
                K3();
                parcel2.writeNoException();
                return true;
            case 28:
                G();
                parcel2.writeNoException();
                return true;
            case 29:
                InterfaceC1024p7 a4 = this.f10923p.f11430C.a();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, a4);
                return true;
            case 30:
                boolean N32 = N3();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC1192t4.f10673a;
                parcel2.writeInt(N32 ? 1 : 0);
                return true;
            case 31:
                InterfaceC0084q0 h4 = h();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, h4);
                return true;
            case 32:
                InterfaceC0074l0 K33 = O1.O0.K3(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                try {
                    if (!K33.d()) {
                        this.f10925r.b();
                    }
                } catch (RemoteException e4) {
                    Y9.o("Error in making CSI ping for reporting paid event callback", e4);
                }
                C1427yi c1427yi = this.f10923p;
                synchronized (c1427yi) {
                    c1427yi.f11431D.f4544o.set(K33);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public final void K3() {
        C1427yi c1427yi = this.f10923p;
        synchronized (c1427yi) {
            c1427yi.f11436l.t();
        }
    }

    public final void L3(C0056c0 c0056c0) {
        C1427yi c1427yi = this.f10923p;
        synchronized (c1427yi) {
            c1427yi.f11436l.d(c0056c0);
        }
    }

    public final void M3(R7 r7) {
        C1427yi c1427yi = this.f10923p;
        synchronized (c1427yi) {
            c1427yi.f11436l.p(r7);
        }
    }

    public final boolean N3() {
        boolean z4;
        C1427yi c1427yi = this.f10923p;
        synchronized (c1427yi) {
            z4 = c1427yi.f11436l.z();
        }
        return z4;
    }

    public final void O3(InterfaceC0060e0 interfaceC0060e0) {
        C1427yi c1427yi = this.f10923p;
        synchronized (c1427yi) {
            c1427yi.f11436l.n(interfaceC0060e0);
        }
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final double a() {
        return this.f10924q.v();
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final InterfaceC0089t0 f() {
        return this.f10924q.J();
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final InterfaceC0895m7 g() {
        return this.f10924q.L();
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final InterfaceC0084q0 h() {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.V5)).booleanValue()) {
            return this.f10923p.f7861f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final InterfaceC1109r7 k() {
        return this.f10924q.M();
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final InterfaceC1812a l() {
        return this.f10924q.T();
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final String m() {
        return this.f10924q.V();
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final String n() {
        return this.f10924q.W();
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final String o() {
        return this.f10924q.X();
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final String p() {
        return this.f10924q.b();
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final InterfaceC1812a q() {
        return new BinderC1813b(this.f10923p);
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final List s() {
        return this.f10924q.f();
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final List t() {
        List list;
        Ci ci = this.f10924q;
        synchronized (ci) {
            list = ci.f4505f;
        }
        return (list.isEmpty() || ci.K() == null) ? Collections.EMPTY_LIST : this.f10924q.g();
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final String x() {
        return this.f10924q.d();
    }
}
