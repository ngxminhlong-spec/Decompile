package q0;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import n0.n;
import x0.k;
import x0.m;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14635o;

    /* renamed from: p, reason: collision with root package name */
    public final g f14636p;

    public /* synthetic */ f(g gVar, int i4) {
        this.f14635o = i4;
        this.f14636p = gVar;
    }

    private final void a() {
        g gVar;
        f fVar;
        synchronized (this.f14636p.f14644v) {
            g gVar2 = this.f14636p;
            gVar2.f14645w = (Intent) gVar2.f14644v.get(0);
        }
        Intent intent = this.f14636p.f14645w;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.f14636p.f14645w.getIntExtra("KEY_START_ID", 0);
            n d = n.d();
            String str = g.y;
            int i4 = 1;
            d.a(str, String.format("Processing command %s, %s", this.f14636p.f14645w, Integer.valueOf(intExtra)), new Throwable[0]);
            PowerManager.WakeLock a4 = m.a(this.f14636p.f14637o, action + " (" + intExtra + ")");
            try {
                n.d().a(str, "Acquiring operation wake lock (" + action + ") " + a4, new Throwable[0]);
                a4.acquire();
                g gVar3 = this.f14636p;
                gVar3.f14642t.e(intExtra, gVar3.f14645w, gVar3);
                n.d().a(str, "Releasing operation wake lock (" + action + ") " + a4, new Throwable[0]);
                a4.release();
                gVar = this.f14636p;
                fVar = new f(gVar, i4);
            } catch (Throwable th) {
                try {
                    n d4 = n.d();
                    String str2 = g.y;
                    d4.c(str2, "Unexpected error in onHandleIntent", th);
                    n.d().a(str2, "Releasing operation wake lock (" + action + ") " + a4, new Throwable[0]);
                    a4.release();
                    gVar = this.f14636p;
                    fVar = new f(gVar, i4);
                } catch (Throwable th2) {
                    n.d().a(g.y, "Releasing operation wake lock (" + action + ") " + a4, new Throwable[0]);
                    a4.release();
                    g gVar4 = this.f14636p;
                    gVar4.f(new f(gVar4, i4));
                    throw th2;
                }
            }
            gVar.f(fVar);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14635o) {
            case 0:
                a();
                return;
            default:
                g gVar = this.f14636p;
                n d = n.d();
                String str = g.y;
                d.a(str, "Checking if commands are complete.", new Throwable[0]);
                gVar.c();
                synchronized (gVar.f14644v) {
                    try {
                        if (gVar.f14645w != null) {
                            n.d().a(str, String.format("Removing command %s", gVar.f14645w), new Throwable[0]);
                            if (!((Intent) gVar.f14644v.remove(0)).equals(gVar.f14645w)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            gVar.f14645w = null;
                        }
                        k kVar = (k) ((t3.g) gVar.f14638p).f14961o;
                        if (!gVar.f14642t.d() && gVar.f14644v.isEmpty() && !kVar.a()) {
                            n.d().a(str, "No more commands & intents.", new Throwable[0]);
                            SystemAlarmService systemAlarmService = gVar.f14646x;
                            if (systemAlarmService != null) {
                                systemAlarmService.b();
                            }
                        } else if (!gVar.f14644v.isEmpty()) {
                            gVar.g();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
