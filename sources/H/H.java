package H;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class H extends M {

    /* renamed from: b, reason: collision with root package name */
    public static Field f788b;
    public static boolean c;
    public static Constructor d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f789e;

    /* renamed from: a, reason: collision with root package name */
    public WindowInsets f790a;

    public H() {
        this.f790a = d();
    }

    public H(a0 a0Var) {
        super(a0Var);
        this.f790a = a0Var.c();
    }

    private static WindowInsets d() {
        if (!c) {
            try {
                f788b = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e4);
            }
            c = true;
        }
        Field field = f788b;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e5);
            }
        }
        if (!f789e) {
            try {
                d = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e6);
            }
            f789e = true;
        }
        Constructor constructor = d;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e7);
            }
        }
        return null;
    }

    @Override // H.M
    public a0 b() {
        a();
        a0 d4 = a0.d(this.f790a, null);
        W w2 = d4.f811a;
        w2.n(null);
        w2.p(null);
        return d4;
    }

    @Override // H.M
    public void c(A.d dVar) {
        WindowInsets windowInsets = this.f790a;
        if (windowInsets != null) {
            this.f790a = windowInsets.replaceSystemWindowInsets(dVar.f1a, dVar.f2b, dVar.c, dVar.d);
        }
    }
}
