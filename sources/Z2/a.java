package Z2;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import j.C1721c;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2301a = {R.attr.theme, com.duracodefactory.logiccircuitsimulatorpro.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2302b = {com.duracodefactory.logiccircuitsimulatorpro.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i4, int i5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2302b, i4, i5);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z4 = (context instanceof C1721c) && ((C1721c) context).f13274a == resourceId;
        if (resourceId == 0 || z4) {
            return context;
        }
        C1721c c1721c = new C1721c(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f2301a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c1721c.getTheme().applyStyle(resourceId2, true);
        }
        return c1721c;
    }
}
