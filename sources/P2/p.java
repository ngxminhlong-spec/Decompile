package P2;

import C0.ViewOnClickListenerC0022w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.material.internal.NavigationMenuView;
import java.util.ArrayList;
import k.F;
import k.z;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class p implements z {

    /* renamed from: A, reason: collision with root package name */
    public int f1580A;

    /* renamed from: B, reason: collision with root package name */
    public int f1581B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1582C;

    /* renamed from: E, reason: collision with root package name */
    public int f1584E;

    /* renamed from: F, reason: collision with root package name */
    public int f1585F;

    /* renamed from: G, reason: collision with root package name */
    public int f1586G;

    /* renamed from: o, reason: collision with root package name */
    public NavigationMenuView f1589o;

    /* renamed from: p, reason: collision with root package name */
    public LinearLayout f1590p;

    /* renamed from: q, reason: collision with root package name */
    public k.m f1591q;

    /* renamed from: r, reason: collision with root package name */
    public int f1592r;

    /* renamed from: s, reason: collision with root package name */
    public h f1593s;

    /* renamed from: t, reason: collision with root package name */
    public LayoutInflater f1594t;

    /* renamed from: u, reason: collision with root package name */
    public int f1595u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1596v;

    /* renamed from: w, reason: collision with root package name */
    public ColorStateList f1597w;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f1598x;
    public Drawable y;

    /* renamed from: z, reason: collision with root package name */
    public int f1599z;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1583D = true;

    /* renamed from: H, reason: collision with root package name */
    public int f1587H = -1;

    /* renamed from: I, reason: collision with root package name */
    public final ViewOnClickListenerC0022w f1588I = new ViewOnClickListenerC0022w(7, this);

    @Override // k.z
    public final void a(k.m mVar, boolean z4) {
    }

    @Override // k.z
    public final boolean c(k.p pVar) {
        return false;
    }

    @Override // k.z
    public final boolean d(F f4) {
        return false;
    }

    @Override // k.z
    public final boolean f(k.p pVar) {
        return false;
    }

    @Override // k.z
    public final void g(Parcelable parcelable) {
        k.p pVar;
        View actionView;
        r rVar;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f1589o.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                h hVar = this.f1593s;
                ArrayList arrayList = hVar.c;
                int i4 = bundle2.getInt("android:menu:checked", 0);
                if (i4 != 0) {
                    hVar.f1573e = true;
                    int size = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        }
                        j jVar = (j) arrayList.get(i5);
                        if (jVar instanceof l) {
                            k.p pVar2 = ((l) jVar).f1577a;
                            if (pVar2.f13456a == i4) {
                                hVar.j(pVar2);
                                break;
                            }
                        }
                        i5++;
                    }
                    hVar.f1573e = false;
                    hVar.i();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        j jVar2 = (j) arrayList.get(i6);
                        if ((jVar2 instanceof l) && (actionView = (pVar = ((l) jVar2).f1577a).getActionView()) != null && (rVar = (r) sparseParcelableArray2.get(pVar.f13456a)) != null) {
                            actionView.restoreHierarchyState(rVar);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f1590p.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // k.z
    public final int getId() {
        return this.f1592r;
    }

    @Override // k.z
    public final void h() {
        h hVar = this.f1593s;
        if (hVar != null) {
            hVar.i();
            hVar.d();
        }
    }

    @Override // k.z
    public final void k(Context context, k.m mVar) {
        this.f1594t = LayoutInflater.from(context);
        this.f1591q = mVar;
        this.f1586G = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // k.z
    public final boolean l() {
        return false;
    }

    @Override // k.z
    public final Parcelable m() {
        Bundle bundle = new Bundle();
        if (this.f1589o != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f1589o.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        h hVar = this.f1593s;
        if (hVar != null) {
            ArrayList arrayList = hVar.c;
            Bundle bundle2 = new Bundle();
            k.p pVar = hVar.d;
            if (pVar != null) {
                bundle2.putInt("android:menu:checked", pVar.f13456a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar = (j) arrayList.get(i4);
                if (jVar instanceof l) {
                    k.p pVar2 = ((l) jVar).f1577a;
                    View actionView = pVar2 != null ? pVar2.getActionView() : null;
                    if (actionView != null) {
                        SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
                        actionView.saveHierarchyState(sparseArray3);
                        sparseArray2.put(pVar2.f13456a, sparseArray3);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f1590p != null) {
            SparseArray<Parcelable> sparseArray4 = new SparseArray<>();
            this.f1590p.saveHierarchyState(sparseArray4);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray4);
        }
        return bundle;
    }
}
