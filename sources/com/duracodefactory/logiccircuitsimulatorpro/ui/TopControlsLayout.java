package com.duracodefactory.logiccircuitsimulatorpro.ui;

import C0.ViewOnClickListenerC0022w;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import o1.InterfaceC1861f0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class TopControlsLayout extends LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1861f0 f3772o;

    public TopControlsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(boolean z4, int[] iArr) {
        for (int i4 : iArr) {
            Control control = (Control) findViewById(i4);
            if (control.f3606x != z4) {
                control.f3606x = z4;
                control.a();
            }
            findViewById(i4).setEnabled(z4);
        }
    }

    public final void b(int[] iArr, int i4) {
        for (int i5 : iArr) {
            ((Control) findViewById(i5)).setSelectedControl(false);
        }
        Control control = (Control) findViewById(i4);
        if (control != null) {
            control.setSelectedControl(true);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            getChildAt(i4).setOnClickListener(new ViewOnClickListenerC0022w(19, this));
        }
    }

    public void setInterface(InterfaceC1861f0 interfaceC1861f0) {
        this.f3772o = interfaceC1861f0;
    }

    public void setRippleRemoved(int[] iArr) {
        for (int i4 : iArr) {
            Control control = (Control) findViewById(i4);
            control.f3607z = true;
            ((FrameLayout) control.getChildAt(0)).setForeground(null);
        }
    }
}
