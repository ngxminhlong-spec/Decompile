package Y2;

import C0.ViewOnClickListenerC0022w;
import H.A;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.play_billing.B;
import com.google.android.material.textfield.TextInputLayout;
import g.AbstractC1678a;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class m extends n {
    public final a d;

    /* renamed from: e, reason: collision with root package name */
    public final b f2172e;

    /* renamed from: f, reason: collision with root package name */
    public final j f2173f;

    /* renamed from: g, reason: collision with root package name */
    public final c f2174g;

    /* renamed from: h, reason: collision with root package name */
    public final d f2175h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2176i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2177j;

    /* renamed from: k, reason: collision with root package name */
    public long f2178k;

    /* renamed from: l, reason: collision with root package name */
    public StateListDrawable f2179l;

    /* renamed from: m, reason: collision with root package name */
    public V2.g f2180m;

    /* renamed from: n, reason: collision with root package name */
    public AccessibilityManager f2181n;

    /* renamed from: o, reason: collision with root package name */
    public ValueAnimator f2182o;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f2183p;

    public m(TextInputLayout textInputLayout) {
        super(textInputLayout);
        int i4 = 1;
        this.d = new a(i4, this);
        this.f2172e = new b(i4, this);
        this.f2173f = new j(this, textInputLayout);
        this.f2174g = new c(this, 1);
        this.f2175h = new d(this, 1);
        this.f2176i = false;
        this.f2177j = false;
        this.f2178k = Long.MAX_VALUE;
    }

    public static AutoCompleteTextView d(m mVar, EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public static void e(m mVar, AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - mVar.f2178k;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            mVar.f2176i = false;
        }
        if (mVar.f2176i) {
            mVar.f2176i = false;
            return;
        }
        mVar.g(!mVar.f2177j);
        if (!mVar.f2177j) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    @Override // Y2.n
    public final void a() {
        Context context = this.f2185b;
        float dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        V2.g f4 = f(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        V2.g f5 = f(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f2180m = f4;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f2179l = stateListDrawable;
        stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, f4);
        this.f2179l.addState(new int[0], f5);
        Drawable a4 = AbstractC1678a.a(context, R.drawable.mtrl_dropdown_arrow);
        TextInputLayout textInputLayout = this.f2184a;
        textInputLayout.setEndIconDrawable(a4);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC0022w(9, this));
        LinkedHashSet linkedHashSet = textInputLayout.f12516p0;
        c cVar = this.f2174g;
        linkedHashSet.add(cVar);
        if (textInputLayout.f12521s != null) {
            cVar.a(textInputLayout);
        }
        textInputLayout.f12524t0.add(this.f2175h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = C2.a.f507a;
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.setDuration(67);
        ofFloat.addUpdateListener(new G2.a(1, this));
        this.f2183p = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(50);
        ofFloat2.addUpdateListener(new G2.a(1, this));
        this.f2182o = ofFloat2;
        ofFloat2.addListener(new E2.a(4, this));
        WeakHashMap weakHashMap = A.f779a;
        this.c.setImportantForAccessibility(2);
        this.f2181n = (AccessibilityManager) context.getSystemService("accessibility");
    }

    @Override // Y2.n
    public final boolean b(int i4) {
        return i4 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, V2.k] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, com.google.android.gms.internal.play_billing.B] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, com.google.android.gms.internal.play_billing.B] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, com.google.android.gms.internal.play_billing.B] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, com.google.android.gms.internal.play_billing.B] */
    public final V2.g f(float f4, float f5, float f6, int i4) {
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        int i5 = 0;
        V2.e eVar = new V2.e(i5);
        V2.e eVar2 = new V2.e(i5);
        V2.e eVar3 = new V2.e(i5);
        V2.e eVar4 = new V2.e(i5);
        V2.a aVar = new V2.a(f4);
        V2.a aVar2 = new V2.a(f4);
        V2.a aVar3 = new V2.a(f5);
        V2.a aVar4 = new V2.a(f5);
        ?? obj5 = new Object();
        obj5.f1903a = obj;
        obj5.f1904b = obj2;
        obj5.c = obj3;
        obj5.d = obj4;
        obj5.f1905e = aVar;
        obj5.f1906f = aVar2;
        obj5.f1907g = aVar4;
        obj5.f1908h = aVar3;
        obj5.f1909i = eVar;
        obj5.f1910j = eVar2;
        obj5.f1911k = eVar3;
        obj5.f1912l = eVar4;
        Paint paint = V2.g.f1869K;
        String simpleName = V2.g.class.getSimpleName();
        Context context = this.f2185b;
        int N = B.N(R.attr.colorSurface, context, simpleName);
        V2.g gVar = new V2.g();
        gVar.g(context);
        gVar.i(ColorStateList.valueOf(N));
        gVar.h(f6);
        gVar.setShapeAppearanceModel(obj5);
        V2.f fVar = gVar.f1880o;
        if (fVar.f1858g == null) {
            fVar.f1858g = new Rect();
        }
        gVar.f1880o.f1858g.set(0, i4, 0, i4);
        gVar.invalidateSelf();
        return gVar;
    }

    public final void g(boolean z4) {
        if (this.f2177j != z4) {
            this.f2177j = z4;
            this.f2183p.cancel();
            this.f2182o.start();
        }
    }
}
