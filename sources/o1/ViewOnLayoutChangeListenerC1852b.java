package o1;

import android.graphics.RectF;
import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.ui.CircuitExploreDialog;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1852b implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RectF f14247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BoardView f14248b;
    public final /* synthetic */ CircuitExploreDialog c;

    public ViewOnLayoutChangeListenerC1852b(CircuitExploreDialog circuitExploreDialog, RectF rectF, BoardView boardView) {
        this.c = circuitExploreDialog;
        this.f14247a = rectF;
        this.f14248b = boardView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r10 > 4.5f) goto L13;
     */
    @Override // android.view.View.OnLayoutChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayoutChange(android.view.View r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12) {
        /*
            r3 = this;
            int r7 = r7 - r5
            android.graphics.RectF r4 = r3.f14247a
            float r5 = r4.top
            float r9 = r4.bottom
            float r5 = r5 - r9
            if (r7 <= 0) goto L9c
            float r9 = r4.width()
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L9c
            int r9 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r9 <= 0) goto L9c
            com.duracodefactory.logiccircuitsimulatorpro.ui.CircuitExploreDialog r9 = r3.c
            android.view.View r9 = r9.f3591u
            int r9 = r9.getMeasuredHeight()
            int r8 = r8 - r6
            int r8 = r8 - r9
            float r6 = (float) r7
            r7 = 1065017672(0x3f7ae148, float:0.98)
            float r7 = r7 * r6
            float r10 = r4.width()
            float r10 = r7 / r10
            float r11 = (float) r8
            r12 = 1064682127(0x3f75c28f, float:0.96)
            float r12 = r12 * r11
            float r0 = r5 * r10
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 <= 0) goto L39
            float r10 = r12 / r5
        L39:
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r10 = r10 / r0
            r1 = 1050253722(0x3e99999a, float:0.3)
            int r2 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r2 >= 0) goto L46
        L44:
            r10 = r1
            goto L4d
        L46:
            r1 = 1083179008(0x40900000, float:4.5)
            int r2 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r2 <= 0) goto L4d
            goto L44
        L4d:
            com.duracodefactory.logiccircuitsimulatorpro.view.BoardView r1 = r3.f14248b
            r1.setScale(r10)
            float r2 = r4.left
            r1.setScrollXModel(r2)
            float r2 = r4.top
            r1.setScrollYModel(r2)
            int r8 = -r8
            int r8 = r8 - r9
            r9 = 0
            r1.scrollBy(r9, r8)
            r8 = 1017370378(0x3ca3d70a, float:0.02)
            float r6 = r6 * r8
            int r6 = (int) r6
            int r6 = -r6
            r8 = 1025758986(0x3d23d70a, float:0.04)
            float r11 = r11 * r8
            int r8 = (int) r11
            r1.scrollBy(r6, r8)
            float r6 = r4.width()
            float r6 = r6 * r10
            float r6 = r6 * r0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            r8 = 1073741824(0x40000000, float:2.0)
            if (r6 >= 0) goto L8a
            float r6 = r10 * r0
            float r4 = r4.width()
            float r4 = r4 * r6
            float r7 = r7 - r4
            float r7 = r7 / r8
            int r4 = (int) r7
            int r4 = -r4
            r1.scrollBy(r4, r9)
        L8a:
            float r4 = r10 * r5
            float r4 = r4 * r0
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 >= 0) goto L99
            float r10 = r10 * r0
            float r10 = r10 * r5
            float r12 = r12 - r10
            float r12 = r12 / r8
            int r4 = (int) r12
            r1.scrollBy(r9, r4)
        L99:
            r1.removeOnLayoutChangeListener(r3)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.ViewOnLayoutChangeListenerC1852b.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }
}
