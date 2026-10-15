package com.google.android.material.appbar;

import H.A;
import H.AbstractC0044t;
import V2.g;
import Z2.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import d3.AbstractC1654b;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.i(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.g(context2);
            WeakHashMap weakHashMap = A.f779a;
            gVar.h(AbstractC0044t.d(this));
            setBackground(gVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            AbstractC1654b.P(this, (g) background);
        }
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).h(f4);
        }
    }
}
