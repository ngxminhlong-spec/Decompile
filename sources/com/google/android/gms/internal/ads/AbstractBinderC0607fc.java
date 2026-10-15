package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Set;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.fc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0607fc extends AbstractBinderC1149s4 implements InterfaceC0650gc {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f8706o = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.ads.r4] */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        InterfaceC0522dc interfaceC0522dc = null;
        switch (i4) {
            case 1:
                InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
                C0820kc c0820kc = (C0820kc) AbstractC1192t4.a(parcel, C0820kc.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    interfaceC0522dc = queryLocalInterface instanceof InterfaceC0522dc ? (InterfaceC0522dc) queryLocalInterface : new AbstractC1106r4(readStrongBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback", 0);
                }
                AbstractC1192t4.b(parcel);
                ((W1.b) this).E0(G12, c0820kc, interfaceC0522dc);
                parcel2.writeNoException();
                return true;
            case 2:
                InterfaceC1812a G13 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                W1.b bVar = (W1.b) this;
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.L6)).booleanValue()) {
                    MotionEvent motionEvent = (MotionEvent) BinderC1813b.C2(G13);
                    C0264Ea c0264Ea = bVar.f1979w;
                    View view = c0264Ea != null ? c0264Ea.f4873o : null;
                    int[] iArr = new int[2];
                    if (view != null) {
                        view.getLocationOnScreen(iArr);
                    }
                    bVar.f1980x = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        bVar.y = bVar.f1980x;
                    }
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    Point point = bVar.f1980x;
                    obtain.setLocation(point.x, point.y);
                    bVar.f1974r.f5531b.a(obtain);
                    obtain.recycle();
                }
                parcel2.writeNoException();
                return true;
            case 3:
                BinderC1813b.G1(parcel.readStrongBinder());
                BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 4:
                BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC1812a G14 = BinderC1813b.G1(parcel.readStrongBinder());
                InterfaceC0246Ba K32 = AbstractBinderC0240Aa.K3(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                ((W1.b) this).Q3(createTypedArrayList, G14, K32, false);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC1812a G15 = BinderC1813b.G1(parcel.readStrongBinder());
                InterfaceC0246Ba K33 = AbstractBinderC0240Aa.K3(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                ((W1.b) this).P3(createTypedArrayList2, G15, K33, false);
                parcel2.writeNoException();
                return true;
            case 7:
                C0264Ea c0264Ea2 = (C0264Ea) AbstractC1192t4.a(parcel, C0264Ea.CREATOR);
                AbstractC1192t4.b(parcel);
                W1.b bVar2 = (W1.b) this;
                bVar2.f1979w = c0264Ea2;
                bVar2.f1975s.b(1);
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC1812a G16 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                W1.b bVar3 = (W1.b) this;
                C0937n6 c0937n6 = AbstractC1066q6.q8;
                SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = O1.r.d.c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).booleanValue()) {
                    C0937n6 c0937n62 = AbstractC1066q6.J6;
                    if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n62)).booleanValue()) {
                        bVar3.O3();
                    }
                    WebView webView = (WebView) BinderC1813b.C2(G16);
                    if (webView == null) {
                        Y9.p("The webView cannot be null.");
                    } else {
                        Set set = bVar3.f1981z;
                        if (set.contains(webView)) {
                            Y9.r("This webview has already been registered.");
                        } else {
                            set.add(webView);
                            webView.addJavascriptInterface(new W1.a(webView, bVar3.f1974r, bVar3.f1954B, bVar3.f1955C), "gmaSdk");
                            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.A8)).booleanValue()) {
                                N1.n.f1204A.f1209g.f9976k.incrementAndGet();
                            }
                            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n62)).booleanValue()) {
                                bVar3.O3();
                            }
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC1812a G17 = BinderC1813b.G1(parcel.readStrongBinder());
                InterfaceC0246Ba K34 = AbstractBinderC0240Aa.K3(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                ((W1.b) this).Q3(createTypedArrayList3, G17, K34, true);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC1812a G18 = BinderC1813b.G1(parcel.readStrongBinder());
                InterfaceC0246Ba K35 = AbstractBinderC0240Aa.K3(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                ((W1.b) this).P3(createTypedArrayList4, G18, K35, true);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
