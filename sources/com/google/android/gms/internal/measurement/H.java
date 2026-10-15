package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public interface H extends IInterface {
    void beginAdUnitExposure(String str, long j4);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j4);

    void endAdUnitExposure(String str, long j4);

    void generateEventId(J j4);

    void getAppInstanceId(J j4);

    void getCachedAppInstanceId(J j4);

    void getConditionalUserProperties(String str, String str2, J j4);

    void getCurrentScreenClass(J j4);

    void getCurrentScreenName(J j4);

    void getGmpAppId(J j4);

    void getMaxUserProperties(String str, J j4);

    void getTestFlag(J j4, int i4);

    void getUserProperties(String str, String str2, boolean z4, J j4);

    void initForTests(Map map);

    void initialize(InterfaceC1812a interfaceC1812a, O o4, long j4);

    void isDataCollectionEnabled(J j4);

    void logEvent(String str, String str2, Bundle bundle, boolean z4, boolean z5, long j4);

    void logEventAndBundle(String str, String str2, Bundle bundle, J j4, long j5);

    void logHealthData(int i4, String str, InterfaceC1812a interfaceC1812a, InterfaceC1812a interfaceC1812a2, InterfaceC1812a interfaceC1812a3);

    void onActivityCreated(InterfaceC1812a interfaceC1812a, Bundle bundle, long j4);

    void onActivityDestroyed(InterfaceC1812a interfaceC1812a, long j4);

    void onActivityPaused(InterfaceC1812a interfaceC1812a, long j4);

    void onActivityResumed(InterfaceC1812a interfaceC1812a, long j4);

    void onActivitySaveInstanceState(InterfaceC1812a interfaceC1812a, J j4, long j5);

    void onActivityStarted(InterfaceC1812a interfaceC1812a, long j4);

    void onActivityStopped(InterfaceC1812a interfaceC1812a, long j4);

    void performAction(Bundle bundle, J j4, long j5);

    void registerOnMeasurementEventListener(L l4);

    void resetAnalyticsData(long j4);

    void setConditionalUserProperty(Bundle bundle, long j4);

    void setConsent(Bundle bundle, long j4);

    void setConsentThirdParty(Bundle bundle, long j4);

    void setCurrentScreen(InterfaceC1812a interfaceC1812a, String str, String str2, long j4);

    void setDataCollectionEnabled(boolean z4);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(L l4);

    void setInstanceIdProvider(N n4);

    void setMeasurementEnabled(boolean z4, long j4);

    void setMinimumSessionDuration(long j4);

    void setSessionTimeoutDuration(long j4);

    void setUserId(String str, long j4);

    void setUserProperty(String str, String str2, InterfaceC1812a interfaceC1812a, boolean z4, long j4);

    void unregisterOnMeasurementEventListener(L l4);
}
