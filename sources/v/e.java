package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import u.AbstractC2011a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC2018b f14996a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14997b;
    public final int c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14998e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14999f;

    /* renamed from: g, reason: collision with root package name */
    public int f15000g;

    /* renamed from: h, reason: collision with root package name */
    public int f15001h;

    /* renamed from: i, reason: collision with root package name */
    public int f15002i;

    /* renamed from: j, reason: collision with root package name */
    public int f15003j;

    /* renamed from: k, reason: collision with root package name */
    public View f15004k;

    /* renamed from: l, reason: collision with root package name */
    public View f15005l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15006m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15007n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15008o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f15009p;

    public e() {
        super(-2, -2);
        this.f14997b = false;
        this.c = 0;
        this.d = 0;
        this.f14998e = -1;
        this.f14999f = -1;
        this.f15000g = 0;
        this.f15001h = 0;
        this.f15009p = new Rect();
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC2018b abstractC2018b;
        this.f14997b = false;
        this.c = 0;
        this.d = 0;
        this.f14998e = -1;
        this.f14999f = -1;
        this.f15000g = 0;
        this.f15001h = 0;
        this.f15009p = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2011a.f14967b);
        this.c = obtainStyledAttributes.getInteger(0, 0);
        this.f14999f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f14998e = obtainStyledAttributes.getInteger(6, -1);
        this.f15000g = obtainStyledAttributes.getInt(5, 0);
        this.f15001h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f14997b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f2651H;
            if (TextUtils.isEmpty(string)) {
                abstractC2018b = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f2651H;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f2653J;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f2652I);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC2018b = (AbstractC2018b) constructor.newInstance(context, attributeSet);
                } catch (Exception e4) {
                    throw new RuntimeException(n0.a.k("Could not inflate Behavior subclass ", string), e4);
                }
            }
            this.f14996a = abstractC2018b;
        }
        obtainStyledAttributes.recycle();
        AbstractC2018b abstractC2018b2 = this.f14996a;
        if (abstractC2018b2 != null) {
            abstractC2018b2.c(this);
        }
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f14997b = false;
        this.c = 0;
        this.d = 0;
        this.f14998e = -1;
        this.f14999f = -1;
        this.f15000g = 0;
        this.f15001h = 0;
        this.f15009p = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f14997b = false;
        this.c = 0;
        this.d = 0;
        this.f14998e = -1;
        this.f14999f = -1;
        this.f15000g = 0;
        this.f15001h = 0;
        this.f15009p = new Rect();
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f14997b = false;
        this.c = 0;
        this.d = 0;
        this.f14998e = -1;
        this.f14999f = -1;
        this.f15000g = 0;
        this.f15001h = 0;
        this.f15009p = new Rect();
    }

    public final boolean a(int i4) {
        if (i4 == 0) {
            return this.f15006m;
        }
        if (i4 != 1) {
            return false;
        }
        return this.f15007n;
    }

    public final void b(AbstractC2018b abstractC2018b) {
        AbstractC2018b abstractC2018b2 = this.f14996a;
        if (abstractC2018b2 != abstractC2018b) {
            if (abstractC2018b2 != null) {
                abstractC2018b2.e();
            }
            this.f14996a = abstractC2018b;
            this.f14997b = true;
            if (abstractC2018b != null) {
                abstractC2018b.c(this);
            }
        }
    }
}
