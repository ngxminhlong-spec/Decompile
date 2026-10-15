package o1;

import C0.DialogInterfaceOnClickListenerC0025z;
import Q1.DialogInterfaceOnClickListenerC0105d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TextSetup;
import com.google.android.material.textfield.TextInputLayout;
import f.C1667b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1842S implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14227o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ TextSetup f14228p;

    public /* synthetic */ ViewOnClickListenerC1842S(TextSetup textSetup, int i4) {
        this.f14227o = i4;
        this.f14228p = textSetup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i4 = this.f14227o;
        TextSetup textSetup = this.f14228p;
        switch (i4) {
            case 0:
                textSetup.f3721v.h(((Integer) textSetup.f3722w.get(Integer.valueOf(textSetup.f3714o.getSelectedPos()))).intValue(), textSetup.f3716q.getText().toString(), textSetup.f3715p.isChecked());
                return;
            default:
                int i5 = TextSetup.y;
                L2.b bVar = new L2.b(textSetup.getContext());
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(textSetup.getContext()).inflate(R.layout.node_rename_dialog, (ViewGroup) null);
                EditText editText = (EditText) viewGroup.findViewById(R.id.edit_text);
                editText.setText(textSetup.f3716q.getText());
                bVar.s(R.string.text);
                ((C1667b) bVar.f113p).f12797n = viewGroup;
                ((TextInputLayout) viewGroup.findViewById(R.id.hint_layout)).setHint(textSetup.getContext().getString(R.string.text));
                bVar.q(R.string.save, new DialogInterfaceOnClickListenerC0105d(textSetup, editText, 2));
                bVar.p(R.string.cancel, new DialogInterfaceOnClickListenerC0025z(5));
                bVar.k();
                return;
        }
    }
}
