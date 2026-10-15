package C0;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class V implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f255o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ View f256p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ H f257q;

    public /* synthetic */ V(H h4, View view, int i4) {
        this.f255o = i4;
        this.f257q = h4;
        this.f256p = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f255o) {
            case 0:
                this.f256p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                v0 v0Var = (v0) this.f257q;
                v0Var.f444z0.setSelected(v0Var.f428j0);
                return;
            default:
                this.f256p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                D0.p pVar = (D0.p) this.f257q;
                pVar.f634w0.setSelected(pVar.f620i0);
                return;
        }
    }
}
