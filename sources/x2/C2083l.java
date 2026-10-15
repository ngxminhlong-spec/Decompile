package x2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.M2;
import com.google.android.gms.internal.measurement.N2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2083l extends T0 {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f15718f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f15719g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f15720h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f15721i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f15722j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f15723k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f15724l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f15725m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public final C2081k d;

    /* renamed from: e, reason: collision with root package name */
    public final N1.d f15726e;

    public C2083l(X0 x02) {
        super(x02);
        this.f15726e = new N1.d(((C2066c0) this.f1719a).f15573n);
        ((C2066c0) this.f1719a).getClass();
        this.d = new C2081k(this, ((C2066c0) this.f1719a).f15562a);
    }

    public static final void s(ContentValues contentValues, Object obj) {
        h2.y.e("value");
        h2.y.i(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public final SQLiteDatabase A() {
        g();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e4) {
            K k3 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k3);
            k3.f15397i.b(e4, "Error opening database");
            throw e4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x2.C2082k0 B(java.lang.String r35) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C2083l.B(java.lang.String):x2.k0");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x2.C2065c C(java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C2083l.C(java.lang.String, java.lang.String):x2.c");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [x2.j, java.lang.Object] */
    public final C2079j D(long j4, String str, long j5, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        h2.y.e(str);
        g();
        h();
        String[] strArr = {str};
        ?? obj = new Object();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase A3 = A();
                Cursor query = A3.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    K k3 = c2066c0.f15568i;
                    C2066c0.i(k3);
                    k3.f15397i.b(K.n(str), "Not updating daily counts, app is not known. appId");
                    query.close();
                    return obj;
                }
                if (query.getLong(0) == j4) {
                    obj.f15677b = query.getLong(1);
                    obj.f15676a = query.getLong(2);
                    obj.c = query.getLong(3);
                    obj.d = query.getLong(4);
                    obj.f15678e = query.getLong(5);
                }
                if (z4) {
                    obj.f15677b += j5;
                }
                if (z5) {
                    obj.f15676a += j5;
                }
                if (z6) {
                    obj.c += j5;
                }
                if (z7) {
                    obj.d += j5;
                }
                if (z8) {
                    obj.f15678e += j5;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j4));
                contentValues.put("daily_public_events_count", Long.valueOf(obj.f15676a));
                contentValues.put("daily_events_count", Long.valueOf(obj.f15677b));
                contentValues.put("daily_conversions_count", Long.valueOf(obj.c));
                contentValues.put("daily_error_events_count", Long.valueOf(obj.d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(obj.f15678e));
                A3.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return obj;
            } catch (SQLiteException e4) {
                K k4 = c2066c0.f15568i;
                C2066c0.i(k4);
                k4.f15394f.c(K.n(str), e4, "Error updating daily counts. appId");
                if (0 != 0) {
                    cursor.close();
                }
                return obj;
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x2.C2091p E(java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C2083l.E(java.lang.String, java.lang.String):x2.p");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x2.Z0 F(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f1719a
            r1 = r0
            x2.c0 r1 = (x2.C2066c0) r1
            h2.y.e(r12)
            h2.y.e(r13)
            r11.g()
            r11.h()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.A()     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7f
            java.lang.String r0 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r5 = new java.lang.String[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7f
            java.lang.String[] r7 = new java.lang.String[]{r12, r13}     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7f
            java.lang.String r4 = "user_attributes"
            java.lang.String r6 = "app_id=? and name=?"
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L7c android.database.sqlite.SQLiteException -> L7f
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L76
            if (r0 != 0) goto L39
            r3.close()
            return r2
        L39:
            r0 = 0
            long r8 = r3.getLong(r0)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L76
            r0 = 1
            java.lang.Object r10 = r11.G(r3, r0)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L76
            if (r10 != 0) goto L49
            r3.close()
            return r2
        L49:
            r0 = 2
            java.lang.String r6 = r3.getString(r0)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L76
            x2.Z0 r4 = new x2.Z0     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L76
            r5 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6f
            boolean r12 = r3.moveToNext()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6f
            if (r12 == 0) goto L72
            x2.K r12 = r1.f15568i     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6f
            x2.C2066c0.i(r12)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6f
            x2.I r12 = r12.f15394f     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6f
            java.lang.String r13 = "Got multiple records for user property, expected one. appId"
            x2.J r0 = x2.K.n(r5)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6f
            r12.b(r0, r13)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6f
            goto L72
        L6c:
            r0 = move-exception
            r12 = r0
            goto L7a
        L6f:
            r0 = move-exception
        L70:
            r12 = r0
            goto L84
        L72:
            r3.close()
            return r4
        L76:
            r0 = move-exception
            r5 = r12
            r7 = r13
            goto L70
        L7a:
            r2 = r3
            goto La0
        L7c:
            r0 = move-exception
            r12 = r0
            goto La0
        L7f:
            r0 = move-exception
            r5 = r12
            r7 = r13
            r12 = r0
            r3 = r2
        L84:
            x2.K r13 = r1.f15568i     // Catch: java.lang.Throwable -> L6c
            x2.C2066c0.i(r13)     // Catch: java.lang.Throwable -> L6c
            x2.I r13 = r13.f15394f     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = "Error querying user property. appId"
            x2.J r4 = x2.K.n(r5)     // Catch: java.lang.Throwable -> L6c
            x2.G r1 = r1.f15572m     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = r1.f(r7)     // Catch: java.lang.Throwable -> L6c
            r13.d(r0, r4, r1, r12)     // Catch: java.lang.Throwable -> L6c
            if (r3 == 0) goto L9f
            r3.close()
        L9f:
            return r2
        La0:
            if (r2 == 0) goto La5
            r2.close()
        La5:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C2083l.F(java.lang.String, java.lang.String):x2.Z0");
    }

    public final Object G(Cursor cursor, int i4) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        int type = cursor.getType(i4);
        if (type == 0) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15394f.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i4));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i4));
        }
        if (type == 3) {
            return cursor.getString(i4);
        }
        if (type != 4) {
            K k4 = c2066c0.f15568i;
            C2066c0.i(k4);
            k4.f15394f.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        K k5 = c2066c0.f15568i;
        C2066c0.i(k5);
        k5.f15394f.a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String H() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.A()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L26 android.database.sqlite.SQLiteException -> L28
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L22
        L1c:
            r2 = move-exception
            goto L2b
        L1e:
            r0.close()
            return r1
        L22:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L41
        L26:
            r0 = move-exception
            goto L41
        L28:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L2b:
            java.lang.Object r3 = r6.f1719a     // Catch: java.lang.Throwable -> L1a
            x2.c0 r3 = (x2.C2066c0) r3     // Catch: java.lang.Throwable -> L1a
            x2.K r3 = r3.f15568i     // Catch: java.lang.Throwable -> L1a
            x2.C2066c0.i(r3)     // Catch: java.lang.Throwable -> L1a
            x2.I r3 = r3.f15394f     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r2, r4)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L40
            r0.close()
        L40:
            return r1
        L41:
            if (r1 == 0) goto L46
            r1.close()
        L46:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C2083l.H():java.lang.String");
    }

    public final List I(String str, String str2, String str3) {
        h2.y.e(str);
        g();
        h();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return J(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        r0 = r2.f15568i;
        x2.C2066c0.i(r0);
        r0.f15394f.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List J(java.lang.String r30, java.lang.String[] r31) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C2083l.J(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List K(String str) {
        String str2;
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        h2.y.e(str);
        g();
        h();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                c2066c0.getClass();
                cursor = A().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return arrayList;
                    }
                    while (true) {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str3 = string2;
                        long j4 = cursor.getLong(2);
                        Object G3 = G(cursor, 3);
                        if (G3 == null) {
                            K k3 = c2066c0.f15568i;
                            C2066c0.i(k3);
                            k3.f15394f.b(K.n(str), "Read invalid user property value, ignoring it. appId");
                            str2 = str;
                        } else {
                            str2 = str;
                            try {
                                arrayList.add(new Z0(str2, str3, string, j4, G3));
                            } catch (SQLiteException e4) {
                                e = e4;
                                K k4 = c2066c0.f15568i;
                                C2066c0.i(k4);
                                k4.f15394f.c(K.n(str2), e, "Error querying user properties. appId");
                                List list = Collections.EMPTY_LIST;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return list;
                            }
                        }
                        if (!cursor.moveToNext()) {
                            cursor.close();
                            return arrayList;
                        }
                        str = str2;
                    }
                } catch (SQLiteException e5) {
                    e = e5;
                    str2 = str;
                }
            } finally {
            }
        } catch (SQLiteException e6) {
            e = e6;
            str2 = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a8, code lost:
    
        x2.C2066c0.i(r13);
        r13.f15394f.b(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List L(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C2083l.L(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void M() {
        h();
        A().beginTransaction();
    }

    public final void N() {
        h();
        A().endTransaction();
    }

    public final void O(ArrayList arrayList) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        g();
        h();
        h2.y.i(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (c2066c0.f15562a.getDatabasePath("google_app_measurement.db").exists()) {
            String k3 = U.a.k("(", TextUtils.join(",", arrayList), ")");
            if (u("SELECT COUNT(1) FROM queue WHERE rowid IN " + k3 + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                K k4 = c2066c0.f15568i;
                C2066c0.i(k4);
                k4.f15397i.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                A().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + k3 + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e4) {
                K k5 = c2066c0.f15568i;
                C2066c0.i(k5);
                k5.f15394f.b(e4, "Error incrementing retry count. error");
            }
        }
    }

    public final void P() {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        g();
        h();
        if (c2066c0.f15562a.getDatabasePath("google_app_measurement.db").exists()) {
            X0 x02 = this.f15438b;
            long a4 = x02.f15488i.f15408e.a();
            c2066c0.f15573n.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a4) > ((Long) B.y.a(null)).longValue()) {
                x02.f15488i.f15408e.b(elapsedRealtime);
                g();
                h();
                if (c2066c0.f15562a.getDatabasePath("google_app_measurement.db").exists()) {
                    SQLiteDatabase A3 = A();
                    c2066c0.f15573n.getClass();
                    int delete = A3.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) B.f15267D.a(null)).longValue())});
                    if (delete > 0) {
                        K k3 = c2066c0.f15568i;
                        C2066c0.i(k3);
                        k3.f15402n.b(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    @Override // x2.T0
    public final void j() {
    }

    public final void k(String str, String str2) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        h2.y.e(str);
        h2.y.e(str2);
        g();
        h();
        try {
            A().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e4) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15394f.d("Error deleting user property. appId", K.n(str), c2066c0.f15572m.f(str2), e4);
        }
    }

    public final void l() {
        h();
        A().setTransactionSuccessful();
    }

    public final void m(C2082k0 c2082k0) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        g();
        h();
        String F2 = c2082k0.F();
        h2.y.i(F2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", F2);
        contentValues.put("app_instance_id", c2082k0.G());
        contentValues.put("gmp_app_id", c2082k0.J());
        C2066c0 c2066c02 = c2082k0.f15695a;
        C2064b0 c2064b0 = c2066c02.f15569j;
        C2066c0.i(c2064b0);
        c2064b0.g();
        contentValues.put("resettable_device_id_hash", c2082k0.f15697e);
        C2064b0 c2064b02 = c2066c02.f15569j;
        C2066c0.i(c2064b02);
        c2064b02.g();
        contentValues.put("last_bundle_index", Long.valueOf(c2082k0.f15699g));
        C2064b0 c2064b03 = c2066c02.f15569j;
        C2066c0.i(c2064b03);
        c2064b03.g();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c2082k0.f15700h));
        C2064b0 c2064b04 = c2066c02.f15569j;
        C2066c0.i(c2064b04);
        c2064b04.g();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c2082k0.f15701i));
        contentValues.put("app_version", c2082k0.H());
        C2064b0 c2064b05 = c2066c02.f15569j;
        C2066c0.i(c2064b05);
        c2064b05.g();
        contentValues.put("app_store", c2082k0.f15704l);
        C2064b0 c2064b06 = c2066c02.f15569j;
        C2066c0.i(c2064b06);
        c2064b06.g();
        contentValues.put("gmp_version", Long.valueOf(c2082k0.f15705m));
        C2064b0 c2064b07 = c2066c02.f15569j;
        C2066c0.i(c2064b07);
        c2064b07.g();
        contentValues.put("dev_cert_hash", Long.valueOf(c2082k0.f15706n));
        C2064b0 c2064b08 = c2066c02.f15569j;
        C2066c0.i(c2064b08);
        c2064b08.g();
        contentValues.put("measurement_enabled", Boolean.valueOf(c2082k0.f15707o));
        C2064b0 c2064b09 = c2066c02.f15569j;
        C2066c0.i(c2064b09);
        c2064b09.g();
        contentValues.put("day", Long.valueOf(c2082k0.f15714v));
        C2064b0 c2064b010 = c2066c02.f15569j;
        C2066c0.i(c2064b010);
        c2064b010.g();
        contentValues.put("daily_public_events_count", Long.valueOf(c2082k0.f15715w));
        C2066c0.i(c2064b010);
        c2064b010.g();
        contentValues.put("daily_events_count", Long.valueOf(c2082k0.f15716x));
        C2066c0.i(c2064b010);
        c2064b010.g();
        contentValues.put("daily_conversions_count", Long.valueOf(c2082k0.y));
        C2064b0 c2064b011 = c2066c02.f15569j;
        C2066c0.i(c2064b011);
        c2064b011.g();
        contentValues.put("config_fetched_time", Long.valueOf(c2082k0.f15693D));
        C2064b0 c2064b012 = c2066c02.f15569j;
        C2066c0.i(c2064b012);
        c2064b012.g();
        contentValues.put("failed_config_fetch_time", Long.valueOf(c2082k0.f15694E));
        contentValues.put("app_version_int", Long.valueOf(c2082k0.B()));
        contentValues.put("firebase_instance_id", c2082k0.I());
        C2066c0.i(c2064b010);
        c2064b010.g();
        contentValues.put("daily_error_events_count", Long.valueOf(c2082k0.f15717z));
        C2066c0.i(c2064b010);
        c2064b010.g();
        contentValues.put("daily_realtime_events_count", Long.valueOf(c2082k0.f15690A));
        C2066c0.i(c2064b010);
        c2064b010.g();
        contentValues.put("health_monitor_sample", c2082k0.f15691B);
        C2064b0 c2064b013 = c2066c02.f15569j;
        C2066c0.i(c2064b013);
        c2064b013.g();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c2082k0.A()));
        contentValues.put("admob_app_id", c2082k0.D());
        contentValues.put("dynamite_version", Long.valueOf(c2082k0.C()));
        C2064b0 c2064b014 = c2066c02.f15569j;
        C2066c0.i(c2064b014);
        c2064b014.g();
        contentValues.put("session_stitching_token", c2082k0.f15713u);
        C2064b0 c2064b015 = c2066c02.f15569j;
        C2066c0.i(c2064b015);
        c2064b015.g();
        ArrayList arrayList = c2082k0.f15712t;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                K k3 = c2066c0.f15568i;
                C2066c0.i(k3);
                k3.f15397i.b(F2, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        ((N2) M2.f11786p.f11787o.b()).getClass();
        C2073g c2073g = c2066c0.f15566g;
        K k4 = c2066c0.f15568i;
        if (c2073g.p(null, B.f15298f0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase A3 = A();
            if (A3.update("apps", contentValues, "app_id = ?", new String[]{F2}) == 0 && A3.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                C2066c0.i(k4);
                k4.f15394f.b(K.n(F2), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e4) {
            C2066c0.i(k4);
            k4.f15394f.c(K.n(F2), e4, "Error storing app. appId");
        }
    }

    public final void n(C2091p c2091p) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        h2.y.i(c2091p);
        g();
        h();
        ContentValues contentValues = new ContentValues();
        String str = c2091p.f15752a;
        contentValues.put("app_id", str);
        contentValues.put("name", c2091p.f15753b);
        contentValues.put("lifetime_count", Long.valueOf(c2091p.c));
        contentValues.put("current_bundle_count", Long.valueOf(c2091p.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c2091p.f15755f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c2091p.f15756g));
        contentValues.put("last_bundled_day", c2091p.f15757h);
        contentValues.put("last_sampled_complex_event_id", c2091p.f15758i);
        contentValues.put("last_sampling_rate", c2091p.f15759j);
        contentValues.put("current_session_count", Long.valueOf(c2091p.f15754e));
        Boolean bool = c2091p.f15760k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (A().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                K k3 = c2066c0.f15568i;
                C2066c0.i(k3);
                k3.f15394f.b(K.n(str), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e4) {
            K k4 = c2066c0.f15568i;
            C2066c0.i(k4);
            k4.f15394f.c(K.n(str), e4, "Error storing event aggregates. appId");
        }
    }

    public final void o(String str, Long l4, long j4, com.google.android.gms.internal.measurement.E0 e02) {
        g();
        h();
        h2.y.i(e02);
        h2.y.e(str);
        byte[] b4 = e02.b();
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        K k3 = c2066c0.f15568i;
        K k4 = c2066c0.f15568i;
        C2066c0.i(k3);
        k3.f15402n.c(c2066c0.f15572m.d(str), Integer.valueOf(b4.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l4);
        contentValues.put("children_to_process", Long.valueOf(j4));
        contentValues.put("main_event", b4);
        try {
            if (A().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                C2066c0.i(k4);
                k4.f15394f.b(K.n(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e4) {
            C2066c0.i(k4);
            k4.f15394f.c(K.n(str), e4, "Error storing complex main event. appId");
        }
    }

    public final boolean p(C2065c c2065c) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        g();
        h();
        String str = c2065c.f15544o;
        h2.y.i(str);
        if (F(str, c2065c.f15546q.f15508p) == null) {
            long u2 = u("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            c2066c0.getClass();
            if (u2 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c2065c.f15545p);
        contentValues.put("name", c2065c.f15546q.f15508p);
        Object h4 = c2065c.f15546q.h();
        h2.y.i(h4);
        s(contentValues, h4);
        contentValues.put("active", Boolean.valueOf(c2065c.f15548s));
        contentValues.put("trigger_event_name", c2065c.f15549t);
        contentValues.put("trigger_timeout", Long.valueOf(c2065c.f15551v));
        b1 b1Var = c2066c0.f15571l;
        K k3 = c2066c0.f15568i;
        b1 b1Var2 = c2066c0.f15571l;
        C2066c0.g(b1Var);
        contentValues.put("timed_out_event", b1.W(c2065c.f15550u));
        contentValues.put("creation_timestamp", Long.valueOf(c2065c.f15547r));
        C2066c0.g(b1Var2);
        contentValues.put("triggered_event", b1.W(c2065c.f15552w));
        contentValues.put("triggered_timestamp", Long.valueOf(c2065c.f15546q.f15509q));
        contentValues.put("time_to_live", Long.valueOf(c2065c.f15553x));
        C2066c0.g(b1Var2);
        contentValues.put("expired_event", b1.W(c2065c.y));
        try {
            if (A().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            C2066c0.i(k3);
            k3.f15394f.b(K.n(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e4) {
            C2066c0.i(k3);
            k3.f15394f.c(K.n(str), e4, "Error storing conditional user property");
            return true;
        }
    }

    public final boolean q(Z0 z02) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        String str = z02.f15519b;
        g();
        h();
        String str2 = z02.f15518a;
        String str3 = z02.c;
        if (F(str2, str3) == null) {
            if (b1.S(str3)) {
                if (u("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(c2066c0.f15566g.k(str2, B.f15270G), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long u2 = u("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                c2066c0.getClass();
                if (u2 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(z02.d));
        s(contentValues, z02.f15520e);
        try {
            if (A().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15394f.b(K.n(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e4) {
            K k4 = c2066c0.f15568i;
            C2066c0.i(k4);
            k4.f15394f.c(K.n(str2), e4, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ef  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(long r20, long r22, com.google.android.gms.internal.ads.Q8 r24) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C2083l.r(long, long, com.google.android.gms.internal.ads.Q8):void");
    }

    public final long u(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = A().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j4 = rawQuery.getLong(0);
                rawQuery.close();
                return j4;
            } catch (SQLiteException e4) {
                K k3 = ((C2066c0) this.f1719a).f15568i;
                C2066c0.i(k3);
                k3.f15394f.c(str, e4, "Database error");
                throw e4;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void v(String str, String str2) {
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        h2.y.e(str);
        h2.y.e(str2);
        g();
        h();
        try {
            A().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e4) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15394f.d("Error deleting conditional property", K.n(str), c2066c0.f15572m.f(str2), e4);
        }
    }

    public final long x(String str, String[] strArr, long j4) {
        Cursor cursor = null;
        try {
            try {
                cursor = A().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j4;
                }
                long j5 = cursor.getLong(0);
                cursor.close();
                return j5;
            } catch (SQLiteException e4) {
                K k3 = ((C2066c0) this.f1719a).f15568i;
                C2066c0.i(k3);
                k3.f15394f.c(str, e4, "Database error");
                throw e4;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long y(String str) {
        long x4;
        C2066c0 c2066c0 = (C2066c0) this.f1719a;
        h2.y.e(str);
        h2.y.e("first_open_count");
        g();
        h();
        SQLiteDatabase A3 = A();
        A3.beginTransaction();
        long j4 = 0;
        try {
            try {
                x4 = x("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (x4 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (A3.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        K k3 = c2066c0.f15568i;
                        C2066c0.i(k3);
                        k3.f15394f.c(K.n(str), "first_open_count", "Failed to insert column (got -1). appId");
                        A3.endTransaction();
                        return -1L;
                    }
                    x4 = 0;
                }
            } catch (Throwable th) {
                A3.endTransaction();
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
        }
        try {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put("first_open_count", Long.valueOf(1 + x4));
            if (A3.update("app2", contentValues2, "app_id = ?", new String[]{str}) != 0) {
                A3.setTransactionSuccessful();
                A3.endTransaction();
                return x4;
            }
            K k4 = c2066c0.f15568i;
            C2066c0.i(k4);
            k4.f15394f.c(K.n(str), "first_open_count", "Failed to update column (got 0). appId");
            A3.endTransaction();
            return -1L;
        } catch (SQLiteException e5) {
            e = e5;
            j4 = x4;
            K k5 = c2066c0.f15568i;
            C2066c0.i(k5);
            k5.f15394f.d("Error inserting column. appId", K.n(str), "first_open_count", e);
            A3.endTransaction();
            return j4;
        }
    }

    public final long z(String str) {
        h2.y.e(str);
        return x("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }
}
