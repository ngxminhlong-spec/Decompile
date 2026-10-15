package C0;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.InsertProjectLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d1.AbstractC1651b;
import d3.AbstractC1654b;
import e1.EnumC1662c;
import f.AbstractActivityC1671f;
import i1.InterfaceC1715a;
import m1.InterfaceC1805a;
import o1.DialogC1878o;
import o1.InterfaceC1847X;
import o1.InterfaceC1859e0;
import o1.InterfaceC1864h;
import o2.AbstractC1895f;
import p1.C1912J;
import q1.AbstractC1955j;
import q1.AbstractC1959n;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009i implements InterfaceC1864h, InterfaceC1847X, InterfaceC1715a, InterfaceC1805a, InterfaceC1859e0 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ D f329o;

    public /* synthetic */ C0009i(D d) {
        this.f329o = d;
    }

    @Override // o1.InterfaceC1847X
    public void a() {
        AbstractActivityC1671f h4 = this.f329o.h();
        if (h4 == null) {
            return;
        }
        DialogC1878o.a(h4, 7).show();
    }

    @Override // o1.InterfaceC1847X
    public void b() {
        D d = this.f329o;
        Context l4 = d.l();
        if (l4 == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            intent.addFlags(2);
            d.J(intent, 2);
        } catch (Throwable unused) {
            Toast.makeText(l4, R.string.no_activity_to_import, 1).show();
        }
    }

    @Override // o1.InterfaceC1859e0
    public void c() {
        this.f329o.i0();
    }

    @Override // o1.InterfaceC1847X
    public void d() {
        this.f329o.T();
    }

    @Override // o1.InterfaceC1847X
    public void e(m1.b bVar) {
        D d = this.f329o;
        d.f173F0.setVisibility(8);
        d.f207l0.setVisibility(8);
        d.f170C0.setVisibility(0);
        d.f170C0.findViewById(R.id.timediagram_recording_rec).setVisibility(8);
        View findViewById = d.f170C0.findViewById(R.id.timediagram_stop_rec);
        findViewById.setVisibility(8);
        View findViewById2 = d.f170C0.findViewById(R.id.timediagram_start_rec);
        findViewById2.setVisibility(0);
        findViewById2.setOnClickListener(new ViewOnClickListenerC0020u(d, findViewById2, findViewById, bVar, 1));
    }

    @Override // o1.InterfaceC1859e0
    public void f() {
        D d = this.f329o;
        d.f209m0.setDrawerLockMode(0);
        d.f209m0.n(8388613);
    }

    @Override // o1.InterfaceC1859e0
    public void g() {
        D d = this.f329o;
        if (d.k1) {
            Toast.makeText(d.l(), R.string.can_perform_while_timediagram, 1).show();
        } else if (!d.f202i0.k()) {
            d.s0(R.string.redo_fail);
        } else {
            d.s0(R.string.redo_success);
            d.p0();
        }
    }

    @Override // o1.InterfaceC1847X
    public void h() {
        D d = this.f329o;
        d.f173F0.setVisibility(8);
        d.f207l0.setVisibility(8);
        d.f177K0 = true;
        d.j0(EnumC1662c.f12676p);
    }

    @Override // o1.InterfaceC1859e0
    public void i() {
        D d = this.f329o;
        if (d.k1) {
            Toast.makeText(d.l(), R.string.can_perform_while_timediagram, 1).show();
        } else if (!((e1.d) d.f202i0.f3821o.f14880o).R()) {
            d.s0(R.string.undo_fail);
        } else {
            d.s0(R.string.undo_success);
            d.p0();
        }
    }

    @Override // m1.InterfaceC1805a
    public boolean j(j1.b bVar) {
        e1.d circuit = this.f329o.f202i0.getCircuit();
        if (circuit == null) {
            return false;
        }
        O0.a c = bVar.c(circuit);
        if (c instanceof C1912J) {
            return ((C1912J) c).f14421H;
        }
        return false;
    }

    @Override // i1.InterfaceC1715a
    public void k(Throwable th) {
        D d = this.f329o;
        if (th == null) {
            d.s0(R.string.export_success);
        } else {
            d.W();
        }
    }

    @Override // o1.InterfaceC1859e0
    public void l() {
        D d = this.f329o;
        if (d.h() != null) {
            d.h().onBackPressed();
        }
    }

    @Override // o1.InterfaceC1864h
    public void m(int i4) {
        D d = this.f329o;
        r rVar = d.f201h1;
        if (i4 == 5) {
            d.j0(EnumC1662c.f12678r);
            BottomSheetBehavior.w(d.f204j0).z(4);
            return;
        }
        if (i4 == 2) {
            if (d.f168A0) {
                d.m0();
            } else {
                d.b0();
                ViewGroup viewGroup = (ViewGroup) d.f215p0.findViewById(R.id.insert_projects);
                viewGroup.setVisibility(0);
                InsertProjectLayout insertProjectLayout = (InsertProjectLayout) viewGroup.findViewById(R.id.insert_project_bottom_layout);
                insertProjectLayout.a(d.f198g0.f13259a);
                insertProjectLayout.setInterface(d.f191Z0);
                BottomSheetBehavior.w(d.f204j0).z(3);
                d.f221t0.setText(R.string.add_ic_title);
                d.f222u0.setPressed(true);
                d.f222u0.postDelayed(rVar, 100L);
            }
            AbstractActivityC1671f h4 = d.h();
            if (h4 != null) {
                AbstractC1654b.a(h4, 5);
                return;
            }
            return;
        }
        AbstractActivityC1671f h5 = d.h();
        if (h5 == null) {
            return;
        }
        if ((AbstractC1959n.d(h5) || AbstractC1959n.b(h5) || AbstractC1959n.c(h5)) ? false : d.f189X0.containsKey(Integer.valueOf(i4)) ? true : d.f0(h5, 1)) {
            ((MainActivity) d.f220s0).E(R.string.limited_num_message);
            return;
        }
        d.f202i0.a(i4);
        Toast.makeText(h5, R.string.added_element, 0).show();
        Context l4 = d.l();
        if (l4 != null) {
            l4.getString(AbstractC1955j.f14695w.get(i4));
        }
        if (i4 == 50 || i4 == 39 || i4 == 40 || i4 == 41) {
            d.l0(i4);
            d.f221t0.setText(AbstractC1651b.a(i4));
            d.f222u0.setPressed(true);
            d.f222u0.postDelayed(rVar, 100L);
            d.f205j1 = true;
        }
        if (i4 == 0 || i4 == 1 || i4 == 8 || i4 == 9 || i4 == 7 || i4 == 11 || i4 == 10 || i4 == 6 || i4 == 3 || i4 == 13 || i4 == 12 || i4 == 34 || i4 == 4 || i4 == 5 || i4 == 14 || i4 == 15 || i4 == 16 || i4 == 17 || i4 == 19 || i4 == 22 || i4 == 21 || i4 == 18 || i4 == 20 || i4 == 30 || i4 == 31 || i4 == 33 || i4 == 32 || i4 == 25 || i4 == 27 || i4 == 28 || i4 == 29 || i4 == 26 || i4 == 2 || i4 == 35 || i4 == 38 || i4 == 36 || i4 == 37 || i4 == 40 || i4 == 41 || i4 == 39 || i4 == 50 || i4 == 51 || i4 == 42 || i4 == 43 || i4 == 44 || i4 == 45 || i4 == 46 || i4 == 47 || i4 == 48 || i4 == 49 || i4 == 53 || i4 == 532 || i4 == 531 || i4 == 52 || i4 == 522 || i4 == 521 || i4 == 54 || i4 == 55 || i4 == 56 || i4 == 66 || i4 == 57 || i4 == 58 || i4 == 59 || i4 == 60 || i4 == 61 || i4 == 69 || i4 == 67 || i4 != 68) {
        }
        AbstractC1654b.a(h5, 2);
        if (i4 == 65) {
            if (AbstractC1895f.g(h5, "android.permission.RECORD_AUDIO") == 0) {
                return;
            }
            d.t0(h5);
        }
    }
}
