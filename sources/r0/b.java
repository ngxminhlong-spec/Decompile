package r0;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import n0.n;
import o0.InterfaceC1824c;
import o0.l;
import w0.d;
import w0.i;
import x0.f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b implements InterfaceC1824c {

    /* renamed from: s, reason: collision with root package name */
    public static final String f14748s = n.h("SystemJobScheduler");

    /* renamed from: o, reason: collision with root package name */
    public final Context f14749o;

    /* renamed from: p, reason: collision with root package name */
    public final JobScheduler f14750p;

    /* renamed from: q, reason: collision with root package name */
    public final l f14751q;

    /* renamed from: r, reason: collision with root package name */
    public final C1966a f14752r;

    public b(Context context, l lVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        C1966a c1966a = new C1966a(context);
        this.f14749o = context;
        this.f14751q = lVar;
        this.f14750p = jobScheduler;
        this.f14752r = c1966a;
    }

    public static void a(JobScheduler jobScheduler, int i4) {
        try {
            jobScheduler.cancel(i4);
        } catch (Throwable th) {
            n.d().c(f14748s, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i4)), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0013 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList c(android.content.Context r7, android.app.job.JobScheduler r8, java.lang.String r9) {
        /*
            java.util.ArrayList r7 = e(r7, r8)
            r8 = 0
            if (r7 != 0) goto L8
            return r8
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            int r1 = r7.size()
            r2 = 0
        L13:
            if (r2 >= r1) goto L43
            java.lang.Object r3 = r7.get(r2)
            int r2 = r2 + 1
            android.app.job.JobInfo r3 = (android.app.job.JobInfo) r3
            java.lang.String r4 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r5 = r3.getExtras()
            if (r5 == 0) goto L30
            boolean r6 = r5.containsKey(r4)     // Catch: java.lang.NullPointerException -> L30
            if (r6 == 0) goto L30
            java.lang.String r4 = r5.getString(r4)     // Catch: java.lang.NullPointerException -> L30
            goto L31
        L30:
            r4 = r8
        L31:
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L13
            int r3 = r3.getId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            goto L13
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.b.c(android.content.Context, android.app.job.JobScheduler, java.lang.String):java.util.ArrayList");
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            n.d().c(f14748s, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // o0.InterfaceC1824c
    public final void b(String str) {
        Context context = this.f14749o;
        JobScheduler jobScheduler = this.f14750p;
        ArrayList c = c(context, jobScheduler, str);
        if (c == null || c.isEmpty()) {
            return;
        }
        int size = c.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = c.get(i4);
            i4++;
            a(jobScheduler, ((Integer) obj).intValue());
        }
        this.f14751q.f14175n.k().f(str);
    }

    @Override // o0.InterfaceC1824c
    public final void d(i... iVarArr) {
        int w2;
        ArrayList c;
        int w4;
        l lVar = this.f14751q;
        WorkDatabase workDatabase = lVar.f14175n;
        f fVar = new f(0, workDatabase);
        for (i iVar : iVarArr) {
            workDatabase.c();
            try {
                i h4 = workDatabase.n().h(iVar.f15115a);
                String str = f14748s;
                if (h4 == null) {
                    n.d().i(str, "Skipping scheduling " + iVar.f15115a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.h();
                } else if (h4.f15116b != 1) {
                    n.d().i(str, "Skipping scheduling " + iVar.f15115a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.h();
                } else {
                    d d = workDatabase.k().d(iVar.f15115a);
                    if (d != null) {
                        w2 = d.f15109b;
                    } else {
                        lVar.f14174m.getClass();
                        w2 = fVar.w(lVar.f14174m.f14077g);
                    }
                    if (d == null) {
                        lVar.f14175n.k().e(new d(iVar.f15115a, w2));
                    }
                    g(iVar, w2);
                    if (Build.VERSION.SDK_INT == 23 && (c = c(this.f14749o, this.f14750p, iVar.f15115a)) != null) {
                        int indexOf = c.indexOf(Integer.valueOf(w2));
                        if (indexOf >= 0) {
                            c.remove(indexOf);
                        }
                        if (c.isEmpty()) {
                            lVar.f14174m.getClass();
                            w4 = fVar.w(lVar.f14174m.f14077g);
                        } else {
                            w4 = ((Integer) c.get(0)).intValue();
                        }
                        g(iVar, w4);
                    }
                    workDatabase.h();
                }
            } finally {
                workDatabase.f();
            }
        }
    }

    @Override // o0.InterfaceC1824c
    public final boolean f() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0071, code lost:
    
        if (r7 < 26) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(w0.i r19, int r20) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.b.g(w0.i, int):void");
    }
}
