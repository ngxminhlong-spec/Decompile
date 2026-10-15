package androidx.work.impl.workers;

import U.a;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import c0.C0229j;
import com.google.android.gms.internal.ads.Qw;
import com.google.android.gms.internal.ads.Wl;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import m2.AbstractC1806a;
import n0.m;
import n0.n;
import o0.l;
import t3.g;
import w0.d;
import w0.i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: u, reason: collision with root package name */
    public static final String f3165u = n.h("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(Qw qw, Wl wl, g gVar, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            i iVar = (i) obj;
            d d = gVar.d(iVar.f15115a);
            Integer valueOf = d != null ? Integer.valueOf(d.f15109b) : null;
            String str2 = iVar.f15115a;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) qw.f6710p;
            C0229j d4 = C0229j.d("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str2 == null) {
                d4.f(1);
            } else {
                d4.g(str2, 1);
            }
            workDatabase_Impl.b();
            Cursor g4 = workDatabase_Impl.g(d4);
            try {
                ArrayList arrayList2 = new ArrayList(g4.getCount());
                while (g4.moveToNext()) {
                    arrayList2.add(g4.getString(0));
                }
                g4.close();
                d4.h();
                ArrayList d5 = wl.d(iVar.f15115a);
                String join = TextUtils.join(",", arrayList2);
                String join2 = TextUtils.join(",", d5);
                String str3 = iVar.f15115a;
                String str4 = iVar.c;
                switch (iVar.f15116b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                StringBuilder n4 = a.n("\n", str3, "\t ", str4, "\t ");
                n4.append(valueOf);
                n4.append("\t ");
                n4.append(str);
                n4.append("\t ");
                n4.append(join);
                n4.append("\t ");
                n4.append(join2);
                n4.append("\t");
                sb.append(n4.toString());
            } catch (Throwable th) {
                g4.close();
                d4.h();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final m doWork() {
        C0229j c0229j;
        g gVar;
        Qw qw;
        Wl wl;
        int i4;
        WorkDatabase workDatabase = l.N(getApplicationContext()).f14175n;
        C1.l n4 = workDatabase.n();
        Qw l4 = workDatabase.l();
        Wl o4 = workDatabase.o();
        g k3 = workDatabase.k();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        n4.getClass();
        C0229j d = C0229j.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        d.e(1, currentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) n4.f500a;
        workDatabase_Impl.b();
        Cursor g4 = workDatabase_Impl.g(d);
        try {
            int n5 = AbstractC1806a.n(g4, "required_network_type");
            int n6 = AbstractC1806a.n(g4, "requires_charging");
            int n7 = AbstractC1806a.n(g4, "requires_device_idle");
            int n8 = AbstractC1806a.n(g4, "requires_battery_not_low");
            int n9 = AbstractC1806a.n(g4, "requires_storage_not_low");
            int n10 = AbstractC1806a.n(g4, "trigger_content_update_delay");
            int n11 = AbstractC1806a.n(g4, "trigger_max_content_delay");
            int n12 = AbstractC1806a.n(g4, "content_uri_triggers");
            int n13 = AbstractC1806a.n(g4, "id");
            int n14 = AbstractC1806a.n(g4, "state");
            int n15 = AbstractC1806a.n(g4, "worker_class_name");
            c0229j = d;
            try {
                int n16 = AbstractC1806a.n(g4, "input_merger_class_name");
                int n17 = AbstractC1806a.n(g4, "input");
                int n18 = AbstractC1806a.n(g4, "output");
                int n19 = AbstractC1806a.n(g4, "initial_delay");
                int n20 = AbstractC1806a.n(g4, "interval_duration");
                int n21 = AbstractC1806a.n(g4, "flex_duration");
                int n22 = AbstractC1806a.n(g4, "run_attempt_count");
                int n23 = AbstractC1806a.n(g4, "backoff_policy");
                int n24 = AbstractC1806a.n(g4, "backoff_delay_duration");
                int n25 = AbstractC1806a.n(g4, "period_start_time");
                int n26 = AbstractC1806a.n(g4, "minimum_retention_duration");
                int n27 = AbstractC1806a.n(g4, "schedule_requested_at");
                int n28 = AbstractC1806a.n(g4, "run_in_foreground");
                int n29 = AbstractC1806a.n(g4, "out_of_quota_policy");
                int i5 = n18;
                ArrayList arrayList = new ArrayList(g4.getCount());
                while (g4.moveToNext()) {
                    String string = g4.getString(n13);
                    int i6 = n13;
                    String string2 = g4.getString(n15);
                    int i7 = n15;
                    n0.d dVar = new n0.d();
                    int i8 = n5;
                    dVar.f14080a = AbstractC1806a.y(g4.getInt(n5));
                    dVar.f14081b = g4.getInt(n6) != 0;
                    dVar.c = g4.getInt(n7) != 0;
                    dVar.d = g4.getInt(n8) != 0;
                    dVar.f14082e = g4.getInt(n9) != 0;
                    int i9 = n6;
                    int i10 = n7;
                    dVar.f14083f = g4.getLong(n10);
                    dVar.f14084g = g4.getLong(n11);
                    dVar.f14085h = AbstractC1806a.g(g4.getBlob(n12));
                    i iVar = new i(string, string2);
                    iVar.f15116b = AbstractC1806a.A(g4.getInt(n14));
                    iVar.d = g4.getString(n16);
                    iVar.f15117e = n0.g.a(g4.getBlob(n17));
                    int i11 = i5;
                    iVar.f15118f = n0.g.a(g4.getBlob(i11));
                    int i12 = n16;
                    int i13 = n19;
                    iVar.f15119g = g4.getLong(i13);
                    int i14 = n20;
                    int i15 = n14;
                    iVar.f15120h = g4.getLong(i14);
                    int i16 = n8;
                    int i17 = n21;
                    iVar.f15121i = g4.getLong(i17);
                    int i18 = n22;
                    iVar.f15123k = g4.getInt(i18);
                    int i19 = n23;
                    int i20 = n17;
                    iVar.f15124l = AbstractC1806a.x(g4.getInt(i19));
                    int i21 = n24;
                    iVar.f15125m = g4.getLong(i21);
                    int i22 = n25;
                    iVar.f15126n = g4.getLong(i22);
                    int i23 = n26;
                    iVar.f15127o = g4.getLong(i23);
                    int i24 = n27;
                    iVar.f15128p = g4.getLong(i24);
                    int i25 = n28;
                    iVar.f15129q = g4.getInt(i25) != 0;
                    int i26 = n29;
                    iVar.f15130r = AbstractC1806a.z(g4.getInt(i26));
                    iVar.f15122j = dVar;
                    arrayList.add(iVar);
                    n22 = i18;
                    n14 = i15;
                    n20 = i14;
                    n25 = i22;
                    n8 = i16;
                    i5 = i11;
                    n28 = i25;
                    n6 = i9;
                    n19 = i13;
                    n17 = i20;
                    n21 = i17;
                    n23 = i19;
                    n26 = i23;
                    n24 = i21;
                    n15 = i7;
                    n5 = i8;
                    n29 = i26;
                    n27 = i24;
                    n16 = i12;
                    n13 = i6;
                    n7 = i10;
                }
                g4.close();
                c0229j.h();
                ArrayList c = n4.c();
                ArrayList a4 = n4.a();
                boolean isEmpty = arrayList.isEmpty();
                String str = f3165u;
                if (isEmpty) {
                    gVar = k3;
                    qw = l4;
                    wl = o4;
                    i4 = 0;
                } else {
                    i4 = 0;
                    n.d().e(str, "Recently completed work:\n\n", new Throwable[0]);
                    gVar = k3;
                    qw = l4;
                    wl = o4;
                    n.d().e(str, a(qw, wl, gVar, arrayList), new Throwable[0]);
                }
                if (!c.isEmpty()) {
                    n.d().e(str, "Running work:\n\n", new Throwable[i4]);
                    n.d().e(str, a(qw, wl, gVar, c), new Throwable[i4]);
                }
                if (!a4.isEmpty()) {
                    n.d().e(str, "Enqueued work:\n\n", new Throwable[i4]);
                    n.d().e(str, a(qw, wl, gVar, a4), new Throwable[i4]);
                }
                return new n0.l(n0.g.c);
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
}
