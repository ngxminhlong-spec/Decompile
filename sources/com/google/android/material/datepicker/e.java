package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b0.C0212y;
import b0.Z;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f12371E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ i f12372F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, int i4, int i5) {
        super(i4);
        this.f12372F = iVar;
        this.f12371E = i5;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b0.AbstractC0178L
    public final void w0(RecyclerView recyclerView, int i4) {
        C0212y c0212y = new C0212y(recyclerView.getContext());
        c0212y.f3434a = i4;
        x0(c0212y);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void z0(Z z4, int[] iArr) {
        int i4 = this.f12371E;
        i iVar = this.f12372F;
        if (i4 == 0) {
            iArr[0] = iVar.f12384n0.getWidth();
            iArr[1] = iVar.f12384n0.getWidth();
        } else {
            iArr[0] = iVar.f12384n0.getHeight();
            iArr[1] = iVar.f12384n0.getHeight();
        }
    }
}
