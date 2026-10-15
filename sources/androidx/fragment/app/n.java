package androidx.fragment.app;

import H.ViewTreeObserverOnPreDrawListenerC0036k;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class n extends AnimationSet implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final ViewGroup f2875o;

    /* renamed from: p, reason: collision with root package name */
    public final View f2876p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2877q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2878r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2879s;

    public n(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f2879s = true;
        this.f2875o = viewGroup;
        this.f2876p = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j4, Transformation transformation) {
        this.f2879s = true;
        if (this.f2877q) {
            return !this.f2878r;
        }
        if (!super.getTransformation(j4, transformation)) {
            this.f2877q = true;
            ViewTreeObserverOnPreDrawListenerC0036k.a(this.f2875o, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j4, Transformation transformation, float f4) {
        this.f2879s = true;
        if (this.f2877q) {
            return !this.f2878r;
        }
        if (!super.getTransformation(j4, transformation, f4)) {
            this.f2877q = true;
            ViewTreeObserverOnPreDrawListenerC0036k.a(this.f2875o, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = this.f2877q;
        ViewGroup viewGroup = this.f2875o;
        if (z4 || !this.f2879s) {
            viewGroup.endViewTransition(this.f2876p);
            this.f2878r = true;
        } else {
            this.f2879s = false;
            viewGroup.post(this);
        }
    }
}
