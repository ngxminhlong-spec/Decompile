package com.google.android.gms.internal.ads;

import O1.InterfaceC0089t0;
import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1213tj extends AbstractBinderC1149s4 implements C7 {

    /* renamed from: o, reason: collision with root package name */
    public final Context f10717o;

    /* renamed from: p, reason: collision with root package name */
    public final Ci f10718p;

    /* renamed from: q, reason: collision with root package name */
    public Ki f10719q;

    /* renamed from: r, reason: collision with root package name */
    public C1427yi f10720r;

    public BinderC1213tj(Context context, Ci ci, Ki ki, C1427yi c1427yi) {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        this.f10717o = context;
        this.f10718p = ci;
        this.f10719q = ki;
        this.f10720r = c1427yi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.util.Map, r.i] */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        String str;
        List<String> arrayList;
        C1427yi c1427yi;
        InterfaceC1024p7 interfaceC1024p7 = null;
        int i5 = 0;
        switch (i4) {
            case 1:
                String readString = parcel.readString();
                AbstractC1192t4.b(parcel);
                String str2 = (String) this.f10718p.I().get(readString);
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 2:
                String readString2 = parcel.readString();
                AbstractC1192t4.b(parcel);
                InterfaceC1109r7 interfaceC1109r7 = (InterfaceC1109r7) this.f10718p.H().get(readString2);
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, interfaceC1109r7);
                return true;
            case 3:
                Ci ci = this.f10718p;
                try {
                    r.i H3 = ci.H();
                    r.i I4 = ci.I();
                    String[] strArr = new String[H3.f14741q + I4.f14741q];
                    int i6 = 0;
                    for (int i7 = 0; i7 < H3.f14741q; i7++) {
                        strArr[i6] = (String) H3.f(i7);
                        i6++;
                    }
                    while (i5 < I4.f14741q) {
                        strArr[i6] = (String) I4.f(i5);
                        i6++;
                        i5++;
                    }
                    arrayList = Arrays.asList(strArr);
                } catch (NullPointerException e4) {
                    N1.n.f1204A.f1209g.h("InternalNativeCustomTemplateAdShim.getAvailableAssetNames", e4);
                    arrayList = new ArrayList<>();
                }
                parcel2.writeNoException();
                parcel2.writeStringList(arrayList);
                return true;
            case 4:
                String a4 = this.f10718p.a();
                parcel2.writeNoException();
                parcel2.writeString(a4);
                return true;
            case 5:
                String readString3 = parcel.readString();
                AbstractC1192t4.b(parcel);
                C1427yi c1427yi2 = this.f10720r;
                if (c1427yi2 != null) {
                    c1427yi2.e(readString3);
                }
                parcel2.writeNoException();
                return true;
            case 6:
                n();
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC0089t0 J4 = this.f10718p.J();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, J4);
                return true;
            case 8:
                C1427yi c1427yi3 = this.f10720r;
                if (c1427yi3 != null) {
                    c1427yi3.x();
                }
                this.f10720r = null;
                this.f10719q = null;
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC1812a f4 = f();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, f4);
                return true;
            case 10:
                InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                boolean X4 = X(G12);
                parcel2.writeNoException();
                parcel2.writeInt(X4 ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC1192t4.f10673a;
                parcel2.writeStrongBinder(null);
                return true;
            case 12:
                Ci ci2 = this.f10718p;
                C1427yi c1427yi4 = this.f10720r;
                if ((c1427yi4 == null || c1427yi4.f11438n.c()) && ci2.P() != null && ci2.Q() == null) {
                    i5 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC1192t4.f10673a;
                parcel2.writeInt(i5);
                return true;
            case 13:
                Ci ci3 = this.f10718p;
                Pq S4 = ci3.S();
                if (S4 != null) {
                    N1.n.f1204A.f1224v.getClass();
                    C0347Uc.m(S4);
                    if (ci3.P() != null) {
                        ci3.P().b("onSdkLoaded", new r.i(0));
                    }
                    i5 = 1;
                } else {
                    Y9.s("Trying to start OMID session before creation.");
                }
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC1192t4.f10673a;
                parcel2.writeInt(i5);
                return true;
            case 14:
                InterfaceC1812a G13 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                Object C22 = BinderC1813b.C2(G13);
                if ((C22 instanceof View) && this.f10718p.S() != null && (c1427yi = this.f10720r) != null) {
                    c1427yi.g((View) C22);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                try {
                    Ci ci4 = this.f10718p;
                    synchronized (ci4) {
                        str = ci4.y;
                    }
                } catch (NullPointerException e5) {
                    N1.n.f1204A.f1209g.h("InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement", e5);
                }
                if (str != "Google" && (str == null || !str.equals("Google"))) {
                    if (TextUtils.isEmpty(str)) {
                        Y9.s("Not starting OMID session. OM partner name has not been configured.");
                    } else {
                        C1427yi c1427yi5 = this.f10720r;
                        if (c1427yi5 != null) {
                            c1427yi5.y(str, false);
                        }
                    }
                    parcel2.writeNoException();
                    return true;
                }
                Y9.s("Illegal argument specified for omid partner name.");
                parcel2.writeNoException();
                return true;
            case 16:
                try {
                    interfaceC1024p7 = this.f10720r.f11430C.a();
                } catch (NullPointerException e6) {
                    N1.n.f1204A.f1209g.h("InternalNativeCustomTemplateAdShim.getMediaContent", e6);
                }
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, interfaceC1024p7);
                return true;
            case 17:
                InterfaceC1812a G14 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                boolean f02 = f0(G14);
                parcel2.writeNoException();
                parcel2.writeInt(f02 ? 1 : 0);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.C7
    public final boolean X(InterfaceC1812a interfaceC1812a) {
        Ki ki;
        Object C22 = BinderC1813b.C2(interfaceC1812a);
        if (!(C22 instanceof ViewGroup) || (ki = this.f10719q) == null || !ki.c((ViewGroup) C22, true)) {
            return false;
        }
        this.f10718p.Q().V(new C1384xi(3, this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.C7
    public final InterfaceC1812a f() {
        return new BinderC1813b(this.f10717o);
    }

    @Override // com.google.android.gms.internal.ads.C7
    public final boolean f0(InterfaceC1812a interfaceC1812a) {
        Ki ki;
        InterfaceC0308Md interfaceC0308Md;
        Object C22 = BinderC1813b.C2(interfaceC1812a);
        if (!(C22 instanceof ViewGroup) || (ki = this.f10719q) == null || !ki.c((ViewGroup) C22, false)) {
            return false;
        }
        Ci ci = this.f10718p;
        synchronized (ci) {
            interfaceC0308Md = ci.f4509j;
        }
        interfaceC0308Md.V(new C1384xi(3, this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.C7
    public final String g() {
        return this.f10718p.a();
    }

    public final void n() {
        C1427yi c1427yi = this.f10720r;
        if (c1427yi != null) {
            synchronized (c1427yi) {
                if (c1427yi.f11447w) {
                    return;
                }
                c1427yi.f11436l.C();
            }
        }
    }
}
