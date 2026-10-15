package C0;

import android.view.View;
import b0.AbstractC0171E;
import c1.C0234c;
import com.duracodefactory.logiccircuitsimulatorpro.ui.IcSetup;
import n1.C1808a;
import n1.C1809b;
import n1.InterfaceC1811d;
import o1.C1881r;
import o1.C1882s;
import o1.InterfaceC1883t;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g0 implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f318o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f319p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f320q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC0171E f321r;

    public /* synthetic */ g0(AbstractC0171E abstractC0171E, Object obj, Object obj2, int i4) {
        this.f318o = i4;
        this.f321r = abstractC0171E;
        this.f320q = obj;
        this.f319p = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i4 = this.f318o;
        Object obj = this.f319p;
        Object obj2 = this.f320q;
        AbstractC0171E abstractC0171E = this.f321r;
        switch (i4) {
            case 0:
                v0 v0Var = (v0) ((j0) abstractC0171E).f334f;
                v0Var.f424I0.remove(Integer.valueOf(((e0) obj2).b()));
                i1.c.a(v0Var.l(), (i1.d) obj);
                return;
            case 1:
                D0.p pVar = (D0.p) ((j0) abstractC0171E).f334f;
                pVar.f617D0.remove(Integer.valueOf(((D0.m) obj2).b()));
                i1.c.a(pVar.l(), (i1.d) obj);
                return;
            case 2:
                q0 q0Var = (q0) abstractC0171E;
                q0Var.d = ((C1809b) obj2).b();
                ((InterfaceC1811d) q0Var.f370f).t(((C1808a) obj).f14105a);
                q0Var.d();
                return;
            default:
                C1881r c1881r = (C1881r) abstractC0171E;
                IcSetup icSetup = (IcSetup) c1881r.f14299e;
                C0234c c0234c = (C0234c) obj2;
                int i5 = c0234c.f3547p;
                c0234c.f3547p = i5 != 1 ? i5 == 3 ? 4 : i5 == 4 ? 2 : 1 : 3;
                int i6 = IcSetup.f3618E;
                icSetup.b();
                c1881r.i();
                c1881r.e(((C1882s) obj).b());
                InterfaceC1883t interfaceC1883t = icSetup.y;
                if (interfaceC1883t != null) {
                    interfaceC1883t.s();
                    return;
                }
                return;
        }
    }
}
