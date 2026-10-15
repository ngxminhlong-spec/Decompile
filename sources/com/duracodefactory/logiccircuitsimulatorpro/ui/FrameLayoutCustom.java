package com.duracodefactory.logiccircuitsimulatorpro.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import o1.InterfaceC1866i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class FrameLayoutCustom extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1866i f3610o;

    public FrameLayoutCustom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i4) {
        super.offsetTopAndBottom(i4);
        InterfaceC1866i interfaceC1866i = this.f3610o;
        if (interfaceC1866i != null) {
            getTop();
            interfaceC1866i.r();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        InterfaceC1866i interfaceC1866i = this.f3610o;
        if (interfaceC1866i != null) {
            getTop();
            interfaceC1866i.r();
        }
    }

    public void setListener(InterfaceC1866i interfaceC1866i) {
        this.f3610o = interfaceC1866i;
    }
}
