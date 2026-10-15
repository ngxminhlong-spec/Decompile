package D0;

import android.view.View;
import f.AbstractActivityC1671f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class q implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f638o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r f639p;

    public /* synthetic */ q(r rVar, int i4) {
        this.f638o = i4;
        this.f639p = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f638o) {
            case 0:
                AbstractActivityC1671f h4 = this.f639p.h();
                if (h4 != null) {
                    h4.onBackPressed();
                    return;
                }
                return;
            default:
                AbstractActivityC1671f h5 = this.f639p.h();
                if (h5 != null) {
                    h5.onBackPressed();
                    return;
                }
                return;
        }
    }
}
