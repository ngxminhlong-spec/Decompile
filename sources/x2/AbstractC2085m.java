package x2;

import android.os.Handler;
import com.google.android.gms.internal.ads.Ur;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2085m {
    public static volatile Ur d;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2078i0 f15735a;

    /* renamed from: b, reason: collision with root package name */
    public final x0.j f15736b;
    public volatile long c;

    public AbstractC2085m(InterfaceC2078i0 interfaceC2078i0) {
        h2.y.i(interfaceC2078i0);
        this.f15735a = interfaceC2078i0;
        this.f15736b = new x0.j(this, interfaceC2078i0, 1, false);
    }

    public final void a() {
        this.c = 0L;
        d().removeCallbacks(this.f15736b);
    }

    public abstract void b();

    public final void c(long j4) {
        a();
        if (j4 >= 0) {
            this.f15735a.d().getClass();
            this.c = System.currentTimeMillis();
            if (d().postDelayed(this.f15736b, j4)) {
                return;
            }
            this.f15735a.c().f15394f.b(Long.valueOf(j4), "Failed to schedule delayed post. time");
        }
    }

    public final Handler d() {
        Ur ur;
        if (d != null) {
            return d;
        }
        synchronized (AbstractC2085m.class) {
            try {
                if (d == null) {
                    d = new Ur(this.f15735a.b().getMainLooper(), 1, false);
                }
                ur = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ur;
    }
}
