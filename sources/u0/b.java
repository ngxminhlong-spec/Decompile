package u0;

import android.content.Intent;
import android.content.IntentFilter;
import n0.n;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f14969i = n.h("BatteryNotLowTracker");

    @Override // u0.d
    public final Object a() {
        Intent registerReceiver = this.f14974b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        n.d().c(f14969i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // u0.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // u0.c
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        n.d().a(f14969i, n0.a.k("Received ", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            c(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            c(Boolean.FALSE);
        }
    }
}
