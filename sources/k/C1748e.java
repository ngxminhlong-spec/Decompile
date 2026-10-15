package k;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import b3.InterfaceC0219a;
import c0.C0228i;
import c1.C0237f;
import c1.InterfaceC0235d;
import com.google.android.gms.internal.measurement.P2;
import com.google.android.gms.internal.measurement.Q2;
import com.google.android.gms.internal.measurement.t3;
import e0.C1658a;
import e0.C1659b;
import h0.C1694b;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import l.InterfaceC1766f0;
import l.InterfaceC1779m;
import p1.C1907E;
import p1.C1920f;
import p1.C1923i;
import p1.P;
import p1.h0;
import p1.i0;
import p1.l0;
import t2.C2000g;
import t2.G;
import t2.H;
import t2.L;
import v3.C2030a;
import v3.C2033d;
import x2.C2066c0;
import x2.C2103v0;
import x2.K;
import x2.M;
import x2.Q0;
import x2.T;
import x2.X0;
import x2.a1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1748e implements InterfaceC1766f0, k, InterfaceC0235d, t2.F, b3.d, InterfaceC0219a, y1.b, a1, M {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13385o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f13386p;

    public C1748e(int i4) {
        Handler handler;
        Handler handler2;
        this.f13385o = i4;
        switch (i4) {
            case 10:
                this.f13386p = new LinkedHashMap(0, 0.75f, true);
                return;
            default:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler2 = B.b.a(mainLooper);
                } else {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException e4) {
                        e = e4;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f13386p = handler2;
                        return;
                    } catch (InstantiationException e5) {
                        e = e5;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f13386p = handler2;
                        return;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f13386p = handler2;
                        return;
                    } catch (InvocationTargetException e7) {
                        Throwable cause = e7.getCause();
                        if (cause instanceof RuntimeException) {
                            throw ((RuntimeException) cause);
                        }
                        if (!(cause instanceof Error)) {
                            throw new RuntimeException(cause);
                        }
                        throw ((Error) cause);
                    }
                    handler2 = handler;
                }
                this.f13386p = handler2;
                return;
        }
    }

    public /* synthetic */ C1748e(int i4, Object obj) {
        this.f13385o = i4;
        this.f13386p = obj;
    }

    public C1748e(Context context, String str) {
        this.f13385o = 17;
        this.f13386p = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public static void j(C1694b c1694b) {
        c1694b.h("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c1694b.h("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        c1694b.h("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        c1694b.h("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        c1694b.h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        c1694b.h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        c1694b.h("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c1694b.h("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        c1694b.h("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c1694b.h("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c1694b.h("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        c1694b.h("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c1694b.h("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        c1694b.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c1694b.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static C0228i q(C1694b c1694b) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new C1658a(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap.put("prerequisite_id", new C1658a(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new C1659b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new C1659b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new e0.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
        hashSet2.add(new e0.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
        e0.e eVar = new e0.e("Dependency", hashMap, hashSet, hashSet2);
        e0.e a4 = e0.e.a(c1694b, "Dependency");
        if (!eVar.equals(a4)) {
            return new C0228i(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + a4);
        }
        HashMap hashMap2 = new HashMap(25);
        hashMap2.put("id", new C1658a(1, 1, "id", "TEXT", null, true));
        hashMap2.put("state", new C1658a(0, 1, "state", "INTEGER", null, true));
        hashMap2.put("worker_class_name", new C1658a(0, 1, "worker_class_name", "TEXT", null, true));
        hashMap2.put("input_merger_class_name", new C1658a(0, 1, "input_merger_class_name", "TEXT", null, false));
        hashMap2.put("input", new C1658a(0, 1, "input", "BLOB", null, true));
        hashMap2.put("output", new C1658a(0, 1, "output", "BLOB", null, true));
        hashMap2.put("initial_delay", new C1658a(0, 1, "initial_delay", "INTEGER", null, true));
        hashMap2.put("interval_duration", new C1658a(0, 1, "interval_duration", "INTEGER", null, true));
        hashMap2.put("flex_duration", new C1658a(0, 1, "flex_duration", "INTEGER", null, true));
        hashMap2.put("run_attempt_count", new C1658a(0, 1, "run_attempt_count", "INTEGER", null, true));
        hashMap2.put("backoff_policy", new C1658a(0, 1, "backoff_policy", "INTEGER", null, true));
        hashMap2.put("backoff_delay_duration", new C1658a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        hashMap2.put("period_start_time", new C1658a(0, 1, "period_start_time", "INTEGER", null, true));
        hashMap2.put("minimum_retention_duration", new C1658a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        hashMap2.put("schedule_requested_at", new C1658a(0, 1, "schedule_requested_at", "INTEGER", null, true));
        hashMap2.put("run_in_foreground", new C1658a(0, 1, "run_in_foreground", "INTEGER", null, true));
        hashMap2.put("out_of_quota_policy", new C1658a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        hashMap2.put("required_network_type", new C1658a(0, 1, "required_network_type", "INTEGER", null, false));
        hashMap2.put("requires_charging", new C1658a(0, 1, "requires_charging", "INTEGER", null, true));
        hashMap2.put("requires_device_idle", new C1658a(0, 1, "requires_device_idle", "INTEGER", null, true));
        hashMap2.put("requires_battery_not_low", new C1658a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        hashMap2.put("requires_storage_not_low", new C1658a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        hashMap2.put("trigger_content_update_delay", new C1658a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        hashMap2.put("trigger_max_content_delay", new C1658a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        hashMap2.put("content_uri_triggers", new C1658a(0, 1, "content_uri_triggers", "BLOB", null, false));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new e0.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
        hashSet4.add(new e0.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
        e0.e eVar2 = new e0.e("WorkSpec", hashMap2, hashSet3, hashSet4);
        e0.e a5 = e0.e.a(c1694b, "WorkSpec");
        if (!eVar2.equals(a5)) {
            return new C0228i(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + a5);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new C1658a(1, 1, "tag", "TEXT", null, true));
        hashMap3.put("work_spec_id", new C1658a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new C1659b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new e0.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
        e0.e eVar3 = new e0.e("WorkTag", hashMap3, hashSet5, hashSet6);
        e0.e a6 = e0.e.a(c1694b, "WorkTag");
        if (!eVar3.equals(a6)) {
            return new C0228i(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + a6);
        }
        HashMap hashMap4 = new HashMap(2);
        hashMap4.put("work_spec_id", new C1658a(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap4.put("system_id", new C1658a(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new C1659b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        e0.e eVar4 = new e0.e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        e0.e a7 = e0.e.a(c1694b, "SystemIdInfo");
        if (!eVar4.equals(a7)) {
            return new C0228i(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + a7);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new C1658a(1, 1, "name", "TEXT", null, true));
        hashMap5.put("work_spec_id", new C1658a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new C1659b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new e0.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
        e0.e eVar5 = new e0.e("WorkName", hashMap5, hashSet8, hashSet9);
        e0.e a8 = e0.e.a(c1694b, "WorkName");
        if (!eVar5.equals(a8)) {
            return new C0228i(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + a8);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new C1658a(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap6.put("progress", new C1658a(0, 1, "progress", "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new C1659b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        e0.e eVar6 = new e0.e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        e0.e a9 = e0.e.a(c1694b, "WorkProgress");
        if (!eVar6.equals(a9)) {
            return new C0228i(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + a9);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new C1658a(1, 1, "key", "TEXT", null, true));
        hashMap7.put("long_value", new C1658a(0, 1, "long_value", "INTEGER", null, false));
        e0.e eVar7 = new e0.e("Preference", hashMap7, new HashSet(0), new HashSet(0));
        e0.e a10 = e0.e.a(c1694b, "Preference");
        if (eVar7.equals(a10)) {
            return new C0228i(true, (String) null);
        }
        return new C0228i(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + a10);
    }

    @Override // l.InterfaceC1766f0
    public void a(m mVar, p pVar) {
        g gVar = (g) this.f13386p;
        Handler handler = gVar.f13406t;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.f13408v;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (mVar == ((C1749f) arrayList.get(i4)).f13388b) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 == -1) {
            return;
        }
        int i5 = i4 + 1;
        handler.postAtTime(new J1.a(this, i5 < arrayList.size() ? (C1749f) arrayList.get(i5) : null, pVar, mVar, 10, false), mVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // b3.InterfaceC0219a
    public void b() {
        L l4 = (L) this.f13386p;
        synchronized (l4.f14866e) {
            l4.f14868g = false;
        }
    }

    @Override // t2.H
    public Object c() {
        switch (this.f13385o) {
            case 13:
                return v();
            default:
                return new ContextWrapper((Application) ((H) this.f13386p).c());
        }
    }

    @Override // l.InterfaceC1766f0
    public void d(m mVar, MenuItem menuItem) {
        ((g) this.f13386p).f13406t.removeCallbacksAndMessages(mVar);
    }

    @Override // x2.M
    public void e(String str, int i4, Throwable th, byte[] bArr, Map map) {
        ((X0) this.f13386p).k(str, i4, th, bArr, map);
    }

    @Override // b3.d
    public void f(C2000g c2000g) {
        ((AtomicReference) this.f13386p).set(c2000g);
    }

    @Override // k.k
    public boolean g(m mVar, MenuItem menuItem) {
        InterfaceC1779m interfaceC1779m = ((ActionMenuView) this.f13386p).f2541M;
        if (interfaceC1779m == null) {
            return false;
        }
        ((Toolbar) ((o) interfaceC1779m).f13452p).getClass();
        return false;
    }

    @Override // I3.a
    public Object get() {
        return new t3.g((Context) ((G) this.f13386p).f14862o, new V2.e(6), new C2033d(5));
    }

    public synchronized void h() {
        try {
            long j4 = ((SharedPreferences) this.f13386p).getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f13386p).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.f13386p).getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            ((SharedPreferences) this.f13386p).edit().putStringSet(str, hashSet).putLong("fire-count", j4 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // k.k
    public void i(m mVar) {
    }

    @Override // c1.InterfaceC0235d
    public void k(boolean z4) {
        switch (this.f13385o) {
            case 4:
                C1923i c1923i = (C1923i) this.f13386p;
                Object obj = c1923i.f14537R.f1252p;
                int i4 = 0;
                int i5 = (obj == null || !((Boolean) obj).booleanValue()) ? 0 : 255;
                Object obj2 = c1923i.f14538S.f1252p;
                int i6 = (obj2 == null || !((Boolean) obj2).booleanValue()) ? 0 : 255;
                Object obj3 = c1923i.f14539T.f1252p;
                if (obj3 != null && ((Boolean) obj3).booleanValue()) {
                    i4 = 255;
                }
                c1923i.f14536Q = Color.rgb(i5, i6, i4);
                return;
            case 5:
                p1.r rVar = (p1.r) this.f13386p;
                ArrayList arrayList = rVar.f14577P;
                int size = arrayList.size();
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i9 < size) {
                    Object obj4 = arrayList.get(i9);
                    i9++;
                    Object obj5 = ((C0237f) obj4).f1252p;
                    if (obj5 != null && ((Boolean) obj5).booleanValue()) {
                        i7 = (int) (Math.pow(2.0d, i8) + i7);
                    }
                    i8++;
                }
                int i10 = rVar.f14581T;
                rVar.f14581T = i7;
                if (i10 != i7 && rVar.f14582U) {
                    rVar.f14582U = false;
                    rVar.f13118B.n(new C1920f(rVar, 2));
                    return;
                }
                return;
            case 6:
                ((C1907E) this.f13386p).f14401Q = z4;
                return;
            case 7:
                P p3 = (P) this.f13386p;
                if (p3.f14438S) {
                    p3.f14438S = false;
                    p3.f13118B.n(new C1920f(p3, 6));
                    return;
                }
                return;
            case 8:
                i0 i0Var = (i0) this.f13386p;
                C0237f c0237f = i0Var.f14540V;
                h0 h0Var = i0Var.f14544Z;
                if (i0Var.f14543Y) {
                    if (z4) {
                        i0Var.f14546b0 = false;
                        h0Var.c = 0.0f;
                        i0Var.Q(false);
                        return;
                    } else {
                        Object obj6 = c0237f.f1252p;
                        if (obj6 == null || !((Boolean) obj6).booleanValue()) {
                            return;
                        }
                        i0Var.f14546b0 = true;
                        h0Var.f14534b = 0L;
                        return;
                    }
                }
                if (z4) {
                    i0Var.f14546b0 = false;
                    h0Var.c = 0.0f;
                    i0Var.Q(false);
                    return;
                }
                Object obj7 = c0237f.f1252p;
                if (obj7 == null || !((Boolean) obj7).booleanValue()) {
                    return;
                }
                i0Var.f14546b0 = true;
                h0Var.f14534b = 0L;
                i0Var.Q(true);
                return;
            default:
                l0 l0Var = (l0) this.f13386p;
                if (l0Var.f14562Q != z4) {
                    l0Var.f14562Q = z4;
                    l0Var.f13118B.o(4, z4);
                    return;
                }
                return;
        }
    }

    @Override // x2.a1
    public void l(Bundle bundle, String str) {
        C2103v0 c2103v0 = (C2103v0) this.f13386p;
        if (!TextUtils.isEmpty(str)) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        ((C2066c0) c2103v0.f1719a).f15573n.getClass();
        c2103v0.l("auto", "_err", bundle, true, true, System.currentTimeMillis());
    }

    public synchronized void m() {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f13386p).edit();
            int i4 = 0;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f13386p).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String o4 = o(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(o4)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(o4);
                        i4++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i4 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i4);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized ArrayList n() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f13386p).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(o(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new C2030a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            t(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized String o(long j4) {
        Instant instant;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        String format;
        ZoneOffset unused;
        DateTimeFormatter unused2;
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j4));
        }
        instant = new Date(j4).toInstant();
        unused = ZoneOffset.UTC;
        atOffset = instant.atOffset(ZoneOffset.UTC);
        localDateTime = atOffset.toLocalDateTime();
        unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
        format = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
        return format;
    }

    public synchronized String p(String str) {
        for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f13386p).getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public synchronized void r(String str) {
        try {
            String p3 = p(str);
            if (p3 == null) {
                return;
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.f13386p).getStringSet(p3, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                ((SharedPreferences) this.f13386p).edit().remove(p3).commit();
            } else {
                ((SharedPreferences) this.f13386p).edit().putStringSet(p3, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void s(String str, long j4) {
        String o4 = o(j4);
        if (((SharedPreferences) this.f13386p).getString("last-used-date", "").equals(o4)) {
            String p3 = p(o4);
            if (p3 == null) {
                return;
            }
            if (p3.equals(str)) {
                return;
            }
            u(str, o4);
            return;
        }
        long j5 = ((SharedPreferences) this.f13386p).getLong("fire-count", 0L);
        if (j5 + 1 == 30) {
            h();
            j5 = ((SharedPreferences) this.f13386p).getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(((SharedPreferences) this.f13386p).getStringSet(str, new HashSet()));
        hashSet.add(o4);
        ((SharedPreferences) this.f13386p).edit().putStringSet(str, hashSet).putLong("fire-count", j5 + 1).putString("last-used-date", o4).commit();
    }

    public synchronized void t(long j4) {
        ((SharedPreferences) this.f13386p).edit().putLong("fire-global", j4).commit();
    }

    public synchronized void u(String str, String str2) {
        r(str2);
        HashSet hashSet = new HashSet(((SharedPreferences) this.f13386p).getStringSet(str, new HashSet()));
        hashSet.add(str2);
        ((SharedPreferences) this.f13386p).edit().putStringSet(str, hashSet).commit();
    }

    public C1748e v() {
        return new C1748e(11, (Application) ((G) this.f13386p).f14862o);
    }

    public void w() {
        Q0 q02 = (Q0) this.f13386p;
        q02.g();
        C2066c0 c2066c0 = (C2066c0) q02.f1719a;
        T t4 = c2066c0.f15567h;
        C2066c0.g(t4);
        c2066c0.f15573n.getClass();
        if (t4.n(System.currentTimeMillis())) {
            T t5 = c2066c0.f15567h;
            C2066c0.g(t5);
            t5.f15446k.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                K k3 = c2066c0.f15568i;
                C2066c0.i(k3);
                k3.f15402n.a("Detected application was in foreground");
                c2066c0.f15573n.getClass();
                y(false, System.currentTimeMillis());
            }
        }
    }

    public void x(boolean z4, long j4) {
        Q0 q02 = (Q0) this.f13386p;
        q02.g();
        q02.j();
        C2066c0 c2066c0 = (C2066c0) q02.f1719a;
        T t4 = c2066c0.f15567h;
        C2066c0.g(t4);
        if (t4.n(j4)) {
            T t5 = c2066c0.f15567h;
            C2066c0.g(t5);
            t5.f15446k.a(true);
            t3.a();
            if (c2066c0.f15566g.p(null, x2.B.f15318p0)) {
                c2066c0.m().l();
            }
        }
        T t6 = c2066c0.f15567h;
        C2066c0.g(t6);
        t6.f15449n.b(j4);
        T t7 = c2066c0.f15567h;
        C2066c0.g(t7);
        if (t7.f15446k.b()) {
            y(z4, j4);
        }
    }

    public void y(boolean z4, long j4) {
        Q0 q02 = (Q0) this.f13386p;
        q02.g();
        C2066c0 c2066c0 = (C2066c0) q02.f1719a;
        if (c2066c0.e()) {
            T t4 = c2066c0.f15567h;
            C2066c0.g(t4);
            t4.f15449n.b(j4);
            c2066c0.f15573n.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15402n.b(Long.valueOf(elapsedRealtime), "Session started, time");
            long j5 = j4 / 1000;
            Long valueOf = Long.valueOf(j5);
            C2103v0 c2103v0 = c2066c0.f15575p;
            C2066c0.h(c2103v0);
            c2103v0.x(j4, valueOf, "auto", "_sid");
            T t5 = c2066c0.f15567h;
            C2066c0.g(t5);
            t5.f15446k.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j5);
            if (c2066c0.f15566g.p(null, x2.B.f15288Z) && z4) {
                bundle.putLong("_aib", 1L);
            }
            C2103v0 c2103v02 = c2066c0.f15575p;
            C2066c0.h(c2103v02);
            c2103v02.n(j4, bundle, "auto", "_s");
            ((Q2) P2.f11800p.f11801o.b()).getClass();
            if (c2066c0.f15566g.p(null, x2.B.f15293c0)) {
                T t6 = c2066c0.f15567h;
                C2066c0.g(t6);
                String b4 = t6.f15454s.b();
                if (TextUtils.isEmpty(b4)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", b4);
                C2103v0 c2103v03 = c2066c0.f15575p;
                C2066c0.h(c2103v03);
                c2103v03.n(j4, bundle2, "auto", "_ssr");
            }
        }
    }
}
