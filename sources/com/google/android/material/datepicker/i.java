package com.google.android.material.datepicker;

import C0.C;
import C0.ViewOnClickListenerC0022w;
import H.A;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b0.C0213z;
import b0.f0;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i extends q {

    /* renamed from: h0, reason: collision with root package name */
    public int f12378h0;

    /* renamed from: i0, reason: collision with root package name */
    public b f12379i0;

    /* renamed from: j0, reason: collision with root package name */
    public l f12380j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f12381k0;

    /* renamed from: l0, reason: collision with root package name */
    public q2.e f12382l0;

    /* renamed from: m0, reason: collision with root package name */
    public RecyclerView f12383m0;

    /* renamed from: n0, reason: collision with root package name */
    public RecyclerView f12384n0;

    /* renamed from: o0, reason: collision with root package name */
    public View f12385o0;

    /* renamed from: p0, reason: collision with root package name */
    public View f12386p0;

    public final void K(l lVar) {
        p pVar = (p) this.f12384n0.getAdapter();
        int d = pVar.c.f12360o.d(lVar);
        int d4 = d - pVar.c.f12360o.d(this.f12380j0);
        boolean z4 = Math.abs(d4) > 3;
        boolean z5 = d4 > 0;
        this.f12380j0 = lVar;
        if (z4 && z5) {
            this.f12384n0.c0(d - 3);
            this.f12384n0.post(new C(d, 11, this));
        } else if (!z4) {
            this.f12384n0.post(new C(d, 11, this));
        } else {
            this.f12384n0.c0(d + 3);
            this.f12384n0.post(new C(d, 11, this));
        }
    }

    public final void L(int i4) {
        this.f12381k0 = i4;
        if (i4 == 2) {
            this.f12383m0.getLayoutManager().m0(this.f12380j0.f12404r - ((w) this.f12383m0.getAdapter()).c.f12379i0.f12360o.f12404r);
            this.f12385o0.setVisibility(0);
            this.f12386p0.setVisibility(8);
            return;
        }
        if (i4 == 1) {
            this.f12385o0.setVisibility(8);
            this.f12386p0.setVisibility(0);
            K(this.f12380j0);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void q(Bundle bundle) {
        super.q(bundle);
        if (bundle == null) {
            bundle = this.f2853s;
        }
        this.f12378h0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f12379i0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f12380j0 = (l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [b0.J, java.lang.Object] */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final View r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i4;
        int i5;
        C0213z c0213z;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(l(), this.f12378h0);
        this.f12382l0 = new q2.e(contextThemeWrapper, 15);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        l lVar = this.f12379i0.f12360o;
        if (j.M(contextThemeWrapper)) {
            i4 = R.layout.mtrl_calendar_vertical;
            i5 = 1;
        } else {
            i4 = R.layout.mtrl_calendar_horizontal;
            i5 = 0;
        }
        View inflate = cloneInContext.inflate(i4, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        A.h(gridView, new J.f(2));
        gridView.setAdapter((ListAdapter) new d());
        gridView.setNumColumns(lVar.f12405s);
        gridView.setEnabled(false);
        this.f12384n0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.f12384n0.setLayoutManager(new e(this, i5, i5));
        this.f12384n0.setTag("MONTHS_VIEW_GROUP_TAG");
        p pVar = new p(contextThemeWrapper, this.f12379i0, new D3.d(27, this));
        this.f12384n0.setAdapter(pVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f12383m0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f12383m0.setLayoutManager(new GridLayoutManager(integer));
            this.f12383m0.setAdapter(new w(this));
            RecyclerView recyclerView4 = this.f12383m0;
            ?? obj = new Object();
            u.c(null);
            u.c(null);
            recyclerView4.g(obj);
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            A.h(materialButton, new O.b(4, this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.f12385o0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f12386p0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            L(1);
            materialButton.setText(this.f12380j0.f12402p);
            this.f12384n0.h(new g(this, pVar, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC0022w(11, this));
            materialButton3.setOnClickListener(new h(this, pVar, 0));
            materialButton2.setOnClickListener(new h(this, pVar, 1));
        }
        if (!j.M(contextThemeWrapper) && (recyclerView2 = (c0213z = new C0213z()).f3448a) != (recyclerView = this.f12384n0)) {
            f0 f0Var = c0213z.c;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f3085v0;
                if (arrayList != null) {
                    arrayList.remove(f0Var);
                }
                c0213z.f3448a.setOnFlingListener(null);
            }
            c0213z.f3448a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0213z.f3448a.h(f0Var);
                c0213z.f3448a.setOnFlingListener(c0213z);
                c0213z.f3449b = new Scroller(c0213z.f3448a.getContext(), new DecelerateInterpolator());
                c0213z.f();
            }
        }
        this.f12384n0.c0(pVar.c.f12360o.d(this.f12380j0));
        return inflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void y(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f12378h0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f12379i0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f12380j0);
    }
}
