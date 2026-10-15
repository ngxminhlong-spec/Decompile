package C0;

import android.content.SharedPreferences;
import android.view.ViewGroup;
import android.widget.Toast;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import e1.EnumC1662c;
import f.AbstractActivityC1671f;
import m2.AbstractC1806a;
import o1.DialogC1878o;
import o1.InterfaceC1827C;
import o1.InterfaceC1854c;
import o1.InterfaceC1861f0;
import o1.InterfaceC1866i;
import o1.InterfaceC1883t;
import o1.InterfaceC1886w;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0008h implements InterfaceC1866i, InterfaceC1827C, InterfaceC1883t, InterfaceC1886w, InterfaceC1854c, InterfaceC1861f0 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f322o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D f323p;

    public /* synthetic */ C0008h(D d, int i4) {
        this.f322o = i4;
        this.f323p = d;
    }

    @Override // o1.InterfaceC1827C
    public void a() {
        switch (this.f322o) {
            case 1:
                D.P(this.f323p, new RunnableC0011k(this, 2));
                return;
            case 2:
                AbstractActivityC1671f h4 = this.f323p.h();
                if (h4 == null) {
                    return;
                }
                DialogC1878o.a(h4, 5).show();
                return;
            default:
                AbstractActivityC1671f h5 = this.f323p.h();
                if (h5 == null) {
                    return;
                }
                DialogC1878o.a(h5, 5).show();
                return;
        }
    }

    @Override // o1.InterfaceC1827C
    public void b() {
        D.P(this.f323p, new RunnableC0011k(this, 1));
    }

    @Override // o1.InterfaceC1827C
    public void c() {
        D.P(this.f323p, new A0.a(3, this));
    }

    @Override // o1.InterfaceC1854c
    public boolean d() {
        D d = this.f323p;
        d.f186U0.d();
        d.f186U0.setListener(null);
        d.f186U0 = null;
        d.f185T0.removeAllViews();
        d.f185T0.setVisibility(8);
        return true;
    }

    @Override // o1.InterfaceC1827C
    public void e(boolean z4) {
        D d = this.f323p;
        AbstractActivityC1671f h4 = d.h();
        if (h4 == null) {
            return;
        }
        SharedPreferences.Editor edit = h4.getPreferences(0).edit();
        edit.putBoolean("labels_visible", z4);
        edit.apply();
        AbstractC1806a.f14021c0 = Boolean.valueOf(z4);
        d.f202i0.setLabelsVisible(z4);
        d.f202i0.invalidate();
    }

    @Override // o1.InterfaceC1827C
    public boolean f(boolean z4) {
        D d = this.f323p;
        AbstractActivityC1671f h4 = d.h();
        if (h4 == null) {
            return false;
        }
        SharedPreferences.Editor edit = h4.getPreferences(0).edit();
        edit.putBoolean("enable_snapping", z4);
        edit.apply();
        AbstractC1806a.f14018a0 = Boolean.valueOf(z4);
        d.f202i0.setSnappingEnabled(z4);
        d.f202i0.invalidate();
        return true;
    }

    @Override // o1.InterfaceC1827C
    public void g(int i4) {
        A0 a02 = this.f323p.f220s0;
        if (a02 != null) {
            ((MainActivity) a02).C(i4);
        }
    }

    @Override // o1.InterfaceC1827C
    public /* synthetic */ void h() {
    }

    @Override // o1.InterfaceC1827C
    public void i(boolean z4) {
        D d = this.f323p;
        if (d.h() == null) {
            return;
        }
        SharedPreferences.Editor edit = d.h().getPreferences(0).edit();
        edit.putBoolean("show_grid", z4);
        edit.apply();
        AbstractC1806a.f14016Z = Boolean.valueOf(z4);
        d.f202i0.setGridVisibility(z4);
        d.f202i0.invalidate();
    }

    @Override // o1.InterfaceC1886w
    public void j(i1.d dVar) {
        P0.a aVar = dVar.f13263g;
        D d = this.f323p;
        d.f202i0.b((P0.a) aVar.a(d.f202i0.getNextElementId()));
        if (d.l() != null) {
            Toast.makeText(d.l(), R.string.added_element, 0).show();
        }
        d.a0();
    }

    @Override // o1.InterfaceC1827C
    public void k() {
        ((MainActivity) this.f323p.f220s0).D();
    }

    @Override // o1.InterfaceC1827C
    public void l() {
        D.P(this.f323p, new RunnableC0011k(this, 3));
    }

    @Override // o1.InterfaceC1827C
    public void m(boolean z4) {
        A0 a02 = this.f323p.f220s0;
        if (a02 != null) {
            ((MainActivity) a02).B(z4);
        }
    }

    @Override // o1.InterfaceC1883t
    public void n() {
        D d = this.f323p;
        d.a0();
        d.j0(EnumC1662c.f12676p);
    }

    @Override // o1.InterfaceC1827C
    public boolean o(boolean z4) {
        D d = this.f323p;
        AbstractActivityC1671f h4 = d.h();
        if (h4 == null) {
            return false;
        }
        SharedPreferences.Editor edit = h4.getPreferences(0).edit();
        edit.putBoolean("enable_vibration", z4);
        edit.apply();
        AbstractC1806a.f14020b0 = Boolean.valueOf(z4);
        d.f202i0.setVibrateOnPath(z4);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a1  */
    @Override // o1.InterfaceC1861f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r11) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.C0008h.onClick(android.view.View):void");
    }

    @Override // o1.InterfaceC1827C
    public void p(int i4) {
        D d = this.f323p;
        if (d.h() == null) {
            return;
        }
        SharedPreferences.Editor edit = d.h().getPreferences(0).edit();
        edit.putString("units", n0.a.l(i4));
        edit.apply();
        AbstractC1806a.f14040m0 = i4;
        d.f218q1 = i4;
        d.f202i0.setGridProperties(d.Y());
        d.f202i0.invalidate();
    }

    @Override // o1.InterfaceC1827C
    public /* synthetic */ void q() {
    }

    @Override // o1.InterfaceC1866i
    public void r() {
        D d = this.f323p;
        v.e eVar = (v.e) d.f213o0.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = d.f204j0.getResources().getDimensionPixelSize(R.dimen.fab_margin) + (d.f204j0.getHeight() - d.f204j0.getTop());
        d.f213o0.requestLayout();
    }

    @Override // o1.InterfaceC1883t
    public void s() {
        String.valueOf(n0.a.e(4));
    }

    @Override // o1.InterfaceC1827C
    public void t() {
        D.P(this.f323p, new RunnableC0011k(this, 0));
    }
}
