package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import b0.AbstractC0171E;
import b0.c0;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.Locale;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class w extends AbstractC0171E {
    public final i c;

    public w(i iVar) {
        this.c = iVar;
    }

    @Override // b0.AbstractC0171E
    public final int a() {
        return this.c.f12379i0.f12364s;
    }

    @Override // b0.AbstractC0171E
    public final void f(c0 c0Var, int i4) {
        i iVar = this.c;
        int i5 = iVar.f12379i0.f12360o.f12404r + i4;
        TextView textView = ((v) c0Var).f12419t;
        String string = textView.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i5)));
        textView.setContentDescription(String.format(string, Integer.valueOf(i5)));
        q2.e eVar = iVar.f12382l0;
        if (u.b().get(1) == i5) {
            Object obj = eVar.f14710q;
        } else {
            Object obj2 = eVar.f14709p;
        }
        throw null;
    }

    @Override // b0.AbstractC0171E
    public final c0 g(ViewGroup viewGroup, int i4) {
        return new v((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
