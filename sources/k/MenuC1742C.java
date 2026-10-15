package k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.google.android.gms.internal.ads.AbstractC0287Ic;
import java.util.Iterator;
import r.C1964a;
import r.C1965b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: k.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC1742C extends AbstractC0287Ic implements Menu {
    public final m c;

    public MenuC1742C(Context context, m mVar) {
        super(context);
        if (mVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.c = mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4) {
        return f(this.c.add(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i6, int i7) {
        return f(this.c.add(i4, i5, i6, i7));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return f(this.c.a(i4, i5, i6, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return f(this.c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.c.addIntentOptions(i4, i5, i6, componentName, intentArr, intent, i7, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i8 = 0; i8 < length; i8++) {
                menuItemArr[i8] = f(menuItemArr2[i8]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4) {
        return this.c.addSubMenu(i4);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return this.c.addSubMenu(i4, i5, i6, i7);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        return this.c.addSubMenu(i4, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        r.e eVar = (r.e) this.f5575b;
        if (eVar != null) {
            eVar.clear();
        }
        this.c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i4) {
        return f(this.c.findItem(i4));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i4) {
        return f(this.c.getItem(i4));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return this.c.isShortcutKey(i4, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i4, int i5) {
        return this.c.performIdentifierAction(i4, i5);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        return this.c.performShortcut(i4, keyEvent, i5);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i4) {
        r.e eVar = (r.e) this.f5575b;
        if (eVar != null) {
            Iterator it = ((C1965b) eVar.keySet()).iterator();
            while (true) {
                C1964a c1964a = (C1964a) it;
                if (!c1964a.hasNext()) {
                    break;
                } else if (i4 == ((MenuItem) c1964a.next()).getGroupId()) {
                    c1964a.remove();
                }
            }
        }
        this.c.removeGroup(i4);
    }

    @Override // android.view.Menu
    public final void removeItem(int i4) {
        r.e eVar = (r.e) this.f5575b;
        if (eVar != null) {
            Iterator it = ((C1965b) eVar.keySet()).iterator();
            while (true) {
                C1964a c1964a = (C1964a) it;
                if (!c1964a.hasNext()) {
                    break;
                } else if (i4 == ((MenuItem) c1964a.next()).getItemId()) {
                    c1964a.remove();
                    break;
                }
            }
        }
        this.c.removeItem(i4);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i4, boolean z4, boolean z5) {
        this.c.setGroupCheckable(i4, z4, z5);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i4, boolean z4) {
        this.c.setGroupEnabled(i4, z4);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i4, boolean z4) {
        this.c.setGroupVisible(i4, z4);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.c.setQwertyMode(z4);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }
}
