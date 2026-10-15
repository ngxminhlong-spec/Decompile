package Q1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import com.google.android.gms.internal.ads.Y9;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class O {
    public final CookieManager a() {
        N1.n nVar = N1.n.f1204A;
        N n4 = nVar.c;
        int myUid = Process.myUid();
        if (myUid != 0 && myUid != 1000) {
            try {
                return CookieManager.getInstance();
            } catch (Throwable th) {
                Y9.q("Failed to obtain CookieManager.", th);
                nVar.f1209g.g("ApiLevelUtil.getCookieManager", th);
            }
        }
        return null;
    }

    public boolean b(Activity activity, Configuration configuration) {
        return false;
    }

    public Intent c(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public void d(Context context) {
    }

    public boolean e(Context context) {
        return false;
    }

    public int f(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    public int g(AudioManager audioManager) {
        return 0;
    }

    public void h(Activity activity) {
    }

    public int i(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
