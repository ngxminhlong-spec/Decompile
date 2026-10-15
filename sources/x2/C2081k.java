package x2;

import Q1.AbstractC0115n;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2081k extends SQLiteOpenHelper {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15688o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AbstractC0115n f15689p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2081k(F f4, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f15689p = f4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2081k(C2083l c2083l, Context context) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f15689p = c2083l;
    }

    private final void a(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }

    private final void b(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }

    private final void d(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }

    private final void e(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f15688o) {
            case 0:
                C2083l c2083l = (C2083l) this.f15689p;
                N1.d dVar = c2083l.f15726e;
                C2066c0 c2066c0 = (C2066c0) c2083l.f1719a;
                c2066c0.getClass();
                if (dVar.f1157p != 0) {
                    ((C1798a) dVar.f1158q).getClass();
                    if (SystemClock.elapsedRealtime() - dVar.f1157p < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((C1798a) dVar.f1158q).getClass();
                    dVar.f1157p = SystemClock.elapsedRealtime();
                    K k3 = c2066c0.f15568i;
                    C2066c0.i(k3);
                    k3.f15394f.a("Opening the database failed, dropping and recreating it");
                    c2066c0.getClass();
                    if (!c2066c0.f15562a.getDatabasePath("google_app_measurement.db").delete()) {
                        K k4 = c2066c0.f15568i;
                        C2066c0.i(k4);
                        k4.f15394f.b("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        dVar.f1157p = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e4) {
                        K k5 = c2066c0.f15568i;
                        C2066c0.i(k5);
                        k5.f15394f.b(e4, "Failed to open freshly created database");
                        throw e4;
                    }
                }
            default:
                F f4 = (F) this.f15689p;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e5) {
                    throw e5;
                } catch (SQLiteException unused2) {
                    K k6 = ((C2066c0) f4.f1719a).f15568i;
                    C2066c0.i(k6);
                    k6.f15394f.a("Opening the local database failed, dropping and recreating it");
                    ((C2066c0) f4.f1719a).getClass();
                    if (!((C2066c0) f4.f1719a).f15562a.getDatabasePath("google_app_measurement_local.db").delete()) {
                        K k7 = ((C2066c0) f4.f1719a).f15568i;
                        C2066c0.i(k7);
                        k7.f15394f.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e6) {
                        K k8 = ((C2066c0) f4.f1719a).f15568i;
                        C2066c0.i(k8);
                        k8.f15394f.b(e6, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f15688o) {
            case 0:
                K k3 = ((C2066c0) ((C2083l) this.f15689p).f1719a).f15568i;
                C2066c0.i(k3);
                AbstractC2080j0.h(k3, sQLiteDatabase);
                return;
            default:
                K k4 = ((C2066c0) ((F) this.f15689p).f1719a).f15568i;
                C2066c0.i(k4);
                AbstractC2080j0.h(k4, sQLiteDatabase);
                return;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        int i6 = this.f15688o;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        switch (this.f15688o) {
            case 0:
                C2083l c2083l = (C2083l) this.f15689p;
                K k3 = ((C2066c0) c2083l.f1719a).f15568i;
                C2066c0.i(k3);
                AbstractC2080j0.c(k3, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C2083l.f15718f);
                K k4 = ((C2066c0) c2083l.f1719a).f15568i;
                C2066c0.i(k4);
                AbstractC2080j0.c(k4, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                K k5 = ((C2066c0) c2083l.f1719a).f15568i;
                C2066c0.i(k5);
                AbstractC2080j0.c(k5, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C2083l.f15719g);
                K k6 = ((C2066c0) c2083l.f1719a).f15568i;
                C2066c0.i(k6);
                AbstractC2080j0.c(k6, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C2083l.f15720h);
                K k7 = ((C2066c0) c2083l.f1719a).f15568i;
                C2066c0.i(k7);
                AbstractC2080j0.c(k7, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C2083l.f15722j);
                K k8 = ((C2066c0) c2083l.f1719a).f15568i;
                C2066c0.i(k8);
                AbstractC2080j0.c(k8, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                K k9 = ((C2066c0) c2083l.f1719a).f15568i;
                C2066c0.i(k9);
                AbstractC2080j0.c(k9, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C2083l.f15721i);
                K k10 = ((C2066c0) c2083l.f1719a).f15568i;
                C2066c0.i(k10);
                AbstractC2080j0.c(k10, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C2083l.f15723k);
                K k11 = ((C2066c0) c2083l.f1719a).f15568i;
                C2066c0.i(k11);
                AbstractC2080j0.c(k11, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C2083l.f15724l);
                K k12 = ((C2066c0) c2083l.f1719a).f15568i;
                C2066c0.i(k12);
                AbstractC2080j0.c(k12, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                K k13 = ((C2066c0) c2083l.f1719a).f15568i;
                C2066c0.i(k13);
                AbstractC2080j0.c(k13, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C2083l.f15725m);
                K k14 = ((C2066c0) c2083l.f1719a).f15568i;
                C2066c0.i(k14);
                AbstractC2080j0.c(k14, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                K k15 = ((C2066c0) c2083l.f1719a).f15568i;
                C2066c0.i(k15);
                AbstractC2080j0.c(k15, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                K k16 = ((C2066c0) c2083l.f1719a).f15568i;
                C2066c0.i(k16);
                AbstractC2080j0.c(k16, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", null);
                return;
            default:
                K k17 = ((C2066c0) ((F) this.f15689p).f1719a).f15568i;
                C2066c0.i(k17);
                AbstractC2080j0.c(k17, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
                return;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        int i6 = this.f15688o;
    }
}
