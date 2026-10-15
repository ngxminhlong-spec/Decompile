package h0;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.C1510e1;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: h0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1695c implements DatabaseErrorHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1510e1 f13104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1694b[] f13105b;

    public C1695c(C1510e1 c1510e1, C1694b[] c1694bArr) {
        this.f13104a = c1510e1;
        this.f13105b = c1694bArr;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        C1694b a4 = C1696d.a(this.f13105b, sQLiteDatabase);
        this.f13104a.getClass();
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + ((SQLiteDatabase) a4.f13103p).getPath());
        SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) a4.f13103p;
        if (!sQLiteDatabase2.isOpen()) {
            C1510e1.m(sQLiteDatabase2.getPath());
            return;
        }
        List<Pair<String, String>> list = null;
        try {
            try {
                list = sQLiteDatabase2.getAttachedDbs();
            } catch (SQLiteException unused) {
            }
            try {
                a4.close();
            } catch (IOException unused2) {
            }
        } finally {
            if (list != null) {
                Iterator<Pair<String, String>> it = list.iterator();
                while (it.hasNext()) {
                    C1510e1.m((String) it.next().second);
                }
            } else {
                C1510e1.m(sQLiteDatabase2.getPath());
            }
        }
    }
}
