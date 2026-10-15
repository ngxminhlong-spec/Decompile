package com.duracodefactory.logiccircuitsimulatorpro.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import o1.InterfaceC1833I;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class RecentsRecyclerView extends RecyclerView {

    /* renamed from: M0, reason: collision with root package name */
    public InterfaceC1833I f3703M0;

    public RecentsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        InterfaceC1833I interfaceC1833I = this.f3703M0;
        if (interfaceC1833I != null) {
            interfaceC1833I.s(i6 - i4);
        }
        super.onLayout(z4, i4, i5, i6, i7);
    }

    public void setListener(InterfaceC1833I interfaceC1833I) {
        this.f3703M0 = interfaceC1833I;
    }
}
