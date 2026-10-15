package o0;

import A2.q;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import c3.InterfaceFutureC0239a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import n0.n;
import v0.InterfaceC2021a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1823b implements InterfaceC1822a, InterfaceC2021a {

    /* renamed from: z, reason: collision with root package name */
    public static final String f14144z = n.h("Processor");

    /* renamed from: p, reason: collision with root package name */
    public final Context f14146p;

    /* renamed from: q, reason: collision with root package name */
    public final n0.c f14147q;

    /* renamed from: r, reason: collision with root package name */
    public final t3.g f14148r;

    /* renamed from: s, reason: collision with root package name */
    public final WorkDatabase f14149s;

    /* renamed from: v, reason: collision with root package name */
    public final List f14152v;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f14151u = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f14150t = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    public final HashSet f14153w = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f14154x = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public PowerManager.WakeLock f14145o = null;
    public final Object y = new Object();

    public C1823b(Context context, n0.c cVar, t3.g gVar, WorkDatabase workDatabase, List list) {
        this.f14146p = context;
        this.f14147q = cVar;
        this.f14148r = gVar;
        this.f14149s = workDatabase;
        this.f14152v = list;
    }

    public static boolean c(String str, m mVar) {
        boolean z4;
        if (mVar == null) {
            n.d().a(f14144z, n0.a.k("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        mVar.f14189G = true;
        mVar.h();
        InterfaceFutureC0239a interfaceFutureC0239a = mVar.f14188F;
        if (interfaceFutureC0239a != null) {
            z4 = interfaceFutureC0239a.isDone();
            mVar.f14188F.cancel(true);
        } else {
            z4 = false;
        }
        ListenableWorker listenableWorker = mVar.f14195t;
        if (listenableWorker == null || z4) {
            n.d().a(m.f14182H, "WorkSpec " + mVar.f14194s + " is already done. Not interrupting.", new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        n.d().a(f14144z, n0.a.k("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    @Override // o0.InterfaceC1822a
    public final void a(String str, boolean z4) {
        synchronized (this.y) {
            try {
                this.f14151u.remove(str);
                int i4 = 0;
                n.d().a(f14144z, C1823b.class.getSimpleName() + " " + str + " executed; reschedule = " + z4, new Throwable[0]);
                ArrayList arrayList = this.f14154x;
                int size = arrayList.size();
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((InterfaceC1822a) obj).a(str, z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(InterfaceC1822a interfaceC1822a) {
        synchronized (this.y) {
            this.f14154x.add(interfaceC1822a);
        }
    }

    public final boolean d(String str) {
        boolean contains;
        synchronized (this.y) {
            contains = this.f14153w.contains(str);
        }
        return contains;
    }

    public final boolean e(String str) {
        boolean z4;
        synchronized (this.y) {
            try {
                z4 = this.f14151u.containsKey(str) || this.f14150t.containsKey(str);
            } finally {
            }
        }
        return z4;
    }

    public final void f(InterfaceC1822a interfaceC1822a) {
        synchronized (this.y) {
            this.f14154x.remove(interfaceC1822a);
        }
    }

    public final void g(String str, n0.h hVar) {
        synchronized (this.y) {
            try {
                n.d().e(f14144z, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                m mVar = (m) this.f14151u.remove(str);
                if (mVar != null) {
                    if (this.f14145o == null) {
                        PowerManager.WakeLock a4 = x0.m.a(this.f14146p, "ProcessorForegroundLck");
                        this.f14145o = a4;
                        a4.acquire();
                    }
                    this.f14150t.put(str, mVar);
                    Intent d = v0.b.d(this.f14146p, str, hVar);
                    Context context = this.f14146p;
                    if (Build.VERSION.SDK_INT >= 26) {
                        B.a.p(context, d);
                    } else {
                        context.startService(d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [o0.m, java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r8v1, types: [y0.j, y0.h, java.lang.Object] */
    public final boolean h(String str, q2.e eVar) {
        synchronized (this.y) {
            try {
                if (e(str)) {
                    n.d().a(f14144z, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.f14146p;
                n0.c cVar = this.f14147q;
                t3.g gVar = this.f14148r;
                WorkDatabase workDatabase = this.f14149s;
                q2.e eVar2 = new q2.e(21);
                Context applicationContext = context.getApplicationContext();
                List list = this.f14152v;
                if (eVar == null) {
                    eVar = eVar2;
                }
                ?? obj = new Object();
                obj.f14197v = new n0.j();
                ?? obj2 = new Object();
                obj.f14187E = obj2;
                obj.f14188F = null;
                obj.f14190o = applicationContext;
                obj.f14196u = gVar;
                obj.f14199x = this;
                obj.f14191p = str;
                obj.f14192q = list;
                obj.f14193r = eVar;
                obj.f14195t = null;
                obj.f14198w = cVar;
                obj.y = workDatabase;
                obj.f14200z = workDatabase.n();
                obj.f14183A = workDatabase.i();
                obj.f14184B = workDatabase.o();
                E.n nVar = new E.n(4);
                nVar.f704p = this;
                nVar.f705q = str;
                nVar.f706r = obj2;
                obj2.a(nVar, (q) this.f14148r.f14963q);
                this.f14151u.put(str, obj);
                ((x0.k) this.f14148r.f14961o).execute(obj);
                n.d().a(f14144z, n0.a.i(C1823b.class.getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.y) {
            try {
                if (this.f14150t.isEmpty()) {
                    Context context = this.f14146p;
                    String str = v0.b.f15013x;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f14146p.startService(intent);
                    } catch (Throwable th) {
                        n.d().c(f14144z, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f14145o;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f14145o = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean j(String str) {
        boolean c;
        synchronized (this.y) {
            n.d().a(f14144z, "Processor stopping foreground work " + str, new Throwable[0]);
            c = c(str, (m) this.f14150t.remove(str));
        }
        return c;
    }

    public final boolean k(String str) {
        boolean c;
        synchronized (this.y) {
            n.d().a(f14144z, "Processor stopping background work " + str, new Throwable[0]);
            c = c(str, (m) this.f14151u.remove(str));
        }
        return c;
    }
}
