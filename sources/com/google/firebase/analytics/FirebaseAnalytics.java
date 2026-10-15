package com.google.firebase.analytics;

import A2.r;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C1509e0;
import com.google.android.gms.internal.measurement.S;
import e3.C1665a;
import h2.y;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o2.AbstractC1895f;
import x2.InterfaceC2105w0;
import x3.C2113b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    public static volatile FirebaseAnalytics f12543b;

    /* renamed from: a, reason: collision with root package name */
    public final C1509e0 f12544a;

    public FirebaseAnalytics(C1509e0 c1509e0) {
        y.i(c1509e0);
        this.f12544a = c1509e0;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f12543b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f12543b == null) {
                        f12543b = new FirebaseAnalytics(C1509e0.e(context, null, null, null));
                    }
                } finally {
                }
            }
        }
        return f12543b;
    }

    @Keep
    public static InterfaceC2105w0 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C1509e0 e4 = C1509e0.e(context, null, null, bundle);
        if (e4 == null) {
            return null;
        }
        return new C1665a(e4);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            r c = C2113b.d().c();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return (String) AbstractC1895f.b(c);
        } catch (InterruptedException e4) {
            throw new IllegalStateException(e4);
        } catch (ExecutionException e5) {
            throw new IllegalStateException(e5.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        C1509e0 c1509e0 = this.f12544a;
        c1509e0.getClass();
        c1509e0.b(new S(c1509e0, activity, str, str2));
    }
}
