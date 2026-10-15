package h2;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.Ur;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class I {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f13154g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static I f13155h;

    /* renamed from: i, reason: collision with root package name */
    public static HandlerThread f13156i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f13157a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f13158b;
    public volatile Ur c;
    public final k2.a d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13159e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13160f;

    public I(Context context, Looper looper) {
        H h4 = new H(this);
        this.f13158b = context.getApplicationContext();
        Ur ur = new Ur(looper, h4, 3);
        Looper.getMainLooper();
        this.c = ur;
        this.d = k2.a.a();
        this.f13159e = 5000L;
        this.f13160f = 300000L;
    }

    public static I a(Context context) {
        synchronized (f13154g) {
            try {
                if (f13155h == null) {
                    f13155h = new I(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f13155h;
    }

    public static HandlerThread b() {
        synchronized (f13154g) {
            try {
                HandlerThread handlerThread = f13156i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f13156i = handlerThread2;
                handlerThread2.start();
                return f13156i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, ServiceConnection serviceConnection, boolean z4) {
        F f4 = new F(str, z4);
        y.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f13157a) {
            try {
                G g4 = (G) this.f13157a.get(f4);
                if (g4 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(f4.toString()));
                }
                if (!g4.f13146o.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(f4.toString()));
                }
                g4.f13146o.remove(serviceConnection);
                if (g4.f13146o.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, f4), this.f13159e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(F f4, ServiceConnectionC1700B serviceConnectionC1700B, String str, Executor executor) {
        boolean z4;
        synchronized (this.f13157a) {
            try {
                G g4 = (G) this.f13157a.get(f4);
                if (executor == null) {
                    executor = null;
                }
                if (g4 == null) {
                    g4 = new G(this, f4);
                    g4.f13146o.put(serviceConnectionC1700B, serviceConnectionC1700B);
                    g4.a(str, executor);
                    this.f13157a.put(f4, g4);
                } else {
                    this.c.removeMessages(0, f4);
                    if (g4.f13146o.containsKey(serviceConnectionC1700B)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(f4.toString()));
                    }
                    g4.f13146o.put(serviceConnectionC1700B, serviceConnectionC1700B);
                    int i4 = g4.f13147p;
                    if (i4 == 1) {
                        serviceConnectionC1700B.onServiceConnected(g4.f13151t, g4.f13149r);
                    } else if (i4 == 2) {
                        g4.a(str, executor);
                    }
                }
                z4 = g4.f13148q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }
}
