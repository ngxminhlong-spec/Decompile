package o1;

import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.ui.PLADialog;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1829E implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14206o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ PLADialog f14207p;

    public /* synthetic */ ViewOnClickListenerC1829E(PLADialog pLADialog, int i4) {
        this.f14206o = i4;
        this.f14207p = pLADialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i4 = this.f14206o;
        PLADialog pLADialog = this.f14207p;
        switch (i4) {
            case 0:
                int i5 = PLADialog.f3670C;
                pLADialog.b();
                return;
            case 1:
                int i6 = PLADialog.f3670C;
                pLADialog.c();
                return;
            case 2:
                pLADialog.f3674p.setSelected(false);
                pLADialog.f3675q.setSelected(true);
                pLADialog.f3673o.setSelected(false);
                pLADialog.f3676r.setVisibility(8);
                pLADialog.f3677s.setVisibility(0);
                pLADialog.f3672B.setVisibility(8);
                return;
            default:
                pLADialog.f3682x.c(pLADialog.f3680v, pLADialog.f3681w);
                return;
        }
    }
}
