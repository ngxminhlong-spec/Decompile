package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import b0.AbstractC0178L;
import java.util.Calendar;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12375o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p f12376p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i f12377q;

    public /* synthetic */ h(i iVar, p pVar, int i4) {
        this.f12375o = i4;
        this.f12377q = iVar;
        this.f12376p = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f12375o) {
            case 0:
                i iVar = this.f12377q;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) iVar.f12384n0.getLayoutManager();
                View L02 = linearLayoutManager.L0(0, linearLayoutManager.v(), false);
                int H3 = (L02 == null ? -1 : AbstractC0178L.H(L02)) + 1;
                if (H3 < iVar.f12384n0.getAdapter().a()) {
                    Calendar a4 = u.a(this.f12376p.c.f12360o.f12401o);
                    a4.add(2, H3);
                    iVar.K(new l(a4));
                    return;
                }
                return;
            default:
                i iVar2 = this.f12377q;
                int J0 = ((LinearLayoutManager) iVar2.f12384n0.getLayoutManager()).J0() - 1;
                if (J0 >= 0) {
                    Calendar a5 = u.a(this.f12376p.c.f12360o.f12401o);
                    a5.add(2, J0);
                    iVar2.K(new l(a5));
                    return;
                }
                return;
        }
    }
}
