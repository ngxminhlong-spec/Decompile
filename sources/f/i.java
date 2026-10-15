package f;

import H.A;
import H.F;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12844o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q f12845p;

    public /* synthetic */ i(q qVar, int i4) {
        this.f12844o = i4;
        this.f12845p = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i4 = this.f12844o;
        q qVar = this.f12845p;
        switch (i4) {
            case 0:
                if ((qVar.f12902g0 & 1) != 0) {
                    qVar.p(0);
                }
                if ((qVar.f12902g0 & 4096) != 0) {
                    qVar.p(108);
                }
                qVar.f12901f0 = false;
                qVar.f12902g0 = 0;
                return;
            default:
                qVar.f12875E.showAtLocation(qVar.f12874D, 55, 0, 0);
                F f4 = qVar.f12877G;
                if (f4 != null) {
                    f4.b();
                }
                if (qVar.f12878H && (viewGroup = qVar.f12879I) != null) {
                    WeakHashMap weakHashMap = A.f779a;
                    if (viewGroup.isLaidOut()) {
                        qVar.f12874D.setAlpha(0.0f);
                        F a4 = A.a(qVar.f12874D);
                        a4.a(1.0f);
                        qVar.f12877G = a4;
                        a4.d(new l(0, this));
                        return;
                    }
                }
                qVar.f12874D.setAlpha(1.0f);
                qVar.f12874D.setVisibility(0);
                return;
        }
    }
}
