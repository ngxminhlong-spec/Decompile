package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import com.google.android.gms.internal.ads.Tw;
import g.AbstractC1678a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class I extends Spinner {

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f13618w = {R.attr.spinnerMode};

    /* renamed from: o, reason: collision with root package name */
    public final Tw f13619o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f13620p;

    /* renamed from: q, reason: collision with root package name */
    public final C1754B f13621q;

    /* renamed from: r, reason: collision with root package name */
    public SpinnerAdapter f13622r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f13623s;

    /* renamed from: t, reason: collision with root package name */
    public final H f13624t;

    /* renamed from: u, reason: collision with root package name */
    public int f13625u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f13626v;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public I(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r0 = 2130903571(0x7f030213, float:1.7413964E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f13626v = r1
            int[] r1 = e.AbstractC1657a.f12654v
            q2.e r2 = q2.e.w(r13, r14, r1, r0)
            java.lang.Object r3 = r2.f14710q
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            com.google.android.gms.internal.ads.Tw r4 = new com.google.android.gms.internal.ads.Tw
            r4.<init>(r12)
            r12.f13619o = r4
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L2e
            j.c r6 = new j.c
            r6.<init>(r13, r4)
            r12.f13620p = r6
            goto L30
        L2e:
            r12.f13620p = r13
        L30:
            r4 = -1
            r6 = 0
            int[] r7 = l.I.f13618w     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            if (r8 == 0) goto L49
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            goto L49
        L43:
            r13 = move-exception
            r6 = r7
            goto Lce
        L47:
            r8 = move-exception
            goto L52
        L49:
            r7.recycle()
            goto L5c
        L4d:
            r13 = move-exception
            goto Lce
        L50:
            r8 = move-exception
            r7 = r6
        L52:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L43
            if (r7 == 0) goto L5c
            goto L49
        L5c:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L96
            if (r4 == r8) goto L63
            goto La3
        L63:
            l.F r4 = new l.F
            android.content.Context r9 = r12.f13620p
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f13620p
            q2.e r1 = q2.e.w(r9, r14, r1, r0)
            java.lang.Object r9 = r1.f14710q
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 3
            r11 = -2
            int r9 = r9.getLayoutDimension(r10, r11)
            r12.f13625u = r9
            android.graphics.drawable.Drawable r9 = r1.p(r8)
            r4.h(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.f13595Q = r7
            r1.y()
            r12.f13624t = r4
            l.B r1 = new l.B
            r1.<init>(r12, r12, r4)
            r12.f13621q = r1
            goto La3
        L96:
            l.C r1 = new l.C
            r1.<init>(r12)
            r12.f13624t = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f13585q = r4
        La3:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lba
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131493055(0x7f0c00bf, float:1.860958E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lba:
            r2.y()
            r12.f13623s = r8
            android.widget.SpinnerAdapter r13 = r12.f13622r
            if (r13 == 0) goto Lc8
            r12.setAdapter(r13)
            r12.f13622r = r6
        Lc8:
            com.google.android.gms.internal.ads.Tw r13 = r12.f13619o
            r13.l(r14, r0)
            return
        Lce:
            if (r6 == 0) goto Ld3
            r6.recycle()
        Ld3:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: l.I.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i4 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i5 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i5 = Math.max(i5, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i5;
        }
        Rect rect = this.f13626v;
        drawable.getPadding(rect);
        return rect.left + rect.right + i5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Tw tw = this.f13619o;
        if (tw != null) {
            tw.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        H h4 = this.f13624t;
        return h4 != null ? h4.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        H h4 = this.f13624t;
        return h4 != null ? h4.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f13624t != null ? this.f13625u : super.getDropDownWidth();
    }

    public final H getInternalPopup() {
        return this.f13624t;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        H h4 = this.f13624t;
        return h4 != null ? h4.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f13620p;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        H h4 = this.f13624t;
        return h4 != null ? h4.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        Tw tw = this.f13619o;
        if (tw != null) {
            return tw.i();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Tw tw = this.f13619o;
        if (tw != null) {
            return tw.j();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        H h4 = this.f13624t;
        if (h4 == null || !h4.b()) {
            return;
        }
        h4.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f13624t == null || View.MeasureSpec.getMode(i4) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        G g4 = (G) parcelable;
        super.onRestoreInstanceState(g4.getSuperState());
        if (!g4.f13602o || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new Q2.a(3, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, l.G] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        H h4 = this.f13624t;
        baseSavedState.f13602o = h4 != null && h4.b();
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1754B c1754b = this.f13621q;
        if (c1754b == null || !c1754b.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        H h4 = this.f13624t;
        if (h4 == null) {
            return super.performClick();
        }
        if (h4.b()) {
            return true;
        }
        h4.m(getTextDirection(), getTextAlignment());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.D, android.widget.ListAdapter, java.lang.Object] */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f13623s) {
            this.f13622r = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        H h4 = this.f13624t;
        if (h4 != 0) {
            Context context = this.f13620p;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.f13589o = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.f13590p = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
            h4.p(obj);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Tw tw = this.f13619o;
        if (tw != null) {
            tw.o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        Tw tw = this.f13619o;
        if (tw != null) {
            tw.p(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i4) {
        H h4 = this.f13624t;
        if (h4 == null) {
            super.setDropDownHorizontalOffset(i4);
        } else {
            h4.k(i4);
            h4.l(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i4) {
        H h4 = this.f13624t;
        if (h4 != null) {
            h4.j(i4);
        } else {
            super.setDropDownVerticalOffset(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i4) {
        if (this.f13624t != null) {
            this.f13625u = i4;
        } else {
            super.setDropDownWidth(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        H h4 = this.f13624t;
        if (h4 != null) {
            h4.h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i4) {
        setPopupBackgroundDrawable(AbstractC1678a.a(getPopupContext(), i4));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        H h4 = this.f13624t;
        if (h4 != null) {
            h4.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        Tw tw = this.f13619o;
        if (tw != null) {
            tw.u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        Tw tw = this.f13619o;
        if (tw != null) {
            tw.v(mode);
        }
    }
}
