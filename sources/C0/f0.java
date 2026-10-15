package C0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.material.textfield.TextInputLayout;
import f.C1667b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f0 implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f313o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e0 f314p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j0 f315q;

    public /* synthetic */ f0(j0 j0Var, e0 e0Var, int i4) {
        this.f313o = i4;
        this.f315q = j0Var;
        this.f314p = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f313o) {
            case 0:
                v0 v0Var = (v0) this.f315q.f334f;
                e0 e0Var = this.f314p;
                if (e0Var.f305t.getPaddingTop() == 0) {
                    e0Var.r(true);
                    v0Var.f424I0.add(Integer.valueOf(e0Var.b()));
                    return;
                } else {
                    e0Var.r(false);
                    v0Var.f424I0.remove(Integer.valueOf(e0Var.b()));
                    return;
                }
            default:
                int b4 = this.f314p.b();
                if (b4 >= 0) {
                    j0 j0Var = this.f315q;
                    v0 v0Var2 = (v0) j0Var.f334f;
                    L2.b bVar = new L2.b(v0Var2.l());
                    ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(v0Var2.l()).inflate(R.layout.node_rename_dialog, (ViewGroup) null);
                    EditText editText = (EditText) viewGroup.findViewById(R.id.edit_text);
                    i1.d dVar = (i1.d) j0Var.d.get(b4);
                    editText.setText(dVar.f13260b);
                    bVar.s(R.string.rename);
                    ((C1667b) bVar.f113p).f12797n = viewGroup;
                    ((TextInputLayout) viewGroup.findViewById(R.id.hint_layout)).setHint(v0Var2.l().getString(R.string.project_name));
                    bVar.q(R.string.save, new h0(j0Var, editText, dVar, b4, 0));
                    bVar.p(R.string.cancel, new DialogInterfaceOnClickListenerC0025z(2));
                    bVar.k();
                    return;
                }
                return;
        }
    }
}
