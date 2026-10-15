package m;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.play_billing.B;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1803c extends B {

    /* renamed from: h, reason: collision with root package name */
    public final Object f13972h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final ExecutorService f13973i = Executors.newFixedThreadPool(4, new ThreadFactoryC1802b(0));

    /* renamed from: j, reason: collision with root package name */
    public volatile Handler f13974j;

    public static Handler j0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return B.b.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
