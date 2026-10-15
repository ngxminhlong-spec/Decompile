package W2;

import H.InterfaceC0035j;
import H.W;
import H.a0;
import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e implements InterfaceC0035j, i {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f2029o;

    public /* synthetic */ e(l lVar) {
        this.f2029o = lVar;
    }

    @Override // H.InterfaceC0035j
    public a0 m(View view, a0 a0Var) {
        int a4 = a0Var.a();
        l lVar = this.f2029o;
        lVar.f2048h = a4;
        W w2 = a0Var.f811a;
        lVar.f2049i = w2.j().f1a;
        lVar.f2050j = w2.j().c;
        lVar.d();
        return a0Var;
    }
}
