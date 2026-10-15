package W2;

import H.A;
import H.AbstractC0044t;
import H.r;
import P2.w;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.ads.C0326Qb;
import d3.AbstractC1654b;
import java.util.List;
import java.util.WeakHashMap;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class k extends FrameLayout {

    /* renamed from: v, reason: collision with root package name */
    public static final j f2032v = new Object();

    /* renamed from: o, reason: collision with root package name */
    public i f2033o;

    /* renamed from: p, reason: collision with root package name */
    public h f2034p;

    /* renamed from: q, reason: collision with root package name */
    public int f2035q;

    /* renamed from: r, reason: collision with root package name */
    public final float f2036r;

    /* renamed from: s, reason: collision with root package name */
    public final float f2037s;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f2038t;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f2039u;

    public k(Context context, AttributeSet attributeSet) {
        super(Z2.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, B2.a.f157w);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = A.f779a;
            AbstractC0044t.j(this, dimensionPixelSize);
        }
        this.f2035q = obtainStyledAttributes.getInt(2, 0);
        this.f2036r = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC1654b.u(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(w.e(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f2037s = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f2032v);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(AbstractC1895f.r(AbstractC1895f.m(this, R.attr.colorSurface), AbstractC1895f.m(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha()));
            ColorStateList colorStateList = this.f2038t;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            WeakHashMap weakHashMap2 = A.f779a;
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f2037s;
    }

    public int getAnimationMode() {
        return this.f2035q;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f2036r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        Insets mandatorySystemGestureInsets;
        int i4;
        super.onAttachedToWindow();
        h hVar = this.f2034p;
        if (hVar != null) {
            l lVar = ((g) hVar).f2031a;
            if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = lVar.c.getRootWindowInsets()) != null) {
                mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
                i4 = mandatorySystemGestureInsets.bottom;
                lVar.f2051k = i4;
                lVar.d();
            }
        }
        WeakHashMap weakHashMap = A.f779a;
        r.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z4;
        super.onDetachedFromWindow();
        h hVar = this.f2034p;
        if (hVar != null) {
            g gVar = (g) hVar;
            l lVar = gVar.f2031a;
            C0326Qb p3 = C0326Qb.p();
            f fVar = lVar.f2053m;
            synchronized (p3.f6659o) {
                z4 = true;
                if (!p3.q(fVar)) {
                    p pVar = (p) p3.f6662r;
                    if (!(pVar != null && pVar.f2057a.get() == fVar)) {
                        z4 = false;
                    }
                }
            }
            if (z4) {
                l.f2040n.post(new D0.o(12, gVar));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        i iVar = this.f2033o;
        if (iVar != null) {
            l lVar = ((e) iVar).f2029o;
            k kVar = lVar.c;
            kVar.setOnLayoutChangeListener(null);
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = lVar.f2052l.getEnabledAccessibilityServiceList(1);
            if (enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty()) {
                kVar.post(new d(lVar, 1));
            } else {
                kVar.setVisibility(0);
                lVar.c();
            }
        }
    }

    public void setAnimationMode(int i4) {
        this.f2035q = i4;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f2038t != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f2038t);
            drawable.setTintMode(this.f2039u);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f2038t = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.f2039u);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f2039u = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setOnAttachStateChangeListener(h hVar) {
        this.f2034p = hVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f2032v);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(i iVar) {
        this.f2033o = iVar;
    }
}
