package l;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.google.android.gms.internal.ads.Tw;
import g.AbstractC1678a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class M extends TextView implements J.l, J.b {

    /* renamed from: o, reason: collision with root package name */
    public final Tw f13659o;

    /* renamed from: p, reason: collision with root package name */
    public final L f13660p;

    /* renamed from: q, reason: collision with root package name */
    public final C1789w f13661q;

    /* renamed from: r, reason: collision with root package name */
    public Future f13662r;

    public M(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        y0.a(context);
        Tw tw = new Tw(this);
        this.f13659o = tw;
        tw.l(attributeSet, i4);
        L l4 = new L(this);
        this.f13660p = l4;
        l4.d(attributeSet, i4);
        l4.b();
        C1789w c1789w = new C1789w();
        c1789w.f13839b = this;
        this.f13661q = c1789w;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Tw tw = this.f13659o;
        if (tw != null) {
            tw.a();
        }
        L l4 = this.f13660p;
        if (l4 != null) {
            l4.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (J.b.f931b) {
            return super.getAutoSizeMaxTextSize();
        }
        L l4 = this.f13660p;
        if (l4 != null) {
            return Math.round(l4.f13654i.f13668e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (J.b.f931b) {
            return super.getAutoSizeMinTextSize();
        }
        L l4 = this.f13660p;
        if (l4 != null) {
            return Math.round(l4.f13654i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (J.b.f931b) {
            return super.getAutoSizeStepGranularity();
        }
        L l4 = this.f13660p;
        if (l4 != null) {
            return Math.round(l4.f13654i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (J.b.f931b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        L l4 = this.f13660p;
        return l4 != null ? l4.f13654i.f13669f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (J.b.f931b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        L l4 = this.f13660p;
        if (l4 != null) {
            return l4.f13654i.f13666a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        Tw tw = this.f13659o;
        if (tw != null) {
            return tw.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Tw tw = this.f13659o;
        if (tw != null) {
            return tw.j();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        z0 z0Var = this.f13660p.f13653h;
        if (z0Var != null) {
            return z0Var.f13867a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        z0 z0Var = this.f13660p.f13653h;
        if (z0Var != null) {
            return z0Var.f13868b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f13662r;
        if (future != null) {
            try {
                this.f13662r = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                com.google.android.gms.internal.play_billing.B.x(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1789w c1789w;
        TextClassifier textClassifier;
        if (Build.VERSION.SDK_INT >= 28 || (c1789w = this.f13661q) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier2 = (TextClassifier) c1789w.c;
        if (textClassifier2 != null) {
            return textClassifier2;
        }
        TextClassificationManager c = J.c(((TextView) c1789w.f13839b).getContext().getSystemService(B0.s.k()));
        if (c == null) {
            return TextClassifier.NO_OP;
        }
        textClassifier = c.getTextClassifier();
        return textClassifier;
    }

    public F.d getTextMetricsParamsCompat() {
        return com.google.android.gms.internal.play_billing.B.x(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC1895f.t(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        L l4 = this.f13660p;
        if (l4 == null || J.b.f931b) {
            return;
        }
        l4.f13654i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        Future future = this.f13662r;
        if (future != null) {
            try {
                this.f13662r = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                com.google.android.gms.internal.play_billing.B.x(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        L l4 = this.f13660p;
        if (l4 != null) {
            N n4 = l4.f13654i;
            if (J.b.f931b || !n4.f()) {
                return;
            }
            n4.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) {
        if (J.b.f931b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
            return;
        }
        L l4 = this.f13660p;
        if (l4 != null) {
            l4.f(i4, i5, i6, i7);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) {
        if (J.b.f931b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        L l4 = this.f13660p;
        if (l4 != null) {
            l4.g(iArr, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (J.b.f931b) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        L l4 = this.f13660p;
        if (l4 != null) {
            l4.h(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Tw tw = this.f13659o;
        if (tw != null) {
            tw.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        Tw tw = this.f13659o;
        if (tw != null) {
            tw.p(i4);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        L l4 = this.f13660p;
        if (l4 != null) {
            l4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        L l4 = this.f13660p;
        if (l4 != null) {
            l4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i4 != 0 ? AbstractC1678a.a(context, i4) : null, i5 != 0 ? AbstractC1678a.a(context, i5) : null, i6 != 0 ? AbstractC1678a.a(context, i6) : null, i7 != 0 ? AbstractC1678a.a(context, i7) : null);
        L l4 = this.f13660p;
        if (l4 != null) {
            l4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        L l4 = this.f13660p;
        if (l4 != null) {
            l4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i4 != 0 ? AbstractC1678a.a(context, i4) : null, i5 != 0 ? AbstractC1678a.a(context, i5) : null, i6 != 0 ? AbstractC1678a.a(context, i6) : null, i7 != 0 ? AbstractC1678a.a(context, i7) : null);
        L l4 = this.f13660p;
        if (l4 != null) {
            l4.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        L l4 = this.f13660p;
        if (l4 != null) {
            l4.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.google.android.gms.internal.play_billing.B.U(callback, this));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i4);
        } else {
            com.google.android.gms.internal.play_billing.B.O(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i4);
        } else {
            com.google.android.gms.internal.play_billing.B.P(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i4) {
        com.google.android.gms.internal.play_billing.B.f(i4);
        if (i4 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i4 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(F.e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        com.google.android.gms.internal.play_billing.B.x(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        Tw tw = this.f13659o;
        if (tw != null) {
            tw.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Tw tw = this.f13659o;
        if (tw != null) {
            tw.v(mode);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.z0, java.lang.Object] */
    @Override // J.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        L l4 = this.f13660p;
        if (l4.f13653h == null) {
            l4.f13653h = new Object();
        }
        z0 z0Var = l4.f13653h;
        z0Var.f13867a = colorStateList;
        z0Var.d = colorStateList != null;
        l4.f13649b = z0Var;
        l4.c = z0Var;
        l4.d = z0Var;
        l4.f13650e = z0Var;
        l4.f13651f = z0Var;
        l4.f13652g = z0Var;
        l4.b();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.z0, java.lang.Object] */
    @Override // J.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        L l4 = this.f13660p;
        if (l4.f13653h == null) {
            l4.f13653h = new Object();
        }
        z0 z0Var = l4.f13653h;
        z0Var.f13868b = mode;
        z0Var.c = mode != null;
        l4.f13649b = z0Var;
        l4.c = z0Var;
        l4.d = z0Var;
        l4.f13650e = z0Var;
        l4.f13651f = z0Var;
        l4.f13652g = z0Var;
        l4.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        L l4 = this.f13660p;
        if (l4 != null) {
            l4.e(context, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1789w c1789w;
        if (Build.VERSION.SDK_INT >= 28 || (c1789w = this.f13661q) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1789w.c = textClassifier;
        }
    }

    public void setTextFuture(Future<F.e> future) {
        this.f13662r = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(F.d dVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = dVar.f735b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i4 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i4 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i4 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i4 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i4 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i4 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i4 = 7;
            }
        }
        setTextDirection(i4);
        getPaint().set(dVar.f734a);
        setBreakStrategy(dVar.c);
        setHyphenationFrequency(dVar.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f4) {
        boolean z4 = J.b.f931b;
        if (z4) {
            super.setTextSize(i4, f4);
            return;
        }
        L l4 = this.f13660p;
        if (l4 != null) {
            N n4 = l4.f13654i;
            if (z4 || n4.f()) {
                return;
            }
            n4.g(i4, f4);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i4) {
        Typeface typeface2;
        if (typeface == null || i4 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            com.google.android.gms.internal.play_billing.B b4 = A.g.f5a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i4);
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i4);
    }
}
