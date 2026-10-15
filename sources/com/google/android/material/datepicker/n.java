package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class n implements AdapterView.OnItemClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f12412o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p f12413p;

    public n(p pVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f12413p = pVar;
        this.f12412o = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        MaterialCalendarGridView materialCalendarGridView = this.f12412o;
        m a4 = materialCalendarGridView.a();
        if (i4 < a4.f12409o.c() || i4 > a4.b()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i4).longValue() >= ((i) this.f12413p.d.f677p).f12379i0.f12363r.f12366o) {
            throw null;
        }
    }
}
