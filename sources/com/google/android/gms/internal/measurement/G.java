package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import java.util.HashMap;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class G extends AbstractBinderC1585w implements H {
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.r4, com.google.android.gms.internal.measurement.H] */
    public static H asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof H ? (H) queryLocalInterface : new AbstractC1106r4(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v37, types: [com.google.android.gms.internal.ads.r4] */
    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1585w
    public final boolean O(int i4, Parcel parcel, Parcel parcel2) {
        boolean z4;
        J j4 = null;
        J j5 = null;
        J j6 = null;
        L l4 = null;
        L l5 = null;
        L l6 = null;
        J j7 = null;
        J j8 = null;
        J j9 = null;
        J j10 = null;
        J j11 = null;
        J j12 = null;
        N n4 = null;
        J j13 = null;
        J j14 = null;
        J j15 = null;
        J j16 = null;
        J j17 = null;
        switch (i4) {
            case 1:
                InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
                O o4 = (O) AbstractC1589x.a(parcel, O.CREATOR);
                long readLong = parcel.readLong();
                AbstractC1589x.b(parcel);
                initialize(G12, o4, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) AbstractC1589x.a(parcel, Bundle.CREATOR);
                boolean z5 = parcel.readInt() != 0;
                boolean z6 = parcel.readInt() != 0;
                long readLong2 = parcel.readLong();
                AbstractC1589x.b(parcel);
                logEvent(readString, readString2, bundle, z5, z6, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC1589x.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    j4 = queryLocalInterface instanceof J ? (J) queryLocalInterface : new I(readStrongBinder);
                }
                J j18 = j4;
                long readLong3 = parcel.readLong();
                AbstractC1589x.b(parcel);
                logEventAndBundle(readString3, readString4, bundle2, j18, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                InterfaceC1812a G13 = BinderC1813b.G1(parcel.readStrongBinder());
                ClassLoader classLoader = AbstractC1589x.f12112a;
                z4 = parcel.readInt() != 0;
                long readLong4 = parcel.readLong();
                AbstractC1589x.b(parcel);
                setUserProperty(readString5, readString6, G13, z4, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                ClassLoader classLoader2 = AbstractC1589x.f12112a;
                z4 = parcel.readInt() != 0;
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    j17 = queryLocalInterface2 instanceof J ? (J) queryLocalInterface2 : new I(readStrongBinder2);
                }
                AbstractC1589x.b(parcel);
                getUserProperties(readString7, readString8, z4, j17);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    j16 = queryLocalInterface3 instanceof J ? (J) queryLocalInterface3 : new I(readStrongBinder3);
                }
                AbstractC1589x.b(parcel);
                getMaxUserProperties(readString9, j16);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                AbstractC1589x.b(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) AbstractC1589x.a(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                AbstractC1589x.b(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC1589x.a(parcel, Bundle.CREATOR);
                AbstractC1589x.b(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    j15 = queryLocalInterface4 instanceof J ? (J) queryLocalInterface4 : new I(readStrongBinder4);
                }
                AbstractC1589x.b(parcel);
                getConditionalUserProperties(readString13, readString14, j15);
                break;
            case 11:
                ClassLoader classLoader3 = AbstractC1589x.f12112a;
                z4 = parcel.readInt() != 0;
                long readLong7 = parcel.readLong();
                AbstractC1589x.b(parcel);
                setMeasurementEnabled(z4, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                AbstractC1589x.b(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                AbstractC1589x.b(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                AbstractC1589x.b(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                InterfaceC1812a G14 = BinderC1813b.G1(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                AbstractC1589x.b(parcel);
                setCurrentScreen(G14, readString15, readString16, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    j14 = queryLocalInterface5 instanceof J ? (J) queryLocalInterface5 : new I(readStrongBinder5);
                }
                AbstractC1589x.b(parcel);
                getCurrentScreenName(j14);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    j13 = queryLocalInterface6 instanceof J ? (J) queryLocalInterface6 : new I(readStrongBinder6);
                }
                AbstractC1589x.b(parcel);
                getCurrentScreenClass(j13);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    n4 = queryLocalInterface7 instanceof N ? (N) queryLocalInterface7 : new AbstractC1106r4(readStrongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 1);
                }
                AbstractC1589x.b(parcel);
                setInstanceIdProvider(n4);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    j12 = queryLocalInterface8 instanceof J ? (J) queryLocalInterface8 : new I(readStrongBinder8);
                }
                AbstractC1589x.b(parcel);
                getCachedAppInstanceId(j12);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    j11 = queryLocalInterface9 instanceof J ? (J) queryLocalInterface9 : new I(readStrongBinder9);
                }
                AbstractC1589x.b(parcel);
                getAppInstanceId(j11);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    j10 = queryLocalInterface10 instanceof J ? (J) queryLocalInterface10 : new I(readStrongBinder10);
                }
                AbstractC1589x.b(parcel);
                getGmpAppId(j10);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    j9 = queryLocalInterface11 instanceof J ? (J) queryLocalInterface11 : new I(readStrongBinder11);
                }
                AbstractC1589x.b(parcel);
                generateEventId(j9);
                break;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                AbstractC1589x.b(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                AbstractC1589x.b(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case 25:
                InterfaceC1812a G15 = BinderC1813b.G1(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                AbstractC1589x.b(parcel);
                onActivityStarted(G15, readLong14);
                break;
            case 26:
                InterfaceC1812a G16 = BinderC1813b.G1(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                AbstractC1589x.b(parcel);
                onActivityStopped(G16, readLong15);
                break;
            case 27:
                InterfaceC1812a G17 = BinderC1813b.G1(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) AbstractC1589x.a(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                AbstractC1589x.b(parcel);
                onActivityCreated(G17, bundle5, readLong16);
                break;
            case 28:
                InterfaceC1812a G18 = BinderC1813b.G1(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                AbstractC1589x.b(parcel);
                onActivityDestroyed(G18, readLong17);
                break;
            case 29:
                InterfaceC1812a G19 = BinderC1813b.G1(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                AbstractC1589x.b(parcel);
                onActivityPaused(G19, readLong18);
                break;
            case 30:
                InterfaceC1812a G110 = BinderC1813b.G1(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                AbstractC1589x.b(parcel);
                onActivityResumed(G110, readLong19);
                break;
            case 31:
                InterfaceC1812a G111 = BinderC1813b.G1(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    j8 = queryLocalInterface12 instanceof J ? (J) queryLocalInterface12 : new I(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                AbstractC1589x.b(parcel);
                onActivitySaveInstanceState(G111, j8, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) AbstractC1589x.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    j7 = queryLocalInterface13 instanceof J ? (J) queryLocalInterface13 : new I(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                AbstractC1589x.b(parcel);
                performAction(bundle6, j7, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                InterfaceC1812a G112 = BinderC1813b.G1(parcel.readStrongBinder());
                InterfaceC1812a G113 = BinderC1813b.G1(parcel.readStrongBinder());
                InterfaceC1812a G114 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1589x.b(parcel);
                logHealthData(readInt, readString19, G112, G113, G114);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    l6 = queryLocalInterface14 instanceof L ? (L) queryLocalInterface14 : new K(readStrongBinder14);
                }
                AbstractC1589x.b(parcel);
                setEventInterceptor(l6);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    l5 = queryLocalInterface15 instanceof L ? (L) queryLocalInterface15 : new K(readStrongBinder15);
                }
                AbstractC1589x.b(parcel);
                registerOnMeasurementEventListener(l5);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    l4 = queryLocalInterface16 instanceof L ? (L) queryLocalInterface16 : new K(readStrongBinder16);
                }
                AbstractC1589x.b(parcel);
                unregisterOnMeasurementEventListener(l4);
                break;
            case 37:
                HashMap readHashMap = parcel.readHashMap(AbstractC1589x.f12112a);
                AbstractC1589x.b(parcel);
                initForTests(readHashMap);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    j6 = queryLocalInterface17 instanceof J ? (J) queryLocalInterface17 : new I(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                AbstractC1589x.b(parcel);
                getTestFlag(j6, readInt2);
                break;
            case 39:
                ClassLoader classLoader4 = AbstractC1589x.f12112a;
                z4 = parcel.readInt() != 0;
                AbstractC1589x.b(parcel);
                setDataCollectionEnabled(z4);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    j5 = queryLocalInterface18 instanceof J ? (J) queryLocalInterface18 : new I(readStrongBinder18);
                }
                AbstractC1589x.b(parcel);
                isDataCollectionEnabled(j5);
                break;
            case 41:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) AbstractC1589x.a(parcel, Bundle.CREATOR);
                AbstractC1589x.b(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long readLong22 = parcel.readLong();
                AbstractC1589x.b(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) AbstractC1589x.a(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                AbstractC1589x.b(parcel);
                setConsent(bundle8, readLong23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) AbstractC1589x.a(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                AbstractC1589x.b(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
