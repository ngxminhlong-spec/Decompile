package t2;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f14935a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public static final o3.i f14936b = new o3.i();

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Method must be call on main thread.");
        }
    }
}
