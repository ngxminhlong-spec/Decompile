package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import l.C1781n;
import l.C1782o;
import l.C1783p;
import l.C1790x;
import l.M;
import r.e;
import r.i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class AppCompatViewInflater {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f2448b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final String[] d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e, reason: collision with root package name */
    public static final e f2449e = new i(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f2450a = new Object[2];

    public C1781n a(Context context, AttributeSet attributeSet) {
        return new C1781n(context, attributeSet);
    }

    public C1782o b(Context context, AttributeSet attributeSet) {
        return new C1782o(context, attributeSet, com.duracodefactory.logiccircuitsimulatorpro.R.attr.buttonStyle);
    }

    public C1783p c(Context context, AttributeSet attributeSet) {
        return new C1783p(context, attributeSet, com.duracodefactory.logiccircuitsimulatorpro.R.attr.checkboxStyle);
    }

    public C1790x d(Context context, AttributeSet attributeSet) {
        return new C1790x(context, attributeSet);
    }

    public M e(Context context, AttributeSet attributeSet) {
        return new M(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        e eVar = f2449e;
        Constructor constructor = (Constructor) eVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            constructor = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2448b);
            eVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2450a);
    }
}
