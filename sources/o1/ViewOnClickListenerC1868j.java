package o1;

import C0.q0;
import android.view.View;
import com.android.billingclient.api.SkuDetails;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.ui.GoPremiumLayout;
import java.util.ArrayList;
import java.util.Objects;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1868j implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14265o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ GoPremiumLayout f14266p;

    public /* synthetic */ ViewOnClickListenerC1868j(GoPremiumLayout goPremiumLayout, int i4) {
        this.f14265o = i4;
        this.f14266p = goPremiumLayout;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [C0.M, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i4 = this.f14265o;
        GoPremiumLayout goPremiumLayout = this.f14266p;
        switch (i4) {
            case 0:
                goPremiumLayout.getClass();
                InterfaceC1870k interfaceC1870k = goPremiumLayout.f3613q;
                if (interfaceC1870k != null) {
                    MainActivity mainActivity = (MainActivity) ((x0.f) interfaceC1870k).f15212p;
                    int i5 = MainActivity.f3569O;
                    mainActivity.A();
                    return;
                }
                return;
            default:
                if (goPremiumLayout.f3613q != null && goPremiumLayout.f3612p.getVisibility() == 0) {
                    InterfaceC1870k interfaceC1870k2 = goPremiumLayout.f3613q;
                    q0 q0Var = goPremiumLayout.f3611o;
                    SkuDetails skuDetails = (SkuDetails) ((ArrayList) q0Var.f369e).get(q0Var.d);
                    x0.f fVar = (x0.f) interfaceC1870k2;
                    MainActivity mainActivity2 = (MainActivity) fVar.f15212p;
                    if (Objects.equals(skuDetails.a(), "lcs_1.59_monthly")) {
                        int i6 = MainActivity.f3569O;
                    } else if (Objects.equals(skuDetails.a(), "lcs_2.99_new_sixmonths2")) {
                        int i7 = MainActivity.f3569O;
                    } else if (Objects.equals(skuDetails.a(), "lcs_4.59_oneoff")) {
                        int i8 = MainActivity.f3569O;
                    }
                    E.n nVar = new E.n(skuDetails, mainActivity2, (C0.M) new Object(), new A0.a(9, fVar));
                    B0.b bVar = AbstractC1806a.N;
                    if (bVar == null || !bVar.a()) {
                        AbstractC1806a.w(mainActivity2, nVar);
                        return;
                    } else {
                        nVar.run();
                        return;
                    }
                }
                return;
        }
    }
}
