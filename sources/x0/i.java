package x0;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15214a = n0.n.h("ProcessUtils");

    public static boolean a(Context context, n0.c cVar) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            str = Application.getProcessName();
        } else {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, i.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, null);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th) {
                n0.n.d().a(f15214a, "Unable to check ActivityThread for processName", th);
            }
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid) {
                        str = runningAppProcessInfo.processName;
                        break;
                    }
                }
            }
            str = null;
        }
        cVar.getClass();
        return !TextUtils.isEmpty(null) ? TextUtils.equals(str, null) : TextUtils.equals(str, context.getApplicationInfo().processName);
    }
}
