package o1;

import C0.A0;
import C0.v0;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.ui.UploadDialog;
import com.google.android.gms.internal.ads.C0326Qb;
import com.google.android.gms.internal.ads.C0783ji;
import com.google.android.gms.internal.ads.Jn;
import com.google.android.gms.internal.ads.Wl;
import f.DialogC1670e;
import java.io.File;
import java.util.UUID;
import l1.C1795b;
import l1.C1796c;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1871k0 implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14271o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ UploadDialog f14272p;

    public /* synthetic */ ViewOnClickListenerC1871k0(UploadDialog uploadDialog, int i4) {
        this.f14271o = i4;
        this.f14272p = uploadDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String replace;
        switch (this.f14271o) {
            case 0:
                UploadDialog uploadDialog = this.f14272p;
                if (uploadDialog.f3786t != null) {
                    uploadDialog.f3783q.setVisibility(4);
                    uploadDialog.f3782p.setVisibility(0);
                    C0326Qb c0326Qb = (C0326Qb) uploadDialog.f3786t;
                    v0 v0Var = (v0) c0326Qb.f6662r;
                    if (v0Var.f432n0 != null) {
                        C0.T t4 = new C0.T(c0326Qb);
                        ((UploadDialog) c0326Qb.f6660p).postDelayed(t4, 300L);
                        A0 a02 = v0Var.f432n0;
                        i1.d dVar = (i1.d) c0326Qb.f6661q;
                        C0783ji c0783ji = new C0783ji(c0326Qb, t4, 4, false);
                        MainActivity mainActivity = (MainActivity) a02;
                        if (mainActivity.f3574K == null) {
                            c0783ji.q();
                            return;
                        }
                        Uri fromFile = Uri.fromFile(new File(i1.c.g(mainActivity) + "/" + dVar.f13259a));
                        Wl wl = mainActivity.f3574K;
                        com.google.firebase.storage.e eVar = (com.google.firebase.storage.e) wl.f7563p;
                        String str = "new/" + UUID.randomUUID() + ".txt";
                        eVar.getClass();
                        h2.y.a("childName cannot be null or empty", !TextUtils.isEmpty(str));
                        String K2 = AbstractC1806a.K(str);
                        Uri.Builder buildUpon = eVar.f12555o.buildUpon();
                        if (TextUtils.isEmpty(K2)) {
                            replace = "";
                        } else {
                            String encode = Uri.encode(K2);
                            h2.y.i(encode);
                            replace = encode.replace("%2F", "/");
                        }
                        com.google.firebase.storage.e eVar2 = new com.google.firebase.storage.e(buildUpon.appendEncodedPath(replace).build(), eVar.f12556p);
                        h2.y.a("uri cannot be null", fromFile != null);
                        com.google.firebase.storage.m mVar = new com.google.firebase.storage.m(eVar2, fromFile);
                        if (mVar.p(2)) {
                            com.google.android.gms.internal.play_billing.B.f12129b.execute(new C0.J(2, mVar));
                        }
                        mVar.f12564b.a(new C1796c(c0783ji), null);
                        mVar.c.a(new C1795b(c0783ji), null);
                        mVar.f12566f.a(new Object(), null);
                        ((Handler) wl.f7564q).postDelayed(new Jn(19, mVar, c0783ji), 20000L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                InterfaceC1873l0 interfaceC1873l0 = this.f14272p.f3786t;
                if (interfaceC1873l0 != null) {
                    ((DialogC1670e) ((C0326Qb) interfaceC1873l0).f6659o).dismiss();
                    return;
                }
                return;
            default:
                InterfaceC1873l0 interfaceC1873l02 = this.f14272p.f3786t;
                if (interfaceC1873l02 != null) {
                    ((DialogC1670e) ((C0326Qb) interfaceC1873l02).f6659o).dismiss();
                    return;
                }
                return;
        }
    }
}
