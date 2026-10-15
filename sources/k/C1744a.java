package k;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1744a implements C.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f13368a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f13369b;
    public Intent c;
    public char d;

    /* renamed from: e, reason: collision with root package name */
    public int f13370e;

    /* renamed from: f, reason: collision with root package name */
    public char f13371f;

    /* renamed from: g, reason: collision with root package name */
    public int f13372g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f13373h;

    /* renamed from: i, reason: collision with root package name */
    public Context f13374i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f13375j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f13376k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f13377l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f13378m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13379n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13380o;

    /* renamed from: p, reason: collision with root package name */
    public int f13381p;

    @Override // C.a
    public final q a() {
        return null;
    }

    @Override // C.a
    public final C.a b(q qVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f13373h;
        if (drawable != null) {
            if (this.f13379n || this.f13380o) {
                this.f13373h = drawable;
                Drawable mutate = drawable.mutate();
                this.f13373h = mutate;
                if (this.f13379n) {
                    mutate.setTintList(this.f13377l);
                }
                if (this.f13380o) {
                    this.f13373h.setTintMode(this.f13378m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // C.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f13372g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f13371f;
    }

    @Override // C.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f13375j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f13373h;
    }

    @Override // C.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f13377l;
    }

    @Override // C.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f13378m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // C.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f13370e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f13368a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13369b;
        return charSequence != null ? charSequence : this.f13368a;
    }

    @Override // C.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f13376k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f13381p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f13381p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f13381p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f13381p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f13371f = Character.toLowerCase(c);
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i4) {
        this.f13371f = Character.toLowerCase(c);
        this.f13372g = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        this.f13381p = (z4 ? 1 : 0) | (this.f13381p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        this.f13381p = (z4 ? 2 : 0) | (this.f13381p & (-3));
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final C.a setContentDescription(CharSequence charSequence) {
        this.f13375j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f13375j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        this.f13381p = (z4 ? 16 : 0) | (this.f13381p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i4) {
        this.f13373h = this.f13374i.getDrawable(i4);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f13373h = drawable;
        c();
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13377l = colorStateList;
        this.f13379n = true;
        c();
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13378m = mode;
        this.f13380o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.d = c;
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i4) {
        this.d = c;
        this.f13370e = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.d = c;
        this.f13371f = Character.toLowerCase(c2);
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i4, int i5) {
        this.d = c;
        this.f13370e = KeyEvent.normalizeMetaState(i4);
        this.f13371f = Character.toLowerCase(c2);
        this.f13372g = KeyEvent.normalizeMetaState(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i4) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i4) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i4) {
        this.f13368a = this.f13374i.getResources().getString(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f13368a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13369b = charSequence;
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final C.a setTooltipText(CharSequence charSequence) {
        this.f13376k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f13376k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        this.f13381p = (this.f13381p & 8) | (z4 ? 0 : 8);
        return this;
    }
}
