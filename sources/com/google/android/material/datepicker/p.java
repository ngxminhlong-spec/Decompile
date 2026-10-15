package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import b0.AbstractC0171E;
import b0.C0179M;
import b0.c0;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class p extends AbstractC0171E {
    public final b c;
    public final D3.d d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12416e;

    public p(ContextThemeWrapper contextThemeWrapper, b bVar, D3.d dVar) {
        l lVar = bVar.f12360o;
        l lVar2 = bVar.f12361p;
        l lVar3 = bVar.f12362q;
        if (lVar.compareTo(lVar3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (lVar3.compareTo(lVar2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f12416e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * m.f12408r) + (j.M(contextThemeWrapper) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.c = bVar;
        this.d = dVar;
        if (this.f3176a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f3177b = true;
    }

    @Override // b0.AbstractC0171E
    public final int a() {
        return this.c.f12365t;
    }

    @Override // b0.AbstractC0171E
    public final long b(int i4) {
        Calendar a4 = u.a(this.c.f12360o.f12401o);
        a4.add(2, i4);
        a4.set(5, 1);
        Calendar a5 = u.a(a4);
        a5.get(2);
        a5.get(1);
        a5.getMaximum(7);
        a5.getActualMaximum(5);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL, yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        simpleDateFormat.format(a5.getTime());
        a5.getTimeInMillis();
        return a5.getTimeInMillis();
    }

    @Override // b0.AbstractC0171E
    public final void f(c0 c0Var, int i4) {
        o oVar = (o) c0Var;
        b bVar = this.c;
        Calendar a4 = u.a(bVar.f12360o.f12401o);
        a4.add(2, i4);
        l lVar = new l(a4);
        oVar.f12414t.setText(lVar.f12402p);
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) oVar.f12415u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !lVar.equals(materialCalendarGridView.a().f12409o)) {
            m mVar = new m(lVar, bVar);
            materialCalendarGridView.setNumColumns(lVar.f12405s);
            materialCalendarGridView.setAdapter((ListAdapter) mVar);
        } else {
            materialCalendarGridView.a().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new n(this, materialCalendarGridView));
    }

    @Override // b0.AbstractC0171E
    public final c0 g(ViewGroup viewGroup, int i4) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!j.M(viewGroup.getContext())) {
            return new o(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0179M(-1, this.f12416e));
        return new o(linearLayout, true);
    }
}
