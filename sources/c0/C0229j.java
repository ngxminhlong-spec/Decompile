package c0;

import android.database.sqlite.SQLiteProgram;
import h0.C1694b;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: c0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229j implements g0.c, Closeable {

    /* renamed from: w, reason: collision with root package name */
    public static final TreeMap f3533w = new TreeMap();

    /* renamed from: o, reason: collision with root package name */
    public volatile String f3534o;

    /* renamed from: p, reason: collision with root package name */
    public final long[] f3535p;

    /* renamed from: q, reason: collision with root package name */
    public final double[] f3536q;

    /* renamed from: r, reason: collision with root package name */
    public final String[] f3537r;

    /* renamed from: s, reason: collision with root package name */
    public final byte[][] f3538s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f3539t;

    /* renamed from: u, reason: collision with root package name */
    public final int f3540u;

    /* renamed from: v, reason: collision with root package name */
    public int f3541v;

    public C0229j(int i4) {
        this.f3540u = i4;
        int i5 = i4 + 1;
        this.f3539t = new int[i5];
        this.f3535p = new long[i5];
        this.f3536q = new double[i5];
        this.f3537r = new String[i5];
        this.f3538s = new byte[i5];
    }

    public static C0229j d(String str, int i4) {
        TreeMap treeMap = f3533w;
        synchronized (treeMap) {
            try {
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i4));
                if (ceilingEntry == null) {
                    C0229j c0229j = new C0229j(i4);
                    c0229j.f3534o = str;
                    c0229j.f3541v = i4;
                    return c0229j;
                }
                treeMap.remove(ceilingEntry.getKey());
                C0229j c0229j2 = (C0229j) ceilingEntry.getValue();
                c0229j2.f3534o = str;
                c0229j2.f3541v = i4;
                return c0229j2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g0.c
    public final String a() {
        return this.f3534o;
    }

    @Override // g0.c
    public final void b(C1694b c1694b) {
        for (int i4 = 1; i4 <= this.f3541v; i4++) {
            int i5 = this.f3539t[i4];
            if (i5 == 1) {
                c1694b.e(i4);
            } else if (i5 == 2) {
                c1694b.d(i4, this.f3535p[i4]);
            } else if (i5 == 3) {
                ((SQLiteProgram) c1694b.f13103p).bindDouble(i4, this.f3536q[i4]);
            } else if (i5 == 4) {
                c1694b.f(this.f3537r[i4], i4);
            } else if (i5 == 5) {
                c1694b.b(i4, this.f3538s[i4]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void e(int i4, long j4) {
        this.f3539t[i4] = 2;
        this.f3535p[i4] = j4;
    }

    public final void f(int i4) {
        this.f3539t[i4] = 1;
    }

    public final void g(String str, int i4) {
        this.f3539t[i4] = 4;
        this.f3537r[i4] = str;
    }

    public final void h() {
        TreeMap treeMap = f3533w;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f3540u), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i4 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i4;
                }
            }
        }
    }
}
