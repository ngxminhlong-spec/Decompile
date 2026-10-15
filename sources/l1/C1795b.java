package l1;

import C0.v0;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.ads.C0326Qb;
import com.google.android.gms.internal.ads.C0783ji;
import f.C1667b;
import f.DialogC1670e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1795b implements A2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0783ji f13940a;

    public C1795b(C0783ji c0783ji) {
        this.f13940a = c0783ji;
    }

    @Override // A2.e
    public final void c(Exception exc) {
        C0326Qb c0326Qb = (C0326Qb) this.f13940a.f9212q;
        if (((DialogC1670e) c0326Qb.f6659o).isShowing()) {
            L2.b bVar = new L2.b(((v0) c0326Qb.f6662r).l());
            bVar.s(R.string.upload_error);
            C1667b c1667b = (C1667b) bVar.f113p;
            c1667b.f12789f = c1667b.f12786a.getText(R.string.upload_error_msg);
            bVar.q(R.string.close, null);
            bVar.k();
        }
        ((DialogC1670e) c0326Qb.f6659o).dismiss();
    }
}
