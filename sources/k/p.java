package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import g.AbstractC1678a;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class p implements C.a {

    /* renamed from: A, reason: collision with root package name */
    public q f13453A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f13454B;

    /* renamed from: a, reason: collision with root package name */
    public final int f13456a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13457b;
    public final int c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f13458e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f13459f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f13460g;

    /* renamed from: h, reason: collision with root package name */
    public char f13461h;

    /* renamed from: j, reason: collision with root package name */
    public char f13463j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f13465l;

    /* renamed from: n, reason: collision with root package name */
    public final m f13467n;

    /* renamed from: o, reason: collision with root package name */
    public F f13468o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f13469p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f13470q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f13471r;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public View f13478z;

    /* renamed from: i, reason: collision with root package name */
    public int f13462i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f13464k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f13466m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f13472s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f13473t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13474u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13475v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13476w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f13477x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f13455C = false;

    public p(m mVar, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8) {
        this.f13467n = mVar;
        this.f13456a = i5;
        this.f13457b = i4;
        this.c = i6;
        this.d = i7;
        this.f13458e = charSequence;
        this.y = i8;
    }

    public static void c(StringBuilder sb, int i4, int i5, String str) {
        if ((i4 & i5) == i5) {
            sb.append(str);
        }
    }

    @Override // C.a
    public final q a() {
        return this.f13453A;
    }

    @Override // C.a
    public final C.a b(q qVar) {
        this.f13478z = null;
        this.f13453A = qVar;
        this.f13467n.p(true);
        q qVar2 = this.f13453A;
        if (qVar2 != null) {
            qVar2.f13480b = new o(0, this);
            qVar2.f13479a.setVisibilityListener(qVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.f13478z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f13454B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f13467n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f13476w && (this.f13474u || this.f13475v)) {
            drawable = drawable.mutate();
            if (this.f13474u) {
                drawable.setTintList(this.f13472s);
            }
            if (this.f13475v) {
                drawable.setTintMode(this.f13473t);
            }
            this.f13476w = false;
        }
        return drawable;
    }

    public final boolean e() {
        q qVar;
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.f13478z == null && (qVar = this.f13453A) != null) {
            this.f13478z = qVar.a(this);
        }
        return this.f13478z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f13454B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f13467n.f(this);
        }
        return false;
    }

    public final void f(boolean z4) {
        this.f13477x = (z4 ? 4 : 0) | (this.f13477x & (-5));
    }

    public final void g(boolean z4) {
        if (z4) {
            this.f13477x |= 32;
        } else {
            this.f13477x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f13478z;
        if (view != null) {
            return view;
        }
        q qVar = this.f13453A;
        if (qVar == null) {
            return null;
        }
        View a4 = qVar.a(this);
        this.f13478z = a4;
        return a4;
    }

    @Override // C.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f13464k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f13463j;
    }

    @Override // C.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f13470q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f13457b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f13465l;
        if (drawable != null) {
            return d(drawable);
        }
        int i4 = this.f13466m;
        if (i4 == 0) {
            return null;
        }
        Drawable a4 = AbstractC1678a.a(this.f13467n.f13426a, i4);
        this.f13466m = 0;
        this.f13465l = a4;
        return d(a4);
    }

    @Override // C.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f13472s;
    }

    @Override // C.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f13473t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f13460g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f13456a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // C.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f13462i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f13461h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f13468o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f13458e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13459f;
        return charSequence != null ? charSequence : this.f13458e;
    }

    @Override // C.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f13471r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f13468o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f13455C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f13477x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f13477x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f13477x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        q qVar = this.f13453A;
        return (qVar == null || !qVar.f13479a.overridesItemVisibility()) ? (this.f13477x & 8) == 0 : (this.f13477x & 8) == 0 && this.f13453A.f13479a.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i4) {
        int i5;
        m mVar = this.f13467n;
        Context context = mVar.f13426a;
        View inflate = LayoutInflater.from(context).inflate(i4, (ViewGroup) new LinearLayout(context), false);
        this.f13478z = inflate;
        this.f13453A = null;
        if (inflate != null && inflate.getId() == -1 && (i5 = this.f13456a) > 0) {
            inflate.setId(i5);
        }
        mVar.f13434k = true;
        mVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i4;
        this.f13478z = view;
        this.f13453A = null;
        if (view != null && view.getId() == -1 && (i4 = this.f13456a) > 0) {
            view.setId(i4);
        }
        m mVar = this.f13467n;
        mVar.f13434k = true;
        mVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f13463j == c) {
            return this;
        }
        this.f13463j = Character.toLowerCase(c);
        this.f13467n.p(false);
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i4) {
        if (this.f13463j == c && this.f13464k == i4) {
            return this;
        }
        this.f13463j = Character.toLowerCase(c);
        this.f13464k = KeyEvent.normalizeMetaState(i4);
        this.f13467n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        int i4 = this.f13477x;
        int i5 = (z4 ? 1 : 0) | (i4 & (-2));
        this.f13477x = i5;
        if (i4 != i5) {
            this.f13467n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        int i4 = this.f13477x;
        int i5 = i4 & 4;
        m mVar = this.f13467n;
        if (i5 == 0) {
            int i6 = (i4 & (-3)) | (z4 ? 2 : 0);
            this.f13477x = i6;
            if (i4 != i6) {
                mVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = mVar.f13429f;
        int size = arrayList.size();
        mVar.w();
        for (int i7 = 0; i7 < size; i7++) {
            p pVar = (p) arrayList.get(i7);
            if (pVar.f13457b == this.f13457b && (pVar.f13477x & 4) != 0 && pVar.isCheckable()) {
                boolean z5 = pVar == this;
                int i8 = pVar.f13477x;
                int i9 = (z5 ? 2 : 0) | (i8 & (-3));
                pVar.f13477x = i9;
                if (i8 != i9) {
                    pVar.f13467n.p(false);
                }
            }
        }
        mVar.v();
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final C.a setContentDescription(CharSequence charSequence) {
        this.f13470q = charSequence;
        this.f13467n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        if (z4) {
            this.f13477x |= 16;
        } else {
            this.f13477x &= -17;
        }
        this.f13467n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i4) {
        this.f13465l = null;
        this.f13466m = i4;
        this.f13476w = true;
        this.f13467n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f13466m = 0;
        this.f13465l = drawable;
        this.f13476w = true;
        this.f13467n.p(false);
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13472s = colorStateList;
        this.f13474u = true;
        this.f13476w = true;
        this.f13467n.p(false);
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13473t = mode;
        this.f13475v = true;
        this.f13476w = true;
        this.f13467n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f13460g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f13461h == c) {
            return this;
        }
        this.f13461h = c;
        this.f13467n.p(false);
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i4) {
        if (this.f13461h == c && this.f13462i == i4) {
            return this;
        }
        this.f13461h = c;
        this.f13462i = KeyEvent.normalizeMetaState(i4);
        this.f13467n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13454B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f13469p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f13461h = c;
        this.f13463j = Character.toLowerCase(c2);
        this.f13467n.p(false);
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i4, int i5) {
        this.f13461h = c;
        this.f13462i = KeyEvent.normalizeMetaState(i4);
        this.f13463j = Character.toLowerCase(c2);
        this.f13464k = KeyEvent.normalizeMetaState(i5);
        this.f13467n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i4) {
        int i5 = i4 & 3;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.y = i4;
        m mVar = this.f13467n;
        mVar.f13434k = true;
        mVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i4) {
        setTitle(this.f13467n.f13426a.getString(i4));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f13458e = charSequence;
        this.f13467n.p(false);
        F f4 = this.f13468o;
        if (f4 != null) {
            f4.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13459f = charSequence;
        this.f13467n.p(false);
        return this;
    }

    @Override // C.a, android.view.MenuItem
    public final C.a setTooltipText(CharSequence charSequence) {
        this.f13471r = charSequence;
        this.f13467n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        int i4 = this.f13477x;
        int i5 = (z4 ? 0 : 8) | (i4 & (-9));
        this.f13477x = i5;
        if (i4 != i5) {
            m mVar = this.f13467n;
            mVar.f13431h = true;
            mVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f13458e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
