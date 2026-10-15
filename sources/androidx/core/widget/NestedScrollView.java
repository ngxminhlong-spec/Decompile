package androidx.core.widget;

import D3.d;
import H.A;
import H.AbstractC0044t;
import H.C0028c;
import H.C0031f;
import H.C0034i;
import H.C0039n;
import H.InterfaceC0033h;
import J.f;
import J.g;
import J.h;
import J.j;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0033h {

    /* renamed from: Q, reason: collision with root package name */
    public static final float f2687Q = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: R, reason: collision with root package name */
    public static final f f2688R = new f(0);

    /* renamed from: S, reason: collision with root package name */
    public static final int[] f2689S = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public VelocityTracker f2690A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2691B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2692C;

    /* renamed from: D, reason: collision with root package name */
    public final int f2693D;

    /* renamed from: E, reason: collision with root package name */
    public final int f2694E;

    /* renamed from: F, reason: collision with root package name */
    public final int f2695F;

    /* renamed from: G, reason: collision with root package name */
    public int f2696G;

    /* renamed from: H, reason: collision with root package name */
    public final int[] f2697H;

    /* renamed from: I, reason: collision with root package name */
    public final int[] f2698I;

    /* renamed from: J, reason: collision with root package name */
    public int f2699J;

    /* renamed from: K, reason: collision with root package name */
    public int f2700K;

    /* renamed from: L, reason: collision with root package name */
    public j f2701L;

    /* renamed from: M, reason: collision with root package name */
    public final C0034i f2702M;
    public final C0031f N;

    /* renamed from: O, reason: collision with root package name */
    public float f2703O;

    /* renamed from: P, reason: collision with root package name */
    public final C0028c f2704P;

    /* renamed from: o, reason: collision with root package name */
    public final float f2705o;

    /* renamed from: p, reason: collision with root package name */
    public long f2706p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f2707q;

    /* renamed from: r, reason: collision with root package name */
    public final OverScroller f2708r;

    /* renamed from: s, reason: collision with root package name */
    public final EdgeEffect f2709s;

    /* renamed from: t, reason: collision with root package name */
    public final EdgeEffect f2710t;

    /* renamed from: u, reason: collision with root package name */
    public C0039n f2711u;

    /* renamed from: v, reason: collision with root package name */
    public int f2712v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2713w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2714x;
    public View y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2715z;

    /* JADX WARN: Type inference failed for: r7v2, types: [H.i, java.lang.Object] */
    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.duracodefactory.logiccircuitsimulatorpro.R.attr.nestedScrollViewStyle);
        this.f2707q = new Rect();
        this.f2713w = true;
        this.f2714x = false;
        this.y = null;
        this.f2715z = false;
        this.f2692C = true;
        this.f2696G = -1;
        this.f2697H = new int[2];
        this.f2698I = new int[2];
        this.f2704P = new C0028c(getContext(), new d(15, this));
        int i4 = Build.VERSION.SDK_INT;
        this.f2709s = i4 >= 31 ? J.d.a(context, attributeSet) : new EdgeEffect(context);
        this.f2710t = i4 >= 31 ? J.d.a(context, attributeSet) : new EdgeEffect(context);
        this.f2705o = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f2708r = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2693D = viewConfiguration.getScaledTouchSlop();
        this.f2694E = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2695F = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2689S, com.duracodefactory.logiccircuitsimulatorpro.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2702M = new Object();
        this.N = new C0031f(this);
        setNestedScrollingEnabled(true);
        A.h(this, f2688R);
    }

    private C0039n getScrollFeedbackProvider() {
        if (this.f2711u == null) {
            this.f2711u = new C0039n(this);
        }
        return this.f2711u;
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, nestedScrollView);
    }

    @Override // H.InterfaceC0032g
    public final void a(View view, View view2, int i4, int i5) {
        C0034i c0034i = this.f2702M;
        if (i5 == 1) {
            c0034i.f825b = i4;
        } else {
            c0034i.f824a = i4;
        }
        this.N.g(2, i5);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i4, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // H.InterfaceC0032g
    public final void b(View view, int i4) {
        C0034i c0034i = this.f2702M;
        if (i4 == 1) {
            c0034i.f825b = 0;
        } else {
            c0034i.f824a = 0;
        }
        w(i4);
    }

    @Override // H.InterfaceC0032g
    public final void c(View view, int i4, int i5, int[] iArr, int i6) {
        this.N.c(i4, i5, i6, iArr, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? (scrollY - max) + bottom : bottom;
    }

    @Override // H.InterfaceC0033h
    public final void d(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        n(i7, i8, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f4, float f5, boolean z4) {
        return this.N.a(f4, f5, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f4, float f5) {
        return this.N.b(f4, f5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return this.N.c(i4, i5, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.N.d(i4, i5, i6, i7, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i4;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f2709s;
        int i5 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i4 = getPaddingLeft();
            } else {
                i4 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i4, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f2710t;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i5 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i5 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // H.InterfaceC0032g
    public final void e(View view, int i4, int i5, int i6, int i7, int i8) {
        n(i7, i8, null);
    }

    @Override // H.InterfaceC0032g
    public final boolean f(View view, View view2, int i4, int i5) {
        return (i4 & 2) != 0;
    }

    public final boolean g(int i4) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i4);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m(findNextFocus, maxScrollAmount, getHeight())) {
            if (i4 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i4 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i4 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f2707q;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            s(h(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i4);
        }
        if (view != null && view.isFocused() && !m(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0034i c0034i = this.f2702M;
        return c0034i.f825b | c0034i.f824a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f2703O == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2703O = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2703O;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        int i6 = rect.bottom;
        if (i6 > i5 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i5, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        }
        if (rect.top >= scrollY || i6 >= i5) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i5 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.N.f(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.f2707q.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? k(33) : g(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? k(130) : g(130);
                    }
                    if (keyCode == 62) {
                        q(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return k(33);
                    }
                    if (keyCode == 93) {
                        return k(130);
                    }
                    if (keyCode == 122) {
                        q(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        q(130);
                        return false;
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.N.d;
    }

    public final void j(int i4) {
        if (getChildCount() > 0) {
            this.f2708r.fling(getScrollX(), getScrollY(), 0, i4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.N.g(2, 1);
            this.f2700K = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                g.a(this, Math.abs(this.f2708r.getCurrVelocity()));
            }
        }
    }

    public final boolean k(int i4) {
        int childCount;
        boolean z4 = i4 == 130;
        int height = getHeight();
        Rect rect = this.f2707q;
        rect.top = 0;
        rect.bottom = height;
        if (z4 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i4, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i4, int i5) {
        Rect rect = this.f2707q;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i4 >= getScrollY() && rect.top - i4 <= getScrollY() + i5;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i4, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i4, int i5, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.N.d(0, scrollY2, 0, i4 - scrollY2, null, i5, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2696G) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.f2712v = (int) motionEvent.getY(i4);
            this.f2696G = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.f2690A;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2714x = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0122, code lost:
    
        if (r0 >= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00d7, code lost:
    
        if (r7 >= 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ab  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r32) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action == 2 && this.f2715z) {
            return true;
        }
        int i4 = action & 255;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = this.f2696G;
                    if (i5 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i5);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i5 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f2712v) > this.f2693D && (2 & getNestedScrollAxes()) == 0) {
                                this.f2715z = true;
                                this.f2712v = y;
                                if (this.f2690A == null) {
                                    this.f2690A = VelocityTracker.obtain();
                                }
                                this.f2690A.addMovement(motionEvent);
                                this.f2699J = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i4 != 3) {
                    if (i4 == 6) {
                        o(motionEvent);
                    }
                }
            }
            this.f2715z = false;
            this.f2696G = -1;
            VelocityTracker velocityTracker = this.f2690A;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2690A = null;
            }
            if (this.f2708r.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y4 = (int) motionEvent.getY();
            int x4 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y4 >= childAt.getTop() - scrollY && y4 < childAt.getBottom() - scrollY && x4 >= childAt.getLeft() && x4 < childAt.getRight()) {
                    this.f2712v = y4;
                    this.f2696G = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f2690A;
                    if (velocityTracker2 == null) {
                        this.f2690A = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f2690A.addMovement(motionEvent);
                    this.f2708r.computeScrollOffset();
                    if (!v(motionEvent) && this.f2708r.isFinished()) {
                        z4 = false;
                    }
                    this.f2715z = z4;
                    this.N.g(2, 0);
                }
            }
            if (!v(motionEvent) && this.f2708r.isFinished()) {
                z4 = false;
            }
            this.f2715z = z4;
            VelocityTracker velocityTracker3 = this.f2690A;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f2690A = null;
            }
        }
        return this.f2715z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i8;
        super.onLayout(z4, i4, i5, i6, i7);
        int i9 = 0;
        this.f2713w = false;
        View view = this.y;
        if (view != null && l(view, this)) {
            View view2 = this.y;
            Rect rect = this.f2707q;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h4 = h(rect);
            if (h4 != 0) {
                scrollBy(0, h4);
            }
        }
        this.y = null;
        if (!this.f2714x) {
            if (this.f2701L != null) {
                scrollTo(getScrollX(), this.f2701L.f950o);
                this.f2701L = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i8 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i8 = 0;
            }
            int paddingTop = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i8 && scrollY >= 0) {
                i9 = paddingTop + scrollY > i8 ? i8 - paddingTop : scrollY;
            }
            if (i9 != scrollY) {
                scrollTo(getScrollX(), i9);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2714x = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f2691B && View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f4, float f5, boolean z4) {
        if (z4) {
            return false;
        }
        dispatchNestedFling(0.0f, f5, true);
        j((int) f5);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f4, float f5) {
        return this.N.b(f4, f5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        this.N.c(i4, i5, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        n(i7, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        a(view, view2, i4, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i4, int i5, boolean z4, boolean z5) {
        super.scrollTo(i4, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (i4 == 2) {
            i4 = 130;
        } else if (i4 == 1) {
            i4 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i4) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i4);
        if (findNextFocus != null && m(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i4, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.f2701L = jVar;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, J.j] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f950o = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m(findFocus, 0, i7)) {
            return;
        }
        Rect rect = this.f2707q;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h4 = h(rect);
        if (h4 != 0) {
            if (this.f2692C) {
                u(0, h4, false);
            } else {
                scrollBy(0, h4);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        return f(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i4, int i5, int i6, int i7) {
        int i8;
        boolean z4;
        int i9;
        boolean z5;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i10 = i6 + i4;
        if (i5 <= 0 && i5 >= 0) {
            i8 = i5;
            z4 = false;
        } else {
            i8 = 0;
            z4 = true;
        }
        if (i10 > i7) {
            i9 = i7;
        } else {
            if (i10 >= 0) {
                i9 = i10;
                z5 = false;
                if (z5 && !this.N.f(1)) {
                    this.f2708r.springBack(i8, i9, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i8, i9);
                return !z4 || z5;
            }
            i9 = 0;
        }
        z5 = true;
        if (z5) {
            this.f2708r.springBack(i8, i9, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i8, i9);
        if (z4) {
        }
    }

    public final void q(int i4) {
        boolean z4 = i4 == 130;
        int height = getHeight();
        Rect rect = this.f2707q;
        if (z4) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i5 = rect.top;
        int i6 = height + i5;
        rect.bottom = i6;
        r(i4, i5, i6);
    }

    public final boolean r(int i4, int i5, int i6) {
        boolean z4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z5 = i4 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z6 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i5 < bottom && top < i6) {
                boolean z7 = i5 < top && bottom < i6;
                if (view == null) {
                    view = view2;
                    z6 = z7;
                } else {
                    boolean z8 = (z5 && top < view.getTop()) || (!z5 && bottom > view.getBottom());
                    if (z6) {
                        if (z7) {
                            if (!z8) {
                            }
                            view = view2;
                        }
                    } else if (z7) {
                        view = view2;
                        z6 = true;
                    } else {
                        if (!z8) {
                        }
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i5 < scrollY || i6 > i7) {
            s(z5 ? i5 - scrollY : i6 - i7, -1, null, 0, 1, true);
            z4 = true;
        } else {
            z4 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i4);
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f2713w) {
            this.y = view2;
        } else {
            Rect rect = this.f2707q;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h4 = h(rect);
            if (h4 != 0) {
                scrollBy(0, h4);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h4 = h(rect);
        boolean z5 = h4 != 0;
        if (z5) {
            if (z4) {
                scrollBy(0, h4);
                return z5;
            }
            u(0, h4, false);
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        VelocityTracker velocityTracker;
        if (z4 && (velocityTracker = this.f2690A) != null) {
            velocityTracker.recycle();
            this.f2690A = null;
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f2713w = true;
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int s(int r21, int r22, android.view.MotionEvent r23, int r24, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.s(int, int, android.view.MotionEvent, int, int, boolean):int");
    }

    @Override // android.view.View
    public final void scrollTo(int i4, int i5) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i4 < 0) {
                i4 = 0;
            } else if (width + i4 > width2) {
                i4 = width2 - width;
            }
            if (height >= height2 || i5 < 0) {
                i5 = 0;
            } else if (height + i5 > height2) {
                i5 = height2 - height;
            }
            if (i4 == getScrollX() && i5 == getScrollY()) {
                return;
            }
            super.scrollTo(i4, i5);
        }
    }

    public void setFillViewport(boolean z4) {
        if (z4 != this.f2691B) {
            this.f2691B = z4;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        C0031f c0031f = this.N;
        if (c0031f.d) {
            ViewGroup viewGroup = c0031f.c;
            WeakHashMap weakHashMap = A.f779a;
            AbstractC0044t.m(viewGroup);
        }
        c0031f.d = z4;
    }

    public void setOnScrollChangeListener(h hVar) {
    }

    public void setSmoothScrollingEnabled(boolean z4) {
        this.f2692C = z4;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return this.N.g(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i4) {
        if (i4 > 0) {
            return true;
        }
        float i5 = a.i(edgeEffect) * getHeight();
        float abs = Math.abs(-i4) * 0.35f;
        float f4 = this.f2705o * 0.015f;
        double log = Math.log(abs / f4);
        double d = f2687Q;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f4))) < i5;
    }

    public final void u(int i4, int i5, boolean z4) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2706p > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i5 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f2708r.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z4) {
                this.N.g(2, 1);
            } else {
                w(1);
            }
            this.f2700K = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f2708r.isFinished()) {
                this.f2708r.abortAnimation();
                w(1);
            }
            scrollBy(i4, i5);
        }
        this.f2706p = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z4;
        EdgeEffect edgeEffect = this.f2709s;
        if (a.i(edgeEffect) != 0.0f) {
            a.o(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z4 = true;
        } else {
            z4 = false;
        }
        EdgeEffect edgeEffect2 = this.f2710t;
        if (a.i(edgeEffect2) == 0.0f) {
            return z4;
        }
        a.o(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i4) {
        this.N.h(i4);
    }
}
