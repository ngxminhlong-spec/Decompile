package androidx.appcompat.widget;

import C0.ViewOnClickListenerC0022w;
import H.A;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import e.AbstractC1657a;
import g.AbstractC1678a;
import g2.x;
import j.C1726h;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.m;
import k.o;
import k.p;
import l.B0;
import l.C0;
import l.C1773j;
import l.C1778l0;
import l.C1786t;
import l.D0;
import l.E0;
import l.F0;
import l.G0;
import l.M;
import l.M0;
import l.S;
import q2.e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public int f2599A;

    /* renamed from: B, reason: collision with root package name */
    public final int f2600B;

    /* renamed from: C, reason: collision with root package name */
    public final int f2601C;

    /* renamed from: D, reason: collision with root package name */
    public int f2602D;

    /* renamed from: E, reason: collision with root package name */
    public int f2603E;

    /* renamed from: F, reason: collision with root package name */
    public int f2604F;

    /* renamed from: G, reason: collision with root package name */
    public int f2605G;

    /* renamed from: H, reason: collision with root package name */
    public C1778l0 f2606H;

    /* renamed from: I, reason: collision with root package name */
    public int f2607I;

    /* renamed from: J, reason: collision with root package name */
    public int f2608J;

    /* renamed from: K, reason: collision with root package name */
    public final int f2609K;

    /* renamed from: L, reason: collision with root package name */
    public CharSequence f2610L;

    /* renamed from: M, reason: collision with root package name */
    public CharSequence f2611M;
    public ColorStateList N;

    /* renamed from: O, reason: collision with root package name */
    public ColorStateList f2612O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2613P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2614Q;

    /* renamed from: R, reason: collision with root package name */
    public final ArrayList f2615R;

    /* renamed from: S, reason: collision with root package name */
    public final ArrayList f2616S;

    /* renamed from: T, reason: collision with root package name */
    public final int[] f2617T;

    /* renamed from: U, reason: collision with root package name */
    public final o f2618U;

    /* renamed from: V, reason: collision with root package name */
    public G0 f2619V;

    /* renamed from: W, reason: collision with root package name */
    public C1773j f2620W;

    /* renamed from: a0, reason: collision with root package name */
    public B0 f2621a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f2622b0;

    /* renamed from: c0, reason: collision with root package name */
    public final x f2623c0;

    /* renamed from: o, reason: collision with root package name */
    public ActionMenuView f2624o;

    /* renamed from: p, reason: collision with root package name */
    public M f2625p;

    /* renamed from: q, reason: collision with root package name */
    public M f2626q;

    /* renamed from: r, reason: collision with root package name */
    public C1786t f2627r;

    /* renamed from: s, reason: collision with root package name */
    public AppCompatImageView f2628s;

    /* renamed from: t, reason: collision with root package name */
    public final Drawable f2629t;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f2630u;

    /* renamed from: v, reason: collision with root package name */
    public C1786t f2631v;

    /* renamed from: w, reason: collision with root package name */
    public View f2632w;

    /* renamed from: x, reason: collision with root package name */
    public Context f2633x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public int f2634z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f2609K = 8388627;
        this.f2615R = new ArrayList();
        this.f2616S = new ArrayList();
        this.f2617T = new int[2];
        this.f2618U = new o(2, this);
        this.f2623c0 = new x(3, this);
        e w2 = e.w(getContext(), attributeSet, AbstractC1657a.f12656x, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) w2.f14710q;
        this.f2634z = typedArray.getResourceId(28, 0);
        this.f2599A = typedArray.getResourceId(19, 0);
        this.f2609K = typedArray.getInteger(0, 8388627);
        this.f2600B = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f2605G = dimensionPixelOffset;
        this.f2604F = dimensionPixelOffset;
        this.f2603E = dimensionPixelOffset;
        this.f2602D = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f2602D = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f2603E = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f2604F = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f2605G = dimensionPixelOffset5;
        }
        this.f2601C = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        C1778l0 c1778l0 = this.f2606H;
        c1778l0.f13806h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c1778l0.f13803e = dimensionPixelSize;
            c1778l0.f13801a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c1778l0.f13804f = dimensionPixelSize2;
            c1778l0.f13802b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c1778l0.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f2607I = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f2608J = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f2629t = w2.p(4);
        this.f2630u = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f2633x = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable p3 = w2.p(16);
        if (p3 != null) {
            setNavigationIcon(p3);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable p4 = w2.p(11);
        if (p4 != null) {
            setLogo(p4);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(w2.o(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(w2.o(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        w2.y();
    }

    private MenuInflater getMenuInflater() {
        return new C1726h(getContext());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, l.C0] */
    public static C0 h() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f13588b = 0;
        marginLayoutParams.f13587a = 8388627;
        return marginLayoutParams;
    }

    public static C0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z4 = layoutParams instanceof C0;
        if (z4) {
            C0 c02 = (C0) layoutParams;
            C0 c03 = new C0(c02);
            c03.f13588b = 0;
            c03.f13588b = c02.f13588b;
            return c03;
        }
        if (z4) {
            C0 c04 = new C0((C0) layoutParams);
            c04.f13588b = 0;
            return c04;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C0 c05 = new C0(layoutParams);
            c05.f13588b = 0;
            return c05;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C0 c06 = new C0(marginLayoutParams);
        c06.f13588b = 0;
        ((ViewGroup.MarginLayoutParams) c06).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c06).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c06).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c06).bottomMargin = marginLayoutParams.bottomMargin;
        return c06;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i4, ArrayList arrayList) {
        WeakHashMap weakHashMap = A.f779a;
        boolean z4 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, getLayoutDirection());
        arrayList.clear();
        if (!z4) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                C0 c02 = (C0) childAt.getLayoutParams();
                if (c02.f13588b == 0 && r(childAt)) {
                    int i6 = c02.f13587a;
                    WeakHashMap weakHashMap2 = A.f779a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            View childAt2 = getChildAt(i7);
            C0 c03 = (C0) childAt2.getLayoutParams();
            if (c03.f13588b == 0 && r(childAt2)) {
                int i8 = c03.f13587a;
                WeakHashMap weakHashMap3 = A.f779a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i8, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0 h4 = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (C0) layoutParams;
        h4.f13588b = 1;
        if (!z4 || this.f2632w == null) {
            addView(view, h4);
        } else {
            view.setLayoutParams(h4);
            this.f2616S.add(view);
        }
    }

    public final void c() {
        if (this.f2631v == null) {
            C1786t c1786t = new C1786t(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f2631v = c1786t;
            c1786t.setImageDrawable(this.f2629t);
            this.f2631v.setContentDescription(this.f2630u);
            C0 h4 = h();
            h4.f13587a = (this.f2600B & 112) | 8388611;
            h4.f13588b = 2;
            this.f2631v.setLayoutParams(h4);
            this.f2631v.setOnClickListener(new ViewOnClickListenerC0022w(15, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.l0, java.lang.Object] */
    public final void d() {
        if (this.f2606H == null) {
            ?? obj = new Object();
            obj.f13801a = 0;
            obj.f13802b = 0;
            obj.c = Integer.MIN_VALUE;
            obj.d = Integer.MIN_VALUE;
            obj.f13803e = 0;
            obj.f13804f = 0;
            obj.f13805g = false;
            obj.f13806h = false;
            this.f2606H = obj;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f2624o;
        if (actionMenuView.f2532D == null) {
            m mVar = (m) actionMenuView.getMenu();
            if (this.f2621a0 == null) {
                this.f2621a0 = new B0(this);
            }
            this.f2624o.setExpandedActionViewsExclusive(true);
            mVar.b(this.f2621a0, this.f2633x);
        }
    }

    public final void f() {
        if (this.f2624o == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f2624o = actionMenuView;
            actionMenuView.setPopupTheme(this.y);
            this.f2624o.setOnMenuItemClickListener(this.f2618U);
            this.f2624o.getClass();
            C0 h4 = h();
            h4.f13587a = (this.f2600B & 112) | 8388613;
            this.f2624o.setLayoutParams(h4);
            b(this.f2624o, false);
        }
    }

    public final void g() {
        if (this.f2627r == null) {
            this.f2627r = new C1786t(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C0 h4 = h();
            h4.f13587a = (this.f2600B & 112) | 8388611;
            this.f2627r.setLayoutParams(h4);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, l.C0] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f13587a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1657a.f12636b);
        marginLayoutParams.f13587a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f13588b = 0;
        return marginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C1786t c1786t = this.f2631v;
        if (c1786t != null) {
            return c1786t.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C1786t c1786t = this.f2631v;
        if (c1786t != null) {
            return c1786t.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C1778l0 c1778l0 = this.f2606H;
        if (c1778l0 != null) {
            return c1778l0.f13805g ? c1778l0.f13801a : c1778l0.f13802b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i4 = this.f2608J;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C1778l0 c1778l0 = this.f2606H;
        if (c1778l0 != null) {
            return c1778l0.f13801a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C1778l0 c1778l0 = this.f2606H;
        if (c1778l0 != null) {
            return c1778l0.f13802b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C1778l0 c1778l0 = this.f2606H;
        if (c1778l0 != null) {
            return c1778l0.f13805g ? c1778l0.f13802b : c1778l0.f13801a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i4 = this.f2607I;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        m mVar;
        ActionMenuView actionMenuView = this.f2624o;
        return (actionMenuView == null || (mVar = actionMenuView.f2532D) == null || !mVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f2608J, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = A.f779a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = A.f779a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f2607I, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f2628s;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f2628s;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f2624o.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        C1786t c1786t = this.f2627r;
        if (c1786t != null) {
            return c1786t.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C1786t c1786t = this.f2627r;
        if (c1786t != null) {
            return c1786t.getDrawable();
        }
        return null;
    }

    public C1773j getOuterActionMenuPresenter() {
        return this.f2620W;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f2624o.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f2633x;
    }

    public int getPopupTheme() {
        return this.y;
    }

    public CharSequence getSubtitle() {
        return this.f2611M;
    }

    public final TextView getSubtitleTextView() {
        return this.f2626q;
    }

    public CharSequence getTitle() {
        return this.f2610L;
    }

    public int getTitleMarginBottom() {
        return this.f2605G;
    }

    public int getTitleMarginEnd() {
        return this.f2603E;
    }

    public int getTitleMarginStart() {
        return this.f2602D;
    }

    public int getTitleMarginTop() {
        return this.f2604F;
    }

    public final TextView getTitleTextView() {
        return this.f2625p;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, l.G0] */
    public S getWrapper() {
        Drawable drawable;
        if (this.f2619V == null) {
            ?? obj = new Object();
            obj.f13614n = 0;
            obj.f13603a = this;
            obj.f13608h = getTitle();
            obj.f13609i = getSubtitle();
            obj.f13607g = obj.f13608h != null;
            obj.f13606f = getNavigationIcon();
            e w2 = e.w(getContext(), null, AbstractC1657a.f12635a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) w2.f14710q;
            obj.f13615o = w2.p(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.f13607g = true;
                obj.f13608h = text;
                if ((obj.f13604b & 8) != 0) {
                    setTitle(text);
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                obj.f13609i = text2;
                if ((obj.f13604b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable p3 = w2.p(20);
            if (p3 != null) {
                obj.f13605e = p3;
                obj.c();
            }
            Drawable p4 = w2.p(17);
            if (p4 != null) {
                obj.d = p4;
                obj.c();
            }
            if (obj.f13606f == null && (drawable = obj.f13615o) != null) {
                obj.f13606f = drawable;
                if ((obj.f13604b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            obj.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = obj.c;
                if (view != null && (obj.f13604b & 16) != 0) {
                    removeView(view);
                }
                obj.c = inflate;
                if (inflate != null && (obj.f13604b & 16) != 0) {
                    addView(inflate);
                }
                obj.a(obj.f13604b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f2606H.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f2634z = resourceId2;
                M m4 = this.f2625p;
                if (m4 != null) {
                    m4.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f2599A = resourceId3;
                M m5 = this.f2626q;
                if (m5 != null) {
                    m5.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            w2.y();
            if (R.string.abc_action_bar_up_description != obj.f13614n) {
                obj.f13614n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i4 = obj.f13614n;
                    obj.f13610j = i4 != 0 ? getContext().getString(i4) : null;
                    obj.b();
                }
            }
            obj.f13610j = getNavigationContentDescription();
            setNavigationOnClickListener(new F0(obj));
            this.f2619V = obj;
        }
        return this.f2619V;
    }

    public final int j(View view, int i4) {
        C0 c02 = (C0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i4 > 0 ? (measuredHeight - i4) / 2 : 0;
        int i6 = c02.f13587a & 112;
        if (i6 != 16 && i6 != 48 && i6 != 80) {
            i6 = this.f2609K & 112;
        }
        if (i6 == 48) {
            return getPaddingTop() - i5;
        }
        if (i6 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c02).bottomMargin) - i5;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i7 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i8 = ((ViewGroup.MarginLayoutParams) c02).topMargin;
        if (i7 < i8) {
            i7 = i8;
        } else {
            int i9 = (((height - paddingBottom) - measuredHeight) - i7) - paddingTop;
            int i10 = ((ViewGroup.MarginLayoutParams) c02).bottomMargin;
            if (i9 < i10) {
                i7 = Math.max(0, i7 - (i10 - i9));
            }
        }
        return paddingTop + i7;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.f2616S.contains(view);
    }

    public final int n(View view, int i4, int i5, int[] iArr) {
        C0 c02 = (C0) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) c02).leftMargin - iArr[0];
        int max = Math.max(0, i6) + i4;
        iArr[0] = Math.max(0, -i6);
        int j4 = j(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j4, max + measuredWidth, view.getMeasuredHeight() + j4);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c02).rightMargin + max;
    }

    public final int o(View view, int i4, int i5, int[] iArr) {
        C0 c02 = (C0) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) c02).rightMargin - iArr[1];
        int max = i4 - Math.max(0, i6);
        iArr[1] = Math.max(0, -i6);
        int j4 = j(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j4, max, view.getMeasuredHeight() + j4);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c02).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2623c0);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2614Q = false;
        }
        if (!this.f2614Q) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2614Q = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f2614Q = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028f A[LOOP:0: B:39:0x028d->B:40:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a7 A[LOOP:1: B:43:0x02a5->B:44:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c7 A[LOOP:2: B:47:0x02c5->B:48:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x031a A[LOOP:3: B:56:0x0318->B:57:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean a4 = M0.a(this);
        int i13 = !a4 ? 1 : 0;
        int i14 = 0;
        if (r(this.f2627r)) {
            q(this.f2627r, i4, 0, i5, this.f2601C);
            i6 = k(this.f2627r) + this.f2627r.getMeasuredWidth();
            i7 = Math.max(0, l(this.f2627r) + this.f2627r.getMeasuredHeight());
            i8 = View.combineMeasuredStates(0, this.f2627r.getMeasuredState());
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (r(this.f2631v)) {
            q(this.f2631v, i4, 0, i5, this.f2601C);
            i6 = k(this.f2631v) + this.f2631v.getMeasuredWidth();
            i7 = Math.max(i7, l(this.f2631v) + this.f2631v.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f2631v.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i6);
        int max2 = Math.max(0, currentContentInsetStart - i6);
        int[] iArr = this.f2617T;
        iArr[a4 ? 1 : 0] = max2;
        if (r(this.f2624o)) {
            q(this.f2624o, i4, max, i5, this.f2601C);
            i9 = k(this.f2624o) + this.f2624o.getMeasuredWidth();
            i7 = Math.max(i7, l(this.f2624o) + this.f2624o.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f2624o.getMeasuredState());
        } else {
            i9 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i9);
        iArr[i13] = Math.max(0, currentContentInsetEnd - i9);
        if (r(this.f2632w)) {
            max3 += p(this.f2632w, i4, max3, i5, 0, iArr);
            i7 = Math.max(i7, l(this.f2632w) + this.f2632w.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f2632w.getMeasuredState());
        }
        if (r(this.f2628s)) {
            max3 += p(this.f2628s, i4, max3, i5, 0, iArr);
            i7 = Math.max(i7, l(this.f2628s) + this.f2628s.getMeasuredHeight());
            i8 = View.combineMeasuredStates(i8, this.f2628s.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (((C0) childAt.getLayoutParams()).f13588b == 0 && r(childAt)) {
                max3 += p(childAt, i4, max3, i5, 0, iArr);
                int max4 = Math.max(i7, l(childAt) + childAt.getMeasuredHeight());
                i8 = View.combineMeasuredStates(i8, childAt.getMeasuredState());
                i7 = max4;
            } else {
                max3 = max3;
            }
        }
        int i16 = max3;
        int i17 = this.f2604F + this.f2605G;
        int i18 = this.f2602D + this.f2603E;
        if (r(this.f2625p)) {
            p(this.f2625p, i4, i16 + i18, i5, i17, iArr);
            int k3 = k(this.f2625p) + this.f2625p.getMeasuredWidth();
            i10 = l(this.f2625p) + this.f2625p.getMeasuredHeight();
            i11 = View.combineMeasuredStates(i8, this.f2625p.getMeasuredState());
            i12 = k3;
        } else {
            i10 = 0;
            i11 = i8;
            i12 = 0;
        }
        if (r(this.f2626q)) {
            i12 = Math.max(i12, p(this.f2626q, i4, i16 + i18, i5, i17 + i10, iArr));
            i10 += l(this.f2626q) + this.f2626q.getMeasuredHeight();
            i11 = View.combineMeasuredStates(i11, this.f2626q.getMeasuredState());
        }
        int max5 = Math.max(i7, i10);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i16 + i12;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i4, (-16777216) & i11);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i5, i11 << 16);
        if (this.f2622b0) {
            int childCount2 = getChildCount();
            for (int i19 = 0; i19 < childCount2; i19++) {
                View childAt2 = getChildAt(i19);
                if (!r(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i14);
        }
        i14 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i14);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof E0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        E0 e02 = (E0) parcelable;
        super.onRestoreInstanceState(e02.f1071o);
        ActionMenuView actionMenuView = this.f2624o;
        m mVar = actionMenuView != null ? actionMenuView.f2532D : null;
        int i4 = e02.f13593q;
        if (i4 != 0 && this.f2621a0 != null && mVar != null && (findItem = mVar.findItem(i4)) != null) {
            findItem.expandActionView();
        }
        if (e02.f13594r) {
            x xVar = this.f2623c0;
            removeCallbacks(xVar);
            post(xVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        d();
        C1778l0 c1778l0 = this.f2606H;
        boolean z4 = i4 == 1;
        if (z4 == c1778l0.f13805g) {
            return;
        }
        c1778l0.f13805g = z4;
        if (!c1778l0.f13806h) {
            c1778l0.f13801a = c1778l0.f13803e;
            c1778l0.f13802b = c1778l0.f13804f;
            return;
        }
        if (z4) {
            int i5 = c1778l0.d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = c1778l0.f13803e;
            }
            c1778l0.f13801a = i5;
            int i6 = c1778l0.c;
            if (i6 == Integer.MIN_VALUE) {
                i6 = c1778l0.f13804f;
            }
            c1778l0.f13802b = i6;
            return;
        }
        int i7 = c1778l0.c;
        if (i7 == Integer.MIN_VALUE) {
            i7 = c1778l0.f13803e;
        }
        c1778l0.f13801a = i7;
        int i8 = c1778l0.d;
        if (i8 == Integer.MIN_VALUE) {
            i8 = c1778l0.f13804f;
        }
        c1778l0.f13802b = i8;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [L.b, android.os.Parcelable, l.E0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1773j c1773j;
        p pVar;
        ?? bVar = new L.b(super.onSaveInstanceState());
        B0 b02 = this.f2621a0;
        if (b02 != null && (pVar = b02.f13581p) != null) {
            bVar.f13593q = pVar.f13456a;
        }
        ActionMenuView actionMenuView = this.f2624o;
        bVar.f13594r = (actionMenuView == null || (c1773j = actionMenuView.f2536H) == null || !c1773j.i()) ? false : true;
        return bVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2613P = false;
        }
        if (!this.f2613P) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2613P = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f2613P = false;
        return true;
    }

    public final int p(View view, int i4, int i5, int i6, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i9) + Math.max(0, i8);
        iArr[0] = Math.max(0, -i8);
        iArr[1] = Math.max(0, -i9);
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + max + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i7 >= 0) {
            if (mode != 0) {
                i7 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i7);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapseContentDescription(int i4) {
        setCollapseContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C1786t c1786t = this.f2631v;
        if (c1786t != null) {
            c1786t.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i4) {
        setCollapseIcon(AbstractC1678a.a(getContext(), i4));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f2631v.setImageDrawable(drawable);
        } else {
            C1786t c1786t = this.f2631v;
            if (c1786t != null) {
                c1786t.setImageDrawable(this.f2629t);
            }
        }
    }

    public void setCollapsible(boolean z4) {
        this.f2622b0 = z4;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f2608J) {
            this.f2608J = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f2607I) {
            this.f2607I = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i4) {
        setLogo(AbstractC1678a.a(getContext(), i4));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f2628s == null) {
                this.f2628s = new AppCompatImageView(getContext(), null);
            }
            if (!m(this.f2628s)) {
                b(this.f2628s, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f2628s;
            if (appCompatImageView != null && m(appCompatImageView)) {
                removeView(this.f2628s);
                this.f2616S.remove(this.f2628s);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f2628s;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i4) {
        setLogoDescription(getContext().getText(i4));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f2628s == null) {
            this.f2628s = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.f2628s;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i4) {
        setNavigationContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C1786t c1786t = this.f2627r;
        if (c1786t != null) {
            c1786t.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i4) {
        setNavigationIcon(AbstractC1678a.a(getContext(), i4));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!m(this.f2627r)) {
                b(this.f2627r, true);
            }
        } else {
            C1786t c1786t = this.f2627r;
            if (c1786t != null && m(c1786t)) {
                removeView(this.f2627r);
                this.f2616S.remove(this.f2627r);
            }
        }
        C1786t c1786t2 = this.f2627r;
        if (c1786t2 != null) {
            c1786t2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f2627r.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(D0 d02) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f2624o.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i4) {
        if (this.y != i4) {
            this.y = i4;
            if (i4 == 0) {
                this.f2633x = getContext();
            } else {
                this.f2633x = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setSubtitle(int i4) {
        setSubtitle(getContext().getText(i4));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            M m4 = this.f2626q;
            if (m4 != null && m(m4)) {
                removeView(this.f2626q);
                this.f2616S.remove(this.f2626q);
            }
        } else {
            if (this.f2626q == null) {
                Context context = getContext();
                M m5 = new M(context, null);
                this.f2626q = m5;
                m5.setSingleLine();
                this.f2626q.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f2599A;
                if (i4 != 0) {
                    this.f2626q.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.f2612O;
                if (colorStateList != null) {
                    this.f2626q.setTextColor(colorStateList);
                }
            }
            if (!m(this.f2626q)) {
                b(this.f2626q, true);
            }
        }
        M m6 = this.f2626q;
        if (m6 != null) {
            m6.setText(charSequence);
        }
        this.f2611M = charSequence;
    }

    public void setSubtitleTextColor(int i4) {
        setSubtitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f2612O = colorStateList;
        M m4 = this.f2626q;
        if (m4 != null) {
            m4.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i4) {
        setTitle(getContext().getText(i4));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            M m4 = this.f2625p;
            if (m4 != null && m(m4)) {
                removeView(this.f2625p);
                this.f2616S.remove(this.f2625p);
            }
        } else {
            if (this.f2625p == null) {
                Context context = getContext();
                M m5 = new M(context, null);
                this.f2625p = m5;
                m5.setSingleLine();
                this.f2625p.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f2634z;
                if (i4 != 0) {
                    this.f2625p.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.N;
                if (colorStateList != null) {
                    this.f2625p.setTextColor(colorStateList);
                }
            }
            if (!m(this.f2625p)) {
                b(this.f2625p, true);
            }
        }
        M m6 = this.f2625p;
        if (m6 != null) {
            m6.setText(charSequence);
        }
        this.f2610L = charSequence;
    }

    public void setTitleMarginBottom(int i4) {
        this.f2605G = i4;
        requestLayout();
    }

    public void setTitleMarginEnd(int i4) {
        this.f2603E = i4;
        requestLayout();
    }

    public void setTitleMarginStart(int i4) {
        this.f2602D = i4;
        requestLayout();
    }

    public void setTitleMarginTop(int i4) {
        this.f2604F = i4;
        requestLayout();
    }

    public void setTitleTextColor(int i4) {
        setTitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.N = colorStateList;
        M m4 = this.f2625p;
        if (m4 != null) {
            m4.setTextColor(colorStateList);
        }
    }
}
