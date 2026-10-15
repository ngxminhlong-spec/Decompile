package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.l;
import java.util.HashMap;
import java.util.WeakHashMap;
import n0.n;
import q0.g;
import x0.m;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class SystemAlarmService extends l {

    /* renamed from: r, reason: collision with root package name */
    public static final String f3147r = n.h("SystemAlarmService");

    /* renamed from: p, reason: collision with root package name */
    public g f3148p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3149q;

    public final void b() {
        this.f3149q = true;
        n.d().a(f3147r, "All commands completed in dispatcher", new Throwable[0]);
        String str = m.f15226a;
        HashMap hashMap = new HashMap();
        WeakHashMap weakHashMap = m.f15227b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                n.d().i(m.f15226a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public final void onCreate() {
        super.onCreate();
        g gVar = new g(this);
        this.f3148p = gVar;
        if (gVar.f14646x != null) {
            n.d().c(g.y, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            gVar.f14646x = this;
        }
        this.f3149q = false;
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f3149q = true;
        this.f3148p.e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i4, int i5) {
        super.onStartCommand(intent, i4, i5);
        if (this.f3149q) {
            n.d().e(f3147r, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f3148p.e();
            g gVar = new g(this);
            this.f3148p = gVar;
            if (gVar.f14646x != null) {
                n.d().c(g.y, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                gVar.f14646x = this;
            }
            this.f3149q = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f3148p.b(intent, i5);
        return 3;
    }
}
