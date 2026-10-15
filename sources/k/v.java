package k;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class v implements InterfaceC1743D, z, AdapterView.OnItemClickListener {

    /* renamed from: o, reason: collision with root package name */
    public Rect f13486o;

    public static int o(ListAdapter listAdapter, Context context, int i4) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i5 = 0;
        int i6 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = listAdapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i7, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i4) {
                return i4;
            }
            if (measuredWidth > i5) {
                i5 = measuredWidth;
            }
        }
        return i5;
    }

    @Override // k.z
    public final boolean c(p pVar) {
        return false;
    }

    @Override // k.z
    public final boolean f(p pVar) {
        return false;
    }

    @Override // k.z
    public final int getId() {
        return 0;
    }

    @Override // k.z
    public final void k(Context context, m mVar) {
    }

    public abstract void n(m mVar);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (j) listAdapter).f13420o.q((MenuItem) listAdapter.getItem(i4), this, !(this instanceof g) ? 0 : 4);
    }

    public abstract void p(View view);

    public abstract void q(boolean z4);

    public abstract void r(int i4);

    public abstract void s(int i4);

    public abstract void t(PopupWindow.OnDismissListener onDismissListener);

    public abstract void u(boolean z4);

    public abstract void v(int i4);
}
