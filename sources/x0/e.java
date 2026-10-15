package x0;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: r, reason: collision with root package name */
    public static final String f15206r = n0.n.h("ForceStopRunnable");

    /* renamed from: s, reason: collision with root package name */
    public static final long f15207s = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: o, reason: collision with root package name */
    public final Context f15208o;

    /* renamed from: p, reason: collision with root package name */
    public final o0.l f15209p;

    /* renamed from: q, reason: collision with root package name */
    public int f15210q = 0;

    public e(Context context, o0.l lVar) {
        this.f15208o = context.getApplicationContext();
        this.f15209p = lVar;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i4 = D.a.a() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i4);
        long currentTimeMillis = System.currentTimeMillis() + f15207s;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.e.a():void");
    }

    public final boolean b() {
        n0.c cVar = this.f15209p.f14174m;
        cVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f15206r;
        if (isEmpty) {
            n0.n.d().a(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a4 = i.a(this.f15208o, cVar);
        n0.n.d().a(str, "Is default app process = " + a4, new Throwable[0]);
        return a4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f15206r;
        o0.l lVar = this.f15209p;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                o0.k.a(this.f15208o);
                n0.n.d().a(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e4) {
                    int i4 = this.f15210q + 1;
                    this.f15210q = i4;
                    if (i4 >= 3) {
                        n0.n.d().c(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e4);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e4);
                        lVar.f14174m.getClass();
                        throw illegalStateException;
                    }
                    long j4 = i4 * 300;
                    n0.n.d().a(str, "Retrying after " + j4, e4);
                    try {
                        Thread.sleep(this.f15210q * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } finally {
            lVar.P();
        }
    }
}
