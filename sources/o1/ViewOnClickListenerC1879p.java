package o1;

import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.ui.IcSetup;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1879p implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14294o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ IcSetup f14295p;

    public /* synthetic */ ViewOnClickListenerC1879p(IcSetup icSetup, int i4) {
        this.f14294o = i4;
        this.f14295p = icSetup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14294o) {
            case 0:
                InterfaceC1883t interfaceC1883t = this.f14295p.y;
                if (interfaceC1883t != null) {
                    interfaceC1883t.n();
                    return;
                }
                return;
            default:
                InterfaceC1883t interfaceC1883t2 = this.f14295p.y;
                if (interfaceC1883t2 != null) {
                    interfaceC1883t2.a();
                    return;
                }
                return;
        }
    }
}
