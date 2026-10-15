package m;

import android.os.Looper;
import com.google.android.gms.internal.play_billing.B;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1801a extends B {

    /* renamed from: i, reason: collision with root package name */
    public static volatile C1801a f13967i;

    /* renamed from: j, reason: collision with root package name */
    public static final X.b f13968j = new X.b(1);

    /* renamed from: h, reason: collision with root package name */
    public final C1803c f13969h = new C1803c();

    public static C1801a j0() {
        if (f13967i != null) {
            return f13967i;
        }
        synchronized (C1801a.class) {
            try {
                if (f13967i == null) {
                    f13967i = new C1801a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f13967i;
    }

    public final void k0(Runnable runnable) {
        C1803c c1803c = this.f13969h;
        if (c1803c.f13974j == null) {
            synchronized (c1803c.f13972h) {
                try {
                    if (c1803c.f13974j == null) {
                        c1803c.f13974j = C1803c.j0(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        c1803c.f13974j.post(runnable);
    }
}
