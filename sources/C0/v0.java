package C0;

import O1.C0077n;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.drawerlayout.widget.DrawerLayout;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.BottomNavigationBarView;
import com.duracodefactory.logiccircuitsimulatorpro.ui.CircuitExploreDialog;
import com.duracodefactory.logiccircuitsimulatorpro.ui.RecentsRecyclerView;
import com.duracodefactory.logiccircuitsimulatorpro.ui.UploaderLayout;
import com.google.android.gms.internal.ads.Nu;
import f.AbstractActivityC1671f;
import java.io.File;
import java.util.HashSet;
import java.util.Objects;
import m2.AbstractC1806a;
import q1.AbstractC1959n;
import q1.InterfaceC1958m;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class v0 extends H implements InterfaceC1958m {

    /* renamed from: A0, reason: collision with root package name */
    public long f416A0;

    /* renamed from: B0, reason: collision with root package name */
    public final U f417B0;

    /* renamed from: C0, reason: collision with root package name */
    public final B f418C0;

    /* renamed from: D0, reason: collision with root package name */
    public final U f419D0;

    /* renamed from: F0, reason: collision with root package name */
    public View f421F0;

    /* renamed from: g0, reason: collision with root package name */
    public View f425g0;

    /* renamed from: h0, reason: collision with root package name */
    public DrawerLayout f426h0;

    /* renamed from: i0, reason: collision with root package name */
    public l0 f427i0;

    /* renamed from: k0, reason: collision with root package name */
    public View f429k0;

    /* renamed from: l0, reason: collision with root package name */
    public c0 f430l0;

    /* renamed from: m0, reason: collision with root package name */
    public C0077n f431m0;

    /* renamed from: n0, reason: collision with root package name */
    public A0 f432n0;

    /* renamed from: o0, reason: collision with root package name */
    public E f433o0;

    /* renamed from: p0, reason: collision with root package name */
    public X f434p0;

    /* renamed from: q0, reason: collision with root package name */
    public u0 f435q0;

    /* renamed from: r0, reason: collision with root package name */
    public C0001a0 f436r0;

    /* renamed from: s0, reason: collision with root package name */
    public s0 f437s0;

    /* renamed from: t0, reason: collision with root package name */
    public ViewGroup f438t0;

    /* renamed from: v0, reason: collision with root package name */
    public final t0 f440v0;

    /* renamed from: w0, reason: collision with root package name */
    public View f441w0;

    /* renamed from: x0, reason: collision with root package name */
    public V2.e f442x0;

    /* renamed from: y0, reason: collision with root package name */
    public View f443y0;

    /* renamed from: z0, reason: collision with root package name */
    public BottomNavigationBarView f444z0;

    /* renamed from: j0, reason: collision with root package name */
    public int f428j0 = R.id.projects_tab;

    /* renamed from: u0, reason: collision with root package name */
    public final N f439u0 = new N(this, 1);

    /* renamed from: E0, reason: collision with root package name */
    public final U f420E0 = new U(this, 2);

    /* renamed from: G0, reason: collision with root package name */
    public final Nu f422G0 = new Nu(this, 15);

    /* renamed from: H0, reason: collision with root package name */
    public final A0.a f423H0 = new A0.a(13, this);

    /* renamed from: I0, reason: collision with root package name */
    public final HashSet f424I0 = new HashSet();

    public v0() {
        int i4 = 0;
        this.f440v0 = new t0(this, i4);
        this.f417B0 = new U(this, i4);
        int i5 = 1;
        this.f418C0 = new B(this, i5);
        this.f419D0 = new U(this, i5);
    }

    public static void P(v0 v0Var, Runnable runnable) {
        DrawerLayout drawerLayout = v0Var.f426h0;
        Nu nu = v0Var.f422G0;
        drawerLayout.removeCallbacks(nu);
        nu.f6409p = runnable;
        v0Var.f426h0.postDelayed(nu, 300L);
    }

    public static void Q(v0 v0Var, int i4, boolean z4) {
        t0 t0Var = v0Var.f440v0;
        if (z4) {
            v0Var.f426h0.removeCallbacks(t0Var);
            t0Var.f400p = i4;
            v0Var.f426h0.postDelayed(t0Var, 200L);
        } else {
            E e4 = v0Var.f433o0;
            if (e4 != null) {
                ((MainActivity) e4).F(z0.P(i4));
            }
        }
    }

    public static void R(v0 v0Var, int i4) {
        int i5 = v0Var.f428j0;
        if (i5 == R.id.projects_tab) {
            System.currentTimeMillis();
            v0Var.f416A0 = System.currentTimeMillis();
        } else if (i5 == R.id.tutorials_tab) {
            System.currentTimeMillis();
            v0Var.f416A0 = System.currentTimeMillis();
        } else if (i5 == R.id.learning_tab) {
            System.currentTimeMillis();
            v0Var.f416A0 = System.currentTimeMillis();
        } else if (i5 == R.id.shared_tab) {
            System.currentTimeMillis();
            v0Var.f416A0 = System.currentTimeMillis();
        }
        v0Var.f428j0 = i4;
        v0Var.f444z0.setSelected(i4);
        v0Var.f427i0.d();
        if (i4 == R.id.tutorials_tab) {
            v0Var.f421F0.setVisibility(8);
            return;
        }
        if (i4 == R.id.learning_tab) {
            v0Var.f421F0.setVisibility(8);
        } else if (i4 == R.id.shared_tab) {
            v0Var.f421F0.setVisibility(8);
        } else {
            v0Var.f421F0.setVisibility(0);
        }
    }

    public static void S(v0 v0Var, int i4) {
        if (i4 == R.id.projects_tab) {
            l0.b(v0Var.f427i0, false);
            return;
        }
        if (i4 == R.id.tutorials_tab) {
            u0.b(v0Var.f435q0, false);
        } else if (i4 == R.id.learning_tab) {
            C0001a0.d(v0Var.f436r0, false);
        } else if (i4 == R.id.shared_tab) {
            s0.a(v0Var.f437s0, false);
        }
    }

    @Override // C0.H
    public final boolean K() {
        boolean b4 = c0.b(this.f430l0);
        boolean z4 = false;
        if (!b4) {
            View f4 = this.f426h0.f(8388611);
            if (f4 != null ? DrawerLayout.l(f4) : false) {
                this.f426h0.c(8388611);
                b4 = true;
            }
        }
        if (!b4) {
            this.f427i0.getClass();
        }
        if (!b4) {
            s0 s0Var = this.f437s0;
            ViewGroup viewGroup = (ViewGroup) s0Var.c;
            ViewGroup viewGroup2 = (ViewGroup) s0Var.d;
            if (viewGroup2.getVisibility() == 0) {
                if (viewGroup2.getChildCount() > 0) {
                    z4 = ((CircuitExploreDialog) viewGroup2.getChildAt(0)).b();
                }
            } else if (viewGroup.getVisibility() == 0 && viewGroup.getChildCount() > 0) {
                z4 = ((CircuitExploreDialog) viewGroup.getChildAt(0)).b();
            }
            if (z4) {
                b4 = true;
            }
        }
        if (b4 || !T()) {
            return b4;
        }
        return true;
    }

    @Override // C0.H
    public final void M() {
        AbstractActivityC1671f h4 = h();
        if (h4 != null) {
            this.f443y0.setVisibility((AbstractC1959n.d(h4) || AbstractC1959n.b(h4) || AbstractC1959n.c(h4)) ? 8 : 0);
        }
        if (this.f443y0.getVisibility() == 0) {
            ((TextView) this.f443y0.findViewById(R.id.buy_banner_text)).setText(h4.getString(R.string.unlock_full_version_for));
        }
        d();
        c();
    }

    @Override // C0.H
    public final void N(E e4) {
        this.f433o0 = e4;
    }

    @Override // C0.H
    public final void O(A0 a02) {
        this.f432n0 = a02;
    }

    public final boolean T() {
        if (this.f438t0.getVisibility() != 0) {
            return false;
        }
        this.f438t0.setVisibility(8);
        ((UploaderLayout) this.f438t0.findViewById(R.id.upload_layout)).f3792r = null;
        return true;
    }

    public final void U(String str, boolean z4) {
        if (!z4) {
            E e4 = this.f433o0;
            if (e4 != null) {
                D d = new D();
                Bundle bundle = new Bundle();
                bundle.putString("project_name", str);
                d.G(bundle);
                ((MainActivity) e4).F(d);
                return;
            }
            return;
        }
        if (!Objects.equals(l().getString(R.string.button_demo_project_title), str) && !Objects.equals(l().getString(R.string.led_matrix_demo_project_title), str) && !Objects.equals(l().getString(R.string.rgb_demo_project_title), str) && !Objects.equals(l().getString(R.string.zero_f_counter_demo_project_title), str)) {
            Objects.equals(l().getString(R.string.explore_devices_demo), str);
        }
        DrawerLayout drawerLayout = this.f426h0;
        N n4 = this.f439u0;
        drawerLayout.removeCallbacks(n4);
        n4.f240q = str;
        this.f426h0.postDelayed(n4, 100L);
    }

    @Override // q1.InterfaceC1958m
    public final void c() {
        if (AbstractC1806a.f14007Q) {
            ((TextView) this.f443y0.findViewById(R.id.buy_banner_text)).setText(R.string.your_payment_is_pending);
        }
    }

    @Override // q1.InterfaceC1958m
    public final void d() {
        AbstractActivityC1671f h4 = h();
        if (h4 != null && AbstractC1806a.O(h4)) {
            ((TextView) this.f443y0.findViewById(R.id.buy_banner_text)).setText(R.string.payment_error);
            c();
        }
    }

    @Override // q1.InterfaceC1958m
    public final void g() {
        ViewGroup viewGroup = (ViewGroup) this.f2835R;
        AbstractActivityC1671f h4 = h();
        if (this.f442x0 != null && viewGroup != null && h4 != null) {
            V2.e.d(h4, viewGroup);
        }
        if (h4 != null) {
            this.f443y0.setVisibility((AbstractC1959n.d(h4) || AbstractC1959n.b(h4) || AbstractC1959n.c(h4)) ? 8 : 0);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void o(int i4, int i5, Intent intent) {
        if (i5 == 0) {
            return;
        }
        if (i4 == 0) {
            c0 c0Var = this.f430l0;
            c0Var.getClass();
            if (intent == null || intent.getData() == null) {
                return;
            }
            c0Var.d(intent.getData());
            return;
        }
        if (i4 == 1) {
            v0 v0Var = this.f434p0.f260o;
            if (intent == null || intent.getData() == null) {
                return;
            }
            try {
                i1.c.j(null, i1.c.c(v0Var.h().getContentResolver().openInputStream(intent.getData()), i1.c.f(v0Var.h())), new File(i1.c.g(v0Var.l())), null);
            } catch (Throwable unused) {
                if (v0Var.l() != null) {
                    Toast.makeText(v0Var.l(), R.string.err_import_project, 1).show();
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final View r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z4;
        boolean z5;
        View inflate = layoutInflater.inflate(R.layout.recents, viewGroup, false);
        try {
            if (viewGroup.getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
                ((ImageView) inflate.findViewById(R.id.recents_logo_img)).setScaleType(ImageView.ScaleType.FIT_END);
            }
        } catch (Throwable unused) {
        }
        this.f425g0 = inflate.findViewById(R.id.settings_wheel);
        this.f426h0 = (DrawerLayout) inflate.findViewById(R.id.drawer_layout);
        this.f425g0.setOnClickListener(this.f417B0);
        this.f426h0.a(this.f418C0);
        BottomNavigationBarView bottomNavigationBarView = (BottomNavigationBarView) inflate.findViewById(R.id.recents_bottom_navigation);
        this.f444z0 = bottomNavigationBarView;
        bottomNavigationBarView.setListener(this.f419D0);
        this.f427i0 = new l0(this, (ViewGroup) inflate.findViewById(R.id.recents_new_container));
        this.f429k0 = inflate.findViewById(R.id.recent_loading_container);
        View findViewById = inflate.findViewById(R.id.fab);
        this.f421F0 = findViewById;
        findViewById.setOnClickListener(this.f420E0);
        this.f430l0 = new c0(this, (ViewGroup) inflate.findViewById(R.id.profile_info_container));
        this.f431m0 = new C0077n(this, (ViewGroup) inflate.findViewById(R.id.drawer_profile_info));
        this.f434p0 = new X(this);
        this.f435q0 = new u0(this, (ViewGroup) inflate.findViewById(R.id.tutorials_container));
        this.f436r0 = new C0001a0(this, (ViewGroup) inflate.findViewById(R.id.learns_container));
        this.f437s0 = new s0(this, (ViewGroup) inflate.findViewById(R.id.shared_container));
        this.f438t0 = (ViewGroup) inflate.findViewById(R.id.share_dialog_container);
        this.f441w0 = inflate.findViewById(R.id.empty_recents);
        this.f443y0 = inflate.findViewById(R.id.buy_banner);
        AbstractActivityC1671f h4 = h();
        if (h4 != null) {
            boolean z6 = (AbstractC1959n.d(h4) || AbstractC1959n.b(h4) || AbstractC1959n.c(h4)) ? false : true;
            this.f443y0.setVisibility(z6 ? 0 : 8);
            TextView textView = (TextView) this.f443y0.findViewById(R.id.buy_banner_text);
            if (AbstractC1806a.O(h4)) {
                textView.setText(R.string.payment_error);
            } else {
                textView.setText(h4.getString(R.string.unlock_full_version_for));
            }
            c();
            if (z6) {
                inflate.findViewById(R.id.shared_card_container_container).setVisibility(0);
                inflate.findViewById(R.id.shared_new_label).setVisibility(0);
            }
            Boolean bool = AbstractC1806a.f14036k0;
            if (bool != null) {
                z5 = bool.booleanValue();
            } else {
                z5 = h4.getPreferences(0).getBoolean("can_upload", false);
                AbstractC1806a.f14036k0 = Boolean.valueOf(z5);
            }
            if (!z5) {
                inflate.findViewById(R.id.sharing_bottom_button).setVisibility(8);
            }
        }
        this.f443y0.setOnClickListener(new U(this, 3));
        inflate.findViewById(R.id.empty_projects_create).setOnClickListener(new U(this, 4));
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new V(this, inflate, 0));
        if (bundle != null) {
            this.f428j0 = bundle.getInt("current_tab", this.f428j0);
            this.f427i0.getClass();
            c0 c0Var = this.f430l0;
            c0Var.getClass();
            if (bundle.getBoolean("profile_visible", false)) {
                c0Var.c();
                c0Var.c.setVisibility(0);
                c0Var.f287b.setName(bundle.getString("profile_avatar", ""));
                c0Var.d((Uri) bundle.getParcelable("profile_avatar"));
            }
            this.f416A0 = bundle.getLong("ts");
        } else {
            this.f416A0 = System.currentTimeMillis();
        }
        int i4 = this.f428j0;
        if (i4 == R.id.projects_tab) {
            inflate.findViewById(R.id.recents_new_container).setVisibility(0);
            this.f421F0.setVisibility(0);
        } else if (i4 == R.id.tutorials_tab) {
            inflate.findViewById(R.id.tutorials_container).setVisibility(0);
            this.f421F0.setVisibility(8);
        } else if (i4 == R.id.learning_tab) {
            inflate.findViewById(R.id.learns_container).setVisibility(0);
            this.f421F0.setVisibility(8);
        } else if (i4 == R.id.shared_tab) {
            inflate.findViewById(R.id.shared_container).setVisibility(0);
            this.f421F0.setVisibility(8);
        }
        this.f442x0 = new V2.e(h(), (ViewGroup) inflate, new X(this));
        new m0(this, 0).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        i1.c.c.add(this.f427i0);
        final View findViewById2 = inflate.findViewById(R.id.recent_recent_text);
        final RecentsRecyclerView recentsRecyclerView = this.f427i0.f340b;
        findViewById2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: C0.S
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                View view2 = recentsRecyclerView;
                view2.setPadding(view2.getPaddingLeft(), findViewById2.getHeight(), view2.getPaddingRight(), view2.getPaddingBottom());
            }
        });
        AbstractActivityC1671f h5 = h();
        if (h5 != null) {
            View findViewById3 = inflate.findViewById(R.id.electrobox_container);
            Boolean bool2 = AbstractC1806a.f14038l0;
            if (bool2 != null) {
                z4 = bool2.booleanValue();
            } else {
                z4 = h5.getPreferences(0).getBoolean("electro", true);
                AbstractC1806a.f14038l0 = Boolean.valueOf(z4);
            }
            if (z4) {
                inflate.findViewById(R.id.shared_card_container_container).setVisibility(8);
                inflate.findViewById(R.id.electrobox_close).setOnClickListener(new ViewOnClickListenerC0004d(findViewById3, h5, 2));
                findViewById3.setOnClickListener(new I(2, this));
            } else {
                findViewById3.setVisibility(8);
            }
        }
        return inflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void s() {
        i1.c.c.remove(this.f427i0);
        this.f2833P = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void v() {
        this.f2833P = true;
        AbstractC1959n.f14703f.remove(this);
        s0.b(this.f437s0);
        s0.c(this.f437s0);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void x() {
        this.f2833P = true;
        AbstractC1959n.f14703f.add(this);
        g();
        d();
        c();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void y(Bundle bundle) {
        bundle.putInt("current_tab", this.f428j0);
        bundle.putLong("ts", this.f416A0);
        this.f427i0.getClass();
        c0 c0Var = this.f430l0;
        if (c0Var.c.getVisibility() == 0) {
            bundle.putBoolean("profile_visible", true);
            bundle.putString("profile_name", c0Var.f287b.getName());
            bundle.putParcelable("profile_avatar", c0Var.f290g);
        }
    }
}
