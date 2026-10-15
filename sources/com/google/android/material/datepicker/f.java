package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b0.AbstractC0176J;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f extends AbstractC0176J {
    @Override // b0.AbstractC0176J
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof w) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            throw null;
        }
    }
}
