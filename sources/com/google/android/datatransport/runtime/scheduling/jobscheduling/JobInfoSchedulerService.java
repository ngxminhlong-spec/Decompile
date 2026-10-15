package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import C1.d;
import C1.f;
import C1.l;
import G1.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import java.util.concurrent.Executor;
import t3.g;
import w1.C2046i;
import w1.C2052o;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f3850o = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i4 = jobParameters.getExtras().getInt("priority");
        int i5 = jobParameters.getExtras().getInt("attemptNumber");
        C2052o.b(getApplicationContext());
        g a4 = C2046i.a();
        a4.h(string);
        a4.f14963q = a.b(i4);
        if (string2 != null) {
            a4.f14962p = Base64.decode(string2, 0);
        }
        l lVar = C2052o.a().d;
        ((Executor) lVar.f502e).execute(new f(lVar, a4.a(), i5, new d(0, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
