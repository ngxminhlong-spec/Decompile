package o1;

import C0.ViewOnClickListenerC0014n;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import b0.AbstractC0171E;
import c1.C0234c;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.IcSetup;
import com.duracodefactory.logiccircuitsimulatorpro.ui.InsertProjectLayout;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramLayout;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramListLayout;
import com.duracodefactory.logiccircuitsimulatorpro.ui.UploaderLayout;
import java.util.ArrayList;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1881r extends AbstractC0171E {
    public final /* synthetic */ int c;
    public ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f14299e;

    public C1881r(IcSetup icSetup) {
        this.c = 0;
        this.f14299e = icSetup;
    }

    public C1881r(InsertProjectLayout insertProjectLayout) {
        this.c = 1;
        this.f14299e = insertProjectLayout;
        this.d = new ArrayList();
    }

    public C1881r(TimeDiagramLayout timeDiagramLayout) {
        this.c = 2;
        this.f14299e = timeDiagramLayout;
        this.d = new ArrayList();
    }

    public C1881r(TimeDiagramListLayout timeDiagramListLayout) {
        this.c = 3;
        this.f14299e = timeDiagramListLayout;
        this.d = new ArrayList();
    }

    public C1881r(UploaderLayout uploaderLayout) {
        this.c = 4;
        this.f14299e = uploaderLayout;
        this.d = new ArrayList();
    }

    @Override // b0.AbstractC0171E
    public final int a() {
        switch (this.c) {
            case 0:
                return this.d.size();
            case 1:
                return this.d.size();
            case 2:
                return this.d.size();
            case 3:
                return this.d.size();
            default:
                return this.d.size();
        }
    }

    @Override // b0.AbstractC0171E
    public final void f(b0.c0 c0Var, int i4) {
        switch (this.c) {
            case 0:
                C1882s c1882s = (C1882s) c0Var;
                C0234c c0234c = (C0234c) this.d.get(i4);
                c1882s.f14300t.setText(c0234c.f3546o);
                TextView textView = c1882s.f14301u;
                int b4 = Z.e.b(c0234c.f3547p);
                textView.setText(b4 != 0 ? b4 != 1 ? b4 != 2 ? b4 != 3 ? null : textView.getContext().getString(R.string.bottom) : textView.getContext().getString(R.string.right) : textView.getContext().getString(R.string.left) : textView.getContext().getString(R.string.top));
                c1882s.f14302v.setOnClickListener(new C0.g0(this, c0234c, c1882s, 3));
                c1882s.f14303w.setOnClickListener(new ViewOnClickListenerC1880q(this, c1882s, 0));
                c1882s.f14304x.setOnClickListener(new ViewOnClickListenerC1880q(this, c1882s, 1));
                return;
            case 1:
                C1887x c1887x = (C1887x) c0Var;
                i1.d dVar = (i1.d) this.d.get(i4);
                TextView textView2 = c1887x.f14308t;
                if (TextUtils.isEmpty(dVar.f13260b)) {
                    textView2.setText(textView2.getContext().getResources().getString(R.string.unknown_project));
                } else {
                    textView2.setText(dVar.f13260b);
                }
                c1887x.f14309u.setText(textView2.getContext().getResources().getString(R.string.elements_count) + ": " + dVar.d);
                c1887x.f14310v.setText(textView2.getContext().getResources().getString(R.string.connections_count) + ": " + dVar.f13261e);
                c1887x.f3244a.setOnClickListener(new ViewOnClickListenerC0014n(9, this, dVar));
                return;
            case 2:
                C1848Y c1848y = (C1848Y) c0Var;
                m1.c cVar = (m1.c) this.d.get(i4);
                c1848y.f14238t.setText(cVar.f13989b);
                View view = c1848y.f14241w;
                view.getBackground().setTint(cVar.c);
                c1848y.f14239u.setOnClickListener(new ViewOnClickListenerC1846W(this, cVar, 0));
                c1848y.f14240v.setOnClickListener(new ViewOnClickListenerC1846W(this, cVar, 1));
                view.setOnClickListener(new ViewOnClickListenerC1846W(this, cVar, 2));
                return;
            case 3:
                C1853b0 c1853b0 = (C1853b0) c0Var;
                m1.b bVar = (m1.b) this.d.get(i4);
                TextView textView3 = c1853b0.f14251t;
                Switch r1 = c1853b0.f14249A;
                textView3.setText(bVar.f13985b);
                StringBuilder sb = new StringBuilder("");
                ArrayList arrayList = bVar.d;
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    sb.append(((m1.c) obj).f13989b);
                    sb.append(", ");
                }
                c1853b0.f14254w.setText(TextUtils.isEmpty(sb.toString()) ? c1853b0.f14250B.getResources().getString(R.string.timing_diagram_no_entries) : sb.toString().substring(0, sb.toString().length() - 2));
                c1853b0.f14255x.setText(String.valueOf(arrayList.size()));
                int i6 = bVar.f13987f;
                c1853b0.y.setText(String.valueOf(i6));
                c1853b0.f14256z.setText(AbstractC1895f.q(i6 * bVar.c));
                r1.setChecked(bVar.f13986e);
                c1853b0.f3244a.setOnClickListener(new ViewOnClickListenerC1849Z(this, bVar, 0));
                c1853b0.f14252u.setOnClickListener(new ViewOnClickListenerC1849Z(this, bVar, 1));
                c1853b0.f14253v.setOnClickListener(new ViewOnClickListenerC1849Z(this, bVar, 2));
                r1.setOnCheckedChangeListener(new J2.f(4, bVar));
                return;
            default:
                C1877n0 c1877n0 = (C1877n0) c0Var;
                i1.d dVar2 = (i1.d) this.d.get(i4);
                TextView textView4 = c1877n0.f14286t;
                if (TextUtils.isEmpty(dVar2.f13260b)) {
                    textView4.setText(textView4.getContext().getResources().getString(R.string.unknown_project));
                } else {
                    textView4.setText(dVar2.f13260b);
                }
                c1877n0.f14287u.setText(textView4.getContext().getResources().getString(R.string.elements_count) + ": " + dVar2.d);
                c1877n0.f14288v.setText(textView4.getContext().getResources().getString(R.string.connections_count) + ": " + dVar2.f13261e);
                c1877n0.f3244a.setOnClickListener(new ViewOnClickListenerC0014n(10, this, dVar2));
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [b0.c0, o1.Y] */
    /* JADX WARN: Type inference failed for: r4v16, types: [b0.c0, o1.n0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [o1.s, b0.c0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [b0.c0, o1.x] */
    @Override // b0.AbstractC0171E
    public final b0.c0 g(ViewGroup viewGroup, int i4) {
        switch (this.c) {
            case 0:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ic_setup_node_holder, viewGroup, false);
                ?? c0Var = new b0.c0(inflate);
                c0Var.f14300t = (TextView) inflate.findViewById(R.id.id_text);
                c0Var.f14302v = inflate.findViewById(R.id.position_text_container);
                c0Var.f14301u = (TextView) inflate.findViewById(R.id.position_text);
                c0Var.f14303w = inflate.findViewById(R.id.setup_io_delete_node);
                c0Var.f14304x = inflate.findViewById(R.id.edit_node_name);
                return c0Var;
            case 1:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.insert_project_item_layout, viewGroup, false);
                ?? c0Var2 = new b0.c0(inflate2);
                c0Var2.f14308t = (TextView) inflate2.findViewById(R.id.insert_project_name);
                c0Var2.f14309u = (TextView) inflate2.findViewById(R.id.elem_num);
                c0Var2.f14310v = (TextView) inflate2.findViewById(R.id.conn_num);
                return c0Var2;
            case 2:
                View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.time_diagram_entry_item, viewGroup, false);
                ?? c0Var3 = new b0.c0(inflate3);
                c0Var3.f14238t = (TextView) inflate3.findViewById(R.id.timediagram_entry_name);
                c0Var3.f14239u = inflate3.findViewById(R.id.timingdiagram_delete_entry);
                c0Var3.f14240v = inflate3.findViewById(R.id.timediagram_edit_entry_name);
                c0Var3.f14241w = inflate3.findViewById(R.id.timingdiagram_color_entry_color);
                return c0Var3;
            case 3:
                return new C1853b0((TimeDiagramListLayout) this.f14299e, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.time_diagram_list_item, viewGroup, false));
            default:
                View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.share_project_item_layout, viewGroup, false);
                ?? c0Var4 = new b0.c0(inflate4);
                c0Var4.f14286t = (TextView) inflate4.findViewById(R.id.project_name);
                c0Var4.f14287u = (TextView) inflate4.findViewById(R.id.elem_num);
                c0Var4.f14288v = (TextView) inflate4.findViewById(R.id.conn_num);
                return c0Var4;
        }
    }

    @Override // b0.AbstractC0171E
    public final void h(b0.c0 c0Var) {
        switch (this.c) {
            case 0:
                C1882s c1882s = (C1882s) c0Var;
                c1882s.f14302v.setOnClickListener(null);
                c1882s.f14303w.setOnClickListener(null);
                c1882s.f14304x.setOnClickListener(null);
                return;
            case 1:
                ((C1887x) c0Var).f3244a.setOnClickListener(null);
                return;
            case 2:
                C1848Y c1848y = (C1848Y) c0Var;
                c1848y.f14239u.setOnClickListener(null);
                c1848y.f14240v.setOnClickListener(null);
                c1848y.f14241w.setOnClickListener(null);
                return;
            case 3:
                C1853b0 c1853b0 = (C1853b0) c0Var;
                c1853b0.f3244a.setOnClickListener(null);
                c1853b0.f14252u.setOnClickListener(null);
                c1853b0.f14253v.setOnClickListener(null);
                c1853b0.f14249A.setOnCheckedChangeListener(null);
                return;
            default:
                ((C1877n0) c0Var).f3244a.setOnClickListener(null);
                return;
        }
    }

    public void i() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            C0234c c0234c = (C0234c) obj;
            int i9 = c0234c.f3547p;
            if (i9 == 2) {
                c0234c.f3548q = i4;
                i4++;
            } else if (i9 == 1) {
                c0234c.f3548q = i5;
                i5++;
            } else if (i9 == 3) {
                c0234c.f3548q = i7;
                i7++;
            } else {
                c0234c.f3548q = i6;
                i6++;
            }
        }
    }
}
