package androidx.recyclerview.widget;

import D0.o;
import D3.d;
import H.A;
import I.g;
import android.content.Context;
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
import b0.C0207t;
import b0.C0212y;
import b0.Y;
import b0.Z;
import b0.h0;
import b0.i0;
import b0.k0;
import b0.l0;
import com.google.android.gms.internal.ads.C0258Da;
import d3.AbstractC1654b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0178L implements Y {

    /* renamed from: B, reason: collision with root package name */
    public final C0258Da f3094B;

    /* renamed from: C, reason: collision with root package name */
    public final int f3095C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f3096D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f3097E;

    /* renamed from: F, reason: collision with root package name */
    public k0 f3098F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f3099G;

    /* renamed from: H, reason: collision with root package name */
    public final h0 f3100H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f3101I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f3102J;

    /* renamed from: K, reason: collision with root package name */
    public final o f3103K;

    /* renamed from: p, reason: collision with root package name */
    public final int f3104p;

    /* renamed from: q, reason: collision with root package name */
    public final l0[] f3105q;

    /* renamed from: r, reason: collision with root package name */
    public final C0167A f3106r;

    /* renamed from: s, reason: collision with root package name */
    public final C0167A f3107s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3108t;

    /* renamed from: u, reason: collision with root package name */
    public int f3109u;

    /* renamed from: v, reason: collision with root package name */
    public final C0207t f3110v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3111w;
    public final BitSet y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3112x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f3113z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f3093A = Integer.MIN_VALUE;

    /* JADX WARN: Type inference failed for: r7v3, types: [b0.t, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f3104p = -1;
        this.f3111w = false;
        C0258Da c0258Da = new C0258Da(9, false);
        this.f3094B = c0258Da;
        this.f3095C = 2;
        this.f3099G = new Rect();
        this.f3100H = new h0(this);
        this.f3101I = true;
        this.f3103K = new o(21, this);
        C0177K I4 = AbstractC0178L.I(context, attributeSet, i4, i5);
        int i6 = I4.f3182a;
        if (i6 != 0 && i6 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i6 != this.f3108t) {
            this.f3108t = i6;
            C0167A c0167a = this.f3106r;
            this.f3106r = this.f3107s;
            this.f3107s = c0167a;
            k0();
        }
        int i7 = I4.f3183b;
        c(null);
        if (i7 != this.f3104p) {
            int[] iArr = (int[]) c0258Da.f4618p;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0258Da.f4619q = null;
            k0();
            this.f3104p = i7;
            this.y = new BitSet(this.f3104p);
            this.f3105q = new l0[this.f3104p];
            for (int i8 = 0; i8 < this.f3104p; i8++) {
                this.f3105q[i8] = new l0(this, i8);
            }
            k0();
        }
        boolean z4 = I4.c;
        c(null);
        k0 k0Var = this.f3098F;
        if (k0Var != null && k0Var.f3341v != z4) {
            k0Var.f3341v = z4;
        }
        this.f3111w = z4;
        k0();
        ?? obj = new Object();
        obj.f3408a = true;
        obj.f3411f = 0;
        obj.f3412g = 0;
        this.f3110v = obj;
        this.f3106r = C0167A.a(this, this.f3108t);
        this.f3107s = C0167A.a(this, 1 - this.f3108t);
    }

    public static int Z0(int i4, int i5, int i6) {
        int mode;
        return (!(i5 == 0 && i6 == 0) && ((mode = View.MeasureSpec.getMode(i4)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i4) - i5) - i6), mode) : i4;
    }

    public final int A0(Z z4) {
        if (v() == 0) {
            return 0;
        }
        boolean z5 = !this.f3101I;
        return AbstractC1654b.j(z4, this.f3106r, D0(z5), C0(z5), this, this.f3101I, this.f3112x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x026e, code lost:
    
        R0(r20, r3);
     */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int B0(b0.C0185T r20, b0.C0207t r21, b0.Z r22) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.B0(b0.T, b0.t, b0.Z):int");
    }

    public final View C0(boolean z4) {
        int j4 = this.f3106r.j();
        int g4 = this.f3106r.g();
        View view = null;
        for (int v4 = v() - 1; v4 >= 0; v4--) {
            View u2 = u(v4);
            int e4 = this.f3106r.e(u2);
            int b4 = this.f3106r.b(u2);
            if (b4 > j4 && e4 < g4) {
                if (b4 <= g4 || !z4) {
                    return u2;
                }
                if (view == null) {
                    view = u2;
                }
            }
        }
        return view;
    }

    public final View D0(boolean z4) {
        int j4 = this.f3106r.j();
        int g4 = this.f3106r.g();
        int v4 = v();
        View view = null;
        for (int i4 = 0; i4 < v4; i4++) {
            View u2 = u(i4);
            int e4 = this.f3106r.e(u2);
            if (this.f3106r.b(u2) > j4 && e4 < g4) {
                if (e4 >= j4 || !z4) {
                    return u2;
                }
                if (view == null) {
                    view = u2;
                }
            }
        }
        return view;
    }

    public final void E0(C0185T c0185t, Z z4, boolean z5) {
        int g4;
        int I02 = I0(Integer.MIN_VALUE);
        if (I02 != Integer.MIN_VALUE && (g4 = this.f3106r.g() - I02) > 0) {
            int i4 = g4 - (-V0(-g4, c0185t, z4));
            if (!z5 || i4 <= 0) {
                return;
            }
            this.f3106r.n(i4);
        }
    }

    public final void F0(C0185T c0185t, Z z4, boolean z5) {
        int j4;
        int J0 = J0(Integer.MAX_VALUE);
        if (J0 != Integer.MAX_VALUE && (j4 = J0 - this.f3106r.j()) > 0) {
            int V02 = j4 - V0(j4, c0185t, z4);
            if (!z5 || V02 <= 0) {
                return;
            }
            this.f3106r.n(-V02);
        }
    }

    public final int G0() {
        if (v() == 0) {
            return 0;
        }
        return AbstractC0178L.H(u(0));
    }

    public final int H0() {
        int v4 = v();
        if (v4 == 0) {
            return 0;
        }
        return AbstractC0178L.H(u(v4 - 1));
    }

    public final int I0(int i4) {
        int h4 = this.f3105q[0].h(i4);
        for (int i5 = 1; i5 < this.f3104p; i5++) {
            int h5 = this.f3105q[i5].h(i4);
            if (h5 > h4) {
                h4 = h5;
            }
        }
        return h4;
    }

    @Override // b0.AbstractC0178L
    public final int J(C0185T c0185t, Z z4) {
        return this.f3108t == 0 ? this.f3104p : super.J(c0185t, z4);
    }

    public final int J0(int i4) {
        int j4 = this.f3105q[0].j(i4);
        for (int i5 = 1; i5 < this.f3104p; i5++) {
            int j5 = this.f3105q[i5].j(i4);
            if (j5 < j4) {
                j4 = j5;
            }
        }
        return j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K0(int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.K0(int, int, int):void");
    }

    @Override // b0.AbstractC0178L
    public final boolean L() {
        return this.f3095C != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View L0() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.L0():android.view.View");
    }

    public final boolean M0() {
        RecyclerView recyclerView = this.f3185b;
        WeakHashMap weakHashMap = A.f779a;
        return recyclerView.getLayoutDirection() == 1;
    }

    public final void N0(View view, int i4, int i5) {
        RecyclerView recyclerView = this.f3185b;
        Rect rect = this.f3099G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.K(view));
        }
        i0 i0Var = (i0) view.getLayoutParams();
        int Z02 = Z0(i4, ((ViewGroup.MarginLayoutParams) i0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) i0Var).rightMargin + rect.right);
        int Z03 = Z0(i5, ((ViewGroup.MarginLayoutParams) i0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) i0Var).bottomMargin + rect.bottom);
        if (t0(view, Z02, Z03, i0Var)) {
            view.measure(Z02, Z03);
        }
    }

    @Override // b0.AbstractC0178L
    public final void O(int i4) {
        super.O(i4);
        for (int i5 = 0; i5 < this.f3104p; i5++) {
            l0 l0Var = this.f3105q[i5];
            int i6 = l0Var.c;
            if (i6 != Integer.MIN_VALUE) {
                l0Var.c = i6 + i4;
            }
            int i7 = l0Var.d;
            if (i7 != Integer.MIN_VALUE) {
                l0Var.d = i7 + i4;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01aa, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a6, code lost:
    
        if ((r12 < G0()) != r16.f3112x) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x041e, code lost:
    
        if (z0() != false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0198, code lost:
    
        if (r16.f3112x != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a8, code lost:
    
        r12 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0(b0.C0185T r17, b0.Z r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.O0(b0.T, b0.Z, boolean):void");
    }

    @Override // b0.AbstractC0178L
    public final void P(int i4) {
        super.P(i4);
        for (int i5 = 0; i5 < this.f3104p; i5++) {
            l0 l0Var = this.f3105q[i5];
            int i6 = l0Var.c;
            if (i6 != Integer.MIN_VALUE) {
                l0Var.c = i6 + i4;
            }
            int i7 = l0Var.d;
            if (i7 != Integer.MIN_VALUE) {
                l0Var.d = i7 + i4;
            }
        }
    }

    public final boolean P0(int i4) {
        if (this.f3108t == 0) {
            return (i4 == -1) != this.f3112x;
        }
        return ((i4 == -1) == this.f3112x) == M0();
    }

    @Override // b0.AbstractC0178L
    public final void Q(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3185b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f3103K);
        }
        for (int i4 = 0; i4 < this.f3104p; i4++) {
            this.f3105q[i4].b();
        }
        recyclerView.requestLayout();
    }

    public final void Q0(int i4, Z z4) {
        int G02;
        int i5;
        if (i4 > 0) {
            G02 = H0();
            i5 = 1;
        } else {
            G02 = G0();
            i5 = -1;
        }
        C0207t c0207t = this.f3110v;
        c0207t.f3408a = true;
        X0(G02, z4);
        W0(i5);
        c0207t.c = G02 + c0207t.d;
        c0207t.f3409b = Math.abs(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0051, code lost:
    
        if (r8.f3108t == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0057, code lost:
    
        if (r8.f3108t == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0063, code lost:
    
        if (M0() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x006f, code lost:
    
        if (M0() == false) goto L37;
     */
    @Override // b0.AbstractC0178L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View R(android.view.View r9, int r10, b0.C0185T r11, b0.Z r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.R(android.view.View, int, b0.T, b0.Z):android.view.View");
    }

    public final void R0(C0185T c0185t, C0207t c0207t) {
        if (!c0207t.f3408a || c0207t.f3414i) {
            return;
        }
        if (c0207t.f3409b == 0) {
            if (c0207t.f3410e == -1) {
                S0(c0185t, c0207t.f3412g);
                return;
            } else {
                T0(c0185t, c0207t.f3411f);
                return;
            }
        }
        int i4 = 1;
        if (c0207t.f3410e == -1) {
            int i5 = c0207t.f3411f;
            int j4 = this.f3105q[0].j(i5);
            while (i4 < this.f3104p) {
                int j5 = this.f3105q[i4].j(i5);
                if (j5 > j4) {
                    j4 = j5;
                }
                i4++;
            }
            int i6 = i5 - j4;
            S0(c0185t, i6 < 0 ? c0207t.f3412g : c0207t.f3412g - Math.min(i6, c0207t.f3409b));
            return;
        }
        int i7 = c0207t.f3412g;
        int h4 = this.f3105q[0].h(i7);
        while (i4 < this.f3104p) {
            int h5 = this.f3105q[i4].h(i7);
            if (h5 < h4) {
                h4 = h5;
            }
            i4++;
        }
        int i8 = h4 - c0207t.f3412g;
        T0(c0185t, i8 < 0 ? c0207t.f3411f : Math.min(i8, c0207t.f3409b) + c0207t.f3411f);
    }

    @Override // b0.AbstractC0178L
    public final void S(AccessibilityEvent accessibilityEvent) {
        super.S(accessibilityEvent);
        if (v() > 0) {
            View D02 = D0(false);
            View C02 = C0(false);
            if (D02 == null || C02 == null) {
                return;
            }
            int H3 = AbstractC0178L.H(D02);
            int H4 = AbstractC0178L.H(C02);
            if (H3 < H4) {
                accessibilityEvent.setFromIndex(H3);
                accessibilityEvent.setToIndex(H4);
            } else {
                accessibilityEvent.setFromIndex(H4);
                accessibilityEvent.setToIndex(H3);
            }
        }
    }

    public final void S0(C0185T c0185t, int i4) {
        for (int v4 = v() - 1; v4 >= 0; v4--) {
            View u2 = u(v4);
            if (this.f3106r.e(u2) < i4 || this.f3106r.m(u2) < i4) {
                return;
            }
            i0 i0Var = (i0) u2.getLayoutParams();
            i0Var.getClass();
            if (((ArrayList) i0Var.f3324e.f3351b).size() == 1) {
                return;
            }
            l0 l0Var = i0Var.f3324e;
            ArrayList arrayList = (ArrayList) l0Var.f3351b;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            i0 i0Var2 = (i0) view.getLayoutParams();
            i0Var2.f3324e = null;
            if (i0Var2.f3197a.i() || i0Var2.f3197a.l()) {
                l0Var.f3352e -= ((StaggeredGridLayoutManager) l0Var.f3354g).f3106r.c(view);
            }
            if (size == 1) {
                l0Var.c = Integer.MIN_VALUE;
            }
            l0Var.d = Integer.MIN_VALUE;
            h0(u2, c0185t);
        }
    }

    public final void T0(C0185T c0185t, int i4) {
        while (v() > 0) {
            View u2 = u(0);
            if (this.f3106r.b(u2) > i4 || this.f3106r.l(u2) > i4) {
                return;
            }
            i0 i0Var = (i0) u2.getLayoutParams();
            i0Var.getClass();
            if (((ArrayList) i0Var.f3324e.f3351b).size() == 1) {
                return;
            }
            l0 l0Var = i0Var.f3324e;
            ArrayList arrayList = (ArrayList) l0Var.f3351b;
            View view = (View) arrayList.remove(0);
            i0 i0Var2 = (i0) view.getLayoutParams();
            i0Var2.f3324e = null;
            if (arrayList.size() == 0) {
                l0Var.d = Integer.MIN_VALUE;
            }
            if (i0Var2.f3197a.i() || i0Var2.f3197a.l()) {
                l0Var.f3352e -= ((StaggeredGridLayoutManager) l0Var.f3354g).f3106r.c(view);
            }
            l0Var.c = Integer.MIN_VALUE;
            h0(u2, c0185t);
        }
    }

    @Override // b0.AbstractC0178L
    public final void U(C0185T c0185t, Z z4, View view, g gVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof i0)) {
            T(view, gVar);
            return;
        }
        i0 i0Var = (i0) layoutParams;
        if (this.f3108t == 0) {
            l0 l0Var = i0Var.f3324e;
            gVar.j(d.u(false, l0Var == null ? -1 : l0Var.f3353f, 1, -1, -1));
        } else {
            l0 l0Var2 = i0Var.f3324e;
            gVar.j(d.u(false, -1, -1, l0Var2 == null ? -1 : l0Var2.f3353f, 1));
        }
    }

    public final void U0() {
        if (this.f3108t == 1 || !M0()) {
            this.f3112x = this.f3111w;
        } else {
            this.f3112x = !this.f3111w;
        }
    }

    @Override // b0.AbstractC0178L
    public final void V(int i4, int i5) {
        K0(i4, i5, 1);
    }

    public final int V0(int i4, C0185T c0185t, Z z4) {
        if (v() == 0 || i4 == 0) {
            return 0;
        }
        Q0(i4, z4);
        C0207t c0207t = this.f3110v;
        int B02 = B0(c0185t, c0207t, z4);
        if (c0207t.f3409b >= B02) {
            i4 = i4 < 0 ? -B02 : B02;
        }
        this.f3106r.n(-i4);
        this.f3096D = this.f3112x;
        c0207t.f3409b = 0;
        R0(c0185t, c0207t);
        return i4;
    }

    @Override // b0.AbstractC0178L
    public final void W() {
        C0258Da c0258Da = this.f3094B;
        int[] iArr = (int[]) c0258Da.f4618p;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        c0258Da.f4619q = null;
        k0();
    }

    public final void W0(int i4) {
        C0207t c0207t = this.f3110v;
        c0207t.f3410e = i4;
        c0207t.d = this.f3112x != (i4 == -1) ? -1 : 1;
    }

    @Override // b0.AbstractC0178L
    public final void X(int i4, int i5) {
        K0(i4, i5, 8);
    }

    public final void X0(int i4, Z z4) {
        int i5;
        int i6;
        int i7;
        C0207t c0207t = this.f3110v;
        boolean z5 = false;
        c0207t.f3409b = 0;
        c0207t.c = i4;
        C0212y c0212y = this.f3186e;
        if (c0212y == null || !c0212y.f3436e || (i7 = z4.f3216a) == -1) {
            i5 = 0;
            i6 = 0;
        } else {
            if (this.f3112x == (i7 < i4)) {
                i5 = this.f3106r.k();
                i6 = 0;
            } else {
                i6 = this.f3106r.k();
                i5 = 0;
            }
        }
        RecyclerView recyclerView = this.f3185b;
        if (recyclerView == null || !recyclerView.f3082u) {
            c0207t.f3412g = this.f3106r.f() + i5;
            c0207t.f3411f = -i6;
        } else {
            c0207t.f3411f = this.f3106r.j() - i6;
            c0207t.f3412g = this.f3106r.g() + i5;
        }
        c0207t.f3413h = false;
        c0207t.f3408a = true;
        if (this.f3106r.i() == 0 && this.f3106r.f() == 0) {
            z5 = true;
        }
        c0207t.f3414i = z5;
    }

    @Override // b0.AbstractC0178L
    public final void Y(int i4, int i5) {
        K0(i4, i5, 2);
    }

    public final void Y0(l0 l0Var, int i4, int i5) {
        int i6 = l0Var.f3352e;
        int i7 = l0Var.f3353f;
        if (i4 != -1) {
            int i8 = l0Var.d;
            if (i8 == Integer.MIN_VALUE) {
                l0Var.a();
                i8 = l0Var.d;
            }
            if (i8 - i6 >= i5) {
                this.y.set(i7, false);
                return;
            }
            return;
        }
        int i9 = l0Var.c;
        if (i9 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) l0Var.f3351b).get(0);
            i0 i0Var = (i0) view.getLayoutParams();
            l0Var.c = ((StaggeredGridLayoutManager) l0Var.f3354g).f3106r.e(view);
            i0Var.getClass();
            i9 = l0Var.c;
        }
        if (i9 + i6 <= i5) {
            this.y.set(i7, false);
        }
    }

    @Override // b0.AbstractC0178L
    public final void Z(int i4, int i5) {
        K0(i4, i5, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if ((r4 < G0()) != r3.f3112x) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3.f3112x != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r1 = 1;
     */
    @Override // b0.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF a(int r4) {
        /*
            r3 = this;
            int r0 = r3.v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f3112x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.G0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f3112x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f3108t
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(int):android.graphics.PointF");
    }

    @Override // b0.AbstractC0178L
    public final void a0(C0185T c0185t, Z z4) {
        O0(c0185t, z4, true);
    }

    @Override // b0.AbstractC0178L
    public final void b0(Z z4) {
        this.f3113z = -1;
        this.f3093A = Integer.MIN_VALUE;
        this.f3098F = null;
        this.f3100H.a();
    }

    @Override // b0.AbstractC0178L
    public final void c(String str) {
        RecyclerView recyclerView;
        if (this.f3098F != null || (recyclerView = this.f3185b) == null) {
            return;
        }
        recyclerView.i(str);
    }

    @Override // b0.AbstractC0178L
    public final void c0(Parcelable parcelable) {
        if (parcelable instanceof k0) {
            this.f3098F = (k0) parcelable;
            k0();
        }
    }

    @Override // b0.AbstractC0178L
    public final boolean d() {
        return this.f3108t == 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, b0.k0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.os.Parcelable, java.lang.Object, b0.k0] */
    @Override // b0.AbstractC0178L
    public final Parcelable d0() {
        int j4;
        int j5;
        int[] iArr;
        k0 k0Var = this.f3098F;
        if (k0Var != null) {
            ?? obj = new Object();
            obj.f3336q = k0Var.f3336q;
            obj.f3334o = k0Var.f3334o;
            obj.f3335p = k0Var.f3335p;
            obj.f3337r = k0Var.f3337r;
            obj.f3338s = k0Var.f3338s;
            obj.f3339t = k0Var.f3339t;
            obj.f3341v = k0Var.f3341v;
            obj.f3342w = k0Var.f3342w;
            obj.f3343x = k0Var.f3343x;
            obj.f3340u = k0Var.f3340u;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.f3341v = this.f3111w;
        obj2.f3342w = this.f3096D;
        obj2.f3343x = this.f3097E;
        C0258Da c0258Da = this.f3094B;
        if (c0258Da == null || (iArr = (int[]) c0258Da.f4618p) == null) {
            obj2.f3338s = 0;
        } else {
            obj2.f3339t = iArr;
            obj2.f3338s = iArr.length;
            obj2.f3340u = (ArrayList) c0258Da.f4619q;
        }
        if (v() <= 0) {
            obj2.f3334o = -1;
            obj2.f3335p = -1;
            obj2.f3336q = 0;
            return obj2;
        }
        obj2.f3334o = this.f3096D ? H0() : G0();
        View C02 = this.f3112x ? C0(true) : D0(true);
        obj2.f3335p = C02 != null ? AbstractC0178L.H(C02) : -1;
        int i4 = this.f3104p;
        obj2.f3336q = i4;
        obj2.f3337r = new int[i4];
        for (int i5 = 0; i5 < this.f3104p; i5++) {
            if (this.f3096D) {
                j4 = this.f3105q[i5].h(Integer.MIN_VALUE);
                if (j4 != Integer.MIN_VALUE) {
                    j5 = this.f3106r.g();
                    j4 -= j5;
                    obj2.f3337r[i5] = j4;
                } else {
                    obj2.f3337r[i5] = j4;
                }
            } else {
                j4 = this.f3105q[i5].j(Integer.MIN_VALUE);
                if (j4 != Integer.MIN_VALUE) {
                    j5 = this.f3106r.j();
                    j4 -= j5;
                    obj2.f3337r[i5] = j4;
                } else {
                    obj2.f3337r[i5] = j4;
                }
            }
        }
        return obj2;
    }

    @Override // b0.AbstractC0178L
    public final boolean e() {
        return this.f3108t == 1;
    }

    @Override // b0.AbstractC0178L
    public final void e0(int i4) {
        if (i4 == 0) {
            z0();
        }
    }

    @Override // b0.AbstractC0178L
    public final boolean f(C0179M c0179m) {
        return c0179m instanceof i0;
    }

    @Override // b0.AbstractC0178L
    public final void h(int i4, int i5, Z z4, C0197j c0197j) {
        C0207t c0207t;
        int h4;
        int i6;
        if (this.f3108t != 0) {
            i4 = i5;
        }
        if (v() == 0 || i4 == 0) {
            return;
        }
        Q0(i4, z4);
        int[] iArr = this.f3102J;
        if (iArr == null || iArr.length < this.f3104p) {
            this.f3102J = new int[this.f3104p];
        }
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = this.f3104p;
            c0207t = this.f3110v;
            if (i7 >= i9) {
                break;
            }
            if (c0207t.d == -1) {
                h4 = c0207t.f3411f;
                i6 = this.f3105q[i7].j(h4);
            } else {
                h4 = this.f3105q[i7].h(c0207t.f3412g);
                i6 = c0207t.f3412g;
            }
            int i10 = h4 - i6;
            if (i10 >= 0) {
                this.f3102J[i8] = i10;
                i8++;
            }
            i7++;
        }
        Arrays.sort(this.f3102J, 0, i8);
        for (int i11 = 0; i11 < i8; i11++) {
            int i12 = c0207t.c;
            if (i12 < 0 || i12 >= z4.b()) {
                return;
            }
            c0197j.b(c0207t.c, this.f3102J[i11]);
            c0207t.c += c0207t.d;
        }
    }

    @Override // b0.AbstractC0178L
    public final int j(Z z4) {
        if (v() == 0) {
            return 0;
        }
        boolean z5 = !this.f3101I;
        return AbstractC1654b.i(z4, this.f3106r, D0(z5), C0(z5), this, this.f3101I);
    }

    @Override // b0.AbstractC0178L
    public final int k(Z z4) {
        return A0(z4);
    }

    @Override // b0.AbstractC0178L
    public final int l(Z z4) {
        if (v() == 0) {
            return 0;
        }
        boolean z5 = !this.f3101I;
        return AbstractC1654b.k(z4, this.f3106r, D0(z5), C0(z5), this, this.f3101I);
    }

    @Override // b0.AbstractC0178L
    public final int l0(int i4, C0185T c0185t, Z z4) {
        return V0(i4, c0185t, z4);
    }

    @Override // b0.AbstractC0178L
    public final int m(Z z4) {
        if (v() == 0) {
            return 0;
        }
        boolean z5 = !this.f3101I;
        return AbstractC1654b.i(z4, this.f3106r, D0(z5), C0(z5), this, this.f3101I);
    }

    @Override // b0.AbstractC0178L
    public final void m0(int i4) {
        k0 k0Var = this.f3098F;
        if (k0Var != null && k0Var.f3334o != i4) {
            k0Var.f3337r = null;
            k0Var.f3336q = 0;
            k0Var.f3334o = -1;
            k0Var.f3335p = -1;
        }
        this.f3113z = i4;
        this.f3093A = Integer.MIN_VALUE;
        k0();
    }

    @Override // b0.AbstractC0178L
    public final int n(Z z4) {
        return A0(z4);
    }

    @Override // b0.AbstractC0178L
    public final int n0(int i4, C0185T c0185t, Z z4) {
        return V0(i4, c0185t, z4);
    }

    @Override // b0.AbstractC0178L
    public final int o(Z z4) {
        if (v() == 0) {
            return 0;
        }
        boolean z5 = !this.f3101I;
        return AbstractC1654b.k(z4, this.f3106r, D0(z5), C0(z5), this, this.f3101I);
    }

    @Override // b0.AbstractC0178L
    public final void q0(Rect rect, int i4, int i5) {
        int g4;
        int g5;
        int F2 = F() + E();
        int D4 = D() + G();
        int i6 = this.f3108t;
        int i7 = this.f3104p;
        if (i6 == 1) {
            int height = rect.height() + D4;
            RecyclerView recyclerView = this.f3185b;
            WeakHashMap weakHashMap = A.f779a;
            g5 = AbstractC0178L.g(i5, height, recyclerView.getMinimumHeight());
            g4 = AbstractC0178L.g(i4, (this.f3109u * i7) + F2, this.f3185b.getMinimumWidth());
        } else {
            int width = rect.width() + F2;
            RecyclerView recyclerView2 = this.f3185b;
            WeakHashMap weakHashMap2 = A.f779a;
            g4 = AbstractC0178L.g(i4, width, recyclerView2.getMinimumWidth());
            g5 = AbstractC0178L.g(i5, (this.f3109u * i7) + D4, this.f3185b.getMinimumHeight());
        }
        this.f3185b.setMeasuredDimension(g4, g5);
    }

    @Override // b0.AbstractC0178L
    public final C0179M r() {
        return this.f3108t == 0 ? new C0179M(-2, -1) : new C0179M(-1, -2);
    }

    @Override // b0.AbstractC0178L
    public final C0179M s(Context context, AttributeSet attributeSet) {
        return new C0179M(context, attributeSet);
    }

    @Override // b0.AbstractC0178L
    public final C0179M t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0179M((ViewGroup.MarginLayoutParams) layoutParams) : new C0179M(layoutParams);
    }

    @Override // b0.AbstractC0178L
    public final void w0(RecyclerView recyclerView, int i4) {
        C0212y c0212y = new C0212y(recyclerView.getContext());
        c0212y.f3434a = i4;
        x0(c0212y);
    }

    @Override // b0.AbstractC0178L
    public final int x(C0185T c0185t, Z z4) {
        return this.f3108t == 1 ? this.f3104p : super.x(c0185t, z4);
    }

    @Override // b0.AbstractC0178L
    public final boolean y0() {
        return this.f3098F == null;
    }

    public final boolean z0() {
        int G02;
        if (v() != 0 && this.f3095C != 0 && this.f3188g) {
            if (this.f3112x) {
                G02 = H0();
                G0();
            } else {
                G02 = G0();
                H0();
            }
            if (G02 == 0 && L0() != null) {
                C0258Da c0258Da = this.f3094B;
                int[] iArr = (int[]) c0258Da.f4618p;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                c0258Da.f4619q = null;
                this.f3187f = true;
                k0();
                return true;
            }
        }
        return false;
    }
}
