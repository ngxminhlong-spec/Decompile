package o0;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import c0.C0229j;
import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.ads.Wl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import n0.n;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: H, reason: collision with root package name */
    public static final String f14182H = n.h("WorkerWrapper");

    /* renamed from: A, reason: collision with root package name */
    public Wl f14183A;

    /* renamed from: B, reason: collision with root package name */
    public Wl f14184B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayList f14185C;

    /* renamed from: D, reason: collision with root package name */
    public String f14186D;

    /* renamed from: E, reason: collision with root package name */
    public y0.j f14187E;

    /* renamed from: F, reason: collision with root package name */
    public InterfaceFutureC0239a f14188F;

    /* renamed from: G, reason: collision with root package name */
    public volatile boolean f14189G;

    /* renamed from: o, reason: collision with root package name */
    public Context f14190o;

    /* renamed from: p, reason: collision with root package name */
    public String f14191p;

    /* renamed from: q, reason: collision with root package name */
    public List f14192q;

    /* renamed from: r, reason: collision with root package name */
    public q2.e f14193r;

    /* renamed from: s, reason: collision with root package name */
    public w0.i f14194s;

    /* renamed from: t, reason: collision with root package name */
    public ListenableWorker f14195t;

    /* renamed from: u, reason: collision with root package name */
    public t3.g f14196u;

    /* renamed from: v, reason: collision with root package name */
    public n0.m f14197v;

    /* renamed from: w, reason: collision with root package name */
    public n0.c f14198w;

    /* renamed from: x, reason: collision with root package name */
    public C1823b f14199x;
    public WorkDatabase y;

    /* renamed from: z, reason: collision with root package name */
    public C1.l f14200z;

    public final void a(n0.m mVar) {
        boolean z4 = mVar instanceof n0.l;
        String str = f14182H;
        if (!z4) {
            if (mVar instanceof n0.k) {
                n.d().e(str, n0.a.k("Worker result RETRY for ", this.f14186D), new Throwable[0]);
                c();
                return;
            }
            n.d().e(str, n0.a.k("Worker result FAILURE for ", this.f14186D), new Throwable[0]);
            if (this.f14194s.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        n.d().e(str, n0.a.k("Worker result SUCCESS for ", this.f14186D), new Throwable[0]);
        if (this.f14194s.c()) {
            d();
            return;
        }
        Wl wl = this.f14183A;
        String str2 = this.f14191p;
        C1.l lVar = this.f14200z;
        WorkDatabase workDatabase = this.y;
        workDatabase.c();
        try {
            lVar.o(3, str2);
            lVar.m(str2, ((n0.l) this.f14197v).f14095a);
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList a4 = wl.a(str2);
            int size = a4.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = a4.get(i4);
                i4++;
                String str3 = (String) obj;
                if (lVar.e(str3) == 5) {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) wl.f7563p;
                    C0229j d = C0229j.d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                    if (str3 == null) {
                        d.f(1);
                    } else {
                        d.g(str3, 1);
                    }
                    workDatabase_Impl.b();
                    Cursor g4 = workDatabase_Impl.g(d);
                    try {
                        if (g4.moveToFirst() && g4.getInt(0) != 0) {
                            n.d().e(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                            lVar.o(1, str3);
                            lVar.n(str3, currentTimeMillis);
                        }
                    } finally {
                        g4.close();
                        d.h();
                    }
                }
            }
            workDatabase.h();
            workDatabase.f();
            e(false);
        } catch (Throwable th) {
            workDatabase.f();
            e(false);
            throw th;
        }
    }

    public final void b() {
        List list = this.f14192q;
        String str = this.f14191p;
        WorkDatabase workDatabase = this.y;
        if (!h()) {
            workDatabase.c();
            try {
                int e4 = this.f14200z.e(str);
                u0.g m4 = workDatabase.m();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) m4.f14983p;
                workDatabase_Impl.b();
                w0.e eVar = (w0.e) m4.f14985r;
                h0.f a4 = eVar.a();
                if (str == null) {
                    a4.e(1);
                } else {
                    a4.f(str, 1);
                }
                workDatabase_Impl.c();
                try {
                    a4.l();
                    workDatabase_Impl.h();
                    if (e4 == 0) {
                        e(false);
                    } else if (e4 == 2) {
                        a(this.f14197v);
                    } else if (!n0.a.a(e4)) {
                        c();
                    }
                    workDatabase.h();
                    workDatabase.f();
                } finally {
                    workDatabase_Impl.f();
                    eVar.c(a4);
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC1824c) it.next()).b(str);
            }
            d.a(this.f14198w, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f14191p;
        C1.l lVar = this.f14200z;
        WorkDatabase workDatabase = this.y;
        workDatabase.c();
        try {
            lVar.o(1, str);
            lVar.n(str, System.currentTimeMillis());
            lVar.k(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(true);
        }
    }

    public final void d() {
        String str = this.f14191p;
        C1.l lVar = this.f14200z;
        WorkDatabase workDatabase = this.y;
        workDatabase.c();
        try {
            lVar.n(str, System.currentTimeMillis());
            lVar.o(1, str);
            lVar.l(str);
            lVar.k(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0046, B:15:0x005a, B:17:0x005e, B:19:0x0062, B:21:0x0068, B:22:0x006e, B:30:0x007b, B:32:0x007c, B:38:0x0090, B:39:0x0096, B:24:0x006f, B:25:0x0077, B:5:0x0020, B:7:0x0027), top: B:2:0x0005, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0046, B:15:0x005a, B:17:0x005e, B:19:0x0062, B:21:0x0068, B:22:0x006e, B:30:0x007b, B:32:0x007c, B:38:0x0090, B:39:0x0096, B:24:0x006f, B:25:0x0077, B:5:0x0020, B:7:0x0027), top: B:2:0x0005, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.y
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r5.y     // Catch: java.lang.Throwable -> L42
            C1.l r0 = r0.n()     // Catch: java.lang.Throwable -> L42
            r0.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            c0.j r1 = c0.C0229j.d(r1, r2)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.f500a     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0     // Catch: java.lang.Throwable -> L42
            r0.b()     // Catch: java.lang.Throwable -> L42
            android.database.Cursor r0 = r0.g(r1)     // Catch: java.lang.Throwable -> L42
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2f
            r4 = 1
            if (r3 == 0) goto L31
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L31
            r3 = r4
            goto L32
        L2f:
            r6 = move-exception
            goto L90
        L31:
            r3 = r2
        L32:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.h()     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L44
            android.content.Context r0 = r5.f14190o     // Catch: java.lang.Throwable -> L42
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            x0.g.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r6 = move-exception
            goto L97
        L44:
            if (r6 == 0) goto L5a
            C1.l r0 = r5.f14200z     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f14191p     // Catch: java.lang.Throwable -> L42
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L42
            r0.o(r4, r1)     // Catch: java.lang.Throwable -> L42
            C1.l r0 = r5.f14200z     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f14191p     // Catch: java.lang.Throwable -> L42
            r2 = -1
            r0.k(r1, r2)     // Catch: java.lang.Throwable -> L42
        L5a:
            w0.i r0 = r5.f14194s     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            androidx.work.ListenableWorker r0 = r5.f14195t     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            boolean r0 = r0.isRunInForeground()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            o0.b r0 = r5.f14199x     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f14191p     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r0.y     // Catch: java.lang.Throwable -> L42
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L42
            java.util.HashMap r3 = r0.f14150t     // Catch: java.lang.Throwable -> L79
            r3.remove(r1)     // Catch: java.lang.Throwable -> L79
            r0.i()     // Catch: java.lang.Throwable -> L79
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            goto L7c
        L79:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            throw r6     // Catch: java.lang.Throwable -> L42
        L7c:
            androidx.work.impl.WorkDatabase r0 = r5.y     // Catch: java.lang.Throwable -> L42
            r0.h()     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase r0 = r5.y
            r0.f()
            y0.j r0 = r5.f14187E
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.i(r6)
            return
        L90:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.h()     // Catch: java.lang.Throwable -> L42
            throw r6     // Catch: java.lang.Throwable -> L42
        L97:
            androidx.work.impl.WorkDatabase r0 = r5.y
            r0.f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.m.e(boolean):void");
    }

    public final void f() {
        C1.l lVar = this.f14200z;
        String str = this.f14191p;
        int e4 = lVar.e(str);
        String str2 = f14182H;
        if (e4 == 2) {
            n.d().a(str2, U.a.k("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            e(true);
            return;
        }
        n.d().a(str2, "Status for " + str + " is " + n0.a.n(e4) + "; not doing any work", new Throwable[0]);
        e(false);
    }

    public final void g() {
        C1.l lVar = this.f14200z;
        String str = this.f14191p;
        WorkDatabase workDatabase = this.y;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                if (lVar.e(str2) != 6) {
                    lVar.o(4, str2);
                }
                linkedList.addAll(this.f14183A.a(str2));
            }
            lVar.m(str, ((n0.j) this.f14197v).f14094a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.f14189G) {
            return false;
        }
        n.d().a(f14182H, n0.a.k("Work interrupted for ", this.f14186D), new Throwable[0]);
        if (this.f14200z.e(this.f14191p) == 0) {
            e(false);
            return true;
        }
        e(!n0.a.a(r0));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
    
        if ((r9.f15116b == 1 && r9.f15123k > 0) != false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [y0.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [androidx.work.WorkerParameters, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.m.run():void");
    }
}
