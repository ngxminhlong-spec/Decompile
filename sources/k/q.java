package k;

import android.view.ActionProvider;
import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class q implements ActionProvider.VisibilityListener {

    /* renamed from: a, reason: collision with root package name */
    public final ActionProvider f13479a;

    /* renamed from: b, reason: collision with root package name */
    public o f13480b;

    public q(u uVar, ActionProvider actionProvider) {
        this.f13479a = actionProvider;
    }

    public final View a(p pVar) {
        return this.f13479a.onCreateActionView(pVar);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z4) {
        o oVar = this.f13480b;
        if (oVar != null) {
            m mVar = ((p) oVar.f13452p).f13467n;
            mVar.f13431h = true;
            mVar.p(true);
        }
    }
}
