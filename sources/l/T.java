package l;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13674a = 0;

    static {
        new Rect();
        try {
            Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Drawable drawable) {
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof B.d) {
                ((B.e) ((B.d) drawable)).getClass();
                return a(null);
            }
            if (drawable instanceof U) {
                return a(((U) drawable).f13675o);
            }
            if (drawable instanceof ScaleDrawable) {
                return a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!a(drawable2)) {
                return false;
            }
        }
        return true;
    }

    public static PorterDuff.Mode b(int i4, PorterDuff.Mode mode) {
        if (i4 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i4) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
