package Y2;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import l.C1764e0;
import l.F;
import l.I;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class q implements AdapterView.OnItemClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2209o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f2210p;

    public /* synthetic */ q(int i4, Object obj) {
        this.f2209o = i4;
        this.f2210p = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        switch (this.f2209o) {
            case 0:
                r rVar = (r) this.f2210p;
                C1764e0 c1764e0 = rVar.f2211r;
                r.a(rVar, i4 < 0 ? !c1764e0.f13740M.isShowing() ? null : c1764e0.f13743q.getSelectedItem() : rVar.getAdapter().getItem(i4));
                AdapterView.OnItemClickListener onItemClickListener = rVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i4 < 0) {
                        view = !c1764e0.f13740M.isShowing() ? null : c1764e0.f13743q.getSelectedView();
                        i4 = !c1764e0.f13740M.isShowing() ? -1 : c1764e0.f13743q.getSelectedItemPosition();
                        j4 = !c1764e0.f13740M.isShowing() ? Long.MIN_VALUE : c1764e0.f13743q.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c1764e0.f13743q, view, i4, j4);
                }
                c1764e0.dismiss();
                return;
            case 1:
                F f4 = (F) this.f2210p;
                I i5 = f4.f13599U;
                i5.setSelection(i4);
                if (i5.getOnItemClickListener() != null) {
                    i5.performItemClick(view, i4, f4.f13596R.getItemId(i4));
                }
                f4.dismiss();
                return;
            default:
                ((SearchView) this.f2210p).n(i4);
                return;
        }
    }
}
