package h2;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class H implements Handler.Callback {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I f13153o;

    public /* synthetic */ H(I i4) {
        this.f13153o = i4;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 0) {
            synchronized (this.f13153o.f13157a) {
                try {
                    F f4 = (F) message.obj;
                    G g4 = (G) this.f13153o.f13157a.get(f4);
                    if (g4 != null && g4.f13146o.isEmpty()) {
                        if (g4.f13148q) {
                            g4.f13152u.c.removeMessages(1, g4.f13150s);
                            I i5 = g4.f13152u;
                            i5.d.b(i5.f13158b, g4);
                            g4.f13148q = false;
                            g4.f13147p = 2;
                        }
                        this.f13153o.f13157a.remove(f4);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i4 != 1) {
            return false;
        }
        synchronized (this.f13153o.f13157a) {
            try {
                F f5 = (F) message.obj;
                G g5 = (G) this.f13153o.f13157a.get(f5);
                if (g5 != null && g5.f13147p == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(f5)), new Exception());
                    ComponentName componentName = g5.f13151t;
                    if (componentName == null) {
                        f5.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = f5.f13145b;
                        y.i(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    g5.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
