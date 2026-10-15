package C0;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Message;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.ShareCard;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramListLayout;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimerSetup;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TopControlsLayout;
import com.duracodefactory.logiccircuitsimulatorpro.ui.UploaderLayout;
import com.google.android.material.internal.NavigationMenuItemView;
import f.C1669d;
import j.AbstractC1719a;
import java.io.File;
import java.util.Date;
import l.B0;
import l1.C1797d;
import o1.InterfaceC1875m0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0022w implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f445o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f446p;

    public /* synthetic */ ViewOnClickListenerC0022w(int i4, Object obj) {
        this.f445o = i4;
        this.f446p = obj;
    }

    public ViewOnClickListenerC0022w(s0 s0Var, EditText editText) {
        this.f445o = 3;
        this.f446p = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        int i4 = this.f445o;
        int i5 = R.string.recording_timediagram_success;
        Message message4 = null;
        message4 = null;
        boolean z4 = true;
        Object obj = this.f446p;
        switch (i4) {
            case 0:
                ViewOnClickListenerC0020u viewOnClickListenerC0020u = (ViewOnClickListenerC0020u) obj;
                m1.b bVar = (m1.b) viewOnClickListenerC0020u.f407s;
                D d = (D) viewOnClickListenerC0020u.f404p;
                Context l4 = d.l();
                if (l4 != null) {
                    if (bVar.d.isEmpty()) {
                        i5 = R.string.recording_timediagram_fail;
                    }
                    Toast.makeText(l4, i5, 0).show();
                }
                d.o0(bVar, true);
                return;
            case 1:
                c0 c0Var = (c0) obj;
                c0Var.c();
                c0.b(c0Var);
                return;
            case 2:
                v0 v0Var = (v0) ((s0) obj).f393i;
                v0Var.f438t0.setVisibility(0);
                UploaderLayout uploaderLayout = (UploaderLayout) v0Var.f438t0.findViewById(R.id.upload_layout);
                uploaderLayout.setInterface(new x0.f(3, v0Var));
                if (uploaderLayout.f3792r != null) {
                    return;
                }
                m0 m0Var = new m0(uploaderLayout, uploaderLayout.getContext());
                uploaderLayout.f3792r = m0Var;
                m0Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                return;
            case 3:
                EditText editText = (EditText) obj;
                editText.requestFocus();
                ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 1);
                return;
            case 4:
                p0 p0Var = (p0) obj;
                C1797d c1797d = p0Var.f362p;
                r0 r0Var = p0Var.f361o;
                q0 q0Var = p0Var.f365s;
                try {
                    l1.f fVar = l1.f.f13951e;
                    Context context = r0Var.f3244a.getContext();
                    fVar.getClass();
                    i1.d c = i1.c.c(context.getResources().openRawResource(c1797d.f13942a), c1797d.d);
                    c.f13259a = i1.c.f(((v0) ((s0) q0Var.f370f).f393i).h());
                    c.f13267k = c1797d.f13943b;
                    c.f13262f = new Date();
                    i1.c.j(new x0.f(6, this), c, new File(i1.c.g(r0Var.f3244a.getContext())), null);
                    ((InputMethodManager) ((ViewGroup) ((s0) q0Var.f370f).c).getContext().getSystemService("input_method")).hideSoftInputFromWindow(((ViewGroup) ((s0) q0Var.f370f).c).getWindowToken(), 0);
                    return;
                } catch (Throwable unused) {
                    View view2 = (View) ((s0) q0Var.f370f).f391g;
                    int[] iArr = W2.n.f2054r;
                    W2.n.e(view2, view2.getResources().getText(R.string.err_import_project)).f();
                    return;
                }
            case 5:
                ViewOnClickListenerC0020u viewOnClickListenerC0020u2 = (ViewOnClickListenerC0020u) obj;
                m1.b bVar2 = (m1.b) viewOnClickListenerC0020u2.f407s;
                D0.g gVar = (D0.g) viewOnClickListenerC0020u2.f404p;
                Context l5 = gVar.l();
                if (l5 != null) {
                    if (bVar2.d.isEmpty()) {
                        i5 = R.string.recording_timediagram_fail;
                    }
                    Toast.makeText(l5, i5, 0).show();
                }
                gVar.j0(bVar2, true);
                return;
            case 6:
                c0 c0Var2 = (c0) obj;
                c0Var2.c();
                c0.a(c0Var2);
                return;
            case 7:
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
                P2.p pVar = (P2.p) obj;
                P2.h hVar = pVar.f1593s;
                if (hVar != null) {
                    hVar.f1573e = true;
                }
                k.p itemData = navigationMenuItemView.getItemData();
                boolean q4 = pVar.f1591q.q(itemData, pVar, 0);
                if (itemData != null && itemData.isCheckable() && q4) {
                    pVar.f1593s.j(itemData);
                } else {
                    z4 = false;
                }
                P2.h hVar2 = pVar.f1593s;
                if (hVar2 != null) {
                    hVar2.f1573e = false;
                }
                if (z4) {
                    pVar.h();
                    return;
                }
                return;
            case 8:
                Editable text = ((Y2.g) obj).f2184a.getEditText().getText();
                if (text != null) {
                    text.clear();
                    return;
                }
                return;
            case 9:
                Y2.m mVar = (Y2.m) obj;
                Y2.m.e(mVar, (AutoCompleteTextView) mVar.f2184a.getEditText());
                return;
            case 10:
                Y2.s sVar = (Y2.s) obj;
                EditText editText2 = sVar.f2184a.getEditText();
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                if (Y2.s.d(sVar)) {
                    editText2.setTransformationMethod(null);
                } else {
                    editText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText2.setSelection(selectionEnd);
                    return;
                }
                return;
            case 11:
                com.google.android.material.datepicker.i iVar = (com.google.android.material.datepicker.i) obj;
                int i6 = iVar.f12381k0;
                if (i6 == 2) {
                    iVar.L(1);
                    return;
                } else {
                    if (i6 == 1) {
                        iVar.L(2);
                        return;
                    }
                    return;
                }
            case 12:
                com.google.android.material.datepicker.j jVar = (com.google.android.material.datepicker.j) obj;
                Button button = jVar.f12388B0;
                jVar.getClass();
                throw null;
            case 13:
                C1669d c1669d = (C1669d) obj;
                if (view == c1669d.f12812i && (message3 = c1669d.f12814k) != null) {
                    message4 = Message.obtain(message3);
                } else if (view == c1669d.f12815l && (message2 = c1669d.f12817n) != null) {
                    message4 = Message.obtain(message2);
                } else if (view == c1669d.f12818o && (message = c1669d.f12820q) != null) {
                    message4 = Message.obtain(message);
                }
                if (message4 != null) {
                    message4.sendToTarget();
                }
                c1669d.f12804E.obtainMessage(1, c1669d.f12807b).sendToTarget();
                return;
            case 14:
                ((AbstractC1719a) obj).a();
                return;
            case 15:
                B0 b02 = ((Toolbar) obj).f2621a0;
                k.p pVar2 = b02 != null ? b02.f13581p : null;
                if (pVar2 != null) {
                    pVar2.collapseActionView();
                    return;
                }
                return;
            case 16:
                ((ShareCard) obj).setVisibility(8);
                return;
            case 17:
                ((TimeDiagramListLayout) obj).f3736p.i();
                return;
            case 18:
                TimerSetup.b((TimerSetup) obj);
                return;
            case 19:
                ((TopControlsLayout) obj).f3772o.onClick(view);
                return;
            default:
                InterfaceC1875m0 interfaceC1875m0 = ((UploaderLayout) obj).f3793s;
                if (interfaceC1875m0 != null) {
                    ((v0) ((x0.f) interfaceC1875m0).f15212p).T();
                    return;
                }
                return;
        }
    }
}
