package Q1;

import android.util.Log;
import com.google.android.gms.internal.ads.C1384xi;
import com.google.android.gms.internal.ads.Js;
import com.google.android.gms.internal.ads.Ks;
import com.google.android.gms.internal.ads.Q6;
import com.google.android.gms.internal.ads.Y9;
import java.util.Iterator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class I extends Y9 {
    public static void w(String str) {
        if (!y()) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.v("Ads", str);
            return;
        }
        C1384xi c1384xi = Y9.f7750A;
        Iterator d = ((Ks) c1384xi.f11290p).d(c1384xi, str);
        boolean z4 = true;
        while (true) {
            Js js = (Js) d;
            if (!js.hasNext()) {
                return;
            }
            String str2 = (String) js.next();
            if (z4) {
                Log.v("Ads", str2);
            } else {
                Log.v("Ads-cont", str2);
            }
            z4 = false;
        }
    }

    public static void x(String str, Throwable th) {
        if (y()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean y() {
        return Y9.v(2) && ((Boolean) Q6.f6646a.r()).booleanValue();
    }
}
