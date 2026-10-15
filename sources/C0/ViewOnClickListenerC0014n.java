package C0;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.InsertProjectLayout;
import com.duracodefactory.logiccircuitsimulatorpro.ui.UploadDialog;
import com.duracodefactory.logiccircuitsimulatorpro.ui.UploaderLayout;
import com.google.android.gms.internal.ads.C0326Qb;
import d3.AbstractC1654b;
import f.AbstractActivityC1671f;
import f.C1667b;
import f.DialogC1670e;
import o1.C1872l;
import o1.C1881r;
import o1.InterfaceC1875m0;
import o1.InterfaceC1886w;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0014n implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f348o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f349p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f350q;

    public /* synthetic */ ViewOnClickListenerC0014n(int i4, Object obj, Object obj2) {
        this.f348o = i4;
        this.f349p = obj;
        this.f350q = obj2;
    }

    public ViewOnClickListenerC0014n(View view, AbstractActivityC1671f abstractActivityC1671f) {
        this.f348o = 4;
        this.f350q = view;
        this.f349p = abstractActivityC1671f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i4;
        switch (this.f348o) {
            case 0:
                TextView textView = (TextView) this.f350q;
                D d = (D) this.f349p;
                if (d.f211n0.getVisibility() == 0) {
                    d.f211n0.setVisibility(8);
                    textView.setText(R.string.expand);
                    return;
                } else {
                    d.f211n0.setVisibility(0);
                    textView.setText(R.string.collapse);
                    return;
                }
            case 1:
                ((View) this.f350q).postDelayed(new A0.a(5, this), 600L);
                return;
            case 2:
                AbstractC1654b.E("LAUNCH_214");
                D d4 = (D) this.f349p;
                d4.d0();
                SharedPreferences.Editor edit = ((AbstractActivityC1671f) this.f350q).getPreferences(0).edit();
                edit.putBoolean("rate_shown", true);
                edit.apply();
                AbstractC1654b.f12607f = Boolean.TRUE;
                try {
                    d4.I(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.duracodefactory.logiccircuitsimulatorpro")));
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                ((v0) ((j0) this.f349p).f334f).U(((i1.d) this.f350q).f13259a, true);
                return;
            case 4:
                ((View) this.f350q).setVisibility(8);
                AbstractActivityC1671f abstractActivityC1671f = (AbstractActivityC1671f) this.f349p;
                Integer num = l1.f.f13954h;
                if (num != null) {
                    i4 = num.intValue();
                } else {
                    i4 = abstractActivityC1671f.getPreferences(0).getInt("show_shared_msg", 0);
                    l1.f.f13954h = Integer.valueOf(i4);
                }
                int i5 = i4 + 1;
                SharedPreferences.Editor edit2 = abstractActivityC1671f.getPreferences(0).edit();
                edit2.putInt("show_shared_msg", i5);
                edit2.apply();
                l1.f.f13954h = Integer.valueOf(i5);
                return;
            case 5:
                TextView textView2 = (TextView) this.f350q;
                D0.g gVar = (D0.g) this.f349p;
                if (gVar.f570l0.getVisibility() == 0) {
                    gVar.f570l0.setVisibility(8);
                    textView2.setText(R.string.expand);
                    return;
                } else {
                    gVar.f570l0.setVisibility(0);
                    textView2.setText(R.string.collapse);
                    return;
                }
            case 6:
                D0.g.Q((D0.g) this.f349p, (View) this.f350q);
                return;
            case 7:
                ((D0.p) ((j0) this.f349p).f334f).T(((i1.d) this.f350q).f13259a, true);
                return;
            case 8:
                q0 q0Var = (q0) this.f349p;
                q0Var.d = ((C1872l) this.f350q).b();
                q0Var.d();
                return;
            case 9:
                InterfaceC1886w interfaceC1886w = ((InsertProjectLayout) ((C1881r) this.f349p).f14299e).f3637r;
                if (interfaceC1886w != null) {
                    interfaceC1886w.j((i1.d) this.f350q);
                    return;
                }
                return;
            default:
                InterfaceC1875m0 interfaceC1875m0 = ((UploaderLayout) ((C1881r) this.f349p).f14299e).f3793s;
                if (interfaceC1875m0 != null) {
                    i1.d dVar = (i1.d) this.f350q;
                    v0 v0Var = (v0) ((x0.f) interfaceC1875m0).f15212p;
                    L2.b bVar = new L2.b(v0Var.l());
                    UploadDialog uploadDialog = (UploadDialog) LayoutInflater.from(v0Var.l()).inflate(R.layout.upload_dialog_layout, (ViewGroup) null);
                    String str = dVar.f13260b;
                    C1667b c1667b = (C1667b) bVar.f113p;
                    c1667b.d = str;
                    c1667b.f12797n = uploadDialog;
                    DialogC1670e k3 = bVar.k();
                    k3.setCanceledOnTouchOutside(false);
                    uploadDialog.setListener(new C0326Qb(v0Var, k3, uploadDialog, dVar));
                    return;
                }
                return;
        }
    }
}
