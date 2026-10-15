package b0;

import a0.AbstractC0150a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.C0783ji;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0178L {

    /* renamed from: a, reason: collision with root package name */
    public q2.e f3184a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f3185b;
    public final C0783ji c;
    public final C0783ji d;

    /* renamed from: e, reason: collision with root package name */
    public C0212y f3186e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3187f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3188g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3189h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3190i;

    /* renamed from: j, reason: collision with root package name */
    public int f3191j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3192k;

    /* renamed from: l, reason: collision with root package name */
    public int f3193l;

    /* renamed from: m, reason: collision with root package name */
    public int f3194m;

    /* renamed from: n, reason: collision with root package name */
    public int f3195n;

    /* renamed from: o, reason: collision with root package name */
    public int f3196o;

    public AbstractC0178L() {
        x0.f fVar = new x0.f(25, this);
        D3.d dVar = new D3.d(25, this);
        this.c = new C0783ji(fVar);
        this.d = new C0783ji(dVar);
        this.f3187f = false;
        this.f3188g = false;
        this.f3189h = true;
        this.f3190i = true;
    }

    public static int A(View view) {
        return view.getLeft() - ((C0179M) view.getLayoutParams()).f3198b.left;
    }

    public static int B(View view) {
        return view.getRight() + ((C0179M) view.getLayoutParams()).f3198b.right;
    }

    public static int C(View view) {
        return view.getTop() - ((C0179M) view.getLayoutParams()).f3198b.top;
    }

    public static int H(View view) {
        return ((C0179M) view.getLayoutParams()).f3197a.c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b0.K, java.lang.Object] */
    public static C0177K I(Context context, AttributeSet attributeSet, int i4, int i5) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0150a.f2348a, i4, i5);
        obj.f3182a = obtainStyledAttributes.getInt(0, 1);
        obj.f3183b = obtainStyledAttributes.getInt(10, 1);
        obj.c = obtainStyledAttributes.getBoolean(9, false);
        obj.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean M(int i4, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (i6 > 0 && i4 != i6) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i4;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i4;
        }
        return true;
    }

    public static void N(View view, int i4, int i5, int i6, int i7) {
        C0179M c0179m = (C0179M) view.getLayoutParams();
        Rect rect = c0179m.f3198b;
        view.layout(i4 + rect.left + ((ViewGroup.MarginLayoutParams) c0179m).leftMargin, i5 + rect.top + ((ViewGroup.MarginLayoutParams) c0179m).topMargin, (i6 - rect.right) - ((ViewGroup.MarginLayoutParams) c0179m).rightMargin, (i7 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0179m).bottomMargin);
    }

    public static int g(int i4, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i5, i6) : size : Math.min(size, Math.max(i5, i6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.AbstractC0178L.w(boolean, int, int, int, int):int");
    }

    public static int y(View view) {
        return view.getBottom() + ((C0179M) view.getLayoutParams()).f3198b.bottom;
    }

    public static void z(Rect rect, View view) {
        int[] iArr = RecyclerView.J0;
        C0179M c0179m = (C0179M) view.getLayoutParams();
        Rect rect2 = c0179m.f3198b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0179m).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0179m).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0179m).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0179m).bottomMargin);
    }

    public final int D() {
        RecyclerView recyclerView = this.f3185b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f3185b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.f3185b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int G() {
        RecyclerView recyclerView = this.f3185b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(C0185T c0185t, Z z4) {
        RecyclerView recyclerView = this.f3185b;
        if (recyclerView == null || recyclerView.f3091z == null || !e()) {
            return 1;
        }
        return this.f3185b.f3091z.a();
    }

    public final void K(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((C0179M) view.getLayoutParams()).f3198b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f3185b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f3185b.y;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public void O(int i4) {
        RecyclerView recyclerView = this.f3185b;
        if (recyclerView != null) {
            int n4 = recyclerView.f3078s.n();
            for (int i5 = 0; i5 < n4; i5++) {
                recyclerView.f3078s.m(i5).offsetLeftAndRight(i4);
            }
        }
    }

    public void P(int i4) {
        RecyclerView recyclerView = this.f3185b;
        if (recyclerView != null) {
            int n4 = recyclerView.f3078s.n();
            for (int i5 = 0; i5 < n4; i5++) {
                recyclerView.f3078s.m(i5).offsetTopAndBottom(i4);
            }
        }
    }

    public abstract void Q(RecyclerView recyclerView);

    public abstract View R(View view, int i4, C0185T c0185t, Z z4);

    public void S(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f3185b;
        C0185T c0185t = recyclerView.f3072p;
        Z z4 = recyclerView.f3081t0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z5 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f3185b.canScrollVertically(-1) && !this.f3185b.canScrollHorizontally(-1) && !this.f3185b.canScrollHorizontally(1)) {
            z5 = false;
        }
        accessibilityEvent.setScrollable(z5);
        AbstractC0171E abstractC0171E = this.f3185b.f3091z;
        if (abstractC0171E != null) {
            accessibilityEvent.setItemCount(abstractC0171E.a());
        }
    }

    public final void T(View view, I.g gVar) {
        c0 J4 = RecyclerView.J(view);
        if (J4 == null || J4.i()) {
            return;
        }
        q2.e eVar = this.f3184a;
        if (((ArrayList) eVar.f14711r).contains(J4.f3244a)) {
            return;
        }
        RecyclerView recyclerView = this.f3185b;
        U(recyclerView.f3072p, recyclerView.f3081t0, view, gVar);
    }

    public void U(C0185T c0185t, Z z4, View view, I.g gVar) {
        gVar.j(D3.d.u(false, e() ? H(view) : 0, 1, d() ? H(view) : 0, 1));
    }

    public void V(int i4, int i5) {
    }

    public void W() {
    }

    public void X(int i4, int i5) {
    }

    public void Y(int i4, int i5) {
    }

    public void Z(int i4, int i5) {
    }

    public abstract void a0(C0185T c0185t, Z z4);

    public final void b(View view, int i4, boolean z4) {
        c0 J4 = RecyclerView.J(view);
        if (z4 || J4.i()) {
            r.i iVar = (r.i) this.f3185b.f3080t.f11914p;
            o0 o0Var = (o0) iVar.get(J4);
            if (o0Var == null) {
                o0Var = o0.a();
                iVar.put(J4, o0Var);
            }
            o0Var.f3375a |= 1;
        } else {
            this.f3185b.f3080t.t(J4);
        }
        C0179M c0179m = (C0179M) view.getLayoutParams();
        if (J4.q() || J4.j()) {
            if (J4.j()) {
                J4.f3255n.j(J4);
            } else {
                J4.f3251j &= -33;
            }
            this.f3184a.h(view, i4, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f3185b) {
                q2.e eVar = this.f3184a;
                N1.d dVar = (N1.d) eVar.f14710q;
                int indexOfChild = ((C0170D) eVar.f14709p).f3175a.indexOfChild(view);
                int f4 = (indexOfChild == -1 || dVar.h(indexOfChild)) ? -1 : indexOfChild - dVar.f(indexOfChild);
                if (i4 == -1) {
                    i4 = this.f3184a.n();
                }
                if (f4 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3185b.indexOfChild(view) + this.f3185b.z());
                }
                if (f4 != i4) {
                    AbstractC0178L abstractC0178L = this.f3185b.f3025A;
                    View u2 = abstractC0178L.u(f4);
                    if (u2 == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + f4 + abstractC0178L.f3185b.toString());
                    }
                    abstractC0178L.u(f4);
                    abstractC0178L.f3184a.k(f4);
                    C0179M c0179m2 = (C0179M) u2.getLayoutParams();
                    c0 J5 = RecyclerView.J(u2);
                    if (J5.i()) {
                        r.i iVar2 = (r.i) abstractC0178L.f3185b.f3080t.f11914p;
                        o0 o0Var2 = (o0) iVar2.get(J5);
                        if (o0Var2 == null) {
                            o0Var2 = o0.a();
                            iVar2.put(J5, o0Var2);
                        }
                        o0Var2.f3375a = 1 | o0Var2.f3375a;
                    } else {
                        abstractC0178L.f3185b.f3080t.t(J5);
                    }
                    abstractC0178L.f3184a.h(u2, i4, c0179m2, J5.i());
                }
            } else {
                this.f3184a.g(view, i4, false);
                c0179m.c = true;
                C0212y c0212y = this.f3186e;
                if (c0212y != null && c0212y.f3436e) {
                    c0212y.f3435b.getClass();
                    c0 J6 = RecyclerView.J(view);
                    if ((J6 != null ? J6.c() : -1) == c0212y.f3434a) {
                        c0212y.f3437f = view;
                    }
                }
            }
        }
        if (c0179m.d) {
            J4.f3244a.invalidate();
            c0179m.d = false;
        }
    }

    public abstract void b0(Z z4);

    public abstract void c(String str);

    public abstract void c0(Parcelable parcelable);

    public abstract boolean d();

    public abstract Parcelable d0();

    public abstract boolean e();

    public void e0(int i4) {
    }

    public boolean f(C0179M c0179m) {
        return c0179m != null;
    }

    public final void f0(C0185T c0185t) {
        for (int v4 = v() - 1; v4 >= 0; v4--) {
            if (!RecyclerView.J(u(v4)).p()) {
                View u2 = u(v4);
                i0(v4);
                c0185t.f(u2);
            }
        }
    }

    public final void g0(C0185T c0185t) {
        ArrayList arrayList = c0185t.f3203a;
        int size = arrayList.size();
        for (int i4 = size - 1; i4 >= 0; i4--) {
            View view = ((c0) arrayList.get(i4)).f3244a;
            c0 J4 = RecyclerView.J(view);
            if (!J4.p()) {
                J4.o(false);
                if (J4.k()) {
                    this.f3185b.removeDetachedView(view, false);
                }
                AbstractC0175I abstractC0175I = this.f3185b.f3057b0;
                if (abstractC0175I != null) {
                    abstractC0175I.d(J4);
                }
                J4.o(true);
                c0 J5 = RecyclerView.J(view);
                J5.f3255n = null;
                J5.f3256o = false;
                J5.f3251j &= -33;
                c0185t.g(J5);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = c0185t.f3204b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f3185b.invalidate();
        }
    }

    public abstract void h(int i4, int i5, Z z4, C0197j c0197j);

    public final void h0(View view, C0185T c0185t) {
        q2.e eVar = this.f3184a;
        C0170D c0170d = (C0170D) eVar.f14709p;
        int indexOfChild = c0170d.f3175a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((N1.d) eVar.f14710q).m(indexOfChild)) {
                eVar.A(view);
            }
            c0170d.a(indexOfChild);
        }
        c0185t.f(view);
    }

    public void i(int i4, C0197j c0197j) {
    }

    public final void i0(int i4) {
        if (u(i4) != null) {
            q2.e eVar = this.f3184a;
            int s4 = eVar.s(i4);
            C0170D c0170d = (C0170D) eVar.f14709p;
            View childAt = c0170d.f3175a.getChildAt(s4);
            if (childAt == null) {
                return;
            }
            if (((N1.d) eVar.f14710q).m(s4)) {
                eVar.A(childAt);
            }
            c0170d.a(s4);
        }
    }

    public abstract int j(Z z4);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00af, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.E()
            int r1 = r8.G()
            int r2 = r8.f3195n
            int r3 = r8.F()
            int r2 = r2 - r3
            int r3 = r8.f3196o
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            androidx.recyclerview.widget.RecyclerView r3 = r8.f3185b
            java.util.WeakHashMap r7 = H.A.f779a
            int r3 = r3.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L60
            if (r2 == 0) goto L5b
            goto L68
        L5b:
            int r2 = java.lang.Math.max(r6, r10)
            goto L68
        L60:
            if (r6 == 0) goto L63
            goto L67
        L63:
            int r6 = java.lang.Math.min(r4, r2)
        L67:
            r2 = r6
        L68:
            if (r1 == 0) goto L6b
            goto L6f
        L6b:
            int r1 = java.lang.Math.min(r5, r11)
        L6f:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb2
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L80
            goto Lb7
        L80:
            int r1 = r8.E()
            int r2 = r8.G()
            int r3 = r8.f3195n
            int r4 = r8.F()
            int r3 = r3 - r4
            int r4 = r8.f3196o
            int r5 = r8.D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f3185b
            android.graphics.Rect r5 = r5.f3086w
            z(r5, r13)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb7
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb7
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb7
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lb2
            goto Lb7
        Lb2:
            if (r11 != 0) goto Lb8
            if (r10 == 0) goto Lb7
            goto Lb8
        Lb7:
            return r0
        Lb8:
            if (r12 == 0) goto Lbe
            r9.scrollBy(r11, r10)
            return r7
        Lbe:
            r9.d0(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.AbstractC0178L.j0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int k(Z z4);

    public final void k0() {
        RecyclerView recyclerView = this.f3185b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int l(Z z4);

    public abstract int l0(int i4, C0185T c0185t, Z z4);

    public abstract int m(Z z4);

    public abstract void m0(int i4);

    public abstract int n(Z z4);

    public abstract int n0(int i4, C0185T c0185t, Z z4);

    public abstract int o(Z z4);

    public final void o0(RecyclerView recyclerView) {
        p0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void p(C0185T c0185t) {
        for (int v4 = v() - 1; v4 >= 0; v4--) {
            View u2 = u(v4);
            c0 J4 = RecyclerView.J(u2);
            if (!J4.p()) {
                if (!J4.g() || J4.i() || this.f3185b.f3091z.f3177b) {
                    u(v4);
                    this.f3184a.k(v4);
                    c0185t.h(u2);
                    this.f3185b.f3080t.t(J4);
                } else {
                    i0(v4);
                    c0185t.g(J4);
                }
            }
        }
    }

    public final void p0(int i4, int i5) {
        this.f3195n = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        this.f3193l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.J0;
        }
        this.f3196o = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i5);
        this.f3194m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.J0;
        }
    }

    public View q(int i4) {
        int v4 = v();
        for (int i5 = 0; i5 < v4; i5++) {
            View u2 = u(i5);
            c0 J4 = RecyclerView.J(u2);
            if (J4 != null && J4.c() == i4 && !J4.p() && (this.f3185b.f3081t0.f3220g || !J4.i())) {
                return u2;
            }
        }
        return null;
    }

    public void q0(Rect rect, int i4, int i5) {
        int F2 = F() + E() + rect.width();
        int D4 = D() + G() + rect.height();
        RecyclerView recyclerView = this.f3185b;
        WeakHashMap weakHashMap = H.A.f779a;
        this.f3185b.setMeasuredDimension(g(i4, F2, recyclerView.getMinimumWidth()), g(i5, D4, this.f3185b.getMinimumHeight()));
    }

    public abstract C0179M r();

    public final void r0(int i4, int i5) {
        int v4 = v();
        if (v4 == 0) {
            this.f3185b.n(i4, i5);
            return;
        }
        int i6 = Integer.MIN_VALUE;
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MIN_VALUE;
        int i9 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < v4; i10++) {
            View u2 = u(i10);
            Rect rect = this.f3185b.f3086w;
            z(rect, u2);
            int i11 = rect.left;
            if (i11 < i9) {
                i9 = i11;
            }
            int i12 = rect.right;
            if (i12 > i6) {
                i6 = i12;
            }
            int i13 = rect.top;
            if (i13 < i7) {
                i7 = i13;
            }
            int i14 = rect.bottom;
            if (i14 > i8) {
                i8 = i14;
            }
        }
        this.f3185b.f3086w.set(i9, i7, i6, i8);
        q0(this.f3185b.f3086w, i4, i5);
    }

    public C0179M s(Context context, AttributeSet attributeSet) {
        return new C0179M(context, attributeSet);
    }

    public final void s0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f3185b = null;
            this.f3184a = null;
            this.f3195n = 0;
            this.f3196o = 0;
        } else {
            this.f3185b = recyclerView;
            this.f3184a = recyclerView.f3078s;
            this.f3195n = recyclerView.getWidth();
            this.f3196o = recyclerView.getHeight();
        }
        this.f3193l = 1073741824;
        this.f3194m = 1073741824;
    }

    public C0179M t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0179M ? new C0179M((C0179M) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0179M((ViewGroup.MarginLayoutParams) layoutParams) : new C0179M(layoutParams);
    }

    public final boolean t0(View view, int i4, int i5, C0179M c0179m) {
        return (!view.isLayoutRequested() && this.f3189h && M(view.getWidth(), i4, ((ViewGroup.MarginLayoutParams) c0179m).width) && M(view.getHeight(), i5, ((ViewGroup.MarginLayoutParams) c0179m).height)) ? false : true;
    }

    public final View u(int i4) {
        q2.e eVar = this.f3184a;
        if (eVar != null) {
            return eVar.m(i4);
        }
        return null;
    }

    public boolean u0() {
        return false;
    }

    public final int v() {
        q2.e eVar = this.f3184a;
        if (eVar != null) {
            return eVar.n();
        }
        return 0;
    }

    public final boolean v0(View view, int i4, int i5, C0179M c0179m) {
        return (this.f3189h && M(view.getMeasuredWidth(), i4, ((ViewGroup.MarginLayoutParams) c0179m).width) && M(view.getMeasuredHeight(), i5, ((ViewGroup.MarginLayoutParams) c0179m).height)) ? false : true;
    }

    public abstract void w0(RecyclerView recyclerView, int i4);

    public int x(C0185T c0185t, Z z4) {
        RecyclerView recyclerView = this.f3185b;
        if (recyclerView == null || recyclerView.f3091z == null || !d()) {
            return 1;
        }
        return this.f3185b.f3091z.a();
    }

    public final void x0(C0212y c0212y) {
        C0212y c0212y2 = this.f3186e;
        if (c0212y2 != null && c0212y != c0212y2 && c0212y2.f3436e) {
            c0212y2.g();
        }
        this.f3186e = c0212y;
        RecyclerView recyclerView = this.f3185b;
        b0 b0Var = recyclerView.f3075q0;
        b0Var.f3239u.removeCallbacks(b0Var);
        b0Var.f3235q.abortAnimation();
        if (c0212y.f3439h) {
            Log.w("RecyclerView", "An instance of " + c0212y.getClass().getSimpleName() + " was started more than once. Each instance of" + c0212y.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c0212y.f3435b = recyclerView;
        c0212y.c = this;
        int i4 = c0212y.f3434a;
        if (i4 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f3081t0.f3216a = i4;
        c0212y.f3436e = true;
        c0212y.d = true;
        c0212y.f3437f = recyclerView.f3025A.q(i4);
        c0212y.f3435b.f3075q0.a();
        c0212y.f3439h = true;
    }

    public abstract boolean y0();
}
