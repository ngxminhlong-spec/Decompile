package k;

import android.view.MenuItem;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class t implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f13484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f13485b;

    public t(u uVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f13485b = uVar;
        this.f13484a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f13484a.onMenuItemClick(this.f13485b.f(menuItem));
    }
}
