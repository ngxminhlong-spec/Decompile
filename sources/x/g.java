package x;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15196a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f15197b;

    static {
        new HashSet();
    }

    public g(Context context) {
        this.f15196a = context;
        this.f15197b = (NotificationManager) context.getSystemService("notification");
    }

    public final boolean a() {
        Method method;
        Integer num;
        if (Build.VERSION.SDK_INT >= 24) {
            return D.b.a(this.f15197b);
        }
        Context context = this.f15196a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i4 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.getClass();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i4), packageName)).intValue() == 0;
    }
}
