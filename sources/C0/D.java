package C0;

import O1.C0077n;
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
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.CircuitExploreDialog;
import com.duracodefactory.logiccircuitsimulatorpro.ui.ColorPicker;
import com.duracodefactory.logiccircuitsimulatorpro.ui.Control;
import com.duracodefactory.logiccircuitsimulatorpro.ui.ElementsLayout;
import com.duracodefactory.logiccircuitsimulatorpro.ui.FrameLayoutCustom;
import com.duracodefactory.logiccircuitsimulatorpro.ui.IcSetup;
import com.duracodefactory.logiccircuitsimulatorpro.ui.InsertProjectLayout;
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
import e1.C1660a;
import e1.EnumC1662c;
import f.AbstractActivityC1671f;
import h1.AbstractC1698a;
import j1.C1729a;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import m2.AbstractC1806a;
import o1.DialogC1832H;
import o2.AbstractC1895f;
import p1.C1911I;
import p1.C1912J;
import p1.C1914L;
import p1.C1917c;
import p1.C1924j;
import p1.C1934u;
import p1.C1939z;
import q1.AbstractC1955j;
import q1.AbstractC1959n;
import q1.InterfaceC1958m;
import s1.C1977g;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class D extends H implements InterfaceC1958m {

    /* renamed from: A0, reason: collision with root package name */
    public boolean f168A0;

    /* renamed from: B0, reason: collision with root package name */
    public ViewGroup f169B0;

    /* renamed from: C0, reason: collision with root package name */
    public ViewGroup f170C0;

    /* renamed from: D0, reason: collision with root package name */
    public TextView f171D0;

    /* renamed from: E0, reason: collision with root package name */
    public TextView f172E0;

    /* renamed from: F0, reason: collision with root package name */
    public TimeDiagramLayout f173F0;

    /* renamed from: G0, reason: collision with root package name */
    public View f174G0;

    /* renamed from: H0, reason: collision with root package name */
    public View f175H0;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f176I0;
    public boolean J0;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f177K0;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f178L0;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f179M0;
    public View N0;

    /* renamed from: O0, reason: collision with root package name */
    public V2.e f180O0;

    /* renamed from: P0, reason: collision with root package name */
    public View f181P0;

    /* renamed from: Q0, reason: collision with root package name */
    public boolean f182Q0;

    /* renamed from: R0, reason: collision with root package name */
    public C1995b f183R0;

    /* renamed from: S0, reason: collision with root package name */
    public ViewGroup f184S0;

    /* renamed from: T0, reason: collision with root package name */
    public ViewGroup f185T0;

    /* renamed from: U0, reason: collision with root package name */
    public CircuitExploreDialog f186U0;

    /* renamed from: V0, reason: collision with root package name */
    public View f187V0;

    /* renamed from: W0, reason: collision with root package name */
    public ElementsLayout f188W0;

    /* renamed from: X0, reason: collision with root package name */
    public final C0012l f189X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final C0008h f190Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public final C0008h f191Z0;

    /* renamed from: a1, reason: collision with root package name */
    public final Nu f192a1;

    /* renamed from: b1, reason: collision with root package name */
    public final A f193b1;

    /* renamed from: c1, reason: collision with root package name */
    public final C0009i f194c1;

    /* renamed from: d1, reason: collision with root package name */
    public final C0008h f195d1;

    /* renamed from: e1, reason: collision with root package name */
    public final B f196e1;

    /* renamed from: f1, reason: collision with root package name */
    public final ViewOnClickListenerC0006f f197f1;

    /* renamed from: g0, reason: collision with root package name */
    public i1.d f198g0;

    /* renamed from: g1, reason: collision with root package name */
    public final C0077n f199g1;

    /* renamed from: h0, reason: collision with root package name */
    public long f200h0;

    /* renamed from: h1, reason: collision with root package name */
    public final r f201h1;

    /* renamed from: i0, reason: collision with root package name */
    public BoardView f202i0;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f203i1;

    /* renamed from: j0, reason: collision with root package name */
    public FrameLayoutCustom f204j0;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f205j1;

    /* renamed from: k0, reason: collision with root package name */
    public ToolbarContainer f206k0;
    public boolean k1;

    /* renamed from: l0, reason: collision with root package name */
    public View f207l0;

    /* renamed from: l1, reason: collision with root package name */
    public int f208l1;

    /* renamed from: m0, reason: collision with root package name */
    public DrawerLayout f209m0;

    /* renamed from: m1, reason: collision with root package name */
    public float f210m1;

    /* renamed from: n0, reason: collision with root package name */
    public TopControlsLayout f211n0;

    /* renamed from: n1, reason: collision with root package name */
    public float f212n1;

    /* renamed from: o0, reason: collision with root package name */
    public View f213o0;

    /* renamed from: o1, reason: collision with root package name */
    public final C0009i f214o1;

    /* renamed from: p0, reason: collision with root package name */
    public FrameLayout f215p0;

    /* renamed from: p1, reason: collision with root package name */
    public final C f216p1;

    /* renamed from: q0, reason: collision with root package name */
    public TextView f217q0;

    /* renamed from: r0, reason: collision with root package name */
    public E f219r0;

    /* renamed from: s0, reason: collision with root package name */
    public A0 f220s0;

    /* renamed from: t0, reason: collision with root package name */
    public TextView f221t0;

    /* renamed from: u0, reason: collision with root package name */
    public FrameLayout f222u0;

    /* renamed from: v0, reason: collision with root package name */
    public EditText f223v0;

    /* renamed from: y0, reason: collision with root package name */
    public String f226y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f227z0;

    /* renamed from: w0, reason: collision with root package name */
    public HashMap f224w0 = new HashMap();

    /* renamed from: x0, reason: collision with root package name */
    public final HashMap f225x0 = new HashMap();

    /* renamed from: q1, reason: collision with root package name */
    public int f218q1 = 1;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.AbstractMap, C0.l, java.util.HashMap] */
    public D() {
        ?? hashMap = new HashMap();
        hashMap.put(U.a.f(R.id.volume_buttons_element, hashMap, U.a.f(R.id.charger_element, hashMap, U.a.f(R.id.proximity_element, hashMap, U.a.f(R.id.demux16_element, hashMap, U.a.f(R.id.demux8_element, hashMap, U.a.f(R.id.demux4_element, hashMap, U.a.f(R.id.mux16_element, hashMap, U.a.f(R.id.mux8_element, hashMap, U.a.f(R.id.mux4_element, hashMap, U.a.f(R.id.tristate_element, hashMap, U.a.f(R.id.rom_element, hashMap, U.a.f(R.id.pal_element, hashMap, U.a.f(R.id.pla_element, hashMap, U.a.f(R.id.fourteen_segment_display_element, hashMap, U.a.f(R.id.sr_g_latch, hashMap, U.a.f(R.id.jk_latch, hashMap, U.a.f(R.id.t_latch, hashMap, U.a.f(R.id.d_latch, hashMap, U.a.f(R.id.sr_latch, hashMap, U.a.f(R.id.jk_ff, hashMap, U.a.f(R.id.t_ff, hashMap, U.a.f(R.id.d_ff, hashMap, U.a.f(R.id.sr_ff, hashMap, U.a.f(R.id.nor3_element, hashMap, U.a.f(R.id.nand3_element, hashMap, U.a.f(R.id.or3_element, hashMap, U.a.f(R.id.and3_element, hashMap, 14, 15), 16), 17), 30), 31), 32), 33), 25), 27), 29), 28), 26), 38), 39), 40), 41), 51), 43), 44), 45), 47), 48), 49), 54), 57), 56), 65), Integer.valueOf(R.id.decibel_element));
        this.f189X0 = hashMap;
        this.f190Y0 = new C0008h(this, 2);
        this.f191Z0 = new C0008h(this, 3);
        this.f192a1 = new Nu(this, 13);
        this.f193b1 = new A(this);
        this.f194c1 = new C0009i(this);
        this.f195d1 = new C0008h(this, 5);
        this.f196e1 = new B(this, 0);
        this.f197f1 = new ViewOnClickListenerC0006f(this, 5);
        this.f199g1 = new C0077n(this);
        this.f201h1 = new r(this, 0);
        this.f203i1 = false;
        new r(this, 1);
        this.f208l1 = 0;
        this.f210m1 = 0.0f;
        this.f212n1 = 0.0f;
        this.f214o1 = new C0009i(this);
        this.f216p1 = new C(this, 0);
    }

    public static void P(D d, Runnable runnable) {
        DrawerLayout drawerLayout = d.f209m0;
        Nu nu = d.f192a1;
        drawerLayout.removeCallbacks(nu);
        nu.f6409p = runnable;
        d.f209m0.postDelayed(nu, 300L);
    }

    public static void Q(D d, View view) {
        int i4;
        HorizontalScrollView horizontalScrollView;
        int i5;
        AbstractActivityC1671f h4 = d.h();
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
            if ((d.f2824F != null && d.f2858x) && (horizontalScrollView = (HorizontalScrollView) view.findViewById(R.id.top_elements_scroll_container)) != null) {
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
                int i7 = h4.getResources().getConfiguration().getLayoutDirection() == 0 ? 460 : -460;
                horizontalScrollView.smoothScrollBy(i7, 0);
                view.postDelayed(new RunnableC0017q(horizontalScrollView, i7, 0), 1000L);
            }
        }
    }

    public static void R(D d, ArrayList arrayList) {
        d.a0();
        int size = arrayList.size();
        StringBuilder sb = new StringBuilder();
        sb.append(d.l() != null ? d.l().getString(R.string.timediagram_title) : "Timing Diagram");
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
        d.h0(bVar);
        System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    @Override // C0.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean K() {
        /*
            r5 = this;
            boolean r0 = r5.f203i1
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r5.d0()
            androidx.drawerlayout.widget.DrawerLayout r2 = r5.f209m0
            r3 = 8388613(0x800005, float:1.175495E-38)
            android.view.View r2 = r2.f(r3)
            if (r2 == 0) goto L1a
            boolean r2 = androidx.drawerlayout.widget.DrawerLayout.l(r2)
            goto L1b
        L1a:
            r2 = r1
        L1b:
            r4 = 1
            if (r2 == 0) goto L29
            androidx.drawerlayout.widget.DrawerLayout r0 = r5.f209m0
            r0.c(r3)
            androidx.drawerlayout.widget.DrawerLayout r0 = r5.f209m0
            r0.setDrawerLockMode(r4)
            r0 = r4
        L29:
            if (r0 != 0) goto L40
            com.duracodefactory.logiccircuitsimulatorpro.ui.FrameLayoutCustom r2 = r5.f204j0
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.w(r2)
            int r2 = r2.f12319x
            r3 = 4
            if (r2 == r3) goto L40
            com.duracodefactory.logiccircuitsimulatorpro.ui.FrameLayoutCustom r0 = r5.f204j0
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.w(r0)
            r0.z(r3)
            r0 = r4
        L40:
            if (r0 != 0) goto L49
            boolean r2 = r5.c0()
            if (r2 == 0) goto L49
            r0 = r4
        L49:
            if (r0 != 0) goto L57
            com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramLayout r2 = r5.f173F0
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L57
            r5.T()
            r0 = r4
        L57:
            if (r0 != 0) goto L61
            com.duracodefactory.logiccircuitsimulatorpro.ui.CircuitExploreDialog r2 = r5.f186U0
            if (r2 == 0) goto L61
            r2.b()
            r0 = r4
        L61:
            if (r0 != 0) goto La2
            com.duracodefactory.logiccircuitsimulatorpro.view.BoardView r2 = r5.f202i0
            t2.b r2 = r2.f3821o
            java.lang.Object r2 = r2.f14880o
            e1.d r2 = (e1.d) r2
            E0.a r2 = r2.f12684S
            int r3 = r2.f708p
            int r2 = r2.f707o
            if (r3 == r2) goto L74
            r1 = r4
        L74:
            if (r1 == 0) goto La2
            f.f r0 = r5.h()
            if (r0 != 0) goto L7d
            goto La3
        L7d:
            L2.b r1 = new L2.b
            r1.<init>(r0)
            r2 = 2131755726(0x7f1002ce, float:1.914234E38)
            r1.s(r2)
            C0.a r2 = new C0.a
            r2.<init>()
            r3 = 2131755533(0x7f10020d, float:1.9141948E38)
            r1.q(r3, r2)
            C0.b r2 = new C0.b
            r2.<init>()
            r0 = 2131755177(0x7f1000a9, float:1.9141226E38)
            r1.p(r0, r2)
            r1.k()
            goto La3
        La2:
            r4 = r0
        La3:
            if (r4 != 0) goto La8
            java.lang.System.currentTimeMillis()
        La8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.D.K():boolean");
    }

    @Override // C0.H
    public final void L(boolean z4, KeyEvent keyEvent) {
        this.f202i0.h(z4, keyEvent);
    }

    @Override // C0.H
    public final void N(E e4) {
        this.f219r0 = e4;
    }

    @Override // C0.H
    public final void O(A0 a02) {
        this.f220s0 = a02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(View view, int i4) {
        int i5;
        int i6;
        int i7 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i4 == 39 || i4 == 40 || i4 == 41) {
            AbstractC1698a selectedElement = this.f202i0.getSelectedElement();
            if (selectedElement instanceof p1.P) {
                p1.P p3 = (p1.P) selectedElement;
                PLADialog pLADialog = (PLADialog) view;
                pLADialog.a(p3.f14439T, p3.f14440U, i4 == 41, i4 == 40);
                pLADialog.setInteractMode(true);
                pLADialog.setListener(new C0258Da(this, p3, i7, objArr == true ? 1 : 0));
                return;
            }
            return;
        }
        if (i4 == 50) {
            AbstractC1698a selectedElement2 = this.f202i0.getSelectedElement();
            if (selectedElement2 instanceof p1.e0) {
                p1.e0 e0Var = (p1.e0) selectedElement2;
                TextSetup textSetup = (TextSetup) view;
                boolean z4 = e0Var.f14519R;
                int i8 = e0Var.f14518Q;
                String str = e0Var.f14517P;
                textSetup.f3719t = i8;
                textSetup.f3718s = str;
                textSetup.f3720u = z4;
                if (textSetup.f3714o != null) {
                    textSetup.b();
                }
                textSetup.setListener(new C0783ji(this, e0Var, i7, objArr2 == true ? 1 : 0));
            }
        } else {
            if (i4 == 53 || i4 == 52) {
                AbstractC1698a selectedElement3 = this.f202i0.getSelectedElement();
                if (selectedElement3 instanceof p1.i0) {
                    p1.i0 i0Var = (p1.i0) selectedElement3;
                    TimerSetup timerSetup = (TimerSetup) view;
                    timerSetup.findViewById(R.id.timer_setup_interactive_container).setVisibility(0);
                    timerSetup.setData(i0Var.f14549e0);
                    timerSetup.setListener(new C1510e1(i7, this, i0Var));
                    return;
                }
                return;
            }
            if (i4 == 35 || i4 == 36 || i4 == 38) {
                AbstractC1698a selectedElement4 = this.f202i0.getSelectedElement();
                ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.led_matrix_color_picker_container);
                viewGroup.setVisibility(0);
                ColorPicker colorPicker = (ColorPicker) viewGroup.findViewById(R.id.color_picker_settings);
                if (selectedElement4 instanceof C1924j) {
                    i6 = ((C1924j) selectedElement4).f14554T;
                } else if (selectedElement4 instanceof p1.Z) {
                    i6 = ((p1.Z) selectedElement4).f14492R;
                } else {
                    if (!(selectedElement4 instanceof C1934u)) {
                        i5 = 0;
                        colorPicker.setSelectedColor(i5);
                        int[] iArr = new int[1];
                        colorPicker.setListener(new C0018s(colorPicker, iArr, 0));
                        viewGroup.findViewById(R.id.settings_color_setup_submit).setOnClickListener(new ViewOnClickListenerC0019t(this, selectedElement4, i5, iArr, 0));
                        return;
                    }
                    i6 = ((C1934u) selectedElement4).f14587R;
                }
                i5 = i6;
                colorPicker.setSelectedColor(i5);
                int[] iArr2 = new int[1];
                colorPicker.setListener(new C0018s(colorPicker, iArr2, 0));
                viewGroup.findViewById(R.id.settings_color_setup_submit).setOnClickListener(new ViewOnClickListenerC0019t(this, selectedElement4, i5, iArr2, 0));
                return;
            }
            if (i4 == 19 || i4 == 22 || i4 == 21 || i4 == 18 || i4 == 20) {
                AbstractC1698a selectedElement5 = this.f202i0.getSelectedElement();
                if (selectedElement5 instanceof C1939z) {
                    C1939z c1939z = (C1939z) selectedElement5;
                    ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.generator_setup_container);
                    viewGroup2.setVisibility(0);
                    NumberPicker numberPicker = (NumberPicker) viewGroup2.findViewById(R.id.generator_num_picker);
                    float[] fArr = {0.5f, 1.0f, 1.25f, 2.0f, 2.5f, 4.0f, 5.0f, 6.25f, 10.0f, 12.5f, 20.0f, 25.0f, 40.0f, 50.0f, 62.5f, 100.0f, 125.0f, 200.0f, 250.0f, 500.0f, 1000.0f, 2000.0f, 4000.0f};
                    ArrayList arrayList = new ArrayList();
                    for (int i9 = 0; i9 < 23; i9++) {
                        arrayList.add(C1939z.O(fArr[i9]));
                    }
                    numberPicker.a(C1939z.O(c1939z.f14600R), arrayList);
                    viewGroup2.findViewById(R.id.settings_generator_setup_submit).setOnClickListener(new ViewOnClickListenerC0020u(this, c1939z, fArr, numberPicker, 0));
                }
            }
        }
    }

    public final void T() {
        this.f207l0.setVisibility(8);
        this.f173F0.setVisibility(8);
        this.f170C0.setVisibility(8);
        this.f173F0.setTimeDiagram(null);
        this.f177K0 = false;
        this.f202i0.invalidate();
        System.currentTimeMillis();
    }

    public final boolean U() {
        BoardView boardView = this.f202i0;
        boardView.y = 0.0f;
        boardView.f3831z = 0.0f;
        C1995b c1995b = boardView.f3821o;
        c1995b.getClass();
        HashMap hashMap = new HashMap();
        EnumC1662c enumC1662c = (EnumC1662c) c1995b.f14887v;
        int i4 = 0;
        if (enumC1662c == EnumC1662c.f12675o || enumC1662c == EnumC1662c.f12677q) {
            C1660a c1660a = (C1660a) c1995b.f14886u;
            int size = c1660a.size();
            boolean z4 = false;
            int i5 = 0;
            while (i5 < size) {
                Object obj = c1660a.get(i5);
                i5++;
                j1.c cVar = (j1.c) obj;
                if (!(((C1729a) cVar).f13326o instanceof p1.Q)) {
                    z4 = true;
                }
                hashMap.put(Long.valueOf(cVar.a()), ((C1729a) cVar).f13326o.d(cVar.a()));
            }
            if (!z4) {
                hashMap.clear();
            }
        }
        this.f224w0 = hashMap;
        ArrayList<AbstractC1698a> selectedElements = this.f202i0.getSelectedElements();
        HashMap hashMap2 = this.f225x0;
        hashMap2.clear();
        int size2 = selectedElements.size();
        while (i4 < size2) {
            AbstractC1698a abstractC1698a = selectedElements.get(i4);
            i4++;
            AbstractC1698a abstractC1698a2 = abstractC1698a;
            if (abstractC1698a2.f13121E != 0 && !(abstractC1698a2 instanceof p1.Q) && !(abstractC1698a2 instanceof C1912J)) {
                hashMap2.put(Long.valueOf(abstractC1698a2.f13117A), Integer.valueOf(abstractC1698a2.f13121E));
            }
        }
        return !this.f224w0.isEmpty();
    }

    public final void V(C0783ji c0783ji) {
        try {
            Bitmap e4 = this.f202i0.e(l().getColor(R.color.board_background));
            FileOutputStream fileOutputStream = new FileOutputStream(l().getContentResolver().openFileDescriptor((Uri) c0783ji.f9212q, "w").getFileDescriptor());
            e4.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        s0(R.string.export_success);
    }

    public final void W() {
        s0(R.string.export_fail);
    }

    public final void X(C0783ji c0783ji) {
        try {
            Bitmap a4 = this.f173F0.a(l().getColor(R.color.board_background));
            FileOutputStream fileOutputStream = new FileOutputStream(l().getContentResolver().openFileDescriptor((Uri) c0783ji.f9212q, "w").getFileDescriptor());
            a4.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        s0(R.string.export_success);
    }

    public final C1977g Y() {
        return new C1977g(m().getDimensionPixelSize(R.dimen.grid_text_size), l().getColor(R.color.grid_text_color), m().getDimensionPixelSize(R.dimen.grid_text_padding), l().getColor(R.color.grid_lines_color), m().getDimensionPixelSize(R.dimen.grid_lines_width), this.f218q1);
    }

    public final int Z() {
        AbstractC1698a selectedElement = this.f202i0.getSelectedElement();
        if (selectedElement == null) {
            return -1;
        }
        int r4 = selectedElement.r();
        if (selectedElement instanceof C1917c) {
            if (selectedElement.m("in2") != null) {
                return 14;
            }
        } else if (selectedElement instanceof p1.M) {
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

    public final void a0() {
        BottomSheetBehavior.w(this.f204j0).z(4);
        c0();
    }

    public final void b0() {
        int childCount = this.f215p0.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            this.f215p0.getChildAt(i4).setVisibility(8);
        }
    }

    @Override // q1.InterfaceC1958m
    public final void c() {
    }

    public final boolean c0() {
        if (this.f169B0.getVisibility() != 0) {
            return false;
        }
        this.f169B0.setVisibility(8);
        this.f207l0.setVisibility(8);
        ScrollView scrollView = (ScrollView) this.f169B0.findViewById(R.id.info_ballon_scroller);
        scrollView.post(new RunnableC0021v(scrollView, 0));
        if (!this.f205j1) {
            return true;
        }
        this.f205j1 = false;
        return true;
    }

    @Override // q1.InterfaceC1958m
    public final void d() {
    }

    public final boolean d0() {
        if (this.f187V0.getVisibility() != 0) {
            return false;
        }
        this.f187V0.setVisibility(8);
        AbstractActivityC1671f h4 = h();
        if (h4 == null) {
            return true;
        }
        AbstractC1654b.a(h4, (-AbstractC1654b.x(h4)) - 240);
        return true;
    }

    public final void e0() {
        boolean z4;
        ToolbarContainer toolbarContainer = this.f206k0;
        E0.a aVar = ((e1.d) this.f202i0.f3821o.f14880o).f12684S;
        if (aVar.f708p != aVar.f707o) {
            if (!i1.c.i(toolbarContainer.getContext(), this.f198g0.f13259a)) {
                z4 = true;
                toolbarContainer.setSavingEnabled(z4);
            }
        }
        z4 = false;
        toolbarContainer.setSavingEnabled(z4);
    }

    public final boolean f0(AbstractActivityC1671f abstractActivityC1671f, int i4) {
        return i1.c.i(abstractActivityC1671f, this.f198g0.f13259a) ? this.f202i0.getElementsCount() + i4 > 30 : this.f202i0.getElementsCount() + i4 > 20;
    }

    @Override // q1.InterfaceC1958m
    public final void g() {
        ViewGroup viewGroup = (ViewGroup) this.f2835R;
        AbstractActivityC1671f h4 = h();
        if (this.f180O0 != null && viewGroup != null && h4 != null) {
            V2.e.d(h4, viewGroup);
        }
        q0();
    }

    public final void g0() {
        if (this.k1) {
            int i4 = this.f208l1 + 1;
            this.f208l1 = i4;
            this.f210m1 += this.f212n1;
            this.f172E0.setText(String.valueOf(i4));
            this.f171D0.setText(AbstractC1895f.q(this.f210m1));
            this.f173F0.b(this.f214o1);
            this.f202i0.i();
        }
    }

    public final void h0(m1.b bVar) {
        a0();
        this.f173F0.setTimeDiagram(bVar);
        this.f173F0.setVisibility(0);
    }

    public final void i0() {
        Context l4 = l();
        if (l4 == null || i1.c.i(l4, this.f198g0.f13259a)) {
            return;
        }
        C0003c c0003c = new C0003c(0, this, l4);
        Context l5 = l();
        if (l5 == null || i1.c.i(l5, this.f198g0.f13259a)) {
            return;
        }
        s0(R.string.saving);
        k0();
        i1.c.j(c0003c, this.f198g0, new File(i1.c.g(l5)), null);
        e0();
    }

    public final void j0(EnumC1662c enumC1662c) {
        this.f202i0.setSelectionMode(enumC1662c);
    }

    public final void k0() {
        this.f198g0.d = this.f202i0.getElementsCount();
        this.f198g0.f13261e = this.f202i0.getConnectionsCount();
        this.f198g0.f13263g = this.f202i0.getCircuitCreator();
        i1.d dVar = this.f198g0;
        dVar.f13263g.f1479x = dVar.f13260b;
        dVar.f13262f = new Date();
        i1.d dVar2 = this.f198g0;
        dVar2.c = 0;
        dVar2.f13264h = this.f202i0.getScale();
        this.f198g0.f13265i = this.f202i0.getScrollXModel();
        this.f198g0.f13266j = this.f202i0.getScrollYModel();
    }

    public final void l0(int i4) {
        if (!this.f168A0) {
            this.f226y0 = this.f221t0.getText().toString();
            if (i4 == -1) {
                return;
            }
            b0();
            ViewGroup viewGroup = (ViewGroup) this.f215p0.findViewById(R.id.bottom_info);
            viewGroup.setVisibility(0);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.info_container);
            viewGroup2.removeAllViews();
            View c = AbstractC1651b.c(viewGroup, i4);
            viewGroup2.addView(c);
            BottomSheetBehavior.w(this.f204j0).z(3);
            s0(AbstractC1651b.a(i4));
            S(c, i4);
            return;
        }
        if (BottomSheetBehavior.w(this.f204j0).f12319x == 3) {
            this.J0 = true;
            BottomSheetBehavior.w(this.f204j0).z(4);
        } else {
            if (i4 == -1) {
                return;
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f169B0.findViewById(R.id.info_baloon_content);
            this.f169B0.setVisibility(0);
            ((TextView) this.f169B0.findViewById(R.id.info_baloon_title)).setText(AbstractC1651b.a(i4));
            viewGroup3.removeAllViews();
            View c2 = AbstractC1651b.c(viewGroup3, i4);
            viewGroup3.addView(c2);
            S(c2, i4);
        }
    }

    public final void m0() {
        if (BottomSheetBehavior.w(this.f204j0).f12319x == 3) {
            this.f176I0 = true;
            BottomSheetBehavior.w(this.f204j0).z(4);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f169B0.findViewById(R.id.info_baloon_content);
        this.f169B0.setVisibility(0);
        ((TextView) this.f169B0.findViewById(R.id.info_baloon_title)).setText(R.string.add_ic_title);
        viewGroup.removeAllViews();
        InsertProjectLayout insertProjectLayout = (InsertProjectLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.insert_project_layout, viewGroup, false);
        insertProjectLayout.setInterface(this.f191Z0);
        insertProjectLayout.a(this.f198g0.f13259a);
        viewGroup.addView(insertProjectLayout);
    }

    public final void n0() {
        boolean z4 = this.f168A0;
        C0008h c0008h = this.f190Y0;
        if (z4) {
            ViewGroup viewGroup = (ViewGroup) this.f169B0.findViewById(R.id.info_baloon_content);
            this.f169B0.setVisibility(0);
            ((TextView) this.f169B0.findViewById(R.id.info_baloon_title)).setText(R.string.setup_io_title);
            viewGroup.removeAllViews();
            IcSetup icSetup = (IcSetup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ic_setup_dialog, viewGroup, false);
            icSetup.c(this.f202i0.getNodeInfos(), this.f202i0.getInnerLinks(), this.f198g0.f13260b);
            icSetup.setListener(c0008h);
            viewGroup.addView(icSetup);
            return;
        }
        this.f226y0 = this.f221t0.getText().toString();
        b0();
        ViewGroup viewGroup2 = (ViewGroup) this.f215p0.findViewById(R.id.setup_io);
        viewGroup2.setVisibility(0);
        IcSetup icSetup2 = (IcSetup) viewGroup2.findViewById(R.id.ic_setup_layout);
        icSetup2.c(this.f202i0.getNodeInfos(), this.f202i0.getInnerLinks(), this.f198g0.f13260b);
        icSetup2.setListener(c0008h);
        BottomSheetBehavior.w(this.f204j0).z(3);
        s0(R.string.setup_io_title);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void o(int i4, int i5, Intent intent) {
        if (i4 == 0) {
            if (i5 != -1) {
                s0(R.string.export_cancel);
                return;
            }
            if (intent == null) {
                W();
                return;
            }
            Uri data = intent.getData();
            if (data == null) {
                W();
                return;
            }
            if (l() == null) {
                return;
            }
            C0783ji k3 = C0783ji.n(l(), data).k("text/plain", this.f198g0.f13260b);
            if (k3 == null) {
                W();
                return;
            }
            try {
                s0(R.string.exporting);
                k0();
                i1.c.j(new C0009i(this), this.f198g0, null, l().getContentResolver().openFileDescriptor((Uri) k3.f9212q, "w").getFileDescriptor());
                return;
            } catch (Throwable unused) {
                W();
                return;
            }
        }
        if (i4 == 1) {
            if (i5 != -1) {
                s0(R.string.export_cancel);
                return;
            }
            if (intent == null) {
                W();
                return;
            }
            Uri data2 = intent.getData();
            if (data2 == null) {
                W();
                return;
            }
            if (l() == null) {
                return;
            }
            C0783ji k4 = C0783ji.n(l(), data2).k("image/png", this.f198g0.f13260b);
            if (k4 == null) {
                W();
                return;
            }
            try {
                V(k4);
                return;
            } catch (Throwable unused2) {
                W();
                return;
            }
        }
        if (i4 != 2) {
            return;
        }
        if (i5 != -1) {
            s0(R.string.export_cancel);
            return;
        }
        if (intent == null) {
            W();
            return;
        }
        Uri data3 = intent.getData();
        if (data3 == null) {
            W();
            return;
        }
        if (l() == null) {
            return;
        }
        C0783ji n4 = C0783ji.n(l(), data3);
        m1.b timeDiagram = this.f173F0.getTimeDiagram();
        if (timeDiagram == null) {
            W();
            return;
        }
        C0783ji k5 = n4.k("image/png", this.f198g0.f13260b + ": " + timeDiagram.f13985b);
        if (k5 == null) {
            W();
            return;
        }
        try {
            X(k5);
        } catch (Throwable unused3) {
            W();
        }
    }

    public final void o0(m1.b bVar, boolean z4) {
        this.f170C0.setVisibility(8);
        this.k1 = false;
        if (z4) {
            AbstractActivityC1671f h4 = h();
            if (h4 == null) {
                return;
            }
            AbstractC1654b.a(h4, 5);
            h0(bVar);
        }
        j0(EnumC1662c.f12675o);
        BoardView boardView = this.f202i0;
        boardView.f3807M.f12960g = false;
        e1.f fVar = boardView.f3806L;
        fVar.f12703g = 0L;
        fVar.f12705i = false;
        fVar.f12706j = 0L;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f2833P = true;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [t2.b, java.lang.Object] */
    public final void p0() {
        ViewGroup k3;
        if (this.f184S0.getChildCount() > 0) {
            this.f184S0.removeAllViews();
        }
        AbstractC1698a selectedElement = this.f202i0.getSelectedElement();
        if (selectedElement == null) {
            return;
        }
        Context l4 = l();
        if (l4 == null) {
            k3 = null;
        } else {
            if (this.f183R0 == null) {
                this.f183R0 = new Object();
            }
            k3 = this.f183R0.k(l4, selectedElement);
        }
        if (k3 == null) {
            return;
        }
        this.f184S0.addView(k3);
    }

    public final void q0() {
        AbstractActivityC1671f h4 = h();
        if (h4 == null) {
            return;
        }
        boolean z4 = AbstractC1959n.d(h4) || AbstractC1959n.b(h4) || AbstractC1959n.c(h4);
        Iterator it = this.f189X0.values().iterator();
        while (it.hasNext()) {
            boolean z5 = !z4;
            Control control = (Control) this.f188W0.findViewById(((Integer) it.next()).intValue());
            if (control != null) {
                control.setPro(z5);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final View r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i4;
        ViewGroup viewGroup2;
        boolean z4;
        View inflate = layoutInflater.inflate(R.layout.circuit_edit, viewGroup, false);
        String string = this.f2853s.getString("project_name");
        this.f202i0 = (BoardView) inflate.findViewById(R.id.board);
        this.f206k0 = (ToolbarContainer) inflate.findViewById(R.id.toolbar);
        this.f204j0 = (FrameLayoutCustom) inflate.findViewById(R.id.bottom);
        this.f207l0 = inflate.findViewById(R.id.bg);
        this.f209m0 = (DrawerLayout) inflate.findViewById(R.id.drawer_layout);
        this.f211n0 = (TopControlsLayout) inflate.findViewById(R.id.top_controls);
        this.f169B0 = (ViewGroup) inflate.findViewById(R.id.info_ballon);
        this.f170C0 = (ViewGroup) inflate.findViewById(R.id.timediagram_ballon);
        this.f173F0 = (TimeDiagramLayout) inflate.findViewById(R.id.timediagram_container);
        this.N0 = inflate.findViewById(R.id.permissions_caution);
        this.f184S0 = (ViewGroup) inflate.findViewById(R.id.elem_popup_container);
        this.f187V0 = inflate.findViewById(R.id.rate_us_dialog_container);
        this.f185T0 = (ViewGroup) inflate.findViewById(R.id.explore_container);
        int i5 = 0;
        this.f184S0.setOnClickListener(new ViewOnClickListenerC0006f(this, i5));
        this.f184S0.setOnTouchListener(new ViewOnTouchListenerC0007g(i5, this));
        this.N0.setOnClickListener(new ViewOnClickListenerC0006f(this, 1));
        this.f171D0 = (TextView) this.f170C0.findViewById(R.id.timediagrsm_elapsed_time);
        this.f172E0 = (TextView) this.f170C0.findViewById(R.id.timediagrsm_elapsed_frames);
        this.f174G0 = inflate.findViewById(R.id.select_node_message);
        this.f175H0 = inflate.findViewById(R.id.element_info_hint_balloon);
        inflate.findViewById(R.id.info_baloon_close).setOnClickListener(new ViewOnClickListenerC0006f(this, 2));
        ArrayList arrayList = BottomSheetBehavior.w(this.f204j0).f12291G;
        A a4 = this.f193b1;
        if (!arrayList.contains(a4)) {
            arrayList.add(a4);
        }
        this.f204j0.setListener(new C0008h(this, 0));
        Resources.getSystem().getConfiguration();
        this.f206k0.setInterface(this.f194c1);
        this.f209m0.setDrawerLockMode(1);
        this.f209m0.a(this.f196e1);
        this.f211n0.setInterface(this.f195d1);
        this.f211n0.b(new int[0], R.id.single_select);
        this.f211n0.setRippleRemoved(new int[]{R.id.single_select, R.id.multi_select, R.id.interact, R.id.connect_mode});
        this.f207l0.setOnClickListener(this.f197f1);
        View findViewById = inflate.findViewById(R.id.fab);
        this.f213o0 = findViewById;
        findViewById.setOnClickListener(new ViewOnClickListenerC0006f(this, 3));
        ((ViewGroup.MarginLayoutParams) ((v.e) this.f213o0.getLayoutParams())).bottomMargin = inflate.getResources().getDimensionPixelSize(R.dimen.fab_margin) + inflate.getResources().getDimensionPixelSize(R.dimen.bottom_sheet_peek_height);
        this.f215p0 = (FrameLayout) inflate.findViewById(R.id.bottom_sheet_content);
        ElementsLayout elementsLayout = (ElementsLayout) inflate.findViewById(R.id.bottom_elements);
        this.f188W0 = elementsLayout;
        elementsLayout.setInterface(new C0009i(this));
        q0();
        EditText editText = (EditText) inflate.findViewById(R.id.project_name);
        this.f223v0 = editText;
        editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0010j(this, inflate));
        this.f217q0 = (TextView) inflate.findViewById(R.id.toolbar_project_name);
        ViewGroup viewGroup3 = (ViewGroup) inflate;
        this.f180O0 = new V2.e(h(), viewGroup3, new C0008h(this, 1));
        this.f221t0 = (TextView) inflate.findViewById(R.id.status_message);
        this.f222u0 = (FrameLayout) inflate.findViewById(R.id.status_message_container);
        this.f218q1 = AbstractC1806a.v(h());
        inflate.findViewById(R.id.scroll_to_origin).setOnClickListener(new ViewOnClickListenerC0006f(this, 4));
        try {
            this.f198g0 = i1.c.e(inflate.getContext(), string);
            i4 = 1;
            viewGroup2 = viewGroup3;
        } catch (Throwable unused) {
            i1.d dVar = new i1.d();
            this.f198g0 = dVar;
            dVar.f13259a = string;
            dVar.f13260b = string;
            dVar.f13262f = new Date();
            i4 = 1;
            viewGroup2 = viewGroup3;
            this.f198g0.f13263g = new P0.a(0L, 0.0f, 0.0f, string, new ArrayList(), new ArrayList(), new HashMap(), 0, new ArrayList());
        }
        this.f223v0.setText(this.f198g0.f13260b);
        this.f217q0.setText(this.f198g0.f13260b);
        this.f202i0.g(this.f198g0.f13263g);
        this.f202i0.setGridProperties(Y());
        this.f202i0.setSnappingEnabled(AbstractC1806a.G(h()));
        this.f202i0.setVibrateOnPath(AbstractC1806a.I(h()));
        this.f202i0.setLabelsVisible(AbstractC1806a.e(h()));
        BoardView boardView = this.f202i0;
        C0077n c0077n = this.f199g1;
        boardView.setListener(c0077n);
        this.f202i0.setGridVisibility(AbstractC1806a.E(h()));
        this.f202i0.setScale(this.f198g0.f13264h);
        this.f202i0.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0013m(0, this));
        e0();
        r0(viewGroup2);
        TextView textView = (TextView) inflate.findViewById(R.id.expand_collapse);
        textView.setOnClickListener(new ViewOnClickListenerC0014n(0, this, textView));
        s0(R.string.welcome);
        c0077n.h();
        this.f168A0 = AbstractC1806a.H(inflate.getContext());
        this.f173F0.setListener(new C0009i(this));
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
        this.f200h0 = bundle != null ? bundle.getLong("saved_timestamp") : System.currentTimeMillis();
        inflate.postDelayed(new RunnableC0016p(this, inflate, 0), 1000L);
        this.f181P0 = inflate.findViewById(R.id.watch_reward_video_menu_notification);
        LoadingScreen loadingScreen = (LoadingScreen) inflate.findViewById(R.id.anim_load_screen);
        boolean z5 = (bundle == null || !bundle.getBoolean("project_loaded")) ? 0 : i4;
        this.f182Q0 = z5;
        i1.d dVar2 = this.f198g0;
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
                i1.d dVar3 = this.f198g0;
                loadingScreen.a(dVar3.f13260b, dVar3.d, dVar3.f13261e, new ViewOnClickListenerC0014n(1, this, inflate));
                this.f182Q0 = i4;
                return inflate;
            }
        }
        if (!AbstractC1895f.x(h(), 8)) {
            inflate.postDelayed(new RunnableC0016p(this, inflate, 1), 600L);
        }
        this.f182Q0 = i4;
        return inflate;
    }

    public final void r0(ViewGroup viewGroup) {
        String str;
        if (l() != null) {
            DecimalFormat decimalFormat = new DecimalFormat("###.##");
            ((TextView) viewGroup.findViewById(R.id.real_time_info)).setText("1 : " + decimalFormat.format(this.f202i0.getRealTime()) + " " + l().getString(R.string.real_time_info));
            TextView textView = (TextView) viewGroup.findViewById(R.id.elements_latency_info);
            StringBuilder sb = new StringBuilder();
            sb.append(l().getString(R.string.latency_info).toUpperCase());
            sb.append(": ");
            int i4 = AbstractC1955j.f14675a;
            float realTime = 16 / this.f202i0.getRealTime();
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

    public final void s0(int i4) {
        if (this.f227z0 == 3) {
            this.f226y0 = this.f221t0.getContext().getString(i4);
            return;
        }
        this.f221t0.setText(i4);
        this.f222u0.setPressed(true);
        this.f222u0.postDelayed(this.f201h1, 100L);
    }

    public final void t0(AbstractActivityC1671f abstractActivityC1671f) {
        if (!abstractActivityC1671f.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
            C(new String[]{"android.permission.RECORD_AUDIO"});
            return;
        }
        try {
            DialogC1832H dialogC1832H = new DialogC1832H(abstractActivityC1671f);
            dialogC1832H.setOnDismissListener(new DialogInterfaceOnDismissListenerC0023x(this, dialogC1832H, 0));
            dialogC1832H.show();
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void v() {
        this.f202i0.p();
        if (this.k1) {
            o0(null, false);
        }
        AbstractC1959n.f14703f.remove(this);
        this.f2833P = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void w(int i4, String[] strArr, int[] iArr) {
        AbstractActivityC1671f h4 = h();
        if (h4 != null) {
            this.f178L0 = true;
            this.f179M0 = AbstractC1895f.g(h4, "android.permission.RECORD_AUDIO") == 0;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void x() {
        AbstractActivityC1671f h4 = h();
        if (h4 != null) {
            this.f178L0 = true;
            this.f179M0 = AbstractC1895f.g(h4, "android.permission.RECORD_AUDIO") == 0;
        }
        this.f202i0.n();
        AbstractC1959n.f14703f.add(this);
        this.f2833P = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void y(Bundle bundle) {
        bundle.putBoolean("project_loaded", this.f182Q0);
        bundle.putLong("saved_timestamp", this.f200h0);
    }
}
