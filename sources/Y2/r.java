package Y2;

import P2.w;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import l.C1764e0;
import l.C1781n;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class r extends C1781n {

    /* renamed from: r, reason: collision with root package name */
    public final C1764e0 f2211r;

    /* renamed from: s, reason: collision with root package name */
    public final AccessibilityManager f2212s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f2213t;

    public r(Context context, AttributeSet attributeSet) {
        super(Z2.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f2213t = new Rect();
        Context context2 = getContext();
        TypedArray d = w.d(context2, attributeSet, B2.a.f144j, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (d.hasValue(0) && d.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f2212s = (AccessibilityManager) context2.getSystemService("accessibility");
        C1764e0 c1764e0 = new C1764e0(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f2211r = c1764e0;
        c1764e0.f13739L = true;
        c1764e0.f13740M.setFocusable(true);
        c1764e0.f13730C = this;
        c1764e0.f13740M.setInputMethodMode(2);
        c1764e0.p(getAdapter());
        c1764e0.f13731D = new q(0, this);
        d.recycle();
    }

    public static void a(r rVar, Object obj) {
        rVar.setText(rVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b4 = b();
        return (b4 == null || !b4.f12482O) ? super.getHint() : b4.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b4 = b();
        if (b4 != null && b4.f12482O && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b4 = b();
            int i6 = 0;
            if (adapter != null && b4 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C1764e0 c1764e0 = this.f2211r;
                int min = Math.min(adapter.getCount(), Math.max(0, !c1764e0.f13740M.isShowing() ? -1 : c1764e0.f13743q.getSelectedItemPosition()) + 15);
                View view = null;
                int i7 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i6) {
                        view = null;
                        i6 = itemViewType;
                    }
                    view = adapter.getView(max, view, b4);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i7 = Math.max(i7, view.getMeasuredWidth());
                }
                Drawable background = c1764e0.f13740M.getBackground();
                if (background != null) {
                    Rect rect = this.f2213t;
                    background.getPadding(rect);
                    i7 += rect.left + rect.right;
                }
                i6 = b4.getEndIconView().getMeasuredWidth() + i7;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i6), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t4) {
        super.setAdapter(t4);
        this.f2211r.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager;
        if (getInputType() == 0 && (accessibilityManager = this.f2212s) != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f2211r.e();
        } else {
            super.showDropDown();
        }
    }
}
