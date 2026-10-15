package b0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167A {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0178L f3170a;

    /* renamed from: b, reason: collision with root package name */
    public int f3171b = Integer.MIN_VALUE;
    public final Rect c = new Rect();
    public final /* synthetic */ int d;

    public C0167A(AbstractC0178L abstractC0178L, int i4) {
        this.d = i4;
        this.f3170a = abstractC0178L;
    }

    public static C0167A a(AbstractC0178L abstractC0178L, int i4) {
        if (i4 == 0) {
            return new C0167A(abstractC0178L, 0);
        }
        if (i4 == 1) {
            return new C0167A(abstractC0178L, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public final int b(View view) {
        int B4;
        int i4;
        switch (this.d) {
            case 0:
                C0179M c0179m = (C0179M) view.getLayoutParams();
                this.f3170a.getClass();
                B4 = AbstractC0178L.B(view);
                i4 = ((ViewGroup.MarginLayoutParams) c0179m).rightMargin;
                break;
            default:
                C0179M c0179m2 = (C0179M) view.getLayoutParams();
                this.f3170a.getClass();
                B4 = AbstractC0178L.y(view);
                i4 = ((ViewGroup.MarginLayoutParams) c0179m2).bottomMargin;
                break;
        }
        return B4 + i4;
    }

    public final int c(View view) {
        int measuredWidth;
        int i4;
        switch (this.d) {
            case 0:
                C0179M c0179m = (C0179M) view.getLayoutParams();
                this.f3170a.getClass();
                Rect rect = ((C0179M) view.getLayoutParams()).f3198b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0179m).leftMargin;
                i4 = ((ViewGroup.MarginLayoutParams) c0179m).rightMargin;
                break;
            default:
                C0179M c0179m2 = (C0179M) view.getLayoutParams();
                this.f3170a.getClass();
                Rect rect2 = ((C0179M) view.getLayoutParams()).f3198b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0179m2).topMargin;
                i4 = ((ViewGroup.MarginLayoutParams) c0179m2).bottomMargin;
                break;
        }
        return measuredWidth + i4;
    }

    public final int d(View view) {
        int measuredHeight;
        int i4;
        switch (this.d) {
            case 0:
                C0179M c0179m = (C0179M) view.getLayoutParams();
                this.f3170a.getClass();
                Rect rect = ((C0179M) view.getLayoutParams()).f3198b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0179m).topMargin;
                i4 = ((ViewGroup.MarginLayoutParams) c0179m).bottomMargin;
                break;
            default:
                C0179M c0179m2 = (C0179M) view.getLayoutParams();
                this.f3170a.getClass();
                Rect rect2 = ((C0179M) view.getLayoutParams()).f3198b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0179m2).leftMargin;
                i4 = ((ViewGroup.MarginLayoutParams) c0179m2).rightMargin;
                break;
        }
        return measuredHeight + i4;
    }

    public final int e(View view) {
        int A3;
        int i4;
        switch (this.d) {
            case 0:
                C0179M c0179m = (C0179M) view.getLayoutParams();
                this.f3170a.getClass();
                A3 = AbstractC0178L.A(view);
                i4 = ((ViewGroup.MarginLayoutParams) c0179m).leftMargin;
                break;
            default:
                C0179M c0179m2 = (C0179M) view.getLayoutParams();
                this.f3170a.getClass();
                A3 = AbstractC0178L.C(view);
                i4 = ((ViewGroup.MarginLayoutParams) c0179m2).topMargin;
                break;
        }
        return A3 - i4;
    }

    public final int f() {
        switch (this.d) {
            case 0:
                return this.f3170a.f3195n;
            default:
                return this.f3170a.f3196o;
        }
    }

    public final int g() {
        int i4;
        int F2;
        switch (this.d) {
            case 0:
                AbstractC0178L abstractC0178L = this.f3170a;
                i4 = abstractC0178L.f3195n;
                F2 = abstractC0178L.F();
                break;
            default:
                AbstractC0178L abstractC0178L2 = this.f3170a;
                i4 = abstractC0178L2.f3196o;
                F2 = abstractC0178L2.D();
                break;
        }
        return i4 - F2;
    }

    public final int h() {
        switch (this.d) {
            case 0:
                return this.f3170a.F();
            default:
                return this.f3170a.D();
        }
    }

    public final int i() {
        switch (this.d) {
            case 0:
                return this.f3170a.f3193l;
            default:
                return this.f3170a.f3194m;
        }
    }

    public final int j() {
        switch (this.d) {
            case 0:
                return this.f3170a.E();
            default:
                return this.f3170a.G();
        }
    }

    public final int k() {
        int E4;
        int F2;
        switch (this.d) {
            case 0:
                AbstractC0178L abstractC0178L = this.f3170a;
                E4 = abstractC0178L.f3195n - abstractC0178L.E();
                F2 = abstractC0178L.F();
                break;
            default:
                AbstractC0178L abstractC0178L2 = this.f3170a;
                E4 = abstractC0178L2.f3196o - abstractC0178L2.G();
                F2 = abstractC0178L2.D();
                break;
        }
        return E4 - F2;
    }

    public final int l(View view) {
        switch (this.d) {
            case 0:
                AbstractC0178L abstractC0178L = this.f3170a;
                Rect rect = this.c;
                abstractC0178L.K(rect, view);
                return rect.right;
            default:
                AbstractC0178L abstractC0178L2 = this.f3170a;
                Rect rect2 = this.c;
                abstractC0178L2.K(rect2, view);
                return rect2.bottom;
        }
    }

    public final int m(View view) {
        switch (this.d) {
            case 0:
                AbstractC0178L abstractC0178L = this.f3170a;
                Rect rect = this.c;
                abstractC0178L.K(rect, view);
                return rect.left;
            default:
                AbstractC0178L abstractC0178L2 = this.f3170a;
                Rect rect2 = this.c;
                abstractC0178L2.K(rect2, view);
                return rect2.top;
        }
    }

    public final void n(int i4) {
        switch (this.d) {
            case 0:
                this.f3170a.O(i4);
                return;
            default:
                this.f3170a.P(i4);
                return;
        }
    }
}
