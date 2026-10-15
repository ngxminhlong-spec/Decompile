package D0;

import C0.A0;
import C0.B;
import C0.C;
import C0.C0018s;
import C0.E;
import C0.H;
import C0.RunnableC0017q;
import C0.RunnableC0021v;
import C0.ViewOnClickListenerC0014n;
import C0.ViewOnClickListenerC0019t;
import C0.ViewOnClickListenerC0020u;
import C0.ViewOnLayoutChangeListenerC0013m;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.ColorPicker;
import com.duracodefactory.logiccircuitsimulatorpro.ui.ElementsLayout;
import com.duracodefactory.logiccircuitsimulatorpro.ui.FrameLayoutCustom;
import com.duracodefactory.logiccircuitsimulatorpro.ui.LoadingScreen;
import com.duracodefactory.logiccircuitsimulatorpro.ui.NumberPicker;
import com.duracodefactory.logiccircuitsimulatorpro.ui.PLADialog;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TextSetup;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramLayout;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimerSetup;
import com.duracodefactory.logiccircuitsimulatorpro.ui.ToolbarContainer;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TopControlsLayout;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import com.google.android.gms.internal.ads.C0258Da;
import com.google.android.gms.internal.ads.C0783ji;
import com.google.android.gms.internal.ads.Nu;
import com.google.android.gms.internal.measurement.C1510e1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d1.AbstractC1651b;
import d3.AbstractC1654b;
import e1.EnumC1662c;
import f.AbstractActivityC1671f;
import h1.AbstractC1698a;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import m2.AbstractC1806a;
import o2.AbstractC1895f;
import p1.C1911I;
import p1.C1912J;
import p1.C1914L;
import p1.C1917c;
import p1.C1924j;
import p1.C1934u;
import p1.C1939z;
import p1.M;
import p1.P;
import p1.Q;
import p1.Z;
import p1.e0;
import p1.i0;
import q1.AbstractC1955j;
import q1.AbstractC1959n;
import q1.InterfaceC1958m;
import s1.C1977g;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class g extends H implements InterfaceC1958m {

    /* renamed from: A0, reason: collision with root package name */
    public View f541A0;

    /* renamed from: B0, reason: collision with root package name */
    public View f542B0;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f543C0;

    /* renamed from: D0, reason: collision with root package name */
    public V2.e f544D0;

    /* renamed from: E0, reason: collision with root package name */
    public View f545E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f546F0;

    /* renamed from: G0, reason: collision with root package name */
    public ViewGroup f547G0;

    /* renamed from: H0, reason: collision with root package name */
    public ViewGroup f548H0;

    /* renamed from: I0, reason: collision with root package name */
    public View f549I0;
    public final b N0;

    /* renamed from: O0, reason: collision with root package name */
    public final d f553O0;

    /* renamed from: S0, reason: collision with root package name */
    public boolean f557S0;

    /* renamed from: T0, reason: collision with root package name */
    public boolean f558T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f559U0;

    /* renamed from: V0, reason: collision with root package name */
    public float f560V0;

    /* renamed from: W0, reason: collision with root package name */
    public float f561W0;

    /* renamed from: X0, reason: collision with root package name */
    public final d f562X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final C f563Y0;

    /* renamed from: g0, reason: collision with root package name */
    public i1.d f565g0;

    /* renamed from: h0, reason: collision with root package name */
    public BoardView f566h0;

    /* renamed from: i0, reason: collision with root package name */
    public FrameLayoutCustom f567i0;

    /* renamed from: j0, reason: collision with root package name */
    public ToolbarContainer f568j0;

    /* renamed from: k0, reason: collision with root package name */
    public DrawerLayout f569k0;

    /* renamed from: l0, reason: collision with root package name */
    public TopControlsLayout f570l0;

    /* renamed from: m0, reason: collision with root package name */
    public FrameLayout f571m0;

    /* renamed from: n0, reason: collision with root package name */
    public TextView f572n0;

    /* renamed from: o0, reason: collision with root package name */
    public E f573o0;

    /* renamed from: p0, reason: collision with root package name */
    public A0 f574p0;

    /* renamed from: q0, reason: collision with root package name */
    public TextView f575q0;

    /* renamed from: r0, reason: collision with root package name */
    public FrameLayout f576r0;

    /* renamed from: t0, reason: collision with root package name */
    public int f578t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f579u0;

    /* renamed from: v0, reason: collision with root package name */
    public ViewGroup f580v0;

    /* renamed from: w0, reason: collision with root package name */
    public ViewGroup f581w0;

    /* renamed from: x0, reason: collision with root package name */
    public TextView f582x0;

    /* renamed from: y0, reason: collision with root package name */
    public TextView f583y0;

    /* renamed from: z0, reason: collision with root package name */
    public TimeDiagramLayout f584z0;

    /* renamed from: s0, reason: collision with root package name */
    public final HashMap f577s0 = new HashMap();

    /* renamed from: Z0, reason: collision with root package name */
    public int f564Z0 = 1;
    public final d J0 = new d(this, 1);

    /* renamed from: K0, reason: collision with root package name */
    public final b f550K0 = new b(this, 2);

    /* renamed from: L0, reason: collision with root package name */
    public final Nu f551L0 = new Nu(this, 17);

    /* renamed from: M0, reason: collision with root package name */
    public final f f552M0 = new f(0, this);

    /* renamed from: P0, reason: collision with root package name */
    public final B f554P0 = new B(this, 2);

    /* renamed from: Q0, reason: collision with root package name */
    public final u0.g f555Q0 = new u0.g(this);

    /* renamed from: R0, reason: collision with root package name */
    public final e f556R0 = new e(this, 1);

    public g() {
        int i4 = 3;
        this.N0 = new b(this, i4);
        this.f553O0 = new d(this, i4);
        int i5 = 2;
        new e(this, i5);
        this.f559U0 = 0;
        this.f560V0 = 0.0f;
        this.f561W0 = 0.0f;
        this.f562X0 = new d(this, i5);
        this.f563Y0 = new C(this, 4);
    }

    public static void P(g gVar, Runnable runnable) {
        DrawerLayout drawerLayout = gVar.f569k0;
        Nu nu = gVar.f551L0;
        drawerLayout.removeCallbacks(nu);
        nu.f6409p = runnable;
        gVar.f569k0.postDelayed(nu, 300L);
    }

    public static void Q(g gVar, View view) {
        int i4;
        HorizontalScrollView horizontalScrollView;
        int i5;
        AbstractActivityC1671f h4 = gVar.h();
        if (h4 == null) {
            return;
        }
        Integer num = AbstractC1806a.f14034j0;
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = h4.getPreferences(0).getInt("show_scroll", 0);
            AbstractC1806a.f14034j0 = Integer.valueOf(i4);
        }
        if (i4 < 3) {
            if ((gVar.f2824F != null && gVar.f2858x) && (horizontalScrollView = (HorizontalScrollView) view.findViewById(R.id.top_elements_scroll_container)) != null) {
                Integer num2 = AbstractC1806a.f14034j0;
                if (num2 != null) {
                    i5 = num2.intValue();
                } else {
                    i5 = h4.getPreferences(0).getInt("show_scroll", 0);
                    AbstractC1806a.f14034j0 = Integer.valueOf(i5);
                }
                int i6 = i5 + 1;
                SharedPreferences.Editor edit = h4.getPreferences(0).edit();
                edit.putInt("show_scroll", i6);
                edit.apply();
                AbstractC1806a.f14034j0 = Integer.valueOf(i6);
                int i7 = h4.getResources().getConfiguration().getLayoutDirection() == 0 ? 260 : -260;
                horizontalScrollView.smoothScrollBy(i7, 0);
                view.postDelayed(new RunnableC0017q(horizontalScrollView, i7, 1), 500L);
            }
        }
    }

    public static void R(g gVar, ArrayList arrayList) {
        gVar.Z();
        int size = arrayList.size();
        StringBuilder sb = new StringBuilder();
        sb.append(gVar.l() != null ? gVar.l().getString(R.string.timediagram_title) : "Timing Diagram");
        sb.append(" ");
        sb.append(size);
        String sb2 = sb.toString();
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj = arrayList.get(i4);
            i4++;
            Objects.equals(sb2, ((m1.b) obj).f13985b);
        }
        m1.b bVar = new m1.b(0, sb2, 0.0f, new ArrayList(), false, 0);
        arrayList.add(bVar);
        gVar.f0(bVar);
    }

    @Override // C0.H
    public final boolean K() {
        boolean z4;
        boolean z5 = true;
        if (this.f549I0.getVisibility() != 0) {
            z4 = false;
        } else {
            this.f549I0.setVisibility(8);
            z4 = true;
        }
        View f4 = this.f569k0.f(8388613);
        if (f4 != null ? DrawerLayout.l(f4) : false) {
            this.f569k0.c(8388613);
            this.f569k0.setDrawerLockMode(1);
            z4 = true;
        }
        if (!z4 && BottomSheetBehavior.w(this.f567i0).f12319x != 4) {
            BottomSheetBehavior.w(this.f567i0).z(4);
            z4 = true;
        }
        if (!z4 && b0()) {
            z4 = true;
        }
        if (z4 || this.f584z0.getVisibility() != 0) {
            z5 = z4;
        } else {
            Context l4 = l();
            if (l4 != null && !i1.c.i(l4, this.f565g0.f13259a)) {
                g0(new C1.g(4, this));
            }
            this.f584z0.setVisibility(8);
            this.f581w0.setVisibility(8);
            this.f584z0.setTimeDiagram(null);
            this.f566h0.invalidate();
        }
        if (!z5 && (!((ArrayList) ((e1.d) this.f566h0.f3821o.f14880o).f12684S.f709q).isEmpty() || !((ArrayList) ((e1.d) this.f566h0.f3821o.f14880o).f12684S.f710r).isEmpty())) {
            g0(null);
        }
        return z5;
    }

    @Override // C0.H
    public final void L(boolean z4, KeyEvent keyEvent) {
        this.f566h0.h(z4, keyEvent);
    }

    @Override // C0.H
    public final void N(E e4) {
        this.f573o0 = e4;
    }

    @Override // C0.H
    public final void O(A0 a02) {
        this.f574p0 = a02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16, types: [com.duracodefactory.logiccircuitsimulatorpro.ui.ColorPicker] */
    /* JADX WARN: Type inference failed for: r7v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final void S(View view, int i4) {
        int i5 = 0;
        if (i4 == 39 || i4 == 40 || i4 == 41) {
            AbstractC1698a selectedElement = this.f566h0.getSelectedElement();
            if (selectedElement instanceof P) {
                P p3 = (P) selectedElement;
                PLADialog pLADialog = (PLADialog) view;
                pLADialog.a(p3.f14439T, p3.f14440U, i4 == 41, i4 == 40);
                pLADialog.setInteractMode(true);
                pLADialog.setListener(new C0258Da(this, p3, 4, i5));
                return;
            }
            return;
        }
        int i6 = 5;
        if (i4 == 50) {
            AbstractC1698a selectedElement2 = this.f566h0.getSelectedElement();
            if (selectedElement2 instanceof e0) {
                e0 e0Var = (e0) selectedElement2;
                TextSetup textSetup = (TextSetup) view;
                boolean z4 = e0Var.f14519R;
                int i7 = e0Var.f14518Q;
                String str = e0Var.f14517P;
                textSetup.f3719t = i7;
                textSetup.f3718s = str;
                textSetup.f3720u = z4;
                if (textSetup.f3714o != null) {
                    textSetup.b();
                }
                textSetup.setListener(new C0783ji(this, e0Var, i6, i5));
                return;
            }
            return;
        }
        if (i4 == 53 || i4 == 52) {
            AbstractC1698a selectedElement3 = this.f566h0.getSelectedElement();
            if (selectedElement3 instanceof i0) {
                i0 i0Var = (i0) selectedElement3;
                TimerSetup timerSetup = (TimerSetup) view;
                timerSetup.findViewById(R.id.timer_setup_interactive_container).setVisibility(0);
                timerSetup.setData(i0Var.f14549e0);
                timerSetup.setListener(new C1510e1(i6, this, i0Var));
                return;
            }
            return;
        }
        if (i4 == 35 || i4 == 36 || i4 == 38) {
            AbstractC1698a selectedElement4 = this.f566h0.getSelectedElement();
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.led_matrix_color_picker_container);
            viewGroup.setVisibility(0);
            ?? r32 = (ColorPicker) viewGroup.findViewById(R.id.color_picker_settings);
            if (selectedElement4 instanceof C1924j) {
                i5 = ((C1924j) selectedElement4).f14554T;
            } else if (selectedElement4 instanceof Z) {
                i5 = ((Z) selectedElement4).f14492R;
            } else if (selectedElement4 instanceof C1934u) {
                i5 = ((C1934u) selectedElement4).f14587R;
            }
            r32.setSelectedColor(i5);
            int[] iArr = new int[1];
            r32.setListener(new C0018s(r32, iArr, 1));
            viewGroup.findViewById(R.id.settings_color_setup_submit).setOnClickListener(new ViewOnClickListenerC0019t(this, selectedElement4, i5, iArr, 2));
            return;
        }
        if (i4 == 19 || i4 == 22 || i4 == 21 || i4 == 18 || i4 == 20) {
            AbstractC1698a selectedElement5 = this.f566h0.getSelectedElement();
            if (selectedElement5 instanceof C1939z) {
                C1939z c1939z = (C1939z) selectedElement5;
                ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.generator_setup_container);
                viewGroup2.setVisibility(0);
                NumberPicker numberPicker = (NumberPicker) viewGroup2.findViewById(R.id.generator_num_picker);
                float[] fArr = {0.5f, 1.0f, 1.25f, 2.0f, 2.5f, 4.0f, 5.0f, 6.25f, 10.0f, 12.5f, 20.0f, 25.0f, 40.0f, 50.0f, 62.5f, 100.0f, 125.0f, 200.0f, 250.0f, 500.0f, 1000.0f, 2000.0f, 4000.0f};
                ArrayList arrayList = new ArrayList();
                for (int i8 = 0; i8 < 23; i8++) {
                    arrayList.add(C1939z.O(fArr[i8]));
                }
                numberPicker.a(C1939z.O(c1939z.f14600R), arrayList);
                viewGroup2.findViewById(R.id.settings_generator_setup_submit).setOnClickListener(new ViewOnClickListenerC0020u(this, c1939z, fArr, numberPicker, 2));
            }
        }
    }

    public final void T() {
        ArrayList<AbstractC1698a> selectedElements = this.f566h0.getSelectedElements();
        HashMap hashMap = this.f577s0;
        hashMap.clear();
        int size = selectedElements.size();
        int i4 = 0;
        while (i4 < size) {
            AbstractC1698a abstractC1698a = selectedElements.get(i4);
            i4++;
            AbstractC1698a abstractC1698a2 = abstractC1698a;
            if (abstractC1698a2.f13121E != 0 && !(abstractC1698a2 instanceof Q) && !(abstractC1698a2 instanceof C1912J)) {
                hashMap.put(Long.valueOf(abstractC1698a2.f13117A), Integer.valueOf(abstractC1698a2.f13121E));
            }
        }
    }

    public final void U(C0783ji c0783ji) {
        try {
            Bitmap e4 = this.f566h0.e(l().getColor(R.color.board_background));
            FileOutputStream fileOutputStream = new FileOutputStream(l().getContentResolver().openFileDescriptor((Uri) c0783ji.f9212q, "w").getFileDescriptor());
            e4.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        l0(R.string.export_success);
    }

    public final void V() {
        l0(R.string.export_fail);
    }

    public final void W(C0783ji c0783ji) {
        try {
            Bitmap a4 = this.f584z0.a(l().getColor(R.color.board_background));
            FileOutputStream fileOutputStream = new FileOutputStream(l().getContentResolver().openFileDescriptor((Uri) c0783ji.f9212q, "w").getFileDescriptor());
            a4.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        l0(R.string.export_success);
    }

    public final C1977g X() {
        return new C1977g(m().getDimensionPixelSize(R.dimen.grid_text_size), l().getColor(R.color.grid_text_color), m().getDimensionPixelSize(R.dimen.grid_text_padding), l().getColor(R.color.grid_lines_color), m().getDimensionPixelSize(R.dimen.grid_lines_width), this.f564Z0);
    }

    public final int Y() {
        AbstractC1698a selectedElement = this.f566h0.getSelectedElement();
        if (selectedElement == null) {
            return -1;
        }
        int r4 = selectedElement.r();
        if (selectedElement instanceof C1917c) {
            if (selectedElement.m("in2") != null) {
                return 14;
            }
        } else if (selectedElement instanceof M) {
            if (selectedElement.m("in2") != null) {
                return 15;
            }
        } else if (selectedElement instanceof C1911I) {
            if (selectedElement.m("in2") != null) {
                return 16;
            }
        } else if ((selectedElement instanceof C1914L) && selectedElement.m("in2") != null) {
            return 17;
        }
        return r4;
    }

    public final void Z() {
        BottomSheetBehavior.w(this.f567i0).z(4);
        b0();
    }

    public final void a0() {
        int childCount = this.f571m0.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            this.f571m0.getChildAt(i4).setVisibility(8);
        }
    }

    public final boolean b0() {
        if (this.f580v0.getVisibility() != 0) {
            return false;
        }
        this.f580v0.setVisibility(8);
        ScrollView scrollView = (ScrollView) this.f580v0.findViewById(R.id.info_ballon_scroller);
        scrollView.post(new RunnableC0021v(scrollView, 1));
        if (!this.f557S0) {
            return true;
        }
        this.f557S0 = false;
        return true;
    }

    @Override // q1.InterfaceC1958m
    public final void c() {
    }

    public final void c0() {
        boolean z4;
        ToolbarContainer toolbarContainer = this.f568j0;
        E0.a aVar = ((e1.d) this.f566h0.f3821o.f14880o).f12684S;
        if (aVar.f708p != aVar.f707o) {
            if (!i1.c.i(toolbarContainer.getContext(), this.f565g0.f13259a)) {
                z4 = true;
                toolbarContainer.setSavingEnabled(z4);
            }
        }
        z4 = false;
        toolbarContainer.setSavingEnabled(z4);
    }

    @Override // q1.InterfaceC1958m
    public final void d() {
    }

    public final boolean d0(AbstractActivityC1671f abstractActivityC1671f, int i4) {
        return i1.c.i(abstractActivityC1671f, this.f565g0.f13259a) ? this.f566h0.getElementsCount() + i4 > 17 : this.f566h0.getElementsCount() + i4 > 8;
    }

    public final void e0() {
        if (this.f558T0) {
            int i4 = this.f559U0 + 1;
            this.f559U0 = i4;
            this.f560V0 += this.f561W0;
            this.f583y0.setText(String.valueOf(i4));
            this.f582x0.setText(AbstractC1895f.q(this.f560V0));
            this.f584z0.b(this.f562X0);
            this.f566h0.i();
        }
    }

    public final void f0(m1.b bVar) {
        Z();
        this.f584z0.setTimeDiagram(bVar);
        this.f584z0.setVisibility(0);
    }

    @Override // q1.InterfaceC1958m
    public final void g() {
        ViewGroup viewGroup = (ViewGroup) this.f2835R;
        AbstractActivityC1671f h4 = h();
        if (this.f544D0 == null || viewGroup == null || h4 == null) {
            return;
        }
        V2.e.d(h4, viewGroup);
    }

    public final void g0(C1.g gVar) {
        Context l4 = l();
        if (l4 == null || i1.c.i(l4, this.f565g0.f13259a)) {
            return;
        }
        l0(R.string.saving);
        BoardView boardView = this.f566h0;
        E0.a aVar = ((e1.d) boardView.f3821o.f14880o).f12684S;
        aVar.f708p = aVar.f707o;
        this.f565g0.d = boardView.getElementsCount();
        this.f565g0.f13261e = this.f566h0.getConnectionsCount();
        this.f565g0.f13263g = this.f566h0.getCircuitCreator();
        i1.d dVar = this.f565g0;
        dVar.f13263g.f1479x = dVar.f13260b;
        dVar.f13262f = new Date();
        i1.d dVar2 = this.f565g0;
        dVar2.c = 0;
        dVar2.f13264h = this.f566h0.getScale();
        this.f565g0.f13265i = this.f566h0.getScrollXModel();
        this.f565g0.f13266j = this.f566h0.getScrollYModel();
        i1.c.j(gVar, this.f565g0, new File(i1.c.g(l4)), null);
        c0();
    }

    public final void h0(EnumC1662c enumC1662c) {
        this.f566h0.setSelectionMode(enumC1662c);
    }

    public final void i0(int i4) {
        if (!this.f579u0) {
            if (i4 == -1) {
                return;
            }
            a0();
            ViewGroup viewGroup = (ViewGroup) this.f571m0.findViewById(R.id.bottom_info);
            viewGroup.setVisibility(0);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.info_container);
            viewGroup2.removeAllViews();
            View c = AbstractC1651b.c(viewGroup, i4);
            viewGroup2.addView(c);
            BottomSheetBehavior.w(this.f567i0).z(3);
            l0(AbstractC1651b.a(i4));
            S(c, i4);
            return;
        }
        if (BottomSheetBehavior.w(this.f567i0).f12319x == 3) {
            this.f543C0 = true;
            BottomSheetBehavior.w(this.f567i0).z(4);
        } else {
            if (i4 == -1) {
                return;
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f580v0.findViewById(R.id.info_baloon_content);
            this.f580v0.setVisibility(0);
            ((TextView) this.f580v0.findViewById(R.id.info_baloon_title)).setText(AbstractC1651b.a(i4));
            viewGroup3.removeAllViews();
            View c2 = AbstractC1651b.c(viewGroup3, i4);
            viewGroup3.addView(c2);
            S(c2, i4);
        }
    }

    public final void j0(m1.b bVar, boolean z4) {
        this.f581w0.setVisibility(8);
        this.f558T0 = false;
        if (z4) {
            AbstractActivityC1671f h4 = h();
            if (h4 == null) {
                return;
            }
            AbstractC1654b.a(h4, 5);
            f0(bVar);
        }
        h0(EnumC1662c.f12675o);
        BoardView boardView = this.f566h0;
        boardView.f3807M.f12960g = false;
        e1.f fVar = boardView.f3806L;
        fVar.f12703g = 0L;
        fVar.f12705i = false;
        fVar.f12706j = 0L;
    }

    public final void k0(ViewGroup viewGroup) {
        String str;
        if (l() != null) {
            DecimalFormat decimalFormat = new DecimalFormat("###.##");
            ((TextView) viewGroup.findViewById(R.id.real_time_info)).setText("1 : " + decimalFormat.format(this.f566h0.getRealTime()) + " " + l().getString(R.string.real_time_info));
            TextView textView = (TextView) viewGroup.findViewById(R.id.elements_latency_info);
            StringBuilder sb = new StringBuilder();
            sb.append(l().getString(R.string.latency_info).toUpperCase());
            sb.append(": ");
            int i4 = AbstractC1955j.f14675a;
            float realTime = 16 / this.f566h0.getRealTime();
            if (realTime >= 1000.0f) {
                realTime /= 1000.0f;
                str = "s";
            } else {
                str = "ms";
            }
            sb.append(realTime + str);
            textView.setText(sb.toString());
        }
    }

    public final void l0(int i4) {
        if (this.f578t0 == 3) {
            return;
        }
        this.f575q0.setText(i4);
        this.f576r0.setPressed(true);
        this.f576r0.postDelayed(this.f556R0, 100L);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void o(int i4, int i5, Intent intent) {
        if (i4 == 1) {
            if (i5 != -1) {
                l0(R.string.export_cancel);
                return;
            }
            if (intent == null) {
                V();
                return;
            }
            Uri data = intent.getData();
            if (data == null) {
                V();
                return;
            }
            if (l() == null) {
                return;
            }
            C0783ji k3 = C0783ji.n(l(), data).k("image/png", this.f565g0.f13260b);
            if (k3 == null) {
                V();
                return;
            }
            try {
                U(k3);
                return;
            } catch (Throwable unused) {
                V();
                return;
            }
        }
        if (i4 != 2) {
            return;
        }
        if (i5 != -1) {
            l0(R.string.export_cancel);
            return;
        }
        if (intent == null) {
            V();
            return;
        }
        Uri data2 = intent.getData();
        if (data2 == null) {
            V();
            return;
        }
        if (l() == null) {
            return;
        }
        C0783ji n4 = C0783ji.n(l(), data2);
        m1.b timeDiagram = this.f584z0.getTimeDiagram();
        if (timeDiagram == null) {
            V();
            return;
        }
        C0783ji k4 = n4.k("image/png", this.f565g0.f13260b + ": " + timeDiagram.f13985b);
        if (k4 == null) {
            V();
            return;
        }
        try {
            W(k4);
        } catch (Throwable unused2) {
            V();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f2833P = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final View r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i4;
        ViewGroup viewGroup2;
        boolean z4;
        View inflate = layoutInflater.inflate(R.layout.circuit_edit1, viewGroup, false);
        String string = this.f2853s.getString("project_name");
        this.f566h0 = (BoardView) inflate.findViewById(R.id.board);
        this.f568j0 = (ToolbarContainer) inflate.findViewById(R.id.toolbar);
        this.f567i0 = (FrameLayoutCustom) inflate.findViewById(R.id.bottom);
        this.f569k0 = (DrawerLayout) inflate.findViewById(R.id.drawer_layout);
        this.f570l0 = (TopControlsLayout) inflate.findViewById(R.id.top_controls);
        this.f580v0 = (ViewGroup) inflate.findViewById(R.id.info_ballon);
        this.f581w0 = (ViewGroup) inflate.findViewById(R.id.timediagram_ballon);
        this.f584z0 = (TimeDiagramLayout) inflate.findViewById(R.id.timediagram_container);
        this.f547G0 = (ViewGroup) inflate.findViewById(R.id.elem_popup_container);
        this.f549I0 = inflate.findViewById(R.id.rate_us_dialog_container);
        this.f548H0 = (ViewGroup) inflate.findViewById(R.id.explore_container);
        this.f547G0.setOnClickListener(new a(this, 2));
        this.f582x0 = (TextView) this.f581w0.findViewById(R.id.timediagrsm_elapsed_time);
        this.f583y0 = (TextView) this.f581w0.findViewById(R.id.timediagrsm_elapsed_frames);
        this.f541A0 = inflate.findViewById(R.id.select_node_message);
        this.f542B0 = inflate.findViewById(R.id.element_info_hint_balloon);
        inflate.findViewById(R.id.info_baloon_close).setOnClickListener(new a(this, 0));
        ArrayList arrayList = BottomSheetBehavior.w(this.f567i0).f12291G;
        f fVar = this.f552M0;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
        this.f567i0.setListener(new C2033d(4));
        Resources.getSystem().getConfiguration();
        this.f568j0.setInterface(this.N0);
        this.f569k0.setDrawerLockMode(1);
        this.f569k0.a(this.f554P0);
        this.f570l0.setInterface(this.f553O0);
        this.f570l0.b(new int[0], R.id.single_select);
        this.f570l0.setRippleRemoved(new int[]{R.id.single_select, R.id.multi_select, R.id.interact, R.id.connect_mode});
        this.f571m0 = (FrameLayout) inflate.findViewById(R.id.bottom_sheet_content);
        ((ElementsLayout) inflate.findViewById(R.id.bottom_elements)).setInterface(new b(this, 0));
        this.f572n0 = (TextView) inflate.findViewById(R.id.toolbar_project_name);
        ViewGroup viewGroup3 = (ViewGroup) inflate;
        this.f544D0 = new V2.e(h(), viewGroup3, new d(this, 0));
        this.f575q0 = (TextView) inflate.findViewById(R.id.status_message);
        this.f576r0 = (FrameLayout) inflate.findViewById(R.id.status_message_container);
        this.f564Z0 = AbstractC1806a.v(h());
        inflate.findViewById(R.id.scroll_to_origin).setOnClickListener(new a(this, 1));
        try {
            this.f565g0 = i1.c.b(new File(i1.c.g(inflate.getContext()) + "/" + string), string);
            i4 = 1;
            viewGroup2 = viewGroup3;
        } catch (Throwable unused) {
            i1.d dVar = new i1.d();
            this.f565g0 = dVar;
            dVar.f13259a = string;
            dVar.f13260b = string;
            dVar.f13262f = new Date();
            i4 = 1;
            viewGroup2 = viewGroup3;
            this.f565g0.f13263g = new P0.a(0L, 0.0f, 0.0f, string, new ArrayList(), new ArrayList(), new HashMap(), 0, new ArrayList());
        }
        this.f572n0.setText(this.f565g0.f13260b);
        this.f566h0.g(this.f565g0.f13263g);
        this.f566h0.setGridProperties(X());
        this.f566h0.setSnappingEnabled(AbstractC1806a.G(h()));
        this.f566h0.setVibrateOnPath(AbstractC1806a.I(h()));
        this.f566h0.setLabelsVisible(AbstractC1806a.e(h()));
        BoardView boardView = this.f566h0;
        u0.g gVar = this.f555Q0;
        boardView.setListener(gVar);
        this.f566h0.setGridVisibility(AbstractC1806a.E(h()));
        this.f566h0.setScale(this.f565g0.f13264h);
        this.f566h0.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0013m(1, this));
        k0(viewGroup2);
        TextView textView = (TextView) inflate.findViewById(R.id.expand_collapse);
        textView.setOnClickListener(new ViewOnClickListenerC0014n(5, this, textView));
        l0(R.string.welcome);
        gVar.h();
        this.f579u0 = AbstractC1806a.H(inflate.getContext());
        this.f584z0.setListener(new b(this, 1));
        if (e1.j.a(8)) {
            inflate.findViewById(R.id.proximity_element).setVisibility(4);
        }
        if (e1.j.a(5)) {
            inflate.findViewById(R.id.light_sensor_element).setVisibility(4);
        }
        if (e1.j.a(2)) {
            inflate.findViewById(R.id.magnetic_element).setVisibility(4);
        }
        if (e1.j.a(i4)) {
            inflate.findViewById(R.id.accelerometer_element).setVisibility(4);
            inflate.findViewById(R.id.gyroscope_element).setVisibility(4);
        }
        if (e1.j.a(6)) {
            inflate.findViewById(R.id.pressure_sensor_element).setVisibility(4);
        }
        inflate.postDelayed(new e(this, 0), 1000L);
        this.f545E0 = inflate.findViewById(R.id.watch_reward_video_menu_notification);
        LoadingScreen loadingScreen = (LoadingScreen) inflate.findViewById(R.id.anim_load_screen);
        boolean z5 = (bundle == null || !bundle.getBoolean("project_loaded")) ? 0 : i4;
        this.f546F0 = z5;
        i1.d dVar2 = this.f565g0;
        if (dVar2.d > 5 && dVar2.f13261e > 5 && z5 == 0 && h() != null) {
            AbstractActivityC1671f h4 = h();
            Boolean bool = AbstractC1806a.f14032i0;
            if (bool != null) {
                z4 = bool.booleanValue();
            } else {
                z4 = h4.getPreferences(0).getBoolean("show_loading", false);
                AbstractC1806a.f14032i0 = Boolean.valueOf(z4);
            }
            if (z4 && !AbstractC1895f.x(h(), 8)) {
                loadingScreen.setVisibility(0);
                i1.d dVar3 = this.f565g0;
                loadingScreen.a(dVar3.f13260b, dVar3.d, dVar3.f13261e, new ViewOnClickListenerC0014n(6, this, inflate));
                this.f546F0 = i4;
                return inflate;
            }
        }
        if (!AbstractC1895f.x(h(), 8)) {
            inflate.postDelayed(new Nu(this, inflate, 16, false), 600L);
        }
        this.f546F0 = i4;
        return inflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void v() {
        this.f566h0.p();
        if (this.f558T0) {
            j0(null, false);
        }
        AbstractC1959n.f14703f.remove(this);
        this.f2833P = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void w(int i4, String[] strArr, int[] iArr) {
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void x() {
        this.f566h0.n();
        AbstractC1959n.f14703f.add(this);
        this.f2833P = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void y(Bundle bundle) {
        bundle.putBoolean("project_loaded", this.f546F0);
        g0(null);
    }
}
