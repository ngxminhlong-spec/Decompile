package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.O;
import com.google.firebase.analytics.FirebaseAnalytics;
import h2.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import v2.AbstractC2029c;
import v2.C2027a;
import v2.C2028b;
import x2.AbstractC2080j0;
import x2.C2066c0;
import x2.InterfaceC2105w0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    public static volatile AppMeasurement f12268b;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2029c f12269a;

    /* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
    /* loaded from: classes.dex */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;
    }

    public AppMeasurement(C2066c0 c2066c0) {
        this.f12269a = new C2027a(c2066c0);
    }

    public AppMeasurement(InterfaceC2105w0 interfaceC2105w0) {
        this.f12269a = new C2028b(interfaceC2105w0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f12268b == null) {
            synchronized (AppMeasurement.class) {
                if (f12268b == null) {
                    InterfaceC2105w0 interfaceC2105w0 = (InterfaceC2105w0) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (interfaceC2105w0 != null) {
                        f12268b = new AppMeasurement(interfaceC2105w0);
                    } else {
                        f12268b = new AppMeasurement(C2066c0.p(context, new O(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return f12268b;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f12269a.i(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f12269a.a(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f12269a.V(str);
    }

    @Keep
    public long generateEventId() {
        return this.f12269a.c();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f12269a.f();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty, java.lang.Object] */
    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> b4 = this.f12269a.b(str, str2);
        ArrayList arrayList = new ArrayList(b4 == null ? 0 : b4.size());
        for (Bundle bundle : b4) {
            ?? obj = new Object();
            y.i(bundle);
            obj.mAppId = (String) AbstractC2080j0.a(bundle, "app_id", String.class, null);
            obj.mOrigin = (String) AbstractC2080j0.a(bundle, "origin", String.class, null);
            obj.mName = (String) AbstractC2080j0.a(bundle, "name", String.class, null);
            obj.mValue = AbstractC2080j0.a(bundle, "value", Object.class, null);
            obj.mTriggerEventName = (String) AbstractC2080j0.a(bundle, "trigger_event_name", String.class, null);
            obj.mTriggerTimeout = ((Long) AbstractC2080j0.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            obj.mTimedOutEventName = (String) AbstractC2080j0.a(bundle, "timed_out_event_name", String.class, null);
            obj.mTimedOutEventParams = (Bundle) AbstractC2080j0.a(bundle, "timed_out_event_params", Bundle.class, null);
            obj.mTriggeredEventName = (String) AbstractC2080j0.a(bundle, "triggered_event_name", String.class, null);
            obj.mTriggeredEventParams = (Bundle) AbstractC2080j0.a(bundle, "triggered_event_params", Bundle.class, null);
            obj.mTimeToLive = ((Long) AbstractC2080j0.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            obj.mExpiredEventName = (String) AbstractC2080j0.a(bundle, "expired_event_name", String.class, null);
            obj.mExpiredEventParams = (Bundle) AbstractC2080j0.a(bundle, "expired_event_params", Bundle.class, null);
            obj.mActive = ((Boolean) AbstractC2080j0.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            obj.mCreationTimestamp = ((Long) AbstractC2080j0.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            obj.mTriggeredTimestamp = ((Long) AbstractC2080j0.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(obj);
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f12269a.g();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f12269a.j();
    }

    @Keep
    public String getGmpAppId() {
        return this.f12269a.k();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f12269a.o(str);
    }

    @VisibleForTesting
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z4) {
        return this.f12269a.d(str, str2, z4);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f12269a.h(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        y.i(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            AbstractC2080j0.g(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f12269a.e(bundle);
    }
}
