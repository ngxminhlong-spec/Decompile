package d3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f12613b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f12614a;

    public f(Context context) {
        this.f12614a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f12615j) {
            try {
                Iterator it = ((r.d) g.f12616k.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f12614a.unregisterReceiver(this);
    }
}
