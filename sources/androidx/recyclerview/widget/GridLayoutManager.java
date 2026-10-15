package androidx.recyclerview.widget;

import D3.d;
import H.A;
import I.g;
import U.a;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import b0.AbstractC0178L;
import b0.C0179M;
import b0.C0185T;
import b0.C0197j;
import b0.C0200m;
import b0.C0208u;
import b0.C0210w;
import b0.Z;
import com.google.android.gms.internal.measurement.C1510e1;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public boolean f3001E;

    /* renamed from: F, reason: collision with root package name */
    public int f3002F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f3003G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f3004H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f3005I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseIntArray f3006J;

    /* renamed from: K, reason: collision with root package name */
    public final C1510e1 f3007K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f3008L;

    public GridLayoutManager() {
        super(1);
        this.f3001E = false;
        this.f3002F = -1;
        this.f3005I = new SparseIntArray();
        this.f3006J = new SparseIntArray();
        this.f3007K = new C1510e1(10);
        this.f3008L = new Rect();
        l1(1);
    }

    public GridLayoutManager(int i4) {
        super(1);
        this.f3001E = false;
        this.f3002F = -1;
        this.f3005I = new SparseIntArray();
        this.f3006J = new SparseIntArray();
        this.f3007K = new C1510e1(10);
        this.f3008L = new Rect();
        l1(i4);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f3001E = false;
        this.f3002F = -1;
        this.f3005I = new SparseIntArray();
        this.f3006J = new SparseIntArray();
        this.f3007K = new C1510e1(10);
        this.f3008L = new Rect();
        l1(AbstractC0178L.I(context, attributeSet, i4, i5).f3183b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A0(Z z4, C0210w c0210w, C0197j c0197j) {
        int i4;
        int i5 = this.f3002F;
        for (int i6 = 0; i6 < this.f3002F && (i4 = c0210w.d) >= 0 && i4 < z4.b() && i5 > 0; i6++) {
            c0197j.b(c0210w.d, Math.max(0, c0210w.f3425g));
            this.f3007K.getClass();
            i5--;
            c0210w.d += c0210w.f3423e;
        }
    }

    @Override // b0.AbstractC0178L
    public final int J(C0185T c0185t, Z z4) {
        if (this.f3013p == 0) {
            return this.f3002F;
        }
        if (z4.b() < 1) {
            return 0;
        }
        return h1(z4.b() - 1, c0185t, z4) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View M0(C0185T c0185t, Z z4, int i4, int i5, int i6) {
        F0();
        int j4 = this.f3015r.j();
        int g4 = this.f3015r.g();
        int i7 = i5 > i4 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i4 != i5) {
            View u2 = u(i4);
            int H3 = AbstractC0178L.H(u2);
            if (H3 >= 0 && H3 < i6 && i1(H3, c0185t, z4) == 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        if (r13 == (r2 > r8)) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0021, code lost:
    
        if (((java.util.ArrayList) r22.f3184a.f14711r).contains(r3) != false) goto L10;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, b0.AbstractC0178L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View R(android.view.View r23, int r24, b0.C0185T r25, b0.Z r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.R(android.view.View, int, b0.T, b0.Z):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        r22.f3420b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v35 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S0(b0.C0185T r19, b0.Z r20, b0.C0210w r21, b0.C0209v r22) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.S0(b0.T, b0.Z, b0.w, b0.v):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void T0(C0185T c0185t, Z z4, C0208u c0208u, int i4) {
        m1();
        if (z4.b() > 0 && !z4.f3220g) {
            boolean z5 = i4 == 1;
            int i12 = i1(c0208u.f3416b, c0185t, z4);
            if (z5) {
                while (i12 > 0) {
                    int i5 = c0208u.f3416b;
                    if (i5 <= 0) {
                        break;
                    }
                    int i6 = i5 - 1;
                    c0208u.f3416b = i6;
                    i12 = i1(i6, c0185t, z4);
                }
            } else {
                int b4 = z4.b() - 1;
                int i7 = c0208u.f3416b;
                while (i7 < b4) {
                    int i8 = i7 + 1;
                    int i13 = i1(i8, c0185t, z4);
                    if (i13 <= i12) {
                        break;
                    }
                    i7 = i8;
                    i12 = i13;
                }
                c0208u.f3416b = i7;
            }
        }
        f1();
    }

    @Override // b0.AbstractC0178L
    public final void U(C0185T c0185t, Z z4, View view, g gVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0200m)) {
            T(view, gVar);
            return;
        }
        C0200m c0200m = (C0200m) layoutParams;
        int h12 = h1(c0200m.f3197a.c(), c0185t, z4);
        if (this.f3013p == 0) {
            gVar.j(d.u(false, c0200m.f3355e, c0200m.f3356f, h12, 1));
        } else {
            gVar.j(d.u(false, h12, 1, c0200m.f3355e, c0200m.f3356f));
        }
    }

    @Override // b0.AbstractC0178L
    public final void V(int i4, int i5) {
        C1510e1 c1510e1 = this.f3007K;
        c1510e1.o();
        ((SparseIntArray) c1510e1.f11915q).clear();
    }

    @Override // b0.AbstractC0178L
    public final void W() {
        C1510e1 c1510e1 = this.f3007K;
        c1510e1.o();
        ((SparseIntArray) c1510e1.f11915q).clear();
    }

    @Override // b0.AbstractC0178L
    public final void X(int i4, int i5) {
        C1510e1 c1510e1 = this.f3007K;
        c1510e1.o();
        ((SparseIntArray) c1510e1.f11915q).clear();
    }

    @Override // b0.AbstractC0178L
    public final void Y(int i4, int i5) {
        C1510e1 c1510e1 = this.f3007K;
        c1510e1.o();
        ((SparseIntArray) c1510e1.f11915q).clear();
    }

    @Override // b0.AbstractC0178L
    public final void Z(int i4, int i5) {
        C1510e1 c1510e1 = this.f3007K;
        c1510e1.o();
        ((SparseIntArray) c1510e1.f11915q).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b0.AbstractC0178L
    public final void a0(C0185T c0185t, Z z4) {
        boolean z5 = z4.f3220g;
        SparseIntArray sparseIntArray = this.f3006J;
        SparseIntArray sparseIntArray2 = this.f3005I;
        if (z5) {
            int v4 = v();
            for (int i4 = 0; i4 < v4; i4++) {
                C0200m c0200m = (C0200m) u(i4).getLayoutParams();
                int c = c0200m.f3197a.c();
                sparseIntArray2.put(c, c0200m.f3356f);
                sparseIntArray.put(c, c0200m.f3355e);
            }
        }
        super.a0(c0185t, z4);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a1(boolean z4) {
        if (z4) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.a1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b0.AbstractC0178L
    public final void b0(Z z4) {
        super.b0(z4);
        this.f3001E = false;
    }

    public final void e1(int i4) {
        int i5;
        int[] iArr = this.f3003G;
        int i6 = this.f3002F;
        if (iArr == null || iArr.length != i6 + 1 || iArr[iArr.length - 1] != i4) {
            iArr = new int[i6 + 1];
        }
        int i7 = 0;
        iArr[0] = 0;
        int i8 = i4 / i6;
        int i9 = i4 % i6;
        int i10 = 0;
        for (int i11 = 1; i11 <= i6; i11++) {
            i7 += i9;
            if (i7 <= 0 || i6 - i7 >= i9) {
                i5 = i8;
            } else {
                i5 = i8 + 1;
                i7 -= i6;
            }
            i10 += i5;
            iArr[i11] = i10;
        }
        this.f3003G = iArr;
    }

    @Override // b0.AbstractC0178L
    public final boolean f(C0179M c0179m) {
        return c0179m instanceof C0200m;
    }

    public final void f1() {
        View[] viewArr = this.f3004H;
        if (viewArr == null || viewArr.length != this.f3002F) {
            this.f3004H = new View[this.f3002F];
        }
    }

    public final int g1(int i4, int i5) {
        if (this.f3013p != 1 || !R0()) {
            int[] iArr = this.f3003G;
            return iArr[i5 + i4] - iArr[i4];
        }
        int[] iArr2 = this.f3003G;
        int i6 = this.f3002F;
        return iArr2[i6 - i4] - iArr2[(i6 - i4) - i5];
    }

    public final int h1(int i4, C0185T c0185t, Z z4) {
        boolean z5 = z4.f3220g;
        C1510e1 c1510e1 = this.f3007K;
        if (!z5) {
            int i5 = this.f3002F;
            c1510e1.getClass();
            return C1510e1.n(i4, i5);
        }
        int b4 = c0185t.b(i4);
        if (b4 != -1) {
            int i6 = this.f3002F;
            c1510e1.getClass();
            return C1510e1.n(b4, i6);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i4);
        return 0;
    }

    public final int i1(int i4, C0185T c0185t, Z z4) {
        boolean z5 = z4.f3220g;
        C1510e1 c1510e1 = this.f3007K;
        if (!z5) {
            int i5 = this.f3002F;
            c1510e1.getClass();
            return i4 % i5;
        }
        int i6 = this.f3006J.get(i4, -1);
        if (i6 != -1) {
            return i6;
        }
        int b4 = c0185t.b(i4);
        if (b4 != -1) {
            int i7 = this.f3002F;
            c1510e1.getClass();
            return b4 % i7;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
        return 0;
    }

    public final int j1(int i4, C0185T c0185t, Z z4) {
        boolean z5 = z4.f3220g;
        C1510e1 c1510e1 = this.f3007K;
        if (!z5) {
            c1510e1.getClass();
            return 1;
        }
        int i5 = this.f3005I.get(i4, -1);
        if (i5 != -1) {
            return i5;
        }
        if (c0185t.b(i4) != -1) {
            c1510e1.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b0.AbstractC0178L
    public final int k(Z z4) {
        return C0(z4);
    }

    public final void k1(View view, int i4, boolean z4) {
        int i5;
        int i6;
        C0200m c0200m = (C0200m) view.getLayoutParams();
        Rect rect = c0200m.f3198b;
        int i7 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0200m).topMargin + ((ViewGroup.MarginLayoutParams) c0200m).bottomMargin;
        int i8 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0200m).leftMargin + ((ViewGroup.MarginLayoutParams) c0200m).rightMargin;
        int g12 = g1(c0200m.f3355e, c0200m.f3356f);
        if (this.f3013p == 1) {
            i6 = AbstractC0178L.w(false, g12, i4, i8, ((ViewGroup.MarginLayoutParams) c0200m).width);
            i5 = AbstractC0178L.w(true, this.f3015r.k(), this.f3194m, i7, ((ViewGroup.MarginLayoutParams) c0200m).height);
        } else {
            int w2 = AbstractC0178L.w(false, g12, i4, i7, ((ViewGroup.MarginLayoutParams) c0200m).height);
            int w4 = AbstractC0178L.w(true, this.f3015r.k(), this.f3193l, i8, ((ViewGroup.MarginLayoutParams) c0200m).width);
            i5 = w2;
            i6 = w4;
        }
        C0179M c0179m = (C0179M) view.getLayoutParams();
        if (z4 ? v0(view, i6, i5, c0179m) : t0(view, i6, i5, c0179m)) {
            view.measure(i6, i5);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b0.AbstractC0178L
    public final int l(Z z4) {
        return D0(z4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b0.AbstractC0178L
    public final int l0(int i4, C0185T c0185t, Z z4) {
        m1();
        f1();
        return super.l0(i4, c0185t, z4);
    }

    public final void l1(int i4) {
        if (i4 == this.f3002F) {
            return;
        }
        this.f3001E = true;
        if (i4 < 1) {
            throw new IllegalArgumentException(a.i("Span count should be at least 1. Provided ", i4));
        }
        this.f3002F = i4;
        this.f3007K.o();
        k0();
    }

    public final void m1() {
        int D4;
        int G3;
        if (this.f3013p == 1) {
            D4 = this.f3195n - F();
            G3 = E();
        } else {
            D4 = this.f3196o - D();
            G3 = G();
        }
        e1(D4 - G3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b0.AbstractC0178L
    public final int n(Z z4) {
        return C0(z4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b0.AbstractC0178L
    public final int n0(int i4, C0185T c0185t, Z z4) {
        m1();
        f1();
        return super.n0(i4, c0185t, z4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b0.AbstractC0178L
    public final int o(Z z4) {
        return D0(z4);
    }

    @Override // b0.AbstractC0178L
    public final void q0(Rect rect, int i4, int i5) {
        int g4;
        int g5;
        if (this.f3003G == null) {
            super.q0(rect, i4, i5);
        }
        int F2 = F() + E();
        int D4 = D() + G();
        if (this.f3013p == 1) {
            int height = rect.height() + D4;
            RecyclerView recyclerView = this.f3185b;
            WeakHashMap weakHashMap = A.f779a;
            g5 = AbstractC0178L.g(i5, height, recyclerView.getMinimumHeight());
            int[] iArr = this.f3003G;
            g4 = AbstractC0178L.g(i4, iArr[iArr.length - 1] + F2, this.f3185b.getMinimumWidth());
        } else {
            int width = rect.width() + F2;
            RecyclerView recyclerView2 = this.f3185b;
            WeakHashMap weakHashMap2 = A.f779a;
            g4 = AbstractC0178L.g(i4, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f3003G;
            g5 = AbstractC0178L.g(i5, iArr2[iArr2.length - 1] + D4, this.f3185b.getMinimumHeight());
        }
        this.f3185b.setMeasuredDimension(g4, g5);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b0.AbstractC0178L
    public final C0179M r() {
        return this.f3013p == 0 ? new C0200m(-2, -1) : new C0200m(-1, -2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b0.M, b0.m] */
    @Override // b0.AbstractC0178L
    public final C0179M s(Context context, AttributeSet attributeSet) {
        ?? c0179m = new C0179M(context, attributeSet);
        c0179m.f3355e = -1;
        c0179m.f3356f = 0;
        return c0179m;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [b0.M, b0.m] */
    /* JADX WARN: Type inference failed for: r0v2, types: [b0.M, b0.m] */
    @Override // b0.AbstractC0178L
    public final C0179M t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? c0179m = new C0179M((ViewGroup.MarginLayoutParams) layoutParams);
            c0179m.f3355e = -1;
            c0179m.f3356f = 0;
            return c0179m;
        }
        ?? c0179m2 = new C0179M(layoutParams);
        c0179m2.f3355e = -1;
        c0179m2.f3356f = 0;
        return c0179m2;
    }

    @Override // b0.AbstractC0178L
    public final int x(C0185T c0185t, Z z4) {
        if (this.f3013p == 1) {
            return this.f3002F;
        }
        if (z4.b() < 1) {
            return 0;
        }
        return h1(z4.b() - 1, c0185t, z4) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b0.AbstractC0178L
    public final boolean y0() {
        return this.f3022z == null && !this.f3001E;
    }
}
