package b0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202o implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f3361a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3362b;
    public final float c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f3363e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3364f;

    /* renamed from: g, reason: collision with root package name */
    public final ValueAnimator f3365g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3366h;

    /* renamed from: i, reason: collision with root package name */
    public float f3367i;

    /* renamed from: j, reason: collision with root package name */
    public float f3368j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3369k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3370l = false;

    /* renamed from: m, reason: collision with root package name */
    public float f3371m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3372n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c0 f3373o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0206s f3374p;

    public C0202o(C0206s c0206s, c0 c0Var, int i4, float f4, float f5, float f6, float f7, int i5, c0 c0Var2) {
        this.f3374p = c0206s;
        this.f3372n = i5;
        this.f3373o = c0Var2;
        this.f3364f = i4;
        this.f3363e = c0Var;
        this.f3361a = f4;
        this.f3362b = f5;
        this.c = f6;
        this.d = f7;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3365g = ofFloat;
        ofFloat.addUpdateListener(new G2.a(4, this));
        ofFloat.setTarget(c0Var.f3244a);
        ofFloat.addListener(this);
        this.f3371m = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.f3370l) {
            this.f3363e.o(true);
        }
        this.f3370l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3371m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.f3369k) {
            return;
        }
        int i4 = this.f3372n;
        c0 c0Var = this.f3373o;
        C0206s c0206s = this.f3374p;
        if (i4 <= 0) {
            c0206s.f3395m.e(c0Var);
        } else {
            c0206s.f3385a.add(c0Var.f3244a);
            this.f3366h = true;
            if (i4 > 0) {
                c0206s.f3399q.post(new RunnableC0203p(c0206s, this, i4));
            }
        }
        View view = c0206s.f3404v;
        View view2 = c0Var.f3244a;
        if (view == view2) {
            c0206s.n(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
