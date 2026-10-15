package C0;

import android.content.DialogInterface;
import android.text.Editable;
import android.widget.EditText;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import h1.AbstractC1698a;
import java.util.Objects;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0024y implements DialogInterface.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ EditText f455o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f456p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f457q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC1698a f458r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ D f459s;

    public DialogInterfaceOnClickListenerC0024y(D d, EditText editText, String str, String str2, AbstractC1698a abstractC1698a) {
        this.f459s = d;
        this.f455o = editText;
        this.f456p = str;
        this.f457q = str2;
        this.f458r = abstractC1698a;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        Editable text = this.f455o.getText();
        if (text == null) {
            return;
        }
        String obj = text.toString();
        String str = this.f456p;
        if (str != null) {
            if (Objects.equals(obj, str)) {
                return;
            }
        } else if (Objects.equals(obj, this.f457q)) {
            return;
        }
        AbstractC1698a abstractC1698a = this.f458r;
        boolean z4 = abstractC1698a instanceof p1.e0;
        D d = this.f459s;
        if (z4) {
            p1.e0 e0Var = (p1.e0) abstractC1698a;
            int i5 = e0Var.f14518Q;
            boolean z5 = e0Var.f14519R;
            d.f202i0.d(new M0.a(i5, z5, obj, i5, z5, e0Var.f14517P, e0Var.f13117A));
            return;
        }
        BoardView boardView = d.f202i0;
        long j4 = abstractC1698a.f13117A;
        String str2 = this.f456p;
        boardView.d(new H0.b(j4, str2, obj, str2 == null));
    }
}
