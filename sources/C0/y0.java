package C0;

import android.view.View;
import f.AbstractActivityC1671f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class y0 implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f460o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ z0 f461p;

    public /* synthetic */ y0(z0 z0Var, int i4) {
        this.f460o = i4;
        this.f461p = z0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f460o) {
            case 0:
                AbstractActivityC1671f h4 = this.f461p.h();
                if (h4 != null) {
                    h4.onBackPressed();
                    return;
                }
                return;
            default:
                AbstractActivityC1671f h5 = this.f461p.h();
                if (h5 != null) {
                    h5.onBackPressed();
                    return;
                }
                return;
        }
    }
}
