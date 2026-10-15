package com.google.android.material.bottomsheet;

import B0.r;
import B2.a;
import C0.O;
import G2.b;
import G2.c;
import G2.f;
import H.A;
import H.AbstractC0044t;
import I.d;
import M.e;
import V2.g;
import V2.k;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import d3.AbstractC1654b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import v.AbstractC2018b;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC2018b {

    /* renamed from: A, reason: collision with root package name */
    public int f12285A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f12286B;

    /* renamed from: C, reason: collision with root package name */
    public int f12287C;

    /* renamed from: D, reason: collision with root package name */
    public int f12288D;

    /* renamed from: E, reason: collision with root package name */
    public WeakReference f12289E;

    /* renamed from: F, reason: collision with root package name */
    public WeakReference f12290F;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f12291G;

    /* renamed from: H, reason: collision with root package name */
    public VelocityTracker f12292H;

    /* renamed from: I, reason: collision with root package name */
    public int f12293I;

    /* renamed from: J, reason: collision with root package name */
    public int f12294J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f12295K;

    /* renamed from: L, reason: collision with root package name */
    public HashMap f12296L;

    /* renamed from: M, reason: collision with root package name */
    public final b f12297M;

    /* renamed from: a, reason: collision with root package name */
    public final int f12298a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12299b;
    public final float c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12300e;

    /* renamed from: f, reason: collision with root package name */
    public int f12301f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12302g;

    /* renamed from: h, reason: collision with root package name */
    public g f12303h;

    /* renamed from: i, reason: collision with root package name */
    public int f12304i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12305j;

    /* renamed from: k, reason: collision with root package name */
    public k f12306k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12307l;

    /* renamed from: m, reason: collision with root package name */
    public f f12308m;

    /* renamed from: n, reason: collision with root package name */
    public final ValueAnimator f12309n;

    /* renamed from: o, reason: collision with root package name */
    public final int f12310o;

    /* renamed from: p, reason: collision with root package name */
    public int f12311p;

    /* renamed from: q, reason: collision with root package name */
    public int f12312q;

    /* renamed from: r, reason: collision with root package name */
    public final float f12313r;

    /* renamed from: s, reason: collision with root package name */
    public int f12314s;

    /* renamed from: t, reason: collision with root package name */
    public final float f12315t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f12316u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f12317v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f12318w;

    /* renamed from: x, reason: collision with root package name */
    public int f12319x;
    public e y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f12320z;

    public BottomSheetBehavior() {
        this.f12298a = 0;
        this.f12299b = true;
        this.f12308m = null;
        this.f12313r = 0.5f;
        this.f12315t = -1.0f;
        this.f12318w = true;
        this.f12319x = 4;
        this.f12291G = new ArrayList();
        this.f12297M = new b(this);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i4;
        this.f12298a = 0;
        this.f12299b = true;
        this.f12308m = null;
        this.f12313r = 0.5f;
        this.f12315t = -1.0f;
        this.f12318w = true;
        this.f12319x = 4;
        this.f12291G = new ArrayList();
        this.f12297M = new b(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f137a);
        this.f12302g = obtainStyledAttributes.hasValue(11);
        boolean hasValue = obtainStyledAttributes.hasValue(1);
        if (hasValue) {
            t(context, attributeSet, hasValue, AbstractC1654b.u(context, obtainStyledAttributes, 1));
        } else {
            t(context, attributeSet, hasValue, null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f12309n = ofFloat;
        ofFloat.setDuration(500L);
        this.f12309n.addUpdateListener(new G2.a(0, this));
        this.f12315t = obtainStyledAttributes.getDimension(0, -1.0f);
        TypedValue peekValue = obtainStyledAttributes.peekValue(7);
        if (peekValue == null || (i4 = peekValue.data) != -1) {
            y(obtainStyledAttributes.getDimensionPixelSize(7, -1));
        } else {
            y(i4);
        }
        boolean z4 = obtainStyledAttributes.getBoolean(6, false);
        if (this.f12316u != z4) {
            this.f12316u = z4;
            if (!z4 && this.f12319x == 5) {
                z(4);
            }
            E();
        }
        this.f12305j = obtainStyledAttributes.getBoolean(10, false);
        boolean z5 = obtainStyledAttributes.getBoolean(4, true);
        if (this.f12299b != z5) {
            this.f12299b = z5;
            if (this.f12289E != null) {
                r();
            }
            A((this.f12299b && this.f12319x == 6) ? 3 : this.f12319x);
            E();
        }
        this.f12317v = obtainStyledAttributes.getBoolean(9, false);
        this.f12318w = obtainStyledAttributes.getBoolean(2, true);
        this.f12298a = obtainStyledAttributes.getInt(8, 0);
        float f4 = obtainStyledAttributes.getFloat(5, 0.5f);
        if (f4 <= 0.0f || f4 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f12313r = f4;
        if (this.f12289E != null) {
            this.f12312q = (int) ((1.0f - f4) * this.f12288D);
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(3);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            if (dimensionPixelOffset < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.f12310o = dimensionPixelOffset;
        } else {
            int i5 = peekValue2.data;
            if (i5 < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.f12310o = i5;
        }
        obtainStyledAttributes.recycle();
        this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View v(View view) {
        WeakHashMap weakHashMap = A.f779a;
        if (AbstractC0044t.g(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View v4 = v(viewGroup.getChildAt(i4));
            if (v4 != null) {
                return v4;
            }
        }
        return null;
    }

    public static BottomSheetBehavior w(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof v.e)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        AbstractC2018b abstractC2018b = ((v.e) layoutParams).f14996a;
        if (abstractC2018b instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) abstractC2018b;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public final void A(int i4) {
        if (this.f12319x == i4) {
            return;
        }
        this.f12319x = i4;
        WeakReference weakReference = this.f12289E;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        int i5 = 0;
        if (i4 == 3) {
            G(true);
        } else if (i4 == 6 || i4 == 5 || i4 == 4) {
            G(false);
        }
        F(i4);
        while (true) {
            ArrayList arrayList = this.f12291G;
            if (i5 >= arrayList.size()) {
                E();
                return;
            } else {
                ((c) arrayList.get(i5)).b(i4);
                i5++;
            }
        }
    }

    public final void B(View view, int i4) {
        int i5;
        int i6;
        if (i4 == 4) {
            i5 = this.f12314s;
        } else if (i4 == 6) {
            i5 = this.f12312q;
            if (this.f12299b && i5 <= (i6 = this.f12311p)) {
                i4 = 3;
                i5 = i6;
            }
        } else if (i4 == 3) {
            i5 = x();
        } else {
            if (!this.f12316u || i4 != 5) {
                throw new IllegalArgumentException(U.a.i("Illegal state argument: ", i4));
            }
            i5 = this.f12288D;
        }
        D(view, i4, i5, false);
    }

    public final boolean C(View view, float f4) {
        if (this.f12317v) {
            return true;
        }
        if (view.getTop() < this.f12314s) {
            return false;
        }
        return Math.abs(((f4 * 0.1f) + ((float) view.getTop())) - ((float) this.f12314s)) / ((float) s()) > 0.5f;
    }

    public final void D(View view, int i4, int i5, boolean z4) {
        if (!(z4 ? this.y.q(view.getLeft(), i5) : this.y.s(view, view.getLeft(), i5))) {
            A(i4);
            return;
        }
        A(2);
        F(i4);
        if (this.f12308m == null) {
            this.f12308m = new f(this, view, i4);
        }
        f fVar = this.f12308m;
        if (fVar.f776q) {
            fVar.f777r = i4;
            return;
        }
        fVar.f777r = i4;
        WeakHashMap weakHashMap = A.f779a;
        view.postOnAnimation(fVar);
        this.f12308m.f776q = true;
    }

    public final void E() {
        View view;
        WeakReference weakReference = this.f12289E;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        A.f(view, 524288);
        A.e(view, 0);
        A.f(view, 262144);
        A.e(view, 0);
        A.f(view, 1048576);
        A.e(view, 0);
        if (this.f12316u && this.f12319x != 5) {
            A.g(view, d.f913l, new r(5, this));
        }
        int i4 = this.f12319x;
        if (i4 == 3) {
            A.g(view, d.f912k, new r(this.f12299b ? 4 : 6, this));
            return;
        }
        if (i4 == 4) {
            A.g(view, d.f911j, new r(this.f12299b ? 3 : 6, this));
        } else {
            if (i4 != 6) {
                return;
            }
            A.g(view, d.f912k, new r(4, this));
            A.g(view, d.f911j, new r(3, this));
        }
    }

    public final void F(int i4) {
        ValueAnimator valueAnimator;
        if (i4 == 2) {
            return;
        }
        boolean z4 = i4 == 3;
        if (this.f12307l != z4) {
            this.f12307l = z4;
            if (this.f12303h == null || (valueAnimator = this.f12309n) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            }
            float f4 = z4 ? 0.0f : 1.0f;
            valueAnimator.setFloatValues(1.0f - f4, f4);
            valueAnimator.start();
        }
    }

    public final void G(boolean z4) {
        WeakReference weakReference = this.f12289E;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z4) {
                if (this.f12296L != null) {
                    return;
                } else {
                    this.f12296L = new HashMap(childCount);
                }
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if (childAt != this.f12289E.get() && z4) {
                    this.f12296L.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z4) {
                return;
            }
            this.f12296L = null;
        }
    }

    public final void H() {
        View view;
        if (this.f12289E != null) {
            r();
            if (this.f12319x != 4 || (view = (View) this.f12289E.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // v.AbstractC2018b
    public final void c(v.e eVar) {
        this.f12289E = null;
        this.y = null;
    }

    @Override // v.AbstractC2018b
    public final void e() {
        this.f12289E = null;
        this.y = null;
    }

    @Override // v.AbstractC2018b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        if (!view.isShown() || !this.f12318w) {
            this.f12320z = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f12293I = -1;
            VelocityTracker velocityTracker = this.f12292H;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f12292H = null;
            }
        }
        if (this.f12292H == null) {
            this.f12292H = VelocityTracker.obtain();
        }
        this.f12292H.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x4 = (int) motionEvent.getX();
            this.f12294J = (int) motionEvent.getY();
            if (this.f12319x != 2) {
                WeakReference weakReference = this.f12290F;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x4, this.f12294J)) {
                    this.f12293I = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f12295K = true;
                }
            }
            this.f12320z = this.f12293I == -1 && !coordinatorLayout.o(view, x4, this.f12294J);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f12295K = false;
            this.f12293I = -1;
            if (this.f12320z) {
                this.f12320z = false;
                return false;
            }
        }
        if (this.f12320z || (eVar = this.y) == null || !eVar.r(motionEvent)) {
            WeakReference weakReference2 = this.f12290F;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f12320z || this.f12319x == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.y == null || Math.abs(this.f12294J - motionEvent.getY()) <= this.y.f1122b) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    @Override // v.AbstractC2018b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        g gVar;
        WeakHashMap weakHashMap = A.f779a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f12289E == null) {
            this.f12301f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.f12305j && !this.f12300e) {
                x0.f fVar = new x0.f(12, this);
                view.getPaddingStart();
                view.getPaddingTop();
                view.getPaddingEnd();
                view.getPaddingBottom();
                AbstractC0044t.k(view, new D3.d(fVar, new C2033d(11)));
                if (view.isAttachedToWindow()) {
                    H.r.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new Object());
                }
            }
            this.f12289E = new WeakReference(view);
            if (this.f12302g && (gVar = this.f12303h) != null) {
                view.setBackground(gVar);
            }
            g gVar2 = this.f12303h;
            if (gVar2 != null) {
                float f4 = this.f12315t;
                if (f4 == -1.0f) {
                    f4 = AbstractC0044t.d(view);
                }
                gVar2.h(f4);
                boolean z4 = this.f12319x == 3;
                this.f12307l = z4;
                g gVar3 = this.f12303h;
                float f5 = z4 ? 0.0f : 1.0f;
                V2.f fVar2 = gVar3.f1880o;
                if (fVar2.f1860i != f5) {
                    fVar2.f1860i = f5;
                    gVar3.f1884s = true;
                    gVar3.invalidateSelf();
                }
            }
            E();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.y == null) {
            this.y = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f12297M);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i4);
        this.f12287C = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.f12288D = height;
        this.f12311p = Math.max(0, height - view.getHeight());
        this.f12312q = (int) ((1.0f - this.f12313r) * this.f12288D);
        r();
        int i5 = this.f12319x;
        if (i5 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i5 == 6) {
            view.offsetTopAndBottom(this.f12312q);
        } else if (this.f12316u && i5 == 5) {
            view.offsetTopAndBottom(this.f12288D);
        } else if (i5 == 4) {
            view.offsetTopAndBottom(this.f12314s);
        } else if (i5 == 1 || i5 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        this.f12290F = new WeakReference(v(view));
        return true;
    }

    @Override // v.AbstractC2018b
    public final boolean i(View view) {
        WeakReference weakReference = this.f12290F;
        return (weakReference == null || view != weakReference.get() || this.f12319x == 3) ? false : true;
    }

    @Override // v.AbstractC2018b
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr, int i6) {
        if (i6 == 1) {
            return;
        }
        WeakReference weakReference = this.f12290F;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i7 = top - i5;
        boolean z4 = this.f12318w;
        if (i5 > 0) {
            if (i7 < x()) {
                int x4 = top - x();
                iArr[1] = x4;
                int i8 = -x4;
                WeakHashMap weakHashMap = A.f779a;
                view.offsetTopAndBottom(i8);
                A(3);
            } else {
                if (!z4) {
                    return;
                }
                iArr[1] = i5;
                WeakHashMap weakHashMap2 = A.f779a;
                view.offsetTopAndBottom(-i5);
                A(1);
            }
        } else if (i5 < 0 && !view2.canScrollVertically(-1)) {
            int i9 = this.f12314s;
            if (i7 > i9 && !this.f12316u) {
                int i10 = top - i9;
                iArr[1] = i10;
                int i11 = -i10;
                WeakHashMap weakHashMap3 = A.f779a;
                view.offsetTopAndBottom(i11);
                A(4);
            } else {
                if (!z4) {
                    return;
                }
                iArr[1] = i5;
                WeakHashMap weakHashMap4 = A.f779a;
                view.offsetTopAndBottom(-i5);
                A(1);
            }
        }
        u(view.getTop());
        this.f12285A = i5;
        this.f12286B = true;
    }

    @Override // v.AbstractC2018b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int[] iArr) {
    }

    @Override // v.AbstractC2018b
    public final void m(View view, Parcelable parcelable) {
        G2.e eVar = (G2.e) parcelable;
        int i4 = this.f12298a;
        if (i4 != 0) {
            if (i4 == -1 || (i4 & 1) == 1) {
                this.d = eVar.f770r;
            }
            if (i4 == -1 || (i4 & 2) == 2) {
                this.f12299b = eVar.f771s;
            }
            if (i4 == -1 || (i4 & 4) == 4) {
                this.f12316u = eVar.f772t;
            }
            if (i4 == -1 || (i4 & 8) == 8) {
                this.f12317v = eVar.f773u;
            }
        }
        int i5 = eVar.f769q;
        if (i5 == 1 || i5 == 2) {
            this.f12319x = 4;
        } else {
            this.f12319x = i5;
        }
    }

    @Override // v.AbstractC2018b
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new G2.e(this);
    }

    @Override // v.AbstractC2018b
    public final boolean o(View view, int i4, int i5) {
        this.f12285A = 0;
        this.f12286B = false;
        return (i4 & 2) != 0;
    }

    @Override // v.AbstractC2018b
    public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i4) {
        int i5;
        float yVelocity;
        int i6 = 3;
        if (view.getTop() == x()) {
            A(3);
            return;
        }
        WeakReference weakReference = this.f12290F;
        if (weakReference != null && view2 == weakReference.get() && this.f12286B) {
            if (this.f12285A <= 0) {
                if (this.f12316u) {
                    VelocityTracker velocityTracker = this.f12292H;
                    if (velocityTracker == null) {
                        yVelocity = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(1000, this.c);
                        yVelocity = this.f12292H.getYVelocity(this.f12293I);
                    }
                    if (C(view, yVelocity)) {
                        i5 = this.f12288D;
                        i6 = 5;
                    }
                }
                if (this.f12285A == 0) {
                    int top = view.getTop();
                    if (!this.f12299b) {
                        int i7 = this.f12312q;
                        if (top < i7) {
                            if (top < Math.abs(top - this.f12314s)) {
                                i5 = this.f12310o;
                            } else {
                                i5 = this.f12312q;
                            }
                        } else if (Math.abs(top - i7) < Math.abs(top - this.f12314s)) {
                            i5 = this.f12312q;
                        } else {
                            i5 = this.f12314s;
                            i6 = 4;
                        }
                        i6 = 6;
                    } else if (Math.abs(top - this.f12311p) < Math.abs(top - this.f12314s)) {
                        i5 = this.f12311p;
                    } else {
                        i5 = this.f12314s;
                        i6 = 4;
                    }
                } else {
                    if (this.f12299b) {
                        i5 = this.f12314s;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - this.f12312q) < Math.abs(top2 - this.f12314s)) {
                            i5 = this.f12312q;
                            i6 = 6;
                        } else {
                            i5 = this.f12314s;
                        }
                    }
                    i6 = 4;
                }
            } else if (this.f12299b) {
                i5 = this.f12311p;
            } else {
                int top3 = view.getTop();
                int i8 = this.f12312q;
                if (top3 > i8) {
                    i6 = 6;
                    i5 = i8;
                } else {
                    i5 = this.f12310o;
                }
            }
            D(view, i6, i5, false);
            this.f12286B = false;
        }
    }

    @Override // v.AbstractC2018b
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f12319x == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.y;
        if (eVar != null) {
            eVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.f12293I = -1;
            VelocityTracker velocityTracker = this.f12292H;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f12292H = null;
            }
        }
        if (this.f12292H == null) {
            this.f12292H = VelocityTracker.obtain();
        }
        this.f12292H.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f12320z) {
            float abs = Math.abs(this.f12294J - motionEvent.getY());
            e eVar2 = this.y;
            if (abs > eVar2.f1122b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f12320z;
    }

    public final void r() {
        int s4 = s();
        if (this.f12299b) {
            this.f12314s = Math.max(this.f12288D - s4, this.f12311p);
        } else {
            this.f12314s = this.f12288D - s4;
        }
    }

    public final int s() {
        if (this.f12300e) {
            return Math.max(this.f12301f, this.f12288D - ((this.f12287C * 9) / 16));
        }
        return this.d + (this.f12305j ? 0 : this.f12304i);
    }

    public final void t(Context context, AttributeSet attributeSet, boolean z4, ColorStateList colorStateList) {
        if (this.f12302g) {
            V2.a aVar = new V2.a(0);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f150p, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
            this.f12306k = k.a(context, resourceId, resourceId2, aVar).a();
            g gVar = new g(this.f12306k);
            this.f12303h = gVar;
            gVar.g(context);
            if (z4 && colorStateList != null) {
                this.f12303h.i(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.f12303h.setTint(typedValue.data);
        }
    }

    public final void u(int i4) {
        float f4;
        float f5;
        if (((View) this.f12289E.get()) != null) {
            ArrayList arrayList = this.f12291G;
            if (arrayList.isEmpty()) {
                return;
            }
            int i5 = this.f12314s;
            if (i4 > i5 || i5 == x()) {
                int i6 = this.f12314s;
                f4 = i6 - i4;
                f5 = this.f12288D - i6;
            } else {
                int i7 = this.f12314s;
                f4 = i7 - i4;
                f5 = i7 - x();
            }
            float f6 = f4 / f5;
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                ((c) arrayList.get(i8)).a(f6);
            }
        }
    }

    public final int x() {
        return this.f12299b ? this.f12311p : this.f12310o;
    }

    public final void y(int i4) {
        if (i4 == -1) {
            if (this.f12300e) {
                return;
            } else {
                this.f12300e = true;
            }
        } else {
            if (!this.f12300e && this.d == i4) {
                return;
            }
            this.f12300e = false;
            this.d = Math.max(0, i4);
        }
        H();
    }

    public final void z(int i4) {
        if (i4 == this.f12319x) {
            return;
        }
        if (this.f12289E == null) {
            if (i4 == 4 || i4 == 3 || i4 == 6 || (this.f12316u && i4 == 5)) {
                this.f12319x = i4;
                return;
            }
            return;
        }
        View view = (View) this.f12289E.get();
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = A.f779a;
            if (view.isAttachedToWindow()) {
                view.post(new O(this, view, i4));
                return;
            }
        }
        B(view, i4);
    }
}
