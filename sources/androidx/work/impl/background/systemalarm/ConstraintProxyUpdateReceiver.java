package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import n0.a;
import n0.n;
import o0.l;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3145a = n.h("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            l.N(context).f14176o.c(new E.n(intent, context, goAsync(), 7));
        } else {
            n.d().a(f3145a, a.k("Ignoring unknown action ", action), new Throwable[0]);
        }
    }
}
