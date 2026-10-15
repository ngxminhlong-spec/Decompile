package o1;

import android.view.View;
import c1.C0234c;
import com.duracodefactory.logiccircuitsimulatorpro.ui.IcSetup;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1880q implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14296o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1882s f14297p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1881r f14298q;

    public /* synthetic */ ViewOnClickListenerC1880q(C1881r c1881r, C1882s c1882s, int i4) {
        this.f14296o = i4;
        this.f14298q = c1881r;
        this.f14297p = c1882s;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14296o) {
            case 0:
                C1881r c1881r = this.f14298q;
                IcSetup icSetup = (IcSetup) c1881r.f14299e;
                int b4 = this.f14297p.b();
                if (b4 < 0 || b4 >= c1881r.d.size()) {
                    return;
                }
                icSetup.f3621C.remove(((C0234c) c1881r.d.remove(b4)).f3546o);
                c1881r.f3176a.f(b4);
                icSetup.b();
                c1881r.i();
                InterfaceC1883t interfaceC1883t = icSetup.y;
                if (interfaceC1883t != null) {
                    interfaceC1883t.s();
                    return;
                }
                return;
            default:
                IcSetup.a((IcSetup) this.f14298q.f14299e, this.f14297p.b());
                return;
        }
    }
}
