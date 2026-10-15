package C0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.CircuitExploreDialog;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d3.AbstractC1654b;
import f.AbstractActivityC1671f;
import h1.AbstractC1698a;
import p1.C1921g;
import q1.AbstractC1959n;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0006f implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f311o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D f312p;

    public /* synthetic */ ViewOnClickListenerC0006f(D d, int i4) {
        this.f311o = i4;
        this.f312p = d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z4;
        switch (this.f311o) {
            case 0:
                D d = this.f312p;
                AbstractActivityC1671f h4 = d.h();
                if (h4 != null) {
                    AbstractC1654b.a(h4, 3);
                }
                AbstractC1698a selectedElement = d.f202i0.getSelectedElement();
                if (!(selectedElement instanceof e1.d)) {
                    if ((selectedElement instanceof C1921g) || (selectedElement instanceof p1.b0)) {
                        return;
                    }
                    d.l0(d.Z());
                    return;
                }
                e1.d dVar = (e1.d) selectedElement;
                Context l4 = d.l();
                if (l4 == null) {
                    return;
                }
                d.f185T0.removeAllViews();
                CircuitExploreDialog circuitExploreDialog = (CircuitExploreDialog) LayoutInflater.from(l4).inflate(R.layout.explore_circuit_layout, (ViewGroup) null);
                d.f186U0 = circuitExploreDialog;
                circuitExploreDialog.setListener(new C0008h(d, 4));
                d.f186U0.a((P0.a) dVar.d(0L), d.Y());
                d.f185T0.addView(d.f186U0);
                d.f185T0.setVisibility(0);
                return;
            case 1:
                D d4 = this.f312p;
                AbstractActivityC1671f h5 = d4.h();
                if (h5 == null || d4.f179M0) {
                    return;
                }
                d4.t0(h5);
                return;
            case 2:
                this.f312p.c0();
                return;
            case 3:
                D d5 = this.f312p;
                if (d5.k1) {
                    Toast.makeText(d5.l(), R.string.can_perform_while_timediagram, 1).show();
                    return;
                }
                BottomSheetBehavior w2 = BottomSheetBehavior.w(d5.f204j0);
                int i4 = w2.f12319x;
                if (i4 == 3) {
                    w2.z(4);
                    return;
                }
                if (i4 != 4 || d5.c0()) {
                    return;
                }
                d5.f226y0 = d5.f221t0.getText().toString();
                d5.b0();
                d5.f215p0.findViewById(R.id.bottom_elements).setVisibility(0);
                d5.s0(R.string.select_element_to_add);
                BottomSheetBehavior.w(d5.f204j0).z(3);
                AbstractActivityC1671f h6 = d5.h();
                if (h6 == null) {
                    return;
                }
                Boolean bool = AbstractC1654b.f12607f;
                if (bool != null) {
                    z4 = bool.booleanValue();
                } else {
                    z4 = h6.getPreferences(0).getBoolean("rate_shown", false);
                    AbstractC1654b.f12607f = Boolean.valueOf(z4);
                }
                if (z4 || AbstractC1654b.x(h6) < 40) {
                    return;
                }
                if (AbstractC1959n.d(h6) || AbstractC1959n.b(h6) || AbstractC1959n.c(h6)) {
                    AbstractC1654b.E("LAUNCH_215");
                    if (AbstractC1959n.b(h6)) {
                        AbstractC1654b.E("LAUNCH_216");
                    }
                    d5.f187V0.setAlpha(0.0f);
                    d5.f187V0.setVisibility(0);
                    d5.f187V0.animate().alpha(1.0f).setDuration(200L).start();
                    ViewOnClickListenerC0004d viewOnClickListenerC0004d = new ViewOnClickListenerC0004d(d5, h6, 0);
                    d5.f187V0.findViewById(R.id.rate_us_1_stars).setOnClickListener(viewOnClickListenerC0004d);
                    d5.f187V0.findViewById(R.id.rate_us_2_stars).setOnClickListener(viewOnClickListenerC0004d);
                    d5.f187V0.findViewById(R.id.rate_us_3_stars).setOnClickListener(viewOnClickListenerC0004d);
                    d5.f187V0.findViewById(R.id.rate_us_4_stars).setOnClickListener(viewOnClickListenerC0004d);
                    d5.f187V0.findViewById(R.id.rate_us_five_stars).setOnClickListener(new ViewOnClickListenerC0014n(2, d5, h6));
                    return;
                }
                return;
            case 4:
                this.f312p.f202i0.m();
                return;
            default:
                D d6 = this.f312p;
                if (d6.f169B0.getVisibility() == 0) {
                    d6.c0();
                    return;
                } else {
                    BottomSheetBehavior.w(d6.f204j0).z(4);
                    return;
                }
        }
    }
}
