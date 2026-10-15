package com.google.android.material.internal;

import H.A;
import O.b;
import P2.e;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.media.session.a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import k.InterfaceC1740A;
import k.p;
import l.Z;
import z.AbstractC2130i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends e implements InterfaceC1740A {

    /* renamed from: T, reason: collision with root package name */
    public static final int[] f12440T = {R.attr.state_checked};

    /* renamed from: J, reason: collision with root package name */
    public int f12441J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f12442K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f12443L;

    /* renamed from: M, reason: collision with root package name */
    public final CheckedTextView f12444M;
    public FrameLayout N;

    /* renamed from: O, reason: collision with root package name */
    public p f12445O;

    /* renamed from: P, reason: collision with root package name */
    public ColorStateList f12446P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f12447Q;

    /* renamed from: R, reason: collision with root package name */
    public Drawable f12448R;

    /* renamed from: S, reason: collision with root package name */
    public final b f12449S;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(2, this);
        this.f12449S = bVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.duracodefactory.logiccircuitsimulatorpro.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.duracodefactory.logiccircuitsimulatorpro.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.duracodefactory.logiccircuitsimulatorpro.R.id.design_menu_item_text);
        this.f12444M = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        A.h(checkedTextView, bVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.N == null) {
                this.N = (FrameLayout) ((ViewStub) findViewById(com.duracodefactory.logiccircuitsimulatorpro.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.N.removeAllViews();
            this.N.addView(view);
        }
    }

    @Override // k.InterfaceC1740A
    public final void b(p pVar) {
        StateListDrawable stateListDrawable;
        this.f12445O = pVar;
        int i4 = pVar.f13456a;
        if (i4 > 0) {
            setId(i4);
        }
        setVisibility(pVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.duracodefactory.logiccircuitsimulatorpro.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f12440T, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = A.f779a;
            setBackground(stateListDrawable);
        }
        setCheckable(pVar.isCheckable());
        setChecked(pVar.isChecked());
        setEnabled(pVar.isEnabled());
        setTitle(pVar.f13458e);
        setIcon(pVar.getIcon());
        setActionView(pVar.getActionView());
        setContentDescription(pVar.f13470q);
        a.s(this, pVar.f13471r);
        p pVar2 = this.f12445O;
        CharSequence charSequence = pVar2.f13458e;
        CheckedTextView checkedTextView = this.f12444M;
        if (charSequence == null && pVar2.getIcon() == null && this.f12445O.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.N;
            if (frameLayout != null) {
                Z z4 = (Z) frameLayout.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) z4).width = -1;
                this.N.setLayoutParams(z4);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.N;
        if (frameLayout2 != null) {
            Z z5 = (Z) frameLayout2.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) z5).width = -2;
            this.N.setLayoutParams(z5);
        }
    }

    @Override // k.InterfaceC1740A
    public p getItemData() {
        return this.f12445O;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        p pVar = this.f12445O;
        if (pVar != null && pVar.isCheckable() && this.f12445O.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f12440T);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z4) {
        refreshDrawableState();
        if (this.f12443L != z4) {
            this.f12443L = z4;
            this.f12449S.h(this.f12444M, 2048);
        }
    }

    public void setChecked(boolean z4) {
        refreshDrawableState();
        this.f12444M.setChecked(z4);
    }

    public void setHorizontalPadding(int i4) {
        setPadding(i4, 0, i4, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f12447Q) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f12446P);
            }
            int i4 = this.f12441J;
            drawable.setBounds(0, 0, i4, i4);
        } else if (this.f12442K) {
            if (this.f12448R == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                Object obj = AbstractC2130i.f15936a;
                Drawable drawable2 = resources.getDrawable(com.duracodefactory.logiccircuitsimulatorpro.R.drawable.navigation_empty_icon, theme);
                this.f12448R = drawable2;
                if (drawable2 != null) {
                    int i5 = this.f12441J;
                    drawable2.setBounds(0, 0, i5, i5);
                }
            }
            drawable = this.f12448R;
        }
        this.f12444M.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i4) {
        this.f12444M.setCompoundDrawablePadding(i4);
    }

    public void setIconSize(int i4) {
        this.f12441J = i4;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f12446P = colorStateList;
        this.f12447Q = colorStateList != null;
        p pVar = this.f12445O;
        if (pVar != null) {
            setIcon(pVar.getIcon());
        }
    }

    public void setMaxLines(int i4) {
        this.f12444M.setMaxLines(i4);
    }

    public void setNeedsEmptyIcon(boolean z4) {
        this.f12442K = z4;
    }

    public void setTextAppearance(int i4) {
        this.f12444M.setTextAppearance(i4);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f12444M.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f12444M.setText(charSequence);
    }
}
