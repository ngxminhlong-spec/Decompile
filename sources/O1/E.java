package O1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1149s4;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.C0766j7;
import com.google.android.gms.internal.ads.C8;
import com.google.android.gms.internal.ads.D7;
import com.google.android.gms.internal.ads.E7;
import com.google.android.gms.internal.ads.G7;
import com.google.android.gms.internal.ads.G8;
import com.google.android.gms.internal.ads.I7;
import com.google.android.gms.internal.ads.K7;
import com.google.android.gms.internal.ads.M7;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class E extends AbstractBinderC1149s4 implements F {
    public E() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.google.android.gms.internal.ads.r4] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.ads.r4] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.r4] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.r4] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.google.android.gms.internal.ads.r4] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.google.android.gms.internal.ads.r4] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.ads.r4] */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        I7 i7;
        InterfaceC0096x interfaceC0096x = null;
        G8 g8 = null;
        M7 m7 = null;
        K7 k7 = null;
        S s4 = null;
        G7 g7 = null;
        E7 e7 = null;
        D7 d7 = null;
        switch (i4) {
            case 1:
                C a4 = a();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, a4);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    interfaceC0096x = queryLocalInterface instanceof InterfaceC0096x ? (InterfaceC0096x) queryLocalInterface : new C0092v(readStrongBinder);
                }
                AbstractC1192t4.b(parcel);
                m0(interfaceC0096x);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    d7 = queryLocalInterface2 instanceof D7 ? (D7) queryLocalInterface2 : new AbstractC1106r4(readStrongBinder2, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener", 0);
                }
                AbstractC1192t4.b(parcel);
                Q2(d7);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    e7 = queryLocalInterface3 instanceof E7 ? (E7) queryLocalInterface3 : new AbstractC1106r4(readStrongBinder3, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener", 0);
                }
                AbstractC1192t4.b(parcel);
                y2(e7);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    i7 = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    i7 = queryLocalInterface4 instanceof I7 ? (I7) queryLocalInterface4 : new AbstractC1106r4(readStrongBinder4, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener", 0);
                }
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    g7 = queryLocalInterface5 instanceof G7 ? (G7) queryLocalInterface5 : new AbstractC1106r4(readStrongBinder5, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener", 0);
                }
                AbstractC1192t4.b(parcel);
                a2(readString, i7, g7);
                parcel2.writeNoException();
                return true;
            case 6:
                C0766j7 c0766j7 = (C0766j7) AbstractC1192t4.a(parcel, C0766j7.CREATOR);
                AbstractC1192t4.b(parcel);
                c2(c0766j7);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    s4 = queryLocalInterface6 instanceof S ? (S) queryLocalInterface6 : new S(readStrongBinder6);
                }
                AbstractC1192t4.b(parcel);
                r0(s4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    k7 = queryLocalInterface7 instanceof K7 ? (K7) queryLocalInterface7 : new AbstractC1106r4(readStrongBinder7, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener", 0);
                }
                X0 x02 = (X0) AbstractC1192t4.a(parcel, X0.CREATOR);
                AbstractC1192t4.b(parcel);
                u1(k7, x02);
                parcel2.writeNoException();
                return true;
            case 9:
                K1.d dVar = (K1.d) AbstractC1192t4.a(parcel, K1.d.CREATOR);
                AbstractC1192t4.b(parcel);
                d2(dVar);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    m7 = queryLocalInterface8 instanceof M7 ? (M7) queryLocalInterface8 : new AbstractC1106r4(readStrongBinder8, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener", 0);
                }
                AbstractC1192t4.b(parcel);
                S0(m7);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                C8 c8 = (C8) AbstractC1192t4.a(parcel, C8.CREATOR);
                AbstractC1192t4.b(parcel);
                h1(c8);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    g8 = queryLocalInterface9 instanceof G8 ? (G8) queryLocalInterface9 : new AbstractC1106r4(readStrongBinder9, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback", 0);
                }
                AbstractC1192t4.b(parcel);
                c3(g8);
                parcel2.writeNoException();
                return true;
            case 15:
                K1.a aVar = (K1.a) AbstractC1192t4.a(parcel, K1.a.CREATOR);
                AbstractC1192t4.b(parcel);
                m1(aVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
