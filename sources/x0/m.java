package x0;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15226a = n0.n.h("WakeLocks");

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f15227b = new WeakHashMap();

    public static PowerManager.WakeLock a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String concat = "WorkManager: ".concat(str);
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, concat);
        WeakHashMap weakHashMap = f15227b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, concat);
        }
        return newWakeLock;
    }
}
