package k0;

import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g extends p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13515a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13516b;

    public /* synthetic */ g() {
        this.f13515a = 2;
    }

    public /* synthetic */ g(int i4, Object obj) {
        this.f13515a = i4;
        this.f13516b = obj;
    }

    @Override // k0.p, k0.n
    public void a() {
        switch (this.f13515a) {
            case 2:
                t tVar = (t) this.f13516b;
                if (tVar.f13558M) {
                    return;
                }
                tVar.E();
                tVar.f13558M = true;
                return;
            default:
                return;
        }
    }

    @Override // k0.n
    public final void e(o oVar) {
        switch (this.f13515a) {
            case 0:
                View view = (View) this.f13516b;
                x xVar = w.f13563a;
                xVar.Q(view, 1.0f);
                xVar.getClass();
                oVar.v(this);
                return;
            case 1:
                ((o) this.f13516b).y();
                oVar.v(this);
                return;
            default:
                t tVar = (t) this.f13516b;
                int i4 = tVar.f13557L - 1;
                tVar.f13557L = i4;
                if (i4 == 0) {
                    tVar.f13558M = false;
                    tVar.m();
                }
                oVar.v(this);
                return;
        }
    }
}
