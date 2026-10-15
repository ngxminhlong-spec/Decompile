package H;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class N extends W {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f792i;

    /* renamed from: j, reason: collision with root package name */
    public static Method f793j;

    /* renamed from: k, reason: collision with root package name */
    public static Class f794k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f795l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f796m;
    public final WindowInsets c;
    public A.d[] d;

    /* renamed from: e, reason: collision with root package name */
    public A.d f797e;

    /* renamed from: f, reason: collision with root package name */
    public a0 f798f;

    /* renamed from: g, reason: collision with root package name */
    public A.d f799g;

    /* renamed from: h, reason: collision with root package name */
    public int f800h;

    public N(a0 a0Var, WindowInsets windowInsets) {
        super(a0Var);
        this.f797e = null;
        this.c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private A.d r(int i4, boolean z4) {
        A.d dVar = A.d.f0e;
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i4 & i5) != 0) {
                A.d s4 = s(i5, z4);
                dVar = A.d.a(Math.max(dVar.f1a, s4.f1a), Math.max(dVar.f2b, s4.f2b), Math.max(dVar.c, s4.c), Math.max(dVar.d, s4.d));
            }
        }
        return dVar;
    }

    private A.d t() {
        a0 a0Var = this.f798f;
        return a0Var != null ? a0Var.f811a.h() : A.d.f0e;
    }

    private A.d u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f792i) {
            v();
        }
        Method method = f793j;
        if (method != null && f794k != null && f795l != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f795l.get(f796m.get(invoke));
                if (rect != null) {
                    return A.d.a(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e4) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            f793j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f794k = cls;
            f795l = cls.getDeclaredField("mVisibleInsets");
            f796m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f795l.setAccessible(true);
            f796m.setAccessible(true);
        } catch (ReflectiveOperationException e4) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
        }
        f792i = true;
    }

    public static boolean x(int i4, int i5) {
        return (i4 & 6) == (i5 & 6);
    }

    @Override // H.W
    public void d(View view) {
        A.d u2 = u(view);
        if (u2 == null) {
            u2 = A.d.f0e;
        }
        w(u2);
    }

    @Override // H.W
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        N n4 = (N) obj;
        return Objects.equals(this.f799g, n4.f799g) && x(this.f800h, n4.f800h);
    }

    @Override // H.W
    public A.d f(int i4) {
        return r(i4, false);
    }

    @Override // H.W
    public final A.d j() {
        if (this.f797e == null) {
            WindowInsets windowInsets = this.c;
            this.f797e = A.d.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f797e;
    }

    @Override // H.W
    public boolean m() {
        return this.c.isRound();
    }

    @Override // H.W
    public void n(A.d[] dVarArr) {
        this.d = dVarArr;
    }

    @Override // H.W
    public void o(a0 a0Var) {
        this.f798f = a0Var;
    }

    @Override // H.W
    public void q(int i4) {
        this.f800h = i4;
    }

    public A.d s(int i4, boolean z4) {
        A.d h4;
        int i5;
        A.d dVar = A.d.f0e;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 8) {
                    A.d[] dVarArr = this.d;
                    h4 = dVarArr != null ? dVarArr[3] : null;
                    if (h4 != null) {
                        return h4;
                    }
                    A.d j4 = j();
                    A.d t4 = t();
                    int i6 = j4.d;
                    if (i6 > t4.d) {
                        return A.d.a(0, 0, 0, i6);
                    }
                    A.d dVar2 = this.f799g;
                    if (dVar2 != null && !dVar2.equals(dVar) && (i5 = this.f799g.d) > t4.d) {
                        return A.d.a(0, 0, 0, i5);
                    }
                } else {
                    if (i4 == 16) {
                        return i();
                    }
                    if (i4 == 32) {
                        return g();
                    }
                    if (i4 == 64) {
                        return k();
                    }
                    if (i4 == 128) {
                        a0 a0Var = this.f798f;
                        C0029d e4 = a0Var != null ? a0Var.f811a.e() : e();
                        if (e4 != null) {
                            int i7 = Build.VERSION.SDK_INT;
                            return A.d.a(i7 >= 28 ? B.b.g(e4.f820a) : 0, i7 >= 28 ? B.b.i(e4.f820a) : 0, i7 >= 28 ? B.b.h(e4.f820a) : 0, i7 >= 28 ? B.b.f(e4.f820a) : 0);
                        }
                    }
                }
            } else {
                if (z4) {
                    A.d t5 = t();
                    A.d h5 = h();
                    return A.d.a(Math.max(t5.f1a, h5.f1a), 0, Math.max(t5.c, h5.c), Math.max(t5.d, h5.d));
                }
                if ((this.f800h & 2) == 0) {
                    A.d j5 = j();
                    a0 a0Var2 = this.f798f;
                    h4 = a0Var2 != null ? a0Var2.f811a.h() : null;
                    int i8 = j5.d;
                    if (h4 != null) {
                        i8 = Math.min(i8, h4.d);
                    }
                    return A.d.a(j5.f1a, 0, j5.c, i8);
                }
            }
        } else {
            if (z4) {
                return A.d.a(0, Math.max(t().f2b, j().f2b), 0, 0);
            }
            if ((this.f800h & 4) == 0) {
                return A.d.a(0, j().f2b, 0, 0);
            }
        }
        return dVar;
    }

    public void w(A.d dVar) {
        this.f799g = dVar;
    }
}
