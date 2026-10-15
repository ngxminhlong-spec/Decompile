package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.o9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0983o9 extends AbstractBinderC1149s4 implements InterfaceC1069q9 {
    public BinderC0983o9() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.q9, com.google.android.gms.internal.ads.r4] */
    public static InterfaceC1069q9 K3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof InterfaceC1069q9 ? (InterfaceC1069q9) queryLocalInterface : new AbstractC1106r4(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1069q9
    public final InterfaceC1154s9 B(String str) {
        try {
            try {
                Class<?> cls = Class.forName(str, false, BinderC0983o9.class.getClassLoader());
                if (S1.e.class.isAssignableFrom(cls)) {
                    return new G9((S1.e) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (S1.a.class.isAssignableFrom(cls)) {
                    return new G9((S1.a) cls.getDeclaredConstructor(null).newInstance(null));
                }
                Y9.s("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable th) {
                Y9.t("Could not instantiate mediation adapter: " + str + ". ", th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            Y9.m("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new G9(new AdMobAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new G9(new CustomEventAdapter());
            }
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1069q9
    public final boolean F(String str) {
        try {
            return S1.a.class.isAssignableFrom(Class.forName(str, false, BinderC0983o9.class.getClassLoader()));
        } catch (Throwable unused) {
            Y9.s("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            String readString = parcel.readString();
            AbstractC1192t4.b(parcel);
            InterfaceC1154s9 B4 = B(readString);
            parcel2.writeNoException();
            AbstractC1192t4.e(parcel2, B4);
            return true;
        }
        if (i4 == 2) {
            String readString2 = parcel.readString();
            AbstractC1192t4.b(parcel);
            boolean Y4 = Y(readString2);
            parcel2.writeNoException();
            parcel2.writeInt(Y4 ? 1 : 0);
            return true;
        }
        if (i4 == 3) {
            String readString3 = parcel.readString();
            AbstractC1192t4.b(parcel);
            V9 y = y(readString3);
            parcel2.writeNoException();
            AbstractC1192t4.e(parcel2, y);
            return true;
        }
        if (i4 != 4) {
            return false;
        }
        String readString4 = parcel.readString();
        AbstractC1192t4.b(parcel);
        boolean F2 = F(readString4);
        parcel2.writeNoException();
        parcel2.writeInt(F2 ? 1 : 0);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1069q9
    public final boolean Y(String str) {
        try {
            return T1.a.class.isAssignableFrom(Class.forName(str, false, BinderC0983o9.class.getClassLoader()));
        } catch (Throwable unused) {
            Y9.s("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1069q9
    public final V9 y(String str) {
        return new BinderC0392aa((RtbAdapter) Class.forName(str, false, Y9.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }
}
