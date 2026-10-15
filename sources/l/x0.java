package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import g.AbstractC1678a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f13859a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f13860b = {-16842910};
    public static final int[] c = {R.attr.state_focused};
    public static final int[] d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f13861e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f13862f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f13863g = new int[1];

    public static int a(Context context, int i4) {
        ColorStateList c2 = c(context, i4);
        if (c2 != null && c2.isStateful()) {
            return c2.getColorForState(f13860b, c2.getDefaultColor());
        }
        ThreadLocal threadLocal = f13859a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f4 = typedValue.getFloat();
        return A.a.d(b(context, i4), Math.round(Color.alpha(r4) * f4));
    }

    public static int b(Context context, int i4) {
        int[] iArr = f13863g;
        iArr[0] = i4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList c(Context context, int i4) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f13863g;
        iArr[0] = i4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                Object obj = AbstractC1678a.f12977a;
                colorStateList = context.getColorStateList(resourceId);
                if (colorStateList != null) {
                    return colorStateList;
                }
            }
            colorStateList = obtainStyledAttributes.getColorStateList(0);
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
