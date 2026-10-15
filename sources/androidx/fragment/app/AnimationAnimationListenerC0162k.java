package androidx.fragment.app;

import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0162k implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0157f f2871b;
    public final /* synthetic */ s c;

    public AnimationAnimationListenerC0162k(s sVar, ViewGroup viewGroup, AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f) {
        this.c = sVar;
        this.f2870a = viewGroup;
        this.f2871b = abstractComponentCallbacksC0157f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f2870a.post(new D0.o(16, this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
