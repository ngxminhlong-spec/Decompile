package z3;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import v3.C2033d;
import x3.g;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: z3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2137d {
    public static final long d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f15986e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final g f15987a;

    /* renamed from: b, reason: collision with root package name */
    public long f15988b;
    public int c;

    public C2137d() {
        if (C2033d.f15098p == null) {
            Pattern pattern = g.c;
            C2033d.f15098p = new C2033d(1);
        }
        C2033d c2033d = C2033d.f15098p;
        if (g.d == null) {
            g.d = new g(c2033d);
        }
        this.f15987a = g.d;
    }

    public final synchronized long a(int i4) {
        if (!(i4 == 429 || (i4 >= 500 && i4 < 600))) {
            return d;
        }
        double pow = Math.pow(2.0d, this.c);
        this.f15987a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f15986e);
    }

    public final synchronized boolean b() {
        boolean z4;
        if (this.c != 0) {
            this.f15987a.f15883a.getClass();
            z4 = System.currentTimeMillis() > this.f15988b;
        }
        return z4;
    }

    public final synchronized void c() {
        this.c = 0;
    }

    public final synchronized void d(int i4) {
        if ((i4 >= 200 && i4 < 300) || i4 == 401 || i4 == 404) {
            c();
            return;
        }
        this.c++;
        long a4 = a(i4);
        this.f15987a.f15883a.getClass();
        this.f15988b = System.currentTimeMillis() + a4;
    }
}
