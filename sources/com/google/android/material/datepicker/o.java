package com.google.android.material.datepicker;

import H.A;
import H.AbstractC0047w;
import H.C0026a;
import H.C0027b;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b0.c0;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class o extends c0 {

    /* renamed from: t, reason: collision with root package name */
    public final TextView f12414t;

    /* renamed from: u, reason: collision with root package name */
    public final MaterialCalendarGridView f12415u;

    public o(LinearLayout linearLayout, boolean z4) {
        super(linearLayout);
        Object tag;
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f12414t = textView;
        WeakHashMap weakHashMap = A.f779a;
        Boolean bool = Boolean.TRUE;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            AbstractC0047w.d(textView, true);
        } else {
            if (i4 >= 28) {
                tag = Boolean.valueOf(AbstractC0047w.b(textView));
            } else {
                tag = textView.getTag(R.id.tag_accessibility_heading);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool2 = (Boolean) tag;
            if (!(bool2 != null && bool2.booleanValue())) {
                View.AccessibilityDelegate c = A.c(textView);
                C0027b c0027b = c != null ? c instanceof C0026a ? ((C0026a) c).f809a : new C0027b(c) : null;
                A.h(textView, c0027b == null ? new C0027b() : c0027b);
                textView.setTag(R.id.tag_accessibility_heading, bool);
                A.e(textView, 0);
            }
        }
        this.f12415u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z4) {
            return;
        }
        textView.setVisibility(8);
    }
}
