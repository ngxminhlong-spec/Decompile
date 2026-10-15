package o1;

import C0.DialogInterfaceOnClickListenerC0025z;
import Q1.DialogInterfaceOnClickListenerC0105d;
import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.ColorPicker;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramLayout;
import com.google.android.material.textfield.TextInputLayout;
import f.C1667b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.W, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1846W implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14235o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m1.c f14236p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1881r f14237q;

    public /* synthetic */ ViewOnClickListenerC1846W(C1881r c1881r, m1.c cVar, int i4) {
        this.f14235o = i4;
        this.f14237q = c1881r;
        this.f14236p = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i4 = this.f14235o;
        m1.c cVar = this.f14236p;
        C1881r c1881r = this.f14237q;
        switch (i4) {
            case 0:
                TimeDiagramLayout timeDiagramLayout = (TimeDiagramLayout) c1881r.f14299e;
                int i5 = TimeDiagramLayout.f3724x;
                L2.b bVar = new L2.b(timeDiagramLayout.getContext());
                bVar.s(R.string.delete_timediagram_delete_entry);
                bVar.q(R.string.delete, new DialogInterfaceOnClickListenerC0105d(timeDiagramLayout, cVar, 3));
                bVar.p(R.string.cancel, new DialogInterfaceOnClickListenerC0025z(7));
                bVar.k();
                return;
            case 1:
                TimeDiagramLayout timeDiagramLayout2 = (TimeDiagramLayout) c1881r.f14299e;
                int i6 = TimeDiagramLayout.f3724x;
                L2.b bVar2 = new L2.b(timeDiagramLayout2.getContext());
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(timeDiagramLayout2.getContext()).inflate(R.layout.node_rename_dialog, (ViewGroup) null);
                EditText editText = (EditText) viewGroup.findViewById(R.id.edit_text);
                editText.setText(cVar.f13989b);
                bVar2.s(R.string.timediagram_entry_title);
                ((C1667b) bVar2.f113p).f12797n = viewGroup;
                ((TextInputLayout) viewGroup.findViewById(R.id.hint_layout)).setHint(timeDiagramLayout2.getContext().getString(R.string.entry));
                bVar2.q(R.string.save, new DialogInterfaceOnClickListenerC1845V(timeDiagramLayout2, editText, cVar, 0));
                bVar2.p(R.string.cancel, new DialogInterfaceOnClickListenerC0025z(6));
                bVar2.k();
                return;
            default:
                TimeDiagramLayout timeDiagramLayout3 = (TimeDiagramLayout) c1881r.f14299e;
                int i7 = TimeDiagramLayout.f3724x;
                AlertDialog.Builder builder = new AlertDialog.Builder(timeDiagramLayout3.getContext());
                ColorPicker colorPicker = (ColorPicker) LayoutInflater.from(timeDiagramLayout3.getContext()).inflate(R.layout.color_picker_layout, (ViewGroup) null);
                builder.setMessage(R.string.color_timediagram_entry_msg);
                builder.setTitle(R.string.color_timediagram_entry_title);
                builder.setView(colorPicker);
                colorPicker.setListener(new q2.e(timeDiagramLayout3, cVar, builder.show()));
                return;
        }
    }
}
