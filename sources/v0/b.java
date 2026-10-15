package v0;

import C0.C;
import C0.O;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n0.h;
import n0.n;
import o0.InterfaceC1822a;
import o0.l;
import t3.g;
import w0.i;
import z0.InterfaceC2132a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b implements s0.b, InterfaceC1822a {

    /* renamed from: x, reason: collision with root package name */
    public static final String f15013x = n.h("SystemFgDispatcher");

    /* renamed from: o, reason: collision with root package name */
    public final l f15014o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC2132a f15015p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f15016q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public String f15017r;

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f15018s;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f15019t;

    /* renamed from: u, reason: collision with root package name */
    public final HashSet f15020u;

    /* renamed from: v, reason: collision with root package name */
    public final s0.c f15021v;

    /* renamed from: w, reason: collision with root package name */
    public SystemForegroundService f15022w;

    public b(Context context) {
        l N = l.N(context);
        this.f15014o = N;
        g gVar = N.f14176o;
        this.f15015p = gVar;
        this.f15017r = null;
        this.f15018s = new LinkedHashMap();
        this.f15020u = new HashSet();
        this.f15019t = new HashMap();
        this.f15021v = new s0.c(context, gVar, this);
        N.f14178q.b(this);
    }

    public static Intent b(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f14091a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f14092b);
        intent.putExtra("KEY_NOTIFICATION", hVar.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f14091a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f14092b);
        intent.putExtra("KEY_NOTIFICATION", hVar.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // o0.InterfaceC1822a
    public final void a(String str, boolean z4) {
        Map.Entry entry;
        synchronized (this.f15016q) {
            try {
                i iVar = (i) this.f15019t.remove(str);
                if (iVar != null ? this.f15020u.remove(iVar) : false) {
                    this.f15021v.c(this.f15020u);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        h hVar = (h) this.f15018s.remove(str);
        if (str.equals(this.f15017r) && this.f15018s.size() > 0) {
            Iterator it = this.f15018s.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f15017r = (String) entry.getKey();
            if (this.f15022w != null) {
                h hVar2 = (h) entry.getValue();
                SystemForegroundService systemForegroundService = this.f15022w;
                systemForegroundService.f3155p.post(new c(systemForegroundService, hVar2.f14091a, hVar2.c, hVar2.f14092b));
                SystemForegroundService systemForegroundService2 = this.f15022w;
                systemForegroundService2.f3155p.post(new C(hVar2.f14091a, 14, systemForegroundService2));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f15022w;
        if (hVar == null || systemForegroundService3 == null) {
            return;
        }
        n d = n.d();
        String str2 = f15013x;
        int i4 = hVar.f14091a;
        int i5 = hVar.f14092b;
        StringBuilder sb = new StringBuilder("Removing Notification (id: ");
        sb.append(i4);
        sb.append(", workSpecId: ");
        sb.append(str);
        sb.append(" ,notificationType: ");
        d.a(str2, U.a.l(sb, i5, ")"), new Throwable[0]);
        systemForegroundService3.f3155p.post(new C(hVar.f14091a, 14, systemForegroundService3));
    }

    @Override // s0.b
    public final void c(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            n.d().a(f15013x, n0.a.k("Constraints unmet for WorkSpec ", str), new Throwable[0]);
            l lVar = this.f15014o;
            lVar.f14176o.c(new x0.l(lVar, str, true));
        }
    }

    @Override // s0.b
    public final void e(List list) {
    }

    public final void f(Intent intent) {
        int i4 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        n d = n.d();
        StringBuilder sb = new StringBuilder("Notifying with (id: ");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType: ");
        d.a(f15013x, U.a.l(sb, intExtra2, ")"), new Throwable[0]);
        if (notification == null || this.f15022w == null) {
            return;
        }
        h hVar = new h(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f15018s;
        linkedHashMap.put(stringExtra, hVar);
        if (TextUtils.isEmpty(this.f15017r)) {
            this.f15017r = stringExtra;
            SystemForegroundService systemForegroundService = this.f15022w;
            systemForegroundService.f3155p.post(new c(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f15022w;
        systemForegroundService2.f3155p.post(new O(intExtra, 4, systemForegroundService2, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i4 |= ((h) ((Map.Entry) it.next()).getValue()).f14092b;
        }
        h hVar2 = (h) linkedHashMap.get(this.f15017r);
        if (hVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.f15022w;
            systemForegroundService3.f3155p.post(new c(systemForegroundService3, hVar2.f14091a, hVar2.c, i4));
        }
    }

    public final void g() {
        this.f15022w = null;
        synchronized (this.f15016q) {
            this.f15021v.d();
        }
        this.f15014o.f14178q.f(this);
    }
}
