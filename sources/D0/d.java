package D0;

import C0.A0;
import C0.C;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.IcSetup;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramListLayout;
import com.google.android.gms.internal.ads.C0783ji;
import com.google.android.gms.internal.measurement.C1510e1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d3.AbstractC1654b;
import e1.EnumC1662c;
import f.AbstractActivityC1671f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m1.InterfaceC1805a;
import m2.AbstractC1806a;
import o1.DialogC1878o;
import o1.InterfaceC1827C;
import o1.InterfaceC1861f0;
import o1.InterfaceC1883t;
import p1.C1912J;
import q1.AbstractC1959n;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d implements InterfaceC1827C, InterfaceC1883t, InterfaceC1805a, InterfaceC1861f0 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f535o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g f536p;

    public /* synthetic */ d(g gVar, int i4) {
        this.f535o = i4;
        this.f536p = gVar;
    }

    @Override // o1.InterfaceC1827C
    public void a() {
        switch (this.f535o) {
            case 0:
                g.P(this.f536p, new c(this, 0));
                return;
            default:
                AbstractActivityC1671f h4 = this.f536p.h();
                if (h4 == null) {
                    return;
                }
                DialogC1878o.a(h4, 5).show();
                return;
        }
    }

    @Override // o1.InterfaceC1827C
    public void b() {
        g.P(this.f536p, new c(this, 1));
    }

    @Override // o1.InterfaceC1827C
    public void c() {
        g.P(this.f536p, new A0.a(22, this));
    }

    @Override // o1.InterfaceC1827C
    public void e(boolean z4) {
        g gVar = this.f536p;
        AbstractActivityC1671f h4 = gVar.h();
        if (h4 == null) {
            return;
        }
        SharedPreferences.Editor edit = h4.getPreferences(0).edit();
        edit.putBoolean("labels_visible", z4);
        edit.apply();
        AbstractC1806a.f14021c0 = Boolean.valueOf(z4);
        gVar.f566h0.setLabelsVisible(z4);
        gVar.f566h0.invalidate();
    }

    @Override // o1.InterfaceC1827C
    public boolean f(boolean z4) {
        g gVar = this.f536p;
        AbstractActivityC1671f h4 = gVar.h();
        if (h4 == null) {
            return false;
        }
        SharedPreferences.Editor edit = h4.getPreferences(0).edit();
        edit.putBoolean("enable_snapping", z4);
        edit.apply();
        AbstractC1806a.f14018a0 = Boolean.valueOf(z4);
        gVar.f566h0.setSnappingEnabled(z4);
        gVar.f566h0.invalidate();
        return true;
    }

    @Override // o1.InterfaceC1827C
    public void g(int i4) {
        A0 a02 = this.f536p.f574p0;
        if (a02 != null) {
            ((MainActivity) a02).C(i4);
        }
    }

    @Override // o1.InterfaceC1827C
    public /* synthetic */ void h() {
    }

    @Override // o1.InterfaceC1827C
    public void i(boolean z4) {
        g gVar = this.f536p;
        if (gVar.h() == null) {
            return;
        }
        SharedPreferences.Editor edit = gVar.h().getPreferences(0).edit();
        edit.putBoolean("show_grid", z4);
        edit.apply();
        AbstractC1806a.f14016Z = Boolean.valueOf(z4);
        gVar.f566h0.setGridVisibility(z4);
        gVar.f566h0.invalidate();
    }

    @Override // m1.InterfaceC1805a
    public boolean j(j1.b bVar) {
        e1.d circuit = this.f536p.f566h0.getCircuit();
        if (circuit == null) {
            return false;
        }
        O0.a c = bVar.c(circuit);
        if (c instanceof C1912J) {
            return ((C1912J) c).f14421H;
        }
        return false;
    }

    @Override // o1.InterfaceC1827C
    public /* synthetic */ void k() {
    }

    @Override // o1.InterfaceC1827C
    public void l() {
        g.P(this.f536p, new c(this, 3));
    }

    @Override // o1.InterfaceC1827C
    public void m(boolean z4) {
        A0 a02 = this.f536p.f574p0;
        if (a02 != null) {
            ((MainActivity) a02).B(z4);
        }
    }

    @Override // o1.InterfaceC1883t
    public void n() {
        g gVar = this.f536p;
        gVar.Z();
        gVar.h0(EnumC1662c.f12676p);
    }

    @Override // o1.InterfaceC1827C
    public boolean o(boolean z4) {
        g gVar = this.f536p;
        AbstractActivityC1671f h4 = gVar.h();
        if (h4 == null) {
            return false;
        }
        SharedPreferences.Editor edit = h4.getPreferences(0).edit();
        edit.putBoolean("enable_vibration", z4);
        edit.apply();
        AbstractC1806a.f14020b0 = Boolean.valueOf(z4);
        gVar.f566h0.setVibrateOnPath(z4);
        return true;
    }

    @Override // o1.InterfaceC1861f0
    public void onClick(View view) {
        g gVar = this.f536p;
        C c = gVar.f563Y0;
        int id = view.getId();
        AbstractActivityC1671f h4 = gVar.h();
        if (h4 == null) {
            return;
        }
        if (gVar.f558T0) {
            Toast.makeText(gVar.l(), R.string.can_perform_while_timediagram, 1).show();
            return;
        }
        if (id == R.id.cut) {
            gVar.T();
            if (gVar.f566h0.c()) {
                gVar.l0(R.string.cut_success);
                return;
            } else {
                gVar.l0(R.string.cut_fail);
                return;
            }
        }
        if (id == R.id.copy) {
            gVar.T();
            gVar.l0(R.string.copy_success);
            return;
        }
        int i4 = 0;
        if (id == R.id.paste) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : gVar.f577s0.entrySet()) {
                hashMap2.put((Long) entry.getKey(), (Integer) entry.getValue());
            }
            AbstractActivityC1671f h5 = gVar.h();
            if (h5 != null && !AbstractC1959n.d(h5) && !AbstractC1959n.b(h5) && !AbstractC1959n.c(h5)) {
                for (W0.a aVar : hashMap.values()) {
                    if (!(aVar instanceof V0.a) && !(aVar instanceof Y0.a)) {
                        i4++;
                    }
                }
                if (gVar.d0(h5, i4)) {
                    ((MainActivity) gVar.f574p0).E(R.string.limited_num_message);
                    return;
                }
            }
            gVar.f566h0.j(hashMap, hashMap2);
            gVar.l0(R.string.paste_success);
            return;
        }
        if (id == R.id.delete) {
            if (gVar.f566h0.c()) {
                gVar.l0(R.string.delete_success);
                return;
            } else {
                gVar.l0(R.string.delete_fail);
                return;
            }
        }
        EnumC1662c enumC1662c = EnumC1662c.f12675o;
        if (id == R.id.single_select) {
            gVar.h0(enumC1662c);
            return;
        }
        if (id == R.id.multi_select) {
            gVar.f566h0.removeCallbacks(c);
            c.f166p = 2;
            gVar.f566h0.postDelayed(c, 300L);
            gVar.h0(EnumC1662c.f12677q);
            return;
        }
        if (id == R.id.interact) {
            gVar.f566h0.removeCallbacks(c);
            c.f166p = 3;
            gVar.f566h0.postDelayed(c, 300L);
            gVar.h0(EnumC1662c.f12679s);
            return;
        }
        if (id == R.id.connect_mode) {
            gVar.h0(EnumC1662c.f12678r);
            return;
        }
        if (id == R.id.element_info_control) {
            gVar.i0(gVar.Y());
            AbstractC1654b.a(h4, 3);
            return;
        }
        if (id == R.id.element_setup_control) {
            gVar.h0(enumC1662c);
            d dVar = gVar.J0;
            if (gVar.f579u0) {
                ViewGroup viewGroup = (ViewGroup) gVar.f580v0.findViewById(R.id.info_baloon_content);
                gVar.f580v0.setVisibility(0);
                ((TextView) gVar.f580v0.findViewById(R.id.info_baloon_title)).setText(R.string.setup_io_title);
                viewGroup.removeAllViews();
                IcSetup icSetup = (IcSetup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ic_setup_dialog, viewGroup, false);
                icSetup.c(gVar.f566h0.getNodeInfos(), gVar.f566h0.getInnerLinks(), gVar.f565g0.f13260b);
                icSetup.setListener(dVar);
                viewGroup.addView(icSetup);
            } else {
                gVar.a0();
                ViewGroup viewGroup2 = (ViewGroup) gVar.f571m0.findViewById(R.id.setup_io);
                viewGroup2.setVisibility(0);
                IcSetup icSetup2 = (IcSetup) viewGroup2.findViewById(R.id.ic_setup_layout);
                icSetup2.c(gVar.f566h0.getNodeInfos(), gVar.f566h0.getInnerLinks(), gVar.f565g0.f13260b);
                icSetup2.setListener(dVar);
                BottomSheetBehavior.w(gVar.f567i0).z(3);
                gVar.l0(R.string.setup_io_title);
            }
            AbstractC1654b.a(h4, 3);
            return;
        }
        if (id != R.id.element_timediagram) {
            if (id != R.id.rename_element_control && id == R.id.rotate_element_control) {
                if (gVar.f566h0.l()) {
                    gVar.l0(R.string.rotate_success);
                    return;
                } else {
                    gVar.l0(R.string.rotate_fail);
                    return;
                }
            }
            return;
        }
        gVar.h0(enumC1662c);
        if (gVar.f579u0) {
            ViewGroup viewGroup3 = (ViewGroup) gVar.f580v0.findViewById(R.id.info_baloon_content);
            gVar.f580v0.setVisibility(0);
            ((TextView) gVar.f580v0.findViewById(R.id.info_baloon_title)).setText(R.string.timediagrams_title);
            viewGroup3.removeAllViews();
            ArrayList<m1.b> timeDiagrams = gVar.f566h0.getTimeDiagrams();
            TimeDiagramListLayout timeDiagramListLayout = (TimeDiagramListLayout) LayoutInflater.from(viewGroup3.getContext()).inflate(R.layout.timediagrams_dialog, viewGroup3, false);
            timeDiagramListLayout.setInterface(new C1510e1(6, gVar, timeDiagrams));
            timeDiagramListLayout.a(timeDiagrams);
            viewGroup3.addView(timeDiagramListLayout);
            return;
        }
        gVar.a0();
        ViewGroup viewGroup4 = (ViewGroup) gVar.f571m0.findViewById(R.id.timediagrams);
        viewGroup4.setVisibility(0);
        ArrayList<m1.b> timeDiagrams2 = gVar.f566h0.getTimeDiagrams();
        TimeDiagramListLayout timeDiagramListLayout2 = (TimeDiagramListLayout) viewGroup4.findViewById(R.id.timediagrams_list_layout);
        timeDiagramListLayout2.setInterface(new C0783ji(gVar, timeDiagrams2, 6, false));
        timeDiagramListLayout2.a(timeDiagrams2);
        BottomSheetBehavior.w(gVar.f567i0).z(3);
        gVar.l0(R.string.timediagrams_title);
    }

    @Override // o1.InterfaceC1827C
    public void p(int i4) {
        g gVar = this.f536p;
        if (gVar.h() == null) {
            return;
        }
        SharedPreferences.Editor edit = gVar.h().getPreferences(0).edit();
        edit.putString("units", n0.a.l(i4));
        edit.apply();
        AbstractC1806a.f14040m0 = i4;
        gVar.f564Z0 = i4;
        gVar.f566h0.setGridProperties(gVar.X());
        gVar.f566h0.invalidate();
    }

    @Override // o1.InterfaceC1827C
    public /* synthetic */ void q() {
    }

    @Override // o1.InterfaceC1883t
    public void s() {
    }

    @Override // o1.InterfaceC1827C
    public void t() {
        g.P(this.f536p, new c(this, 2));
    }
}
