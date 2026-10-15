package b0;

import android.view.View;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213z extends AbstractC0180N {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f3448a;

    /* renamed from: b, reason: collision with root package name */
    public Scroller f3449b;
    public final f0 c = new f0(this);
    public C0167A d;

    /* renamed from: e, reason: collision with root package name */
    public C0167A f3450e;

    public static View c(AbstractC0178L abstractC0178L, C0167A c0167a) {
        int v4 = abstractC0178L.v();
        View view = null;
        if (v4 == 0) {
            return null;
        }
        int k3 = (c0167a.k() / 2) + c0167a.j();
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < v4; i5++) {
            View u2 = abstractC0178L.u(i5);
            int abs = Math.abs(((c0167a.c(u2) / 2) + c0167a.e(u2)) - k3);
            if (abs < i4) {
                view = u2;
                i4 = abs;
            }
        }
        return view;
    }

    public final int[] a(AbstractC0178L abstractC0178L, View view) {
        int[] iArr = new int[2];
        if (abstractC0178L.d()) {
            C0167A d = d(abstractC0178L);
            iArr[0] = ((d.c(view) / 2) + d.e(view)) - ((d.k() / 2) + d.j());
        } else {
            iArr[0] = 0;
        }
        if (!abstractC0178L.e()) {
            iArr[1] = 0;
            return iArr;
        }
        C0167A e4 = e(abstractC0178L);
        iArr[1] = ((e4.c(view) / 2) + e4.e(view)) - ((e4.k() / 2) + e4.j());
        return iArr;
    }

    public final int b(AbstractC0178L abstractC0178L, C0167A c0167a, int i4, int i5) {
        this.f3449b.fling(0, 0, i4, i5, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.f3449b.getFinalX(), this.f3449b.getFinalY()};
        int v4 = abstractC0178L.v();
        float f4 = 1.0f;
        if (v4 != 0) {
            View view = null;
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i8 = 0; i8 < v4; i8++) {
                View u2 = abstractC0178L.u(i8);
                int H3 = AbstractC0178L.H(u2);
                if (H3 != -1) {
                    if (H3 < i7) {
                        view = u2;
                        i7 = H3;
                    }
                    if (H3 > i6) {
                        view2 = u2;
                        i6 = H3;
                    }
                }
            }
            if (view != null && view2 != null) {
                int max = Math.max(c0167a.b(view), c0167a.b(view2)) - Math.min(c0167a.e(view), c0167a.e(view2));
                if (max != 0) {
                    f4 = (max * 1.0f) / ((i6 - i7) + 1);
                }
            }
        }
        if (f4 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f4);
    }

    public final C0167A d(AbstractC0178L abstractC0178L) {
        C0167A c0167a = this.f3450e;
        if (c0167a == null || c0167a.f3170a != abstractC0178L) {
            this.f3450e = new C0167A(abstractC0178L, 0);
        }
        return this.f3450e;
    }

    public final C0167A e(AbstractC0178L abstractC0178L) {
        C0167A c0167a = this.d;
        if (c0167a == null || c0167a.f3170a != abstractC0178L) {
            this.d = new C0167A(abstractC0178L, 1);
        }
        return this.d;
    }

    public final void f() {
        AbstractC0178L layoutManager;
        RecyclerView recyclerView = this.f3448a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View c = layoutManager.e() ? c(layoutManager, e(layoutManager)) : layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        if (c == null) {
            return;
        }
        int[] a4 = a(layoutManager, c);
        int i4 = a4[0];
        if (i4 == 0 && a4[1] == 0) {
            return;
        }
        this.f3448a.d0(i4, a4[1], false);
    }
}
