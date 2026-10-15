package androidx.appcompat.widget;

import C0.ViewOnClickListenerC0022w;
import H.A;
import H.F;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import e.AbstractC1657a;
import g.AbstractC1678a;
import j.AbstractC1719a;
import java.util.WeakHashMap;
import k.InterfaceC1741B;
import k.m;
import l.C1763e;
import l.C1773j;
import l.M0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: A */
    public LinearLayout f2488A;

    /* renamed from: B */
    public TextView f2489B;

    /* renamed from: C */
    public TextView f2490C;

    /* renamed from: D */
    public final int f2491D;

    /* renamed from: E */
    public final int f2492E;

    /* renamed from: F */
    public boolean f2493F;

    /* renamed from: G */
    public final int f2494G;

    /* renamed from: o */
    public final N2.b f2495o;

    /* renamed from: p */
    public final Context f2496p;

    /* renamed from: q */
    public ActionMenuView f2497q;

    /* renamed from: r */
    public C1773j f2498r;

    /* renamed from: s */
    public int f2499s;

    /* renamed from: t */
    public F f2500t;

    /* renamed from: u */
    public boolean f2501u;

    /* renamed from: v */
    public boolean f2502v;

    /* renamed from: w */
    public CharSequence f2503w;

    /* renamed from: x */
    public CharSequence f2504x;
    public View y;

    /* renamed from: z */
    public View f2505z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f2495o = new N2.b(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f2496p = context;
        } else {
            this.f2496p = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1657a.d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : AbstractC1678a.a(context, resourceId);
        WeakHashMap weakHashMap = A.f779a;
        setBackground(drawable);
        this.f2491D = obtainStyledAttributes.getResourceId(5, 0);
        this.f2492E = obtainStyledAttributes.getResourceId(4, 0);
        this.f2499s = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f2494G = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void a(ActionBarContextView actionBarContextView) {
        super.setVisibility(0);
    }

    public static /* synthetic */ void b(ActionBarContextView actionBarContextView, int i4) {
        super.setVisibility(i4);
    }

    public static int e(View view, int i4, int i5) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i5);
        return Math.max(0, i4 - view.getMeasuredWidth());
    }

    public static int f(int i4, int i5, int i6, View view, boolean z4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = ((i6 - measuredHeight) / 2) + i5;
        if (z4) {
            view.layout(i4 - measuredWidth, i7, i4, measuredHeight + i7);
        } else {
            view.layout(i4, i7, i4 + measuredWidth, measuredHeight + i7);
        }
        return z4 ? -measuredWidth : measuredWidth;
    }

    public final void c(AbstractC1719a abstractC1719a) {
        View view = this.y;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f2494G, (ViewGroup) this, false);
            this.y = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.y);
        }
        this.y.findViewById(R.id.action_mode_close_button).setOnClickListener(new ViewOnClickListenerC0022w(14, abstractC1719a));
        m c = abstractC1719a.c();
        C1773j c1773j = this.f2498r;
        if (c1773j != null) {
            c1773j.e();
            C1763e c1763e = c1773j.f13773I;
            if (c1763e != null && c1763e.b()) {
                c1763e.f13494i.dismiss();
            }
        }
        C1773j c1773j2 = new C1773j(getContext());
        this.f2498r = c1773j2;
        c1773j2.f13765A = true;
        c1773j2.f13766B = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c.b(this.f2498r, this.f2496p);
        C1773j c1773j3 = this.f2498r;
        InterfaceC1741B interfaceC1741B = c1773j3.f13785v;
        if (interfaceC1741B == null) {
            InterfaceC1741B interfaceC1741B2 = (InterfaceC1741B) c1773j3.f13781r.inflate(c1773j3.f13783t, (ViewGroup) this, false);
            c1773j3.f13785v = interfaceC1741B2;
            interfaceC1741B2.c(c1773j3.f13780q);
            c1773j3.h();
        }
        InterfaceC1741B interfaceC1741B3 = c1773j3.f13785v;
        if (interfaceC1741B != interfaceC1741B3) {
            ((ActionMenuView) interfaceC1741B3).setPresenter(c1773j3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC1741B3;
        this.f2497q = actionMenuView;
        WeakHashMap weakHashMap = A.f779a;
        actionMenuView.setBackground(null);
        addView(this.f2497q, layoutParams);
    }

    public final void d() {
        if (this.f2488A == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2488A = linearLayout;
            this.f2489B = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f2490C = (TextView) this.f2488A.findViewById(R.id.action_bar_subtitle);
            int i4 = this.f2491D;
            if (i4 != 0) {
                this.f2489B.setTextAppearance(getContext(), i4);
            }
            int i5 = this.f2492E;
            if (i5 != 0) {
                this.f2490C.setTextAppearance(getContext(), i5);
            }
        }
        this.f2489B.setText(this.f2503w);
        this.f2490C.setText(this.f2504x);
        boolean isEmpty = TextUtils.isEmpty(this.f2503w);
        boolean isEmpty2 = TextUtils.isEmpty(this.f2504x);
        this.f2490C.setVisibility(!isEmpty2 ? 0 : 8);
        this.f2488A.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f2488A.getParent() == null) {
            addView(this.f2488A);
        }
    }

    @Override // android.view.View
    /* renamed from: g */
    public final void setVisibility(int i4) {
        if (i4 != getVisibility()) {
            F f4 = this.f2500t;
            if (f4 != null) {
                f4.b();
            }
            super.setVisibility(i4);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f2500t != null ? this.f2495o.f1229b : getVisibility();
    }

    public int getContentHeight() {
        return this.f2499s;
    }

    public CharSequence getSubtitle() {
        return this.f2504x;
    }

    public CharSequence getTitle() {
        return this.f2503w;
    }

    public final F h(int i4, long j4) {
        F f4 = this.f2500t;
        if (f4 != null) {
            f4.b();
        }
        N2.b bVar = this.f2495o;
        if (i4 != 0) {
            F a4 = A.a(this);
            a4.a(0.0f);
            a4.c(j4);
            ((ActionBarContextView) bVar.c).f2500t = a4;
            bVar.f1229b = i4;
            a4.d(bVar);
            return a4;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        F a5 = A.a(this);
        a5.a(1.0f);
        a5.c(j4);
        ((ActionBarContextView) bVar.c).f2500t = a5;
        bVar.f1229b = i4;
        a5.d(bVar);
        return a5;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC1657a.f12635a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C1773j c1773j = this.f2498r;
        if (c1773j != null) {
            Configuration configuration2 = c1773j.f13779p.getResources().getConfiguration();
            int i4 = configuration2.screenWidthDp;
            int i5 = configuration2.screenHeightDp;
            c1773j.f13769E = (configuration2.smallestScreenWidthDp > 600 || i4 > 600 || (i4 > 960 && i5 > 720) || (i4 > 720 && i5 > 960)) ? 5 : (i4 >= 500 || (i4 > 640 && i5 > 480) || (i4 > 480 && i5 > 640)) ? 4 : i4 >= 360 ? 3 : 2;
            m mVar = c1773j.f13780q;
            if (mVar != null) {
                mVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1773j c1773j = this.f2498r;
        if (c1773j != null) {
            c1773j.e();
            C1763e c1763e = this.f2498r.f13773I;
            if (c1763e == null || !c1763e.b()) {
                return;
            }
            c1763e.f13494i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2502v = false;
        }
        if (!this.f2502v) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2502v = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f2502v = false;
        return true;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f2503w);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        boolean a4 = M0.a(this);
        int paddingRight = a4 ? (i6 - i4) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
        View view = this.y;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.y.getLayoutParams();
            int i8 = a4 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i9 = a4 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i10 = a4 ? paddingRight - i8 : paddingRight + i8;
            int f4 = f(i10, paddingTop, paddingTop2, this.y, a4) + i10;
            paddingRight = a4 ? f4 - i9 : f4 + i9;
        }
        LinearLayout linearLayout = this.f2488A;
        if (linearLayout != null && this.f2505z == null && linearLayout.getVisibility() != 8) {
            paddingRight += f(paddingRight, paddingTop, paddingTop2, this.f2488A, a4);
        }
        View view2 = this.f2505z;
        if (view2 != null) {
            f(paddingRight, paddingTop, paddingTop2, view2, a4);
        }
        int paddingLeft = a4 ? getPaddingLeft() : (i6 - i4) - getPaddingRight();
        ActionMenuView actionMenuView = this.f2497q;
        if (actionMenuView != null) {
            f(paddingLeft, paddingTop, paddingTop2, actionMenuView, !a4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i5) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i4);
        int i6 = this.f2499s;
        if (i6 <= 0) {
            i6 = View.MeasureSpec.getSize(i5);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i7 = i6 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
        View view = this.y;
        if (view != null) {
            int e4 = e(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.y.getLayoutParams();
            paddingLeft = e4 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f2497q;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = e(this.f2497q, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f2488A;
        if (linearLayout != null && this.f2505z == null) {
            if (this.f2493F) {
                this.f2488A.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f2488A.getMeasuredWidth();
                boolean z4 = measuredWidth <= paddingLeft;
                if (z4) {
                    paddingLeft -= measuredWidth;
                }
                this.f2488A.setVisibility(z4 ? 0 : 8);
            } else {
                paddingLeft = e(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f2505z;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i8 = layoutParams.width;
            int i9 = i8 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i8 >= 0) {
                paddingLeft = Math.min(i8, paddingLeft);
            }
            int i10 = layoutParams.height;
            int i11 = i10 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i10 >= 0) {
                i7 = Math.min(i10, i7);
            }
            this.f2505z.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i9), View.MeasureSpec.makeMeasureSpec(i7, i11));
        }
        if (this.f2499s > 0) {
            setMeasuredDimension(size, i6);
            return;
        }
        int childCount = getChildCount();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            int measuredHeight = getChildAt(i13).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i12) {
                i12 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i12);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2501u = false;
        }
        if (!this.f2501u) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2501u = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f2501u = false;
        return true;
    }

    public void setContentHeight(int i4) {
        this.f2499s = i4;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f2505z;
        if (view2 != null) {
            removeView(view2);
        }
        this.f2505z = view;
        if (view != null && (linearLayout = this.f2488A) != null) {
            removeView(linearLayout);
            this.f2488A = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2504x = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2503w = charSequence;
        d();
    }

    public void setTitleOptional(boolean z4) {
        if (z4 != this.f2493F) {
            requestLayout();
        }
        this.f2493F = z4;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
