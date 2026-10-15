package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class F extends C1764e0 implements H {

    /* renamed from: Q, reason: collision with root package name */
    public CharSequence f13595Q;

    /* renamed from: R, reason: collision with root package name */
    public D f13596R;

    /* renamed from: S, reason: collision with root package name */
    public final Rect f13597S;

    /* renamed from: T, reason: collision with root package name */
    public int f13598T;

    /* renamed from: U, reason: collision with root package name */
    public final /* synthetic */ I f13599U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(I i4, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f13599U = i4;
        this.f13597S = new Rect();
        this.f13730C = i4;
        this.f13739L = true;
        this.f13740M.setFocusable(true);
        this.f13731D = new Y2.q(1, this);
    }

    @Override // l.H
    public final void g(CharSequence charSequence) {
        this.f13595Q = charSequence;
    }

    @Override // l.H
    public final void k(int i4) {
        this.f13598T = i4;
    }

    @Override // l.H
    public final void m(int i4, int i5) {
        ViewTreeObserver viewTreeObserver;
        C1788v c1788v = this.f13740M;
        boolean isShowing = c1788v.isShowing();
        s();
        c1788v.setInputMethodMode(2);
        e();
        V v4 = this.f13743q;
        v4.setChoiceMode(1);
        v4.setTextDirection(i4);
        v4.setTextAlignment(i5);
        I i6 = this.f13599U;
        int selectedItemPosition = i6.getSelectedItemPosition();
        V v5 = this.f13743q;
        if (c1788v.isShowing() && v5 != null) {
            v5.setListSelectionHidden(false);
            v5.setSelection(selectedItemPosition);
            if (v5.getChoiceMode() != 0) {
                v5.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = i6.getViewTreeObserver()) == null) {
            return;
        }
        Q2.a aVar = new Q2.a(4, this);
        viewTreeObserver.addOnGlobalLayoutListener(aVar);
        c1788v.setOnDismissListener(new E(this, aVar));
    }

    @Override // l.H
    public final CharSequence o() {
        return this.f13595Q;
    }

    @Override // l.C1764e0, l.H
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.f13596R = (D) listAdapter;
    }

    public final void s() {
        int i4;
        I i5 = this.f13599U;
        Rect rect = i5.f13626v;
        C1788v c1788v = this.f13740M;
        Drawable background = c1788v.getBackground();
        if (background != null) {
            background.getPadding(rect);
            i4 = M0.a(i5) ? rect.right : -rect.left;
        } else {
            i4 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = i5.getPaddingLeft();
        int paddingRight = i5.getPaddingRight();
        int width = i5.getWidth();
        int i6 = i5.f13625u;
        if (i6 == -2) {
            int a4 = i5.a(this.f13596R, c1788v.getBackground());
            int i7 = (i5.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a4 > i7) {
                a4 = i7;
            }
            r(Math.max(a4, (width - paddingLeft) - paddingRight));
        } else if (i6 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i6);
        }
        this.f13746t = M0.a(i5) ? (((width - paddingRight) - this.f13745s) - this.f13598T) + i4 : paddingLeft + this.f13598T + i4;
    }
}
