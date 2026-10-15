package P2;

import android.view.SubMenu;
import k.F;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f extends k.m {
    @Override // k.m, android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        k.p a4 = a(i4, i5, i6, charSequence);
        F f4 = new F(this.f13426a, this, a4);
        a4.f13468o = f4;
        f4.setHeaderTitle(a4.f13458e);
        return f4;
    }
}
