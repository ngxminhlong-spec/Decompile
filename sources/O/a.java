package O;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z4 = false;
        boolean z5 = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.f2728K = windowInsets;
        drawerLayout.f2729L = z5;
        if (!z5 && drawerLayout.getBackground() == null) {
            z4 = true;
        }
        drawerLayout.setWillNotDraw(z4);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
