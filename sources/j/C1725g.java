package j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import k.p;
import k.q;
import k.u;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: j.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1725g {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f13286A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f13287B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C1726h f13290E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f13291a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13296h;

    /* renamed from: i, reason: collision with root package name */
    public int f13297i;

    /* renamed from: j, reason: collision with root package name */
    public int f13298j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f13299k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f13300l;

    /* renamed from: m, reason: collision with root package name */
    public int f13301m;

    /* renamed from: n, reason: collision with root package name */
    public char f13302n;

    /* renamed from: o, reason: collision with root package name */
    public int f13303o;

    /* renamed from: p, reason: collision with root package name */
    public char f13304p;

    /* renamed from: q, reason: collision with root package name */
    public int f13305q;

    /* renamed from: r, reason: collision with root package name */
    public int f13306r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13307s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13308t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f13309u;

    /* renamed from: v, reason: collision with root package name */
    public int f13310v;

    /* renamed from: w, reason: collision with root package name */
    public int f13311w;

    /* renamed from: x, reason: collision with root package name */
    public String f13312x;
    public String y;

    /* renamed from: z, reason: collision with root package name */
    public q f13313z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f13288C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f13289D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f13292b = 0;
    public int c = 0;
    public int d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f13293e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13294f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13295g = true;

    public C1725g(C1726h c1726h, Menu menu) {
        this.f13290E = c1726h;
        this.f13291a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f13290E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e4) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.view.MenuItem$OnMenuItemClickListener, j.f, java.lang.Object] */
    public final void b(MenuItem menuItem) {
        C1726h c1726h = this.f13290E;
        Context context = c1726h.c;
        boolean z4 = false;
        menuItem.setChecked(this.f13307s).setVisible(this.f13308t).setEnabled(this.f13309u).setCheckable(this.f13306r >= 1).setTitleCondensed(this.f13300l).setIcon(this.f13301m);
        int i4 = this.f13310v;
        if (i4 >= 0) {
            menuItem.setShowAsAction(i4);
        }
        if (this.y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c1726h.d == null) {
                c1726h.d = C1726h.a(context);
            }
            Object obj = c1726h.d;
            String str = this.y;
            ?? obj2 = new Object();
            obj2.f13284a = obj;
            Class<?> cls = obj.getClass();
            try {
                obj2.f13285b = cls.getMethod(str, MenuItemOnMenuItemClickListenerC1724f.c);
                menuItem.setOnMenuItemClickListener(obj2);
            } catch (Exception e4) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e4);
                throw inflateException;
            }
        }
        boolean z5 = menuItem instanceof p;
        if (z5) {
        }
        if (this.f13306r >= 2) {
            if (z5) {
                ((p) menuItem).f(true);
            } else if (menuItem instanceof u) {
                u uVar = (u) menuItem;
                C.a aVar = uVar.c;
                try {
                    if (uVar.d == null) {
                        uVar.d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    uVar.d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e5) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e5);
                }
            }
        }
        String str2 = this.f13312x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, C1726h.f13314e, c1726h.f13316a));
            z4 = true;
        }
        int i5 = this.f13311w;
        if (i5 > 0) {
            if (z4) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i5);
            }
        }
        q qVar = this.f13313z;
        if (qVar != null) {
            if (menuItem instanceof C.a) {
                ((C.a) menuItem).b(qVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f13286A;
        boolean z6 = menuItem instanceof C.a;
        if (z6) {
            ((C.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            B.a.g(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f13287B;
        if (z6) {
            ((C.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            B.a.o(menuItem, charSequence2);
        }
        char c = this.f13302n;
        int i6 = this.f13303o;
        if (z6) {
            ((C.a) menuItem).setAlphabeticShortcut(c, i6);
        } else if (Build.VERSION.SDK_INT >= 26) {
            B.a.e(menuItem, c, i6);
        }
        char c2 = this.f13304p;
        int i7 = this.f13305q;
        if (z6) {
            ((C.a) menuItem).setNumericShortcut(c2, i7);
        } else if (Build.VERSION.SDK_INT >= 26) {
            B.a.k(menuItem, c2, i7);
        }
        PorterDuff.Mode mode = this.f13289D;
        if (mode != null) {
            if (z6) {
                ((C.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                B.a.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f13288C;
        if (colorStateList != null) {
            if (z6) {
                ((C.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                B.a.i(menuItem, colorStateList);
            }
        }
    }
}
