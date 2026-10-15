package com.google.android.material.textfield;

import B0.q;
import H.A;
import P2.b;
import S2.a;
import V2.f;
import V2.g;
import V2.k;
import Y2.c;
import Y2.d;
import Y2.i;
import Y2.m;
import Y2.n;
import Y2.p;
import Y2.s;
import Y2.t;
import Y2.u;
import Y2.v;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.play_billing.B;
import com.google.android.material.internal.CheckableImageButton;
import g.AbstractC1678a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import l.M;
import l.T;
import l.r;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: A, reason: collision with root package name */
    public int f12457A;

    /* renamed from: A0, reason: collision with root package name */
    public Drawable f12458A0;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f12459B;

    /* renamed from: B0, reason: collision with root package name */
    public View.OnLongClickListener f12460B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f12461C;

    /* renamed from: C0, reason: collision with root package name */
    public View.OnLongClickListener f12462C0;

    /* renamed from: D, reason: collision with root package name */
    public M f12463D;

    /* renamed from: D0, reason: collision with root package name */
    public final CheckableImageButton f12464D0;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f12465E;

    /* renamed from: E0, reason: collision with root package name */
    public ColorStateList f12466E0;

    /* renamed from: F, reason: collision with root package name */
    public int f12467F;

    /* renamed from: F0, reason: collision with root package name */
    public ColorStateList f12468F0;

    /* renamed from: G, reason: collision with root package name */
    public ColorStateList f12469G;

    /* renamed from: G0, reason: collision with root package name */
    public ColorStateList f12470G0;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f12471H;

    /* renamed from: H0, reason: collision with root package name */
    public int f12472H0;

    /* renamed from: I, reason: collision with root package name */
    public CharSequence f12473I;

    /* renamed from: I0, reason: collision with root package name */
    public int f12474I0;

    /* renamed from: J, reason: collision with root package name */
    public final M f12475J;
    public int J0;

    /* renamed from: K, reason: collision with root package name */
    public CharSequence f12476K;

    /* renamed from: K0, reason: collision with root package name */
    public ColorStateList f12477K0;

    /* renamed from: L, reason: collision with root package name */
    public final M f12478L;

    /* renamed from: L0, reason: collision with root package name */
    public int f12479L0;

    /* renamed from: M, reason: collision with root package name */
    public boolean f12480M;

    /* renamed from: M0, reason: collision with root package name */
    public int f12481M0;
    public CharSequence N;
    public int N0;

    /* renamed from: O, reason: collision with root package name */
    public boolean f12482O;

    /* renamed from: O0, reason: collision with root package name */
    public int f12483O0;

    /* renamed from: P, reason: collision with root package name */
    public g f12484P;

    /* renamed from: P0, reason: collision with root package name */
    public int f12485P0;

    /* renamed from: Q, reason: collision with root package name */
    public g f12486Q;

    /* renamed from: Q0, reason: collision with root package name */
    public boolean f12487Q0;

    /* renamed from: R, reason: collision with root package name */
    public final k f12488R;

    /* renamed from: R0, reason: collision with root package name */
    public final b f12489R0;

    /* renamed from: S, reason: collision with root package name */
    public final int f12490S;

    /* renamed from: S0, reason: collision with root package name */
    public boolean f12491S0;

    /* renamed from: T, reason: collision with root package name */
    public int f12492T;

    /* renamed from: T0, reason: collision with root package name */
    public ValueAnimator f12493T0;

    /* renamed from: U, reason: collision with root package name */
    public final int f12494U;

    /* renamed from: U0, reason: collision with root package name */
    public boolean f12495U0;

    /* renamed from: V, reason: collision with root package name */
    public int f12496V;

    /* renamed from: V0, reason: collision with root package name */
    public boolean f12497V0;

    /* renamed from: W, reason: collision with root package name */
    public int f12498W;

    /* renamed from: a0, reason: collision with root package name */
    public int f12499a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f12500b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f12501c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Rect f12502d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Rect f12503e0;

    /* renamed from: f0, reason: collision with root package name */
    public final RectF f12504f0;

    /* renamed from: g0, reason: collision with root package name */
    public Typeface f12505g0;

    /* renamed from: h0, reason: collision with root package name */
    public final CheckableImageButton f12506h0;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f12507i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f12508j0;

    /* renamed from: k0, reason: collision with root package name */
    public PorterDuff.Mode f12509k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f12510l0;

    /* renamed from: m0, reason: collision with root package name */
    public ColorDrawable f12511m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f12512n0;

    /* renamed from: o, reason: collision with root package name */
    public final FrameLayout f12513o;

    /* renamed from: o0, reason: collision with root package name */
    public View.OnLongClickListener f12514o0;

    /* renamed from: p, reason: collision with root package name */
    public final LinearLayout f12515p;

    /* renamed from: p0, reason: collision with root package name */
    public final LinkedHashSet f12516p0;

    /* renamed from: q, reason: collision with root package name */
    public final LinearLayout f12517q;

    /* renamed from: q0, reason: collision with root package name */
    public int f12518q0;

    /* renamed from: r, reason: collision with root package name */
    public final FrameLayout f12519r;

    /* renamed from: r0, reason: collision with root package name */
    public final SparseArray f12520r0;

    /* renamed from: s, reason: collision with root package name */
    public EditText f12521s;

    /* renamed from: s0, reason: collision with root package name */
    public final CheckableImageButton f12522s0;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f12523t;

    /* renamed from: t0, reason: collision with root package name */
    public final LinkedHashSet f12524t0;

    /* renamed from: u, reason: collision with root package name */
    public final p f12525u;

    /* renamed from: u0, reason: collision with root package name */
    public ColorStateList f12526u0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f12527v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f12528v0;

    /* renamed from: w, reason: collision with root package name */
    public int f12529w;

    /* renamed from: w0, reason: collision with root package name */
    public PorterDuff.Mode f12530w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f12531x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f12532x0;
    public M y;

    /* renamed from: y0, reason: collision with root package name */
    public ColorDrawable f12533y0;

    /* renamed from: z, reason: collision with root package name */
    public int f12534z;

    /* renamed from: z0, reason: collision with root package name */
    public int f12535z0;

    /* JADX WARN: Removed duplicated region for block: B:73:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r30, android.util.AttributeSet r31) {
        /*
            Method dump skipped, instructions count: 1504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void d(CheckableImageButton checkableImageButton, boolean z4, ColorStateList colorStateList, boolean z5, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z4 || z5)) {
            drawable = drawable.mutate();
            if (z4) {
                drawable.setTintList(colorStateList);
            }
            if (z5) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private n getEndIconDelegate() {
        int i4 = this.f12518q0;
        SparseArray sparseArray = this.f12520r0;
        n nVar = (n) sparseArray.get(i4);
        return nVar != null ? nVar : (n) sparseArray.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        CheckableImageButton checkableImageButton = this.f12464D0;
        if (checkableImageButton.getVisibility() == 0) {
            return checkableImageButton;
        }
        if (this.f12518q0 == 0 || !g()) {
            return null;
        }
        return this.f12522s0;
    }

    public static void j(ViewGroup viewGroup, boolean z4) {
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            childAt.setEnabled(z4);
            if (childAt instanceof ViewGroup) {
                j((ViewGroup) childAt, z4);
            }
        }
    }

    public static void k(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = A.f779a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z4 = onLongClickListener != null;
        boolean z5 = hasOnClickListeners || z4;
        checkableImageButton.setFocusable(z5);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z4);
        checkableImageButton.setImportantForAccessibility(z5 ? 1 : 2);
    }

    private void setEditText(EditText editText) {
        boolean z4;
        boolean z5;
        if (this.f12521s != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f12518q0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f12521s = editText;
        h();
        setTextInputAccessibilityDelegate(new u(this));
        Typeface typeface = this.f12521s.getTypeface();
        b bVar = this.f12489R0;
        a aVar = bVar.f1557v;
        if (aVar != null) {
            aVar.f1763p0 = true;
        }
        if (bVar.f1554s != typeface) {
            bVar.f1554s = typeface;
            z4 = true;
        } else {
            z4 = false;
        }
        if (bVar.f1555t != typeface) {
            bVar.f1555t = typeface;
            z5 = true;
        } else {
            z5 = false;
        }
        if (z4 || z5) {
            bVar.g();
        }
        float textSize = this.f12521s.getTextSize();
        if (bVar.f1544i != textSize) {
            bVar.f1544i = textSize;
            bVar.g();
        }
        int gravity = this.f12521s.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (bVar.f1543h != i4) {
            bVar.f1543h = i4;
            bVar.g();
        }
        if (bVar.f1542g != gravity) {
            bVar.f1542g = gravity;
            bVar.g();
        }
        this.f12521s.addTextChangedListener(new Y2.a(3, this));
        if (this.f12468F0 == null) {
            this.f12468F0 = this.f12521s.getHintTextColors();
        }
        if (this.f12480M) {
            if (TextUtils.isEmpty(this.N)) {
                CharSequence hint = this.f12521s.getHint();
                this.f12523t = hint;
                setHint(hint);
                this.f12521s.setHint((CharSequence) null);
            }
            this.f12482O = true;
        }
        if (this.y != null) {
            m(this.f12521s.getText().length());
        }
        p();
        this.f12525u.b();
        this.f12515p.bringToFront();
        this.f12517q.bringToFront();
        this.f12519r.bringToFront();
        this.f12464D0.bringToFront();
        Iterator it = this.f12516p0.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(this);
        }
        u();
        x();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        s(false, true);
    }

    private void setErrorIconVisible(boolean z4) {
        this.f12464D0.setVisibility(z4 ? 0 : 8);
        this.f12519r.setVisibility(z4 ? 8 : 0);
        x();
        if (this.f12518q0 != 0) {
            return;
        }
        o();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.N)) {
            return;
        }
        this.N = charSequence;
        b bVar = this.f12489R0;
        if (charSequence == null || !TextUtils.equals(bVar.f1558w, charSequence)) {
            bVar.f1558w = charSequence;
            bVar.f1559x = null;
            Bitmap bitmap = bVar.f1560z;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.f1560z = null;
            }
            bVar.g();
        }
        if (this.f12487Q0) {
            return;
        }
        i();
    }

    private void setPlaceholderTextEnabled(boolean z4) {
        if (this.f12461C == z4) {
            return;
        }
        if (z4) {
            M m4 = new M(getContext(), null);
            this.f12463D = m4;
            m4.setId(R.id.textinput_placeholder);
            M m5 = this.f12463D;
            WeakHashMap weakHashMap = A.f779a;
            m5.setAccessibilityLiveRegion(1);
            setPlaceholderTextAppearance(this.f12467F);
            setPlaceholderTextColor(this.f12465E);
            M m6 = this.f12463D;
            if (m6 != null) {
                this.f12513o.addView(m6);
                this.f12463D.setVisibility(0);
            }
        } else {
            M m7 = this.f12463D;
            if (m7 != null) {
                m7.setVisibility(8);
            }
            this.f12463D = null;
        }
        this.f12461C = z4;
    }

    public final void a(float f4) {
        b bVar = this.f12489R0;
        if (bVar.c == f4) {
            return;
        }
        int i4 = 2;
        if (this.f12493T0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f12493T0 = valueAnimator;
            valueAnimator.setInterpolator(C2.a.f508b);
            this.f12493T0.setDuration(167L);
            this.f12493T0.addUpdateListener(new G2.a(i4, this));
        }
        this.f12493T0.setFloatValues(bVar.c, f4);
        this.f12493T0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i4, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f12513o;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        r();
        setEditText((EditText) view);
    }

    public final void b() {
        int i4;
        int i5;
        int i6;
        g gVar = this.f12484P;
        if (gVar == null) {
            return;
        }
        gVar.setShapeAppearanceModel(this.f12488R);
        if (this.f12492T == 2 && (i5 = this.f12496V) > -1 && (i6 = this.f12500b0) != 0) {
            g gVar2 = this.f12484P;
            gVar2.f1880o.f1861j = i5;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i6);
            f fVar = gVar2.f1880o;
            if (fVar.d != valueOf) {
                fVar.d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i7 = this.f12501c0;
        if (this.f12492T == 1) {
            TypedValue M4 = B.M(getContext(), R.attr.colorSurface);
            i7 = A.a.b(this.f12501c0, M4 != null ? M4.data : 0);
        }
        this.f12501c0 = i7;
        this.f12484P.i(ColorStateList.valueOf(i7));
        if (this.f12518q0 == 3) {
            this.f12521s.getBackground().invalidateSelf();
        }
        g gVar3 = this.f12486Q;
        if (gVar3 != null) {
            if (this.f12496V > -1 && (i4 = this.f12500b0) != 0) {
                gVar3.i(ColorStateList.valueOf(i4));
            }
            invalidate();
        }
        invalidate();
    }

    public final void c() {
        d(this.f12522s0, this.f12528v0, this.f12526u0, this.f12532x0, this.f12530w0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i4) {
        EditText editText;
        if (this.f12523t == null || (editText = this.f12521s) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i4);
            return;
        }
        boolean z4 = this.f12482O;
        this.f12482O = false;
        CharSequence hint = editText.getHint();
        this.f12521s.setHint(this.f12523t);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i4);
        } finally {
            this.f12521s.setHint(hint);
            this.f12482O = z4;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f12497V0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f12497V0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f12480M) {
            b bVar = this.f12489R0;
            bVar.getClass();
            int save = canvas.save();
            if (bVar.f1559x != null && bVar.f1539b) {
                bVar.f1537M.getLineLeft(0);
                bVar.f1529E.setTextSize(bVar.f1526B);
                float f4 = bVar.f1552q;
                float f5 = bVar.f1553r;
                float f6 = bVar.f1525A;
                if (f6 != 1.0f) {
                    canvas.scale(f6, f6, f4, f5);
                }
                canvas.translate(f4, f5);
                bVar.f1537M.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        g gVar = this.f12486Q;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.f12496V;
            this.f12486Q.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f12495U0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f12495U0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            P2.b r3 = r4.f12489R0
            if (r3 == 0) goto L2f
            r3.f1527C = r1
            android.content.res.ColorStateList r1 = r3.f1547l
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f1546k
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.g()
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f12521s
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = H.A.f779a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.s(r0, r2)
        L47:
            r4.p()
            r4.z()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.f12495U0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final int e() {
        float f4;
        if (!this.f12480M) {
            return 0;
        }
        int i4 = this.f12492T;
        b bVar = this.f12489R0;
        if (i4 == 0 || i4 == 1) {
            TextPaint textPaint = bVar.f1530F;
            textPaint.setTextSize(bVar.f1545j);
            textPaint.setTypeface(bVar.f1554s);
            f4 = -textPaint.ascent();
        } else {
            if (i4 != 2) {
                return 0;
            }
            TextPaint textPaint2 = bVar.f1530F;
            textPaint2.setTextSize(bVar.f1545j);
            textPaint2.setTypeface(bVar.f1554s);
            f4 = (-textPaint2.ascent()) / 2.0f;
        }
        return (int) f4;
    }

    public final boolean f() {
        return this.f12480M && !TextUtils.isEmpty(this.N) && (this.f12484P instanceof i);
    }

    public final boolean g() {
        return this.f12519r.getVisibility() == 0 && this.f12522s0.getVisibility() == 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f12521s;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i4 = this.f12492T;
        if (i4 == 1 || i4 == 2) {
            return this.f12484P;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f12501c0;
    }

    public int getBoxBackgroundMode() {
        return this.f12492T;
    }

    public float getBoxCornerRadiusBottomEnd() {
        g gVar = this.f12484P;
        return gVar.f1880o.f1854a.f1908h.a(gVar.e());
    }

    public float getBoxCornerRadiusBottomStart() {
        g gVar = this.f12484P;
        return gVar.f1880o.f1854a.f1907g.a(gVar.e());
    }

    public float getBoxCornerRadiusTopEnd() {
        g gVar = this.f12484P;
        return gVar.f1880o.f1854a.f1906f.a(gVar.e());
    }

    public float getBoxCornerRadiusTopStart() {
        g gVar = this.f12484P;
        return gVar.f1880o.f1854a.f1905e.a(gVar.e());
    }

    public int getBoxStrokeColor() {
        return this.J0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f12477K0;
    }

    public int getBoxStrokeWidth() {
        return this.f12498W;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f12499a0;
    }

    public int getCounterMaxLength() {
        return this.f12529w;
    }

    public CharSequence getCounterOverflowDescription() {
        M m4;
        if (this.f12527v && this.f12531x && (m4 = this.y) != null) {
            return m4.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f12469G;
    }

    public ColorStateList getCounterTextColor() {
        return this.f12469G;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f12468F0;
    }

    public EditText getEditText() {
        return this.f12521s;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f12522s0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f12522s0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f12518q0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f12522s0;
    }

    public CharSequence getError() {
        p pVar = this.f12525u;
        if (pVar.f2198l) {
            return pVar.f2197k;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f12525u.f2200n;
    }

    public int getErrorCurrentTextColors() {
        M m4 = this.f12525u.f2199m;
        if (m4 != null) {
            return m4.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f12464D0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        M m4 = this.f12525u.f2199m;
        if (m4 != null) {
            return m4.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHelperText() {
        p pVar = this.f12525u;
        if (pVar.f2204r) {
            return pVar.f2203q;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        M m4 = this.f12525u.f2205s;
        if (m4 != null) {
            return m4.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f12480M) {
            return this.N;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        b bVar = this.f12489R0;
        TextPaint textPaint = bVar.f1530F;
        textPaint.setTextSize(bVar.f1545j);
        textPaint.setTypeface(bVar.f1554s);
        return -textPaint.ascent();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f12489R0;
        return bVar.d(bVar.f1547l);
    }

    public ColorStateList getHintTextColor() {
        return this.f12470G0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f12522s0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f12522s0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f12461C) {
            return this.f12459B;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f12467F;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f12465E;
    }

    public CharSequence getPrefixText() {
        return this.f12473I;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f12475J.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f12475J;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f12506h0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f12506h0.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f12476K;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f12478L.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f12478L;
    }

    public Typeface getTypeface() {
        return this.f12505g0;
    }

    public final void h() {
        int i4 = this.f12492T;
        if (i4 != 0) {
            k kVar = this.f12488R;
            if (i4 == 1) {
                this.f12484P = new g(kVar);
                this.f12486Q = new g();
            } else {
                if (i4 != 2) {
                    throw new IllegalArgumentException(U.a.l(new StringBuilder(), this.f12492T, " is illegal; only @BoxBackgroundMode constants are supported."));
                }
                if (!this.f12480M || (this.f12484P instanceof i)) {
                    this.f12484P = new g(kVar);
                } else {
                    this.f12484P = new i(kVar);
                }
                this.f12486Q = null;
            }
        } else {
            this.f12484P = null;
            this.f12486Q = null;
        }
        EditText editText = this.f12521s;
        if (editText != null && this.f12484P != null && editText.getBackground() == null && this.f12492T != 0) {
            EditText editText2 = this.f12521s;
            g gVar = this.f12484P;
            WeakHashMap weakHashMap = A.f779a;
            editText2.setBackground(gVar);
        }
        z();
        if (this.f12492T != 0) {
            r();
        }
    }

    public final void i() {
        float f4;
        float b4;
        float f5;
        float b5;
        int i4;
        float b6;
        int i5;
        if (f()) {
            int width = this.f12521s.getWidth();
            int gravity = this.f12521s.getGravity();
            b bVar = this.f12489R0;
            CharSequence charSequence = bVar.f1558w;
            TextInputLayout textInputLayout = bVar.f1538a;
            WeakHashMap weakHashMap = A.f779a;
            boolean b7 = (textInputLayout.getLayoutDirection() == 1 ? F.g.d : F.g.c).b(charSequence, charSequence.length());
            bVar.y = b7;
            Rect rect = bVar.f1540e;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b7) {
                        i5 = rect.left;
                        f5 = i5;
                    } else {
                        f4 = rect.right;
                        b4 = bVar.b();
                    }
                } else if (b7) {
                    f4 = rect.right;
                    b4 = bVar.b();
                } else {
                    i5 = rect.left;
                    f5 = i5;
                }
                RectF rectF = this.f12504f0;
                rectF.left = f5;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    b5 = (width / 2.0f) + (bVar.b() / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (bVar.y) {
                        b6 = bVar.b();
                        b5 = b6 + f5;
                    } else {
                        i4 = rect.right;
                        b5 = i4;
                    }
                } else if (bVar.y) {
                    i4 = rect.right;
                    b5 = i4;
                } else {
                    b6 = bVar.b();
                    b5 = b6 + f5;
                }
                rectF.right = b5;
                float f6 = rect.top;
                TextPaint textPaint = bVar.f1530F;
                textPaint.setTextSize(bVar.f1545j);
                textPaint.setTypeface(bVar.f1554s);
                float f7 = (-textPaint.ascent()) + f6;
                float f8 = rectF.left;
                float f9 = this.f12490S;
                rectF.left = f8 - f9;
                rectF.top -= f9;
                rectF.right += f9;
                rectF.bottom = f7 + f9;
                rectF.offset(-getPaddingLeft(), -getPaddingTop());
                i iVar = (i) this.f12484P;
                iVar.getClass();
                iVar.m(rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
            f4 = width / 2.0f;
            b4 = bVar.b() / 2.0f;
            f5 = f4 - b4;
            RectF rectF2 = this.f12504f0;
            rectF2.left = f5;
            rectF2.top = rect.top;
            if (gravity != 17) {
            }
            b5 = (width / 2.0f) + (bVar.b() / 2.0f);
            rectF2.right = b5;
            float f62 = rect.top;
            TextPaint textPaint2 = bVar.f1530F;
            textPaint2.setTextSize(bVar.f1545j);
            textPaint2.setTypeface(bVar.f1554s);
            float f72 = (-textPaint2.ascent()) + f62;
            float f82 = rectF2.left;
            float f92 = this.f12490S;
            rectF2.left = f82 - f92;
            rectF2.top -= f92;
            rectF2.right += f92;
            rectF2.bottom = f72 + f92;
            rectF2.offset(-getPaddingLeft(), -getPaddingTop());
            i iVar2 = (i) this.f12484P;
            iVar2.getClass();
            iVar2.m(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
        }
    }

    public final void l(M m4, int i4) {
        try {
            m4.setTextAppearance(i4);
            if (m4.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        m4.setTextAppearance(R.style.TextAppearance_AppCompat_Caption);
        m4.setTextColor(getContext().getColor(R.color.design_error));
    }

    public final void m(int i4) {
        boolean z4 = this.f12531x;
        int i5 = this.f12529w;
        if (i5 == -1) {
            this.y.setText(String.valueOf(i4));
            this.y.setContentDescription(null);
            this.f12531x = false;
        } else {
            this.f12531x = i4 > i5;
            Context context = getContext();
            this.y.setContentDescription(context.getString(this.f12531x ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i4), Integer.valueOf(this.f12529w)));
            if (z4 != this.f12531x) {
                n();
            }
            String str = F.b.f731b;
            F.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? F.b.f732e : F.b.d;
            M m4 = this.y;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i4), Integer.valueOf(this.f12529w));
            bVar.getClass();
            q qVar = F.g.f737a;
            m4.setText(string != null ? bVar.c(string).toString() : null);
        }
        if (this.f12521s == null || z4 == this.f12531x) {
            return;
        }
        s(false, false);
        z();
        p();
    }

    public final void n() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        M m4 = this.y;
        if (m4 != null) {
            l(m4, this.f12531x ? this.f12534z : this.f12457A);
            if (!this.f12531x && (colorStateList2 = this.f12469G) != null) {
                this.y.setTextColor(colorStateList2);
            }
            if (!this.f12531x || (colorStateList = this.f12471H) == null) {
                return;
            }
            this.y.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o() {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.o():boolean");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        EditText editText = this.f12521s;
        if (editText != null) {
            ThreadLocal threadLocal = P2.c.f1561a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f12502d0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = P2.c.f1561a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            P2.c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = P2.c.f1562b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f12486Q;
            if (gVar != null) {
                int i8 = rect.bottom;
                gVar.setBounds(rect.left, i8 - this.f12499a0, rect.right, i8);
            }
            if (this.f12480M) {
                float textSize = this.f12521s.getTextSize();
                b bVar = this.f12489R0;
                if (bVar.f1544i != textSize) {
                    bVar.f1544i = textSize;
                    bVar.g();
                }
                int gravity = this.f12521s.getGravity();
                int i9 = (gravity & (-113)) | 48;
                if (bVar.f1543h != i9) {
                    bVar.f1543h = i9;
                    bVar.g();
                }
                if (bVar.f1542g != gravity) {
                    bVar.f1542g = gravity;
                    bVar.g();
                }
                if (this.f12521s == null) {
                    throw new IllegalStateException();
                }
                WeakHashMap weakHashMap = A.f779a;
                boolean z5 = getLayoutDirection() == 1;
                int i10 = rect.bottom;
                Rect rect2 = this.f12503e0;
                rect2.bottom = i10;
                int i11 = this.f12492T;
                M m4 = this.f12475J;
                if (i11 == 1) {
                    int compoundPaddingLeft = this.f12521s.getCompoundPaddingLeft() + rect.left;
                    if (this.f12473I != null && !z5) {
                        compoundPaddingLeft = (compoundPaddingLeft - m4.getMeasuredWidth()) + m4.getPaddingLeft();
                    }
                    rect2.left = compoundPaddingLeft;
                    rect2.top = rect.top + this.f12494U;
                    int compoundPaddingRight = rect.right - this.f12521s.getCompoundPaddingRight();
                    if (this.f12473I != null && z5) {
                        compoundPaddingRight += m4.getMeasuredWidth() - m4.getPaddingRight();
                    }
                    rect2.right = compoundPaddingRight;
                } else if (i11 != 2) {
                    int compoundPaddingLeft2 = this.f12521s.getCompoundPaddingLeft() + rect.left;
                    if (this.f12473I != null && !z5) {
                        compoundPaddingLeft2 = (compoundPaddingLeft2 - m4.getMeasuredWidth()) + m4.getPaddingLeft();
                    }
                    rect2.left = compoundPaddingLeft2;
                    rect2.top = getPaddingTop();
                    int compoundPaddingRight2 = rect.right - this.f12521s.getCompoundPaddingRight();
                    if (this.f12473I != null && z5) {
                        compoundPaddingRight2 += m4.getMeasuredWidth() - m4.getPaddingRight();
                    }
                    rect2.right = compoundPaddingRight2;
                } else {
                    rect2.left = this.f12521s.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - e();
                    rect2.right = rect.right - this.f12521s.getPaddingRight();
                }
                int i12 = rect2.left;
                int i13 = rect2.top;
                int i14 = rect2.right;
                int i15 = rect2.bottom;
                Rect rect3 = bVar.f1540e;
                if (rect3.left != i12 || rect3.top != i13 || rect3.right != i14 || rect3.bottom != i15) {
                    rect3.set(i12, i13, i14, i15);
                    bVar.f1528D = true;
                    bVar.f();
                }
                if (this.f12521s == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = bVar.f1530F;
                textPaint.setTextSize(bVar.f1544i);
                textPaint.setTypeface(bVar.f1555t);
                float f4 = -textPaint.ascent();
                rect2.left = this.f12521s.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f12492T != 1 || this.f12521s.getMinLines() > 1) ? rect.top + this.f12521s.getCompoundPaddingTop() : (int) (rect.centerY() - (f4 / 2.0f));
                rect2.right = rect.right - this.f12521s.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f12492T != 1 || this.f12521s.getMinLines() > 1) ? rect.bottom - this.f12521s.getCompoundPaddingBottom() : (int) (rect2.top + f4);
                rect2.bottom = compoundPaddingBottom;
                int i16 = rect2.left;
                int i17 = rect2.top;
                int i18 = rect2.right;
                Rect rect4 = bVar.d;
                if (rect4.left != i16 || rect4.top != i17 || rect4.right != i18 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i16, i17, i18, compoundPaddingBottom);
                    bVar.f1528D = true;
                    bVar.f();
                }
                bVar.g();
                if (!f() || this.f12487Q0) {
                    return;
                }
                i();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        EditText editText;
        int max;
        super.onMeasure(i4, i5);
        boolean z4 = false;
        if (this.f12521s != null && this.f12521s.getMeasuredHeight() < (max = Math.max(this.f12517q.getMeasuredHeight(), this.f12515p.getMeasuredHeight()))) {
            this.f12521s.setMinimumHeight(max);
            z4 = true;
        }
        boolean o4 = o();
        if (z4 || o4) {
            this.f12521s.post(new t(this, 1));
        }
        if (this.f12463D != null && (editText = this.f12521s) != null) {
            this.f12463D.setGravity(editText.getGravity());
            this.f12463D.setPadding(this.f12521s.getCompoundPaddingLeft(), this.f12521s.getCompoundPaddingTop(), this.f12521s.getCompoundPaddingRight(), this.f12521s.getCompoundPaddingBottom());
        }
        u();
        x();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof v)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v vVar = (v) parcelable;
        super.onRestoreInstanceState(vVar.f1071o);
        setError(vVar.f2218q);
        if (vVar.f2219r) {
            this.f12522s0.post(new t(this, 0));
        }
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [L.b, android.os.Parcelable, Y2.v] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new L.b(super.onSaveInstanceState());
        if (this.f12525u.e()) {
            bVar.f2218q = getError();
        }
        bVar.f2219r = this.f12518q0 != 0 && this.f12522s0.f12437q;
        return bVar;
    }

    public final void p() {
        Drawable background;
        M m4;
        EditText editText = this.f12521s;
        if (editText == null || this.f12492T != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (T.a(background)) {
            background = background.mutate();
        }
        p pVar = this.f12525u;
        if (pVar.e()) {
            M m5 = pVar.f2199m;
            background.setColorFilter(r.c(m5 != null ? m5.getCurrentTextColor() : -1, PorterDuff.Mode.SRC_IN));
        } else if (this.f12531x && (m4 = this.y) != null) {
            background.setColorFilter(r.c(m4.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            background.clearColorFilter();
            this.f12521s.refreshDrawableState();
        }
    }

    public final void q(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public final void r() {
        if (this.f12492T != 1) {
            FrameLayout frameLayout = this.f12513o;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e4 = e();
            if (e4 != layoutParams.topMargin) {
                layoutParams.topMargin = e4;
                frameLayout.requestLayout();
            }
        }
    }

    public final void s(boolean z4, boolean z5) {
        ColorStateList colorStateList;
        M m4;
        boolean isEnabled = isEnabled();
        EditText editText = this.f12521s;
        boolean z6 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f12521s;
        boolean z7 = editText2 != null && editText2.hasFocus();
        p pVar = this.f12525u;
        boolean e4 = pVar.e();
        ColorStateList colorStateList2 = this.f12468F0;
        b bVar = this.f12489R0;
        if (colorStateList2 != null) {
            bVar.h(colorStateList2);
            ColorStateList colorStateList3 = this.f12468F0;
            if (bVar.f1546k != colorStateList3) {
                bVar.f1546k = colorStateList3;
                bVar.g();
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f12468F0;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.f12485P0) : this.f12485P0;
            bVar.h(ColorStateList.valueOf(colorForState));
            ColorStateList valueOf = ColorStateList.valueOf(colorForState);
            if (bVar.f1546k != valueOf) {
                bVar.f1546k = valueOf;
                bVar.g();
            }
        } else if (e4) {
            M m5 = pVar.f2199m;
            bVar.h(m5 != null ? m5.getTextColors() : null);
        } else if (this.f12531x && (m4 = this.y) != null) {
            bVar.h(m4.getTextColors());
        } else if (z7 && (colorStateList = this.f12470G0) != null) {
            bVar.h(colorStateList);
        }
        if (z6 || (isEnabled() && (z7 || e4))) {
            if (z5 || this.f12487Q0) {
                ValueAnimator valueAnimator = this.f12493T0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f12493T0.cancel();
                }
                if (z4 && this.f12491S0) {
                    a(1.0f);
                } else {
                    bVar.i(1.0f);
                }
                this.f12487Q0 = false;
                if (f()) {
                    i();
                }
                EditText editText3 = this.f12521s;
                t(editText3 != null ? editText3.getText().length() : 0);
                v();
                y();
                return;
            }
            return;
        }
        if (z5 || !this.f12487Q0) {
            ValueAnimator valueAnimator2 = this.f12493T0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f12493T0.cancel();
            }
            if (z4 && this.f12491S0) {
                a(0.0f);
            } else {
                bVar.i(0.0f);
            }
            if (f() && !((i) this.f12484P).f2166M.isEmpty() && f()) {
                ((i) this.f12484P).m(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f12487Q0 = true;
            M m6 = this.f12463D;
            if (m6 != null && this.f12461C) {
                m6.setText((CharSequence) null);
                this.f12463D.setVisibility(4);
            }
            v();
            y();
        }
    }

    public void setBoxBackgroundColor(int i4) {
        if (this.f12501c0 != i4) {
            this.f12501c0 = i4;
            this.f12479L0 = i4;
            this.N0 = i4;
            this.f12483O0 = i4;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i4) {
        setBoxBackgroundColor(getContext().getColor(i4));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f12479L0 = defaultColor;
        this.f12501c0 = defaultColor;
        this.f12481M0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.N0 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.f12483O0 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i4) {
        if (i4 == this.f12492T) {
            return;
        }
        this.f12492T = i4;
        if (this.f12521s != null) {
            h();
        }
    }

    public void setBoxStrokeColor(int i4) {
        if (this.J0 != i4) {
            this.J0 = i4;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f12472H0 = colorStateList.getDefaultColor();
            this.f12485P0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f12474I0 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.J0 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.J0 != colorStateList.getDefaultColor()) {
            this.J0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f12477K0 != colorStateList) {
            this.f12477K0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i4) {
        this.f12498W = i4;
        z();
    }

    public void setBoxStrokeWidthFocused(int i4) {
        this.f12499a0 = i4;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i4) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i4));
    }

    public void setBoxStrokeWidthResource(int i4) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i4));
    }

    public void setCounterEnabled(boolean z4) {
        if (this.f12527v != z4) {
            p pVar = this.f12525u;
            if (z4) {
                M m4 = new M(getContext(), null);
                this.y = m4;
                m4.setId(R.id.textinput_counter);
                Typeface typeface = this.f12505g0;
                if (typeface != null) {
                    this.y.setTypeface(typeface);
                }
                this.y.setMaxLines(1);
                pVar.a(this.y, 2);
                ((ViewGroup.MarginLayoutParams) this.y.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                n();
                if (this.y != null) {
                    EditText editText = this.f12521s;
                    m(editText == null ? 0 : editText.getText().length());
                }
            } else {
                pVar.h(this.y, 2);
                this.y = null;
            }
            this.f12527v = z4;
        }
    }

    public void setCounterMaxLength(int i4) {
        if (this.f12529w != i4) {
            if (i4 > 0) {
                this.f12529w = i4;
            } else {
                this.f12529w = -1;
            }
            if (!this.f12527v || this.y == null) {
                return;
            }
            EditText editText = this.f12521s;
            m(editText == null ? 0 : editText.getText().length());
        }
    }

    public void setCounterOverflowTextAppearance(int i4) {
        if (this.f12534z != i4) {
            this.f12534z = i4;
            n();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f12471H != colorStateList) {
            this.f12471H = colorStateList;
            n();
        }
    }

    public void setCounterTextAppearance(int i4) {
        if (this.f12457A != i4) {
            this.f12457A = i4;
            n();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f12469G != colorStateList) {
            this.f12469G = colorStateList;
            n();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f12468F0 = colorStateList;
        this.f12470G0 = colorStateList;
        if (this.f12521s != null) {
            s(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        j(this, z4);
        super.setEnabled(z4);
    }

    public void setEndIconActivated(boolean z4) {
        this.f12522s0.setActivated(z4);
    }

    public void setEndIconCheckable(boolean z4) {
        this.f12522s0.setCheckable(z4);
    }

    public void setEndIconContentDescription(int i4) {
        setEndIconContentDescription(i4 != 0 ? getResources().getText(i4) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f12522s0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i4) {
        setEndIconDrawable(i4 != 0 ? AbstractC1678a.a(getContext(), i4) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f12522s0.setImageDrawable(drawable);
    }

    public void setEndIconMode(int i4) {
        int i5 = this.f12518q0;
        this.f12518q0 = i4;
        Iterator it = this.f12524t0.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            switch (dVar.f2154a) {
                case 0:
                    Y2.g gVar = (Y2.g) dVar.f2155b;
                    EditText editText = getEditText();
                    if (editText != null && i5 == 2) {
                        editText.removeTextChangedListener(gVar.d);
                        if (editText.getOnFocusChangeListener() != gVar.f2160e) {
                            break;
                        } else {
                            editText.setOnFocusChangeListener(null);
                            break;
                        }
                    }
                    break;
                case 1:
                    m mVar = (m) dVar.f2155b;
                    AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) getEditText();
                    if (autoCompleteTextView != null && i5 == 3) {
                        autoCompleteTextView.removeTextChangedListener(mVar.d);
                        if (autoCompleteTextView.getOnFocusChangeListener() == mVar.f2172e) {
                            autoCompleteTextView.setOnFocusChangeListener(null);
                        }
                        autoCompleteTextView.setOnTouchListener(null);
                        autoCompleteTextView.setOnDismissListener(null);
                        break;
                    }
                    break;
                default:
                    EditText editText2 = getEditText();
                    if (editText2 != null && i5 == 1) {
                        editText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        editText2.removeTextChangedListener(((s) dVar.f2155b).d);
                        break;
                    }
                    break;
            }
        }
        setEndIconVisible(i4 != 0);
        if (getEndIconDelegate().b(this.f12492T)) {
            getEndIconDelegate().a();
            c();
        } else {
            throw new IllegalStateException("The current box background mode " + this.f12492T + " is not supported by the end icon mode " + i4);
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f12460B0;
        CheckableImageButton checkableImageButton = this.f12522s0;
        checkableImageButton.setOnClickListener(onClickListener);
        k(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f12460B0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f12522s0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        k(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f12526u0 != colorStateList) {
            this.f12526u0 = colorStateList;
            this.f12528v0 = true;
            c();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f12530w0 != mode) {
            this.f12530w0 = mode;
            this.f12532x0 = true;
            c();
        }
    }

    public void setEndIconVisible(boolean z4) {
        if (g() != z4) {
            this.f12522s0.setVisibility(z4 ? 0 : 8);
            x();
            o();
        }
    }

    public void setError(CharSequence charSequence) {
        p pVar = this.f12525u;
        if (!pVar.f2198l) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            pVar.g();
            return;
        }
        pVar.c();
        pVar.f2197k = charSequence;
        pVar.f2199m.setText(charSequence);
        int i4 = pVar.f2195i;
        if (i4 != 1) {
            pVar.f2196j = 1;
        }
        pVar.j(i4, pVar.f2196j, pVar.i(pVar.f2199m, charSequence));
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        p pVar = this.f12525u;
        pVar.f2200n = charSequence;
        M m4 = pVar.f2199m;
        if (m4 != null) {
            m4.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z4) {
        p pVar = this.f12525u;
        TextInputLayout textInputLayout = pVar.f2190b;
        if (pVar.f2198l == z4) {
            return;
        }
        pVar.c();
        if (z4) {
            M m4 = new M(pVar.f2189a, null);
            pVar.f2199m = m4;
            m4.setId(R.id.textinput_error);
            pVar.f2199m.setTextAlignment(5);
            Typeface typeface = pVar.f2208v;
            if (typeface != null) {
                pVar.f2199m.setTypeface(typeface);
            }
            int i4 = pVar.f2201o;
            pVar.f2201o = i4;
            M m5 = pVar.f2199m;
            if (m5 != null) {
                pVar.f2190b.l(m5, i4);
            }
            ColorStateList colorStateList = pVar.f2202p;
            pVar.f2202p = colorStateList;
            M m6 = pVar.f2199m;
            if (m6 != null && colorStateList != null) {
                m6.setTextColor(colorStateList);
            }
            CharSequence charSequence = pVar.f2200n;
            pVar.f2200n = charSequence;
            M m7 = pVar.f2199m;
            if (m7 != null) {
                m7.setContentDescription(charSequence);
            }
            pVar.f2199m.setVisibility(4);
            M m8 = pVar.f2199m;
            WeakHashMap weakHashMap = A.f779a;
            m8.setAccessibilityLiveRegion(1);
            pVar.a(pVar.f2199m, 0);
        } else {
            pVar.g();
            pVar.h(pVar.f2199m, 0);
            pVar.f2199m = null;
            textInputLayout.p();
            textInputLayout.z();
        }
        pVar.f2198l = z4;
    }

    public void setErrorIconDrawable(int i4) {
        setErrorIconDrawable(i4 != 0 ? AbstractC1678a.a(getContext(), i4) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f12464D0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f12525u.f2198l);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f12462C0;
        CheckableImageButton checkableImageButton = this.f12464D0;
        checkableImageButton.setOnClickListener(onClickListener);
        k(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f12462C0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f12464D0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        k(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f12466E0 = colorStateList;
        CheckableImageButton checkableImageButton = this.f12464D0;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        CheckableImageButton checkableImageButton = this.f12464D0;
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i4) {
        p pVar = this.f12525u;
        pVar.f2201o = i4;
        M m4 = pVar.f2199m;
        if (m4 != null) {
            pVar.f2190b.l(m4, i4);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        p pVar = this.f12525u;
        pVar.f2202p = colorStateList;
        M m4 = pVar.f2199m;
        if (m4 == null || colorStateList == null) {
            return;
        }
        m4.setTextColor(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        p pVar = this.f12525u;
        if (isEmpty) {
            if (pVar.f2204r) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!pVar.f2204r) {
            setHelperTextEnabled(true);
        }
        pVar.c();
        pVar.f2203q = charSequence;
        pVar.f2205s.setText(charSequence);
        int i4 = pVar.f2195i;
        if (i4 != 2) {
            pVar.f2196j = 2;
        }
        pVar.j(i4, pVar.f2196j, pVar.i(pVar.f2205s, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        p pVar = this.f12525u;
        pVar.f2207u = colorStateList;
        M m4 = pVar.f2205s;
        if (m4 == null || colorStateList == null) {
            return;
        }
        m4.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z4) {
        p pVar = this.f12525u;
        TextInputLayout textInputLayout = pVar.f2190b;
        if (pVar.f2204r == z4) {
            return;
        }
        pVar.c();
        if (z4) {
            M m4 = new M(pVar.f2189a, null);
            pVar.f2205s = m4;
            m4.setId(R.id.textinput_helper_text);
            pVar.f2205s.setTextAlignment(5);
            Typeface typeface = pVar.f2208v;
            if (typeface != null) {
                pVar.f2205s.setTypeface(typeface);
            }
            pVar.f2205s.setVisibility(4);
            M m5 = pVar.f2205s;
            WeakHashMap weakHashMap = A.f779a;
            m5.setAccessibilityLiveRegion(1);
            int i4 = pVar.f2206t;
            pVar.f2206t = i4;
            M m6 = pVar.f2205s;
            if (m6 != null) {
                m6.setTextAppearance(i4);
            }
            ColorStateList colorStateList = pVar.f2207u;
            pVar.f2207u = colorStateList;
            M m7 = pVar.f2205s;
            if (m7 != null && colorStateList != null) {
                m7.setTextColor(colorStateList);
            }
            pVar.a(pVar.f2205s, 1);
        } else {
            pVar.c();
            int i5 = pVar.f2195i;
            if (i5 == 2) {
                pVar.f2196j = 0;
            }
            pVar.j(i5, pVar.f2196j, pVar.i(pVar.f2205s, null));
            pVar.h(pVar.f2205s, 1);
            pVar.f2205s = null;
            textInputLayout.p();
            textInputLayout.z();
        }
        pVar.f2204r = z4;
    }

    public void setHelperTextTextAppearance(int i4) {
        p pVar = this.f12525u;
        pVar.f2206t = i4;
        M m4 = pVar.f2205s;
        if (m4 != null) {
            m4.setTextAppearance(i4);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f12480M) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z4) {
        this.f12491S0 = z4;
    }

    public void setHintEnabled(boolean z4) {
        if (z4 != this.f12480M) {
            this.f12480M = z4;
            if (z4) {
                CharSequence hint = this.f12521s.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.N)) {
                        setHint(hint);
                    }
                    this.f12521s.setHint((CharSequence) null);
                }
                this.f12482O = true;
            } else {
                this.f12482O = false;
                if (!TextUtils.isEmpty(this.N) && TextUtils.isEmpty(this.f12521s.getHint())) {
                    this.f12521s.setHint(this.N);
                }
                setHintInternal(null);
            }
            if (this.f12521s != null) {
                r();
            }
        }
    }

    public void setHintTextAppearance(int i4) {
        b bVar = this.f12489R0;
        TextInputLayout textInputLayout = bVar.f1538a;
        S2.d dVar = new S2.d(textInputLayout.getContext(), i4);
        ColorStateList colorStateList = dVar.f1770b;
        if (colorStateList != null) {
            bVar.f1547l = colorStateList;
        }
        float f4 = dVar.f1769a;
        if (f4 != 0.0f) {
            bVar.f1545j = f4;
        }
        ColorStateList colorStateList2 = dVar.f1772f;
        if (colorStateList2 != null) {
            bVar.f1536L = colorStateList2;
        }
        bVar.f1534J = dVar.f1773g;
        bVar.f1535K = dVar.f1774h;
        bVar.f1533I = dVar.f1775i;
        a aVar = bVar.f1557v;
        if (aVar != null) {
            aVar.f1763p0 = true;
        }
        D3.d dVar2 = new D3.d(17, bVar);
        dVar.a();
        bVar.f1557v = new a(dVar2, dVar.f1778l);
        dVar.b(textInputLayout.getContext(), bVar.f1557v);
        bVar.g();
        this.f12470G0 = bVar.f1547l;
        if (this.f12521s != null) {
            s(false, false);
            r();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f12470G0 != colorStateList) {
            if (this.f12468F0 == null) {
                this.f12489R0.h(colorStateList);
            }
            this.f12470G0 = colorStateList;
            if (this.f12521s != null) {
                s(false, false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i4) {
        setPasswordVisibilityToggleContentDescription(i4 != 0 ? getResources().getText(i4) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f12522s0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i4) {
        setPasswordVisibilityToggleDrawable(i4 != 0 ? AbstractC1678a.a(getContext(), i4) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f12522s0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z4) {
        if (z4 && this.f12518q0 != 1) {
            setEndIconMode(1);
        } else {
            if (z4) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f12526u0 = colorStateList;
        this.f12528v0 = true;
        c();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f12530w0 = mode;
        this.f12532x0 = true;
        c();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f12461C && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f12461C) {
                setPlaceholderTextEnabled(true);
            }
            this.f12459B = charSequence;
        }
        EditText editText = this.f12521s;
        t(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(int i4) {
        this.f12467F = i4;
        M m4 = this.f12463D;
        if (m4 != null) {
            m4.setTextAppearance(i4);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f12465E != colorStateList) {
            this.f12465E = colorStateList;
            M m4 = this.f12463D;
            if (m4 == null || colorStateList == null) {
                return;
            }
            m4.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f12473I = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f12475J.setText(charSequence);
        v();
    }

    public void setPrefixTextAppearance(int i4) {
        this.f12475J.setTextAppearance(i4);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f12475J.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z4) {
        this.f12506h0.setCheckable(z4);
    }

    public void setStartIconContentDescription(int i4) {
        setStartIconContentDescription(i4 != 0 ? getResources().getText(i4) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f12506h0.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i4) {
        setStartIconDrawable(i4 != 0 ? AbstractC1678a.a(getContext(), i4) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f12506h0;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            d(checkableImageButton, this.f12508j0, this.f12507i0, this.f12510l0, this.f12509k0);
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        View.OnLongClickListener onLongClickListener = this.f12514o0;
        CheckableImageButton checkableImageButton = this.f12506h0;
        checkableImageButton.setOnClickListener(onClickListener);
        k(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f12514o0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f12506h0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        k(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f12507i0 != colorStateList) {
            this.f12507i0 = colorStateList;
            this.f12508j0 = true;
            d(this.f12506h0, true, colorStateList, this.f12510l0, this.f12509k0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f12509k0 != mode) {
            this.f12509k0 = mode;
            this.f12510l0 = true;
            d(this.f12506h0, this.f12508j0, this.f12507i0, true, mode);
        }
    }

    public void setStartIconVisible(boolean z4) {
        CheckableImageButton checkableImageButton = this.f12506h0;
        if ((checkableImageButton.getVisibility() == 0) != z4) {
            checkableImageButton.setVisibility(z4 ? 0 : 8);
            u();
            o();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f12476K = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f12478L.setText(charSequence);
        y();
    }

    public void setSuffixTextAppearance(int i4) {
        this.f12478L.setTextAppearance(i4);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f12478L.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(u uVar) {
        EditText editText = this.f12521s;
        if (editText != null) {
            A.h(editText, uVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        boolean z4;
        if (typeface != this.f12505g0) {
            this.f12505g0 = typeface;
            b bVar = this.f12489R0;
            a aVar = bVar.f1557v;
            boolean z5 = true;
            if (aVar != null) {
                aVar.f1763p0 = true;
            }
            if (bVar.f1554s != typeface) {
                bVar.f1554s = typeface;
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVar.f1555t != typeface) {
                bVar.f1555t = typeface;
            } else {
                z5 = false;
            }
            if (z4 || z5) {
                bVar.g();
            }
            p pVar = this.f12525u;
            if (typeface != pVar.f2208v) {
                pVar.f2208v = typeface;
                M m4 = pVar.f2199m;
                if (m4 != null) {
                    m4.setTypeface(typeface);
                }
                M m5 = pVar.f2205s;
                if (m5 != null) {
                    m5.setTypeface(typeface);
                }
            }
            M m6 = this.y;
            if (m6 != null) {
                m6.setTypeface(typeface);
            }
        }
    }

    public final void t(int i4) {
        if (i4 != 0 || this.f12487Q0) {
            M m4 = this.f12463D;
            if (m4 == null || !this.f12461C) {
                return;
            }
            m4.setText((CharSequence) null);
            this.f12463D.setVisibility(4);
            return;
        }
        M m5 = this.f12463D;
        if (m5 == null || !this.f12461C) {
            return;
        }
        m5.setText(this.f12459B);
        this.f12463D.setVisibility(0);
        this.f12463D.bringToFront();
    }

    public final void u() {
        int paddingStart;
        if (this.f12521s == null) {
            return;
        }
        if (this.f12506h0.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            EditText editText = this.f12521s;
            WeakHashMap weakHashMap = A.f779a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = this.f12521s.getCompoundPaddingTop();
        int compoundPaddingBottom = this.f12521s.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = A.f779a;
        this.f12475J.setPaddingRelative(paddingStart, compoundPaddingTop, 0, compoundPaddingBottom);
    }

    public final void v() {
        this.f12475J.setVisibility((this.f12473I == null || this.f12487Q0) ? 8 : 0);
        o();
    }

    public final void w(boolean z4, boolean z5) {
        int defaultColor = this.f12477K0.getDefaultColor();
        int colorForState = this.f12477K0.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f12477K0.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z4) {
            this.f12500b0 = colorForState2;
        } else if (z5) {
            this.f12500b0 = colorForState;
        } else {
            this.f12500b0 = defaultColor;
        }
    }

    public final void x() {
        int i4;
        if (this.f12521s == null) {
            return;
        }
        if (g() || this.f12464D0.getVisibility() == 0) {
            i4 = 0;
        } else {
            EditText editText = this.f12521s;
            WeakHashMap weakHashMap = A.f779a;
            i4 = editText.getPaddingEnd();
        }
        int paddingTop = this.f12521s.getPaddingTop();
        int paddingBottom = this.f12521s.getPaddingBottom();
        WeakHashMap weakHashMap2 = A.f779a;
        this.f12478L.setPaddingRelative(0, paddingTop, i4, paddingBottom);
    }

    public final void y() {
        M m4 = this.f12478L;
        int visibility = m4.getVisibility();
        boolean z4 = (this.f12476K == null || this.f12487Q0) ? false : true;
        m4.setVisibility(z4 ? 0 : 8);
        if (visibility != m4.getVisibility()) {
            getEndIconDelegate().c(z4);
        }
        o();
    }

    public final void z() {
        M m4;
        EditText editText;
        EditText editText2;
        if (this.f12484P == null || this.f12492T == 0) {
            return;
        }
        boolean z4 = false;
        boolean z5 = isFocused() || ((editText2 = this.f12521s) != null && editText2.hasFocus());
        boolean z6 = isHovered() || ((editText = this.f12521s) != null && editText.isHovered());
        boolean isEnabled = isEnabled();
        p pVar = this.f12525u;
        if (!isEnabled) {
            this.f12500b0 = this.f12485P0;
        } else if (pVar.e()) {
            if (this.f12477K0 != null) {
                w(z5, z6);
            } else {
                M m5 = pVar.f2199m;
                this.f12500b0 = m5 != null ? m5.getCurrentTextColor() : -1;
            }
        } else if (!this.f12531x || (m4 = this.y) == null) {
            if (z5) {
                this.f12500b0 = this.J0;
            } else if (z6) {
                this.f12500b0 = this.f12474I0;
            } else {
                this.f12500b0 = this.f12472H0;
            }
        } else if (this.f12477K0 != null) {
            w(z5, z6);
        } else {
            this.f12500b0 = m4.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null && pVar.f2198l && pVar.e()) {
            z4 = true;
        }
        setErrorIconVisible(z4);
        q(this.f12464D0, this.f12466E0);
        q(this.f12506h0, this.f12507i0);
        ColorStateList colorStateList = this.f12526u0;
        CheckableImageButton checkableImageButton = this.f12522s0;
        q(checkableImageButton, colorStateList);
        n endIconDelegate = getEndIconDelegate();
        endIconDelegate.getClass();
        if (endIconDelegate instanceof m) {
            if (!pVar.e() || getEndIconDrawable() == null) {
                c();
            } else {
                Drawable mutate = getEndIconDrawable().mutate();
                M m6 = pVar.f2199m;
                mutate.setTint(m6 != null ? m6.getCurrentTextColor() : -1);
                checkableImageButton.setImageDrawable(mutate);
            }
        }
        if (z5 && isEnabled()) {
            this.f12496V = this.f12499a0;
        } else {
            this.f12496V = this.f12498W;
        }
        if (this.f12492T == 1) {
            if (!isEnabled()) {
                this.f12501c0 = this.f12481M0;
            } else if (z6 && !z5) {
                this.f12501c0 = this.f12483O0;
            } else if (z5) {
                this.f12501c0 = this.N0;
            } else {
                this.f12501c0 = this.f12479L0;
            }
        }
        b();
    }
}
