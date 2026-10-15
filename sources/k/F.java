package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class F extends m implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final p f13366A;

    /* renamed from: z, reason: collision with root package name */
    public final m f13367z;

    public F(Context context, m mVar, p pVar) {
        super(context);
        this.f13367z = mVar;
        this.f13366A = pVar;
    }

    @Override // k.m
    public final boolean d(p pVar) {
        return this.f13367z.d(pVar);
    }

    @Override // k.m
    public final boolean e(m mVar, MenuItem menuItem) {
        return super.e(mVar, menuItem) || this.f13367z.e(mVar, menuItem);
    }

    @Override // k.m
    public final boolean f(p pVar) {
        return this.f13367z.f(pVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f13366A;
    }

    @Override // k.m
    public final String j() {
        p pVar = this.f13366A;
        int i4 = pVar != null ? pVar.f13456a : 0;
        if (i4 == 0) {
            return null;
        }
        return U.a.i("android:menu:actionviewstates:", i4);
    }

    @Override // k.m
    public final m k() {
        return this.f13367z.k();
    }

    @Override // k.m
    public final boolean m() {
        return this.f13367z.m();
    }

    @Override // k.m
    public final boolean n() {
        return this.f13367z.n();
    }

    @Override // k.m
    public final boolean o() {
        return this.f13367z.o();
    }

    @Override // k.m, android.view.Menu
    public final void setGroupDividerEnabled(boolean z4) {
        this.f13367z.setGroupDividerEnabled(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i4) {
        u(0, null, i4, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i4) {
        u(i4, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i4) {
        this.f13366A.setIcon(i4);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f13366A.setIcon(drawable);
        return this;
    }

    @Override // k.m, android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.f13367z.setQwertyMode(z4);
    }
}
