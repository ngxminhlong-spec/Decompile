package D0;

import C0.DialogInterfaceOnClickListenerC0025z;
import C0.h0;
import C0.j0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.material.textfield.TextInputLayout;
import f.C1667b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class n implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f609o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f610p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j0 f611q;

    public /* synthetic */ n(j0 j0Var, m mVar, int i4) {
        this.f609o = i4;
        this.f611q = j0Var;
        this.f610p = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f609o) {
            case 0:
                p pVar = (p) this.f611q.f334f;
                m mVar = this.f610p;
                if (mVar.f603t.getPaddingTop() == 0) {
                    mVar.r(true);
                    pVar.f617D0.add(Integer.valueOf(mVar.b()));
                    return;
                } else {
                    mVar.r(false);
                    pVar.f617D0.remove(Integer.valueOf(mVar.b()));
                    return;
                }
            default:
                int b4 = this.f610p.b();
                j0 j0Var = this.f611q;
                p pVar2 = (p) j0Var.f334f;
                L2.b bVar = new L2.b(pVar2.l());
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(pVar2.l()).inflate(R.layout.node_rename_dialog, (ViewGroup) null);
                EditText editText = (EditText) viewGroup.findViewById(R.id.edit_text);
                i1.d dVar = (i1.d) j0Var.d.get(b4);
                editText.setText(dVar.f13260b);
                bVar.s(R.string.rename);
                ((C1667b) bVar.f113p).f12797n = viewGroup;
                ((TextInputLayout) viewGroup.findViewById(R.id.hint_layout)).setHint(pVar2.l().getString(R.string.project_name));
                bVar.q(R.string.save, new h0(j0Var, editText, dVar, b4, 1));
                bVar.p(R.string.cancel, new DialogInterfaceOnClickListenerC0025z(3));
                bVar.k();
                return;
        }
    }
}
