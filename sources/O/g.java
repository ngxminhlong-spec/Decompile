package O;

import D0.o;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import d3.AbstractC1654b;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g extends AbstractC1654b {

    /* renamed from: h, reason: collision with root package name */
    public final int f1247h;

    /* renamed from: i, reason: collision with root package name */
    public M.e f1248i;

    /* renamed from: j, reason: collision with root package name */
    public final o f1249j = new o(4, this);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f1250k;

    public g(DrawerLayout drawerLayout, int i4) {
        this.f1250k = drawerLayout;
        this.f1247h = i4;
    }

    @Override // d3.AbstractC1654b
    public final void H(int i4, int i5) {
        int i6 = i4 & 1;
        DrawerLayout drawerLayout = this.f1250k;
        View f4 = i6 == 1 ? drawerLayout.f(3) : drawerLayout.f(5);
        if (f4 == null || drawerLayout.h(f4) != 0) {
            return;
        }
        this.f1248i.b(f4, i5);
    }

    @Override // d3.AbstractC1654b
    public final void I() {
        this.f1250k.postDelayed(this.f1249j, 160L);
    }

    @Override // d3.AbstractC1654b
    public final void J(View view, int i4) {
        ((d) view.getLayoutParams()).c = false;
        int i5 = this.f1247h == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.f1250k;
        View f4 = drawerLayout.f(i5);
        if (f4 != null) {
            drawerLayout.d(f4);
        }
    }

    @Override // d3.AbstractC1654b
    public final void K(int i4) {
        int i5;
        View rootView;
        View view = this.f1248i.f1137s;
        DrawerLayout drawerLayout = this.f1250k;
        int i6 = drawerLayout.f2737t.f1121a;
        int i7 = drawerLayout.f2738u.f1121a;
        if (i6 == 1 || i7 == 1) {
            i5 = 1;
        } else {
            i5 = 2;
            if (i6 != 2 && i7 != 2) {
                i5 = 0;
            }
        }
        if (view != null && i4 == 0) {
            float f4 = ((d) view.getLayoutParams()).f1241b;
            if (f4 == 0.0f) {
                d dVar = (d) view.getLayoutParams();
                if ((dVar.d & 1) == 1) {
                    dVar.d = 0;
                    ArrayList arrayList = drawerLayout.f2724G;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((c) drawerLayout.f2724G.get(size)).b();
                        }
                    }
                    drawerLayout.r(view, false);
                    if (drawerLayout.hasWindowFocus() && (rootView = drawerLayout.getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f4 == 1.0f) {
                d dVar2 = (d) view.getLayoutParams();
                if ((dVar2.d & 1) == 0) {
                    dVar2.d = 1;
                    ArrayList arrayList2 = drawerLayout.f2724G;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((c) drawerLayout.f2724G.get(size2)).getClass();
                        }
                    }
                    drawerLayout.r(view, true);
                    if (drawerLayout.hasWindowFocus()) {
                        drawerLayout.sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i5 != drawerLayout.f2741x) {
            drawerLayout.f2741x = i5;
            ArrayList arrayList3 = drawerLayout.f2724G;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((c) drawerLayout.f2724G.get(size3)).getClass();
                }
            }
        }
    }

    @Override // d3.AbstractC1654b
    public final void L(View view, int i4, int i5) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f1250k;
        float width2 = (drawerLayout.b(view, 3) ? i4 + width : drawerLayout.getWidth() - i4) / width;
        drawerLayout.q(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // d3.AbstractC1654b
    public final void M(View view, float f4, float f5) {
        int i4;
        int[] iArr = DrawerLayout.f2716P;
        float f6 = ((d) view.getLayoutParams()).f1241b;
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f1250k;
        if (drawerLayout.b(view, 3)) {
            i4 = (f4 > 0.0f || (f4 == 0.0f && f6 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f4 < 0.0f || (f4 == 0.0f && f6 > 0.5f)) {
                width2 -= width;
            }
            i4 = width2;
        }
        this.f1248i.q(i4, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // d3.AbstractC1654b
    public final boolean Q(View view, int i4) {
        if (!DrawerLayout.m(view)) {
            return false;
        }
        int i5 = this.f1247h;
        DrawerLayout drawerLayout = this.f1250k;
        return drawerLayout.b(view, i5) && drawerLayout.h(view) == 0;
    }

    @Override // d3.AbstractC1654b
    public final int f(View view, int i4) {
        DrawerLayout drawerLayout = this.f1250k;
        if (drawerLayout.b(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i4, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i4, width));
    }

    @Override // d3.AbstractC1654b
    public final int g(View view, int i4) {
        return view.getTop();
    }

    @Override // d3.AbstractC1654b
    public final int z(View view) {
        if (DrawerLayout.m(view)) {
            return view.getWidth();
        }
        return 0;
    }
}
