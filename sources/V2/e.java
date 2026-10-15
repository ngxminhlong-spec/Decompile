package V2;

import H.InterfaceC0038m;
import Q1.I;
import Q1.N;
import android.animation.ValueAnimator;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.NavigationViewFit;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C0887m;
import com.google.android.gms.internal.ads.C0937n6;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.measurement.C1510e1;
import f.AbstractActivityC1671f;
import g0.InterfaceC1679a;
import h0.C1697e;
import m2.AbstractC1806a;
import o1.C1825A;
import o1.C1826B;
import o1.C1889z;
import o1.InterfaceC1827C;
import o2.InterfaceC1891b;
import o2.InterfaceC1892c;
import q1.AbstractC1959n;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class e implements F1.a, InterfaceC0038m, k.k, T1.c, Z.f, androidx.lifecycle.t, InterfaceC1679a, InterfaceC1892c {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1853o;

    public /* synthetic */ e(int i4) {
        this.f1853o = i4;
    }

    public e(NavigationViewFit navigationViewFit) {
        this.f1853o = 12;
    }

    public e(AbstractActivityC1671f abstractActivityC1671f, ViewGroup viewGroup, final InterfaceC1827C interfaceC1827C) {
        this.f1853o = 23;
        View findViewById = viewGroup.findViewById(R.id.edit_profile);
        if (findViewById != null) {
            final int i4 = 0;
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: o1.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            interfaceC1827C.h();
                            return;
                        case 1:
                            interfaceC1827C.c();
                            return;
                        case 2:
                            interfaceC1827C.h();
                            return;
                        case 3:
                            interfaceC1827C.k();
                            return;
                        case 4:
                            interfaceC1827C.q();
                            return;
                        case 5:
                            interfaceC1827C.b();
                            return;
                        case 6:
                            interfaceC1827C.l();
                            return;
                        case 7:
                            interfaceC1827C.t();
                            return;
                        case 8:
                            interfaceC1827C.a();
                            return;
                        case 9:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 10:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 11:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 12:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 13:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 14:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 15:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 16:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        default:
                            interfaceC1827C.c();
                            return;
                    }
                }
            });
        }
        View findViewById2 = viewGroup.findViewById(R.id.drawer_go_premium);
        int i5 = 8;
        if (findViewById2 != null) {
            final int i6 = 17;
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: o1.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i6) {
                        case 0:
                            interfaceC1827C.h();
                            return;
                        case 1:
                            interfaceC1827C.c();
                            return;
                        case 2:
                            interfaceC1827C.h();
                            return;
                        case 3:
                            interfaceC1827C.k();
                            return;
                        case 4:
                            interfaceC1827C.q();
                            return;
                        case 5:
                            interfaceC1827C.b();
                            return;
                        case 6:
                            interfaceC1827C.l();
                            return;
                        case 7:
                            interfaceC1827C.t();
                            return;
                        case 8:
                            interfaceC1827C.a();
                            return;
                        case 9:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 10:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 11:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 12:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 13:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 14:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 15:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 16:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        default:
                            interfaceC1827C.c();
                            return;
                    }
                }
            });
            findViewById2.setVisibility((AbstractC1959n.d(abstractActivityC1671f) || AbstractC1959n.b(abstractActivityC1671f) || AbstractC1959n.c(abstractActivityC1671f)) ? 8 : 0);
        }
        View findViewById3 = viewGroup.findViewById(R.id.drawer_go_premium_old_user);
        if (findViewById3 != null) {
            final int i7 = 1;
            findViewById3.setOnClickListener(new View.OnClickListener() { // from class: o1.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            interfaceC1827C.h();
                            return;
                        case 1:
                            interfaceC1827C.c();
                            return;
                        case 2:
                            interfaceC1827C.h();
                            return;
                        case 3:
                            interfaceC1827C.k();
                            return;
                        case 4:
                            interfaceC1827C.q();
                            return;
                        case 5:
                            interfaceC1827C.b();
                            return;
                        case 6:
                            interfaceC1827C.l();
                            return;
                        case 7:
                            interfaceC1827C.t();
                            return;
                        case 8:
                            interfaceC1827C.a();
                            return;
                        case 9:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 10:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 11:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 12:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 13:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 14:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 15:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 16:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        default:
                            interfaceC1827C.c();
                            return;
                    }
                }
            });
            if (!AbstractC1959n.d(abstractActivityC1671f) && !AbstractC1959n.b(abstractActivityC1671f) && AbstractC1959n.c(abstractActivityC1671f)) {
                i5 = 0;
            }
            findViewById3.setVisibility(i5);
        }
        View findViewById4 = viewGroup.findViewById(R.id.avatar_frame);
        if (findViewById4 != null) {
            final int i8 = 2;
            findViewById4.setOnClickListener(new View.OnClickListener() { // from class: o1.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i8) {
                        case 0:
                            interfaceC1827C.h();
                            return;
                        case 1:
                            interfaceC1827C.c();
                            return;
                        case 2:
                            interfaceC1827C.h();
                            return;
                        case 3:
                            interfaceC1827C.k();
                            return;
                        case 4:
                            interfaceC1827C.q();
                            return;
                        case 5:
                            interfaceC1827C.b();
                            return;
                        case 6:
                            interfaceC1827C.l();
                            return;
                        case 7:
                            interfaceC1827C.t();
                            return;
                        case 8:
                            interfaceC1827C.a();
                            return;
                        case 9:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 10:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 11:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 12:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 13:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 14:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 15:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 16:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        default:
                            interfaceC1827C.c();
                            return;
                    }
                }
            });
        }
        View findViewById5 = viewGroup.findViewById(R.id.electro);
        if (findViewById5 != null) {
            final int i9 = 3;
            findViewById5.setOnClickListener(new View.OnClickListener() { // from class: o1.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i9) {
                        case 0:
                            interfaceC1827C.h();
                            return;
                        case 1:
                            interfaceC1827C.c();
                            return;
                        case 2:
                            interfaceC1827C.h();
                            return;
                        case 3:
                            interfaceC1827C.k();
                            return;
                        case 4:
                            interfaceC1827C.q();
                            return;
                        case 5:
                            interfaceC1827C.b();
                            return;
                        case 6:
                            interfaceC1827C.l();
                            return;
                        case 7:
                            interfaceC1827C.t();
                            return;
                        case 8:
                            interfaceC1827C.a();
                            return;
                        case 9:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 10:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 11:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 12:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 13:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 14:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 15:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 16:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        default:
                            interfaceC1827C.c();
                            return;
                    }
                }
            });
        }
        View findViewById6 = viewGroup.findViewById(R.id.drawer_import_project);
        if (findViewById6 != null) {
            final int i10 = 4;
            findViewById6.setOnClickListener(new View.OnClickListener() { // from class: o1.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            interfaceC1827C.h();
                            return;
                        case 1:
                            interfaceC1827C.c();
                            return;
                        case 2:
                            interfaceC1827C.h();
                            return;
                        case 3:
                            interfaceC1827C.k();
                            return;
                        case 4:
                            interfaceC1827C.q();
                            return;
                        case 5:
                            interfaceC1827C.b();
                            return;
                        case 6:
                            interfaceC1827C.l();
                            return;
                        case 7:
                            interfaceC1827C.t();
                            return;
                        case 8:
                            interfaceC1827C.a();
                            return;
                        case 9:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 10:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 11:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 12:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 13:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 14:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 15:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 16:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        default:
                            interfaceC1827C.c();
                            return;
                    }
                }
            });
        }
        View findViewById7 = viewGroup.findViewById(R.id.drawer_export_project);
        if (findViewById7 != null) {
            final int i11 = 5;
            findViewById7.setOnClickListener(new View.OnClickListener() { // from class: o1.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            interfaceC1827C.h();
                            return;
                        case 1:
                            interfaceC1827C.c();
                            return;
                        case 2:
                            interfaceC1827C.h();
                            return;
                        case 3:
                            interfaceC1827C.k();
                            return;
                        case 4:
                            interfaceC1827C.q();
                            return;
                        case 5:
                            interfaceC1827C.b();
                            return;
                        case 6:
                            interfaceC1827C.l();
                            return;
                        case 7:
                            interfaceC1827C.t();
                            return;
                        case 8:
                            interfaceC1827C.a();
                            return;
                        case 9:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 10:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 11:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 12:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 13:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 14:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 15:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 16:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        default:
                            interfaceC1827C.c();
                            return;
                    }
                }
            });
        }
        View findViewById8 = viewGroup.findViewById(R.id.drawer_export_project_image);
        if (findViewById8 != null) {
            final int i12 = 6;
            findViewById8.setOnClickListener(new View.OnClickListener() { // from class: o1.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            interfaceC1827C.h();
                            return;
                        case 1:
                            interfaceC1827C.c();
                            return;
                        case 2:
                            interfaceC1827C.h();
                            return;
                        case 3:
                            interfaceC1827C.k();
                            return;
                        case 4:
                            interfaceC1827C.q();
                            return;
                        case 5:
                            interfaceC1827C.b();
                            return;
                        case 6:
                            interfaceC1827C.l();
                            return;
                        case 7:
                            interfaceC1827C.t();
                            return;
                        case 8:
                            interfaceC1827C.a();
                            return;
                        case 9:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 10:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 11:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 12:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 13:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 14:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 15:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 16:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        default:
                            interfaceC1827C.c();
                            return;
                    }
                }
            });
        }
        View findViewById9 = viewGroup.findViewById(R.id.drawer_tutorials);
        if (findViewById9 != null) {
            final int i13 = 7;
            findViewById9.setOnClickListener(new View.OnClickListener() { // from class: o1.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            interfaceC1827C.h();
                            return;
                        case 1:
                            interfaceC1827C.c();
                            return;
                        case 2:
                            interfaceC1827C.h();
                            return;
                        case 3:
                            interfaceC1827C.k();
                            return;
                        case 4:
                            interfaceC1827C.q();
                            return;
                        case 5:
                            interfaceC1827C.b();
                            return;
                        case 6:
                            interfaceC1827C.l();
                            return;
                        case 7:
                            interfaceC1827C.t();
                            return;
                        case 8:
                            interfaceC1827C.a();
                            return;
                        case 9:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 10:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 11:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 12:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 13:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 14:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 15:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        case 16:
                            interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                            return;
                        default:
                            interfaceC1827C.c();
                            return;
                    }
                }
            });
        }
        final int i14 = 8;
        viewGroup.findViewById(R.id.drawer_help).setOnClickListener(new View.OnClickListener() { // from class: o1.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        interfaceC1827C.h();
                        return;
                    case 1:
                        interfaceC1827C.c();
                        return;
                    case 2:
                        interfaceC1827C.h();
                        return;
                    case 3:
                        interfaceC1827C.k();
                        return;
                    case 4:
                        interfaceC1827C.q();
                        return;
                    case 5:
                        interfaceC1827C.b();
                        return;
                    case 6:
                        interfaceC1827C.l();
                        return;
                    case 7:
                        interfaceC1827C.t();
                        return;
                    case 8:
                        interfaceC1827C.a();
                        return;
                    case 9:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 10:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 11:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 12:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 13:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 14:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 15:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 16:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    default:
                        interfaceC1827C.c();
                        return;
                }
            }
        });
        Switch r02 = (Switch) viewGroup.findViewById(R.id.dark_mode_swtich);
        boolean C4 = AbstractC1806a.C(abstractActivityC1671f);
        r02.setChecked(C4);
        TextView textView = (TextView) viewGroup.findViewById(R.id.dark_mode_text);
        int i15 = R.string.off;
        textView.setText(C4 ? R.string.on : R.string.off);
        r02.setOnCheckedChangeListener(new J2.f(1, interfaceC1827C));
        Switch r03 = (Switch) viewGroup.findViewById(R.id.grid_visible_switch);
        if (r03 != null) {
            boolean E4 = AbstractC1806a.E(abstractActivityC1671f);
            r03.setChecked(E4);
            ((TextView) viewGroup.findViewById(R.id.grid_visible)).setText(E4 ? R.string.on : R.string.off);
            r03.setOnCheckedChangeListener(new C1889z(interfaceC1827C, viewGroup, 0));
        }
        Switch r04 = (Switch) viewGroup.findViewById(R.id.snap_switch);
        if (r04 != null) {
            boolean G3 = AbstractC1806a.G(abstractActivityC1671f);
            r04.setChecked(G3);
            ((TextView) viewGroup.findViewById(R.id.snapping_text)).setText(G3 ? R.string.on : R.string.off);
            r04.setOnCheckedChangeListener(new C1825A(interfaceC1827C, viewGroup, r04, 0));
        }
        Switch r05 = (Switch) viewGroup.findViewById(R.id.vibration_switch);
        if (r05 != null) {
            boolean I4 = AbstractC1806a.I(abstractActivityC1671f);
            r05.setChecked(I4);
            ((TextView) viewGroup.findViewById(R.id.vibration_text)).setText(I4 ? R.string.on : R.string.off);
            r05.setOnCheckedChangeListener(new C1825A(interfaceC1827C, viewGroup, r05, 1));
        }
        Switch r06 = (Switch) viewGroup.findViewById(R.id.labels_visibility_switch);
        if (r06 != null) {
            boolean e4 = AbstractC1806a.e(abstractActivityC1671f);
            r06.setChecked(e4);
            ((TextView) viewGroup.findViewById(R.id.labels_visibility_text)).setText(e4 ? R.string.on : i15);
            r06.setOnCheckedChangeListener(new C1889z(interfaceC1827C, viewGroup, 1));
        }
        RadioGroup radioGroup = (RadioGroup) viewGroup.findViewById(R.id.units_radio_group);
        if (radioGroup != null) {
            radioGroup.check(AbstractC1806a.v(abstractActivityC1671f) == 1 ? R.id.mm_toggle : R.id.inches_toggle);
            radioGroup.setOnCheckedChangeListener(new C1826B(interfaceC1827C));
        }
        int i16 = R.id.theme1_container;
        final int i17 = 9;
        viewGroup.findViewById(R.id.theme1_container).setOnClickListener(new View.OnClickListener() { // from class: o1.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        interfaceC1827C.h();
                        return;
                    case 1:
                        interfaceC1827C.c();
                        return;
                    case 2:
                        interfaceC1827C.h();
                        return;
                    case 3:
                        interfaceC1827C.k();
                        return;
                    case 4:
                        interfaceC1827C.q();
                        return;
                    case 5:
                        interfaceC1827C.b();
                        return;
                    case 6:
                        interfaceC1827C.l();
                        return;
                    case 7:
                        interfaceC1827C.t();
                        return;
                    case 8:
                        interfaceC1827C.a();
                        return;
                    case 9:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 10:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 11:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 12:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 13:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 14:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 15:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 16:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    default:
                        interfaceC1827C.c();
                        return;
                }
            }
        });
        final int i18 = 10;
        viewGroup.findViewById(R.id.theme2_container).setOnClickListener(new View.OnClickListener() { // from class: o1.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        interfaceC1827C.h();
                        return;
                    case 1:
                        interfaceC1827C.c();
                        return;
                    case 2:
                        interfaceC1827C.h();
                        return;
                    case 3:
                        interfaceC1827C.k();
                        return;
                    case 4:
                        interfaceC1827C.q();
                        return;
                    case 5:
                        interfaceC1827C.b();
                        return;
                    case 6:
                        interfaceC1827C.l();
                        return;
                    case 7:
                        interfaceC1827C.t();
                        return;
                    case 8:
                        interfaceC1827C.a();
                        return;
                    case 9:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 10:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 11:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 12:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 13:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 14:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 15:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 16:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    default:
                        interfaceC1827C.c();
                        return;
                }
            }
        });
        final int i19 = 11;
        viewGroup.findViewById(R.id.theme3_container).setOnClickListener(new View.OnClickListener() { // from class: o1.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        interfaceC1827C.h();
                        return;
                    case 1:
                        interfaceC1827C.c();
                        return;
                    case 2:
                        interfaceC1827C.h();
                        return;
                    case 3:
                        interfaceC1827C.k();
                        return;
                    case 4:
                        interfaceC1827C.q();
                        return;
                    case 5:
                        interfaceC1827C.b();
                        return;
                    case 6:
                        interfaceC1827C.l();
                        return;
                    case 7:
                        interfaceC1827C.t();
                        return;
                    case 8:
                        interfaceC1827C.a();
                        return;
                    case 9:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 10:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 11:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 12:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 13:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 14:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 15:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 16:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    default:
                        interfaceC1827C.c();
                        return;
                }
            }
        });
        final int i20 = 12;
        viewGroup.findViewById(R.id.theme4_container).setOnClickListener(new View.OnClickListener() { // from class: o1.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        interfaceC1827C.h();
                        return;
                    case 1:
                        interfaceC1827C.c();
                        return;
                    case 2:
                        interfaceC1827C.h();
                        return;
                    case 3:
                        interfaceC1827C.k();
                        return;
                    case 4:
                        interfaceC1827C.q();
                        return;
                    case 5:
                        interfaceC1827C.b();
                        return;
                    case 6:
                        interfaceC1827C.l();
                        return;
                    case 7:
                        interfaceC1827C.t();
                        return;
                    case 8:
                        interfaceC1827C.a();
                        return;
                    case 9:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 10:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 11:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 12:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 13:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 14:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 15:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 16:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    default:
                        interfaceC1827C.c();
                        return;
                }
            }
        });
        final int i21 = 13;
        viewGroup.findViewById(R.id.theme5_container).setOnClickListener(new View.OnClickListener() { // from class: o1.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i21) {
                    case 0:
                        interfaceC1827C.h();
                        return;
                    case 1:
                        interfaceC1827C.c();
                        return;
                    case 2:
                        interfaceC1827C.h();
                        return;
                    case 3:
                        interfaceC1827C.k();
                        return;
                    case 4:
                        interfaceC1827C.q();
                        return;
                    case 5:
                        interfaceC1827C.b();
                        return;
                    case 6:
                        interfaceC1827C.l();
                        return;
                    case 7:
                        interfaceC1827C.t();
                        return;
                    case 8:
                        interfaceC1827C.a();
                        return;
                    case 9:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 10:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 11:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 12:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 13:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 14:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 15:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 16:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    default:
                        interfaceC1827C.c();
                        return;
                }
            }
        });
        final int i22 = 14;
        viewGroup.findViewById(R.id.theme6_container).setOnClickListener(new View.OnClickListener() { // from class: o1.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i22) {
                    case 0:
                        interfaceC1827C.h();
                        return;
                    case 1:
                        interfaceC1827C.c();
                        return;
                    case 2:
                        interfaceC1827C.h();
                        return;
                    case 3:
                        interfaceC1827C.k();
                        return;
                    case 4:
                        interfaceC1827C.q();
                        return;
                    case 5:
                        interfaceC1827C.b();
                        return;
                    case 6:
                        interfaceC1827C.l();
                        return;
                    case 7:
                        interfaceC1827C.t();
                        return;
                    case 8:
                        interfaceC1827C.a();
                        return;
                    case 9:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 10:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 11:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 12:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 13:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 14:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 15:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 16:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    default:
                        interfaceC1827C.c();
                        return;
                }
            }
        });
        final int i23 = 15;
        viewGroup.findViewById(R.id.theme7_container).setOnClickListener(new View.OnClickListener() { // from class: o1.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i23) {
                    case 0:
                        interfaceC1827C.h();
                        return;
                    case 1:
                        interfaceC1827C.c();
                        return;
                    case 2:
                        interfaceC1827C.h();
                        return;
                    case 3:
                        interfaceC1827C.k();
                        return;
                    case 4:
                        interfaceC1827C.q();
                        return;
                    case 5:
                        interfaceC1827C.b();
                        return;
                    case 6:
                        interfaceC1827C.l();
                        return;
                    case 7:
                        interfaceC1827C.t();
                        return;
                    case 8:
                        interfaceC1827C.a();
                        return;
                    case 9:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 10:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 11:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 12:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 13:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 14:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 15:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 16:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    default:
                        interfaceC1827C.c();
                        return;
                }
            }
        });
        final int i24 = 16;
        viewGroup.findViewById(R.id.theme8_container).setOnClickListener(new View.OnClickListener() { // from class: o1.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i24) {
                    case 0:
                        interfaceC1827C.h();
                        return;
                    case 1:
                        interfaceC1827C.c();
                        return;
                    case 2:
                        interfaceC1827C.h();
                        return;
                    case 3:
                        interfaceC1827C.k();
                        return;
                    case 4:
                        interfaceC1827C.q();
                        return;
                    case 5:
                        interfaceC1827C.b();
                        return;
                    case 6:
                        interfaceC1827C.l();
                        return;
                    case 7:
                        interfaceC1827C.t();
                        return;
                    case 8:
                        interfaceC1827C.a();
                        return;
                    case 9:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 10:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 11:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 12:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 13:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 14:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 15:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    case 16:
                        interfaceC1827C.g(AbstractC1806a.u(view.getId()));
                        return;
                    default:
                        interfaceC1827C.c();
                        return;
                }
            }
        });
        switch (AbstractC1806a.t(abstractActivityC1671f)) {
            case R.style.AppTheme2 /* 2131820553 */:
                i16 = R.id.theme2_container;
                break;
            case R.style.AppTheme3 /* 2131820554 */:
                i16 = R.id.theme3_container;
                break;
            case R.style.AppTheme4 /* 2131820555 */:
                i16 = R.id.theme4_container;
                break;
            case R.style.AppTheme5 /* 2131820556 */:
                i16 = R.id.theme5_container;
                break;
            case R.style.AppTheme6 /* 2131820557 */:
                i16 = R.id.theme6_container;
                break;
            case R.style.AppTheme7 /* 2131820558 */:
                i16 = R.id.theme7_container;
                break;
            case R.style.AppTheme8 /* 2131820559 */:
                i16 = R.id.theme8_container;
                break;
        }
        viewGroup.findViewById(i16).setSelected(true);
    }

    public e(int[] iArr, ValueAnimator valueAnimator) {
        this.f1853o = 11;
    }

    public static void d(AbstractActivityC1671f abstractActivityC1671f, ViewGroup viewGroup) {
        View findViewById = viewGroup.findViewById(R.id.drawer_go_premium);
        int i4 = 8;
        if (findViewById != null) {
            findViewById.setVisibility((AbstractC1959n.d(abstractActivityC1671f) || AbstractC1959n.b(abstractActivityC1671f) || AbstractC1959n.c(abstractActivityC1671f)) ? 8 : 0);
        }
        View findViewById2 = viewGroup.findViewById(R.id.drawer_go_premium_old_user);
        if (findViewById2 != null) {
            if (!AbstractC1959n.d(abstractActivityC1671f) && !AbstractC1959n.b(abstractActivityC1671f) && AbstractC1959n.c(abstractActivityC1671f)) {
                i4 = 0;
            }
            findViewById2.setVisibility(i4);
        }
    }

    public static final boolean f(Context context, Intent intent, P1.l lVar, P1.j jVar, boolean z4) {
        int i4;
        if (z4) {
            Uri data = intent.getData();
            try {
                N1.n.f1204A.c.getClass();
                i4 = N.z(context, data);
                if (lVar != null) {
                    lVar.h();
                }
            } catch (ActivityNotFoundException e4) {
                Y9.s(e4.getMessage());
                i4 = 6;
            }
            if (jVar != null) {
                jVar.u(i4);
            }
            return i4 == 5;
        }
        try {
            I.w("Launching an intent: " + intent.toURI());
            N n4 = N1.n.f1204A.c;
            N.o(context, intent);
            if (lVar != null) {
                lVar.h();
            }
            if (jVar != null) {
                jVar.v(true);
            }
            return true;
        } catch (ActivityNotFoundException e5) {
            Y9.s(e5.getMessage());
            if (jVar != null) {
                jVar.v(false);
            }
            return false;
        }
    }

    public static final boolean j(Context context, P1.b bVar, P1.l lVar, P1.j jVar) {
        int i4 = 0;
        if (bVar == null) {
            Y9.s("No intent data for launcher overlay.");
            return false;
        }
        String str = bVar.f1505r;
        String str2 = bVar.f1504q;
        boolean z4 = bVar.f1511x;
        String str3 = bVar.f1506s;
        String str4 = bVar.f1503p;
        AbstractC1066q6.a(context);
        Intent intent = bVar.f1509v;
        if (intent != null) {
            return f(context, intent, lVar, jVar, z4);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(str4)) {
            Y9.s("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            intent2.setData(Uri.parse(str4));
        } else {
            intent2.setDataAndType(Uri.parse(str4), str2);
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(str)) {
            intent2.setPackage(str);
        }
        if (!TextUtils.isEmpty(str3)) {
            String[] split = str3.split("/", 2);
            if (split.length < 2) {
                Y9.s("Could not parse component name from open GMSG: ".concat(str3));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str5 = bVar.f1507t;
        if (!TextUtils.isEmpty(str5)) {
            try {
                i4 = Integer.parseInt(str5);
            } catch (NumberFormatException unused) {
                Y9.s("Could not parse intent flags.");
            }
            intent2.addFlags(i4);
        }
        C0937n6 c0937n6 = AbstractC1066q6.Q3;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) rVar.c.a(AbstractC1066q6.f10149P3)).booleanValue()) {
                N n4 = N1.n.f1204A.c;
                N.B(context, intent2);
            }
        }
        return f(context, intent2, lVar, jVar, z4);
    }

    @Override // g0.InterfaceC1679a
    public g0.b a(B0.c cVar) {
        return new C1697e((Context) cVar.f68p, (String) cVar.f69q, (C1510e1) cVar.f70r, cVar.f67o);
    }

    @Override // androidx.lifecycle.t
    public androidx.lifecycle.s b() {
        return new androidx.fragment.app.u(true);
    }

    @Override // F1.a
    public long c() {
        return System.currentTimeMillis();
    }

    @Override // androidx.lifecycle.t
    public androidx.lifecycle.s e(Class cls, R.b bVar) {
        return b();
    }

    @Override // k.k
    public boolean g(k.m mVar, MenuItem menuItem) {
        return false;
    }

    @Override // o2.InterfaceC1892c
    public C0887m h(Context context, String str, InterfaceC1891b interfaceC1891b) {
        int g4;
        switch (this.f1853o) {
            case 24:
                C0887m c0887m = new C0887m();
                int g5 = interfaceC1891b.g(context, str, true);
                c0887m.f9513b = g5;
                if (g5 != 0) {
                    c0887m.c = 1;
                } else {
                    int f4 = interfaceC1891b.f(context, str);
                    c0887m.f9512a = f4;
                    if (f4 != 0) {
                        c0887m.c = -1;
                    }
                }
                return c0887m;
            default:
                C0887m c0887m2 = new C0887m();
                int f5 = interfaceC1891b.f(context, str);
                c0887m2.f9512a = f5;
                int i4 = 1;
                int i5 = 0;
                if (f5 != 0) {
                    g4 = interfaceC1891b.g(context, str, false);
                    c0887m2.f9513b = g4;
                } else {
                    g4 = interfaceC1891b.g(context, str, true);
                    c0887m2.f9513b = g4;
                }
                int i6 = c0887m2.f9512a;
                if (i6 != 0) {
                    i5 = i6;
                } else if (g4 == 0) {
                    i4 = 0;
                    c0887m2.c = i4;
                    return c0887m2;
                }
                if (i5 >= g4) {
                    i4 = -1;
                }
                c0887m2.c = i4;
                return c0887m2;
        }
    }

    @Override // k.k
    public void i(k.m mVar) {
    }

    @Override // Z.f
    public void l() {
    }

    @Override // Z.f
    public void n(int i4, Object obj) {
    }

    @Override // H.InterfaceC0038m
    public void onScrollLimit(int i4, int i5, int i6, boolean z4) {
    }

    @Override // H.InterfaceC0038m
    public void onScrollProgress(int i4, int i5, int i6, int i7) {
    }
}
