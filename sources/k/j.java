package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j extends BaseAdapter {

    /* renamed from: o, reason: collision with root package name */
    public final m f13420o;

    /* renamed from: p, reason: collision with root package name */
    public int f13421p = -1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13422q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f13423r;

    /* renamed from: s, reason: collision with root package name */
    public final LayoutInflater f13424s;

    /* renamed from: t, reason: collision with root package name */
    public final int f13425t;

    public j(m mVar, LayoutInflater layoutInflater, boolean z4, int i4) {
        this.f13423r = z4;
        this.f13424s = layoutInflater;
        this.f13420o = mVar;
        this.f13425t = i4;
        a();
    }

    public final void a() {
        m mVar = this.f13420o;
        p pVar = mVar.f13445v;
        if (pVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f13433j;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((p) arrayList.get(i4)) == pVar) {
                    this.f13421p = i4;
                    return;
                }
            }
        }
        this.f13421p = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p getItem(int i4) {
        ArrayList l4;
        boolean z4 = this.f13423r;
        m mVar = this.f13420o;
        if (z4) {
            mVar.i();
            l4 = mVar.f13433j;
        } else {
            l4 = mVar.l();
        }
        int i5 = this.f13421p;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return (p) l4.get(i4);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l4;
        boolean z4 = this.f13423r;
        m mVar = this.f13420o;
        if (z4) {
            mVar.i();
            l4 = mVar.f13433j;
        } else {
            l4 = mVar.l();
        }
        return this.f13421p < 0 ? l4.size() : l4.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        boolean z4 = false;
        if (view == null) {
            view = this.f13424s.inflate(this.f13425t, viewGroup, false);
        }
        int i5 = getItem(i4).f13457b;
        int i6 = i4 - 1;
        int i7 = i6 >= 0 ? getItem(i6).f13457b : i5;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f13420o.m() && i5 != i7) {
            z4 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z4);
        InterfaceC1740A interfaceC1740A = (InterfaceC1740A) view;
        if (this.f13422q) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC1740A.b(getItem(i4));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
