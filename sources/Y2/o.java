package Y2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import l.M;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class o extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f2187b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TextView d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f2188e;

    public o(p pVar, int i4, TextView textView, int i5, TextView textView2) {
        this.f2188e = pVar;
        this.f2186a = i4;
        this.f2187b = textView;
        this.c = i5;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        M m4;
        int i4 = this.f2186a;
        p pVar = this.f2188e;
        pVar.f2195i = i4;
        pVar.f2193g = null;
        TextView textView = this.f2187b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.c == 1 && (m4 = pVar.f2199m) != null) {
                m4.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
