package C0;

import android.content.DialogInterface;
import android.text.Editable;
import android.widget.EditText;
import android.widget.Toast;
import c1.C0234c;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.IcSetup;
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import o1.InterfaceC1883t;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h0 implements DialogInterface.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f324o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ EditText f325p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f326q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f327r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f328s;

    public /* synthetic */ h0(Object obj, EditText editText, Object obj2, int i4, int i5) {
        this.f324o = i5;
        this.f328s = obj;
        this.f325p = editText;
        this.f326q = obj2;
        this.f327r = i4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        int i5;
        Object obj;
        switch (this.f324o) {
            case 0:
                j0 j0Var = (j0) this.f328s;
                i1.d dVar = (i1.d) this.f326q;
                Editable text = this.f325p.getText();
                if (text == null) {
                    return;
                }
                String obj2 = text.toString();
                if (Objects.equals(obj2, dVar.f13260b)) {
                    return;
                }
                dVar.f13260b = obj2;
                i1.c.j(null, dVar, new File(i1.c.g(((v0) j0Var.f334f).l())), null);
                j0Var.e(this.f327r);
                return;
            case 1:
                j0 j0Var2 = (j0) this.f328s;
                i1.d dVar2 = (i1.d) this.f326q;
                Editable text2 = this.f325p.getText();
                if (text2 == null) {
                    return;
                }
                String obj3 = text2.toString();
                if (Objects.equals(obj3, dVar2.f13260b)) {
                    return;
                }
                dVar2.f13260b = obj3;
                i1.c.j(null, dVar2, new File(i1.c.g(((D0.p) j0Var2.f334f).l())), null);
                j0Var2.e(this.f327r);
                return;
            default:
                C0234c c0234c = (C0234c) this.f326q;
                IcSetup icSetup = (IcSetup) this.f328s;
                Editable text3 = this.f325p.getText();
                if (text3 == null) {
                    return;
                }
                String obj4 = text3.toString();
                if (Objects.equals(obj4, c0234c.f3546o)) {
                    return;
                }
                ArrayList arrayList = icSetup.f3620B;
                int size = arrayList.size();
                int i6 = 0;
                do {
                    i5 = this.f327r;
                    if (i6 >= size) {
                        icSetup.f3621C.put(obj4, (j1.b) icSetup.f3621C.remove(c0234c.f3546o));
                        c0234c.f3546o = obj4;
                        icSetup.b();
                        icSetup.f3619A.e(i5);
                        InterfaceC1883t interfaceC1883t = icSetup.y;
                        if (interfaceC1883t != null) {
                            interfaceC1883t.s();
                            return;
                        }
                        return;
                    }
                    obj = arrayList.get(i6);
                    i6++;
                } while (!Objects.equals(((C0234c) obj).f3546o, obj4));
                Toast.makeText(icSetup.getContext(), R.string.node_name_err, 1).show();
                IcSetup.a(icSetup, i5);
                return;
        }
    }
}
