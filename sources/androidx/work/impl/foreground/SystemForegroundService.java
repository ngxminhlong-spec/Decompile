package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.l;
import java.util.UUID;
import n0.n;
import t3.g;
import v0.b;
import x0.C2059a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class SystemForegroundService extends l {

    /* renamed from: t, reason: collision with root package name */
    public static final String f3154t = n.h("SystemFgService");

    /* renamed from: p, reason: collision with root package name */
    public Handler f3155p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3156q;

    /* renamed from: r, reason: collision with root package name */
    public b f3157r;

    /* renamed from: s, reason: collision with root package name */
    public NotificationManager f3158s;

    public final void b() {
        this.f3155p = new Handler(Looper.getMainLooper());
        this.f3158s = (NotificationManager) getApplicationContext().getSystemService("notification");
        b bVar = new b(getApplicationContext());
        this.f3157r = bVar;
        if (bVar.f15022w != null) {
            n.d().c(b.f15013x, "A callback already exists.", new Throwable[0]);
        } else {
            bVar.f15022w = this;
        }
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public final void onCreate() {
        super.onCreate();
        b();
    }

    @Override // androidx.lifecycle.l, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f3157r.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i4, int i5) {
        super.onStartCommand(intent, i4, i5);
        boolean z4 = this.f3156q;
        String str = f3154t;
        if (z4) {
            n.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f3157r.g();
            b();
            this.f3156q = false;
        }
        if (intent == null) {
            return 3;
        }
        b bVar = this.f3157r;
        o0.l lVar = bVar.f15014o;
        String str2 = b.f15013x;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            n.d().e(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            ((g) bVar.f15015p).c(new E.n(bVar, lVar.f14175n, stringExtra, 11, false));
            bVar.f(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            bVar.f(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            n.d().e(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            UUID fromString = UUID.fromString(stringExtra2);
            lVar.getClass();
            lVar.f14176o.c(new C2059a(lVar, fromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        n.d().e(str2, "Stopping foreground service", new Throwable[0]);
        SystemForegroundService systemForegroundService = bVar.f15022w;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.f3156q = true;
        n.d().a(str, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            systemForegroundService.stopForeground(true);
        }
        systemForegroundService.stopSelf();
        return 3;
    }
}
