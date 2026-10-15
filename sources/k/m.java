package k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class m implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f13426a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f13427b;
    public boolean c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public k f13428e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f13429f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f13430g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13431h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f13432i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f13433j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13434k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f13436m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f13437n;

    /* renamed from: o, reason: collision with root package name */
    public View f13438o;

    /* renamed from: v, reason: collision with root package name */
    public p f13445v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f13447x;

    /* renamed from: l, reason: collision with root package name */
    public int f13435l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13439p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13440q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13441r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13442s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f13443t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f13444u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f13446w = false;

    public m(Context context) {
        boolean z4;
        boolean z5 = false;
        this.f13426a = context;
        Resources resources = context.getResources();
        this.f13427b = resources;
        this.f13429f = new ArrayList();
        this.f13430g = new ArrayList();
        this.f13431h = true;
        this.f13432i = new ArrayList();
        this.f13433j = new ArrayList();
        this.f13434k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = H.B.f781a;
            if (Build.VERSION.SDK_INT >= 28) {
                z4 = B.b.p(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z4 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z4) {
                z5 = true;
            }
        }
        this.d = z5;
    }

    public final p a(int i4, int i5, int i6, CharSequence charSequence) {
        int i7;
        int i8 = ((-65536) & i6) >> 16;
        if (i8 < 0 || i8 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i9 = (y[i8] << 16) | (65535 & i6);
        p pVar = new p(this, i4, i5, i6, i9, charSequence, this.f13435l);
        ArrayList arrayList = this.f13429f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (((p) arrayList.get(size)).d <= i9) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i7, pVar);
        p(true);
        return pVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4) {
        return a(0, 0, 0, this.f13427b.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i6, int i7) {
        return a(i4, i5, i6, this.f13427b.getString(i7));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return a(i4, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i8;
        PackageManager packageManager = this.f13426a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i7 & 1) == 0) {
            removeGroup(i4);
        }
        for (int i9 = 0; i9 < size; i9++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i9);
            int i10 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i10 < 0 ? intent : intentArr[i10]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            p a4 = a(i4, i5, i6, resolveInfo.loadLabel(packageManager));
            a4.setIcon(resolveInfo.loadIcon(packageManager));
            a4.f13460g = intent2;
            if (menuItemArr != null && (i8 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i8] = a4;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4) {
        return addSubMenu(0, 0, 0, this.f13427b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return addSubMenu(i4, i5, i6, this.f13427b.getString(i7));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        p a4 = a(i4, i5, i6, charSequence);
        F f4 = new F(this.f13426a, this, a4);
        a4.f13468o = f4;
        f4.setHeaderTitle(a4.f13458e);
        return f4;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(z zVar, Context context) {
        this.f13444u.add(new WeakReference(zVar));
        zVar.k(context, this);
        this.f13434k = true;
    }

    public final void c(boolean z4) {
        if (this.f13442s) {
            return;
        }
        this.f13442s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13444u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar = (z) weakReference.get();
            if (zVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zVar.a(this, z4);
            }
        }
        this.f13442s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        p pVar = this.f13445v;
        if (pVar != null) {
            d(pVar);
        }
        this.f13429f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f13437n = null;
        this.f13436m = null;
        this.f13438o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(p pVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13444u;
        boolean z4 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f13445v == pVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                z zVar = (z) weakReference.get();
                if (zVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z4 = zVar.f(pVar);
                    if (z4) {
                        break;
                    }
                }
            }
            v();
            if (z4) {
                this.f13445v = null;
            }
        }
        return z4;
    }

    public boolean e(m mVar, MenuItem menuItem) {
        k kVar = this.f13428e;
        return kVar != null && kVar.g(mVar, menuItem);
    }

    public boolean f(p pVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13444u;
        boolean z4 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar = (z) weakReference.get();
            if (zVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z4 = zVar.c(pVar);
                if (z4) {
                    break;
                }
            }
        }
        v();
        if (z4) {
            this.f13445v = pVar;
        }
        return z4;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i4) {
        MenuItem findItem;
        ArrayList arrayList = this.f13429f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            p pVar = (p) arrayList.get(i5);
            if (pVar.f13456a == i4) {
                return pVar;
            }
            if (pVar.hasSubMenu() && (findItem = pVar.f13468o.findItem(i4)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final p g(int i4, KeyEvent keyEvent) {
        ArrayList arrayList = this.f13443t;
        arrayList.clear();
        h(arrayList, i4, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (p) arrayList.get(0);
        }
        boolean n4 = n();
        for (int i5 = 0; i5 < size; i5++) {
            p pVar = (p) arrayList.get(i5);
            char c = n4 ? pVar.f13463j : pVar.f13461h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (n4 && c == '\b' && i4 == 67))) {
                return pVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i4) {
        return (MenuItem) this.f13429f.get(i4);
    }

    public final void h(List list, int i4, KeyEvent keyEvent) {
        boolean n4 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i4 == 67) {
            ArrayList arrayList = this.f13429f;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                p pVar = (p) arrayList.get(i5);
                if (pVar.hasSubMenu()) {
                    pVar.f13468o.h(list, i4, keyEvent);
                }
                char c = n4 ? pVar.f13463j : pVar.f13461h;
                if ((modifiers & 69647) == ((n4 ? pVar.f13464k : pVar.f13462i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (n4 && c == '\b' && i4 == 67)) && pVar.isEnabled()) {
                        list.add(pVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f13447x) {
            return true;
        }
        ArrayList arrayList = this.f13429f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((p) arrayList.get(i4)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l4 = l();
        if (this.f13434k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f13444u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                z zVar = (z) weakReference.get();
                if (zVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z4 |= zVar.l();
                }
            }
            ArrayList arrayList = this.f13432i;
            ArrayList arrayList2 = this.f13433j;
            if (z4) {
                arrayList.clear();
                arrayList2.clear();
                int size = l4.size();
                for (int i4 = 0; i4 < size; i4++) {
                    p pVar = (p) l4.get(i4);
                    if ((pVar.f13477x & 32) == 32) {
                        arrayList.add(pVar);
                    } else {
                        arrayList2.add(pVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f13434k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return g(i4, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public m k() {
        return this;
    }

    public final ArrayList l() {
        boolean z4 = this.f13431h;
        ArrayList arrayList = this.f13430g;
        if (!z4) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f13429f;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            p pVar = (p) arrayList2.get(i4);
            if (pVar.isVisible()) {
                arrayList.add(pVar);
            }
        }
        this.f13431h = false;
        this.f13434k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f13446w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public void p(boolean z4) {
        if (this.f13439p) {
            this.f13440q = true;
            if (z4) {
                this.f13441r = true;
                return;
            }
            return;
        }
        if (z4) {
            this.f13431h = true;
            this.f13434k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13444u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar = (z) weakReference.get();
            if (zVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zVar.h();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i4, int i5) {
        return q(findItem(i4), null, i5);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        p g4 = g(i4, keyEvent);
        boolean q4 = g4 != null ? q(g4, null, i5) : false;
        if ((i5 & 2) != 0) {
            c(true);
        }
        return q4;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.MenuItem r7, k.z r8, int r9) {
        /*
            r6 = this;
            k.p r7 = (k.p) r7
            r0 = 0
            if (r7 == 0) goto Ld2
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld2
        Ld:
            k.m r1 = r7.f13467n
            android.view.MenuItem$OnMenuItemClickListener r2 = r7.f13469p
            r3 = 1
            if (r2 == 0) goto L1c
            boolean r2 = r2.onMenuItemClick(r7)
            if (r2 == 0) goto L1c
        L1a:
            r1 = r3
            goto L43
        L1c:
            boolean r2 = r1.e(r1, r7)
            if (r2 == 0) goto L23
            goto L1a
        L23:
            android.content.Intent r2 = r7.f13460g
            if (r2 == 0) goto L35
            android.content.Context r1 = r1.f13426a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L1a
        L2d:
            r1 = move-exception
            java.lang.String r2 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r2, r4, r1)
        L35:
            k.q r1 = r7.f13453A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f13479a
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L1a
        L42:
            r1 = r0
        L43:
            k.q r2 = r7.f13453A
            if (r2 == 0) goto L51
            android.view.ActionProvider r4 = r2.f13479a
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r3
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld1
            r6.c(r3)
            goto Ld1
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld1
            r6.c(r3)
            goto Ld1
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            k.F r9 = new k.F
            android.content.Context r5 = r6.f13426a
            r9.<init>(r5, r6, r7)
            r7.f13468o = r9
            java.lang.CharSequence r5 = r7.f13458e
            r9.setHeaderTitle(r5)
        L90:
            k.F r7 = r7.f13468o
            if (r4 == 0) goto L99
            android.view.ActionProvider r9 = r2.f13479a
            r9.onPrepareSubMenu(r7)
        L99:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f13444u
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto La2
            goto Lcb
        La2:
            if (r8 == 0) goto La8
            boolean r0 = r8.d(r7)
        La8:
            java.util.Iterator r8 = r9.iterator()
        Lac:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lcb
            java.lang.Object r2 = r8.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r4 = r2.get()
            k.z r4 = (k.z) r4
            if (r4 != 0) goto Lc4
            r9.remove(r2)
            goto Lac
        Lc4:
            if (r0 != 0) goto Lac
            boolean r0 = r4.d(r7)
            goto Lac
        Lcb:
            r1 = r1 | r0
            if (r1 != 0) goto Ld1
            r6.c(r3)
        Ld1:
            return r1
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.m.q(android.view.MenuItem, k.z, int):boolean");
    }

    public final void r(z zVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13444u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar2 = (z) weakReference.get();
            if (zVar2 == null || zVar2 == zVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i4) {
        ArrayList arrayList = this.f13429f;
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            } else if (((p) arrayList.get(i6)).f13457b == i4) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            int size2 = arrayList.size() - i6;
            while (true) {
                int i7 = i5 + 1;
                if (i5 >= size2 || ((p) arrayList.get(i6)).f13457b != i4) {
                    break;
                }
                if (i6 >= 0 && i6 < arrayList.size()) {
                    arrayList.remove(i6);
                }
                i5 = i7;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i4) {
        ArrayList arrayList = this.f13429f;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((p) arrayList.get(i5)).f13456a == i4) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 < 0 || i5 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i5);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f13429f.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((F) item.getSubMenu()).s(bundle);
            }
        }
        int i5 = bundle.getInt("android:menu:expandedactionview");
        if (i5 <= 0 || (findItem = findItem(i5)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i4, boolean z4, boolean z5) {
        ArrayList arrayList = this.f13429f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            p pVar = (p) arrayList.get(i5);
            if (pVar.f13457b == i4) {
                pVar.f(z5);
                pVar.setCheckable(z4);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z4) {
        this.f13446w = z4;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i4, boolean z4) {
        ArrayList arrayList = this.f13429f;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            p pVar = (p) arrayList.get(i5);
            if (pVar.f13457b == i4) {
                pVar.setEnabled(z4);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i4, boolean z4) {
        ArrayList arrayList = this.f13429f;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            p pVar = (p) arrayList.get(i5);
            if (pVar.f13457b == i4) {
                int i6 = pVar.f13477x;
                int i7 = (i6 & (-9)) | (z4 ? 0 : 8);
                pVar.f13477x = i7;
                if (i6 != i7) {
                    z5 = true;
                }
            }
        }
        if (z5) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z4) {
        this.c = z4;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f13429f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f13429f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((F) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i4, CharSequence charSequence, int i5, Drawable drawable, View view) {
        if (view != null) {
            this.f13438o = view;
            this.f13436m = null;
            this.f13437n = null;
        } else {
            if (i4 > 0) {
                this.f13436m = this.f13427b.getText(i4);
            } else if (charSequence != null) {
                this.f13436m = charSequence;
            }
            if (i5 > 0) {
                this.f13437n = this.f13426a.getDrawable(i5);
            } else if (drawable != null) {
                this.f13437n = drawable;
            }
            this.f13438o = null;
        }
        p(false);
    }

    public final void v() {
        this.f13439p = false;
        if (this.f13440q) {
            this.f13440q = false;
            p(this.f13441r);
        }
    }

    public final void w() {
        if (this.f13439p) {
            return;
        }
        this.f13439p = true;
        this.f13440q = false;
        this.f13441r = false;
    }
}
