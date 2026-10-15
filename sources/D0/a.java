package D0;

import android.view.View;
import d3.AbstractC1654b;
import f.AbstractActivityC1671f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f529o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g f530p;

    public /* synthetic */ a(g gVar, int i4) {
        this.f529o = i4;
        this.f530p = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f529o) {
            case 0:
                this.f530p.b0();
                return;
            case 1:
                this.f530p.f566h0.m();
                return;
            default:
                g gVar = this.f530p;
                AbstractActivityC1671f h4 = gVar.h();
                if (h4 != null) {
                    AbstractC1654b.a(h4, 3);
                }
                if (gVar.f566h0.getSelectedElement() instanceof e1.d) {
                    return;
                }
                gVar.i0(gVar.Y());
                return;
        }
    }
}
