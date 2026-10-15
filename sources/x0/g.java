package x0;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15213a = n0.n.h("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z4) {
        String str = f15213a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z4 ? 1 : 2, 1);
            n0.n.d().a(str, cls.getName() + " " + (z4 ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e4) {
            n0.n.d().a(str, n0.a.i(cls.getName(), " could not be ", z4 ? "enabled" : "disabled"), e4);
        }
    }
}
