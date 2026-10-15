package O1;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import c1.C0234c;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.AvatarView;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramLayout;
import com.google.android.gms.internal.ads.C1016p;
import com.google.android.gms.internal.ads.C1335wc;
import d1.AbstractC1651b;
import e1.EnumC1662c;
import h1.AbstractC1698a;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import m2.AbstractC1806a;
import s1.InterfaceC1974d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077n implements y1.b, InterfaceC1974d {

    /* renamed from: o, reason: collision with root package name */
    public final Object f1368o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f1369p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f1370q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f1371r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f1372s;

    public C0077n(C0.D d) {
        this.f1372s = d;
        this.f1368o = new int[]{R.id.single_select, R.id.multi_select, R.id.interact, R.id.connect_mode};
        this.f1369p = new int[]{R.id.cut, R.id.copy, R.id.paste, R.id.delete, R.id.rotate_element_control};
        this.f1370q = new int[]{R.id.element_info_control, R.id.rename_element_control};
        this.f1371r = new A0.a(6, this);
    }

    public C0077n(C0.v0 v0Var, ViewGroup viewGroup) {
        this.f1372s = v0Var;
        this.f1371r = v0Var.h().getResources().getString(R.string.projects) + ": ";
        this.f1368o = (TextView) viewGroup.findViewById(R.id.profile_name);
        this.f1370q = (AvatarView) viewGroup.findViewById(R.id.avatar);
        this.f1369p = (TextView) viewGroup.findViewById(R.id.projects_count);
    }

    public C0077n(D0.p pVar, ViewGroup viewGroup) {
        this.f1372s = pVar;
        this.f1371r = pVar.h().getResources().getString(R.string.projects) + ": ";
        this.f1368o = (TextView) viewGroup.findViewById(R.id.profile_name);
        this.f1370q = (AvatarView) viewGroup.findViewById(R.id.avatar);
        this.f1369p = (TextView) viewGroup.findViewById(R.id.projects_count);
    }

    public /* synthetic */ C0077n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f1368o = obj;
        this.f1369p = obj2;
        this.f1370q = obj3;
        this.f1371r = obj4;
        this.f1372s = obj5;
    }

    public static void b(C0077n c0077n) {
        D0.p pVar = (D0.p) c0077n.f1372s;
        Bitmap m4 = AbstractC1806a.m(pVar.h());
        int size = ((C0.j0) pVar.f619h0.f342f).d.size();
        ((TextView) c0077n.f1368o).setText(AbstractC1806a.q(pVar.h()));
        ((AvatarView) c0077n.f1370q).setImageBitmap(m4);
        ((TextView) c0077n.f1369p).setText(((String) c0077n.f1371r) + size);
    }

    public static void c(C0077n c0077n) {
        C0.v0 v0Var = (C0.v0) c0077n.f1372s;
        Bitmap m4 = AbstractC1806a.m(v0Var.h());
        int size = ((C0.j0) v0Var.f427i0.f342f).d.size();
        ((TextView) c0077n.f1368o).setText(AbstractC1806a.q(v0Var.h()));
        ((AvatarView) c0077n.f1370q).setImageBitmap(m4);
        ((TextView) c0077n.f1369p).setText(((String) c0077n.f1371r) + size);
    }

    public static void d(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        C0081p c0081p = C0081p.f1374f;
        C1335wc c1335wc = c0081p.f1375a;
        String str2 = c0081p.d.f4084o;
        c1335wc.getClass();
        C1335wc.k(context, str2, bundle, new C1016p(25, c1335wc));
    }

    @Override // s1.InterfaceC1974d
    public void a() {
    }

    @Override // s1.InterfaceC1974d
    public void e() {
        A0.a aVar = (A0.a) this.f1371r;
        C0.D d = (C0.D) this.f1372s;
        if (d.f179M0) {
            return;
        }
        d.N0.setVisibility(0);
        d.N0.removeCallbacks(aVar);
        d.N0.postDelayed(aVar, 20000L);
    }

    @Override // s1.InterfaceC1974d
    public void f() {
        ((C0.D) this.f1372s).g0();
    }

    @Override // s1.InterfaceC1974d
    public void g() {
        A0.a aVar = (A0.a) this.f1371r;
        C0.D d = (C0.D) this.f1372s;
        if (d.f178L0) {
            return;
        }
        d.N0.setVisibility(0);
        d.N0.removeCallbacks(aVar);
        d.N0.postDelayed(aVar, 20000L);
    }

    @Override // I3.a
    public Object get() {
        return new B1.c((Executor) ((I3.a) this.f1368o).get(), (x1.d) ((I3.a) this.f1369p).get(), (q2.e) ((q2.e) this.f1370q).get(), (D1.d) ((I3.a) this.f1371r).get(), (E1.c) ((I3.a) this.f1372s).get());
    }

    @Override // s1.InterfaceC1974d
    public void h() {
        boolean z4;
        C0.D d = (C0.D) this.f1372s;
        AbstractC1698a selectedElement = d.f202i0.getSelectedElement();
        if (selectedElement != null) {
            if (AbstractC1651b.f12599a.get(Integer.valueOf(selectedElement.r())) != null) {
                z4 = true;
                d.f211n0.a(z4, (int[]) this.f1370q);
                d.p0();
            }
        }
        z4 = false;
        d.f211n0.a(z4, (int[]) this.f1370q);
        d.p0();
    }

    @Override // s1.InterfaceC1974d
    public void i(EnumC1662c enumC1662c, EnumC1662c enumC1662c2) {
        int i4;
        int i5;
        C0.D d = (C0.D) this.f1372s;
        int ordinal = enumC1662c2.ordinal();
        boolean z4 = true;
        if (ordinal == 0) {
            i4 = R.string.single_select_mode_activated;
            i5 = R.id.single_select;
        } else if (ordinal == 1) {
            i4 = R.string.select_node_mode_activated;
            i5 = 0;
        } else if (ordinal == 2) {
            i4 = R.string.multi_select_mode_activated;
            i5 = R.id.multi_select;
        } else if (ordinal == 3) {
            i4 = R.string.connect_mode_activated;
            i5 = R.id.connect_mode;
        } else if (ordinal != 4) {
            i4 = 0;
            i5 = 0;
        } else {
            i4 = R.string.interact_mode_activated;
            i5 = R.id.interact;
        }
        d.s0(i4);
        d.f211n0.b((int[]) this.f1368o, i5);
        EnumC1662c enumC1662c3 = EnumC1662c.f12677q;
        EnumC1662c enumC1662c4 = EnumC1662c.f12675o;
        boolean z5 = enumC1662c2 == enumC1662c4 || enumC1662c2 == enumC1662c3;
        if (enumC1662c != enumC1662c4 && enumC1662c != enumC1662c3) {
            z4 = false;
        }
        if (z5 ^ z4) {
            d.f211n0.a(z5, (int[]) this.f1369p);
        }
        if (enumC1662c2 == EnumC1662c.f12676p) {
            d.f174G0.setVisibility(0);
        } else {
            d.f174G0.setVisibility(8);
        }
    }

    @Override // s1.InterfaceC1974d
    public void j(j1.b bVar) {
        C0.D d = (C0.D) this.f1372s;
        boolean z4 = d.f177K0;
        EnumC1662c enumC1662c = EnumC1662c.f12675o;
        int i4 = 0;
        if (z4) {
            d.f177K0 = false;
            TimeDiagramLayout timeDiagramLayout = d.f173F0;
            String str = timeDiagramLayout.getContext().getString(R.string.entry) + " " + timeDiagramLayout.f3725o.d.size();
            ArrayList arrayList = timeDiagramLayout.f3725o.d;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                Objects.equals(str, ((m1.c) obj).f13989b);
            }
            timeDiagramLayout.f3725o.d.add(new m1.c(0, str, timeDiagramLayout.getResources().getColor(R.color.accent_1), bVar, new ArrayList()));
            timeDiagramLayout.setTimeDiagram(timeDiagramLayout.f3725o);
            d.f173F0.setVisibility(0);
            d.f207l0.setAlpha(1.0f);
            d.f207l0.setVisibility(0);
            d.j0(enumC1662c);
            String.valueOf(n0.a.e(1));
            return;
        }
        ArrayList<C0234c> nodeInfos = d.f202i0.getNodeInfos();
        String str2 = "IO_" + bVar.f13327o;
        int size2 = nodeInfos.size();
        int i6 = 0;
        int i7 = 0;
        while (i6 < size2) {
            if (Objects.equals(str2 + i7, nodeInfos.get(i6).f3546o)) {
                i7++;
                i6 = -1;
            }
            i6++;
        }
        int size3 = nodeInfos.size();
        int i8 = 0;
        while (i8 < size3) {
            C0234c c0234c = nodeInfos.get(i8);
            i8++;
            if (c0234c.f3547p == 2) {
                i4++;
            }
        }
        nodeInfos.add(new C0234c(2, i4, str2 + i7, true));
        d.f202i0.getInnerLinks().put(str2 + i7, bVar);
        d.n0();
        d.j0(enumC1662c);
        String.valueOf(n0.a.e(3));
    }

    @Override // s1.InterfaceC1974d
    public void m() {
        ((C0.D) this.f1372s).e0();
    }

    @Override // s1.InterfaceC1974d
    public void n() {
    }

    @Override // s1.InterfaceC1974d
    public void o() {
        C0.D d = (C0.D) this.f1372s;
        View view = d.f2835R;
        if (view != null) {
            d.r0((ViewGroup) view);
        }
    }
}
