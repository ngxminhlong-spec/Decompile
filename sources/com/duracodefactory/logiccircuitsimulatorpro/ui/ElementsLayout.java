package com.duracodefactory.logiccircuitsimulatorpro.ui;

import C0.o0;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import o1.InterfaceC1864h;
import q1.AbstractC1955j;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ElementsLayout extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1864h f3609o;

    public ElementsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        SparseIntArray sparseIntArray = AbstractC1955j.f14694v;
        int size = sparseIntArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            View findViewById = findViewById(sparseIntArray.keyAt(i4));
            if (findViewById != null) {
                findViewById.setOnClickListener(new o0(i4, 1, this, sparseIntArray));
            }
        }
    }

    public void setInterface(InterfaceC1864h interfaceC1864h) {
        this.f3609o = interfaceC1864h;
    }
}
