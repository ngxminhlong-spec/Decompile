package l1;

import C0.T;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.UploadDialog;
import com.google.android.gms.internal.ads.C0326Qb;
import com.google.android.gms.internal.ads.C0783ji;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1796c implements A2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0783ji f13941a;

    public C1796c(C0783ji c0783ji) {
        this.f13941a = c0783ji;
    }

    @Override // A2.f
    public final void b(Object obj) {
        C0783ji c0783ji = this.f13941a;
        T t4 = (T) c0783ji.f9211p;
        if (t4.f250o < 0.9d) {
            t4.f251p = true;
            return;
        }
        UploadDialog uploadDialog = (UploadDialog) ((C0326Qb) c0783ji.f9212q).f6660p;
        uploadDialog.f3781o.setText(R.string.upload_successful);
        uploadDialog.f3782p.setVisibility(4);
        uploadDialog.f3784r.setVisibility(0);
        uploadDialog.findViewById(R.id.success_check).setVisibility(0);
    }
}
