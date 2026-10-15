package D0;

import C0.C0001a0;
import C0.l0;
import C0.u0;
import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import f.AbstractActivityC1671f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f585o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p f586p;

    public /* synthetic */ i(p pVar, int i4) {
        this.f585o = i4;
        this.f586p = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f585o) {
            case 0:
                int id = view.getId();
                p pVar = this.f586p;
                if (id == R.id.projects_tab) {
                    l0.a(pVar.f619h0, true);
                    return;
                } else if (view.getId() == R.id.tutorials_tab) {
                    u0.a(pVar.f627p0, true);
                    return;
                } else {
                    if (view.getId() == R.id.learning_tab) {
                        C0001a0.a(pVar.f628q0, true);
                        return;
                    }
                    return;
                }
            case 1:
                p pVar2 = this.f586p;
                AbstractActivityC1671f h4 = pVar2.h();
                if (h4 == null) {
                    return;
                }
                pVar2.T(i1.c.f(h4), true);
                return;
            case 2:
                ((MainActivity) this.f586p.f624m0).E(0);
                return;
            default:
                p pVar3 = this.f586p;
                AbstractActivityC1671f h5 = pVar3.h();
                if (h5 == null) {
                    return;
                }
                pVar3.T(i1.c.f(h5), true);
                return;
        }
    }
}
