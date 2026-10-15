package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k extends q {

    /* renamed from: h0, reason: collision with root package name */
    public b f12400h0;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void q(Bundle bundle) {
        super.q(bundle);
        if (bundle == null) {
            bundle = this.f2853s;
        }
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f12400h0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final View r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void y(Bundle bundle) {
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f12400h0);
    }
}
