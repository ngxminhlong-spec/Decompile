package C0;

import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.UploadDialog;
import com.google.android.gms.internal.ads.C0326Qb;
import f.DialogC1670e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class T implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public float f250o = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    public boolean f251p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0326Qb f252q;

    public T(C0326Qb c0326Qb) {
        this.f252q = c0326Qb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0326Qb c0326Qb = this.f252q;
        DialogC1670e dialogC1670e = (DialogC1670e) c0326Qb.f6659o;
        UploadDialog uploadDialog = (UploadDialog) c0326Qb.f6660p;
        if (dialogC1670e.isShowing()) {
            float f4 = this.f250o;
            if (f4 < 0.9d) {
                float f5 = f4 + 0.1f;
                this.f250o = f5;
                uploadDialog.setProgress(f5);
                uploadDialog.postDelayed(this, 540L);
                return;
            }
            if (this.f251p) {
                uploadDialog.f3781o.setText(R.string.upload_successful);
                uploadDialog.f3782p.setVisibility(4);
                uploadDialog.f3784r.setVisibility(0);
                uploadDialog.findViewById(R.id.success_check).setVisibility(0);
            }
        }
    }
}
