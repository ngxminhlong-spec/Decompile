package q0;

import C0.O;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import n0.n;
import o0.InterfaceC1822a;
import o0.l;
import w0.i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b implements InterfaceC1822a {

    /* renamed from: r, reason: collision with root package name */
    public static final String f14618r = n.h("CommandHandler");

    /* renamed from: o, reason: collision with root package name */
    public final Context f14619o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f14620p = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final Object f14621q = new Object();

    public b(Context context) {
        this.f14619o = context;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // o0.InterfaceC1822a
    public final void a(String str, boolean z4) {
        synchronized (this.f14621q) {
            try {
                InterfaceC1822a interfaceC1822a = (InterfaceC1822a) this.f14620p.remove(str);
                if (interfaceC1822a != null) {
                    interfaceC1822a.a(str, z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        boolean z4;
        synchronized (this.f14621q) {
            z4 = !this.f14620p.isEmpty();
        }
        return z4;
    }

    public final void e(int i4, Intent intent, g gVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            n.d().a(f14618r, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            Context context = this.f14619o;
            d dVar = new d(context, i4, gVar);
            s0.c cVar = dVar.f14624b;
            ArrayList d = gVar.f14641s.f14175n.n().d();
            String str = c.f14622a;
            int size = d.size();
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int i5 = 0;
            while (i5 < size) {
                Object obj = d.get(i5);
                i5++;
                n0.d dVar2 = ((i) obj).f15122j;
                z4 |= dVar2.d;
                z5 |= dVar2.f14081b;
                z6 |= dVar2.f14082e;
                z7 |= dVar2.f14080a != 1;
                if (z4 && z5 && z6 && z7) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f3145a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z5).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z6).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z7);
            context.sendBroadcast(intent2);
            cVar.c(d);
            ArrayList arrayList = new ArrayList(d.size());
            long currentTimeMillis = System.currentTimeMillis();
            int size2 = d.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = d.get(i6);
                i6++;
                i iVar = (i) obj2;
                String str3 = iVar.f15115a;
                if (currentTimeMillis >= iVar.a() && (!iVar.b() || cVar.a(str3))) {
                    arrayList.add(iVar);
                }
            }
            int size3 = arrayList.size();
            int i7 = 0;
            while (i7 < size3) {
                Object obj3 = arrayList.get(i7);
                i7++;
                String str4 = ((i) obj3).f15115a;
                Intent b4 = b(context, str4);
                n.d().a(d.c, U.a.k("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                gVar.f(new O(dVar.f14623a, b4, gVar));
            }
            cVar.d();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            n.d().a(f14618r, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i4)), new Throwable[0]);
            gVar.f14641s.Q();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            n.d().c(f14618r, U.a.k("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
            return;
        }
        if (!"ACTION_SCHEDULE_WORK".equals(action)) {
            if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.f14621q) {
                    try {
                        String string = extras2.getString("KEY_WORKSPEC_ID");
                        n d4 = n.d();
                        String str5 = f14618r;
                        d4.a(str5, "Handing delay met for " + string, new Throwable[0]);
                        if (this.f14620p.containsKey(string)) {
                            n.d().a(str5, "WorkSpec " + string + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                        } else {
                            e eVar = new e(this.f14619o, i4, string, gVar);
                            this.f14620p.put(string, eVar);
                            eVar.d();
                        }
                    } finally {
                    }
                }
                return;
            }
            if (!"ACTION_STOP_WORK".equals(action)) {
                if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                    n.d().i(f14618r, String.format("Ignoring intent %s", intent), new Throwable[0]);
                    return;
                }
                Bundle extras3 = intent.getExtras();
                String string2 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z8 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                n.d().a(f14618r, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i4)), new Throwable[0]);
                a(string2, z8);
                return;
            }
            String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
            n.d().a(f14618r, n0.a.k("Handing stopWork work for ", string3), new Throwable[0]);
            gVar.f14641s.S(string3);
            Context context2 = this.f14619o;
            l lVar = gVar.f14641s;
            String str6 = AbstractC1945a.f14617a;
            t3.g k3 = lVar.f14175n.k();
            w0.d d5 = k3.d(string3);
            if (d5 != null) {
                AbstractC1945a.a(d5.f15109b, context2, string3);
                n.d().a(AbstractC1945a.f14617a, U.a.k("Removing SystemIdInfo for workSpecId (", string3, ")"), new Throwable[0]);
                k3.f(string3);
            }
            gVar.a(string3, false);
            return;
        }
        Context context3 = this.f14619o;
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        n d6 = n.d();
        String str7 = f14618r;
        d6.a(str7, n0.a.k("Handling schedule work for ", string4), new Throwable[0]);
        l lVar2 = gVar.f14641s;
        WorkDatabase workDatabase = lVar2.f14175n;
        workDatabase.c();
        try {
            i h4 = workDatabase.n().h(string4);
            if (h4 == null) {
                n.d().i(str7, "Skipping scheduling " + string4 + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (n0.a.a(h4.f15116b)) {
                n.d().i(str7, "Skipping scheduling " + string4 + "because it is finished.", new Throwable[0]);
                return;
            }
            long a4 = h4.a();
            if (h4.b()) {
                n.d().a(str7, "Opportunistically setting an alarm for " + string4 + " at " + a4, new Throwable[0]);
                AbstractC1945a.b(context3, lVar2, string4, a4);
                Intent intent3 = new Intent(context3, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                gVar.f(new O(i4, intent3, gVar));
            } else {
                n.d().a(str7, "Setting up Alarms for " + string4 + " at " + a4, new Throwable[0]);
                AbstractC1945a.b(context3, lVar2, string4, a4);
            }
            workDatabase.h();
        } finally {
            workDatabase.f();
        }
    }
}
