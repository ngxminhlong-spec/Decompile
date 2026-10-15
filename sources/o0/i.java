package o0;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import d0.AbstractC1649a;
import h0.C1694b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i extends AbstractC1649a {
    public final /* synthetic */ int c = 1;
    public final Context d;

    public i(Context context) {
        super(9, 10);
        this.d = context;
    }

    public i(Context context, int i4, int i5) {
        super(i4, i5);
        this.d = context;
    }

    @Override // d0.AbstractC1649a
    public final void a(C1694b c1694b) {
        int i4 = this.c;
        Context context = this.d;
        switch (i4) {
            case 0:
                if (this.f12596b >= 10) {
                    ((SQLiteDatabase) c1694b.f13103p).execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                c1694b.h("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) c1694b.f13103p;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j4 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j5 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    c1694b.a();
                    try {
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j4)});
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j5)});
                        sharedPreferences.edit().clear().apply();
                        c1694b.k();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i5 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i6 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    c1694b.a();
                    try {
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i5)});
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i6)});
                        sharedPreferences2.edit().clear().apply();
                        c1694b.k();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }
}
