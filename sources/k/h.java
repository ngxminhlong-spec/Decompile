package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* renamed from: o, reason: collision with root package name */
    public int f13412o = -1;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f13413p;

    public h(i iVar) {
        this.f13413p = iVar;
        a();
    }

    public final void a() {
        m mVar = this.f13413p.f13416q;
        p pVar = mVar.f13445v;
        if (pVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f13433j;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((p) arrayList.get(i4)) == pVar) {
                    this.f13412o = i4;
                    return;
                }
            }
        }
        this.f13412o = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p getItem(int i4) {
        i iVar = this.f13413p;
        m mVar = iVar.f13416q;
        mVar.i();
        ArrayList arrayList = mVar.f13433j;
        iVar.getClass();
        int i5 = this.f13412o;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return (p) arrayList.get(i4);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        i iVar = this.f13413p;
        m mVar = iVar.f13416q;
        mVar.i();
        int size = mVar.f13433j.size();
        iVar.getClass();
        return this.f13412o < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f13413p.f13415p.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC1740A) view).b(getItem(i4));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
