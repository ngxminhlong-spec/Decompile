package E2;

import O2.k;
import P1.i;
import Y2.m;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import k0.o;
import q2.e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f715b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f714a = i4;
        this.f715b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f714a) {
            case 2:
                i iVar = (i) this.f715b;
                iVar.setEnabled(true);
                iVar.f1517o.setEnabled(true);
                return;
            case 7:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f715b;
                actionBarOverlayLayout.f2517K = null;
                actionBarOverlayLayout.y = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f714a) {
            case 0:
                ((HideBottomViewOnScrollBehavior) this.f715b).c = null;
                return;
            case 1:
                k kVar = (k) this.f715b;
                kVar.f1463t = 0;
                kVar.f1457n = null;
                return;
            case 2:
                i iVar = (i) this.f715b;
                iVar.setEnabled(true);
                iVar.f1517o.setEnabled(true);
                return;
            case 3:
                e eVar = (e) this.f715b;
                if (((ValueAnimator) eVar.f14710q) == animator) {
                    eVar.f14710q = null;
                    return;
                }
                return;
            case 4:
                m mVar = (m) this.f715b;
                mVar.c.setChecked(mVar.f2177j);
                mVar.f2183p.start();
                return;
            case 5:
                ((ExpandableTransformationBehavior) this.f715b).f12537b = null;
                return;
            case 6:
                ((o) this.f715b).m();
                animator.removeListener(this);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f715b;
                actionBarOverlayLayout.f2517K = null;
                actionBarOverlayLayout.y = false;
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f714a) {
            case 1:
                k kVar = (k) this.f715b;
                kVar.f1464u.a(0, false);
                kVar.f1463t = 2;
                kVar.f1457n = animator;
                return;
            case 2:
                i iVar = (i) this.f715b;
                iVar.setEnabled(false);
                iVar.f1517o.setEnabled(false);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
