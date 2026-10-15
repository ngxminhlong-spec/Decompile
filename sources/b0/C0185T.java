package b0;

import H.C0027b;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185T {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3203a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3204b;
    public final ArrayList c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public int f3205e;

    /* renamed from: f, reason: collision with root package name */
    public int f3206f;

    /* renamed from: g, reason: collision with root package name */
    public C0184S f3207g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3208h;

    public C0185T(RecyclerView recyclerView) {
        this.f3208h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f3203a = arrayList;
        this.f3204b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.f3205e = 2;
        this.f3206f = 2;
    }

    public final void a(c0 c0Var, boolean z4) {
        RecyclerView.j(c0Var);
        View view = c0Var.f3244a;
        RecyclerView recyclerView = this.f3208h;
        e0 e0Var = recyclerView.f3026A0;
        if (e0Var != null) {
            d0 d0Var = e0Var.f3268e;
            H.A.h(view, d0Var != null ? (C0027b) d0Var.f3264e.remove(view) : null);
        }
        if (z4) {
            AbstractC0171E abstractC0171E = recyclerView.f3091z;
            if (abstractC0171E != null) {
                abstractC0171E.h(c0Var);
            }
            if (recyclerView.f3081t0 != null) {
                recyclerView.f3080t.u(c0Var);
            }
        }
        c0Var.f3259r = null;
        C0184S c = c();
        c.getClass();
        int i4 = c0Var.f3247f;
        ArrayList arrayList = c.a(i4).f3199a;
        if (((C0183Q) c.f3201a.get(i4)).f3200b <= arrayList.size()) {
            return;
        }
        c0Var.n();
        arrayList.add(c0Var);
    }

    public final int b(int i4) {
        RecyclerView recyclerView = this.f3208h;
        if (i4 >= 0 && i4 < recyclerView.f3081t0.b()) {
            return !recyclerView.f3081t0.f3220g ? i4 : recyclerView.f3076r.h(i4, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i4 + ". State item count is " + recyclerView.f3081t0.b() + recyclerView.z());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, b0.S] */
    public final C0184S c() {
        if (this.f3207g == null) {
            ?? obj = new Object();
            obj.f3201a = new SparseArray();
            obj.f3202b = 0;
            this.f3207g = obj;
        }
        return this.f3207g;
    }

    public final void d() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.J0;
        C0197j c0197j = this.f3208h.f3079s0;
        int[] iArr2 = c0197j.f3325a;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c0197j.d = 0;
    }

    public final void e(int i4) {
        ArrayList arrayList = this.c;
        a((c0) arrayList.get(i4), true);
        arrayList.remove(i4);
    }

    public final void f(View view) {
        c0 J4 = RecyclerView.J(view);
        boolean k3 = J4.k();
        RecyclerView recyclerView = this.f3208h;
        if (k3) {
            recyclerView.removeDetachedView(view, false);
        }
        if (J4.j()) {
            J4.f3255n.j(J4);
        } else if (J4.q()) {
            J4.f3251j &= -33;
        }
        g(J4);
        if (recyclerView.f3057b0 == null || J4.h()) {
            return;
        }
        recyclerView.f3057b0.d(J4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(b0.c0 r12) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.C0185T.g(b0.c0):void");
    }

    public final void h(View view) {
        AbstractC0175I abstractC0175I;
        c0 J4 = RecyclerView.J(view);
        int i4 = J4.f3251j & 12;
        RecyclerView recyclerView = this.f3208h;
        if (i4 == 0 && J4.l() && (abstractC0175I = recyclerView.f3057b0) != null) {
            C0195h c0195h = (C0195h) abstractC0175I;
            if (J4.d().isEmpty() && c0195h.f3280g && !J4.g()) {
                if (this.f3204b == null) {
                    this.f3204b = new ArrayList();
                }
                J4.f3255n = this;
                J4.f3256o = true;
                this.f3204b.add(J4);
                return;
            }
        }
        if (J4.g() && !J4.i() && !recyclerView.f3091z.f3177b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.z());
        }
        J4.f3255n = this;
        J4.f3256o = false;
        this.f3203a.add(J4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x0431, code lost:
    
        if (r10.g() == false) goto L243;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0541 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0080  */
    /* JADX WARN: Type inference failed for: r6v37, types: [H.i, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b0.c0 i(int r28, long r29) {
        /*
            Method dump skipped, instructions count: 1385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.C0185T.i(int, long):b0.c0");
    }

    public final void j(c0 c0Var) {
        if (c0Var.f3256o) {
            this.f3204b.remove(c0Var);
        } else {
            this.f3203a.remove(c0Var);
        }
        c0Var.f3255n = null;
        c0Var.f3256o = false;
        c0Var.f3251j &= -33;
    }

    public final void k() {
        AbstractC0178L abstractC0178L = this.f3208h.f3025A;
        this.f3206f = this.f3205e + (abstractC0178L != null ? abstractC0178L.f3191j : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f3206f; size--) {
            e(size);
        }
    }
}
