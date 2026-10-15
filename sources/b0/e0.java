package b0;

import H.C0027b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class e0 extends C0027b {
    public final RecyclerView d;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f3268e;

    public e0(RecyclerView recyclerView) {
        this.d = recyclerView;
        d0 d0Var = this.f3268e;
        if (d0Var != null) {
            this.f3268e = d0Var;
        } else {
            this.f3268e = new d0(this);
        }
    }

    @Override // H.C0027b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.L()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().S(accessibilityEvent);
        }
    }

    @Override // H.C0027b
    public void d(View view, I.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f918a;
        this.f812a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.d;
        if (recyclerView.L() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0178L layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f3185b;
        C0185T c0185t = recyclerView2.f3072p;
        Z z4 = recyclerView2.f3081t0;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f3185b.canScrollHorizontally(-1)) {
            gVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f3185b.canScrollVertically(1) || layoutManager.f3185b.canScrollHorizontally(1)) {
            gVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.J(c0185t, z4), layoutManager.x(c0185t, z4), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[ADDED_TO_REGION] */
    @Override // H.C0027b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.g(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L8
            return r6
        L8:
            androidx.recyclerview.widget.RecyclerView r4 = r3.d
            boolean r0 = r4.L()
            r1 = 0
            if (r0 != 0) goto L8c
            b0.L r0 = r4.getLayoutManager()
            if (r0 == 0) goto L8c
            b0.L r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.f3185b
            b0.T r2 = r0.f3072p
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 == r2) goto L58
            r2 = 8192(0x2000, float:1.148E-41)
            if (r5 == r2) goto L2a
            r5 = r1
            r0 = r5
            goto L81
        L2a:
            r5 = -1
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 == 0) goto L3f
            int r0 = r4.f3196o
            int r2 = r4.G()
            int r0 = r0 - r2
            int r2 = r4.D()
            int r0 = r0 - r2
            int r0 = -r0
            goto L40
        L3f:
            r0 = r1
        L40:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f3185b
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L56
            int r5 = r4.f3195n
            int r2 = r4.E()
            int r5 = r5 - r2
            int r2 = r4.F()
            int r5 = r5 - r2
            int r5 = -r5
            goto L81
        L56:
            r5 = r1
            goto L81
        L58:
            boolean r5 = r0.canScrollVertically(r6)
            if (r5 == 0) goto L6c
            int r5 = r4.f3196o
            int r0 = r4.G()
            int r5 = r5 - r0
            int r0 = r4.D()
            int r5 = r5 - r0
            r0 = r5
            goto L6d
        L6c:
            r0 = r1
        L6d:
            androidx.recyclerview.widget.RecyclerView r5 = r4.f3185b
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L56
            int r5 = r4.f3195n
            int r2 = r4.E()
            int r5 = r5 - r2
            int r2 = r4.F()
            int r5 = r5 - r2
        L81:
            if (r0 != 0) goto L86
            if (r5 != 0) goto L86
            goto L8c
        L86:
            androidx.recyclerview.widget.RecyclerView r4 = r4.f3185b
            r4.d0(r5, r0, r6)
            return r6
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.e0.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
