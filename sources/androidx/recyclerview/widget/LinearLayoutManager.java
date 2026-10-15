package androidx.recyclerview.widget;

import H.A;
import U.a;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import b0.AbstractC0178L;
import b0.C0167A;
import b0.C0177K;
import b0.C0179M;
import b0.C0185T;
import b0.C0197j;
import b0.C0208u;
import b0.C0209v;
import b0.C0210w;
import b0.C0211x;
import b0.C0212y;
import b0.Y;
import b0.Z;
import d3.AbstractC1654b;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0178L implements Y {

    /* renamed from: A, reason: collision with root package name */
    public final C0208u f3009A;

    /* renamed from: B, reason: collision with root package name */
    public final C0209v f3010B;

    /* renamed from: C, reason: collision with root package name */
    public final int f3011C;

    /* renamed from: D, reason: collision with root package name */
    public final int[] f3012D;

    /* renamed from: p, reason: collision with root package name */
    public int f3013p;

    /* renamed from: q, reason: collision with root package name */
    public C0210w f3014q;

    /* renamed from: r, reason: collision with root package name */
    public C0167A f3015r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3016s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f3017t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3018u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3019v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f3020w;

    /* renamed from: x, reason: collision with root package name */
    public int f3021x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public C0211x f3022z;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, b0.v] */
    public LinearLayoutManager(int i4) {
        this.f3013p = 1;
        this.f3017t = false;
        this.f3018u = false;
        this.f3019v = false;
        this.f3020w = true;
        this.f3021x = -1;
        this.y = Integer.MIN_VALUE;
        this.f3022z = null;
        this.f3009A = new C0208u();
        this.f3010B = new Object();
        this.f3011C = 2;
        this.f3012D = new int[2];
        Z0(i4);
        c(null);
        if (this.f3017t) {
            this.f3017t = false;
            k0();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, b0.v] */
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f3013p = 1;
        this.f3017t = false;
        this.f3018u = false;
        this.f3019v = false;
        this.f3020w = true;
        this.f3021x = -1;
        this.y = Integer.MIN_VALUE;
        this.f3022z = null;
        this.f3009A = new C0208u();
        this.f3010B = new Object();
        this.f3011C = 2;
        this.f3012D = new int[2];
        C0177K I4 = AbstractC0178L.I(context, attributeSet, i4, i5);
        Z0(I4.f3182a);
        boolean z4 = I4.c;
        c(null);
        if (z4 != this.f3017t) {
            this.f3017t = z4;
            k0();
        }
        a1(I4.d);
    }

    public void A0(Z z4, C0210w c0210w, C0197j c0197j) {
        int i4 = c0210w.d;
        if (i4 < 0 || i4 >= z4.b()) {
            return;
        }
        c0197j.b(i4, Math.max(0, c0210w.f3425g));
    }

    public final int B0(Z z4) {
        if (v() == 0) {
            return 0;
        }
        F0();
        C0167A c0167a = this.f3015r;
        boolean z5 = !this.f3020w;
        return AbstractC1654b.i(z4, c0167a, I0(z5), H0(z5), this, this.f3020w);
    }

    public final int C0(Z z4) {
        if (v() == 0) {
            return 0;
        }
        F0();
        C0167A c0167a = this.f3015r;
        boolean z5 = !this.f3020w;
        return AbstractC1654b.j(z4, c0167a, I0(z5), H0(z5), this, this.f3020w, this.f3018u);
    }

    public final int D0(Z z4) {
        if (v() == 0) {
            return 0;
        }
        F0();
        C0167A c0167a = this.f3015r;
        boolean z5 = !this.f3020w;
        return AbstractC1654b.k(z4, c0167a, I0(z5), H0(z5), this, this.f3020w);
    }

    public final int E0(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 17 ? i4 != 33 ? i4 != 66 ? (i4 == 130 && this.f3013p == 1) ? 1 : Integer.MIN_VALUE : this.f3013p == 0 ? 1 : Integer.MIN_VALUE : this.f3013p == 1 ? -1 : Integer.MIN_VALUE : this.f3013p == 0 ? -1 : Integer.MIN_VALUE : (this.f3013p != 1 && R0()) ? -1 : 1 : (this.f3013p != 1 && R0()) ? 1 : -1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, b0.w] */
    public final void F0() {
        if (this.f3014q == null) {
            ?? obj = new Object();
            obj.f3421a = true;
            obj.f3426h = 0;
            obj.f3427i = 0;
            obj.f3429k = null;
            this.f3014q = obj;
        }
    }

    public final int G0(C0185T c0185t, C0210w c0210w, Z z4, boolean z5) {
        int i4;
        int i5 = c0210w.c;
        int i6 = c0210w.f3425g;
        if (i6 != Integer.MIN_VALUE) {
            if (i5 < 0) {
                c0210w.f3425g = i6 + i5;
            }
            U0(c0185t, c0210w);
        }
        int i7 = c0210w.c + c0210w.f3426h;
        while (true) {
            if ((!c0210w.f3430l && i7 <= 0) || (i4 = c0210w.d) < 0 || i4 >= z4.b()) {
                break;
            }
            C0209v c0209v = this.f3010B;
            c0209v.f3419a = 0;
            c0209v.f3420b = false;
            c0209v.c = false;
            c0209v.d = false;
            S0(c0185t, z4, c0210w, c0209v);
            if (!c0209v.f3420b) {
                int i8 = c0210w.f3422b;
                int i9 = c0209v.f3419a;
                c0210w.f3422b = (c0210w.f3424f * i9) + i8;
                if (!c0209v.c || c0210w.f3429k != null || !z4.f3220g) {
                    c0210w.c -= i9;
                    i7 -= i9;
                }
                int i10 = c0210w.f3425g;
                if (i10 != Integer.MIN_VALUE) {
                    int i11 = i10 + i9;
                    c0210w.f3425g = i11;
                    int i12 = c0210w.c;
                    if (i12 < 0) {
                        c0210w.f3425g = i11 + i12;
                    }
                    U0(c0185t, c0210w);
                }
                if (z5 && c0209v.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i5 - c0210w.c;
    }

    public final View H0(boolean z4) {
        return this.f3018u ? L0(0, v(), z4) : L0(v() - 1, -1, z4);
    }

    public final View I0(boolean z4) {
        return this.f3018u ? L0(v() - 1, -1, z4) : L0(0, v(), z4);
    }

    public final int J0() {
        View L02 = L0(v() - 1, -1, false);
        if (L02 == null) {
            return -1;
        }
        return AbstractC0178L.H(L02);
    }

    public final View K0(int i4, int i5) {
        int i6;
        int i7;
        F0();
        if (i5 <= i4 && i5 >= i4) {
            return u(i4);
        }
        if (this.f3015r.e(u(i4)) < this.f3015r.j()) {
            i6 = 16644;
            i7 = 16388;
        } else {
            i6 = 4161;
            i7 = 4097;
        }
        return this.f3013p == 0 ? this.c.m(i4, i5, i6, i7) : this.d.m(i4, i5, i6, i7);
    }

    @Override // b0.AbstractC0178L
    public final boolean L() {
        return true;
    }

    public final View L0(int i4, int i5, boolean z4) {
        F0();
        int i6 = z4 ? 24579 : 320;
        return this.f3013p == 0 ? this.c.m(i4, i5, i6, 320) : this.d.m(i4, i5, i6, 320);
    }

    public View M0(C0185T c0185t, Z z4, int i4, int i5, int i6) {
        F0();
        int j4 = this.f3015r.j();
        int g4 = this.f3015r.g();
        int i7 = i5 > i4 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i4 != i5) {
            View u2 = u(i4);
            int H3 = AbstractC0178L.H(u2);
            if (H3 >= 0 && H3 < i6) {
                if (((C0179M) u2.getLayoutParams()).f3197a.i()) {
                    if (view2 == null) {
                        view2 = u2;
                    }
                } else {
                    if (this.f3015r.e(u2) < g4 && this.f3015r.b(u2) >= j4) {
                        return u2;
                    }
                    if (view == null) {
                        view = u2;
                    }
                }
            }
            i4 += i7;
        }
        return view != null ? view : view2;
    }

    public final int N0(int i4, C0185T c0185t, Z z4, boolean z5) {
        int g4;
        int g5 = this.f3015r.g() - i4;
        if (g5 <= 0) {
            return 0;
        }
        int i5 = -X0(-g5, c0185t, z4);
        int i6 = i4 + i5;
        if (!z5 || (g4 = this.f3015r.g() - i6) <= 0) {
            return i5;
        }
        this.f3015r.n(g4);
        return g4 + i5;
    }

    public final int O0(int i4, C0185T c0185t, Z z4, boolean z5) {
        int j4;
        int j5 = i4 - this.f3015r.j();
        if (j5 <= 0) {
            return 0;
        }
        int i5 = -X0(j5, c0185t, z4);
        int i6 = i4 + i5;
        if (!z5 || (j4 = i6 - this.f3015r.j()) <= 0) {
            return i5;
        }
        this.f3015r.n(-j4);
        return i5 - j4;
    }

    public final View P0() {
        return u(this.f3018u ? 0 : v() - 1);
    }

    @Override // b0.AbstractC0178L
    public final void Q(RecyclerView recyclerView) {
    }

    public final View Q0() {
        return u(this.f3018u ? v() - 1 : 0);
    }

    @Override // b0.AbstractC0178L
    public View R(View view, int i4, C0185T c0185t, Z z4) {
        int E02;
        W0();
        if (v() != 0 && (E02 = E0(i4)) != Integer.MIN_VALUE) {
            F0();
            b1(E02, (int) (this.f3015r.k() * 0.33333334f), false, z4);
            C0210w c0210w = this.f3014q;
            c0210w.f3425g = Integer.MIN_VALUE;
            c0210w.f3421a = false;
            G0(c0185t, c0210w, z4, true);
            View K02 = E02 == -1 ? this.f3018u ? K0(v() - 1, -1) : K0(0, v()) : this.f3018u ? K0(0, v()) : K0(v() - 1, -1);
            View Q02 = E02 == -1 ? Q0() : P0();
            if (!Q02.hasFocusable()) {
                return K02;
            }
            if (K02 != null) {
                return Q02;
            }
        }
        return null;
    }

    public final boolean R0() {
        RecyclerView recyclerView = this.f3185b;
        WeakHashMap weakHashMap = A.f779a;
        return recyclerView.getLayoutDirection() == 1;
    }

    @Override // b0.AbstractC0178L
    public final void S(AccessibilityEvent accessibilityEvent) {
        super.S(accessibilityEvent);
        if (v() > 0) {
            View L02 = L0(0, v(), false);
            accessibilityEvent.setFromIndex(L02 == null ? -1 : AbstractC0178L.H(L02));
            accessibilityEvent.setToIndex(J0());
        }
    }

    public void S0(C0185T c0185t, Z z4, C0210w c0210w, C0209v c0209v) {
        int i4;
        int i5;
        int i6;
        int i7;
        View b4 = c0210w.b(c0185t);
        if (b4 == null) {
            c0209v.f3420b = true;
            return;
        }
        C0179M c0179m = (C0179M) b4.getLayoutParams();
        if (c0210w.f3429k == null) {
            if (this.f3018u == (c0210w.f3424f == -1)) {
                b(b4, -1, false);
            } else {
                b(b4, 0, false);
            }
        } else {
            if (this.f3018u == (c0210w.f3424f == -1)) {
                b(b4, -1, true);
            } else {
                b(b4, 0, true);
            }
        }
        C0179M c0179m2 = (C0179M) b4.getLayoutParams();
        Rect K2 = this.f3185b.K(b4);
        int i8 = K2.left + K2.right;
        int i9 = K2.top + K2.bottom;
        int w2 = AbstractC0178L.w(d(), this.f3195n, this.f3193l, F() + E() + ((ViewGroup.MarginLayoutParams) c0179m2).leftMargin + ((ViewGroup.MarginLayoutParams) c0179m2).rightMargin + i8, ((ViewGroup.MarginLayoutParams) c0179m2).width);
        int w4 = AbstractC0178L.w(e(), this.f3196o, this.f3194m, D() + G() + ((ViewGroup.MarginLayoutParams) c0179m2).topMargin + ((ViewGroup.MarginLayoutParams) c0179m2).bottomMargin + i9, ((ViewGroup.MarginLayoutParams) c0179m2).height);
        if (t0(b4, w2, w4, c0179m2)) {
            b4.measure(w2, w4);
        }
        c0209v.f3419a = this.f3015r.c(b4);
        if (this.f3013p == 1) {
            if (R0()) {
                i7 = this.f3195n - F();
                i4 = i7 - this.f3015r.d(b4);
            } else {
                i4 = E();
                i7 = this.f3015r.d(b4) + i4;
            }
            if (c0210w.f3424f == -1) {
                i5 = c0210w.f3422b;
                i6 = i5 - c0209v.f3419a;
            } else {
                i6 = c0210w.f3422b;
                i5 = c0209v.f3419a + i6;
            }
        } else {
            int G3 = G();
            int d = this.f3015r.d(b4) + G3;
            if (c0210w.f3424f == -1) {
                int i10 = c0210w.f3422b;
                int i11 = i10 - c0209v.f3419a;
                i7 = i10;
                i5 = d;
                i4 = i11;
                i6 = G3;
            } else {
                int i12 = c0210w.f3422b;
                int i13 = c0209v.f3419a + i12;
                i4 = i12;
                i5 = d;
                i6 = G3;
                i7 = i13;
            }
        }
        AbstractC0178L.N(b4, i4, i6, i7, i5);
        if (c0179m.f3197a.i() || c0179m.f3197a.l()) {
            c0209v.c = true;
        }
        c0209v.d = b4.hasFocusable();
    }

    public void T0(C0185T c0185t, Z z4, C0208u c0208u, int i4) {
    }

    public final void U0(C0185T c0185t, C0210w c0210w) {
        if (!c0210w.f3421a || c0210w.f3430l) {
            return;
        }
        int i4 = c0210w.f3425g;
        int i5 = c0210w.f3427i;
        if (c0210w.f3424f == -1) {
            int v4 = v();
            if (i4 < 0) {
                return;
            }
            int f4 = (this.f3015r.f() - i4) + i5;
            if (this.f3018u) {
                for (int i6 = 0; i6 < v4; i6++) {
                    View u2 = u(i6);
                    if (this.f3015r.e(u2) < f4 || this.f3015r.m(u2) < f4) {
                        V0(c0185t, 0, i6);
                        return;
                    }
                }
                return;
            }
            int i7 = v4 - 1;
            for (int i8 = i7; i8 >= 0; i8--) {
                View u4 = u(i8);
                if (this.f3015r.e(u4) < f4 || this.f3015r.m(u4) < f4) {
                    V0(c0185t, i7, i8);
                    return;
                }
            }
            return;
        }
        if (i4 < 0) {
            return;
        }
        int i9 = i4 - i5;
        int v5 = v();
        if (!this.f3018u) {
            for (int i10 = 0; i10 < v5; i10++) {
                View u5 = u(i10);
                if (this.f3015r.b(u5) > i9 || this.f3015r.l(u5) > i9) {
                    V0(c0185t, 0, i10);
                    return;
                }
            }
            return;
        }
        int i11 = v5 - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            View u6 = u(i12);
            if (this.f3015r.b(u6) > i9 || this.f3015r.l(u6) > i9) {
                V0(c0185t, i11, i12);
                return;
            }
        }
    }

    public final void V0(C0185T c0185t, int i4, int i5) {
        if (i4 == i5) {
            return;
        }
        if (i5 <= i4) {
            while (i4 > i5) {
                View u2 = u(i4);
                i0(i4);
                c0185t.f(u2);
                i4--;
            }
            return;
        }
        for (int i6 = i5 - 1; i6 >= i4; i6--) {
            View u4 = u(i6);
            i0(i6);
            c0185t.f(u4);
        }
    }

    public final void W0() {
        if (this.f3013p == 1 || !R0()) {
            this.f3018u = this.f3017t;
        } else {
            this.f3018u = !this.f3017t;
        }
    }

    public final int X0(int i4, C0185T c0185t, Z z4) {
        if (v() != 0 && i4 != 0) {
            F0();
            this.f3014q.f3421a = true;
            int i5 = i4 > 0 ? 1 : -1;
            int abs = Math.abs(i4);
            b1(i5, abs, true, z4);
            C0210w c0210w = this.f3014q;
            int G02 = G0(c0185t, c0210w, z4, false) + c0210w.f3425g;
            if (G02 >= 0) {
                if (abs > G02) {
                    i4 = i5 * G02;
                }
                this.f3015r.n(-i4);
                this.f3014q.f3428j = i4;
                return i4;
            }
        }
        return 0;
    }

    public final void Y0(int i4, int i5) {
        this.f3021x = i4;
        this.y = i5;
        C0211x c0211x = this.f3022z;
        if (c0211x != null) {
            c0211x.f3431o = -1;
        }
        k0();
    }

    public final void Z0(int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException(a.i("invalid orientation:", i4));
        }
        c(null);
        if (i4 != this.f3013p || this.f3015r == null) {
            C0167A a4 = C0167A.a(this, i4);
            this.f3015r = a4;
            this.f3009A.f3418f = a4;
            this.f3013p = i4;
            k0();
        }
    }

    @Override // b0.Y
    public final PointF a(int i4) {
        if (v() == 0) {
            return null;
        }
        int i5 = (i4 < AbstractC0178L.H(u(0))) != this.f3018u ? -1 : 1;
        return this.f3013p == 0 ? new PointF(i5, 0.0f) : new PointF(0.0f, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0293  */
    @Override // b0.AbstractC0178L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a0(b0.C0185T r18, b0.Z r19) {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.a0(b0.T, b0.Z):void");
    }

    public void a1(boolean z4) {
        c(null);
        if (this.f3019v == z4) {
            return;
        }
        this.f3019v = z4;
        k0();
    }

    @Override // b0.AbstractC0178L
    public void b0(Z z4) {
        this.f3022z = null;
        this.f3021x = -1;
        this.y = Integer.MIN_VALUE;
        this.f3009A.d();
    }

    public final void b1(int i4, int i5, boolean z4, Z z5) {
        int j4;
        this.f3014q.f3430l = this.f3015r.i() == 0 && this.f3015r.f() == 0;
        this.f3014q.f3424f = i4;
        int[] iArr = this.f3012D;
        iArr[0] = 0;
        iArr[1] = 0;
        z0(z5, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z6 = i4 == 1;
        C0210w c0210w = this.f3014q;
        int i6 = z6 ? max2 : max;
        c0210w.f3426h = i6;
        if (!z6) {
            max = max2;
        }
        c0210w.f3427i = max;
        if (z6) {
            c0210w.f3426h = this.f3015r.h() + i6;
            View P02 = P0();
            C0210w c0210w2 = this.f3014q;
            c0210w2.f3423e = this.f3018u ? -1 : 1;
            int H3 = AbstractC0178L.H(P02);
            C0210w c0210w3 = this.f3014q;
            c0210w2.d = H3 + c0210w3.f3423e;
            c0210w3.f3422b = this.f3015r.b(P02);
            j4 = this.f3015r.b(P02) - this.f3015r.g();
        } else {
            View Q02 = Q0();
            C0210w c0210w4 = this.f3014q;
            c0210w4.f3426h = this.f3015r.j() + c0210w4.f3426h;
            C0210w c0210w5 = this.f3014q;
            c0210w5.f3423e = this.f3018u ? 1 : -1;
            int H4 = AbstractC0178L.H(Q02);
            C0210w c0210w6 = this.f3014q;
            c0210w5.d = H4 + c0210w6.f3423e;
            c0210w6.f3422b = this.f3015r.e(Q02);
            j4 = (-this.f3015r.e(Q02)) + this.f3015r.j();
        }
        C0210w c0210w7 = this.f3014q;
        c0210w7.c = i5;
        if (z4) {
            c0210w7.c = i5 - j4;
        }
        c0210w7.f3425g = j4;
    }

    @Override // b0.AbstractC0178L
    public final void c(String str) {
        RecyclerView recyclerView;
        if (this.f3022z != null || (recyclerView = this.f3185b) == null) {
            return;
        }
        recyclerView.i(str);
    }

    @Override // b0.AbstractC0178L
    public final void c0(Parcelable parcelable) {
        if (parcelable instanceof C0211x) {
            this.f3022z = (C0211x) parcelable;
            k0();
        }
    }

    public final void c1(int i4, int i5) {
        this.f3014q.c = this.f3015r.g() - i5;
        C0210w c0210w = this.f3014q;
        c0210w.f3423e = this.f3018u ? -1 : 1;
        c0210w.d = i4;
        c0210w.f3424f = 1;
        c0210w.f3422b = i5;
        c0210w.f3425g = Integer.MIN_VALUE;
    }

    @Override // b0.AbstractC0178L
    public final boolean d() {
        return this.f3013p == 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, b0.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.os.Parcelable, b0.x, java.lang.Object] */
    @Override // b0.AbstractC0178L
    public final Parcelable d0() {
        C0211x c0211x = this.f3022z;
        if (c0211x != null) {
            ?? obj = new Object();
            obj.f3431o = c0211x.f3431o;
            obj.f3432p = c0211x.f3432p;
            obj.f3433q = c0211x.f3433q;
            return obj;
        }
        ?? obj2 = new Object();
        if (v() <= 0) {
            obj2.f3431o = -1;
            return obj2;
        }
        F0();
        boolean z4 = this.f3016s ^ this.f3018u;
        obj2.f3433q = z4;
        if (z4) {
            View P02 = P0();
            obj2.f3432p = this.f3015r.g() - this.f3015r.b(P02);
            obj2.f3431o = AbstractC0178L.H(P02);
            return obj2;
        }
        View Q02 = Q0();
        obj2.f3431o = AbstractC0178L.H(Q02);
        obj2.f3432p = this.f3015r.e(Q02) - this.f3015r.j();
        return obj2;
    }

    public final void d1(int i4, int i5) {
        this.f3014q.c = i5 - this.f3015r.j();
        C0210w c0210w = this.f3014q;
        c0210w.d = i4;
        c0210w.f3423e = this.f3018u ? 1 : -1;
        c0210w.f3424f = -1;
        c0210w.f3422b = i5;
        c0210w.f3425g = Integer.MIN_VALUE;
    }

    @Override // b0.AbstractC0178L
    public final boolean e() {
        return this.f3013p == 1;
    }

    @Override // b0.AbstractC0178L
    public final void h(int i4, int i5, Z z4, C0197j c0197j) {
        if (this.f3013p != 0) {
            i4 = i5;
        }
        if (v() == 0 || i4 == 0) {
            return;
        }
        F0();
        b1(i4 > 0 ? 1 : -1, Math.abs(i4), true, z4);
        A0(z4, this.f3014q, c0197j);
    }

    @Override // b0.AbstractC0178L
    public final void i(int i4, C0197j c0197j) {
        boolean z4;
        int i5;
        C0211x c0211x = this.f3022z;
        if (c0211x == null || (i5 = c0211x.f3431o) < 0) {
            W0();
            z4 = this.f3018u;
            i5 = this.f3021x;
            if (i5 == -1) {
                i5 = z4 ? i4 - 1 : 0;
            }
        } else {
            z4 = c0211x.f3433q;
        }
        int i6 = z4 ? -1 : 1;
        for (int i7 = 0; i7 < this.f3011C && i5 >= 0 && i5 < i4; i7++) {
            c0197j.b(i5, 0);
            i5 += i6;
        }
    }

    @Override // b0.AbstractC0178L
    public final int j(Z z4) {
        return B0(z4);
    }

    @Override // b0.AbstractC0178L
    public int k(Z z4) {
        return C0(z4);
    }

    @Override // b0.AbstractC0178L
    public int l(Z z4) {
        return D0(z4);
    }

    @Override // b0.AbstractC0178L
    public int l0(int i4, C0185T c0185t, Z z4) {
        if (this.f3013p == 1) {
            return 0;
        }
        return X0(i4, c0185t, z4);
    }

    @Override // b0.AbstractC0178L
    public final int m(Z z4) {
        return B0(z4);
    }

    @Override // b0.AbstractC0178L
    public final void m0(int i4) {
        this.f3021x = i4;
        this.y = Integer.MIN_VALUE;
        C0211x c0211x = this.f3022z;
        if (c0211x != null) {
            c0211x.f3431o = -1;
        }
        k0();
    }

    @Override // b0.AbstractC0178L
    public int n(Z z4) {
        return C0(z4);
    }

    @Override // b0.AbstractC0178L
    public int n0(int i4, C0185T c0185t, Z z4) {
        if (this.f3013p == 0) {
            return 0;
        }
        return X0(i4, c0185t, z4);
    }

    @Override // b0.AbstractC0178L
    public int o(Z z4) {
        return D0(z4);
    }

    @Override // b0.AbstractC0178L
    public final View q(int i4) {
        int v4 = v();
        if (v4 == 0) {
            return null;
        }
        int H3 = i4 - AbstractC0178L.H(u(0));
        if (H3 >= 0 && H3 < v4) {
            View u2 = u(H3);
            if (AbstractC0178L.H(u2) == i4) {
                return u2;
            }
        }
        return super.q(i4);
    }

    @Override // b0.AbstractC0178L
    public C0179M r() {
        return new C0179M(-2, -2);
    }

    @Override // b0.AbstractC0178L
    public final boolean u0() {
        if (this.f3194m != 1073741824 && this.f3193l != 1073741824) {
            int v4 = v();
            for (int i4 = 0; i4 < v4; i4++) {
                ViewGroup.LayoutParams layoutParams = u(i4).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // b0.AbstractC0178L
    public void w0(RecyclerView recyclerView, int i4) {
        C0212y c0212y = new C0212y(recyclerView.getContext());
        c0212y.f3434a = i4;
        x0(c0212y);
    }

    @Override // b0.AbstractC0178L
    public boolean y0() {
        return this.f3022z == null && this.f3016s == this.f3019v;
    }

    public void z0(Z z4, int[] iArr) {
        int i4;
        int k3 = z4.f3216a != -1 ? this.f3015r.k() : 0;
        if (this.f3014q.f3424f == -1) {
            i4 = 0;
        } else {
            i4 = k3;
            k3 = 0;
        }
        iArr[0] = k3;
        iArr[1] = i4;
    }
}
