package com.google.android.material.floatingactionbutton;

import C2.d;
import H.A;
import N2.a;
import N2.b;
import O2.m;
import P2.w;
import P2.y;
import V2.g;
import V2.k;
import V2.u;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d3.AbstractC1654b;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import l.C1789w;
import l.r;
import r.i;
import v.AbstractC2018b;
import v.InterfaceC2017a;
import v.e;
import x0.f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class FloatingActionButton extends y implements a, u, InterfaceC2017a {

    /* renamed from: A */
    public final Rect f12420A;

    /* renamed from: B */
    public final C1789w f12421B;

    /* renamed from: C */
    public final b f12422C;

    /* renamed from: D */
    public m f12423D;

    /* renamed from: p */
    public ColorStateList f12424p;

    /* renamed from: q */
    public PorterDuff.Mode f12425q;

    /* renamed from: r */
    public ColorStateList f12426r;

    /* renamed from: s */
    public PorterDuff.Mode f12427s;

    /* renamed from: t */
    public ColorStateList f12428t;

    /* renamed from: u */
    public int f12429u;

    /* renamed from: v */
    public int f12430v;

    /* renamed from: w */
    public int f12431w;

    /* renamed from: x */
    public final int f12432x;
    public boolean y;

    /* renamed from: z */
    public final Rect f12433z;

    /* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends AbstractC2018b {

        /* renamed from: a */
        public final boolean f12434a;

        public BaseBehavior() {
            this.f12434a = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B2.a.f140f);
            this.f12434a = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        @Override // v.AbstractC2018b
        public final boolean a(Rect rect, View view) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f12433z;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // v.AbstractC2018b
        public final void c(e eVar) {
            if (eVar.f15001h == 0) {
                eVar.f15001h = 80;
            }
        }

        @Override // v.AbstractC2018b
        public final boolean d(View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof e ? ((e) layoutParams).f14996a instanceof BottomSheetBehavior : false) {
                r(view2, floatingActionButton);
            }
            return false;
        }

        @Override // v.AbstractC2018b
        public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList j4 = coordinatorLayout.j(floatingActionButton);
            int size = j4.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                View view2 = (View) j4.get(i6);
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if ((layoutParams instanceof e ? ((e) layoutParams).f14996a instanceof BottomSheetBehavior : false) && r(view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.q(floatingActionButton, i4);
            Rect rect = floatingActionButton.f12433z;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                e eVar = (e) floatingActionButton.getLayoutParams();
                int i7 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) eVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) eVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) {
                    i5 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) eVar).topMargin) {
                    i5 = -rect.top;
                }
                if (i5 != 0) {
                    WeakHashMap weakHashMap = A.f779a;
                    floatingActionButton.offsetTopAndBottom(i5);
                }
                if (i7 != 0) {
                    WeakHashMap weakHashMap2 = A.f779a;
                    floatingActionButton.offsetLeftAndRight(i7);
                }
            }
            return true;
        }

        public final boolean r(View view, FloatingActionButton floatingActionButton) {
            e eVar = (e) floatingActionButton.getLayoutParams();
            if (!this.f12434a || eVar.f14999f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((e) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }
    }

    /* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(Z2.a.a(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        this.f1611o = getVisibility();
        this.f12433z = new Rect();
        this.f12420A = new Rect();
        Context context2 = getContext();
        TypedArray d = w.d(context2, attributeSet, B2.a.f139e, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f12424p = AbstractC1654b.u(context2, d, 1);
        this.f12425q = w.e(d.getInt(2, -1), null);
        this.f12428t = AbstractC1654b.u(context2, d, 12);
        this.f12429u = d.getInt(7, -1);
        this.f12430v = d.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = d.getDimensionPixelSize(3, 0);
        float dimension = d.getDimension(4, 0.0f);
        float dimension2 = d.getDimension(9, 0.0f);
        float dimension3 = d.getDimension(11, 0.0f);
        this.y = d.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        int dimensionPixelSize3 = d.getDimensionPixelSize(10, 0);
        this.f12432x = dimensionPixelSize3;
        d a4 = d.a(context2, d, 15);
        d a5 = d.a(context2, d, 8);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, B2.a.f150p, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        k a6 = k.a(context2, resourceId, resourceId2, k.f1902m).a();
        boolean z4 = d.getBoolean(5, false);
        setEnabled(d.getBoolean(0, true));
        d.recycle();
        C1789w c1789w = new C1789w(this, 1);
        this.f12421B = c1789w;
        c1789w.b(attributeSet, R.attr.floatingActionButtonStyle);
        this.f12422C = new b(this);
        getImpl().m(a6);
        getImpl().f(this.f12424p, this.f12425q, this.f12428t, dimensionPixelSize);
        getImpl().f1454k = dimensionPixelSize2;
        O2.k impl = getImpl();
        if (impl.f1451h != dimension) {
            impl.f1451h = dimension;
            impl.j(dimension, impl.f1452i, impl.f1453j);
        }
        O2.k impl2 = getImpl();
        if (impl2.f1452i != dimension2) {
            impl2.f1452i = dimension2;
            impl2.j(impl2.f1451h, dimension2, impl2.f1453j);
        }
        O2.k impl3 = getImpl();
        if (impl3.f1453j != dimension3) {
            impl3.f1453j = dimension3;
            impl3.j(impl3.f1451h, impl3.f1452i, dimension3);
        }
        O2.k impl4 = getImpl();
        if (impl4.f1462s != dimensionPixelSize3) {
            impl4.f1462s = dimensionPixelSize3;
            float f4 = impl4.f1461r;
            impl4.f1461r = f4;
            Matrix matrix = impl4.f1468z;
            impl4.a(f4, matrix);
            impl4.f1464u.setImageMatrix(matrix);
        }
        getImpl().f1458o = a4;
        getImpl().f1459p = a5;
        getImpl().f1449f = z4;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [O2.k, O2.m] */
    private O2.k getImpl() {
        if (this.f12423D == null) {
            this.f12423D = new O2.k(this, new f(16, this));
        }
        return this.f12423D;
    }

    public final int c(int i4) {
        int i5 = this.f12430v;
        if (i5 != 0) {
            return i5;
        }
        Resources resources = getResources();
        return i4 != -1 ? i4 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? c(1) : c(0);
    }

    public final void d() {
        O2.k impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f1464u;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.f1463t == 1) {
                return;
            }
        } else if (impl.f1463t != 2) {
            return;
        }
        Animator animator = impl.f1457n;
        if (animator != null) {
            animator.cancel();
        }
        FloatingActionButton floatingActionButton2 = impl.f1464u;
        WeakHashMap weakHashMap = A.f779a;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(4, false);
            return;
        }
        d dVar = impl.f1459p;
        if (dVar == null) {
            if (impl.f1456m == null) {
                impl.f1456m = d.b(floatingActionButton.getContext(), R.animator.design_fab_hide_motion_spec);
            }
            dVar = impl.f1456m;
            dVar.getClass();
        }
        AnimatorSet b4 = impl.b(dVar, 0.0f, 0.0f, 0.0f);
        b4.addListener(new O2.d(impl));
        b4.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().i(getDrawableState());
    }

    public final void e() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f12426r;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f12427s;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(r.c(colorForState, mode));
    }

    public final void f() {
        O2.k impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f1464u;
        Matrix matrix = impl.f1468z;
        FloatingActionButton floatingActionButton2 = impl.f1464u;
        if (floatingActionButton.getVisibility() != 0) {
            if (impl.f1463t == 2) {
                return;
            }
        } else if (impl.f1463t != 1) {
            return;
        }
        Animator animator = impl.f1457n;
        if (animator != null) {
            animator.cancel();
        }
        WeakHashMap weakHashMap = A.f779a;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(0, false);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f1461r = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(0.0f);
            floatingActionButton.setScaleX(0.0f);
            impl.f1461r = 0.0f;
            impl.a(0.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        d dVar = impl.f1458o;
        if (dVar == null) {
            if (impl.f1455l == null) {
                impl.f1455l = d.b(floatingActionButton.getContext(), R.animator.design_fab_show_motion_spec);
            }
            dVar = impl.f1455l;
            dVar.getClass();
        }
        AnimatorSet b4 = impl.b(dVar, 1.0f, 1.0f, 1.0f);
        b4.addListener(new E2.a(1, impl));
        b4.start();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f12424p;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f12425q;
    }

    @Override // v.InterfaceC2017a
    public AbstractC2018b getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().d();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f1452i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f1453j;
    }

    public Drawable getContentBackground() {
        return getImpl().f1448e;
    }

    public int getCustomSize() {
        return this.f12430v;
    }

    public int getExpandedComponentIdHint() {
        return this.f12422C.f1229b;
    }

    public d getHideMotionSpec() {
        return getImpl().f1459p;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f12428t;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f12428t;
    }

    public k getShapeAppearanceModel() {
        k kVar = getImpl().f1446a;
        kVar.getClass();
        return kVar;
    }

    public d getShowMotionSpec() {
        return getImpl().f1458o;
    }

    public int getSize() {
        return this.f12429u;
    }

    public int getSizeDimension() {
        return c(this.f12429u);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f12426r;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f12427s;
    }

    public boolean getUseCompatPadding() {
        return this.y;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().g();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        O2.k impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f1464u;
        g gVar = impl.f1447b;
        if (gVar != null) {
            AbstractC1654b.P(floatingActionButton, gVar);
        }
        if (impl instanceof m) {
            return;
        }
        ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
        if (impl.f1445A == null) {
            impl.f1445A = new O2.g(0, impl);
        }
        viewTreeObserver.addOnPreDrawListener(impl.f1445A);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        O2.k impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f1464u.getViewTreeObserver();
        O2.g gVar = impl.f1445A;
        if (gVar != null) {
            viewTreeObserver.removeOnPreDrawListener(gVar);
            impl.f1445A = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i4, int i5) {
        int sizeDimension = getSizeDimension();
        this.f12431w = (sizeDimension - this.f12432x) / 2;
        getImpl().p();
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(sizeDimension, size);
        } else if (mode == 0) {
            size = sizeDimension;
        } else if (mode != 1073741824) {
            throw new IllegalArgumentException();
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode2 == Integer.MIN_VALUE) {
            sizeDimension = Math.min(sizeDimension, size2);
        } else if (mode2 != 0) {
            if (mode2 != 1073741824) {
                throw new IllegalArgumentException();
            }
            sizeDimension = size2;
        }
        int min = Math.min(size, sizeDimension);
        Rect rect = this.f12433z;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        List list;
        if (!(parcelable instanceof X2.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        X2.a aVar = (X2.a) parcelable;
        super.onRestoreInstanceState(aVar.f1071o);
        Object obj = aVar.f2133q.get("expandableWidgetHelper");
        obj.getClass();
        Bundle bundle = (Bundle) obj;
        b bVar = this.f12422C;
        bVar.getClass();
        bVar.f1228a = bundle.getBoolean("expanded", false);
        bVar.f1229b = bundle.getInt("expandedComponentIdHint", 0);
        if (bVar.f1228a) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) bVar.c;
            ViewParent parent = floatingActionButton.getParent();
            if (!(parent instanceof CoordinatorLayout) || (list = (List) ((i) ((CoordinatorLayout) parent).f2664p.f6660p).get(floatingActionButton)) == null || list.isEmpty()) {
                return;
            }
            for (int i4 = 0; i4 < list.size(); i4++) {
                View view = (View) list.get(i4);
                AbstractC2018b abstractC2018b = ((e) view.getLayoutParams()).f14996a;
                if (abstractC2018b != null) {
                    abstractC2018b.d(view, floatingActionButton);
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        X2.a aVar = new X2.a(onSaveInstanceState);
        b bVar = this.f12422C;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", bVar.f1228a);
        bundle.putInt("expandedComponentIdHint", bVar.f1229b);
        aVar.f2133q.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            WeakHashMap weakHashMap = A.f779a;
            if (isLaidOut()) {
                int width = getWidth();
                int height = getHeight();
                Rect rect = this.f12420A;
                rect.set(0, 0, width, height);
                int i4 = rect.left;
                Rect rect2 = this.f12433z;
                rect.left = i4 + rect2.left;
                rect.top += rect2.top;
                rect.right -= rect2.right;
                rect.bottom -= rect2.bottom;
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f12424p != colorStateList) {
            this.f12424p = colorStateList;
            O2.k impl = getImpl();
            g gVar = impl.f1447b;
            if (gVar != null) {
                gVar.setTintList(colorStateList);
            }
            O2.b bVar = impl.d;
            if (bVar != null) {
                if (colorStateList != null) {
                    bVar.f1422m = colorStateList.getColorForState(bVar.getState(), bVar.f1422m);
                }
                bVar.f1425p = colorStateList;
                bVar.f1423n = true;
                bVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f12425q != mode) {
            this.f12425q = mode;
            g gVar = getImpl().f1447b;
            if (gVar != null) {
                gVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f4) {
        O2.k impl = getImpl();
        if (impl.f1451h != f4) {
            impl.f1451h = f4;
            impl.j(f4, impl.f1452i, impl.f1453j);
        }
    }

    public void setCompatElevationResource(int i4) {
        setCompatElevation(getResources().getDimension(i4));
    }

    public void setCompatHoveredFocusedTranslationZ(float f4) {
        O2.k impl = getImpl();
        if (impl.f1452i != f4) {
            impl.f1452i = f4;
            impl.j(impl.f1451h, f4, impl.f1453j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i4) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i4));
    }

    public void setCompatPressedTranslationZ(float f4) {
        O2.k impl = getImpl();
        if (impl.f1453j != f4) {
            impl.f1453j = f4;
            impl.j(impl.f1451h, impl.f1452i, f4);
        }
    }

    public void setCompatPressedTranslationZResource(int i4) {
        setCompatPressedTranslationZ(getResources().getDimension(i4));
    }

    public void setCustomSize(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i4 != this.f12430v) {
            this.f12430v = i4;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        g gVar = getImpl().f1447b;
        if (gVar != null) {
            gVar.h(f4);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z4) {
        if (z4 != getImpl().f1449f) {
            getImpl().f1449f = z4;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i4) {
        this.f12422C.f1229b = i4;
    }

    public void setHideMotionSpec(d dVar) {
        getImpl().f1459p = dVar;
    }

    public void setHideMotionSpecResource(int i4) {
        setHideMotionSpec(d.b(getContext(), i4));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            O2.k impl = getImpl();
            float f4 = impl.f1461r;
            impl.f1461r = f4;
            Matrix matrix = impl.f1468z;
            impl.a(f4, matrix);
            impl.f1464u.setImageMatrix(matrix);
            if (this.f12426r != null) {
                e();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        this.f12421B.c(i4);
        e();
    }

    public void setRippleColor(int i4) {
        setRippleColor(ColorStateList.valueOf(i4));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f12428t != colorStateList) {
            this.f12428t = colorStateList;
            getImpl().l(this.f12428t);
        }
    }

    @Override // android.view.View
    public void setScaleX(float f4) {
        super.setScaleX(f4);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f4) {
        super.setScaleY(f4);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z4) {
        O2.k impl = getImpl();
        impl.f1450g = z4;
        impl.p();
    }

    @Override // V2.u
    public void setShapeAppearanceModel(k kVar) {
        getImpl().m(kVar);
    }

    public void setShowMotionSpec(d dVar) {
        getImpl().f1458o = dVar;
    }

    public void setShowMotionSpecResource(int i4) {
        setShowMotionSpec(d.b(getContext(), i4));
    }

    public void setSize(int i4) {
        this.f12430v = 0;
        if (i4 != this.f12429u) {
            this.f12429u = i4;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f12426r != colorStateList) {
            this.f12426r = colorStateList;
            e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f12427s != mode) {
            this.f12427s = mode;
            e();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f4) {
        super.setTranslationX(f4);
        getImpl().k();
    }

    @Override // android.view.View
    public void setTranslationY(float f4) {
        super.setTranslationY(f4);
        getImpl().k();
    }

    @Override // android.view.View
    public void setTranslationZ(float f4) {
        super.setTranslationZ(f4);
        getImpl().k();
    }

    public void setUseCompatPadding(boolean z4) {
        if (this.y != z4) {
            this.y = z4;
            getImpl().h();
        }
    }

    @Override // P2.y, android.widget.ImageView, android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
    }
}
