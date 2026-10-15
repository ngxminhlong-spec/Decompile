package h0;

import android.database.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f extends C1694b {

    /* renamed from: r, reason: collision with root package name */
    public final SQLiteStatement f13116r;

    public f(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement, 1);
        this.f13116r = sQLiteStatement;
    }

    public final void l() {
        this.f13116r.executeUpdateDelete();
    }
}
