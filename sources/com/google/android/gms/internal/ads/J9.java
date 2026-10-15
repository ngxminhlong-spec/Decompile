package com.google.android.gms.internal.ads;

import O1.InterfaceC0089t0;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class J9 extends AbstractBinderC1149s4 implements B9 {

    /* renamed from: o, reason: collision with root package name */
    public final com.google.ads.mediation.a f5787o;

    public J9(com.google.ads.mediation.a aVar) {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        this.f5787o = aVar;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final String C() {
        return (String) this.f5787o.f3838s;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final String D() {
        return this.f5787o.f3834o;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final boolean G() {
        return this.f5787o.f3836q;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final void I2(InterfaceC1812a interfaceC1812a) {
        this.f5787o.getClass();
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final void I3(InterfaceC1812a interfaceC1812a) {
        this.f5787o.getClass();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        com.google.ads.mediation.a aVar = this.f5787o;
        switch (i4) {
            case 2:
                String str = aVar.f3834o;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List t4 = t();
                parcel2.writeNoException();
                parcel2.writeList(t4);
                return true;
            case 4:
                String str2 = (String) aVar.f3837r;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 5:
                InterfaceC1109r7 l4 = l();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, l4);
                return true;
            case 6:
                String str3 = (String) aVar.f3838s;
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case 7:
                String str4 = (String) aVar.f3839t;
                parcel2.writeNoException();
                parcel2.writeString(str4);
                return true;
            case 8:
                double a4 = a();
                parcel2.writeNoException();
                parcel2.writeDouble(a4);
                return true;
            case 9:
                String str5 = (String) aVar.f3840u;
                parcel2.writeNoException();
                parcel2.writeString(str5);
                return true;
            case 10:
                String str6 = (String) aVar.f3841v;
                parcel2.writeNoException();
                parcel2.writeString(str6);
                return true;
            case 11:
                InterfaceC0089t0 j4 = j();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, j4);
                return true;
            case 12:
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC1192t4.f10673a;
                parcel2.writeStrongBinder(null);
                return true;
            case 13:
                q();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC1192t4.f10673a;
                parcel2.writeStrongBinder(null);
                return true;
            case 14:
                m();
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC1192t4.f10673a;
                parcel2.writeStrongBinder(null);
                return true;
            case 15:
                InterfaceC1812a n4 = n();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, n4);
                return true;
            case 16:
                Bundle bundle = (Bundle) aVar.f3833B;
                parcel2.writeNoException();
                AbstractC1192t4.d(parcel2, bundle);
                return true;
            case 17:
                boolean z4 = aVar.f3835p;
                parcel2.writeNoException();
                ClassLoader classLoader4 = AbstractC1192t4.f10673a;
                parcel2.writeInt(z4 ? 1 : 0);
                return true;
            case 18:
                boolean z5 = aVar.f3836q;
                parcel2.writeNoException();
                ClassLoader classLoader5 = AbstractC1192t4.f10673a;
                parcel2.writeInt(z5 ? 1 : 0);
                return true;
            case 19:
                w();
                parcel2.writeNoException();
                return true;
            case 20:
                InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                I2(G12);
                parcel2.writeNoException();
                return true;
            case 21:
                InterfaceC1812a G13 = BinderC1813b.G1(parcel.readStrongBinder());
                InterfaceC1812a G14 = BinderC1813b.G1(parcel.readStrongBinder());
                InterfaceC1812a G15 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                b3(G13, G14, G15);
                parcel2.writeNoException();
                return true;
            case 22:
                InterfaceC1812a G16 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                I3(G16);
                parcel2.writeNoException();
                return true;
            case 23:
                d();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 24:
                f();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 25:
                h();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final double a() {
        Double d = (Double) this.f5787o.y;
        if (d != null) {
            return d.doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final void b3(InterfaceC1812a interfaceC1812a, InterfaceC1812a interfaceC1812a2, InterfaceC1812a interfaceC1812a3) {
        View view = (View) BinderC1813b.C2(interfaceC1812a);
        this.f5787o.getClass();
        if (K1.f.f1061a.get(view) != null) {
            throw new ClassCastException();
        }
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final float d() {
        this.f5787o.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final float f() {
        this.f5787o.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final Bundle g() {
        return (Bundle) this.f5787o.f3833B;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final float h() {
        this.f5787o.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final InterfaceC0089t0 j() {
        InterfaceC0089t0 interfaceC0089t0;
        C0258Da c0258Da = (C0258Da) this.f5787o.f3844z;
        if (c0258Da == null) {
            return null;
        }
        synchronized (c0258Da.f4618p) {
            interfaceC0089t0 = (InterfaceC0089t0) c0258Da.f4619q;
        }
        return interfaceC0089t0;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final InterfaceC0895m7 k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final InterfaceC1109r7 l() {
        C1152s7 c1152s7 = (C1152s7) this.f5787o.f3843x;
        if (c1152s7 != null) {
            return new BinderC0682h7(c1152s7.f10585b, c1152s7.c, c1152s7.d, c1152s7.f10586e, c1152s7.f10587f);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final InterfaceC1812a m() {
        this.f5787o.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final InterfaceC1812a n() {
        Object obj = this.f5787o.f3832A;
        if (obj == null) {
            return null;
        }
        return new BinderC1813b(obj);
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final String o() {
        return (String) this.f5787o.f3839t;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final String p() {
        return (String) this.f5787o.f3837r;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final InterfaceC1812a q() {
        this.f5787o.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final String s() {
        return (String) this.f5787o.f3840u;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final List t() {
        List<C1152s7> list = (List) this.f5787o.f3842w;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (C1152s7 c1152s7 : list) {
                arrayList.add(new BinderC0682h7(c1152s7.f10585b, c1152s7.c, c1152s7.d, c1152s7.f10586e, c1152s7.f10587f));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final void w() {
        this.f5787o.getClass();
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final String x() {
        return (String) this.f5787o.f3841v;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final boolean z() {
        return this.f5787o.f3835p;
    }
}
