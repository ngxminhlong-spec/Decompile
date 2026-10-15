package B0;

import Q1.E;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.IntentFilter;
import android.view.textclassifier.TextClassificationManager;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract /* synthetic */ class s {
    public static /* bridge */ /* synthetic */ void C(Context context, E e4, IntentFilter intentFilter) {
        context.registerReceiver(e4, intentFilter, 4);
    }

    public static /* synthetic */ NotificationChannel c() {
        return new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
    }

    public static /* synthetic */ NotificationChannel e(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return TextClassificationManager.class;
    }
}
