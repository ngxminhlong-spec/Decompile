package Q1;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TextSetup;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramLayout;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramListLayout;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramView;
import java.util.ArrayList;
import o1.C1881r;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: Q1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0105d implements DialogInterface.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1685o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1686p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f1687q;

    public /* synthetic */ DialogInterfaceOnClickListenerC0105d(int i4, Object obj, Object obj2) {
        this.f1685o = i4;
        this.f1686p = obj;
        this.f1687q = obj2;
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC0105d(ViewGroup viewGroup, Object obj, int i4) {
        this.f1685o = i4;
        this.f1687q = viewGroup;
        this.f1686p = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        switch (this.f1685o) {
            case 0:
                C0111j c0111j = (C0111j) this.f1686p;
                String str = (String) this.f1687q;
                c0111j.getClass();
                N n4 = N1.n.f1204A.c;
                N.o(c0111j.f1703a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
                return;
            case 1:
                ((JsPromptResult) this.f1686p).confirm(((EditText) this.f1687q).getText().toString());
                return;
            case 2:
                TextSetup textSetup = (TextSetup) this.f1687q;
                Editable text = ((EditText) this.f1686p).getText();
                if (text == null) {
                    return;
                }
                String obj = text.toString();
                if (TextUtils.isEmpty(obj)) {
                    return;
                }
                textSetup.f3716q.setText(obj);
                textSetup.f3717r.setText(obj);
                return;
            case 3:
                C1881r c1881r = ((TimeDiagramLayout) this.f1687q).f3727q;
                c1881r.d.remove((m1.c) this.f1686p);
                c1881r.d();
                TimeDiagramLayout timeDiagramLayout = (TimeDiagramLayout) c1881r.f14299e;
                TimeDiagramView timeDiagramView = timeDiagramLayout.f3728r;
                ArrayList arrayList = c1881r.d;
                m1.b bVar = timeDiagramLayout.f3725o;
                timeDiagramView.a(arrayList, bVar.f13987f, bVar.c, bVar.f13985b);
                timeDiagramLayout.f3728r.invalidate();
                return;
            default:
                C1881r c1881r2 = ((TimeDiagramListLayout) this.f1687q).f3735o;
                c1881r2.d.remove((m1.b) this.f1686p);
                c1881r2.d();
                return;
        }
    }
}
