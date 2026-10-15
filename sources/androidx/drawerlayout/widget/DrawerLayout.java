package androidx.drawerlayout.widget;

import H.A;
import H.AbstractC0044t;
import J.f;
import M.e;
import O.b;
import O.c;
import O.d;
import O.g;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* renamed from: P, reason: collision with root package name */
    public static final int[] f2716P = {R.attr.colorPrimaryDark};

    /* renamed from: Q, reason: collision with root package name */
    public static final int[] f2717Q = {R.attr.layout_gravity};

    /* renamed from: A, reason: collision with root package name */
    public int f2718A;

    /* renamed from: B, reason: collision with root package name */
    public int f2719B;

    /* renamed from: C, reason: collision with root package name */
    public int f2720C;

    /* renamed from: D, reason: collision with root package name */
    public int f2721D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2722E;

    /* renamed from: F, reason: collision with root package name */
    public c f2723F;

    /* renamed from: G, reason: collision with root package name */
    public ArrayList f2724G;

    /* renamed from: H, reason: collision with root package name */
    public float f2725H;

    /* renamed from: I, reason: collision with root package name */
    public float f2726I;

    /* renamed from: J, reason: collision with root package name */
    public Drawable f2727J;

    /* renamed from: K, reason: collision with root package name */
    public WindowInsets f2728K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f2729L;

    /* renamed from: M, reason: collision with root package name */
    public final ArrayList f2730M;
    public Rect N;

    /* renamed from: O, reason: collision with root package name */
    public Matrix f2731O;

    /* renamed from: o, reason: collision with root package name */
    public float f2732o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2733p;

    /* renamed from: q, reason: collision with root package name */
    public int f2734q;

    /* renamed from: r, reason: collision with root package name */
    public float f2735r;

    /* renamed from: s, reason: collision with root package name */
    public final Paint f2736s;

    /* renamed from: t, reason: collision with root package name */
    public final e f2737t;

    /* renamed from: u, reason: collision with root package name */
    public final e f2738u;

    /* renamed from: v, reason: collision with root package name */
    public final g f2739v;

    /* renamed from: w, reason: collision with root package name */
    public final g f2740w;

    /* renamed from: x, reason: collision with root package name */
    public int f2741x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2742z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, android.view.View$OnApplyWindowInsetsListener] */
    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new f(1);
        this.f2734q = -1728053248;
        this.f2736s = new Paint();
        this.f2742z = true;
        this.f2718A = 3;
        this.f2719B = 3;
        this.f2720C = 3;
        this.f2721D = 3;
        setDescendantFocusability(262144);
        float f4 = getResources().getDisplayMetrics().density;
        this.f2733p = (int) ((64.0f * f4) + 0.5f);
        float f5 = 400.0f * f4;
        g gVar = new g(this, 3);
        this.f2739v = gVar;
        g gVar2 = new g(this, 5);
        this.f2740w = gVar2;
        e eVar = new e(getContext(), this, gVar);
        eVar.f1122b = (int) (eVar.f1122b * 1.0f);
        this.f2737t = eVar;
        eVar.f1134p = 1;
        eVar.f1132n = f5;
        gVar.f1248i = eVar;
        e eVar2 = new e(getContext(), this, gVar2);
        eVar2.f1122b = (int) (1.0f * eVar2.f1122b);
        this.f2738u = eVar2;
        eVar2.f1134p = 2;
        eVar2.f1132n = f5;
        gVar2.f1248i = eVar2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = A.f779a;
        setImportantForAccessibility(1);
        A.h(this, new b(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new Object());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f2716P);
            try {
                this.f2727J = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f2732o = f4 * 10.0f;
        this.f2730M = new ArrayList();
    }

    public static String j(int i4) {
        return (i4 & 3) == 3 ? "LEFT" : (i4 & 5) == 5 ? "RIGHT" : Integer.toHexString(i4);
    }

    public static boolean k(View view) {
        return ((d) view.getLayoutParams()).f1240a == 0;
    }

    public static boolean l(View view) {
        if (m(view)) {
            return (((d) view.getLayoutParams()).d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean m(View view) {
        int i4 = ((d) view.getLayoutParams()).f1240a;
        WeakHashMap weakHashMap = A.f779a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final void a(c cVar) {
        if (cVar == null) {
            return;
        }
        if (this.f2724G == null) {
            this.f2724G = new ArrayList();
        }
        this.f2724G.add(cVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i4, int i5) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i6 = 0;
        boolean z4 = false;
        while (true) {
            arrayList2 = this.f2730M;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (!m(childAt)) {
                arrayList2.add(childAt);
            } else if (l(childAt)) {
                childAt.addFocusables(arrayList, i4, i5);
                z4 = true;
            }
            i6++;
        }
        if (!z4) {
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = (View) arrayList2.get(i7);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i4, i5);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        View view2;
        super.addView(view, i4, layoutParams);
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                view2 = null;
                break;
            }
            view2 = getChildAt(i5);
            if ((((d) view2.getLayoutParams()).d & 1) == 1) {
                break;
            } else {
                i5++;
            }
        }
        if (view2 != null || m(view)) {
            WeakHashMap weakHashMap = A.f779a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = A.f779a;
            view.setImportantForAccessibility(1);
        }
    }

    public final boolean b(View view, int i4) {
        return (i(view) & i4) == i4;
    }

    public final void c(int i4) {
        View f4 = f(i4);
        if (f4 != null) {
            d(f4);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + j(i4));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float f4 = 0.0f;
        for (int i4 = 0; i4 < childCount; i4++) {
            f4 = Math.max(f4, ((d) getChildAt(i4).getLayoutParams()).f1241b);
        }
        this.f2735r = f4;
        boolean g4 = this.f2737t.g();
        boolean g5 = this.f2738u.g();
        if (g4 || g5) {
            WeakHashMap weakHashMap = A.f779a;
            postInvalidateOnAnimation();
        }
    }

    public final void d(View view) {
        if (!m(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.f2742z) {
            dVar.f1241b = 0.0f;
            dVar.d = 0;
        } else {
            dVar.d |= 4;
            if (b(view, 3)) {
                this.f2737t.s(view, -view.getWidth(), view.getTop());
            } else {
                this.f2738u.s(view, getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f2735r <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x4 = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt = getChildAt(i4);
            if (this.N == null) {
                this.N = new Rect();
            }
            childAt.getHitRect(this.N);
            if (this.N.contains((int) x4, (int) y) && !k(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.f2731O == null) {
                            this.f2731O = new Matrix();
                        }
                        matrix.invert(this.f2731O);
                        obtain.transform(this.f2731O);
                    }
                    dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                    obtain.recycle();
                }
                if (dispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        Drawable background;
        int height = getHeight();
        boolean k3 = k(view);
        int width = getWidth();
        int save = canvas.save();
        int i4 = 0;
        if (k3) {
            int childCount = getChildCount();
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && m(childAt) && childAt.getHeight() >= height) {
                    if (b(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i5) {
                            i5 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i5, 0, width, getHeight());
            i4 = i5;
        }
        boolean drawChild = super.drawChild(canvas, view, j4);
        canvas.restoreToCount(save);
        float f4 = this.f2735r;
        if (f4 > 0.0f && k3) {
            int i7 = this.f2734q;
            Paint paint = this.f2736s;
            paint.setColor((((int) ((((-16777216) & i7) >>> 24) * f4)) << 24) | (i7 & 16777215));
            canvas.drawRect(i4, 0.0f, width, getHeight(), paint);
        }
        return drawChild;
    }

    public final void e(boolean z4) {
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            d dVar = (d) childAt.getLayoutParams();
            if (m(childAt) && (!z4 || dVar.c)) {
                z5 |= b(childAt, 3) ? this.f2737t.s(childAt, -childAt.getWidth(), childAt.getTop()) : this.f2738u.s(childAt, getWidth(), childAt.getTop());
                dVar.c = false;
            }
        }
        g gVar = this.f2739v;
        gVar.f1250k.removeCallbacks(gVar.f1249j);
        g gVar2 = this.f2740w;
        gVar2.f1250k.removeCallbacks(gVar2.f1249j);
        if (z5) {
            invalidate();
        }
    }

    public final View f(int i4) {
        WeakHashMap weakHashMap = A.f779a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if ((i(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final View g() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (m(childAt)) {
                if (!m(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((d) childAt.getLayoutParams()).f1241b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O.d, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.f1240a = 0;
        return marginLayoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O.d, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f1240a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2717Q);
        marginLayoutParams.f1240a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        return marginLayoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [O.d, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [O.d, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARN: Type inference failed for: r0v4, types: [O.d, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            d dVar = (d) layoutParams;
            ?? marginLayoutParams = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) dVar);
            marginLayoutParams.f1240a = 0;
            marginLayoutParams.f1240a = dVar.f1240a;
            return marginLayoutParams;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? marginLayoutParams2 = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            marginLayoutParams2.f1240a = 0;
            return marginLayoutParams2;
        }
        ?? marginLayoutParams3 = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams3.f1240a = 0;
        return marginLayoutParams3;
    }

    public float getDrawerElevation() {
        return this.f2732o;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f2727J;
    }

    public final int h(View view) {
        if (!m(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i4 = ((d) view.getLayoutParams()).f1240a;
        WeakHashMap weakHashMap = A.f779a;
        int layoutDirection = getLayoutDirection();
        if (i4 == 3) {
            int i5 = this.f2718A;
            if (i5 != 3) {
                return i5;
            }
            int i6 = layoutDirection == 0 ? this.f2720C : this.f2721D;
            if (i6 != 3) {
                return i6;
            }
            return 0;
        }
        if (i4 == 5) {
            int i7 = this.f2719B;
            if (i7 != 3) {
                return i7;
            }
            int i8 = layoutDirection == 0 ? this.f2721D : this.f2720C;
            if (i8 != 3) {
                return i8;
            }
            return 0;
        }
        if (i4 == 8388611) {
            int i9 = this.f2720C;
            if (i9 != 3) {
                return i9;
            }
            int i10 = layoutDirection == 0 ? this.f2718A : this.f2719B;
            if (i10 != 3) {
                return i10;
            }
            return 0;
        }
        if (i4 != 8388613) {
            return 0;
        }
        int i11 = this.f2721D;
        if (i11 != 3) {
            return i11;
        }
        int i12 = layoutDirection == 0 ? this.f2719B : this.f2718A;
        if (i12 != 3) {
            return i12;
        }
        return 0;
    }

    public final int i(View view) {
        int i4 = ((d) view.getLayoutParams()).f1240a;
        WeakHashMap weakHashMap = A.f779a;
        return Gravity.getAbsoluteGravity(i4, getLayoutDirection());
    }

    public final void n(int i4) {
        View f4 = f(i4);
        if (f4 != null) {
            o(f4);
        } else {
            throw new IllegalArgumentException("No drawer view found with gravity " + j(i4));
        }
    }

    public final void o(View view) {
        if (!m(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.f2742z) {
            dVar.f1241b = 1.0f;
            dVar.d = 1;
            r(view, true);
        } else {
            dVar.d |= 2;
            if (b(view, 3)) {
                this.f2737t.s(view, 0, view.getTop());
            } else {
                this.f2738u.s(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2742z = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2742z = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2729L || this.f2727J == null) {
            return;
        }
        WindowInsets windowInsets = this.f2728K;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f2727J.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f2727J.draw(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r0 != 3) goto L19;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            M.e r1 = r8.f2737t
            boolean r2 = r1.r(r9)
            M.e r3 = r8.f2738u
            boolean r3 = r3.r(r9)
            r2 = r2 | r3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L65
            if (r0 == r3) goto L5e
            r9 = 2
            if (r0 == r9) goto L1e
            r9 = 3
            if (r0 == r9) goto L5e
            goto L63
        L1e:
            float[] r9 = r1.d
            int r9 = r9.length
            r0 = r4
        L22:
            if (r0 >= r9) goto L63
            int r5 = r1.f1129k
            int r6 = r3 << r0
            r5 = r5 & r6
            if (r5 == 0) goto L5b
            float[] r5 = r1.f1124f
            r5 = r5[r0]
            float[] r6 = r1.d
            r6 = r6[r0]
            float r5 = r5 - r6
            float[] r6 = r1.f1125g
            r6 = r6[r0]
            float[] r7 = r1.f1123e
            r7 = r7[r0]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r1.f1122b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L5b
            O.g r9 = r8.f2739v
            androidx.drawerlayout.widget.DrawerLayout r0 = r9.f1250k
            D0.o r9 = r9.f1249j
            r0.removeCallbacks(r9)
            O.g r9 = r8.f2740w
            androidx.drawerlayout.widget.DrawerLayout r0 = r9.f1250k
            D0.o r9 = r9.f1249j
            r0.removeCallbacks(r9)
            goto L63
        L5b:
            int r0 = r0 + 1
            goto L22
        L5e:
            r8.e(r3)
            r8.f2722E = r4
        L63:
            r9 = r4
            goto L8b
        L65:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.f2725H = r0
            r8.f2726I = r9
            float r5 = r8.f2735r
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L88
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r1.h(r0, r9)
            if (r9 == 0) goto L88
            boolean r9 = k(r9)
            if (r9 == 0) goto L88
            r9 = r3
            goto L89
        L88:
            r9 = r4
        L89:
            r8.f2722E = r4
        L8b:
            if (r2 != 0) goto Lae
            if (r9 != 0) goto Lae
            int r9 = r8.getChildCount()
            r0 = r4
        L94:
            if (r0 >= r9) goto La8
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            O.d r1 = (O.d) r1
            boolean r1 = r1.c
            if (r1 == 0) goto La5
            goto Lae
        La5:
            int r0 = r0 + 1
            goto L94
        La8:
            boolean r9 = r8.f2722E
            if (r9 == 0) goto Lad
            goto Lae
        Lad:
            return r4
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 != 4 || g() == null) {
            return super.onKeyDown(i4, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i4, KeyEvent keyEvent) {
        if (i4 != 4) {
            return super.onKeyUp(i4, keyEvent);
        }
        View g4 = g();
        if (g4 != null && h(g4) == 0) {
            e(false);
        }
        return g4 != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        float f4;
        int i8;
        boolean z5 = true;
        this.y = true;
        int i9 = i6 - i4;
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (k(childAt)) {
                    int i11 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                    childAt.layout(i11, ((ViewGroup.MarginLayoutParams) dVar).topMargin, childAt.getMeasuredWidth() + i11, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b(childAt, 3)) {
                        float f5 = measuredWidth;
                        i8 = (-measuredWidth) + ((int) (dVar.f1241b * f5));
                        f4 = (measuredWidth + i8) / f5;
                    } else {
                        float f6 = measuredWidth;
                        f4 = (i9 - r11) / f6;
                        i8 = i9 - ((int) (dVar.f1241b * f6));
                    }
                    boolean z6 = f4 != dVar.f1241b ? z5 : false;
                    int i12 = dVar.f1240a & 112;
                    if (i12 == 16) {
                        int i13 = i7 - i5;
                        int i14 = (i13 - measuredHeight) / 2;
                        int i15 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                        if (i14 < i15) {
                            i14 = i15;
                        } else {
                            int i16 = i14 + measuredHeight;
                            int i17 = i13 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                            if (i16 > i17) {
                                i14 = i17 - measuredHeight;
                            }
                        }
                        childAt.layout(i8, i14, measuredWidth + i8, measuredHeight + i14);
                    } else if (i12 != 80) {
                        int i18 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                        childAt.layout(i8, i18, measuredWidth + i8, measuredHeight + i18);
                    } else {
                        int i19 = i7 - i5;
                        childAt.layout(i8, (i19 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i8, i19 - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
                    }
                    if (z6) {
                        q(childAt, f4);
                    }
                    int i20 = dVar.f1241b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i20) {
                        childAt.setVisibility(i20);
                    }
                }
            }
            i10++;
            z5 = true;
        }
        this.y = false;
        this.f2742z = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View f4;
        if (!(parcelable instanceof O.e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        O.e eVar = (O.e) parcelable;
        super.onRestoreInstanceState(eVar.f1071o);
        int i4 = eVar.f1242q;
        if (i4 != 0 && (f4 = f(i4)) != null) {
            o(f4);
        }
        int i5 = eVar.f1243r;
        if (i5 != 3) {
            p(i5, 3);
        }
        int i6 = eVar.f1244s;
        if (i6 != 3) {
            p(i6, 5);
        }
        int i7 = eVar.f1245t;
        if (i7 != 3) {
            p(i7, 8388611);
        }
        int i8 = eVar.f1246u;
        if (i8 != 3) {
            p(i8, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i4) {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [L.b, android.os.Parcelable, O.e] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new L.b(super.onSaveInstanceState());
        bVar.f1242q = 0;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            d dVar = (d) getChildAt(i4).getLayoutParams();
            int i5 = dVar.d;
            boolean z4 = i5 == 1;
            boolean z5 = i5 == 2;
            if (z4 || z5) {
                bVar.f1242q = dVar.f1240a;
                break;
            }
        }
        bVar.f1243r = this.f2718A;
        bVar.f1244s = this.f2719B;
        bVar.f1245t = this.f2720C;
        bVar.f1246u = this.f2721D;
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (h(r1) != 2) goto L27;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            M.e r0 = r6.f2737t
            r0.k(r7)
            M.e r1 = r6.f2738u
            r1.k(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L70
            if (r1 == r3) goto L20
            r7 = 3
            if (r1 == r7) goto L1a
            return r3
        L1a:
            r6.e(r3)
            r6.f2722E = r2
            return r3
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.h(r4, r5)
            if (r4 == 0) goto L6b
            boolean r4 = k(r4)
            if (r4 == 0) goto L6b
            float r4 = r6.f2725H
            float r1 = r1 - r4
            float r4 = r6.f2726I
            float r7 = r7 - r4
            int r0 = r0.f1122b
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L6b
            int r7 = r6.getChildCount()
            r0 = r2
        L4c:
            if (r0 >= r7) goto L61
            android.view.View r1 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            O.d r4 = (O.d) r4
            int r4 = r4.d
            r4 = r4 & r3
            if (r4 != r3) goto L5e
            goto L62
        L5e:
            int r0 = r0 + 1
            goto L4c
        L61:
            r1 = 0
        L62:
            if (r1 == 0) goto L6b
            int r7 = r6.h(r1)
            r0 = 2
            if (r7 != r0) goto L6c
        L6b:
            r2 = r3
        L6c:
            r6.e(r2)
            return r3
        L70:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2725H = r0
            r6.f2726I = r7
            r6.f2722E = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i4, int i5) {
        View f4;
        WeakHashMap weakHashMap = A.f779a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, getLayoutDirection());
        if (i5 == 3) {
            this.f2718A = i4;
        } else if (i5 == 5) {
            this.f2719B = i4;
        } else if (i5 == 8388611) {
            this.f2720C = i4;
        } else if (i5 == 8388613) {
            this.f2721D = i4;
        }
        if (i4 != 0) {
            (absoluteGravity == 3 ? this.f2737t : this.f2738u).a();
        }
        if (i4 != 1) {
            if (i4 == 2 && (f4 = f(absoluteGravity)) != null) {
                o(f4);
                return;
            }
            return;
        }
        View f5 = f(absoluteGravity);
        if (f5 != null) {
            d(f5);
        }
    }

    public final void q(View view, float f4) {
        d dVar = (d) view.getLayoutParams();
        if (f4 == dVar.f1241b) {
            return;
        }
        dVar.f1241b = f4;
        ArrayList arrayList = this.f2724G;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((c) this.f2724G.get(size)).a(f4);
            }
        }
    }

    public final void r(View view, boolean z4) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if ((z4 || m(childAt)) && !(z4 && childAt == view)) {
                WeakHashMap weakHashMap = A.f779a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = A.f779a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (z4) {
            e(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.y) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f4) {
        this.f2732o = f4;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (m(childAt)) {
                float f5 = this.f2732o;
                WeakHashMap weakHashMap = A.f779a;
                AbstractC0044t.j(childAt, f5);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(c cVar) {
        ArrayList arrayList;
        c cVar2 = this.f2723F;
        if (cVar2 != null && (arrayList = this.f2724G) != null) {
            arrayList.remove(cVar2);
        }
        if (cVar != null) {
            a(cVar);
        }
        this.f2723F = cVar;
    }

    public void setDrawerLockMode(int i4) {
        p(i4, 3);
        p(i4, 5);
    }

    public void setScrimColor(int i4) {
        this.f2734q = i4;
        invalidate();
    }

    public void setStatusBarBackground(int i4) {
        this.f2727J = i4 != 0 ? getContext().getDrawable(i4) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f2727J = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i4) {
        this.f2727J = new ColorDrawable(i4);
        invalidate();
    }
}
