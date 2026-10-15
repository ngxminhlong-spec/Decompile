package Y2;

import H.A;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.play_billing.B;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.M;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2189a;

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f2190b;
    public LinearLayout c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public FrameLayout f2191e;

    /* renamed from: f, reason: collision with root package name */
    public int f2192f;

    /* renamed from: g, reason: collision with root package name */
    public AnimatorSet f2193g;

    /* renamed from: h, reason: collision with root package name */
    public final float f2194h;

    /* renamed from: i, reason: collision with root package name */
    public int f2195i;

    /* renamed from: j, reason: collision with root package name */
    public int f2196j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2197k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2198l;

    /* renamed from: m, reason: collision with root package name */
    public M f2199m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f2200n;

    /* renamed from: o, reason: collision with root package name */
    public int f2201o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f2202p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2203q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2204r;

    /* renamed from: s, reason: collision with root package name */
    public M f2205s;

    /* renamed from: t, reason: collision with root package name */
    public int f2206t;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f2207u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f2208v;

    public p(TextInputLayout textInputLayout) {
        this.f2189a = textInputLayout.getContext();
        this.f2190b = textInputLayout;
        this.f2194h = r0.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public final void a(M m4, int i4) {
        if (this.c == null && this.f2191e == null) {
            Context context = this.f2189a;
            LinearLayout linearLayout = new LinearLayout(context);
            this.c = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.c;
            TextInputLayout textInputLayout = this.f2190b;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f2191e = new FrameLayout(context);
            this.c.addView(this.f2191e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i4 == 0 || i4 == 1) {
            this.f2191e.setVisibility(0);
            this.f2191e.addView(m4);
            this.f2192f++;
        } else {
            this.c.addView(m4, new LinearLayout.LayoutParams(-2, -2));
        }
        this.c.setVisibility(0);
        this.d++;
    }

    public final void b() {
        if (this.c != null) {
            TextInputLayout textInputLayout = this.f2190b;
            if (textInputLayout.getEditText() != null) {
                LinearLayout linearLayout = this.c;
                EditText editText = textInputLayout.getEditText();
                WeakHashMap weakHashMap = A.f779a;
                linearLayout.setPaddingRelative(editText.getPaddingStart(), 0, textInputLayout.getEditText().getPaddingEnd(), 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f2193g;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z4, M m4, int i4, int i5, int i6) {
        if (m4 == null || !z4) {
            return;
        }
        if (i4 == i6 || i4 == i5) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m4, (Property<M, Float>) View.ALPHA, i6 == i4 ? 1.0f : 0.0f);
            ofFloat.setDuration(167L);
            ofFloat.setInterpolator(C2.a.f507a);
            arrayList.add(ofFloat);
            if (i6 == i4) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(m4, (Property<M, Float>) View.TRANSLATION_Y, -this.f2194h, 0.0f);
                ofFloat2.setDuration(217L);
                ofFloat2.setInterpolator(C2.a.d);
                arrayList.add(ofFloat2);
            }
        }
    }

    public final boolean e() {
        return (this.f2196j != 1 || this.f2199m == null || TextUtils.isEmpty(this.f2197k)) ? false : true;
    }

    public final TextView f(int i4) {
        if (i4 == 1) {
            return this.f2199m;
        }
        if (i4 != 2) {
            return null;
        }
        return this.f2205s;
    }

    public final void g() {
        this.f2197k = null;
        c();
        if (this.f2195i == 1) {
            if (!this.f2204r || TextUtils.isEmpty(this.f2203q)) {
                this.f2196j = 0;
            } else {
                this.f2196j = 2;
            }
        }
        j(this.f2195i, this.f2196j, i(this.f2199m, null));
    }

    public final void h(M m4, int i4) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.c;
        if (linearLayout == null) {
            return;
        }
        if ((i4 == 0 || i4 == 1) && (frameLayout = this.f2191e) != null) {
            int i5 = this.f2192f - 1;
            this.f2192f = i5;
            if (i5 == 0) {
                frameLayout.setVisibility(8);
            }
            this.f2191e.removeView(m4);
        } else {
            linearLayout.removeView(m4);
        }
        int i6 = this.d - 1;
        this.d = i6;
        LinearLayout linearLayout2 = this.c;
        if (i6 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean i(M m4, CharSequence charSequence) {
        WeakHashMap weakHashMap = A.f779a;
        TextInputLayout textInputLayout = this.f2190b;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f2196j == this.f2195i && m4 != null && TextUtils.equals(m4.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void j(int i4, int i5, boolean z4) {
        TextView f4;
        TextView f5;
        if (i4 == i5) {
            return;
        }
        if (z4) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f2193g = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f2204r, this.f2205s, 2, i4, i5);
            d(arrayList, this.f2198l, this.f2199m, 1, i4, i5);
            B.E(animatorSet, arrayList);
            animatorSet.addListener(new o(this, i5, f(i4), i4, f(i5)));
            animatorSet.start();
        } else if (i4 != i5) {
            if (i5 != 0 && (f5 = f(i5)) != null) {
                f5.setVisibility(0);
                f5.setAlpha(1.0f);
            }
            if (i4 != 0 && (f4 = f(i4)) != null) {
                f4.setVisibility(4);
                if (i4 == 1) {
                    f4.setText((CharSequence) null);
                }
            }
            this.f2195i = i5;
        }
        TextInputLayout textInputLayout = this.f2190b;
        textInputLayout.p();
        textInputLayout.s(z4, false);
        textInputLayout.z();
    }
}
