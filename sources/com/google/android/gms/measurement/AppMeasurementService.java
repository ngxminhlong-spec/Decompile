package com.google.android.gms.measurement;

import Q.a;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import k.o;
import x0.j;
import x2.BinderC2074g0;
import x2.C2066c0;
import x2.K;
import x2.M0;
import x2.RunnableC2107x0;
import x2.X0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements M0 {

    /* renamed from: o, reason: collision with root package name */
    public o f12271o;

    @Override // x2.M0
    public final void a(Intent intent) {
        SparseArray sparseArray = a.f1613a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = a.f1613a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // x2.M0
    public final boolean b(int i4) {
        return stopSelfResult(i4);
    }

    @Override // x2.M0
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final o d() {
        if (this.f12271o == null) {
            this.f12271o = new o(21, this);
        }
        return this.f12271o;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        o d = d();
        if (intent == null) {
            d.j().f15394f.a("onBind called with null intent");
            return null;
        }
        d.getClass();
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC2074g0(X0.O((Service) d.f13452p));
        }
        d.j().f15397i.b(action, "onBind received unknown action");
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        K k3 = C2066c0.p((Service) d().f13452p, null, null).f15568i;
        C2066c0.i(k3);
        k3.f15402n.a("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        K k3 = C2066c0.p((Service) d().f13452p, null, null).f15568i;
        C2066c0.i(k3);
        k3.f15402n.a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        o d = d();
        if (intent == null) {
            d.j().f15394f.a("onRebind called with null intent");
            return;
        }
        d.getClass();
        d.j().f15402n.b(intent.getAction(), "onRebind called. action");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i4, int i5) {
        o d = d();
        K k3 = C2066c0.p((Service) d.f13452p, null, null).f15568i;
        C2066c0.i(k3);
        if (intent == null) {
            k3.f15397i.a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        k3.f15402n.c(Integer.valueOf(i5), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        RunnableC2107x0 runnableC2107x0 = new RunnableC2107x0(d, i5, k3, intent);
        X0 O4 = X0.O((Service) d.f13452p);
        O4.t().o(new j(9, O4, runnableC2107x0));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        o d = d();
        if (intent == null) {
            d.j().f15394f.a("onUnbind called with null intent");
            return true;
        }
        d.getClass();
        d.j().f15402n.b(intent.getAction(), "onUnbind called for intent. action");
        return true;
    }
}
