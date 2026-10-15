package f;

import android.util.Log;
import java.lang.ref.WeakReference;
import r.C1964a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: o, reason: collision with root package name */
    public static int f12841o = -100;

    /* renamed from: p, reason: collision with root package name */
    public static final r.f f12842p = new r.f(0);

    /* renamed from: q, reason: collision with root package name */
    public static final Object f12843q = new Object();

    public static void c(h hVar) {
        synchronized (f12843q) {
            try {
                r.f fVar = f12842p;
                fVar.getClass();
                C1964a c1964a = new C1964a(fVar);
                while (c1964a.hasNext()) {
                    h hVar2 = (h) ((WeakReference) c1964a.next()).get();
                    if (hVar2 == hVar || hVar2 == null) {
                        c1964a.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void f(int i4) {
        if (i4 != -1 && i4 != 0 && i4 != 1 && i4 != 2 && i4 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (f12841o != i4) {
            f12841o = i4;
            synchronized (f12843q) {
                try {
                    r.f fVar = f12842p;
                    fVar.getClass();
                    C1964a c1964a = new C1964a(fVar);
                    while (c1964a.hasNext()) {
                        h hVar = (h) ((WeakReference) c1964a.next()).get();
                        if (hVar != null) {
                            ((q) hVar).j(true);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract boolean d(int i4);

    public abstract void e(int i4);

    public abstract void h(CharSequence charSequence);
}
