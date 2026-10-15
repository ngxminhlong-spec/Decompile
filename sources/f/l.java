package f;

import H.A;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.gms.internal.ads.C0831kn;
import java.util.WeakHashMap;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class l extends AbstractC1806a {

    /* renamed from: n0, reason: collision with root package name */
    public final /* synthetic */ int f12848n0;

    /* renamed from: o0, reason: collision with root package name */
    public final /* synthetic */ Object f12849o0;

    public /* synthetic */ l(int i4, Object obj) {
        this.f12848n0 = i4;
        this.f12849o0 = obj;
    }

    @Override // H.G
    public final void a() {
        int i4 = this.f12848n0;
        Object obj = this.f12849o0;
        switch (i4) {
            case 0:
                q qVar = ((i) obj).f12845p;
                qVar.f12874D.setAlpha(1.0f);
                qVar.f12877G.d(null);
                qVar.f12877G = null;
                return;
            case 1:
                q qVar2 = (q) obj;
                qVar2.f12874D.setAlpha(1.0f);
                qVar2.f12877G.d(null);
                qVar2.f12877G = null;
                return;
            default:
                q qVar3 = (q) ((C0831kn) obj).f9320q;
                qVar3.f12874D.setVisibility(8);
                PopupWindow popupWindow = qVar3.f12875E;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (qVar3.f12874D.getParent() instanceof View) {
                    View view = (View) qVar3.f12874D.getParent();
                    WeakHashMap weakHashMap = A.f779a;
                    H.r.c(view);
                }
                qVar3.f12874D.removeAllViews();
                qVar3.f12877G.d(null);
                qVar3.f12877G = null;
                return;
        }
    }

    @Override // m2.AbstractC1806a, H.G
    public void c() {
        int i4 = this.f12848n0;
        Object obj = this.f12849o0;
        switch (i4) {
            case 0:
                ((i) obj).f12845p.f12874D.setVisibility(0);
                return;
            case 1:
                q qVar = (q) obj;
                qVar.f12874D.setVisibility(0);
                qVar.f12874D.sendAccessibilityEvent(32);
                if (qVar.f12874D.getParent() instanceof View) {
                    View view = (View) qVar.f12874D.getParent();
                    WeakHashMap weakHashMap = A.f779a;
                    H.r.c(view);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
