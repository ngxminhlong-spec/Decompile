package C1;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import androidx.work.impl.WorkDatabase_Impl;
import c0.C0229j;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f500a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f501b;
    public final Object c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f502e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f503f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f504g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f505h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f506i;

    public l(Context context, x1.d dVar, D1.d dVar2, q2.e eVar, Executor executor, E1.c cVar, F1.a aVar, F1.a aVar2, D1.c cVar2) {
        this.f500a = context;
        this.f501b = dVar;
        this.c = dVar2;
        this.d = eVar;
        this.f502e = executor;
        this.f503f = cVar;
        this.f504g = aVar;
        this.f505h = aVar2;
        this.f506i = cVar2;
    }

    public l(WorkDatabase_Impl workDatabase_Impl) {
        this.f500a = workDatabase_Impl;
        this.f501b = new w0.b(workDatabase_Impl, 5);
        this.c = new w0.e(workDatabase_Impl, 3);
        this.d = new w0.e(workDatabase_Impl, 4);
        this.f502e = new w0.e(workDatabase_Impl, 5);
        this.f503f = new w0.e(workDatabase_Impl, 6);
        this.f504g = new w0.e(workDatabase_Impl, 7);
        this.f505h = new w0.e(workDatabase_Impl, 8);
        this.f506i = new w0.e(workDatabase_Impl, 9);
        new AtomicBoolean(false);
    }

    public ArrayList a() {
        C0229j c0229j;
        C0229j d = C0229j.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        d.e(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f500a;
        workDatabase_Impl.b();
        Cursor g4 = workDatabase_Impl.g(d);
        try {
            int n4 = AbstractC1806a.n(g4, "required_network_type");
            int n5 = AbstractC1806a.n(g4, "requires_charging");
            int n6 = AbstractC1806a.n(g4, "requires_device_idle");
            int n7 = AbstractC1806a.n(g4, "requires_battery_not_low");
            int n8 = AbstractC1806a.n(g4, "requires_storage_not_low");
            int n9 = AbstractC1806a.n(g4, "trigger_content_update_delay");
            int n10 = AbstractC1806a.n(g4, "trigger_max_content_delay");
            int n11 = AbstractC1806a.n(g4, "content_uri_triggers");
            int n12 = AbstractC1806a.n(g4, "id");
            int n13 = AbstractC1806a.n(g4, "state");
            int n14 = AbstractC1806a.n(g4, "worker_class_name");
            int n15 = AbstractC1806a.n(g4, "input_merger_class_name");
            int n16 = AbstractC1806a.n(g4, "input");
            c0229j = d;
            try {
                int n17 = AbstractC1806a.n(g4, "output");
                int n18 = AbstractC1806a.n(g4, "initial_delay");
                int n19 = AbstractC1806a.n(g4, "interval_duration");
                int n20 = AbstractC1806a.n(g4, "flex_duration");
                int n21 = AbstractC1806a.n(g4, "run_attempt_count");
                int n22 = AbstractC1806a.n(g4, "backoff_policy");
                int n23 = AbstractC1806a.n(g4, "backoff_delay_duration");
                int n24 = AbstractC1806a.n(g4, "period_start_time");
                int n25 = AbstractC1806a.n(g4, "minimum_retention_duration");
                int n26 = AbstractC1806a.n(g4, "schedule_requested_at");
                int n27 = AbstractC1806a.n(g4, "run_in_foreground");
                int n28 = AbstractC1806a.n(g4, "out_of_quota_policy");
                int i4 = n17;
                ArrayList arrayList = new ArrayList(g4.getCount());
                while (g4.moveToNext()) {
                    String string = g4.getString(n12);
                    int i5 = n12;
                    String string2 = g4.getString(n14);
                    int i6 = n14;
                    n0.d dVar = new n0.d();
                    int i7 = n4;
                    dVar.f14080a = AbstractC1806a.y(g4.getInt(n4));
                    dVar.f14081b = g4.getInt(n5) != 0;
                    dVar.c = g4.getInt(n6) != 0;
                    dVar.d = g4.getInt(n7) != 0;
                    dVar.f14082e = g4.getInt(n8) != 0;
                    int i8 = n5;
                    int i9 = n6;
                    dVar.f14083f = g4.getLong(n9);
                    dVar.f14084g = g4.getLong(n10);
                    dVar.f14085h = AbstractC1806a.g(g4.getBlob(n11));
                    w0.i iVar = new w0.i(string, string2);
                    iVar.f15116b = AbstractC1806a.A(g4.getInt(n13));
                    iVar.d = g4.getString(n15);
                    iVar.f15117e = n0.g.a(g4.getBlob(n16));
                    int i10 = i4;
                    iVar.f15118f = n0.g.a(g4.getBlob(i10));
                    int i11 = n16;
                    int i12 = n18;
                    iVar.f15119g = g4.getLong(i12);
                    i4 = i10;
                    int i13 = n19;
                    iVar.f15120h = g4.getLong(i13);
                    int i14 = n7;
                    int i15 = n20;
                    iVar.f15121i = g4.getLong(i15);
                    int i16 = n21;
                    iVar.f15123k = g4.getInt(i16);
                    int i17 = n22;
                    iVar.f15124l = AbstractC1806a.x(g4.getInt(i17));
                    n20 = i15;
                    int i18 = n23;
                    iVar.f15125m = g4.getLong(i18);
                    int i19 = n24;
                    iVar.f15126n = g4.getLong(i19);
                    n24 = i19;
                    int i20 = n25;
                    iVar.f15127o = g4.getLong(i20);
                    int i21 = n26;
                    iVar.f15128p = g4.getLong(i21);
                    int i22 = n27;
                    iVar.f15129q = g4.getInt(i22) != 0;
                    int i23 = n28;
                    iVar.f15130r = AbstractC1806a.z(g4.getInt(i23));
                    iVar.f15122j = dVar;
                    arrayList.add(iVar);
                    n23 = i18;
                    n7 = i14;
                    n22 = i17;
                    n28 = i23;
                    n5 = i8;
                    n18 = i12;
                    n19 = i13;
                    n21 = i16;
                    n26 = i21;
                    n14 = i6;
                    n4 = i7;
                    n27 = i22;
                    n25 = i20;
                    n16 = i11;
                    n12 = i5;
                    n6 = i9;
                }
                g4.close();
                c0229j.h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                g4.close();
                c0229j.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c0229j = d;
        }
    }

    public ArrayList b(int i4) {
        C0229j c0229j;
        C0229j d = C0229j.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        d.e(1, i4);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f500a;
        workDatabase_Impl.b();
        Cursor g4 = workDatabase_Impl.g(d);
        try {
            int n4 = AbstractC1806a.n(g4, "required_network_type");
            int n5 = AbstractC1806a.n(g4, "requires_charging");
            int n6 = AbstractC1806a.n(g4, "requires_device_idle");
            int n7 = AbstractC1806a.n(g4, "requires_battery_not_low");
            int n8 = AbstractC1806a.n(g4, "requires_storage_not_low");
            int n9 = AbstractC1806a.n(g4, "trigger_content_update_delay");
            int n10 = AbstractC1806a.n(g4, "trigger_max_content_delay");
            int n11 = AbstractC1806a.n(g4, "content_uri_triggers");
            int n12 = AbstractC1806a.n(g4, "id");
            int n13 = AbstractC1806a.n(g4, "state");
            int n14 = AbstractC1806a.n(g4, "worker_class_name");
            int n15 = AbstractC1806a.n(g4, "input_merger_class_name");
            int n16 = AbstractC1806a.n(g4, "input");
            c0229j = d;
            try {
                int n17 = AbstractC1806a.n(g4, "output");
                int n18 = AbstractC1806a.n(g4, "initial_delay");
                int n19 = AbstractC1806a.n(g4, "interval_duration");
                int n20 = AbstractC1806a.n(g4, "flex_duration");
                int n21 = AbstractC1806a.n(g4, "run_attempt_count");
                int n22 = AbstractC1806a.n(g4, "backoff_policy");
                int n23 = AbstractC1806a.n(g4, "backoff_delay_duration");
                int n24 = AbstractC1806a.n(g4, "period_start_time");
                int n25 = AbstractC1806a.n(g4, "minimum_retention_duration");
                int n26 = AbstractC1806a.n(g4, "schedule_requested_at");
                int n27 = AbstractC1806a.n(g4, "run_in_foreground");
                int n28 = AbstractC1806a.n(g4, "out_of_quota_policy");
                int i5 = n17;
                ArrayList arrayList = new ArrayList(g4.getCount());
                while (g4.moveToNext()) {
                    String string = g4.getString(n12);
                    int i6 = n12;
                    String string2 = g4.getString(n14);
                    int i7 = n14;
                    n0.d dVar = new n0.d();
                    int i8 = n4;
                    dVar.f14080a = AbstractC1806a.y(g4.getInt(n4));
                    dVar.f14081b = g4.getInt(n5) != 0;
                    dVar.c = g4.getInt(n6) != 0;
                    dVar.d = g4.getInt(n7) != 0;
                    dVar.f14082e = g4.getInt(n8) != 0;
                    int i9 = n5;
                    int i10 = n6;
                    dVar.f14083f = g4.getLong(n9);
                    dVar.f14084g = g4.getLong(n10);
                    dVar.f14085h = AbstractC1806a.g(g4.getBlob(n11));
                    w0.i iVar = new w0.i(string, string2);
                    iVar.f15116b = AbstractC1806a.A(g4.getInt(n13));
                    iVar.d = g4.getString(n15);
                    iVar.f15117e = n0.g.a(g4.getBlob(n16));
                    int i11 = i5;
                    iVar.f15118f = n0.g.a(g4.getBlob(i11));
                    int i12 = n18;
                    int i13 = n16;
                    iVar.f15119g = g4.getLong(i12);
                    i5 = i11;
                    int i14 = n19;
                    iVar.f15120h = g4.getLong(i14);
                    int i15 = n7;
                    int i16 = n20;
                    iVar.f15121i = g4.getLong(i16);
                    int i17 = n21;
                    iVar.f15123k = g4.getInt(i17);
                    int i18 = n22;
                    iVar.f15124l = AbstractC1806a.x(g4.getInt(i18));
                    n20 = i16;
                    int i19 = n23;
                    iVar.f15125m = g4.getLong(i19);
                    int i20 = n24;
                    iVar.f15126n = g4.getLong(i20);
                    n24 = i20;
                    int i21 = n25;
                    iVar.f15127o = g4.getLong(i21);
                    int i22 = n26;
                    iVar.f15128p = g4.getLong(i22);
                    int i23 = n27;
                    iVar.f15129q = g4.getInt(i23) != 0;
                    int i24 = n28;
                    iVar.f15130r = AbstractC1806a.z(g4.getInt(i24));
                    iVar.f15122j = dVar;
                    arrayList.add(iVar);
                    n23 = i19;
                    n7 = i15;
                    n22 = i18;
                    n28 = i24;
                    n5 = i9;
                    n26 = i22;
                    n12 = i6;
                    n14 = i7;
                    n4 = i8;
                    n27 = i23;
                    n16 = i13;
                    n18 = i12;
                    n19 = i14;
                    n21 = i17;
                    n25 = i21;
                    n6 = i10;
                }
                g4.close();
                c0229j.h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                g4.close();
                c0229j.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c0229j = d;
        }
    }

    public ArrayList c() {
        C0229j c0229j;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        C0229j d = C0229j.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f500a;
        workDatabase_Impl.b();
        Cursor g4 = workDatabase_Impl.g(d);
        try {
            n4 = AbstractC1806a.n(g4, "required_network_type");
            n5 = AbstractC1806a.n(g4, "requires_charging");
            n6 = AbstractC1806a.n(g4, "requires_device_idle");
            n7 = AbstractC1806a.n(g4, "requires_battery_not_low");
            n8 = AbstractC1806a.n(g4, "requires_storage_not_low");
            n9 = AbstractC1806a.n(g4, "trigger_content_update_delay");
            n10 = AbstractC1806a.n(g4, "trigger_max_content_delay");
            n11 = AbstractC1806a.n(g4, "content_uri_triggers");
            n12 = AbstractC1806a.n(g4, "id");
            n13 = AbstractC1806a.n(g4, "state");
            n14 = AbstractC1806a.n(g4, "worker_class_name");
            n15 = AbstractC1806a.n(g4, "input_merger_class_name");
            n16 = AbstractC1806a.n(g4, "input");
            c0229j = d;
        } catch (Throwable th) {
            th = th;
            c0229j = d;
        }
        try {
            int n17 = AbstractC1806a.n(g4, "output");
            int n18 = AbstractC1806a.n(g4, "initial_delay");
            int n19 = AbstractC1806a.n(g4, "interval_duration");
            int n20 = AbstractC1806a.n(g4, "flex_duration");
            int n21 = AbstractC1806a.n(g4, "run_attempt_count");
            int n22 = AbstractC1806a.n(g4, "backoff_policy");
            int n23 = AbstractC1806a.n(g4, "backoff_delay_duration");
            int n24 = AbstractC1806a.n(g4, "period_start_time");
            int n25 = AbstractC1806a.n(g4, "minimum_retention_duration");
            int n26 = AbstractC1806a.n(g4, "schedule_requested_at");
            int n27 = AbstractC1806a.n(g4, "run_in_foreground");
            int n28 = AbstractC1806a.n(g4, "out_of_quota_policy");
            int i4 = n17;
            ArrayList arrayList = new ArrayList(g4.getCount());
            while (g4.moveToNext()) {
                String string = g4.getString(n12);
                int i5 = n12;
                String string2 = g4.getString(n14);
                int i6 = n14;
                n0.d dVar = new n0.d();
                int i7 = n4;
                dVar.f14080a = AbstractC1806a.y(g4.getInt(n4));
                dVar.f14081b = g4.getInt(n5) != 0;
                dVar.c = g4.getInt(n6) != 0;
                dVar.d = g4.getInt(n7) != 0;
                dVar.f14082e = g4.getInt(n8) != 0;
                int i8 = n5;
                int i9 = n6;
                dVar.f14083f = g4.getLong(n9);
                dVar.f14084g = g4.getLong(n10);
                dVar.f14085h = AbstractC1806a.g(g4.getBlob(n11));
                w0.i iVar = new w0.i(string, string2);
                iVar.f15116b = AbstractC1806a.A(g4.getInt(n13));
                iVar.d = g4.getString(n15);
                iVar.f15117e = n0.g.a(g4.getBlob(n16));
                int i10 = i4;
                iVar.f15118f = n0.g.a(g4.getBlob(i10));
                int i11 = n16;
                int i12 = n18;
                iVar.f15119g = g4.getLong(i12);
                i4 = i10;
                int i13 = n19;
                iVar.f15120h = g4.getLong(i13);
                int i14 = n7;
                int i15 = n20;
                iVar.f15121i = g4.getLong(i15);
                int i16 = n21;
                iVar.f15123k = g4.getInt(i16);
                int i17 = n22;
                iVar.f15124l = AbstractC1806a.x(g4.getInt(i17));
                n20 = i15;
                int i18 = n23;
                iVar.f15125m = g4.getLong(i18);
                int i19 = n24;
                iVar.f15126n = g4.getLong(i19);
                n24 = i19;
                int i20 = n25;
                iVar.f15127o = g4.getLong(i20);
                int i21 = n26;
                iVar.f15128p = g4.getLong(i21);
                int i22 = n27;
                iVar.f15129q = g4.getInt(i22) != 0;
                int i23 = n28;
                iVar.f15130r = AbstractC1806a.z(g4.getInt(i23));
                iVar.f15122j = dVar;
                arrayList.add(iVar);
                n23 = i18;
                n7 = i14;
                n22 = i17;
                n28 = i23;
                n5 = i8;
                n18 = i12;
                n19 = i13;
                n21 = i16;
                n26 = i21;
                n14 = i6;
                n4 = i7;
                n27 = i22;
                n25 = i20;
                n16 = i11;
                n12 = i5;
                n6 = i9;
            }
            g4.close();
            c0229j.h();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            g4.close();
            c0229j.h();
            throw th;
        }
    }

    public ArrayList d() {
        C0229j c0229j;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        C0229j d = C0229j.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f500a;
        workDatabase_Impl.b();
        Cursor g4 = workDatabase_Impl.g(d);
        try {
            n4 = AbstractC1806a.n(g4, "required_network_type");
            n5 = AbstractC1806a.n(g4, "requires_charging");
            n6 = AbstractC1806a.n(g4, "requires_device_idle");
            n7 = AbstractC1806a.n(g4, "requires_battery_not_low");
            n8 = AbstractC1806a.n(g4, "requires_storage_not_low");
            n9 = AbstractC1806a.n(g4, "trigger_content_update_delay");
            n10 = AbstractC1806a.n(g4, "trigger_max_content_delay");
            n11 = AbstractC1806a.n(g4, "content_uri_triggers");
            n12 = AbstractC1806a.n(g4, "id");
            n13 = AbstractC1806a.n(g4, "state");
            n14 = AbstractC1806a.n(g4, "worker_class_name");
            n15 = AbstractC1806a.n(g4, "input_merger_class_name");
            n16 = AbstractC1806a.n(g4, "input");
            c0229j = d;
        } catch (Throwable th) {
            th = th;
            c0229j = d;
        }
        try {
            int n17 = AbstractC1806a.n(g4, "output");
            int n18 = AbstractC1806a.n(g4, "initial_delay");
            int n19 = AbstractC1806a.n(g4, "interval_duration");
            int n20 = AbstractC1806a.n(g4, "flex_duration");
            int n21 = AbstractC1806a.n(g4, "run_attempt_count");
            int n22 = AbstractC1806a.n(g4, "backoff_policy");
            int n23 = AbstractC1806a.n(g4, "backoff_delay_duration");
            int n24 = AbstractC1806a.n(g4, "period_start_time");
            int n25 = AbstractC1806a.n(g4, "minimum_retention_duration");
            int n26 = AbstractC1806a.n(g4, "schedule_requested_at");
            int n27 = AbstractC1806a.n(g4, "run_in_foreground");
            int n28 = AbstractC1806a.n(g4, "out_of_quota_policy");
            int i4 = n17;
            ArrayList arrayList = new ArrayList(g4.getCount());
            while (g4.moveToNext()) {
                String string = g4.getString(n12);
                int i5 = n12;
                String string2 = g4.getString(n14);
                int i6 = n14;
                n0.d dVar = new n0.d();
                int i7 = n4;
                dVar.f14080a = AbstractC1806a.y(g4.getInt(n4));
                dVar.f14081b = g4.getInt(n5) != 0;
                dVar.c = g4.getInt(n6) != 0;
                dVar.d = g4.getInt(n7) != 0;
                dVar.f14082e = g4.getInt(n8) != 0;
                int i8 = n5;
                int i9 = n6;
                dVar.f14083f = g4.getLong(n9);
                dVar.f14084g = g4.getLong(n10);
                dVar.f14085h = AbstractC1806a.g(g4.getBlob(n11));
                w0.i iVar = new w0.i(string, string2);
                iVar.f15116b = AbstractC1806a.A(g4.getInt(n13));
                iVar.d = g4.getString(n15);
                iVar.f15117e = n0.g.a(g4.getBlob(n16));
                int i10 = i4;
                iVar.f15118f = n0.g.a(g4.getBlob(i10));
                int i11 = n16;
                int i12 = n18;
                iVar.f15119g = g4.getLong(i12);
                i4 = i10;
                int i13 = n19;
                iVar.f15120h = g4.getLong(i13);
                int i14 = n7;
                int i15 = n20;
                iVar.f15121i = g4.getLong(i15);
                int i16 = n21;
                iVar.f15123k = g4.getInt(i16);
                int i17 = n22;
                iVar.f15124l = AbstractC1806a.x(g4.getInt(i17));
                n20 = i15;
                int i18 = n23;
                iVar.f15125m = g4.getLong(i18);
                int i19 = n24;
                iVar.f15126n = g4.getLong(i19);
                n24 = i19;
                int i20 = n25;
                iVar.f15127o = g4.getLong(i20);
                int i21 = n26;
                iVar.f15128p = g4.getLong(i21);
                int i22 = n27;
                iVar.f15129q = g4.getInt(i22) != 0;
                int i23 = n28;
                iVar.f15130r = AbstractC1806a.z(g4.getInt(i23));
                iVar.f15122j = dVar;
                arrayList.add(iVar);
                n23 = i18;
                n7 = i14;
                n22 = i17;
                n28 = i23;
                n5 = i8;
                n18 = i12;
                n19 = i13;
                n21 = i16;
                n26 = i21;
                n14 = i6;
                n4 = i7;
                n27 = i22;
                n25 = i20;
                n16 = i11;
                n12 = i5;
                n6 = i9;
            }
            g4.close();
            c0229j.h();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            g4.close();
            c0229j.h();
            throw th;
        }
    }

    public int e(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f500a;
        C0229j d = C0229j.d("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            d.f(1);
        } else {
            d.g(str, 1);
        }
        workDatabase_Impl.b();
        Cursor g4 = workDatabase_Impl.g(d);
        try {
            return g4.moveToFirst() ? AbstractC1806a.A(g4.getInt(0)) : 0;
        } finally {
            g4.close();
            d.h();
        }
    }

    public ArrayList f() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f500a;
        C0229j d = C0229j.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        d.f(1);
        workDatabase_Impl.b();
        Cursor g4 = workDatabase_Impl.g(d);
        try {
            ArrayList arrayList = new ArrayList(g4.getCount());
            while (g4.moveToNext()) {
                arrayList.add(g4.getString(0));
            }
            return arrayList;
        } finally {
            g4.close();
            d.h();
        }
    }

    public ArrayList g() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f500a;
        C0229j d = C0229j.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        d.g("offline_ping_sender_work", 1);
        workDatabase_Impl.b();
        Cursor g4 = workDatabase_Impl.g(d);
        try {
            ArrayList arrayList = new ArrayList(g4.getCount());
            while (g4.moveToNext()) {
                arrayList.add(g4.getString(0));
            }
            return arrayList;
        } finally {
            g4.close();
            d.h();
        }
    }

    public w0.i h(String str) {
        C0229j c0229j;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        w0.i iVar;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f500a;
        C0229j d = C0229j.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            d.f(1);
        } else {
            d.g(str, 1);
        }
        workDatabase_Impl.b();
        Cursor g4 = workDatabase_Impl.g(d);
        try {
            n4 = AbstractC1806a.n(g4, "required_network_type");
            n5 = AbstractC1806a.n(g4, "requires_charging");
            n6 = AbstractC1806a.n(g4, "requires_device_idle");
            n7 = AbstractC1806a.n(g4, "requires_battery_not_low");
            n8 = AbstractC1806a.n(g4, "requires_storage_not_low");
            n9 = AbstractC1806a.n(g4, "trigger_content_update_delay");
            n10 = AbstractC1806a.n(g4, "trigger_max_content_delay");
            n11 = AbstractC1806a.n(g4, "content_uri_triggers");
            n12 = AbstractC1806a.n(g4, "id");
            n13 = AbstractC1806a.n(g4, "state");
            n14 = AbstractC1806a.n(g4, "worker_class_name");
            n15 = AbstractC1806a.n(g4, "input_merger_class_name");
            n16 = AbstractC1806a.n(g4, "input");
            n17 = AbstractC1806a.n(g4, "output");
            c0229j = d;
        } catch (Throwable th) {
            th = th;
            c0229j = d;
        }
        try {
            int n18 = AbstractC1806a.n(g4, "initial_delay");
            int n19 = AbstractC1806a.n(g4, "interval_duration");
            int n20 = AbstractC1806a.n(g4, "flex_duration");
            int n21 = AbstractC1806a.n(g4, "run_attempt_count");
            int n22 = AbstractC1806a.n(g4, "backoff_policy");
            int n23 = AbstractC1806a.n(g4, "backoff_delay_duration");
            int n24 = AbstractC1806a.n(g4, "period_start_time");
            int n25 = AbstractC1806a.n(g4, "minimum_retention_duration");
            int n26 = AbstractC1806a.n(g4, "schedule_requested_at");
            int n27 = AbstractC1806a.n(g4, "run_in_foreground");
            int n28 = AbstractC1806a.n(g4, "out_of_quota_policy");
            if (g4.moveToFirst()) {
                String string = g4.getString(n12);
                String string2 = g4.getString(n14);
                n0.d dVar = new n0.d();
                dVar.f14080a = AbstractC1806a.y(g4.getInt(n4));
                dVar.f14081b = g4.getInt(n5) != 0;
                dVar.c = g4.getInt(n6) != 0;
                dVar.d = g4.getInt(n7) != 0;
                dVar.f14082e = g4.getInt(n8) != 0;
                dVar.f14083f = g4.getLong(n9);
                dVar.f14084g = g4.getLong(n10);
                dVar.f14085h = AbstractC1806a.g(g4.getBlob(n11));
                iVar = new w0.i(string, string2);
                iVar.f15116b = AbstractC1806a.A(g4.getInt(n13));
                iVar.d = g4.getString(n15);
                iVar.f15117e = n0.g.a(g4.getBlob(n16));
                iVar.f15118f = n0.g.a(g4.getBlob(n17));
                iVar.f15119g = g4.getLong(n18);
                iVar.f15120h = g4.getLong(n19);
                iVar.f15121i = g4.getLong(n20);
                iVar.f15123k = g4.getInt(n21);
                iVar.f15124l = AbstractC1806a.x(g4.getInt(n22));
                iVar.f15125m = g4.getLong(n23);
                iVar.f15126n = g4.getLong(n24);
                iVar.f15127o = g4.getLong(n25);
                iVar.f15128p = g4.getLong(n26);
                iVar.f15129q = g4.getInt(n27) != 0;
                iVar.f15130r = AbstractC1806a.z(g4.getInt(n28));
                iVar.f15122j = dVar;
            } else {
                iVar = null;
            }
            g4.close();
            c0229j.h();
            return iVar;
        } catch (Throwable th2) {
            th = th2;
            g4.close();
            c0229j.h();
            throw th;
        }
    }

    public void i(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f500a;
        workDatabase_Impl.b();
        w0.e eVar = (w0.e) this.f503f;
        h0.f a4 = eVar.a();
        if (str == null) {
            a4.e(1);
        } else {
            a4.f(str, 1);
        }
        workDatabase_Impl.c();
        try {
            a4.f13116r.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(a4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03e4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v21, types: [l.J0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [l.J0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(w1.C2046i r45, int r46) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.l.j(w1.i, int):void");
    }

    public void k(String str, long j4) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f500a;
        workDatabase_Impl.b();
        w0.e eVar = (w0.e) this.f505h;
        h0.f a4 = eVar.a();
        a4.d(1, j4);
        if (str == null) {
            a4.e(2);
        } else {
            a4.f(str, 2);
        }
        workDatabase_Impl.c();
        try {
            a4.f13116r.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(a4);
        }
    }

    public void l(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f500a;
        workDatabase_Impl.b();
        w0.e eVar = (w0.e) this.f504g;
        h0.f a4 = eVar.a();
        if (str == null) {
            a4.e(1);
        } else {
            a4.f(str, 1);
        }
        workDatabase_Impl.c();
        try {
            a4.f13116r.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(a4);
        }
    }

    public void m(String str, n0.g gVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f500a;
        workDatabase_Impl.b();
        w0.e eVar = (w0.e) this.d;
        h0.f a4 = eVar.a();
        byte[] b4 = n0.g.b(gVar);
        if (b4 == null) {
            a4.e(1);
        } else {
            a4.b(1, b4);
        }
        if (str == null) {
            a4.e(2);
        } else {
            a4.f(str, 2);
        }
        workDatabase_Impl.c();
        try {
            a4.l();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(a4);
        }
    }

    public void n(String str, long j4) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f500a;
        workDatabase_Impl.b();
        w0.e eVar = (w0.e) this.f502e;
        h0.f a4 = eVar.a();
        a4.d(1, j4);
        if (str == null) {
            a4.e(2);
        } else {
            a4.f(str, 2);
        }
        workDatabase_Impl.c();
        try {
            a4.l();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(a4);
        }
    }

    public void o(int i4, String... strArr) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f500a;
        workDatabase_Impl.b();
        StringBuilder sb = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            sb.append("?");
            if (i5 < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String sb2 = sb.toString();
        workDatabase_Impl.a();
        workDatabase_Impl.b();
        SQLiteStatement compileStatement = ((SQLiteDatabase) workDatabase_Impl.c.c().f13103p).compileStatement(sb2);
        compileStatement.bindLong(1, AbstractC1806a.P(i4));
        int i6 = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.bindNull(i6);
            } else {
                compileStatement.bindString(i6, str);
            }
            i6++;
        }
        workDatabase_Impl.c();
        try {
            compileStatement.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }
}
