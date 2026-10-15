package D0;

import C0.DialogInterfaceOnDismissListenerC0023x;
import C0.ViewOnClickListenerC0020u;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.InsertProjectLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d1.AbstractC1651b;
import d3.AbstractC1654b;
import e1.EnumC1662c;
import f.AbstractActivityC1671f;
import o1.DialogC1832H;
import o1.DialogC1878o;
import o1.InterfaceC1847X;
import o1.InterfaceC1859e0;
import o1.InterfaceC1864h;
import o1.InterfaceC1886w;
import o2.AbstractC1895f;
import q1.AbstractC1955j;
import q1.AbstractC1959n;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b implements InterfaceC1864h, InterfaceC1847X, InterfaceC1886w, InterfaceC1859e0 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f531o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g f532p;

    public /* synthetic */ b(g gVar, int i4) {
        this.f531o = i4;
        this.f532p = gVar;
    }

    @Override // o1.InterfaceC1847X
    public void a() {
        switch (this.f531o) {
            case 1:
                AbstractActivityC1671f h4 = this.f532p.h();
                if (h4 == null) {
                    return;
                }
                DialogC1878o.a(h4, 7).show();
                return;
            default:
                AbstractActivityC1671f h5 = this.f532p.h();
                if (h5 == null) {
                    return;
                }
                DialogC1878o.a(h5, 5).show();
                return;
        }
    }

    @Override // o1.InterfaceC1847X
    public void b() {
        g gVar = this.f532p;
        Context l4 = gVar.l();
        if (l4 == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            intent.addFlags(2);
            gVar.J(intent, 2);
        } catch (Throwable unused) {
            Toast.makeText(l4, R.string.no_activity_to_import, 1).show();
        }
    }

    @Override // o1.InterfaceC1859e0
    public void c() {
        g gVar = this.f532p;
        Context l4 = gVar.l();
        if (l4 == null || i1.c.i(l4, gVar.f565g0.f13259a)) {
            return;
        }
        gVar.g0(new C1.g(4, gVar));
    }

    @Override // o1.InterfaceC1847X
    public void d() {
        g gVar = this.f532p;
        Context l4 = gVar.l();
        if (l4 != null && !i1.c.i(l4, gVar.f565g0.f13259a)) {
            gVar.g0(new C1.g(4, gVar));
        }
        gVar.f584z0.setVisibility(8);
        gVar.f581w0.setVisibility(8);
        gVar.f584z0.setTimeDiagram(null);
        gVar.f566h0.invalidate();
    }

    @Override // o1.InterfaceC1847X
    public void e(m1.b bVar) {
        g gVar = this.f532p;
        gVar.f584z0.setVisibility(8);
        gVar.f581w0.setVisibility(0);
        gVar.f581w0.findViewById(R.id.timediagram_recording_rec).setVisibility(8);
        View findViewById = gVar.f581w0.findViewById(R.id.timediagram_stop_rec);
        findViewById.setVisibility(8);
        View findViewById2 = gVar.f581w0.findViewById(R.id.timediagram_start_rec);
        findViewById2.setVisibility(0);
        findViewById2.setOnClickListener(new ViewOnClickListenerC0020u(gVar, findViewById2, findViewById, bVar, 3));
    }

    @Override // o1.InterfaceC1859e0
    public void f() {
        g gVar = this.f532p;
        gVar.f569k0.setDrawerLockMode(0);
        gVar.f569k0.n(8388613);
    }

    @Override // o1.InterfaceC1859e0
    public void g() {
        g gVar = this.f532p;
        if (gVar.f558T0) {
            Toast.makeText(gVar.l(), R.string.can_perform_while_timediagram, 1).show();
        } else if (gVar.f566h0.k()) {
            gVar.l0(R.string.redo_success);
        } else {
            gVar.l0(R.string.redo_fail);
        }
    }

    @Override // o1.InterfaceC1847X
    public void h() {
        g gVar = this.f532p;
        gVar.f584z0.setVisibility(8);
        gVar.h0(EnumC1662c.f12676p);
    }

    @Override // o1.InterfaceC1859e0
    public void i() {
        g gVar = this.f532p;
        if (gVar.f558T0) {
            Toast.makeText(gVar.l(), R.string.can_perform_while_timediagram, 1).show();
        } else if (((e1.d) gVar.f566h0.f3821o.f14880o).R()) {
            gVar.l0(R.string.undo_success);
        } else {
            gVar.l0(R.string.undo_fail);
        }
    }

    @Override // o1.InterfaceC1886w
    public void j(i1.d dVar) {
        P0.a aVar = dVar.f13263g;
        g gVar = this.f532p;
        gVar.f566h0.b((P0.a) aVar.a(gVar.f566h0.getNextElementId()));
        if (gVar.l() != null) {
            Toast.makeText(gVar.l(), R.string.added_element, 0).show();
        }
        gVar.Z();
    }

    @Override // o1.InterfaceC1859e0
    public void l() {
        g gVar = this.f532p;
        if (gVar.K() || gVar.h() == null) {
            return;
        }
        gVar.h().onBackPressed();
    }

    @Override // o1.InterfaceC1864h
    public void m(int i4) {
        g gVar = this.f532p;
        e eVar = gVar.f556R0;
        if (i4 == 5) {
            gVar.h0(EnumC1662c.f12678r);
            BottomSheetBehavior.w(gVar.f567i0).z(4);
            return;
        }
        if (i4 == 2) {
            b bVar = gVar.f550K0;
            if (!gVar.f579u0) {
                gVar.a0();
                ViewGroup viewGroup = (ViewGroup) gVar.f571m0.findViewById(R.id.insert_projects);
                viewGroup.setVisibility(0);
                InsertProjectLayout insertProjectLayout = (InsertProjectLayout) viewGroup.findViewById(R.id.insert_project_bottom_layout);
                insertProjectLayout.a(gVar.f565g0.f13259a);
                insertProjectLayout.setInterface(bVar);
                BottomSheetBehavior.w(gVar.f567i0).z(3);
                gVar.f575q0.setText(R.string.add_ic_title);
                gVar.f576r0.setPressed(true);
                gVar.f576r0.postDelayed(eVar, 100L);
            } else if (BottomSheetBehavior.w(gVar.f567i0).f12319x == 3) {
                BottomSheetBehavior.w(gVar.f567i0).z(4);
            } else {
                ViewGroup viewGroup2 = (ViewGroup) gVar.f580v0.findViewById(R.id.info_baloon_content);
                gVar.f580v0.setVisibility(0);
                ((TextView) gVar.f580v0.findViewById(R.id.info_baloon_title)).setText(R.string.add_ic_title);
                viewGroup2.removeAllViews();
                InsertProjectLayout insertProjectLayout2 = (InsertProjectLayout) LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.insert_project_layout, viewGroup2, false);
                insertProjectLayout2.setInterface(bVar);
                insertProjectLayout2.a(gVar.f565g0.f13259a);
                viewGroup2.addView(insertProjectLayout2);
            }
            AbstractActivityC1671f h4 = gVar.h();
            if (h4 != null) {
                AbstractC1654b.a(h4, 5);
                return;
            }
            return;
        }
        AbstractActivityC1671f h5 = gVar.h();
        if (h5 == null) {
            return;
        }
        if ((AbstractC1959n.d(h5) || AbstractC1959n.b(h5) || AbstractC1959n.c(h5)) ? false : gVar.d0(h5, 1)) {
            ((MainActivity) gVar.f574p0).E(R.string.limited_num_message);
            return;
        }
        gVar.f566h0.a(i4);
        Toast.makeText(h5, R.string.added_element, 0).show();
        Context l4 = gVar.l();
        if (l4 != null) {
            l4.getString(AbstractC1955j.f14695w.get(i4));
        }
        if (i4 == 50 || i4 == 39 || i4 == 40 || i4 == 41) {
            gVar.i0(i4);
            gVar.f575q0.setText(AbstractC1651b.a(i4));
            gVar.f576r0.setPressed(true);
            gVar.f576r0.postDelayed(eVar, 100L);
            gVar.f557S0 = true;
        }
        AbstractC1654b.a(h5, 2);
        if (i4 == 65) {
            if (AbstractC1895f.g(h5, "android.permission.RECORD_AUDIO") == 0) {
                return;
            }
            if (!h5.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                gVar.C(new String[]{"android.permission.RECORD_AUDIO"});
                return;
            }
            try {
                DialogC1832H dialogC1832H = new DialogC1832H(h5);
                dialogC1832H.setOnDismissListener(new DialogInterfaceOnDismissListenerC0023x(gVar, dialogC1832H, 1));
                dialogC1832H.show();
            } catch (Throwable unused) {
            }
        }
    }
}
