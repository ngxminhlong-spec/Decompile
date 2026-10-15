package W2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f2024b;

    public /* synthetic */ a(l lVar, int i4) {
        this.f2023a = i4;
        this.f2024b = lVar;
    }

    public /* synthetic */ a(l lVar, int i4, int i5) {
        this.f2023a = i5;
        this.f2024b = lVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2023a) {
            case 0:
                this.f2024b.c();
                return;
            case 1:
                this.f2024b.b();
                return;
            case 2:
                this.f2024b.c();
                return;
            default:
                this.f2024b.b();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2023a) {
            case 2:
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.f2024b.d;
                snackbarContentLayout.f12451o.setAlpha(0.0f);
                long j4 = 180;
                long j5 = 70;
                snackbarContentLayout.f12451o.animate().alpha(1.0f).setDuration(j4).setStartDelay(j5).start();
                if (snackbarContentLayout.f12452p.getVisibility() == 0) {
                    snackbarContentLayout.f12452p.setAlpha(0.0f);
                    snackbarContentLayout.f12452p.animate().alpha(1.0f).setDuration(j4).setStartDelay(j5).start();
                    return;
                }
                return;
            case 3:
                SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) this.f2024b.d;
                snackbarContentLayout2.f12451o.setAlpha(1.0f);
                long j6 = 180;
                long j7 = 0;
                snackbarContentLayout2.f12451o.animate().alpha(0.0f).setDuration(j6).setStartDelay(j7).start();
                if (snackbarContentLayout2.f12452p.getVisibility() == 0) {
                    snackbarContentLayout2.f12452p.setAlpha(1.0f);
                    snackbarContentLayout2.f12452p.animate().alpha(0.0f).setDuration(j6).setStartDelay(j7).start();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
