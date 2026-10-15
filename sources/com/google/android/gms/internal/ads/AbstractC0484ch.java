package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ch, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0484ch {

    /* renamed from: a, reason: collision with root package name */
    public static final C0824kg f8374a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.ads.kg] */
    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract C1210tg d(int i4, C1210tg c1210tg, boolean z4);

    public abstract Rg e(int i4, Rg rg, long j4);

    public final boolean equals(Object obj) {
        int h4;
        if (this != obj) {
            if (obj instanceof AbstractC0484ch) {
                AbstractC0484ch abstractC0484ch = (AbstractC0484ch) obj;
                if (abstractC0484ch.c() == c() && abstractC0484ch.b() == b()) {
                    Rg rg = new Rg();
                    C1210tg c1210tg = new C1210tg();
                    Rg rg2 = new Rg();
                    C1210tg c1210tg2 = new C1210tg();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= c()) {
                            int i5 = 0;
                            while (true) {
                                if (i5 >= b()) {
                                    int g4 = g(true);
                                    if (g4 == abstractC0484ch.g(true) && (h4 = h(true)) == abstractC0484ch.h(true)) {
                                        while (g4 != h4) {
                                            int j4 = j(g4, 0, true);
                                            if (j4 == abstractC0484ch.j(g4, 0, true)) {
                                                g4 = j4;
                                            }
                                        }
                                    }
                                } else {
                                    if (!d(i5, c1210tg, true).equals(abstractC0484ch.d(i5, c1210tg2, true))) {
                                        break;
                                    }
                                    i5++;
                                }
                            }
                        } else {
                            if (!e(i4, rg, 0L).equals(abstractC0484ch.e(i4, rg2, 0L))) {
                                break;
                            }
                            i4++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract Object f(int i4);

    public int g(boolean z4) {
        return o() ? -1 : 0;
    }

    public int h(boolean z4) {
        if (o()) {
            return -1;
        }
        return c() - 1;
    }

    public final int hashCode() {
        int i4;
        Rg rg = new Rg();
        C1210tg c1210tg = new C1210tg();
        int c = c() + 217;
        int i5 = 0;
        while (true) {
            i4 = c * 31;
            if (i5 >= c()) {
                break;
            }
            c = i4 + e(i5, rg, 0L).hashCode();
            i5++;
        }
        int b4 = b() + i4;
        for (int i6 = 0; i6 < b(); i6++) {
            b4 = (b4 * 31) + d(i6, c1210tg, true).hashCode();
        }
        int g4 = g(true);
        while (g4 != -1) {
            b4 = (b4 * 31) + g4;
            g4 = j(g4, 0, true);
        }
        return b4;
    }

    public final int i(int i4, C1210tg c1210tg, Rg rg, int i5, boolean z4) {
        int i6 = d(i4, c1210tg, false).c;
        if (e(i6, rg, 0L).f6826m != i4) {
            return i4 + 1;
        }
        int j4 = j(i6, i5, z4);
        if (j4 == -1) {
            return -1;
        }
        return e(j4, rg, 0L).f6825l;
    }

    public int j(int i4, int i5, boolean z4) {
        if (i5 == 0) {
            if (i4 == h(z4)) {
                return -1;
            }
            return i4 + 1;
        }
        if (i5 == 1) {
            return i4;
        }
        if (i5 == 2) {
            return i4 == h(z4) ? g(z4) : i4 + 1;
        }
        throw new IllegalStateException();
    }

    public int k(int i4) {
        if (i4 == g(false)) {
            return -1;
        }
        return i4 - 1;
    }

    public final Pair l(Rg rg, C1210tg c1210tg, int i4, long j4) {
        Pair m4 = m(rg, c1210tg, i4, j4, 0L);
        m4.getClass();
        return m4;
    }

    public final Pair m(Rg rg, C1210tg c1210tg, int i4, long j4, long j5) {
        Zf.m(i4, c());
        e(i4, rg, j5);
        if (j4 == -9223372036854775807L) {
            rg.getClass();
            j4 = 0;
        }
        int i5 = rg.f6825l;
        d(i5, c1210tg, false);
        while (i5 < rg.f6826m) {
            c1210tg.getClass();
            if (j4 == 0) {
                break;
            }
            int i6 = i5 + 1;
            d(i6, c1210tg, false).getClass();
            if (j4 < 0) {
                break;
            }
            i5 = i6;
        }
        d(i5, c1210tg, true);
        c1210tg.getClass();
        long j6 = c1210tg.d;
        if (j6 != -9223372036854775807L) {
            j4 = Math.min(j4, j6 - 1);
        }
        long max = Math.max(0L, j4);
        Object obj = c1210tg.f10712b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public C1210tg n(Object obj, C1210tg c1210tg) {
        return d(a(obj), c1210tg, true);
    }

    public final boolean o() {
        return c() == 0;
    }
}
