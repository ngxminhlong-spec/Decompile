package o1;

import C0.DialogInterfaceOnClickListenerC0025z;
import Q1.DialogInterfaceOnClickListenerC0105d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramListLayout;
import com.google.android.material.textfield.TextInputLayout;
import f.C1667b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.Z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1849Z implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14242o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m1.b f14243p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1881r f14244q;

    public /* synthetic */ ViewOnClickListenerC1849Z(C1881r c1881r, m1.b bVar, int i4) {
        this.f14242o = i4;
        this.f14244q = c1881r;
        this.f14243p = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i4 = this.f14242o;
        m1.b bVar = this.f14243p;
        C1881r c1881r = this.f14244q;
        switch (i4) {
            case 0:
                ((TimeDiagramListLayout) c1881r.f14299e).f3736p.g(bVar);
                return;
            case 1:
                TimeDiagramListLayout timeDiagramListLayout = (TimeDiagramListLayout) c1881r.f14299e;
                int i5 = TimeDiagramListLayout.f3734r;
                L2.b bVar2 = new L2.b(timeDiagramListLayout.getContext());
                bVar2.s(R.string.delete_timediagram_confirmation_title);
                bVar2.q(R.string.delete, new DialogInterfaceOnClickListenerC0105d(timeDiagramListLayout, bVar, 4));
                bVar2.p(R.string.cancel, new DialogInterfaceOnClickListenerC0025z(9));
                bVar2.k();
                return;
            default:
                TimeDiagramListLayout timeDiagramListLayout2 = (TimeDiagramListLayout) c1881r.f14299e;
                int i6 = TimeDiagramListLayout.f3734r;
                L2.b bVar3 = new L2.b(timeDiagramListLayout2.getContext());
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(timeDiagramListLayout2.getContext()).inflate(R.layout.node_rename_dialog, (ViewGroup) null);
                EditText editText = (EditText) viewGroup.findViewById(R.id.edit_text);
                editText.setText(bVar.f13985b);
                bVar3.s(R.string.rename);
                ((C1667b) bVar3.f113p).f12797n = viewGroup;
                ((TextInputLayout) viewGroup.findViewById(R.id.hint_layout)).setHint(timeDiagramListLayout2.getContext().getString(R.string.timediagram_title));
                bVar3.q(R.string.save, new DialogInterfaceOnClickListenerC1845V(timeDiagramListLayout2, editText, bVar, 1));
                bVar3.p(R.string.cancel, new DialogInterfaceOnClickListenerC0025z(8));
                bVar3.k();
                return;
        }
    }
}
