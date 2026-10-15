package H;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class T extends Q {

    /* renamed from: r, reason: collision with root package name */
    public static final a0 f805r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f805r = a0.d(windowInsets, null);
    }

    public T(a0 a0Var, WindowInsets windowInsets) {
        super(a0Var, windowInsets);
    }

    @Override // H.N, H.W
    public final void d(View view) {
    }

    @Override // H.N, H.W
    public A.d f(int i4) {
        Insets insets;
        insets = this.c.getInsets(X.a(i4));
        return A.d.b(insets);
    }
}
