package D0;

import com.duracodefactory.logiccircuitsimulatorpro.ui.CustomBottomSheetBehaviour;
import h1.AbstractC1698a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f extends G2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f540b;

    public /* synthetic */ f(int i4, Object obj) {
        this.f539a = i4;
        this.f540b = obj;
    }

    private final void c(int i4) {
    }

    @Override // G2.c
    public final void a(float f4) {
        switch (this.f539a) {
            case 0:
                Float.isNaN(f4);
                return;
            default:
                ((CustomBottomSheetBehaviour) this.f540b).N = f4;
                return;
        }
    }

    @Override // G2.c
    public final void b(int i4) {
        switch (this.f539a) {
            case 0:
                g gVar = (g) this.f540b;
                gVar.f578t0 = i4;
                if (i4 == 4) {
                    for (int i5 = 0; i5 < gVar.f571m0.getChildCount(); i5++) {
                        gVar.f571m0.getChildAt(i5).setVisibility(8);
                    }
                    if (gVar.f543C0) {
                        gVar.f543C0 = false;
                        AbstractC1698a selectedElement = gVar.f566h0.getSelectedElement();
                        if (selectedElement != null) {
                            gVar.i0(selectedElement.r());
                        }
                    }
                    if (gVar.f557S0) {
                        gVar.f557S0 = false;
                    }
                    gVar.f566h0.invalidate();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
