package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import n0.n;
import o0.l;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3146a = n.h("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        n.d().a(f3146a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            l N = l.N(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (l.f14172w) {
                try {
                    N.f14181t = goAsync;
                    if (N.f14180s) {
                        goAsync.finish();
                        N.f14181t = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e4) {
            n.d().c(f3146a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e4);
        }
    }
}
