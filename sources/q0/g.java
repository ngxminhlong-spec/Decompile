package q0;

import C0.O;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import n0.n;
import o0.C1823b;
import o0.InterfaceC1822a;
import o0.l;
import x0.m;
import x0.u;
import z0.InterfaceC2132a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g implements InterfaceC1822a {
    public static final String y = n.h("SystemAlarmDispatcher");

    /* renamed from: o, reason: collision with root package name */
    public final Context f14637o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC2132a f14638p;

    /* renamed from: q, reason: collision with root package name */
    public final u f14639q;

    /* renamed from: r, reason: collision with root package name */
    public final C1823b f14640r;

    /* renamed from: s, reason: collision with root package name */
    public final l f14641s;

    /* renamed from: t, reason: collision with root package name */
    public final b f14642t;

    /* renamed from: u, reason: collision with root package name */
    public final Handler f14643u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f14644v;

    /* renamed from: w, reason: collision with root package name */
    public Intent f14645w;

    /* renamed from: x, reason: collision with root package name */
    public SystemAlarmService f14646x;

    public g(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f14637o = applicationContext;
        this.f14642t = new b(applicationContext);
        this.f14639q = new u();
        l N = l.N(systemAlarmService);
        this.f14641s = N;
        C1823b c1823b = N.f14178q;
        this.f14640r = c1823b;
        this.f14638p = N.f14176o;
        c1823b.b(this);
        this.f14644v = new ArrayList();
        this.f14645w = null;
        this.f14643u = new Handler(Looper.getMainLooper());
    }

    @Override // o0.InterfaceC1822a
    public final void a(String str, boolean z4) {
        String str2 = b.f14618r;
        Intent intent = new Intent(this.f14637o, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z4);
        f(new O(0, intent, this));
    }

    public final void b(Intent intent, int i4) {
        n d = n.d();
        String str = y;
        d.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i4)), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            n.d().i(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && d()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i4);
        synchronized (this.f14644v) {
            try {
                boolean isEmpty = this.f14644v.isEmpty();
                this.f14644v.add(intent);
                if (isEmpty) {
                    g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        if (this.f14643u.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final boolean d() {
        c();
        synchronized (this.f14644v) {
            try {
                ArrayList arrayList = this.f14644v;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        n.d().a(y, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f14640r.f(this);
        ScheduledExecutorService scheduledExecutorService = this.f14639q.f15246a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f14646x = null;
    }

    public final void f(Runnable runnable) {
        this.f14643u.post(runnable);
    }

    public final void g() {
        c();
        PowerManager.WakeLock a4 = m.a(this.f14637o, "ProcessCommand");
        try {
            a4.acquire();
            this.f14641s.f14176o.c(new f(this, 0));
        } finally {
            a4.release();
        }
    }
}
