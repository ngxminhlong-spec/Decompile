package C0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import b0.AbstractC0171E;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import d1.C1650a;
import d3.AbstractC1654b;
import java.util.ArrayList;
import java.util.HashSet;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Y extends AbstractC0171E {
    public final /* synthetic */ int c = 0;
    public ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f261e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f262f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f263g;

    public Y(C0001a0 c0001a0) {
        this.f263g = c0001a0;
    }

    public Y(C0001a0 c0001a0, byte b4) {
        this.f263g = c0001a0;
    }

    @Override // b0.AbstractC0171E
    public final int a() {
        switch (this.c) {
            case 0:
                return this.d.size();
            default:
                return this.d.size();
        }
    }

    @Override // b0.AbstractC0171E
    public final void f(b0.c0 c0Var, int i4) {
        switch (this.c) {
            case 0:
                Z z4 = (Z) c0Var;
                View view = z4.f270x;
                View view2 = z4.f269w;
                C1650a c1650a = (C1650a) this.d.get(i4);
                boolean contains = this.f261e.contains(Integer.valueOf(i4));
                View view3 = z4.f3244a;
                boolean z5 = AbstractC1806a.H(view3.getContext()) && this.f262f == i4;
                ViewGroup viewGroup = z4.y;
                z4.f266t.setText(c1650a.f12597a);
                z4.f267u.setText(c1650a.d);
                z4.f268v.setImageResource(c1650a.f12598b);
                view2.setVisibility(contains ? 8 : 0);
                view.setVisibility(!contains ? 8 : 0);
                z4.f271z.setVisibility(contains ? 0 : 8);
                if (contains) {
                    viewGroup.removeAllViews();
                    viewGroup.addView(AbstractC1654b.B(viewGroup, c1650a));
                }
                if (z4.f265B.f274p) {
                    view2.setVisibility(8);
                    view.setVisibility(8);
                }
                view3.setSelected(z5);
                z4.f264A.setOnClickListener(new ViewOnClickListenerC0019t(this, z4, c1650a, i4, 1));
                return;
            default:
                D0.l lVar = (D0.l) c0Var;
                View view4 = lVar.f596x;
                View view5 = lVar.f595w;
                C1650a c1650a2 = (C1650a) this.d.get(i4);
                boolean contains2 = this.f261e.contains(Integer.valueOf(i4));
                View view6 = lVar.f3244a;
                boolean z6 = AbstractC1806a.H(view6.getContext()) && this.f262f == i4;
                ViewGroup viewGroup2 = lVar.y;
                lVar.f592t.setText(c1650a2.f12597a);
                lVar.f593u.setText(c1650a2.d);
                lVar.f594v.setImageResource(c1650a2.f12598b);
                view5.setVisibility(contains2 ? 8 : 0);
                view4.setVisibility(!contains2 ? 8 : 0);
                lVar.f597z.setVisibility(contains2 ? 0 : 8);
                if (contains2) {
                    viewGroup2.removeAllViews();
                    viewGroup2.addView(AbstractC1654b.B(viewGroup2, c1650a2));
                }
                if (lVar.f591B.f274p) {
                    view5.setVisibility(8);
                    view4.setVisibility(8);
                }
                view6.setSelected(z6);
                lVar.f590A.setOnClickListener(new ViewOnClickListenerC0019t(this, lVar, c1650a2, i4, 3));
                return;
        }
    }

    @Override // b0.AbstractC0171E
    public final b0.c0 g(ViewGroup viewGroup, int i4) {
        switch (this.c) {
            case 0:
                return new Z((C0001a0) this.f263g, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.learn_info_holder, viewGroup, false));
            default:
                return new D0.l((C0001a0) this.f263g, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.learn_info_holder, viewGroup, false));
        }
    }

    @Override // b0.AbstractC0171E
    public final void h(b0.c0 c0Var) {
        switch (this.c) {
            case 0:
                ((Z) c0Var).f264A.setOnClickListener(null);
                return;
            default:
                ((D0.l) c0Var).f590A.setOnClickListener(null);
                return;
        }
    }
}
