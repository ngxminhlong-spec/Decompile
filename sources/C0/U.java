package C0;

import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import f.AbstractActivityC1671f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class U implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f253o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v0 f254p;

    public /* synthetic */ U(v0 v0Var, int i4) {
        this.f253o = i4;
        this.f254p = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f253o) {
            case 0:
                this.f254p.f426h0.n(8388611);
                return;
            case 1:
                int id = view.getId();
                v0 v0Var = this.f254p;
                if (id == R.id.projects_tab) {
                    l0.b(v0Var.f427i0, true);
                    return;
                }
                if (view.getId() == R.id.tutorials_tab) {
                    u0.b(v0Var.f435q0, true);
                    return;
                } else if (view.getId() == R.id.learning_tab) {
                    C0001a0.d(v0Var.f436r0, true);
                    return;
                } else {
                    if (view.getId() == R.id.shared_tab) {
                        s0.a(v0Var.f437s0, true);
                        return;
                    }
                    return;
                }
            case 2:
                v0 v0Var2 = this.f254p;
                AbstractActivityC1671f h4 = v0Var2.h();
                if (h4 == null) {
                    return;
                }
                v0Var2.U(i1.c.f(h4), true);
                return;
            case 3:
                ((MainActivity) this.f254p.f432n0).E(0);
                return;
            default:
                v0 v0Var3 = this.f254p;
                AbstractActivityC1671f h5 = v0Var3.h();
                if (h5 == null) {
                    return;
                }
                v0Var3.U(i1.c.f(h5), true);
                return;
        }
    }
}
