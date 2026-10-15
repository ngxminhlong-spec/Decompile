package o0;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import c0.AbstractC0227h;
import c0.C0220a;
import c0.C0226g;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import g0.InterfaceC1679a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import k.o;
import m.C1801a;
import n0.n;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class l extends AbstractC1895f {

    /* renamed from: u, reason: collision with root package name */
    public static l f14170u;

    /* renamed from: v, reason: collision with root package name */
    public static l f14171v;

    /* renamed from: w, reason: collision with root package name */
    public static final Object f14172w;

    /* renamed from: l, reason: collision with root package name */
    public final Context f14173l;

    /* renamed from: m, reason: collision with root package name */
    public final n0.c f14174m;

    /* renamed from: n, reason: collision with root package name */
    public final WorkDatabase f14175n;

    /* renamed from: o, reason: collision with root package name */
    public final t3.g f14176o;

    /* renamed from: p, reason: collision with root package name */
    public final List f14177p;

    /* renamed from: q, reason: collision with root package name */
    public final C1823b f14178q;

    /* renamed from: r, reason: collision with root package name */
    public final o f14179r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f14180s;

    /* renamed from: t, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f14181t;

    static {
        n.h("WorkManagerImpl");
        f14170u = null;
        f14171v = null;
        f14172w = new Object();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [g0.a, java.lang.Object, o0.f] */
    public l(Context context, n0.c cVar, t3.g gVar) {
        C0226g c0226g;
        Executor executor;
        String str;
        boolean isDeviceProtectedStorage;
        boolean z4 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        x0.k kVar = (x0.k) gVar.f14961o;
        int i4 = WorkDatabase.f3136k;
        if (z4) {
            c0226g = new C0226g(applicationContext, null);
            c0226g.f3519g = true;
        } else {
            String str2 = k.f14168a;
            C0226g c0226g2 = new C0226g(applicationContext, "androidx.work.workdb");
            ?? obj = new Object();
            obj.f14162o = applicationContext;
            c0226g2.f3518f = obj;
            c0226g = c0226g2;
        }
        c0226g.d = kVar;
        Object obj2 = new Object();
        if (c0226g.c == null) {
            c0226g.c = new ArrayList();
        }
        c0226g.c.add(obj2);
        c0226g.a(j.f14163a);
        c0226g.a(new i(applicationContext, 2, 3));
        c0226g.a(j.f14164b);
        c0226g.a(j.c);
        c0226g.a(new i(applicationContext, 5, 6));
        c0226g.a(j.d);
        c0226g.a(j.f14165e);
        c0226g.a(j.f14166f);
        c0226g.a(new i(applicationContext));
        c0226g.a(new i(applicationContext, 10, 11));
        c0226g.a(j.f14167g);
        c0226g.f3520h = false;
        c0226g.f3521i = true;
        Context context2 = c0226g.f3516b;
        if (context2 == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        Executor executor2 = c0226g.d;
        if (executor2 == null && c0226g.f3517e == null) {
            X.b bVar = C1801a.f13968j;
            c0226g.f3517e = bVar;
            c0226g.d = bVar;
        } else if (executor2 != null && c0226g.f3517e == null) {
            c0226g.f3517e = executor2;
        } else if (executor2 == null && (executor = c0226g.f3517e) != null) {
            c0226g.d = executor;
        }
        if (c0226g.f3518f == null) {
            c0226g.f3518f = new V2.e(20);
        }
        String str3 = c0226g.f3515a;
        InterfaceC1679a interfaceC1679a = c0226g.f3518f;
        x0.f fVar = c0226g.f3522j;
        ArrayList arrayList = c0226g.c;
        boolean z5 = c0226g.f3519g;
        ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
        int i5 = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        Executor executor3 = c0226g.d;
        C0220a c0220a = new C0220a(context2, str3, interfaceC1679a, fVar, arrayList, z5, i5, executor3, c0226g.f3517e, c0226g.f3520h, c0226g.f3521i);
        int i6 = i5;
        String name = WorkDatabase.class.getPackage().getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        String str4 = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str4;
            } else {
                str = name + "." + str4;
            }
            AbstractC0227h abstractC0227h = (AbstractC0227h) Class.forName(str).newInstance();
            g0.b e4 = abstractC0227h.e(c0220a);
            abstractC0227h.c = e4;
            boolean z6 = i6 == 3;
            e4.setWriteAheadLoggingEnabled(z6);
            abstractC0227h.f3528g = arrayList;
            abstractC0227h.f3525b = executor3;
            new ArrayDeque();
            abstractC0227h.f3526e = z5;
            abstractC0227h.f3527f = z6;
            WorkDatabase workDatabase = (WorkDatabase) abstractC0227h;
            Context applicationContext2 = context.getApplicationContext();
            n nVar = new n(cVar.f14076f, 0);
            synchronized (n.class) {
                n.f14096q = nVar;
            }
            String str5 = d.f14155a;
            r0.b bVar2 = new r0.b(applicationContext2, this);
            x0.g.a(applicationContext2, SystemJobService.class, true);
            n.d().a(d.f14155a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            List asList = Arrays.asList(bVar2, new p0.b(applicationContext2, cVar, gVar, this));
            C1823b c1823b = new C1823b(context, cVar, gVar, workDatabase, asList);
            Context applicationContext3 = context.getApplicationContext();
            this.f14173l = applicationContext3;
            this.f14174m = cVar;
            this.f14176o = gVar;
            this.f14175n = workDatabase;
            this.f14177p = asList;
            this.f14178q = c1823b;
            this.f14179r = new o(19, workDatabase);
            this.f14180s = false;
            if (Build.VERSION.SDK_INT >= 24) {
                isDeviceProtectedStorage = applicationContext3.isDeviceProtectedStorage();
                if (isDeviceProtectedStorage) {
                    throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
                }
            }
            this.f14176o.c(new x0.e(applicationContext3, this));
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + str4 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + WorkDatabase.class.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class.getCanonicalName());
        }
    }

    public static l M() {
        synchronized (f14172w) {
            try {
                l lVar = f14170u;
                if (lVar != null) {
                    return lVar;
                }
                return f14171v;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static l N(Context context) {
        l M4;
        synchronized (f14172w) {
            try {
                M4 = M();
                if (M4 == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return M4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r6 = r6.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (o0.l.f14171v != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        r3 = r7.f14074b;
        r2 = new java.lang.Object();
        r2.f14962p = new android.os.Handler(android.os.Looper.getMainLooper());
        r2.f14963q = new A2.q(2, r2);
        r2.f14961o = new x0.k(r3);
        o0.l.f14171v = new o0.l(r6, r7, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        o0.l.f14170u = o0.l.f14171v;
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, t3.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void O(android.content.Context r6, n0.c r7) {
        /*
            java.lang.Object r0 = o0.l.f14172w
            monitor-enter(r0)
            o0.l r1 = o0.l.f14170u     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            o0.l r2 = o0.l.f14171v     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lc
            goto L16
        Lc:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r7 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L14
            throw r6     // Catch: java.lang.Throwable -> L14
        L14:
            r6 = move-exception
            goto L4e
        L16:
            if (r1 != 0) goto L4c
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L14
            o0.l r1 = o0.l.f14171v     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L48
            o0.l r1 = new o0.l     // Catch: java.lang.Throwable -> L14
            t3.g r2 = new t3.g     // Catch: java.lang.Throwable -> L14
            java.util.concurrent.ExecutorService r3 = r7.f14074b     // Catch: java.lang.Throwable -> L14
            r2.<init>()     // Catch: java.lang.Throwable -> L14
            android.os.Handler r4 = new android.os.Handler     // Catch: java.lang.Throwable -> L14
            android.os.Looper r5 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L14
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L14
            r2.f14962p = r4     // Catch: java.lang.Throwable -> L14
            A2.q r4 = new A2.q     // Catch: java.lang.Throwable -> L14
            r5 = 2
            r4.<init>(r5, r2)     // Catch: java.lang.Throwable -> L14
            r2.f14963q = r4     // Catch: java.lang.Throwable -> L14
            x0.k r4 = new x0.k     // Catch: java.lang.Throwable -> L14
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L14
            r2.f14961o = r4     // Catch: java.lang.Throwable -> L14
            r1.<init>(r6, r7, r2)     // Catch: java.lang.Throwable -> L14
            o0.l.f14171v = r1     // Catch: java.lang.Throwable -> L14
        L48:
            o0.l r6 = o0.l.f14171v     // Catch: java.lang.Throwable -> L14
            o0.l.f14170u = r6     // Catch: java.lang.Throwable -> L14
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.l.O(android.content.Context, n0.c):void");
    }

    public final void P() {
        synchronized (f14172w) {
            try {
                this.f14180s = true;
                BroadcastReceiver.PendingResult pendingResult = this.f14181t;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f14181t = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Q() {
        ArrayList e4;
        String str = r0.b.f14748s;
        Context context = this.f14173l;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (e4 = r0.b.e(context, jobScheduler)) != null && !e4.isEmpty()) {
            int size = e4.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = e4.get(i4);
                i4++;
                r0.b.a(jobScheduler, ((JobInfo) obj).getId());
            }
        }
        WorkDatabase workDatabase = this.f14175n;
        C1.l n4 = workDatabase.n();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) n4.f500a;
        workDatabase_Impl.b();
        w0.e eVar = (w0.e) n4.f506i;
        h0.f a4 = eVar.a();
        workDatabase_Impl.c();
        try {
            a4.f13116r.executeUpdateDelete();
            workDatabase_Impl.h();
            workDatabase_Impl.f();
            eVar.c(a4);
            d.a(this.f14174m, workDatabase, this.f14177p);
        } catch (Throwable th) {
            workDatabase_Impl.f();
            eVar.c(a4);
            throw th;
        }
    }

    public final void R(String str, q2.e eVar) {
        E.n nVar = new E.n(12);
        nVar.f704p = this;
        nVar.f705q = str;
        nVar.f706r = eVar;
        this.f14176o.c(nVar);
    }

    public final void S(String str) {
        this.f14176o.c(new x0.l(this, str, false));
    }
}
