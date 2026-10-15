package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import java.util.HashMap;
import n0.a;
import n0.n;
import o0.InterfaceC1822a;
import o0.l;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC1822a {

    /* renamed from: q, reason: collision with root package name */
    public static final String f3150q = n.h("SystemJobService");

    /* renamed from: o, reason: collision with root package name */
    public l f3151o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f3152p = new HashMap();

    @Override // o0.InterfaceC1822a
    public final void a(String str, boolean z4) {
        JobParameters jobParameters;
        n.d().a(f3150q, a.h(str, " executed on JobScheduler"), new Throwable[0]);
        synchronized (this.f3152p) {
            jobParameters = (JobParameters) this.f3152p.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z4);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            l N = l.N(getApplicationContext());
            this.f3151o = N;
            N.f14178q.b(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            n.d().i(f3150q, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        l lVar = this.f3151o;
        if (lVar != null) {
            lVar.f14178q.f(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStartJob(android.app.job.JobParameters r10) {
        /*
            r9 = this;
            java.lang.String r0 = "onStartJob for "
            java.lang.String r1 = "Job is already being executed by SystemJobService: "
            o0.l r2 = r9.f3151o
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1b
            n0.n r0 = n0.n.d()
            java.lang.String r1 = androidx.work.impl.background.systemjob.SystemJobService.f3150q
            java.lang.String r2 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r4]
            r0.a(r1, r2, r5)
            r9.jobFinished(r10, r3)
            return r4
        L1b:
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            r5 = 0
            android.os.PersistableBundle r6 = r10.getExtras()     // Catch: java.lang.NullPointerException -> L2f
            if (r6 == 0) goto L2f
            boolean r7 = r6.containsKey(r2)     // Catch: java.lang.NullPointerException -> L2f
            if (r7 == 0) goto L2f
            java.lang.String r2 = r6.getString(r2)     // Catch: java.lang.NullPointerException -> L2f
            goto L30
        L2f:
            r2 = r5
        L30:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L44
            n0.n r10 = n0.n.d()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f3150q
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r2 = new java.lang.Throwable[r4]
            r10.c(r0, r1, r2)
            return r4
        L44:
            java.util.HashMap r6 = r9.f3152p
            monitor-enter(r6)
            java.util.HashMap r7 = r9.f3152p     // Catch: java.lang.Throwable -> L68
            boolean r7 = r7.containsKey(r2)     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L6a
            n0.n r10 = n0.n.d()     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f3150q     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L68
            r3.append(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L68
            java.lang.Throwable[] r2 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L68
            r10.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L68
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L68
            return r4
        L68:
            r10 = move-exception
            goto Lc4
        L6a:
            n0.n r1 = n0.n.d()     // Catch: java.lang.Throwable -> L68
            java.lang.String r7 = androidx.work.impl.background.systemjob.SystemJobService.f3150q     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L68
            r8.append(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L68
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L68
            r1.a(r7, r0, r4)     // Catch: java.lang.Throwable -> L68
            java.util.HashMap r0 = r9.f3152p     // Catch: java.lang.Throwable -> L68
            r0.put(r2, r10)     // Catch: java.lang.Throwable -> L68
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L68
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lbe
            q2.e r5 = new q2.e
            r1 = 21
            r5.<init>(r1)
            android.net.Uri[] r1 = com.google.android.material.datepicker.t.q(r10)
            if (r1 == 0) goto La4
            android.net.Uri[] r1 = com.google.android.material.datepicker.t.q(r10)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r5.f14710q = r1
        La4:
            java.lang.String[] r1 = com.google.android.material.datepicker.t.r(r10)
            if (r1 == 0) goto Lb4
            java.lang.String[] r1 = com.google.android.material.datepicker.t.r(r10)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r5.f14709p = r1
        Lb4:
            r1 = 28
            if (r0 < r1) goto Lbe
            android.net.Network r10 = F.c.h(r10)
            r5.f14711r = r10
        Lbe:
            o0.l r10 = r9.f3151o
            r10.R(r2, r5)
            return r3
        Lc4:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L68
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStopJob(android.app.job.JobParameters r6) {
        /*
            r5 = this;
            o0.l r0 = r5.f3151o
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
            n0.n r6 = n0.n.d()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f3150q
            java.lang.String r3 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r6.a(r0, r3, r2)
            return r1
        L14:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r6 = r6.getExtras()     // Catch: java.lang.NullPointerException -> L27
            if (r6 == 0) goto L27
            boolean r3 = r6.containsKey(r0)     // Catch: java.lang.NullPointerException -> L27
            if (r3 == 0) goto L27
            java.lang.String r6 = r6.getString(r0)     // Catch: java.lang.NullPointerException -> L27
            goto L28
        L27:
            r6 = 0
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L3c
            n0.n r6 = n0.n.d()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f3150q
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r6.c(r0, r1, r3)
            return r2
        L3c:
            n0.n r0 = n0.n.d()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.f3150q
            java.lang.String r4 = "onStopJob for "
            java.lang.String r4 = n0.a.k(r4, r6)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.a(r3, r4, r2)
            java.util.HashMap r0 = r5.f3152p
            monitor-enter(r0)
            java.util.HashMap r2 = r5.f3152p     // Catch: java.lang.Throwable -> L65
            r2.remove(r6)     // Catch: java.lang.Throwable -> L65
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            o0.l r0 = r5.f3151o
            r0.S(r6)
            o0.l r0 = r5.f3151o
            o0.b r0 = r0.f14178q
            boolean r6 = r0.d(r6)
            r6 = r6 ^ r1
            return r6
        L65:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}
