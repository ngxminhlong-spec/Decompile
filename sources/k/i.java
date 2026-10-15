package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import f.C1667b;
import f.DialogC1670e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i implements z, AdapterView.OnItemClickListener {

    /* renamed from: o, reason: collision with root package name */
    public Context f13414o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f13415p;

    /* renamed from: q, reason: collision with root package name */
    public m f13416q;

    /* renamed from: r, reason: collision with root package name */
    public ExpandedMenuView f13417r;

    /* renamed from: s, reason: collision with root package name */
    public y f13418s;

    /* renamed from: t, reason: collision with root package name */
    public h f13419t;

    public i(ContextWrapper contextWrapper) {
        this.f13414o = contextWrapper;
        this.f13415p = LayoutInflater.from(contextWrapper);
    }

    @Override // k.z
    public final void a(m mVar, boolean z4) {
        y yVar = this.f13418s;
        if (yVar != null) {
            yVar.a(mVar, z4);
        }
    }

    @Override // k.z
    public final boolean c(p pVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, k.y, java.lang.Object, k.n, android.content.DialogInterface$OnDismissListener] */
    @Override // k.z
    public final boolean d(F f4) {
        boolean hasVisibleItems = f4.hasVisibleItems();
        Context context = f4.f13426a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f13448o = f4;
        B0.r rVar = new B0.r(context);
        C1667b c1667b = (C1667b) rVar.f113p;
        i iVar = new i(c1667b.f12786a);
        obj.f13450q = iVar;
        iVar.f13418s = obj;
        f4.b(iVar, context);
        i iVar2 = obj.f13450q;
        if (iVar2.f13419t == null) {
            iVar2.f13419t = new h(iVar2);
        }
        c1667b.f12795l = iVar2.f13419t;
        c1667b.f12796m = obj;
        View view = f4.f13438o;
        if (view != null) {
            c1667b.f12788e = view;
        } else {
            c1667b.c = f4.f13437n;
            c1667b.d = f4.f13436m;
        }
        c1667b.f12794k = obj;
        DialogC1670e i4 = rVar.i();
        obj.f13449p = i4;
        i4.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f13449p.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f13449p.show();
        y yVar = this.f13418s;
        if (yVar == null) {
            return true;
        }
        yVar.d(f4);
        return true;
    }

    @Override // k.z
    public final boolean f(p pVar) {
        return false;
    }

    @Override // k.z
    public final void g(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f13417r.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // k.z
    public final int getId() {
        return 0;
    }

    @Override // k.z
    public final void h() {
        h hVar = this.f13419t;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // k.z
    public final void j(y yVar) {
        throw null;
    }

    @Override // k.z
    public final void k(Context context, m mVar) {
        if (this.f13414o != null) {
            this.f13414o = context;
            if (this.f13415p == null) {
                this.f13415p = LayoutInflater.from(context);
            }
        }
        this.f13416q = mVar;
        h hVar = this.f13419t;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // k.z
    public final boolean l() {
        return false;
    }

    @Override // k.z
    public final Parcelable m() {
        if (this.f13417r == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f13417r;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        this.f13416q.q(this.f13419t.getItem(i4), this, 0);
    }
}
