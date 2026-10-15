package k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.C1763e;
import l.C1765f;
import l.C1769h;
import l.C1773j;
import l.Y;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1745b extends Y {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f13382x = 0;
    public final /* synthetic */ View y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.y = actionMenuItemView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745b(C1769h c1769h, C1769h c1769h2) {
        super(c1769h2);
        this.y = c1769h;
    }

    @Override // l.Y
    public final InterfaceC1743D b() {
        C1763e c1763e;
        switch (this.f13382x) {
            case 0:
                AbstractC1746c abstractC1746c = ((ActionMenuItemView) this.y).f2459x;
                if (abstractC1746c == null || (c1763e = ((C1765f) abstractC1746c).f13752a.f13773I) == null) {
                    return null;
                }
                return c1763e.a();
            default:
                C1763e c1763e2 = ((C1769h) this.y).f13760q.f13772H;
                if (c1763e2 == null) {
                    return null;
                }
                return c1763e2.a();
        }
    }

    @Override // l.Y
    public final boolean c() {
        InterfaceC1743D b4;
        switch (this.f13382x) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.y;
                l lVar = actionMenuItemView.f2457v;
                return lVar != null && lVar.a(actionMenuItemView.f2454s) && (b4 = b()) != null && b4.b();
            default:
                ((C1769h) this.y).f13760q.n();
                return true;
        }
    }

    @Override // l.Y
    public boolean e() {
        switch (this.f13382x) {
            case 1:
                C1773j c1773j = ((C1769h) this.y).f13760q;
                if (c1773j.f13774J != null) {
                    return false;
                }
                c1773j.e();
                return true;
            default:
                return super.e();
        }
    }
}
