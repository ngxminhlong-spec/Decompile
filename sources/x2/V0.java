package x2;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class V0 implements M, a1 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ X0 f15462o;

    public V0(X0 x02) {
        this.f15462o = x02;
    }

    public V0(X0 x02, String str) {
        this.f15462o = x02;
    }

    @Override // x2.M
    public void e(String str, int i4, Throwable th, byte[] bArr, Map map) {
        C2083l c2083l;
        long longValue;
        X0 x02 = this.f15462o;
        x02.t().g();
        x02.e();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                x02.f15499t = false;
                x02.B();
                throw th2;
            }
        }
        ArrayList arrayList = x02.f15503x;
        h2.y.i(arrayList);
        x02.f15503x = null;
        if (i4 != 200) {
            if (i4 == 204) {
                i4 = 204;
            }
            x02.c().f15402n.c(Integer.valueOf(i4), th, "Network upload failed. Will retry later. code, error");
            Q q4 = x02.f15488i.f15411h;
            x02.d().getClass();
            q4.b(System.currentTimeMillis());
            if (i4 != 503 || i4 == 429) {
                Q q5 = x02.f15488i.f15409f;
                x02.d().getClass();
                q5.b(System.currentTimeMillis());
            }
            C2083l c2083l2 = x02.c;
            X0.I(c2083l2);
            c2083l2.O(arrayList);
            x02.D();
            x02.f15499t = false;
            x02.B();
        }
        if (th == null) {
            try {
                Q q6 = x02.f15488i.f15410g;
                x02.d().getClass();
                q6.b(System.currentTimeMillis());
                x02.f15488i.f15411h.b(0L);
                x02.D();
                x02.c().f15402n.c(Integer.valueOf(i4), Integer.valueOf(bArr.length), "Successful upload. Got network response. code, size");
                C2083l c2083l3 = x02.c;
                X0.I(c2083l3);
                c2083l3.M();
                try {
                    int size = arrayList.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj = arrayList.get(i5);
                        i5++;
                        Long l4 = (Long) obj;
                        try {
                            c2083l = x02.c;
                            X0.I(c2083l);
                            longValue = l4.longValue();
                            c2083l.g();
                            c2083l.h();
                        } catch (SQLiteException e4) {
                            ArrayList arrayList2 = x02.y;
                            if (arrayList2 == null || !arrayList2.contains(l4)) {
                                throw e4;
                            }
                        }
                        try {
                            if (c2083l.A().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                                break;
                            }
                        } catch (SQLiteException e5) {
                            K k3 = ((C2066c0) c2083l.f1719a).f15568i;
                            C2066c0.i(k3);
                            k3.f15394f.b(e5, "Failed to delete a bundle in a queue table");
                            throw e5;
                            break;
                        }
                    }
                    C2083l c2083l4 = x02.c;
                    X0.I(c2083l4);
                    c2083l4.l();
                    C2083l c2083l5 = x02.c;
                    X0.I(c2083l5);
                    c2083l5.N();
                    x02.y = null;
                    O o4 = x02.f15483b;
                    X0.I(o4);
                    if (o4.v() && x02.F()) {
                        x02.s();
                    } else {
                        x02.f15504z = -1L;
                        x02.D();
                    }
                    x02.f15494o = 0L;
                } catch (Throwable th3) {
                    C2083l c2083l6 = x02.c;
                    X0.I(c2083l6);
                    c2083l6.N();
                    throw th3;
                }
            } catch (SQLiteException e6) {
                x02.c().f15394f.b(e6, "Database error while trying to delete uploaded bundles");
                x02.d().getClass();
                x02.f15494o = SystemClock.elapsedRealtime();
                x02.c().f15402n.b(Long.valueOf(x02.f15494o), "Disable upload, time");
            }
            x02.f15499t = false;
            x02.B();
        }
        x02.c().f15402n.c(Integer.valueOf(i4), th, "Network upload failed. Will retry later. code, error");
        Q q42 = x02.f15488i.f15411h;
        x02.d().getClass();
        q42.b(System.currentTimeMillis());
        if (i4 != 503) {
        }
        Q q52 = x02.f15488i.f15409f;
        x02.d().getClass();
        q52.b(System.currentTimeMillis());
        C2083l c2083l22 = x02.c;
        X0.I(c2083l22);
        c2083l22.O(arrayList);
        x02.D();
        x02.f15499t = false;
        x02.B();
    }

    @Override // x2.a1
    public void l(Bundle bundle, String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        X0 x02 = this.f15462o;
        if (!isEmpty) {
            x02.t().o(new E.n(this, str, bundle, 23, false));
            return;
        }
        C2066c0 c2066c0 = x02.f15491l;
        if (c2066c0 != null) {
            K k3 = c2066c0.f15568i;
            C2066c0.i(k3);
            k3.f15394f.b("_err", "AppId not known when logging event");
        }
    }
}
