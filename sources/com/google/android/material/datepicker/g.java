package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b0.AbstractC0178L;
import b0.AbstractC0182P;
import com.google.android.material.button.MaterialButton;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g extends AbstractC0182P {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f12373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f12374b;
    public final /* synthetic */ i c;

    public g(i iVar, p pVar, MaterialButton materialButton) {
        this.c = iVar;
        this.f12373a = pVar;
        this.f12374b = materialButton;
    }

    @Override // b0.AbstractC0182P
    public final void a(RecyclerView recyclerView, int i4) {
        if (i4 == 0) {
            recyclerView.announceForAccessibility(this.f12374b.getText());
        }
    }

    @Override // b0.AbstractC0182P
    public final void b(RecyclerView recyclerView, int i4, int i5) {
        int J0;
        b bVar = this.f12373a.c;
        i iVar = this.c;
        if (i4 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) iVar.f12384n0.getLayoutManager();
            View L02 = linearLayoutManager.L0(0, linearLayoutManager.v(), false);
            J0 = L02 == null ? -1 : AbstractC0178L.H(L02);
        } else {
            J0 = ((LinearLayoutManager) iVar.f12384n0.getLayoutManager()).J0();
        }
        Calendar a4 = u.a(bVar.f12360o.f12401o);
        a4.add(2, J0);
        iVar.f12380j0 = new l(a4);
        Calendar a5 = u.a(bVar.f12360o.f12401o);
        a5.add(2, J0);
        a5.set(5, 1);
        Calendar a6 = u.a(a5);
        a6.get(2);
        a6.get(1);
        a6.getMaximum(7);
        a6.getActualMaximum(5);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL, yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(a6.getTime());
        a6.getTimeInMillis();
        this.f12374b.setText(format);
    }
}
