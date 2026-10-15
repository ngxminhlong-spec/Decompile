package androidx.coordinatorlayout.widget;

import C0.i0;
import G.b;
import H.A;
import H.AbstractC0044t;
import H.C0034i;
import H.InterfaceC0032g;
import H.InterfaceC0033h;
import H.a0;
import H.r;
import O2.g;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.ads.C0326Qb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import k.o;
import l.n0;
import r.i;
import u.AbstractC2011a;
import v.AbstractC2018b;
import v.InterfaceC2017a;
import v.InterfaceC2019c;
import v.ViewGroupOnHierarchyChangeListenerC2020d;
import v.e;
import v.f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0032g, InterfaceC0033h {

    /* renamed from: H, reason: collision with root package name */
    public static final String f2651H;

    /* renamed from: I, reason: collision with root package name */
    public static final Class[] f2652I;

    /* renamed from: J, reason: collision with root package name */
    public static final ThreadLocal f2653J;

    /* renamed from: K, reason: collision with root package name */
    public static final i0 f2654K;

    /* renamed from: L, reason: collision with root package name */
    public static final b f2655L;

    /* renamed from: A, reason: collision with root package name */
    public boolean f2656A;

    /* renamed from: B, reason: collision with root package name */
    public a0 f2657B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2658C;

    /* renamed from: D, reason: collision with root package name */
    public Drawable f2659D;

    /* renamed from: E, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f2660E;

    /* renamed from: F, reason: collision with root package name */
    public o f2661F;

    /* renamed from: G, reason: collision with root package name */
    public final C0034i f2662G;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f2663o;

    /* renamed from: p, reason: collision with root package name */
    public final C0326Qb f2664p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f2665q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f2666r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f2667s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f2668t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2669u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2670v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f2671w;

    /* renamed from: x, reason: collision with root package name */
    public View f2672x;
    public View y;

    /* renamed from: z, reason: collision with root package name */
    public g f2673z;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f2651H = r02 != null ? r02.getName() : null;
        f2654K = new i0(7);
        f2652I = new Class[]{Context.class, AttributeSet.class};
        f2653J = new ThreadLocal();
        f2655L = new b();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [H.i, java.lang.Object] */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f2663o = new ArrayList();
        this.f2664p = new C0326Qb(22);
        this.f2665q = new ArrayList();
        this.f2666r = new ArrayList();
        this.f2667s = new int[2];
        this.f2668t = new int[2];
        this.f2662G = new Object();
        int[] iArr = AbstractC2011a.f14966a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            n0.b(this, context, iArr, attributeSet, obtainStyledAttributes);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f2671w = intArray;
            float f4 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i4 = 0; i4 < length; i4++) {
                this.f2671w[i4] = (int) (r1[i4] * f4);
            }
        }
        this.f2659D = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC2020d(this));
        WeakHashMap weakHashMap = A.f779a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f2655L.h();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i4, Rect rect, Rect rect2, e eVar, int i5, int i6) {
        int i7 = eVar.c;
        if (i7 == 0) {
            i7 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, i4);
        int i8 = eVar.d;
        if ((i8 & 7) == 0) {
            i8 |= 8388611;
        }
        if ((i8 & 112) == 0) {
            i8 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i8, i4);
        int i9 = absoluteGravity & 7;
        int i10 = absoluteGravity & 112;
        int i11 = absoluteGravity2 & 7;
        int i12 = absoluteGravity2 & 112;
        int width = i11 != 1 ? i11 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i12 != 16 ? i12 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i9 == 1) {
            width -= i5 / 2;
        } else if (i9 != 5) {
            width -= i5;
        }
        if (i10 == 16) {
            height -= i6 / 2;
        } else if (i10 != 80) {
            height -= i6;
        }
        rect2.set(width, height, i5 + width, i6 + height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e n(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f14997b) {
            if (view instanceof InterfaceC2017a) {
                AbstractC2018b behavior = ((InterfaceC2017a) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                eVar.b(behavior);
                eVar.f14997b = true;
                return eVar;
            }
            InterfaceC2019c interfaceC2019c = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                interfaceC2019c = (InterfaceC2019c) cls.getAnnotation(InterfaceC2019c.class);
                if (interfaceC2019c != null) {
                    break;
                }
            }
            if (interfaceC2019c != null) {
                try {
                    eVar.b((AbstractC2018b) interfaceC2019c.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e4) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC2019c.value().getName() + " could not be instantiated. Did you forget a default constructor?", e4);
                }
            }
            eVar.f14997b = true;
        }
        return eVar;
    }

    public static void u(View view, int i4) {
        e eVar = (e) view.getLayoutParams();
        int i5 = eVar.f15002i;
        if (i5 != i4) {
            WeakHashMap weakHashMap = A.f779a;
            view.offsetLeftAndRight(i4 - i5);
            eVar.f15002i = i4;
        }
    }

    public static void v(View view, int i4) {
        e eVar = (e) view.getLayoutParams();
        int i5 = eVar.f15003j;
        if (i5 != i4) {
            WeakHashMap weakHashMap = A.f779a;
            view.offsetTopAndBottom(i4 - i5);
            eVar.f15003j = i4;
        }
    }

    @Override // H.InterfaceC0032g
    public final void a(View view, View view2, int i4, int i5) {
        C0034i c0034i = this.f2662G;
        if (i5 == 1) {
            c0034i.f825b = i4;
        } else {
            c0034i.f824a = i4;
        }
        this.y = view2;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            ((e) getChildAt(i6).getLayoutParams()).getClass();
        }
    }

    @Override // H.InterfaceC0032g
    public final void b(View view, int i4) {
        C0034i c0034i = this.f2662G;
        if (i4 == 1) {
            c0034i.f825b = 0;
        } else {
            c0034i.f824a = 0;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i4)) {
                AbstractC2018b abstractC2018b = eVar.f14996a;
                if (abstractC2018b != null) {
                    abstractC2018b.p(this, childAt, view, i4);
                }
                if (i4 == 0) {
                    eVar.f15006m = false;
                } else if (i4 == 1) {
                    eVar.f15007n = false;
                }
                eVar.f15008o = false;
            }
        }
        this.y = null;
    }

    @Override // H.InterfaceC0032g
    public final void c(View view, int i4, int i5, int[] iArr, int i6) {
        AbstractC2018b abstractC2018b;
        int childCount = getChildCount();
        boolean z4 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i6) && (abstractC2018b = eVar.f14996a) != null) {
                    int[] iArr2 = this.f2667s;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC2018b.j(this, childAt, view, i4, i5, iArr2, i6);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[0]) : Math.min(i7, iArr2[0]);
                    i8 = i5 > 0 ? Math.max(i8, iArr2[1]) : Math.min(i8, iArr2[1]);
                    z4 = true;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
        if (z4) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // H.InterfaceC0033h
    public final void d(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        AbstractC2018b abstractC2018b;
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = 0;
        boolean z4 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i8) && (abstractC2018b = eVar.f14996a) != null) {
                    int[] iArr2 = this.f2667s;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC2018b.k(this, childAt, i5, i6, i7, iArr2);
                    i9 = i6 > 0 ? Math.max(i9, iArr2[0]) : Math.min(i9, iArr2[0]);
                    i10 = i7 > 0 ? Math.max(i10, iArr2[1]) : Math.min(i10, iArr2[1]);
                    z4 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i9;
        iArr[1] = iArr[1] + i10;
        if (z4) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        AbstractC2018b abstractC2018b = ((e) view.getLayoutParams()).f14996a;
        if (abstractC2018b != null) {
            abstractC2018b.getClass();
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2659D;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // H.InterfaceC0032g
    public final void e(View view, int i4, int i5, int i6, int i7, int i8) {
        d(view, i4, i5, i6, i7, 0, this.f2668t);
    }

    @Override // H.InterfaceC0032g
    public final boolean f(View view, View view2, int i4, int i5) {
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                AbstractC2018b abstractC2018b = eVar.f14996a;
                if (abstractC2018b != null) {
                    boolean o4 = abstractC2018b.o(childAt, i4, i5);
                    z4 |= o4;
                    if (i5 == 0) {
                        eVar.f15006m = o4;
                    } else if (i5 == 1) {
                        eVar.f15007n = o4;
                    }
                } else if (i5 == 0) {
                    eVar.f15006m = false;
                } else if (i5 == 1) {
                    eVar.f15007n = false;
                }
            }
        }
        return z4;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f2663o);
    }

    public final a0 getLastWindowInsets() {
        return this.f2657B;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0034i c0034i = this.f2662G;
        return c0034i.f825b | c0034i.f824a;
    }

    public Drawable getStatusBarBackground() {
        return this.f2659D;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(e eVar, Rect rect, int i4, int i5) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i4) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i5) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(max, max2, i4 + max, i5 + max2);
    }

    public final void i(View view, Rect rect, boolean z4) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z4) {
            k(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        i iVar = (i) this.f2664p.f6660p;
        int i4 = iVar.f14741q;
        ArrayList arrayList = null;
        for (int i5 = 0; i5 < i4; i5++) {
            ArrayList arrayList2 = (ArrayList) iVar.i(i5);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(iVar.f(i5));
            }
        }
        ArrayList arrayList3 = this.f2666r;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(Rect rect, View view) {
        ThreadLocal threadLocal = v.g.f15011a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = v.g.f15011a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        v.g.a(this, view, matrix);
        ThreadLocal threadLocal3 = v.g.f15012b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i4) {
        int[] iArr = this.f2671w;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i4);
            return 0;
        }
        if (i4 >= 0 && i4 < iArr.length) {
            return iArr[i4];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i4 + " out of range for " + this);
        return 0;
    }

    public final boolean o(View view, int i4, int i5) {
        b bVar = f2655L;
        Rect g4 = g();
        k(g4, view);
        try {
            return g4.contains(i4, i5);
        } finally {
            g4.setEmpty();
            bVar.j(g4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        int i4 = 1;
        if (this.f2656A) {
            if (this.f2673z == null) {
                this.f2673z = new g(i4, this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2673z);
        }
        if (this.f2657B == null) {
            WeakHashMap weakHashMap = A.f779a;
            if (getFitsSystemWindows()) {
                r.c(this);
            }
        }
        this.f2670v = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f2656A && this.f2673z != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2673z);
        }
        View view = this.y;
        if (view != null) {
            b(view, 0);
        }
        this.f2670v = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2658C || this.f2659D == null) {
            return;
        }
        a0 a0Var = this.f2657B;
        int b4 = a0Var != null ? a0Var.b() : 0;
        if (b4 > 0) {
            this.f2659D.setBounds(0, 0, getWidth(), b4);
            this.f2659D.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean r4 = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return r4;
        }
        t(true);
        return r4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        AbstractC2018b abstractC2018b;
        WeakHashMap weakHashMap = A.f779a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f2663o;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) arrayList.get(i8);
            if (view.getVisibility() != 8 && ((abstractC2018b = ((e) view.getLayoutParams()).f14996a) == null || !abstractC2018b.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        boolean z4;
        ArrayList arrayList;
        int i7;
        boolean z5;
        int i8;
        int i9;
        int i10;
        AbstractC2018b abstractC2018b;
        e eVar;
        View view;
        int i11;
        int i12;
        boolean z6;
        int i13;
        int i14;
        int i15;
        boolean z7;
        int max;
        s();
        int childCount = getChildCount();
        int i16 = 0;
        loop0: while (true) {
            i6 = 1;
            if (i16 >= childCount) {
                z4 = false;
                break;
            }
            View childAt = getChildAt(i16);
            i iVar = (i) this.f2664p.f6660p;
            int i17 = iVar.f14741q;
            for (int i18 = 0; i18 < i17; i18++) {
                ArrayList arrayList2 = (ArrayList) iVar.i(i18);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z4 = true;
                    break loop0;
                }
            }
            i16++;
        }
        if (z4 != this.f2656A) {
            if (z4) {
                if (this.f2670v) {
                    if (this.f2673z == null) {
                        this.f2673z = new g(i6, this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f2673z);
                }
                this.f2656A = true;
            } else {
                if (this.f2670v && this.f2673z != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f2673z);
                }
                this.f2656A = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = A.f779a;
        int layoutDirection = getLayoutDirection();
        boolean z8 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        int i19 = paddingLeft + paddingRight;
        int i20 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z9 = this.f2657B != null && getFitsSystemWindows();
        ArrayList arrayList3 = this.f2663o;
        int size3 = arrayList3.size();
        int i21 = 0;
        int i22 = 0;
        while (i21 < size3) {
            View view2 = (View) arrayList3.get(i21);
            int i23 = suggestedMinimumWidth;
            int i24 = suggestedMinimumHeight;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i9 = size3;
                i13 = paddingLeft;
                suggestedMinimumWidth = i23;
                suggestedMinimumHeight = i24;
                z6 = false;
                i12 = i21;
                i15 = paddingRight;
            } else {
                e eVar2 = (e) view2.getLayoutParams();
                int i25 = eVar2.f14998e;
                if (i25 < 0 || mode == 0) {
                    arrayList = arrayList3;
                } else {
                    int m4 = m(i25);
                    int i26 = eVar2.c;
                    if (i26 == 0) {
                        i26 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i26, layoutDirection) & 7;
                    arrayList = arrayList3;
                    if ((absoluteGravity == 3 && !z8) || (absoluteGravity == 5 && z8)) {
                        z7 = false;
                        max = Math.max(0, (size - paddingRight) - m4);
                    } else if ((absoluteGravity == 5 && !z8) || (absoluteGravity == 3 && z8)) {
                        z7 = false;
                        max = Math.max(0, m4 - paddingLeft);
                    }
                    z5 = z7;
                    i7 = max;
                    if (z9 || view2.getFitsSystemWindows()) {
                        i8 = i4;
                        i9 = size3;
                        i10 = i5;
                    } else {
                        int i27 = this.f2657B.f811a.j().c + this.f2657B.f811a.j().f1a;
                        int a4 = this.f2657B.a() + this.f2657B.b();
                        i8 = View.MeasureSpec.makeMeasureSpec(size - i27, mode);
                        i9 = size3;
                        i10 = View.MeasureSpec.makeMeasureSpec(size2 - a4, mode2);
                    }
                    abstractC2018b = eVar2.f14996a;
                    if (abstractC2018b == null && abstractC2018b.h(this, view2)) {
                        z6 = z5;
                        i13 = paddingLeft;
                        i14 = i24;
                        i15 = paddingRight;
                        eVar = eVar2;
                        view = view2;
                        i11 = i23;
                        i12 = i21;
                    } else {
                        int i28 = paddingRight;
                        eVar = eVar2;
                        view = view2;
                        i11 = i23;
                        i12 = i21;
                        int i29 = i8;
                        z6 = z5;
                        i13 = paddingLeft;
                        i14 = i24;
                        i15 = i28;
                        measureChildWithMargins(view, i29, i7, i10, 0);
                    }
                    int max2 = Math.max(i11, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    int max3 = Math.max(i14, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                    suggestedMinimumWidth = max2;
                    suggestedMinimumHeight = max3;
                }
                i7 = 0;
                z5 = false;
                if (z9) {
                }
                i8 = i4;
                i9 = size3;
                i10 = i5;
                abstractC2018b = eVar2.f14996a;
                if (abstractC2018b == null) {
                }
                int i282 = paddingRight;
                eVar = eVar2;
                view = view2;
                i11 = i23;
                i12 = i21;
                int i292 = i8;
                z6 = z5;
                i13 = paddingLeft;
                i14 = i24;
                i15 = i282;
                measureChildWithMargins(view, i292, i7, i10, 0);
                int max22 = Math.max(i11, view.getMeasuredWidth() + i19 + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                int max32 = Math.max(i14, view.getMeasuredHeight() + i20 + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                i22 = View.combineMeasuredStates(i22, view.getMeasuredState());
                suggestedMinimumWidth = max22;
                suggestedMinimumHeight = max32;
            }
            i21 = i12 + 1;
            paddingLeft = i13;
            paddingRight = i15;
            size3 = i9;
            arrayList3 = arrayList;
        }
        int i30 = i22;
        setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i4, (-16777216) & i30), View.resolveSizeAndState(suggestedMinimumHeight, i5, i30 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f4, float f5, boolean z4) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    AbstractC2018b abstractC2018b = eVar.f14996a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f4, float f5) {
        AbstractC2018b abstractC2018b;
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (abstractC2018b = eVar.f14996a) != null) {
                    z4 |= abstractC2018b.i(view);
                }
            }
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        c(view, i4, i5, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        e(view, i4, i5, i6, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        a(view, view2, i4, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f1071o);
        SparseArray sparseArray = fVar.f15010q;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            AbstractC2018b abstractC2018b = n(childAt).f14996a;
            if (id != -1 && abstractC2018b != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC2018b.m(childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [L.b, android.os.Parcelable, v.f] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n4;
        ?? bVar = new L.b(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            AbstractC2018b abstractC2018b = ((e) childAt.getLayoutParams()).f14996a;
            if (id != -1 && abstractC2018b != null && (n4 = abstractC2018b.n(childAt)) != null) {
                sparseArray.append(id, n4);
            }
        }
        bVar.f15010q = sparseArray;
        return bVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        return f(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f2672x
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f2672x
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            v.e r6 = (v.e) r6
            v.b r6 = r6.f14996a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f2672x
            boolean r6 = r6.q(r7, r1)
        L2a:
            android.view.View r7 = r0.f2672x
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.t(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i4) {
        int i5;
        Rect rect;
        int i6;
        ArrayList arrayList;
        boolean z4;
        boolean z5;
        int width;
        int i7;
        int i8;
        int i9;
        int height;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList2;
        e eVar;
        int i13;
        int i14;
        Rect rect2;
        int i15;
        View view;
        AbstractC2018b abstractC2018b;
        WeakHashMap weakHashMap = A.f779a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f2663o;
        int size = arrayList3.size();
        Rect g4 = g();
        Rect g5 = g();
        Rect g6 = g();
        int i16 = 0;
        while (true) {
            b bVar = f2655L;
            if (i16 >= size) {
                Rect rect3 = g6;
                g4.setEmpty();
                bVar.j(g4);
                g5.setEmpty();
                bVar.j(g5);
                rect3.setEmpty();
                bVar.j(rect3);
                return;
            }
            View view2 = (View) arrayList3.get(i16);
            e eVar2 = (e) view2.getLayoutParams();
            if (i4 != 0 || view2.getVisibility() != 8) {
                int i17 = 0;
                while (i17 < i16) {
                    if (eVar2.f15005l == ((View) arrayList3.get(i17))) {
                        e eVar3 = (e) view2.getLayoutParams();
                        if (eVar3.f15004k != null) {
                            Rect g7 = g();
                            Rect g8 = g();
                            e eVar4 = eVar2;
                            Rect g9 = g();
                            k(g7, eVar3.f15004k);
                            i(view2, g8, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            arrayList2 = arrayList3;
                            eVar = eVar4;
                            i13 = i17;
                            layoutDirection = layoutDirection;
                            i15 = i16;
                            view = view3;
                            l(layoutDirection, g7, g9, eVar3, measuredWidth, measuredHeight);
                            i14 = size;
                            rect2 = g6;
                            boolean z6 = (g9.left == g8.left && g9.top == g8.top) ? false : true;
                            h(eVar3, g9, measuredWidth, measuredHeight);
                            int i18 = g9.left - g8.left;
                            int i19 = g9.top - g8.top;
                            if (i18 != 0) {
                                WeakHashMap weakHashMap2 = A.f779a;
                                view.offsetLeftAndRight(i18);
                            }
                            if (i19 != 0) {
                                WeakHashMap weakHashMap3 = A.f779a;
                                view.offsetTopAndBottom(i19);
                            }
                            if (z6 && (abstractC2018b = eVar3.f14996a) != null) {
                                abstractC2018b.d(view, eVar3.f15004k);
                            }
                            g7.setEmpty();
                            bVar.j(g7);
                            g8.setEmpty();
                            bVar.j(g8);
                            g9.setEmpty();
                            bVar.j(g9);
                            i17 = i13 + 1;
                            eVar2 = eVar;
                            view2 = view;
                            arrayList3 = arrayList2;
                            size = i14;
                            i16 = i15;
                            g6 = rect2;
                        }
                    }
                    arrayList2 = arrayList3;
                    eVar = eVar2;
                    i13 = i17;
                    i14 = size;
                    rect2 = g6;
                    i15 = i16;
                    view = view2;
                    i17 = i13 + 1;
                    eVar2 = eVar;
                    view2 = view;
                    arrayList3 = arrayList2;
                    size = i14;
                    i16 = i15;
                    g6 = rect2;
                }
                ArrayList arrayList4 = arrayList3;
                e eVar5 = eVar2;
                int i20 = size;
                Rect rect4 = g6;
                i5 = i16;
                View view4 = view2;
                i(view4, g5, true);
                if (eVar5.f15000g != 0 && !g5.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(eVar5.f15000g, layoutDirection);
                    int i21 = absoluteGravity & 112;
                    if (i21 == 48) {
                        g4.top = Math.max(g4.top, g5.bottom);
                    } else if (i21 == 80) {
                        g4.bottom = Math.max(g4.bottom, getHeight() - g5.top);
                    }
                    int i22 = absoluteGravity & 7;
                    if (i22 == 3) {
                        g4.left = Math.max(g4.left, g5.right);
                    } else if (i22 == 5) {
                        g4.right = Math.max(g4.right, getWidth() - g5.left);
                    }
                }
                if (eVar5.f15001h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = A.f779a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        e eVar6 = (e) view4.getLayoutParams();
                        AbstractC2018b abstractC2018b2 = eVar6.f14996a;
                        Rect g10 = g();
                        Rect g11 = g();
                        g11.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (abstractC2018b2 == null || !abstractC2018b2.a(g10, view4)) {
                            g10.set(g11);
                        } else if (!g11.contains(g10)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + g10.toShortString() + " | Bounds:" + g11.toShortString());
                        }
                        g11.setEmpty();
                        bVar.j(g11);
                        if (g10.isEmpty()) {
                            g10.setEmpty();
                            bVar.j(g10);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(eVar6.f15001h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i11 = (g10.top - ((ViewGroup.MarginLayoutParams) eVar6).topMargin) - eVar6.f15003j) >= (i12 = g4.top)) {
                                z4 = false;
                            } else {
                                v(view4, i12 - i11);
                                z4 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - g10.bottom) - ((ViewGroup.MarginLayoutParams) eVar6).bottomMargin) + eVar6.f15003j) < (i10 = g4.bottom)) {
                                v(view4, height - i10);
                                z4 = true;
                            }
                            if (!z4) {
                                v(view4, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i8 = (g10.left - ((ViewGroup.MarginLayoutParams) eVar6).leftMargin) - eVar6.f15002i) >= (i9 = g4.left)) {
                                z5 = false;
                            } else {
                                u(view4, i9 - i8);
                                z5 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - g10.right) - ((ViewGroup.MarginLayoutParams) eVar6).rightMargin) + eVar6.f15002i) < (i7 = g4.right)) {
                                u(view4, width - i7);
                                z5 = true;
                            }
                            if (!z5) {
                                u(view4, 0);
                            }
                            g10.setEmpty();
                            bVar.j(g10);
                        }
                    }
                }
                if (i4 != 2) {
                    rect = rect4;
                    rect.set(((e) view4.getLayoutParams()).f15009p);
                    if (rect.equals(g5)) {
                        arrayList = arrayList4;
                        i6 = i20;
                    } else {
                        ((e) view4.getLayoutParams()).f15009p.set(g5);
                    }
                } else {
                    rect = rect4;
                }
                int i23 = i5 + 1;
                i6 = i20;
                while (true) {
                    arrayList = arrayList4;
                    if (i23 >= i6) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i23);
                    e eVar7 = (e) view5.getLayoutParams();
                    AbstractC2018b abstractC2018b3 = eVar7.f14996a;
                    if (abstractC2018b3 != null && abstractC2018b3.b(view5, view4)) {
                        if (i4 == 0 && eVar7.f15008o) {
                            eVar7.f15008o = false;
                        } else {
                            boolean d = i4 != 2 ? abstractC2018b3.d(view5, view4) : true;
                            if (i4 == 1) {
                                eVar7.f15008o = d;
                            }
                        }
                    }
                    i23++;
                    arrayList4 = arrayList;
                }
            } else {
                arrayList = arrayList3;
                i6 = size;
                rect = g6;
                i5 = i16;
            }
            i16 = i5 + 1;
            g6 = rect;
            size = i6;
            arrayList3 = arrayList;
        }
    }

    public final void q(View view, int i4) {
        Rect g4;
        Rect g5;
        e eVar = (e) view.getLayoutParams();
        View view2 = eVar.f15004k;
        if (view2 == null && eVar.f14999f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        b bVar = f2655L;
        if (view2 != null) {
            g4 = g();
            g5 = g();
            try {
                k(g4, view2);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i4, g4, g5, eVar2, measuredWidth, measuredHeight);
                h(eVar2, g5, measuredWidth, measuredHeight);
                view.layout(g5.left, g5.top, g5.right, g5.bottom);
                return;
            } finally {
                g4.setEmpty();
                bVar.j(g4);
                g5.setEmpty();
                bVar.j(g5);
            }
        }
        int i5 = eVar.f14998e;
        if (i5 < 0) {
            e eVar3 = (e) view.getLayoutParams();
            g4 = g();
            g4.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin);
            if (this.f2657B != null) {
                WeakHashMap weakHashMap = A.f779a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    g4.left = this.f2657B.f811a.j().f1a + g4.left;
                    g4.top = this.f2657B.b() + g4.top;
                    g4.right -= this.f2657B.f811a.j().c;
                    g4.bottom -= this.f2657B.a();
                }
            }
            g5 = g();
            int i6 = eVar3.c;
            if ((i6 & 7) == 0) {
                i6 |= 8388611;
            }
            if ((i6 & 112) == 0) {
                i6 |= 48;
            }
            Gravity.apply(i6, view.getMeasuredWidth(), view.getMeasuredHeight(), g4, g5, i4);
            view.layout(g5.left, g5.top, g5.right, g5.bottom);
            return;
        }
        e eVar4 = (e) view.getLayoutParams();
        int i7 = eVar4.c;
        if (i7 == 0) {
            i7 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, i4);
        int i8 = absoluteGravity & 7;
        int i9 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i4 == 1) {
            i5 = width - i5;
        }
        int m4 = m(i5) - measuredWidth2;
        if (i8 == 1) {
            m4 += measuredWidth2 / 2;
        } else if (i8 == 5) {
            m4 += measuredWidth2;
        }
        int i10 = i9 != 16 ? i9 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, Math.min(m4, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, Math.min(i10, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean r(MotionEvent motionEvent, int i4) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f2665q;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i5) : i5));
        }
        i0 i0Var = f2654K;
        if (i0Var != null) {
            Collections.sort(arrayList, i0Var);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z4 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) arrayList.get(i6);
            AbstractC2018b abstractC2018b = ((e) view.getLayoutParams()).f14996a;
            if (z4 && actionMasked != 0) {
                if (abstractC2018b != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i4 == 0) {
                        abstractC2018b.f(this, view, motionEvent2);
                    } else if (i4 == 1) {
                        abstractC2018b.q(view, motionEvent2);
                    }
                }
            } else if (!z4 && abstractC2018b != null) {
                if (i4 == 0) {
                    z4 = abstractC2018b.f(this, view, motionEvent);
                } else if (i4 == 1) {
                    z4 = abstractC2018b.q(view, motionEvent);
                }
                if (z4) {
                    this.f2672x = view;
                }
            }
        }
        arrayList.clear();
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        AbstractC2018b abstractC2018b = ((e) view.getLayoutParams()).f14996a;
        if (abstractC2018b != null) {
            abstractC2018b.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (!z4 || this.f2669u) {
            return;
        }
        t(false);
        this.f2669u = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f9, code lost:
    
        if ((android.view.Gravity.getAbsoluteGravity(r8.f15001h, r12) & r13) == r13) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z4) {
        super.setFitsSystemWindows(z4);
        w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2660E = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f2659D;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f2659D = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f2659D.setState(getDrawableState());
                }
                Drawable drawable3 = this.f2659D;
                WeakHashMap weakHashMap = A.f779a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f2659D.setVisible(getVisibility() == 0, false);
                this.f2659D.setCallback(this);
            }
            WeakHashMap weakHashMap2 = A.f779a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i4) {
        setStatusBarBackground(new ColorDrawable(i4));
    }

    public void setStatusBarBackgroundResource(int i4) {
        setStatusBarBackground(i4 != 0 ? getContext().getDrawable(i4) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z4 = i4 == 0;
        Drawable drawable = this.f2659D;
        if (drawable == null || drawable.isVisible() == z4) {
            return;
        }
        this.f2659D.setVisible(z4, false);
    }

    public final void t(boolean z4) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            AbstractC2018b abstractC2018b = ((e) childAt.getLayoutParams()).f14996a;
            if (abstractC2018b != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z4) {
                    abstractC2018b.f(this, childAt, obtain);
                } else {
                    abstractC2018b.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            ((e) getChildAt(i5).getLayoutParams()).getClass();
        }
        this.f2672x = null;
        this.f2669u = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2659D;
    }

    public final void w() {
        WeakHashMap weakHashMap = A.f779a;
        if (!getFitsSystemWindows()) {
            AbstractC0044t.k(this, null);
            return;
        }
        if (this.f2661F == null) {
            this.f2661F = new o(18, this);
        }
        AbstractC0044t.k(this, this.f2661F);
        setSystemUiVisibility(1280);
    }
}
