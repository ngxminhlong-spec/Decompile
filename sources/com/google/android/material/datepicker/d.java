package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d extends BaseAdapter {

    /* renamed from: r, reason: collision with root package name */
    public static final int f12367r;

    /* renamed from: o, reason: collision with root package name */
    public final Calendar f12368o;

    /* renamed from: p, reason: collision with root package name */
    public final int f12369p;

    /* renamed from: q, reason: collision with root package name */
    public final int f12370q;

    static {
        f12367r = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public d() {
        Calendar c = u.c(null);
        this.f12368o = c;
        this.f12369p = c.getMaximum(7);
        this.f12370q = c.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f12369p;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i4) {
        int i5 = this.f12369p;
        if (i4 >= i5) {
            return null;
        }
        int i6 = i4 + this.f12370q;
        if (i6 > i5) {
            i6 -= i5;
        }
        return Integer.valueOf(i6);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i5 = i4 + this.f12370q;
        int i6 = this.f12369p;
        if (i5 > i6) {
            i5 -= i6;
        }
        Calendar calendar = this.f12368o;
        calendar.set(7, i5);
        textView.setText(calendar.getDisplayName(7, f12367r, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
