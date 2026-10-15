package H;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: H.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0044t {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static ColorStateList b(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode c(View view) {
        return view.getBackgroundTintMode();
    }

    public static float d(View view) {
        return view.getElevation();
    }

    public static String e(View view) {
        return view.getTransitionName();
    }

    public static float f(View view) {
        return view.getZ();
    }

    public static boolean g(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void h(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void i(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void j(View view, float f4) {
        view.setElevation(f4);
    }

    public static void k(View view, InterfaceC0035j interfaceC0035j) {
        ViewOnApplyWindowInsetsListenerC0043s viewOnApplyWindowInsetsListenerC0043s = interfaceC0035j != null ? new ViewOnApplyWindowInsetsListenerC0043s(view, interfaceC0035j) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, viewOnApplyWindowInsetsListenerC0043s);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (viewOnApplyWindowInsetsListenerC0043s != null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0043s);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void l(View view, String str) {
        view.setTransitionName(str);
    }

    public static void m(View view) {
        view.stopNestedScroll();
    }
}
