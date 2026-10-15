package C0;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b0.AbstractC0171E;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j0 extends AbstractC0171E {
    public final /* synthetic */ int c = 0;
    public ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final SimpleDateFormat f333e = new SimpleDateFormat("EEE, dd-MMM, yyyy");

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ H f334f;

    public j0(v0 v0Var) {
        this.f334f = v0Var;
    }

    public j0(D0.p pVar) {
        this.f334f = pVar;
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
                e0 e0Var = (e0) c0Var;
                i1.d dVar = (i1.d) this.d.get(i4);
                boolean contains = ((v0) this.f334f).f424I0.contains(Integer.valueOf(i4));
                View view = e0Var.f303F;
                View view2 = e0Var.f3244a;
                View view3 = e0Var.f304G;
                View view4 = e0Var.f305t;
                TextView textView = e0Var.f306u;
                if (TextUtils.isEmpty(dVar.f13260b)) {
                    textView.setText(textView.getContext().getResources().getString(R.string.unknown_project));
                } else {
                    textView.setText(dVar.f13260b);
                }
                e0Var.f307v.setText(textView.getContext().getResources().getString(R.string.elements_count) + ": " + dVar.d);
                e0Var.f308w.setText(textView.getContext().getResources().getString(R.string.connections_count) + ": " + dVar.f13261e);
                int paddingTop = view4.getPaddingTop();
                if (!contains) {
                    paddingTop = 0;
                } else if (paddingTop <= 0) {
                    paddingTop = view2.getHeight();
                }
                view4.setPadding(0, paddingTop, 0, 0);
                view4.setVisibility(contains ? 0 : 4);
                String format = this.f333e.format(dVar.f13262f);
                e0Var.f309x.setText(textView.getContext().getResources().getString(R.string.modified) + ": " + format);
                if (dVar.f13267k != 0) {
                    view3.setVisibility(0);
                    view.setVisibility(8);
                } else {
                    view3.setVisibility(8);
                    view.setVisibility(0);
                }
                view2.setOnClickListener(new ViewOnClickListenerC0014n(3, this, dVar));
                int i5 = 0;
                e0Var.f302E.setOnClickListener(new f0(this, e0Var, i5));
                e0Var.f310z.setOnClickListener(new g0(this, e0Var, dVar, i5));
                e0Var.f299B.setOnClickListener(new f0(this, e0Var, 1));
                return;
            default:
                D0.m mVar = (D0.m) c0Var;
                i1.d dVar2 = (i1.d) this.d.get(i4);
                boolean contains2 = ((D0.p) this.f334f).f617D0.contains(Integer.valueOf(i4));
                View view5 = mVar.f603t;
                View view6 = mVar.f3244a;
                TextView textView2 = mVar.f604u;
                if (TextUtils.isEmpty(dVar2.f13260b)) {
                    textView2.setText(textView2.getContext().getResources().getString(R.string.unknown_project));
                } else {
                    textView2.setText(dVar2.f13260b);
                }
                mVar.f605v.setText(textView2.getContext().getResources().getString(R.string.elements_count) + ": " + dVar2.d);
                mVar.f606w.setText(textView2.getContext().getResources().getString(R.string.connections_count) + ": " + dVar2.f13261e);
                int paddingTop2 = view5.getPaddingTop();
                if (!contains2) {
                    paddingTop2 = 0;
                } else if (paddingTop2 <= 0) {
                    paddingTop2 = view6.getHeight();
                }
                view5.setPadding(0, paddingTop2, 0, 0);
                view5.setVisibility(contains2 ? 0 : 4);
                String format2 = this.f333e.format(dVar2.f13262f);
                mVar.f607x.setText(textView2.getContext().getResources().getString(R.string.modified) + ": " + format2);
                view6.setOnClickListener(new ViewOnClickListenerC0014n(7, this, dVar2));
                mVar.f602E.setOnClickListener(new D0.n(this, mVar, 0));
                mVar.f608z.setOnClickListener(new g0(this, mVar, dVar2, 1));
                mVar.f599B.setOnClickListener(new D0.n(this, mVar, 1));
                return;
        }
    }

    @Override // b0.AbstractC0171E
    public final b0.c0 g(ViewGroup viewGroup, int i4) {
        switch (this.c) {
            case 0:
                return new e0(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recent_project_item_layout, viewGroup, false));
            default:
                return new D0.m(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recent_project_item_layout, viewGroup, false));
        }
    }

    @Override // b0.AbstractC0171E
    public final void h(b0.c0 c0Var) {
        switch (this.c) {
            case 0:
                e0 e0Var = (e0) c0Var;
                e0Var.f3244a.setOnClickListener(null);
                e0Var.f310z.setOnClickListener(null);
                e0Var.f299B.setOnClickListener(null);
                e0Var.f302E.setOnClickListener(null);
                return;
            default:
                D0.m mVar = (D0.m) c0Var;
                mVar.f3244a.setOnClickListener(null);
                mVar.f608z.setOnClickListener(null);
                mVar.f599B.setOnClickListener(null);
                mVar.f602E.setOnClickListener(null);
                return;
        }
    }
}
