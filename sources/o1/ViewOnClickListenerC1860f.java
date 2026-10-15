package o1;

import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.ui.EditProfileDialog;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1860f implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14261o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ EditProfileDialog f14262p;

    public /* synthetic */ ViewOnClickListenerC1860f(EditProfileDialog editProfileDialog, int i4) {
        this.f14261o = i4;
        this.f14262p = editProfileDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14261o) {
            case 0:
                InterfaceC1862g interfaceC1862g = this.f14262p.f3608o;
                if (interfaceC1862g != null) {
                    interfaceC1862g.e();
                    return;
                }
                return;
            case 1:
                InterfaceC1862g interfaceC1862g2 = this.f14262p.f3608o;
                if (interfaceC1862g2 != null) {
                    interfaceC1862g2.c();
                    return;
                }
                return;
            case 2:
                InterfaceC1862g interfaceC1862g3 = this.f14262p.f3608o;
                if (interfaceC1862g3 != null) {
                    interfaceC1862g3.onCancel();
                    return;
                }
                return;
            default:
                InterfaceC1862g interfaceC1862g4 = this.f14262p.f3608o;
                if (interfaceC1862g4 != null) {
                    interfaceC1862g4.onCancel();
                    return;
                }
                return;
        }
    }
}
