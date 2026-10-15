package b0;

import H.C0034i;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0169C {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3174a;

    public /* synthetic */ C0169C(RecyclerView recyclerView) {
        this.f3174a = recyclerView;
    }

    public void a(C0188a c0188a) {
        int i4 = c0188a.f3228a;
        RecyclerView recyclerView = this.f3174a;
        if (i4 == 1) {
            recyclerView.f3025A.V(c0188a.f3229b, c0188a.d);
            return;
        }
        if (i4 == 2) {
            recyclerView.f3025A.Y(c0188a.f3229b, c0188a.d);
        } else if (i4 == 4) {
            recyclerView.f3025A.Z(c0188a.f3229b, c0188a.d);
        } else {
            if (i4 != 8) {
                return;
            }
            recyclerView.f3025A.X(c0188a.f3229b, c0188a.d);
        }
    }

    public c0 b(int i4) {
        RecyclerView recyclerView = this.f3174a;
        int u2 = recyclerView.f3078s.u();
        int i5 = 0;
        c0 c0Var = null;
        while (true) {
            if (i5 >= u2) {
                break;
            }
            c0 J4 = RecyclerView.J(recyclerView.f3078s.t(i5));
            if (J4 != null && !J4.i() && J4.c == i4) {
                if (!((ArrayList) recyclerView.f3078s.f14711r).contains(J4.f3244a)) {
                    c0Var = J4;
                    break;
                }
                c0Var = J4;
            }
            i5++;
        }
        if (c0Var != null) {
            if (!((ArrayList) recyclerView.f3078s.f14711r).contains(c0Var.f3244a)) {
                return c0Var;
            }
        }
        return null;
    }

    public void c(int i4, int i5, Object obj) {
        int i6;
        int i7;
        RecyclerView recyclerView = this.f3174a;
        int u2 = recyclerView.f3078s.u();
        int i8 = i5 + i4;
        for (int i9 = 0; i9 < u2; i9++) {
            View t4 = recyclerView.f3078s.t(i9);
            c0 J4 = RecyclerView.J(t4);
            if (J4 != null && !J4.p() && (i7 = J4.c) >= i4 && i7 < i8) {
                J4.a(2);
                if (obj == null) {
                    J4.a(1024);
                } else if ((1024 & J4.f3251j) == 0) {
                    if (J4.f3252k == null) {
                        ArrayList arrayList = new ArrayList();
                        J4.f3252k = arrayList;
                        J4.f3253l = Collections.unmodifiableList(arrayList);
                    }
                    J4.f3252k.add(obj);
                }
                ((C0179M) t4.getLayoutParams()).c = true;
            }
        }
        C0185T c0185t = recyclerView.f3072p;
        ArrayList arrayList2 = c0185t.c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c0 c0Var = (c0) arrayList2.get(size);
            if (c0Var != null && (i6 = c0Var.c) >= i4 && i6 < i8) {
                c0Var.a(2);
                c0185t.e(size);
            }
        }
        recyclerView.f3089x0 = true;
    }

    public void d(int i4, int i5) {
        RecyclerView recyclerView = this.f3174a;
        int u2 = recyclerView.f3078s.u();
        for (int i6 = 0; i6 < u2; i6++) {
            c0 J4 = RecyclerView.J(recyclerView.f3078s.t(i6));
            if (J4 != null && !J4.p() && J4.c >= i4) {
                J4.m(i5, false);
                recyclerView.f3081t0.f3219f = true;
            }
        }
        ArrayList arrayList = recyclerView.f3072p.c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            c0 c0Var = (c0) arrayList.get(i7);
            if (c0Var != null && c0Var.c >= i4) {
                c0Var.m(i5, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f3087w0 = true;
    }

    public void e(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        RecyclerView recyclerView = this.f3174a;
        int u2 = recyclerView.f3078s.u();
        int i13 = -1;
        if (i4 < i5) {
            i7 = i4;
            i6 = i5;
            i8 = -1;
        } else {
            i6 = i4;
            i7 = i5;
            i8 = 1;
        }
        for (int i14 = 0; i14 < u2; i14++) {
            c0 J4 = RecyclerView.J(recyclerView.f3078s.t(i14));
            if (J4 != null && (i12 = J4.c) >= i7 && i12 <= i6) {
                if (i12 == i4) {
                    J4.m(i5 - i4, false);
                } else {
                    J4.m(i8, false);
                }
                recyclerView.f3081t0.f3219f = true;
            }
        }
        ArrayList arrayList = recyclerView.f3072p.c;
        if (i4 < i5) {
            i10 = i4;
            i9 = i5;
        } else {
            i9 = i4;
            i10 = i5;
            i13 = 1;
        }
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            c0 c0Var = (c0) arrayList.get(i15);
            if (c0Var != null && (i11 = c0Var.c) >= i10 && i11 <= i9) {
                if (i11 == i4) {
                    c0Var.m(i5 - i4, false);
                } else {
                    c0Var.m(i13, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f3087w0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(b0.c0 r9, H.C0034i r10, H.C0034i r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f3174a
            r0.getClass()
            r1 = 0
            r9.o(r1)
            b0.I r1 = r0.f3057b0
            r2 = r1
            b0.h r2 = (b0.C0195h) r2
            if (r10 == 0) goto L20
            r2.getClass()
            int r4 = r10.f824a
            int r6 = r11.f824a
            if (r4 != r6) goto L22
            int r1 = r10.f825b
            int r3 = r11.f825b
            if (r1 == r3) goto L20
            goto L22
        L20:
            r3 = r9
            goto L2c
        L22:
            int r5 = r10.f825b
            int r7 = r11.f825b
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            goto L3b
        L2c:
            r2.l(r3)
            android.view.View r9 = r3.f3244a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r2.f3282i
            r9.add(r3)
            r9 = 1
        L3b:
            if (r9 == 0) goto L40
            r0.T()
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.C0169C.f(b0.c0, H.i, H.i):void");
    }

    public void g(c0 c0Var, C0034i c0034i, C0034i c0034i2) {
        boolean z4;
        RecyclerView recyclerView = this.f3174a;
        recyclerView.f3072p.j(c0Var);
        recyclerView.f(c0Var);
        c0Var.o(false);
        C0195h c0195h = (C0195h) recyclerView.f3057b0;
        c0195h.getClass();
        int i4 = c0034i.f824a;
        int i5 = c0034i.f825b;
        View view = c0Var.f3244a;
        int left = c0034i2 == null ? view.getLeft() : c0034i2.f824a;
        int top = c0034i2 == null ? view.getTop() : c0034i2.f825b;
        if (c0Var.i() || (i4 == left && i5 == top)) {
            c0195h.l(c0Var);
            c0195h.f3281h.add(c0Var);
            z4 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z4 = c0195h.g(c0Var, i4, i5, left, top);
        }
        if (z4) {
            recyclerView.T();
        }
    }
}
