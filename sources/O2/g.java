package O2;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1432o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1433p;

    public /* synthetic */ g(int i4, Object obj) {
        this.f1432o = i4;
        this.f1433p = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f1432o) {
            case 0:
                k kVar = (k) this.f1433p;
                float rotation = kVar.f1464u.getRotation();
                if (kVar.f1460q == rotation) {
                    return true;
                }
                kVar.f1460q = rotation;
                kVar.o();
                return true;
            default:
                ((CoordinatorLayout) this.f1433p).p(0);
                return true;
        }
    }
}
