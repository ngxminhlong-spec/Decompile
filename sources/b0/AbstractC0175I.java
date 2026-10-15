package b0;

import H.C0034i;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0175I {

    /* renamed from: a, reason: collision with root package name */
    public C0170D f3178a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f3179b;
    public long c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public long f3180e;

    /* renamed from: f, reason: collision with root package name */
    public long f3181f;

    public static void b(c0 c0Var) {
        int i4 = c0Var.f3251j;
        if (!c0Var.g() && (i4 & 4) == 0) {
            c0Var.b();
        }
    }

    public abstract boolean a(c0 c0Var, c0 c0Var2, C0034i c0034i, C0034i c0034i2);

    public final void c(c0 c0Var) {
        C0170D c0170d = this.f3178a;
        if (c0170d != null) {
            RecyclerView recyclerView = c0170d.f3175a;
            boolean z4 = true;
            c0Var.o(true);
            View view = c0Var.f3244a;
            if (c0Var.f3249h != null && c0Var.f3250i == null) {
                c0Var.f3249h = null;
            }
            c0Var.f3250i = null;
            if ((c0Var.f3251j & 16) != 0) {
                return;
            }
            C0185T c0185t = recyclerView.f3072p;
            recyclerView.e0();
            q2.e eVar = recyclerView.f3078s;
            N1.d dVar = (N1.d) eVar.f14710q;
            C0170D c0170d2 = (C0170D) eVar.f14709p;
            int indexOfChild = c0170d2.f3175a.indexOfChild(view);
            if (indexOfChild == -1) {
                eVar.A(view);
            } else if (dVar.h(indexOfChild)) {
                dVar.m(indexOfChild);
                eVar.A(view);
                c0170d2.a(indexOfChild);
            } else {
                z4 = false;
            }
            if (z4) {
                c0 J4 = RecyclerView.J(view);
                c0185t.j(J4);
                c0185t.g(J4);
            }
            recyclerView.f0(!z4);
            if (z4 || !c0Var.k()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(c0 c0Var);

    public abstract void e();

    public abstract boolean f();
}
