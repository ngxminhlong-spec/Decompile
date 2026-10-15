package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import n0.n;
import o0.l;
import q2.e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3153a = n.h("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = f3153a;
        n.d().a(str, "Requesting diagnostics", new Throwable[0]);
        try {
            l.N(context).k(new e(DiagnosticsWorker.class).i());
        } catch (IllegalStateException e4) {
            n.d().c(str, "WorkManager is not initialized", e4);
        }
    }
}
