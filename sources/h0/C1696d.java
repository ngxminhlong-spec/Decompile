package h0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.internal.measurement.C1510e1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: h0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1696d extends SQLiteOpenHelper {

    /* renamed from: o, reason: collision with root package name */
    public final C1694b[] f13106o;

    /* renamed from: p, reason: collision with root package name */
    public final C1510e1 f13107p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13108q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1696d(Context context, String str, C1694b[] c1694bArr, C1510e1 c1510e1) {
        super(context, str, null, 12, new C1695c(c1510e1, c1694bArr));
        c1510e1.getClass();
        this.f13107p = c1510e1;
        this.f13106o = c1694bArr;
    }

    public static C1694b a(C1694b[] c1694bArr, SQLiteDatabase sQLiteDatabase) {
        C1694b c1694b = c1694bArr[0];
        if (c1694b == null || ((SQLiteDatabase) c1694b.f13103p) != sQLiteDatabase) {
            c1694bArr[0] = new C1694b(sQLiteDatabase, 0);
        }
        return c1694bArr[0];
    }

    public final synchronized C1694b b() {
        this.f13108q = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!this.f13108q) {
            return a(this.f13106o, writableDatabase);
        }
        close();
        return b();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.f13106o[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        a(this.f13106o, sQLiteDatabase);
        this.f13107p.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c A[ORIG_RETURN, RETURN] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.database.sqlite.SQLiteDatabase r6) {
        /*
            r5 = this;
            h0.b[] r0 = r5.f13106o
            h0.b r6 = a(r0, r6)
            com.google.android.gms.internal.measurement.e1 r0 = r5.f13107p
            java.lang.Object r1 = r0.f11915q
            k.e r1 = (k.C1748e) r1
            java.lang.String r2 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r2 = r6.j(r2)
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L21
            r4 = 0
            if (r3 == 0) goto L23
            int r3 = r2.getInt(r4)     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L23
            r3 = 1
            goto L24
        L21:
            r6 = move-exception
            goto L6d
        L23:
            r3 = r4
        L24:
            r2.close()
            k.C1748e.j(r6)
            if (r3 != 0) goto L4b
            c0.i r2 = k.C1748e.q(r6)
            boolean r3 = r2.f3531a
            if (r3 == 0) goto L35
            goto L4b
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r1)
            java.lang.String r1 = r2.f3532b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L4b:
            r0.v(r6)
            java.lang.Object r6 = r1.f13386p
            androidx.work.impl.WorkDatabase_Impl r6 = (androidx.work.impl.WorkDatabase_Impl) r6
            int r0 = androidx.work.impl.WorkDatabase_Impl.f3137s
            java.util.List r0 = r6.f3528g
            if (r0 == 0) goto L6c
            int r0 = r0.size()
        L5c:
            if (r4 >= r0) goto L6c
            java.util.List r1 = r6.f3528g
            java.lang.Object r1 = r1.get(r4)
            o0.g r1 = (o0.g) r1
            r1.getClass()
            int r4 = r4 + 1
            goto L5c
        L6c:
            return
        L6d:
            r2.close()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C1696d.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        this.f13108q = true;
        this.f13107p.q(a(this.f13106o, sQLiteDatabase), i4, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0067  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r11) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C1696d.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        this.f13108q = true;
        this.f13107p.q(a(this.f13106o, sQLiteDatabase), i4, i5);
    }
}
