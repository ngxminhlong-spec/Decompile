package k;

import android.view.MenuItem;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class s implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f13482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f13483b;

    public s(u uVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13483b = uVar;
        this.f13482a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f13482a.onMenuItemActionCollapse(this.f13483b.f(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f13482a.onMenuItemActionExpand(this.f13483b.f(menuItem));
    }
}
