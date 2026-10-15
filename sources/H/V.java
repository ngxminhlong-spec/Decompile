package H;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class V extends U {

    /* renamed from: s, reason: collision with root package name */
    public static final a0 f806s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f806s = a0.d(windowInsets, null);
    }

    public V(a0 a0Var, WindowInsets windowInsets) {
        super(a0Var, windowInsets);
    }

    @Override // H.T, H.N, H.W
    public A.d f(int i4) {
        Insets insets;
        insets = this.c.getInsets(Z.a(i4));
        return A.d.b(insets);
    }
}
