package Q2;

import P2.f;
import P2.p;
import P2.s;
import V2.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.internal.NavigationMenuView;
import d3.AbstractC1654b;
import g.AbstractC1678a;
import j.C1726h;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.z;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class d extends s {

    /* renamed from: t, reason: collision with root package name */
    public final f f1744t;

    /* renamed from: u, reason: collision with root package name */
    public final p f1745u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1746v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f1747w;

    /* renamed from: x, reason: collision with root package name */
    public C1726h f1748x;
    public final a y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f1743z = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f1742A = {-16842910};

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.Menu, k.m, P2.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(android.content.Context r22, android.util.AttributeSet r23) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.d.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private MenuInflater getMenuInflater() {
        if (this.f1748x == null) {
            this.f1748x = new C1726h(getContext());
        }
        return this.f1748x;
    }

    public final ColorStateList a(int i4) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i4, typedValue, true)) {
            return null;
        }
        Context context = getContext();
        int i5 = typedValue.resourceId;
        Object obj = AbstractC1678a.f12977a;
        ColorStateList colorStateList = context.getColorStateList(i5);
        if (!getContext().getTheme().resolveAttribute(com.duracodefactory.logiccircuitsimulatorpro.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i6 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = f1742A;
        return new ColorStateList(new int[][]{iArr, f1743z, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i6, defaultColor});
    }

    public MenuItem getCheckedItem() {
        return this.f1745u.f1593s.d;
    }

    public int getHeaderCount() {
        return this.f1745u.f1590p.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f1745u.y;
    }

    public int getItemHorizontalPadding() {
        return this.f1745u.f1599z;
    }

    public int getItemIconPadding() {
        return this.f1745u.f1580A;
    }

    public ColorStateList getItemIconTintList() {
        return this.f1745u.f1598x;
    }

    public int getItemMaxLines() {
        return this.f1745u.f1584E;
    }

    public ColorStateList getItemTextColor() {
        return this.f1745u.f1597w;
    }

    public Menu getMenu() {
        return this.f1744t;
    }

    @Override // P2.s, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            AbstractC1654b.P(this, (g) background);
        }
    }

    @Override // P2.s, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.y);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int i6 = this.f1746v;
        if (mode == Integer.MIN_VALUE) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i4), i6), 1073741824);
        } else if (mode == 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f1071o);
        Bundle bundle = cVar.f1741q;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1744t.f13444u;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar = (z) weakReference.get();
            if (zVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = zVar.getId();
                if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    zVar.g(parcelable2);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [L.b, Q2.c, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable m4;
        ?? bVar = new L.b(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        bVar.f1741q = bundle;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1744t.f13444u;
        if (copyOnWriteArrayList.isEmpty()) {
            return bVar;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            z zVar = (z) weakReference.get();
            if (zVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = zVar.getId();
                if (id > 0 && (m4 = zVar.m()) != null) {
                    sparseArray.put(id, m4);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return bVar;
    }

    public void setCheckedItem(int i4) {
        MenuItem findItem = this.f1744t.findItem(i4);
        if (findItem != null) {
            this.f1745u.f1593s.j((k.p) findItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f1744t.findItem(menuItem.getItemId());
        if (findItem == null) {
            throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        }
        this.f1745u.f1593s.j((k.p) findItem);
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).h(f4);
        }
    }

    public void setItemBackground(Drawable drawable) {
        p pVar = this.f1745u;
        pVar.y = drawable;
        pVar.h();
    }

    public void setItemBackgroundResource(int i4) {
        setItemBackground(getContext().getDrawable(i4));
    }

    public void setItemHorizontalPadding(int i4) {
        p pVar = this.f1745u;
        pVar.f1599z = i4;
        pVar.h();
    }

    public void setItemHorizontalPaddingResource(int i4) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i4);
        p pVar = this.f1745u;
        pVar.f1599z = dimensionPixelSize;
        pVar.h();
    }

    public void setItemIconPadding(int i4) {
        p pVar = this.f1745u;
        pVar.f1580A = i4;
        pVar.h();
    }

    public void setItemIconPaddingResource(int i4) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i4);
        p pVar = this.f1745u;
        pVar.f1580A = dimensionPixelSize;
        pVar.h();
    }

    public void setItemIconSize(int i4) {
        p pVar = this.f1745u;
        if (pVar.f1581B != i4) {
            pVar.f1581B = i4;
            pVar.f1582C = true;
            pVar.h();
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        p pVar = this.f1745u;
        pVar.f1598x = colorStateList;
        pVar.h();
    }

    public void setItemMaxLines(int i4) {
        p pVar = this.f1745u;
        pVar.f1584E = i4;
        pVar.h();
    }

    public void setItemTextAppearance(int i4) {
        p pVar = this.f1745u;
        pVar.f1595u = i4;
        pVar.f1596v = true;
        pVar.h();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        p pVar = this.f1745u;
        pVar.f1597w = colorStateList;
        pVar.h();
    }

    public void setNavigationItemSelectedListener(b bVar) {
    }

    @Override // android.view.View
    public void setOverScrollMode(int i4) {
        super.setOverScrollMode(i4);
        p pVar = this.f1745u;
        if (pVar != null) {
            pVar.f1587H = i4;
            NavigationMenuView navigationMenuView = pVar.f1589o;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i4);
            }
        }
    }
}
