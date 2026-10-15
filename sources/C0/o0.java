package C0;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.ui.ElementsLayout;
import com.google.android.gms.internal.measurement.C1509e0;
import d3.AbstractC1654b;
import f.AbstractActivityC1671f;
import java.util.HashSet;
import java.util.Iterator;
import l1.C1797d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class o0 implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f354o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f355p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f356q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f357r;

    public /* synthetic */ o0(int i4, int i5, Object obj, Object obj2) {
        this.f354o = i5;
        this.f357r = obj;
        this.f356q = obj2;
        this.f355p = i4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f354o) {
            case 0:
                q0 q0Var = (q0) this.f357r;
                AbstractActivityC1671f h4 = ((v0) ((s0) q0Var.f370f).f393i).h();
                int i4 = ((C1797d) this.f356q).f13943b;
                HashSet b4 = l1.f.b(h4);
                if (!b4.remove(Integer.valueOf(i4))) {
                    b4.add(Integer.valueOf(i4));
                    if (AbstractC1654b.f12606e != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("LIKE", String.valueOf(i4));
                        C1509e0 c1509e0 = AbstractC1654b.f12606e.f12544a;
                        c1509e0.getClass();
                        c1509e0.b(new com.google.android.gms.internal.measurement.Y(c1509e0, null, "LAUNCH_306", bundle, false, 1));
                    }
                } else if (AbstractC1654b.f12606e != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("UNLIKE", String.valueOf(i4));
                    C1509e0 c1509e02 = AbstractC1654b.f12606e.f12544a;
                    c1509e02.getClass();
                    c1509e02.b(new com.google.android.gms.internal.measurement.Y(c1509e02, null, "LAUNCH_307", bundle2, false, 1));
                }
                SharedPreferences.Editor edit = h4.getPreferences(0).edit();
                String str = l1.f.f13952f;
                StringBuilder sb = new StringBuilder();
                Iterator it = b4.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    sb.append(" ");
                    sb.append(num);
                }
                edit.putString(str, sb.toString());
                edit.apply();
                q0Var.e(this.f355p);
                return;
            default:
                ((ElementsLayout) this.f357r).f3609o.m(((SparseIntArray) this.f356q).valueAt(this.f355p));
                return;
        }
    }
}
