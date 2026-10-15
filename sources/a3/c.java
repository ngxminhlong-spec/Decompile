package a3;

import H.A;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;
import k0.w;
import k0.x;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2358a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2359b;
    public boolean c;

    public c(View view) {
        this.f2358a = 1;
        this.c = false;
        this.f2359b = view;
    }

    public c(View view, boolean z4) {
        this.f2358a = 0;
        this.c = z4;
        this.f2359b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2358a) {
            case 0:
                if (this.c) {
                    return;
                }
                this.f2359b.setVisibility(4);
                return;
            default:
                x xVar = w.f13563a;
                View view = this.f2359b;
                xVar.Q(view, 1.0f);
                if (this.c) {
                    view.setLayerType(0, null);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i4 = this.f2358a;
        View view = this.f2359b;
        switch (i4) {
            case 0:
                if (this.c) {
                    view.setVisibility(0);
                    return;
                }
                return;
            default:
                WeakHashMap weakHashMap = A.f779a;
                if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                    this.c = true;
                    view.setLayerType(2, null);
                    return;
                }
                return;
        }
    }
}
