package C0;

import android.view.animation.Animation;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b0 implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f282b;

    public /* synthetic */ b0(int i4, Object obj) {
        this.f281a = i4;
        this.f282b = obj;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.f281a) {
            case 0:
                ((c0) this.f282b).c.setVisibility(8);
                return;
            default:
                ((c0) this.f282b).c.setVisibility(8);
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i4 = this.f281a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i4 = this.f281a;
    }
}
