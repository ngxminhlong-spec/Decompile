package q1;

import android.app.Activity;
import android.content.SharedPreferences;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import d3.AbstractC1654b;
import java.util.ArrayList;
import java.util.Date;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: q1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1959n {
    public static int __d;

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f14700a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f14701b;
    public static Boolean c;
    public static Integer d;

    /* renamed from: e, reason: collision with root package name */
    public static Date f14702e;

    /* renamed from: f, reason: collision with root package name */
    public static final ArrayList f14703f = new ArrayList();

    public static Date a(MainActivity mainActivity) {
        Date date = f14702e;
        if (date != null) {
            return date;
        }
        Date date2 = new Date(mainActivity.getPreferences(0).getLong("free_trial_start_date", new Date().getTime()));
        f14702e = date2;
        return date2;
    }

    public static boolean b(Activity activity) {
        Boolean bool = f14701b;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(activity.getPreferences(0).getBoolean("is_hard_premium", false));
        f14701b = valueOf;
        return valueOf.booleanValue();
    }

    public static boolean c(Activity activity) {
        Boolean bool = f14700a;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(activity.getPreferences(0).getBoolean("is_old_user", true));
        f14700a = valueOf;
        return valueOf.booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* JADX WARN: Unreachable blocks removed: 6, instructions: 12 */
    public static boolean d(Activity activity) {
        return __d;
    }

    public static void e() {
        ArrayList arrayList = f14703f;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((InterfaceC1958m) obj).c();
        }
    }

    public static void f(MainActivity mainActivity, String str) {
        if (str != null && AbstractC1956k.f14698a.contains(str)) {
            SharedPreferences.Editor edit = mainActivity.getPreferences(0).edit();
            edit.putBoolean("is_hard_premium", true);
            edit.apply();
            f14701b = Boolean.TRUE;
            ArrayList arrayList = f14703f;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((InterfaceC1958m) obj).g();
            }
            SharedPreferences.Editor edit2 = mainActivity.getPreferences(0).edit();
            edit2.putBoolean("advanced_logging_enabled", false);
            edit2.apply();
        }
    }

    public static void g(MainActivity mainActivity, boolean z4) {
        int i4 = 0;
        if (z4) {
            SharedPreferences.Editor edit = mainActivity.getPreferences(0).edit();
            edit.putInt("billing_result", 0);
            edit.apply();
            d = 0;
        }
        SharedPreferences.Editor edit2 = mainActivity.getPreferences(0).edit();
        edit2.putBoolean("is_premium", z4);
        edit2.apply();
        if (z4 && !c.booleanValue()) {
            AbstractC1654b.a(mainActivity, -AbstractC1654b.x(mainActivity));
        }
        c = Boolean.valueOf(z4);
        ArrayList arrayList = f14703f;
        int size = arrayList.size();
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((InterfaceC1958m) obj).g();
        }
    }
}
