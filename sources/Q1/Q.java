package Q1;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class Q extends P {
    @Override // Q1.O
    public final Intent c(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // Q1.O
    public final void d(Context context) {
        NotificationChannel c = B0.s.c();
        c.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(c);
    }

    @Override // Q1.O
    public final boolean e(Context context) {
        NotificationChannel notificationChannel;
        int importance;
        notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        if (notificationChannel == null) {
            return false;
        }
        importance = notificationChannel.getImportance();
        return importance == 0;
    }

    @Override // Q1.O
    public final int f(Context context, TelephonyManager telephonyManager) {
        boolean isDataEnabled;
        N n4 = N1.n.f1204A.c;
        if (!N.I(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return 1;
        }
        isDataEnabled = telephonyManager.isDataEnabled();
        return isDataEnabled ? 2 : 1;
    }
}
