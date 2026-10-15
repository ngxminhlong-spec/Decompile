package x2;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class F extends S {
    public final C2081k c;
    public boolean d;

    public F(C2066c0 c2066c0) {
        super(c2066c0);
        this.c = new C2081k(this, ((C2066c0) this.f1719a).f15562a);
    }

    @Override // x2.S
    public final boolean i() {
        return false;
    }

    public final SQLiteDatabase j() {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.d = true;
        return null;
    }

    public final void k() {
        int delete;
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        g();
        try {
            SQLiteDatabase j4 = j();
            if (j4 == null || (delete = j4.delete("messages", null, null)) <= 0) {
                return;
            }
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15402n.b(Integer.valueOf(delete), "Reset local analytics data. records");
        } catch (SQLiteException e4) {
            K k4 = c2066c0.f15568i;
            C2066c0.i(k4);
            k4.f15394f.b(e4, "Error resetting local analytics data. error");
        }
    }

    public final void l() {
        int i4;
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        g();
        if (!this.d && c2066c0.f15562a.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i5 = 5;
            while (i4 < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase j4 = j();
                        if (j4 == null) {
                            this.d = true;
                            return;
                        }
                        j4.beginTransaction();
                        j4.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        j4.setTransactionSuccessful();
                        j4.endTransaction();
                        j4.close();
                        return;
                    } catch (SQLiteException e4) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        K k3 = c2066c0.f15568i;
                        C2066c0.i(k3);
                        k3.f15394f.b(e4, "Error deleting app launch break from local database");
                        this.d = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i5);
                    i5 += 20;
                    i4 = 0 == 0 ? i4 + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e5) {
                    K k4 = c2066c0.f15568i;
                    C2066c0.i(k4);
                    k4.f15394f.b(e5, "Error deleting app launch break from local database");
                    this.d = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
            }
            K k5 = c2066c0.f15568i;
            C2066c0.i(k5);
            k5.f15397i.a("Error deleting app launch break from local database in reasonable time");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r19, byte[] r20) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.F.m(int, byte[]):boolean");
    }
}
