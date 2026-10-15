package Q1;

import O1.C0081p;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C0937n6;
import com.google.android.gms.internal.ads.C1335wc;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC1023p6;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class P extends O {
    @Override // Q1.O
    public final boolean b(Activity activity, Configuration configuration) {
        boolean isInMultiWindowMode;
        C0937n6 c0937n6 = AbstractC1066q6.g4;
        O1.r rVar = O1.r.d;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p62 = rVar.c;
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n6)).booleanValue()) {
            return false;
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.i4)).booleanValue()) {
            isInMultiWindowMode = activity.isInMultiWindowMode();
            return isInMultiWindowMode;
        }
        C1335wc c1335wc = C0081p.f1374f.f1375a;
        int l4 = C1335wc.l(activity, configuration.screenHeightDp);
        int i4 = C1335wc.i(activity.getResources().getDisplayMetrics(), configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        N n4 = N1.n.f1204A.c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i5 = displayMetrics.heightPixels;
        int i6 = displayMetrics.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int intValue = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p62.a(AbstractC1066q6.e4)).intValue() * ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d));
        return Math.abs(i5 - (l4 + dimensionPixelSize)) > intValue || Math.abs(i6 - i4) > intValue;
    }
}
