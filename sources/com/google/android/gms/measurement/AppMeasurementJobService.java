package com.google.android.gms.measurement;

import E.n;
import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import k.o;
import x0.j;
import x2.C2066c0;
import x2.K;
import x2.M0;
import x2.X0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements M0 {

    /* renamed from: o, reason: collision with root package name */
    public o f12270o;

    @Override // x2.M0
    public final void a(Intent intent) {
    }

    @Override // x2.M0
    public final boolean b(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // x2.M0
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final o d() {
        if (this.f12270o == null) {
            this.f12270o = new o(21, this);
        }
        return this.f12270o;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        o d = d();
        K k3 = C2066c0.p((Service) d.f13452p, null, null).f15568i;
        C2066c0.i(k3);
        String string = jobParameters.getExtras().getString("action");
        k3.f15402n.b(string, "Local AppMeasurementJobService called. action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        n nVar = new n(d, k3, jobParameters, 22);
        X0 O4 = X0.O((Service) d.f13452p);
        O4.t().o(new j(9, O4, nVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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
