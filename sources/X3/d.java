package X3;

import S3.e;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class d {
    private static volatile Choreographer choreographer;

    static {
        Object h4;
        try {
            h4 = new c(a(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            h4 = AbstractC1806a.h(th);
        }
        if (h4 instanceof J3.d) {
            h4 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        e.c(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }
}
