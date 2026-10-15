package o1;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramLayout;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramListLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1845V implements DialogInterface.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14231o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ EditText f14232p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f14233q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f14234r;

    public /* synthetic */ DialogInterfaceOnClickListenerC1845V(FrameLayout frameLayout, EditText editText, Object obj, int i4) {
        this.f14231o = i4;
        this.f14234r = frameLayout;
        this.f14232p = editText;
        this.f14233q = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        switch (this.f14231o) {
            case 0:
                Editable text = this.f14232p.getText();
                if (text == null) {
                    return;
                }
                String obj = text.toString();
                if (TextUtils.isEmpty(obj)) {
                    return;
                }
                ((m1.c) this.f14233q).f13989b = obj;
                TimeDiagramLayout timeDiagramLayout = (TimeDiagramLayout) this.f14234r;
                timeDiagramLayout.setTimeDiagram(timeDiagramLayout.f3725o);
                return;
            default:
                Editable text2 = this.f14232p.getText();
                if (text2 == null) {
                    return;
                }
                String obj2 = text2.toString();
                if (TextUtils.isEmpty(obj2)) {
                    return;
                }
                ((m1.b) this.f14233q).f13985b = obj2;
                ((TimeDiagramListLayout) this.f14234r).f3735o.d();
                return;
        }
    }
}
