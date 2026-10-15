package com.google.android.material.theme;

import P2.w;
import Y2.r;
import Z2.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatViewInflater;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import d3.AbstractC1654b;
import l.C1781n;
import l.C1782o;
import l.C1783p;
import l.C1790x;
import l.M;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // androidx.appcompat.app.AppCompatViewInflater
    public final C1781n a(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public final C1782o b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.CompoundButton, android.view.View, I2.a, l.p] */
    @Override // androidx.appcompat.app.AppCompatViewInflater
    public final C1783p c(Context context, AttributeSet attributeSet) {
        ?? c1783p = new C1783p(a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        Context context2 = c1783p.getContext();
        TypedArray d = w.d(context2, attributeSet, B2.a.f148n, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        if (d.hasValue(0)) {
            c1783p.setButtonTintList(AbstractC1654b.u(context2, d, 0));
        }
        c1783p.f923s = d.getBoolean(1, false);
        d.recycle();
        return c1783p;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R2.a, android.widget.CompoundButton, l.x, android.view.View] */
    @Override // androidx.appcompat.app.AppCompatViewInflater
    public final C1790x d(Context context, AttributeSet attributeSet) {
        ?? c1790x = new C1790x(a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c1790x.getContext();
        TypedArray d = w.d(context2, attributeSet, B2.a.f149o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (d.hasValue(0)) {
            c1790x.setButtonTintList(AbstractC1654b.u(context2, d, 0));
        }
        c1790x.f1756s = d.getBoolean(1, false);
        d.recycle();
        return c1790x;
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public final M e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
