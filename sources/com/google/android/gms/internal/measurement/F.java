package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class F extends AbstractC1106r4 implements H {
    @Override // com.google.android.gms.internal.measurement.H
    public final void beginAdUnitExposure(String str, long j4) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeLong(j4);
        L2(Q3, 23);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeString(str2);
        AbstractC1589x.c(Q3, bundle);
        L2(Q3, 9);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void clearMeasurementEnabled(long j4) {
        Parcel Q3 = Q();
        Q3.writeLong(j4);
        L2(Q3, 43);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void endAdUnitExposure(String str, long j4) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeLong(j4);
        L2(Q3, 24);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void generateEventId(J j4) {
        Parcel Q3 = Q();
        AbstractC1589x.d(Q3, j4);
        L2(Q3, 22);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void getCachedAppInstanceId(J j4) {
        Parcel Q3 = Q();
        AbstractC1589x.d(Q3, j4);
        L2(Q3, 19);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void getConditionalUserProperties(String str, String str2, J j4) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeString(str2);
        AbstractC1589x.d(Q3, j4);
        L2(Q3, 10);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void getCurrentScreenClass(J j4) {
        Parcel Q3 = Q();
        AbstractC1589x.d(Q3, j4);
        L2(Q3, 17);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void getCurrentScreenName(J j4) {
        Parcel Q3 = Q();
        AbstractC1589x.d(Q3, j4);
        L2(Q3, 16);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void getGmpAppId(J j4) {
        Parcel Q3 = Q();
        AbstractC1589x.d(Q3, j4);
        L2(Q3, 21);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void getMaxUserProperties(String str, J j4) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        AbstractC1589x.d(Q3, j4);
        L2(Q3, 6);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void getUserProperties(String str, String str2, boolean z4, J j4) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeString(str2);
        ClassLoader classLoader = AbstractC1589x.f12112a;
        Q3.writeInt(z4 ? 1 : 0);
        AbstractC1589x.d(Q3, j4);
        L2(Q3, 5);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void initialize(InterfaceC1812a interfaceC1812a, O o4, long j4) {
        Parcel Q3 = Q();
        AbstractC1589x.d(Q3, interfaceC1812a);
        AbstractC1589x.c(Q3, o4);
        Q3.writeLong(j4);
        L2(Q3, 1);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void logEvent(String str, String str2, Bundle bundle, boolean z4, boolean z5, long j4) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeString(str2);
        AbstractC1589x.c(Q3, bundle);
        Q3.writeInt(z4 ? 1 : 0);
        Q3.writeInt(1);
        Q3.writeLong(j4);
        L2(Q3, 2);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void logHealthData(int i4, String str, InterfaceC1812a interfaceC1812a, InterfaceC1812a interfaceC1812a2, InterfaceC1812a interfaceC1812a3) {
        Parcel Q3 = Q();
        Q3.writeInt(5);
        Q3.writeString("Error with data collection. Data lost.");
        AbstractC1589x.d(Q3, interfaceC1812a);
        AbstractC1589x.d(Q3, interfaceC1812a2);
        AbstractC1589x.d(Q3, interfaceC1812a3);
        L2(Q3, 33);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void onActivityCreated(InterfaceC1812a interfaceC1812a, Bundle bundle, long j4) {
        Parcel Q3 = Q();
        AbstractC1589x.d(Q3, interfaceC1812a);
        AbstractC1589x.c(Q3, bundle);
        Q3.writeLong(j4);
        L2(Q3, 27);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void onActivityDestroyed(InterfaceC1812a interfaceC1812a, long j4) {
        Parcel Q3 = Q();
        AbstractC1589x.d(Q3, interfaceC1812a);
        Q3.writeLong(j4);
        L2(Q3, 28);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void onActivityPaused(InterfaceC1812a interfaceC1812a, long j4) {
        Parcel Q3 = Q();
        AbstractC1589x.d(Q3, interfaceC1812a);
        Q3.writeLong(j4);
        L2(Q3, 29);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void onActivityResumed(InterfaceC1812a interfaceC1812a, long j4) {
        Parcel Q3 = Q();
        AbstractC1589x.d(Q3, interfaceC1812a);
        Q3.writeLong(j4);
        L2(Q3, 30);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void onActivitySaveInstanceState(InterfaceC1812a interfaceC1812a, J j4, long j5) {
        Parcel Q3 = Q();
        AbstractC1589x.d(Q3, interfaceC1812a);
        AbstractC1589x.d(Q3, j4);
        Q3.writeLong(j5);
        L2(Q3, 31);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void onActivityStarted(InterfaceC1812a interfaceC1812a, long j4) {
        Parcel Q3 = Q();
        AbstractC1589x.d(Q3, interfaceC1812a);
        Q3.writeLong(j4);
        L2(Q3, 25);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void onActivityStopped(InterfaceC1812a interfaceC1812a, long j4) {
        Parcel Q3 = Q();
        AbstractC1589x.d(Q3, interfaceC1812a);
        Q3.writeLong(j4);
        L2(Q3, 26);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void performAction(Bundle bundle, J j4, long j5) {
        Parcel Q3 = Q();
        AbstractC1589x.c(Q3, bundle);
        AbstractC1589x.d(Q3, j4);
        Q3.writeLong(j5);
        L2(Q3, 32);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void setConditionalUserProperty(Bundle bundle, long j4) {
        Parcel Q3 = Q();
        AbstractC1589x.c(Q3, bundle);
        Q3.writeLong(j4);
        L2(Q3, 8);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void setConsent(Bundle bundle, long j4) {
        Parcel Q3 = Q();
        AbstractC1589x.c(Q3, bundle);
        Q3.writeLong(j4);
        L2(Q3, 44);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void setCurrentScreen(InterfaceC1812a interfaceC1812a, String str, String str2, long j4) {
        Parcel Q3 = Q();
        AbstractC1589x.d(Q3, interfaceC1812a);
        Q3.writeString(str);
        Q3.writeString(str2);
        Q3.writeLong(j4);
        L2(Q3, 15);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void setDataCollectionEnabled(boolean z4) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void setMeasurementEnabled(boolean z4, long j4) {
        Parcel Q3 = Q();
        ClassLoader classLoader = AbstractC1589x.f12112a;
        Q3.writeInt(z4 ? 1 : 0);
        Q3.writeLong(j4);
        L2(Q3, 11);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void setUserId(String str, long j4) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeLong(j4);
        L2(Q3, 7);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final void setUserProperty(String str, String str2, InterfaceC1812a interfaceC1812a, boolean z4, long j4) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeString(str2);
        AbstractC1589x.d(Q3, interfaceC1812a);
        Q3.writeInt(z4 ? 1 : 0);
        Q3.writeLong(j4);
        L2(Q3, 4);
    }
}
