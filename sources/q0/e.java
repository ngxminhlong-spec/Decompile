package q0;

import C0.O;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Collections;
import java.util.List;
import n0.n;
import o0.InterfaceC1822a;
import w0.i;
import x0.m;
import x0.s;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e implements s0.b, InterfaceC1822a, s {

    /* renamed from: x, reason: collision with root package name */
    public static final String f14625x = n.h("DelayMetCommandHandler");

    /* renamed from: o, reason: collision with root package name */
    public final Context f14626o;

    /* renamed from: p, reason: collision with root package name */
    public final int f14627p;

    /* renamed from: q, reason: collision with root package name */
    public final String f14628q;

    /* renamed from: r, reason: collision with root package name */
    public final g f14629r;

    /* renamed from: s, reason: collision with root package name */
    public final s0.c f14630s;

    /* renamed from: v, reason: collision with root package name */
    public PowerManager.WakeLock f14633v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14634w = false;

    /* renamed from: u, reason: collision with root package name */
    public int f14632u = 0;

    /* renamed from: t, reason: collision with root package name */
    public final Object f14631t = new Object();

    public e(Context context, int i4, String str, g gVar) {
        this.f14626o = context;
        this.f14627p = i4;
        this.f14629r = gVar;
        this.f14628q = str;
        this.f14630s = new s0.c(context, gVar.f14638p, this);
    }

    @Override // o0.InterfaceC1822a
    public final void a(String str, boolean z4) {
        n.d().a(f14625x, "onExecuted " + str + ", " + z4, new Throwable[0]);
        b();
        int i4 = this.f14627p;
        g gVar = this.f14629r;
        Context context = this.f14626o;
        if (z4) {
            gVar.f(new O(i4, b.c(context, this.f14628q), gVar));
        }
        if (this.f14634w) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            gVar.f(new O(i4, intent, gVar));
        }
    }

    public final void b() {
        synchronized (this.f14631t) {
            try {
                this.f14630s.d();
                this.f14629r.f14639q.b(this.f14628q);
                PowerManager.WakeLock wakeLock = this.f14633v;
                if (wakeLock != null && wakeLock.isHeld()) {
                    n.d().a(f14625x, "Releasing wakelock " + this.f14633v + " for WorkSpec " + this.f14628q, new Throwable[0]);
                    this.f14633v.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // s0.b
    public final void c(List list) {
        f();
    }

    public final void d() {
        StringBuilder sb = new StringBuilder();
        String str = this.f14628q;
        sb.append(str);
        sb.append(" (");
        sb.append(this.f14627p);
        sb.append(")");
        this.f14633v = m.a(this.f14626o, sb.toString());
        n d = n.d();
        PowerManager.WakeLock wakeLock = this.f14633v;
        String str2 = f14625x;
        d.a(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.f14633v.acquire();
        i h4 = this.f14629r.f14641s.f14175n.n().h(str);
        if (h4 == null) {
            f();
            return;
        }
        boolean b4 = h4.b();
        this.f14634w = b4;
        if (b4) {
            this.f14630s.c(Collections.singletonList(h4));
        } else {
            n.d().a(str2, n0.a.k("No constraints for ", str), new Throwable[0]);
            e(Collections.singletonList(str));
        }
    }

    @Override // s0.b
    public final void e(List list) {
        if (list.contains(this.f14628q)) {
            synchronized (this.f14631t) {
                try {
                    if (this.f14632u == 0) {
                        this.f14632u = 1;
                        n.d().a(f14625x, "onAllConstraintsMet for " + this.f14628q, new Throwable[0]);
                        if (this.f14629r.f14640r.h(this.f14628q, null)) {
                            this.f14629r.f14639q.a(this.f14628q, this);
                        } else {
                            b();
                        }
                    } else {
                        n.d().a(f14625x, "Already started work for " + this.f14628q, new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void f() {
        synchronized (this.f14631t) {
            try {
                if (this.f14632u < 2) {
                    this.f14632u = 2;
                    n d = n.d();
                    String str = f14625x;
                    d.a(str, "Stopping work for WorkSpec " + this.f14628q, new Throwable[0]);
                    Context context = this.f14626o;
                    String str2 = this.f14628q;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    g gVar = this.f14629r;
                    gVar.f(new O(this.f14627p, intent, gVar));
                    if (this.f14629r.f14640r.e(this.f14628q)) {
                        n.d().a(str, "WorkSpec " + this.f14628q + " needs to be rescheduled", new Throwable[0]);
                        Intent c = b.c(this.f14626o, this.f14628q);
                        g gVar2 = this.f14629r;
                        gVar2.f(new O(this.f14627p, c, gVar2));
                    } else {
                        n.d().a(str, "Processor does not have WorkSpec " + this.f14628q + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    n.d().a(f14625x, "Already stopped work for " + this.f14628q, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
