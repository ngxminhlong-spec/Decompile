package H;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f810b;

    /* renamed from: a, reason: collision with root package name */
    public final W f811a;

    static {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            f810b = V.f806s;
        } else if (i4 >= 30) {
            f810b = T.f805r;
        } else {
            f810b = W.f807b;
        }
    }

    public a0() {
        this.f811a = new W(this);
    }

    public a0(WindowInsets windowInsets) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            this.f811a = new V(this, windowInsets);
            return;
        }
        if (i4 >= 31) {
            this.f811a = new U(this, windowInsets);
            return;
        }
        if (i4 >= 30) {
            this.f811a = new T(this, windowInsets);
            return;
        }
        if (i4 >= 29) {
            this.f811a = new Q(this, windowInsets);
        } else if (i4 >= 28) {
            this.f811a = new P(this, windowInsets);
        } else {
            this.f811a = new O(this, windowInsets);
        }
    }

    public static a0 d(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        a0 a0Var = new a0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = A.f779a;
            a0 a4 = AbstractC0045u.a(view);
            W w2 = a0Var.f811a;
            w2.o(a4);
            w2.d(view.getRootView());
            w2.q(view.getWindowSystemUiVisibility());
        }
        return a0Var;
    }

    public final int a() {
        return this.f811a.j().d;
    }

    public final int b() {
        return this.f811a.j().f2b;
    }

    public final WindowInsets c() {
        W w2 = this.f811a;
        if (w2 instanceof N) {
            return ((N) w2).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return Objects.equals(this.f811a, ((a0) obj).f811a);
        }
        return false;
    }

    public final int hashCode() {
        W w2 = this.f811a;
        if (w2 == null) {
            return 0;
        }
        return w2.hashCode();
    }
}
