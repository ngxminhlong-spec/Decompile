package h0;

import android.database.Cursor;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: h0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1694b implements Closeable {

    /* renamed from: q, reason: collision with root package name */
    public static final String[] f13101q = new String[0];

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13102o;

    /* renamed from: p, reason: collision with root package name */
    public final SQLiteClosable f13103p;

    public /* synthetic */ C1694b(SQLiteClosable sQLiteClosable, int i4) {
        this.f13102o = i4;
        this.f13103p = sQLiteClosable;
    }

    public void a() {
        ((SQLiteDatabase) this.f13103p).beginTransaction();
    }

    public void b(int i4, byte[] bArr) {
        ((SQLiteProgram) this.f13103p).bindBlob(i4, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f13102o) {
            case 0:
                ((SQLiteDatabase) this.f13103p).close();
                return;
            default:
                ((SQLiteProgram) this.f13103p).close();
                return;
        }
    }

    public void d(int i4, long j4) {
        ((SQLiteProgram) this.f13103p).bindLong(i4, j4);
    }

    public void e(int i4) {
        ((SQLiteProgram) this.f13103p).bindNull(i4);
    }

    public void f(String str, int i4) {
        ((SQLiteProgram) this.f13103p).bindString(i4, str);
    }

    public void g() {
        ((SQLiteDatabase) this.f13103p).endTransaction();
    }

    public void h(String str) {
        ((SQLiteDatabase) this.f13103p).execSQL(str);
    }

    public Cursor i(g0.c cVar) {
        return ((SQLiteDatabase) this.f13103p).rawQueryWithFactory(new C1693a(cVar), cVar.a(), f13101q, null);
    }

    public Cursor j(String str) {
        return i(new B0.f(str));
    }

    public void k() {
        ((SQLiteDatabase) this.f13103p).setTransactionSuccessful();
    }
}
