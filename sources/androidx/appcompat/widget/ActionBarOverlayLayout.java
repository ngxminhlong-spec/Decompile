package androidx.appcompat.widget;

import H.A;
import H.C0034i;
import H.InterfaceC0032g;
import H.InterfaceC0033h;
import H.r;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import f.w;
import g.AbstractC1678a;
import j.C1728j;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.m;
import k.y;
import l.B0;
import l.C1761d;
import l.C1773j;
import l.G0;
import l.InterfaceC1759c;
import l.M0;
import l.Q;
import l.RunnableC1757b;
import l.S;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements Q, InterfaceC0032g, InterfaceC0033h {

    /* renamed from: P, reason: collision with root package name */
    public static final int[] f2506P = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: A, reason: collision with root package name */
    public int f2507A;

    /* renamed from: B, reason: collision with root package name */
    public final Rect f2508B;

    /* renamed from: C, reason: collision with root package name */
    public final Rect f2509C;

    /* renamed from: D, reason: collision with root package name */
    public final Rect f2510D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f2511E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f2512F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f2513G;

    /* renamed from: H, reason: collision with root package name */
    public final Rect f2514H;

    /* renamed from: I, reason: collision with root package name */
    public InterfaceC1759c f2515I;

    /* renamed from: J, reason: collision with root package name */
    public OverScroller f2516J;

    /* renamed from: K, reason: collision with root package name */
    public ViewPropertyAnimator f2517K;

    /* renamed from: L, reason: collision with root package name */
    public final E2.a f2518L;

    /* renamed from: M, reason: collision with root package name */
    public final RunnableC1757b f2519M;
    public final RunnableC1757b N;

    /* renamed from: O, reason: collision with root package name */
    public final C0034i f2520O;

    /* renamed from: o, reason: collision with root package name */
    public int f2521o;

    /* renamed from: p, reason: collision with root package name */
    public int f2522p;

    /* renamed from: q, reason: collision with root package name */
    public ContentFrameLayout f2523q;

    /* renamed from: r, reason: collision with root package name */
    public ActionBarContainer f2524r;

    /* renamed from: s, reason: collision with root package name */
    public S f2525s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f2526t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2527u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2528v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2529w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2530x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public int f2531z;

    /* JADX WARN: Type inference failed for: r2v1, types: [H.i, java.lang.Object] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2522p = 0;
        this.f2508B = new Rect();
        this.f2509C = new Rect();
        this.f2510D = new Rect();
        this.f2511E = new Rect();
        this.f2512F = new Rect();
        this.f2513G = new Rect();
        this.f2514H = new Rect();
        this.f2518L = new E2.a(7, this);
        this.f2519M = new RunnableC1757b(this, 0);
        this.N = new RunnableC1757b(this, 1);
        i(context);
        this.f2520O = new Object();
    }

    public static boolean g(View view, Rect rect, boolean z4) {
        boolean z5;
        C1761d c1761d = (C1761d) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) c1761d).leftMargin;
        int i5 = rect.left;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) c1761d).leftMargin = i5;
            z5 = true;
        } else {
            z5 = false;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c1761d).topMargin;
        int i7 = rect.top;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c1761d).topMargin = i7;
            z5 = true;
        }
        int i8 = ((ViewGroup.MarginLayoutParams) c1761d).rightMargin;
        int i9 = rect.right;
        if (i8 != i9) {
            ((ViewGroup.MarginLayoutParams) c1761d).rightMargin = i9;
            z5 = true;
        }
        if (z4) {
            int i10 = ((ViewGroup.MarginLayoutParams) c1761d).bottomMargin;
            int i11 = rect.bottom;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) c1761d).bottomMargin = i11;
                return true;
            }
        }
        return z5;
    }

    @Override // H.InterfaceC0032g
    public final void a(View view, View view2, int i4, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i4);
        }
    }

    @Override // H.InterfaceC0032g
    public final void b(View view, int i4) {
        if (i4 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // H.InterfaceC0032g
    public final void c(View view, int i4, int i5, int[] iArr, int i6) {
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1761d;
    }

    @Override // H.InterfaceC0033h
    public final void d(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        e(view, i4, i5, i6, i7, i8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i4;
        super.draw(canvas);
        if (this.f2526t == null || this.f2527u) {
            return;
        }
        if (this.f2524r.getVisibility() == 0) {
            i4 = (int) (this.f2524r.getTranslationY() + this.f2524r.getBottom() + 0.5f);
        } else {
            i4 = 0;
        }
        this.f2526t.setBounds(0, i4, getWidth(), this.f2526t.getIntrinsicHeight() + i4);
        this.f2526t.draw(canvas);
    }

    @Override // H.InterfaceC0032g
    public final void e(View view, int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(view, i4, i5, i6, i7);
        }
    }

    @Override // H.InterfaceC0032g
    public final boolean f(View view, View view2, int i4, int i5) {
        return i5 == 0 && onStartNestedScroll(view, view2, i4);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        k();
        WeakHashMap weakHashMap = A.f779a;
        getWindowSystemUiVisibility();
        boolean g4 = g(this.f2524r, rect, false);
        Rect rect2 = this.f2511E;
        rect2.set(rect);
        Method method = M0.f13663a;
        Rect rect3 = this.f2508B;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (Exception e4) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e4);
            }
        }
        Rect rect4 = this.f2512F;
        if (!rect4.equals(rect2)) {
            rect4.set(rect2);
            g4 = true;
        }
        Rect rect5 = this.f2509C;
        if (!rect5.equals(rect3)) {
            rect5.set(rect3);
            g4 = true;
        }
        if (g4) {
            requestLayout();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f2524r;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0034i c0034i = this.f2520O;
        return c0034i.f825b | c0034i.f824a;
    }

    public CharSequence getTitle() {
        k();
        return ((G0) this.f2525s).f13603a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f2519M);
        removeCallbacks(this.N);
        ViewPropertyAnimator viewPropertyAnimator = this.f2517K;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2506P);
        this.f2521o = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f2526t = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f2527u = context.getApplicationInfo().targetSdkVersion < 19;
        this.f2516J = new OverScroller(context);
    }

    public final void j(int i4) {
        k();
        if (i4 == 2) {
            ((G0) this.f2525s).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i4 == 5) {
            ((G0) this.f2525s).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i4 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        S wrapper;
        if (this.f2523q == null) {
            this.f2523q = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f2524r = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof S) {
                wrapper = (S) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f2525s = wrapper;
        }
    }

    public final void l(Menu menu, y yVar) {
        k();
        G0 g02 = (G0) this.f2525s;
        Toolbar toolbar = g02.f13603a;
        if (g02.f13613m == null) {
            C1773j c1773j = new C1773j(toolbar.getContext());
            g02.f13613m = c1773j;
            c1773j.f13786w = R.id.action_menu_presenter;
        }
        C1773j c1773j2 = g02.f13613m;
        c1773j2.f13782s = yVar;
        m mVar = (m) menu;
        if (mVar == null && toolbar.f2624o == null) {
            return;
        }
        toolbar.f();
        m mVar2 = toolbar.f2624o.f2532D;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            mVar2.r(toolbar.f2620W);
            mVar2.r(toolbar.f2621a0);
        }
        if (toolbar.f2621a0 == null) {
            toolbar.f2621a0 = new B0(toolbar);
        }
        c1773j2.f13770F = true;
        if (mVar != null) {
            mVar.b(c1773j2, toolbar.f2633x);
            mVar.b(toolbar.f2621a0, toolbar.f2633x);
        } else {
            c1773j2.k(toolbar.f2633x, null);
            toolbar.f2621a0.k(toolbar.f2633x, null);
            c1773j2.h();
            toolbar.f2621a0.h();
        }
        toolbar.f2624o.setPopupTheme(toolbar.y);
        toolbar.f2624o.setPresenter(c1773j2);
        toolbar.f2620W = c1773j2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = A.f779a;
        r.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C1761d c1761d = (C1761d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = ((ViewGroup.MarginLayoutParams) c1761d).leftMargin + paddingLeft;
                int i10 = ((ViewGroup.MarginLayoutParams) c1761d).topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        k();
        measureChildWithMargins(this.f2524r, i4, 0, i5, 0);
        C1761d c1761d = (C1761d) this.f2524r.getLayoutParams();
        int i6 = 0;
        int max = Math.max(0, this.f2524r.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1761d).leftMargin + ((ViewGroup.MarginLayoutParams) c1761d).rightMargin);
        int max2 = Math.max(0, this.f2524r.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1761d).topMargin + ((ViewGroup.MarginLayoutParams) c1761d).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f2524r.getMeasuredState());
        WeakHashMap weakHashMap = A.f779a;
        boolean z4 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z4) {
            i6 = this.f2521o;
            if (this.f2529w && this.f2524r.getTabContainer() != null) {
                i6 += this.f2521o;
            }
        } else if (this.f2524r.getVisibility() != 8) {
            i6 = this.f2524r.getMeasuredHeight();
        }
        Rect rect = this.f2508B;
        Rect rect2 = this.f2510D;
        rect2.set(rect);
        Rect rect3 = this.f2511E;
        Rect rect4 = this.f2513G;
        rect4.set(rect3);
        if (this.f2528v || z4) {
            rect4.top += i6;
            rect4.bottom = rect4.bottom;
        } else {
            rect2.top += i6;
            rect2.bottom = rect2.bottom;
        }
        g(this.f2523q, rect2, true);
        Rect rect5 = this.f2514H;
        if (!rect5.equals(rect4)) {
            rect5.set(rect4);
            this.f2523q.a(rect4);
        }
        measureChildWithMargins(this.f2523q, i4, 0, i5, 0);
        C1761d c1761d2 = (C1761d) this.f2523q.getLayoutParams();
        int max3 = Math.max(max, this.f2523q.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1761d2).leftMargin + ((ViewGroup.MarginLayoutParams) c1761d2).rightMargin);
        int max4 = Math.max(max2, this.f2523q.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1761d2).topMargin + ((ViewGroup.MarginLayoutParams) c1761d2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f2523q.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i4, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i5, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f4, float f5, boolean z4) {
        if (!this.f2530x || !z4) {
            return false;
        }
        this.f2516J.fling(0, 0, 0, (int) f5, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f2516J.getFinalY() > this.f2524r.getHeight()) {
            h();
            this.N.run();
        } else {
            h();
            this.f2519M.run();
        }
        this.y = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f4, float f5) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        int i8 = this.f2531z + i5;
        this.f2531z = i8;
        setActionBarHideOffset(i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        w wVar;
        C1728j c1728j;
        this.f2520O.f824a = i4;
        this.f2531z = getActionBarHideOffset();
        h();
        InterfaceC1759c interfaceC1759c = this.f2515I;
        if (interfaceC1759c == null || (c1728j = (wVar = (w) interfaceC1759c).f12952z) == null) {
            return;
        }
        c1728j.a();
        wVar.f12952z = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        if ((i4 & 2) == 0 || this.f2524r.getVisibility() != 0) {
            return false;
        }
        return this.f2530x;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f2530x || this.y) {
            return;
        }
        if (this.f2531z <= this.f2524r.getHeight()) {
            h();
            postDelayed(this.f2519M, 600L);
        } else {
            h();
            postDelayed(this.N, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i4) {
        super.onWindowSystemUiVisibilityChanged(i4);
        k();
        int i5 = this.f2507A ^ i4;
        this.f2507A = i4;
        boolean z4 = (i4 & 4) == 0;
        boolean z5 = (i4 & 256) != 0;
        InterfaceC1759c interfaceC1759c = this.f2515I;
        if (interfaceC1759c != null) {
            w wVar = (w) interfaceC1759c;
            wVar.f12949v = !z5;
            if (z4 || !z5) {
                if (wVar.f12950w) {
                    wVar.f12950w = false;
                    wVar.o0(true);
                }
            } else if (!wVar.f12950w) {
                wVar.f12950w = true;
                wVar.o0(true);
            }
        }
        if ((i5 & 256) == 0 || this.f2515I == null) {
            return;
        }
        WeakHashMap weakHashMap = A.f779a;
        r.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        this.f2522p = i4;
        InterfaceC1759c interfaceC1759c = this.f2515I;
        if (interfaceC1759c != null) {
            ((w) interfaceC1759c).f12948u = i4;
        }
    }

    public void setActionBarHideOffset(int i4) {
        h();
        this.f2524r.setTranslationY(-Math.max(0, Math.min(i4, this.f2524r.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1759c interfaceC1759c) {
        this.f2515I = interfaceC1759c;
        if (getWindowToken() != null) {
            ((w) this.f2515I).f12948u = this.f2522p;
            int i4 = this.f2507A;
            if (i4 != 0) {
                onWindowSystemUiVisibilityChanged(i4);
                WeakHashMap weakHashMap = A.f779a;
                r.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z4) {
        this.f2529w = z4;
    }

    public void setHideOnContentScrollEnabled(boolean z4) {
        if (z4 != this.f2530x) {
            this.f2530x = z4;
            if (z4) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i4) {
        k();
        G0 g02 = (G0) this.f2525s;
        g02.d = i4 != 0 ? AbstractC1678a.a(g02.f13603a.getContext(), i4) : null;
        g02.c();
    }

    public void setIcon(Drawable drawable) {
        k();
        G0 g02 = (G0) this.f2525s;
        g02.d = drawable;
        g02.c();
    }

    public void setLogo(int i4) {
        k();
        G0 g02 = (G0) this.f2525s;
        g02.f13605e = i4 != 0 ? AbstractC1678a.a(g02.f13603a.getContext(), i4) : null;
        g02.c();
    }

    public void setOverlayMode(boolean z4) {
        this.f2528v = z4;
        this.f2527u = z4 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z4) {
    }

    public void setUiOptions(int i4) {
    }

    @Override // l.Q
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((G0) this.f2525s).f13611k = callback;
    }

    @Override // l.Q
    public void setWindowTitle(CharSequence charSequence) {
        k();
        G0 g02 = (G0) this.f2525s;
        if (g02.f13607g) {
            return;
        }
        g02.f13608h = charSequence;
        if ((g02.f13604b & 8) != 0) {
            g02.f13603a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
