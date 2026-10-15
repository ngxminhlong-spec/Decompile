package H;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: H.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0045u {
    public static a0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        a0 d = a0.d(rootWindowInsets, null);
        W w2 = d.f811a;
        w2.o(d);
        w2.d(view.getRootView());
        return d;
    }

    public static void b(View view, int i4, int i5) {
        view.setScrollIndicators(i4, i5);
    }
}
