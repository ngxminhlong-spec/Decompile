package E2;

import H.A;
import W2.f;
import W2.g;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.C0326Qb;
import com.google.android.material.behavior.SwipeDismissBehavior;
import d3.AbstractC1654b;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends AbstractC1654b {

    /* renamed from: h, reason: collision with root package name */
    public int f716h;

    /* renamed from: i, reason: collision with root package name */
    public int f717i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f718j;

    public b(SwipeDismissBehavior swipeDismissBehavior) {
        this.f718j = swipeDismissBehavior;
    }

    @Override // d3.AbstractC1654b
    public final void J(View view, int i4) {
        this.f717i = i4;
        this.f716h = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // d3.AbstractC1654b
    public final void K(int i4) {
        g gVar = this.f718j.f12281b;
        if (gVar != null) {
            f fVar = gVar.f2031a.f2053m;
            if (i4 == 0) {
                C0326Qb.p().v(fVar);
            } else if (i4 == 1 || i4 == 2) {
                C0326Qb.p().u(fVar);
            }
        }
    }

    @Override // d3.AbstractC1654b
    public final void L(View view, int i4, int i5) {
        float f4 = this.f716h;
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f718j;
        float f5 = (width * swipeDismissBehavior.f12282e) + f4;
        float width2 = (view.getWidth() * swipeDismissBehavior.f12283f) + this.f716h;
        float f6 = i4;
        if (f6 <= f5) {
            view.setAlpha(1.0f);
        } else if (f6 >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f6 - f5) / (width2 - f5))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0050, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f716h) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // d3.AbstractC1654b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f717i = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f718j
            r4 = 1
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = H.A.f779a
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L1a
            r5 = r4
            goto L1b
        L1a:
            r5 = r2
        L1b:
            int r6 = r3.d
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto L5e
            goto L52
        L2a:
            if (r1 <= 0) goto L5e
            goto L52
        L2d:
            if (r6 != r4) goto L5e
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L5e
            goto L52
        L34:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto L5e
            goto L52
        L39:
            int r10 = r9.getLeft()
            int r0 = r8.f716h
            int r10 = r10 - r0
            int r0 = r9.getWidth()
            float r0 = (float) r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r10 = java.lang.Math.abs(r10)
            if (r10 < r0) goto L5e
        L52:
            int r10 = r9.getLeft()
            int r0 = r8.f716h
            if (r10 >= r0) goto L5c
            int r0 = r0 - r11
            goto L61
        L5c:
            int r0 = r0 + r11
            goto L61
        L5e:
            int r0 = r8.f716h
            r4 = r2
        L61:
            M.e r10 = r3.f12280a
            int r11 = r9.getTop()
            boolean r10 = r10.q(r0, r11)
            if (r10 == 0) goto L78
            C0.N r10 = new C0.N
            r10.<init>(r3, r9, r4)
            java.util.WeakHashMap r11 = H.A.f779a
            r9.postOnAnimation(r10)
            return
        L78:
            if (r4 == 0) goto L88
            W2.g r10 = r3.f12281b
            if (r10 == 0) goto L88
            r11 = 8
            r9.setVisibility(r11)
            W2.l r9 = r10.f2031a
            r9.a(r2)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E2.b.M(android.view.View, float, float):void");
    }

    @Override // d3.AbstractC1654b
    public final boolean Q(View view, int i4) {
        int i5 = this.f717i;
        return (i5 == -1 || i5 == i4) && this.f718j.r(view);
    }

    @Override // d3.AbstractC1654b
    public final int f(View view, int i4) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = A.f779a;
        boolean z4 = view.getLayoutDirection() == 1;
        int i5 = this.f718j.d;
        if (i5 == 0) {
            if (z4) {
                width = this.f716h - view.getWidth();
                width2 = this.f716h;
            } else {
                width = this.f716h;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i5 != 1) {
            width = this.f716h - view.getWidth();
            width2 = view.getWidth() + this.f716h;
        } else if (z4) {
            width = this.f716h;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f716h - view.getWidth();
            width2 = this.f716h;
        }
        return Math.min(Math.max(width, i4), width2);
    }

    @Override // d3.AbstractC1654b
    public final int g(View view, int i4) {
        return view.getTop();
    }

    @Override // d3.AbstractC1654b
    public final int z(View view) {
        return view.getWidth();
    }
}
