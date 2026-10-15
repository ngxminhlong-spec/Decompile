package s1;

import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: s1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1973c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BoardView f14765a;

    public /* synthetic */ C1973c(BoardView boardView) {
        this.f14765a = boardView;
    }

    public void a(boolean z4) {
        BoardView boardView = this.f14765a;
        C1972b c1972b = boardView.f3819c0;
        if (z4 != c1972b.f12955a) {
            c1972b.f12955a = z4;
            if (z4) {
                boardView.f3807M.a(c1972b);
            }
        }
    }
}
