package k0;

import android.view.ViewGroup;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d extends p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13503a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f13504b;

    public d(ViewGroup viewGroup) {
        this.f13504b = viewGroup;
    }

    @Override // k0.p, k0.n
    public final void b() {
        android.support.v4.media.session.a.v(this.f13504b, false);
    }

    @Override // k0.p, k0.n
    public final void c() {
        android.support.v4.media.session.a.v(this.f13504b, true);
    }

    @Override // k0.p, k0.n
    public final void d() {
        android.support.v4.media.session.a.v(this.f13504b, false);
        this.f13503a = true;
    }

    @Override // k0.n
    public final void e(o oVar) {
        if (!this.f13503a) {
            android.support.v4.media.session.a.v(this.f13504b, false);
        }
        oVar.v(this);
    }
}
