package h0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1693a implements SQLiteDatabase.CursorFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0.c f13100a;

    public C1693a(g0.c cVar) {
        this.f13100a = cVar;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.f13100a.b(new C1694b(sQLiteQuery, 1));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
