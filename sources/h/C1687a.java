package h;

import android.graphics.drawable.Animatable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1687a extends android.support.v4.media.session.a {
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final Animatable f13042e;

    public /* synthetic */ C1687a(Animatable animatable, int i4) {
        this.d = i4;
        this.f13042e = animatable;
    }

    @Override // android.support.v4.media.session.a
    public final void t() {
        switch (this.d) {
            case 0:
                this.f13042e.start();
                return;
            default:
                ((l0.c) this.f13042e).start();
                return;
        }
    }

    @Override // android.support.v4.media.session.a
    public final void u() {
        switch (this.d) {
            case 0:
                this.f13042e.stop();
                return;
            default:
                ((l0.c) this.f13042e).stop();
                return;
        }
    }
}
