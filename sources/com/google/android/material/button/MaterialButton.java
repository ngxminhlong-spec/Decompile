package com.google.android.material.button;

import H.A;
import H2.b;
import H2.c;
import P2.w;
import V2.f;
import V2.g;
import V2.k;
import V2.u;
import Z2.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import d3.AbstractC1654b;
import g.AbstractC1678a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.C1782o;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class MaterialButton extends C1782o implements Checkable, u {

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f12321B = {R.attr.state_checkable};

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f12322C = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public int f12323A;

    /* renamed from: q, reason: collision with root package name */
    public final c f12324q;

    /* renamed from: r, reason: collision with root package name */
    public final LinkedHashSet f12325r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuff.Mode f12326s;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f12327t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f12328u;

    /* renamed from: v, reason: collision with root package name */
    public int f12329v;

    /* renamed from: w, reason: collision with root package name */
    public int f12330w;

    /* renamed from: x, reason: collision with root package name */
    public int f12331x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f12332z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.duracodefactory.logiccircuitsimulatorpro.R.attr.materialButtonStyle, com.duracodefactory.logiccircuitsimulatorpro.R.style.Widget_MaterialComponents_Button), attributeSet, com.duracodefactory.logiccircuitsimulatorpro.R.attr.materialButtonStyle);
        boolean z4;
        boolean z5;
        this.f12325r = new LinkedHashSet();
        this.y = false;
        this.f12332z = false;
        Context context2 = getContext();
        TypedArray d = w.d(context2, attributeSet, B2.a.f145k, com.duracodefactory.logiccircuitsimulatorpro.R.attr.materialButtonStyle, com.duracodefactory.logiccircuitsimulatorpro.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f12331x = d.getDimensionPixelSize(12, 0);
        int i4 = d.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f12326s = w.e(i4, mode);
        this.f12327t = AbstractC1654b.u(getContext(), d, 14);
        this.f12328u = AbstractC1654b.w(getContext(), d, 10);
        this.f12323A = d.getInteger(11, 1);
        this.f12329v = d.getDimensionPixelSize(13, 0);
        V2.a aVar = new V2.a(0);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, B2.a.f150p, com.duracodefactory.logiccircuitsimulatorpro.R.attr.materialButtonStyle, com.duracodefactory.logiccircuitsimulatorpro.R.style.Widget_MaterialComponents_Button);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        c cVar = new c(this, k.a(context2, resourceId, resourceId2, aVar).a());
        this.f12324q = cVar;
        cVar.c = d.getDimensionPixelOffset(1, 0);
        cVar.d = d.getDimensionPixelOffset(2, 0);
        cVar.f889e = d.getDimensionPixelOffset(3, 0);
        cVar.f890f = d.getDimensionPixelOffset(4, 0);
        if (d.hasValue(8)) {
            int dimensionPixelSize = d.getDimensionPixelSize(8, -1);
            cVar.f891g = dimensionPixelSize;
            cVar.c(cVar.f888b.e(dimensionPixelSize));
            cVar.f900p = true;
        }
        cVar.f892h = d.getDimensionPixelSize(20, 0);
        cVar.f893i = w.e(d.getInt(7, -1), mode);
        cVar.f894j = AbstractC1654b.u(getContext(), d, 6);
        cVar.f895k = AbstractC1654b.u(getContext(), d, 19);
        cVar.f896l = AbstractC1654b.u(getContext(), d, 16);
        cVar.f901q = d.getBoolean(5, false);
        int dimensionPixelSize2 = d.getDimensionPixelSize(9, 0);
        WeakHashMap weakHashMap = A.f779a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (d.hasValue(0)) {
            cVar.f899o = true;
            setSupportBackgroundTintList(cVar.f894j);
            setSupportBackgroundTintMode(cVar.f893i);
            z5 = false;
            z4 = true;
        } else {
            g gVar = new g(cVar.f888b);
            gVar.g(getContext());
            gVar.setTintList(cVar.f894j);
            PorterDuff.Mode mode2 = cVar.f893i;
            if (mode2 != null) {
                gVar.setTintMode(mode2);
            }
            float f4 = cVar.f892h;
            ColorStateList colorStateList = cVar.f895k;
            gVar.f1880o.f1861j = f4;
            gVar.invalidateSelf();
            f fVar = gVar.f1880o;
            if (fVar.d != colorStateList) {
                fVar.d = colorStateList;
                gVar.onStateChange(gVar.getState());
            }
            g gVar2 = new g(cVar.f888b);
            gVar2.setTint(0);
            float f5 = cVar.f892h;
            int m4 = cVar.f898n ? AbstractC1895f.m(this, com.duracodefactory.logiccircuitsimulatorpro.R.attr.colorSurface) : 0;
            z4 = true;
            gVar2.f1880o.f1861j = f5;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(m4);
            f fVar2 = gVar2.f1880o;
            if (fVar2.d != valueOf) {
                fVar2.d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
            g gVar3 = new g(cVar.f888b);
            cVar.f897m = gVar3;
            gVar3.setTint(-1);
            RippleDrawable rippleDrawable = new RippleDrawable(T2.a.a(cVar.f896l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), cVar.c, cVar.f889e, cVar.d, cVar.f890f), cVar.f897m);
            cVar.f902r = rippleDrawable;
            setInternalBackground(rippleDrawable);
            z5 = false;
            g b4 = cVar.b(false);
            if (b4 != null) {
                b4.h(dimensionPixelSize2);
            }
        }
        setPaddingRelative(paddingStart + cVar.c, paddingTop + cVar.f889e, paddingEnd + cVar.d, paddingBottom + cVar.f890f);
        d.recycle();
        setCompoundDrawablePadding(this.f12331x);
        b(this.f12328u != null ? z4 : z5);
    }

    private String getA11yClassName() {
        c cVar = this.f12324q;
        return ((cVar == null || !cVar.f901q) ? Button.class : CompoundButton.class).getName();
    }

    public final boolean a() {
        c cVar = this.f12324q;
        return (cVar == null || cVar.f899o) ? false : true;
    }

    public final void b(boolean z4) {
        Drawable drawable = this.f12328u;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f12328u = mutate;
            mutate.setTintList(this.f12327t);
            PorterDuff.Mode mode = this.f12326s;
            if (mode != null) {
                this.f12328u.setTintMode(mode);
            }
            int i4 = this.f12329v;
            if (i4 == 0) {
                i4 = this.f12328u.getIntrinsicWidth();
            }
            int i5 = this.f12329v;
            if (i5 == 0) {
                i5 = this.f12328u.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f12328u;
            int i6 = this.f12330w;
            drawable2.setBounds(i6, 0, i4 + i6, i5);
        }
        int i7 = this.f12323A;
        boolean z5 = true;
        if (i7 != 1 && i7 != 2) {
            z5 = false;
        }
        if (z4) {
            if (z5) {
                setCompoundDrawablesRelative(this.f12328u, null, null, null);
                return;
            } else {
                setCompoundDrawablesRelative(null, null, this.f12328u, null);
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[2];
        if ((!z5 || drawable3 == this.f12328u) && (z5 || drawable4 == this.f12328u)) {
            return;
        }
        if (z5) {
            setCompoundDrawablesRelative(this.f12328u, null, null, null);
        } else {
            setCompoundDrawablesRelative(null, null, this.f12328u, null);
        }
    }

    public final void c() {
        if (this.f12328u == null || getLayout() == null) {
            return;
        }
        int i4 = this.f12323A;
        if (i4 == 1 || i4 == 3) {
            this.f12330w = 0;
            b(false);
            return;
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
        int i5 = this.f12329v;
        if (i5 == 0) {
            i5 = this.f12328u.getIntrinsicWidth();
        }
        int measuredWidth = getMeasuredWidth() - min;
        WeakHashMap weakHashMap = A.f779a;
        int paddingEnd = ((((measuredWidth - getPaddingEnd()) - i5) - this.f12331x) - getPaddingStart()) / 2;
        if ((getLayoutDirection() == 1) != (this.f12323A == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f12330w != paddingEnd) {
            this.f12330w = paddingEnd;
            b(false);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f12324q.f891g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f12328u;
    }

    public int getIconGravity() {
        return this.f12323A;
    }

    public int getIconPadding() {
        return this.f12331x;
    }

    public int getIconSize() {
        return this.f12329v;
    }

    public ColorStateList getIconTint() {
        return this.f12327t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f12326s;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f12324q.f896l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (a()) {
            return this.f12324q.f888b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f12324q.f895k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f12324q.f892h;
        }
        return 0;
    }

    @Override // l.C1782o
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f12324q.f894j : super.getSupportBackgroundTintList();
    }

    @Override // l.C1782o
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f12324q.f893i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.y;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            AbstractC1654b.P(this, this.f12324q.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        c cVar = this.f12324q;
        if (cVar != null && cVar.f901q) {
            View.mergeDrawableStates(onCreateDrawableState, f12321B);
        }
        if (this.y) {
            View.mergeDrawableStates(onCreateDrawableState, f12322C);
        }
        return onCreateDrawableState;
    }

    @Override // l.C1782o, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.y);
    }

    @Override // l.C1782o, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        c cVar = this.f12324q;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.f901q);
        accessibilityNodeInfo.setChecked(this.y);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        c();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f1071o);
        setChecked(bVar.f886q);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [L.b, android.os.Parcelable, H2.b] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new L.b(super.onSaveInstanceState());
        bVar.f886q = this.y;
        return bVar;
    }

    @Override // l.C1782o, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        c();
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        if (!a()) {
            super.setBackgroundColor(i4);
            return;
        }
        c cVar = this.f12324q;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i4);
        }
    }

    @Override // l.C1782o, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
        c cVar = this.f12324q;
        cVar.f899o = true;
        MaterialButton materialButton = cVar.f887a;
        materialButton.setSupportBackgroundTintList(cVar.f894j);
        materialButton.setSupportBackgroundTintMode(cVar.f893i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // l.C1782o, android.view.View
    public void setBackgroundResource(int i4) {
        setBackgroundDrawable(i4 != 0 ? AbstractC1678a.a(getContext(), i4) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z4) {
        if (a()) {
            this.f12324q.f901q = z4;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        c cVar = this.f12324q;
        if (cVar == null || !cVar.f901q || !isEnabled() || this.y == z4) {
            return;
        }
        this.y = z4;
        refreshDrawableState();
        if (this.f12332z) {
            return;
        }
        this.f12332z = true;
        Iterator it = this.f12325r.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f12332z = false;
    }

    public void setCornerRadius(int i4) {
        if (a()) {
            c cVar = this.f12324q;
            if (cVar.f900p && cVar.f891g == i4) {
                return;
            }
            cVar.f891g = i4;
            cVar.f900p = true;
            cVar.c(cVar.f888b.e(i4));
        }
    }

    public void setCornerRadiusResource(int i4) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i4));
        }
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        if (a()) {
            this.f12324q.b(false).h(f4);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f12328u != drawable) {
            this.f12328u = drawable;
            b(true);
        }
    }

    public void setIconGravity(int i4) {
        if (this.f12323A != i4) {
            this.f12323A = i4;
            c();
        }
    }

    public void setIconPadding(int i4) {
        if (this.f12331x != i4) {
            this.f12331x = i4;
            setCompoundDrawablePadding(i4);
        }
    }

    public void setIconResource(int i4) {
        setIcon(i4 != 0 ? AbstractC1678a.a(getContext(), i4) : null);
    }

    public void setIconSize(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f12329v != i4) {
            this.f12329v = i4;
            b(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f12327t != colorStateList) {
            this.f12327t = colorStateList;
            b(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f12326s != mode) {
            this.f12326s = mode;
            b(false);
        }
    }

    public void setIconTintResource(int i4) {
        Context context = getContext();
        Object obj = AbstractC1678a.f12977a;
        setIconTint(context.getColorStateList(i4));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(H2.a aVar) {
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        super.setPressed(z4);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f12324q;
            MaterialButton materialButton = cVar.f887a;
            if (cVar.f896l != colorStateList) {
                cVar.f896l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(T2.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i4) {
        if (a()) {
            Context context = getContext();
            Object obj = AbstractC1678a.f12977a;
            setRippleColor(context.getColorStateList(i4));
        }
    }

    @Override // V2.u
    public void setShapeAppearanceModel(k kVar) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f12324q.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z4) {
        if (a()) {
            c cVar = this.f12324q;
            cVar.f898n = z4;
            cVar.d();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f12324q;
            if (cVar.f895k != colorStateList) {
                cVar.f895k = colorStateList;
                cVar.d();
            }
        }
    }

    public void setStrokeColorResource(int i4) {
        if (a()) {
            Context context = getContext();
            Object obj = AbstractC1678a.f12977a;
            setStrokeColor(context.getColorStateList(i4));
        }
    }

    public void setStrokeWidth(int i4) {
        if (a()) {
            c cVar = this.f12324q;
            if (cVar.f892h != i4) {
                cVar.f892h = i4;
                cVar.d();
            }
        }
    }

    public void setStrokeWidthResource(int i4) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i4));
        }
    }

    @Override // l.C1782o
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.f12324q;
        if (cVar.f894j != colorStateList) {
            cVar.f894j = colorStateList;
            if (cVar.b(false) != null) {
                cVar.b(false).setTintList(cVar.f894j);
            }
        }
    }

    @Override // l.C1782o
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.f12324q;
        if (cVar.f893i != mode) {
            cVar.f893i = mode;
            if (cVar.b(false) == null || cVar.f893i == null) {
                return;
            }
            cVar.b(false).setTintMode(cVar.f893i);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.y);
    }
}
