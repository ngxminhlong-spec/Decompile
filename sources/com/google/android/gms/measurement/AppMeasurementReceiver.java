package com.google.android.gms.measurement;

import Q.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import k.C1748e;
import x2.C2066c0;
import x2.K;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends a {
    public C1748e c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new C1748e(20, this);
        }
        C1748e c1748e = this.c;
        c1748e.getClass();
        K k3 = C2066c0.p(context, null, null).f15568i;
        C2066c0.i(k3);
        if (intent == null) {
            k3.f15397i.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        k3.f15402n.b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                k3.f15397i.a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        k3.f15402n.a("Starting wakeful intent.");
        ((AppMeasurementReceiver) c1748e.f13386p).getClass();
        SparseArray sparseArray = a.f1613a;
        synchronized (sparseArray) {
            try {
                int i4 = a.f1614b;
                int i5 = i4 + 1;
                a.f1614b = i5;
                if (i5 <= 0) {
                    a.f1614b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i4);
                ComponentName startService = context.startService(className);
                if (startService == null) {
                    return;
                }
                PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire(60000L);
                sparseArray.put(i4, newWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
