package P2;

import C0.ViewOnClickListenerC0022w;
import H.A;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import b0.AbstractC0171E;
import b0.c0;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.material.internal.NavigationMenuItemView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.F;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h extends AbstractC0171E {
    public final ArrayList c = new ArrayList();
    public k.p d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f1574f;

    public h(p pVar) {
        this.f1574f = pVar;
        i();
    }

    @Override // b0.AbstractC0171E
    public final int a() {
        return this.c.size();
    }

    @Override // b0.AbstractC0171E
    public final long b(int i4) {
        return i4;
    }

    @Override // b0.AbstractC0171E
    public final int c(int i4) {
        j jVar = (j) this.c.get(i4);
        if (jVar instanceof k) {
            return 2;
        }
        if (jVar instanceof i) {
            return 3;
        }
        if (jVar instanceof l) {
            return ((l) jVar).f1577a.hasSubMenu() ? 1 : 0;
        }
        throw new RuntimeException("Unknown item type.");
    }

    @Override // b0.AbstractC0171E
    public final void f(c0 c0Var, int i4) {
        View view = ((o) c0Var).f3244a;
        int c = c(i4);
        ArrayList arrayList = this.c;
        if (c != 0) {
            if (c == 1) {
                ((TextView) view).setText(((l) arrayList.get(i4)).f1577a.f13458e);
                return;
            } else {
                if (c != 2) {
                    return;
                }
                k kVar = (k) arrayList.get(i4);
                view.setPadding(0, kVar.f1575a, 0, kVar.f1576b);
                return;
            }
        }
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
        p pVar = this.f1574f;
        navigationMenuItemView.setIconTintList(pVar.f1598x);
        if (pVar.f1596v) {
            navigationMenuItemView.setTextAppearance(pVar.f1595u);
        }
        ColorStateList colorStateList = pVar.f1597w;
        if (colorStateList != null) {
            navigationMenuItemView.setTextColor(colorStateList);
        }
        Drawable drawable = pVar.y;
        Drawable newDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
        WeakHashMap weakHashMap = A.f779a;
        navigationMenuItemView.setBackground(newDrawable);
        l lVar = (l) arrayList.get(i4);
        navigationMenuItemView.setNeedsEmptyIcon(lVar.f1578b);
        navigationMenuItemView.setHorizontalPadding(pVar.f1599z);
        navigationMenuItemView.setIconPadding(pVar.f1580A);
        if (pVar.f1582C) {
            navigationMenuItemView.setIconSize(pVar.f1581B);
        }
        navigationMenuItemView.setMaxLines(pVar.f1584E);
        navigationMenuItemView.b(lVar.f1577a);
    }

    @Override // b0.AbstractC0171E
    public final c0 g(ViewGroup viewGroup, int i4) {
        p pVar = this.f1574f;
        if (i4 == 0) {
            LayoutInflater layoutInflater = pVar.f1594t;
            ViewOnClickListenerC0022w viewOnClickListenerC0022w = pVar.f1588I;
            View inflate = layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false);
            c0 c0Var = new c0(inflate);
            inflate.setOnClickListener(viewOnClickListenerC0022w);
            return c0Var;
        }
        if (i4 == 1) {
            return new c0(pVar.f1594t.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
        if (i4 == 2) {
            return new c0(pVar.f1594t.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
        if (i4 != 3) {
            return null;
        }
        return new c0(pVar.f1590p);
    }

    @Override // b0.AbstractC0171E
    public final void h(c0 c0Var) {
        o oVar = (o) c0Var;
        if (oVar instanceof n) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) oVar.f3244a;
            FrameLayout frameLayout = navigationMenuItemView.N;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.f12444M.setCompoundDrawables(null, null, null, null);
        }
    }

    public final void i() {
        boolean z4;
        if (this.f1573e) {
            return;
        }
        this.f1573e = true;
        ArrayList arrayList = this.c;
        arrayList.clear();
        arrayList.add(new Object());
        p pVar = this.f1574f;
        int size = pVar.f1591q.l().size();
        boolean z5 = false;
        int i4 = -1;
        int i5 = 0;
        boolean z6 = false;
        int i6 = 0;
        while (i5 < size) {
            k.p pVar2 = (k.p) pVar.f1591q.l().get(i5);
            if (pVar2.isChecked()) {
                j(pVar2);
            }
            if (pVar2.isCheckable()) {
                pVar2.f(z5);
            }
            if (pVar2.hasSubMenu()) {
                F f4 = pVar2.f13468o;
                if (f4.hasVisibleItems()) {
                    if (i5 != 0) {
                        arrayList.add(new k(pVar.f1586G, z5 ? 1 : 0));
                    }
                    arrayList.add(new l(pVar2));
                    int size2 = f4.f13429f.size();
                    int i7 = z5 ? 1 : 0;
                    int i8 = i7;
                    while (i7 < size2) {
                        k.p pVar3 = (k.p) f4.getItem(i7);
                        if (pVar3.isVisible()) {
                            if (i8 == 0 && pVar3.getIcon() != null) {
                                i8 = 1;
                            }
                            if (pVar3.isCheckable()) {
                                pVar3.f(z5);
                            }
                            if (pVar2.isChecked()) {
                                j(pVar2);
                            }
                            arrayList.add(new l(pVar3));
                        }
                        i7++;
                        z5 = false;
                    }
                    if (i8 != 0) {
                        int size3 = arrayList.size();
                        for (int size4 = arrayList.size(); size4 < size3; size4++) {
                            ((l) arrayList.get(size4)).f1578b = true;
                        }
                    }
                }
                z4 = true;
            } else {
                int i9 = pVar2.f13457b;
                if (i9 != i4) {
                    i6 = arrayList.size();
                    z6 = pVar2.getIcon() != null;
                    if (i5 != 0) {
                        i6++;
                        int i10 = pVar.f1586G;
                        arrayList.add(new k(i10, i10));
                    }
                } else if (!z6 && pVar2.getIcon() != null) {
                    int size5 = arrayList.size();
                    for (int i11 = i6; i11 < size5; i11++) {
                        ((l) arrayList.get(i11)).f1578b = true;
                    }
                    z4 = true;
                    z6 = true;
                    l lVar = new l(pVar2);
                    lVar.f1578b = z6;
                    arrayList.add(lVar);
                    i4 = i9;
                }
                z4 = true;
                l lVar2 = new l(pVar2);
                lVar2.f1578b = z6;
                arrayList.add(lVar2);
                i4 = i9;
            }
            i5++;
            z5 = false;
        }
        this.f1573e = z5 ? 1 : 0;
    }

    public final void j(k.p pVar) {
        if (this.d == pVar || !pVar.isCheckable()) {
            return;
        }
        k.p pVar2 = this.d;
        if (pVar2 != null) {
            pVar2.setChecked(false);
        }
        this.d = pVar;
        pVar.setChecked(true);
    }
}
