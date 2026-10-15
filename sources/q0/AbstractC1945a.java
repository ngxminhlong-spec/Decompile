package q0;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import n0.n;
import o0.l;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1945a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14617a = n.h("Alarms");

    public static void a(int i4, Context context, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i4, b.b(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        n.d().a(f14617a, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i4 + ")", new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, l lVar, String str, long j4) {
        int intValue;
        WorkDatabase workDatabase = lVar.f14175n;
        t3.g k3 = workDatabase.k();
        w0.d d = k3.d(str);
        if (d != null) {
            a(d.f15109b, context, str);
            int i4 = d.f15109b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i4, b.b(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j4, service);
                return;
            }
            return;
        }
        synchronized (x0.f.class) {
            workDatabase.c();
            try {
                Long p3 = workDatabase.j().p("next_alarm_manager_id");
                intValue = p3 != null ? p3.intValue() : 0;
                workDatabase.j().s(new w0.c("next_alarm_manager_id", intValue == Integer.MAX_VALUE ? 0 : intValue + 1));
                workDatabase.h();
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        k3.e(new w0.d(str, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, intValue, b.b(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j4, service2);
        }
    }
}
