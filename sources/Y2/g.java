package Y2;

import C0.ViewOnClickListenerC0022w;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.material.textfield.TextInputLayout;
import g.AbstractC1678a;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g extends n {
    public final a d;

    /* renamed from: e, reason: collision with root package name */
    public final b f2160e;

    /* renamed from: f, reason: collision with root package name */
    public final c f2161f;

    /* renamed from: g, reason: collision with root package name */
    public final d f2162g;

    /* renamed from: h, reason: collision with root package name */
    public AnimatorSet f2163h;

    /* renamed from: i, reason: collision with root package name */
    public ValueAnimator f2164i;

    public g(TextInputLayout textInputLayout) {
        super(textInputLayout);
        int i4 = 0;
        this.d = new a(i4, this);
        this.f2160e = new b(i4, this);
        this.f2161f = new c(this, i4);
        this.f2162g = new d(this, 0);
    }

    @Override // Y2.n
    public final void a() {
        Drawable a4 = AbstractC1678a.a(this.f2185b, R.drawable.mtrl_ic_cancel);
        TextInputLayout textInputLayout = this.f2184a;
        textInputLayout.setEndIconDrawable(a4);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC0022w(8, this));
        LinkedHashSet linkedHashSet = textInputLayout.f12516p0;
        c cVar = this.f2161f;
        linkedHashSet.add(cVar);
        if (textInputLayout.f12521s != null) {
            cVar.a(textInputLayout);
        }
        textInputLayout.f12524t0.add(this.f2162g);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(C2.a.d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new f(this, 1));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = C2.a.f507a;
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(100L);
        ofFloat2.addUpdateListener(new f(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2163h = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f2163h.addListener(new e(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(linearInterpolator);
        ofFloat3.setDuration(100L);
        ofFloat3.addUpdateListener(new f(this, 0));
        this.f2164i = ofFloat3;
        ofFloat3.addListener(new e(this, 1));
    }

    @Override // Y2.n
    public final void c(boolean z4) {
        if (this.f2184a.getSuffixText() == null) {
            return;
        }
        d(z4);
    }

    public final void d(boolean z4) {
        boolean z5 = this.f2184a.g() == z4;
        if (z4) {
            this.f2164i.cancel();
            this.f2163h.start();
            if (z5) {
                this.f2163h.end();
                return;
            }
            return;
        }
        this.f2163h.cancel();
        this.f2164i.start();
        if (z5) {
            this.f2164i.end();
        }
    }
}
