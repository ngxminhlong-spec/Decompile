package D0;

import C0.A0;
import C0.C0001a0;
import C0.D;
import C0.E;
import C0.H;
import C0.N;
import C0.V;
import C0.c0;
import C0.l0;
import C0.m0;
import C0.t0;
import C0.u0;
import C0.z0;
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
import com.google.android.gms.internal.ads.Nu;
import f.AbstractActivityC1671f;
import java.io.File;
import java.util.HashSet;
import m2.AbstractC1806a;
import q1.AbstractC1959n;
import q1.InterfaceC1958m;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class p extends H implements InterfaceC1958m {

    /* renamed from: A0, reason: collision with root package name */
    public View f614A0;

    /* renamed from: g0, reason: collision with root package name */
    public DrawerLayout f618g0;

    /* renamed from: h0, reason: collision with root package name */
    public l0 f619h0;

    /* renamed from: j0, reason: collision with root package name */
    public View f621j0;

    /* renamed from: k0, reason: collision with root package name */
    public c0 f622k0;

    /* renamed from: l0, reason: collision with root package name */
    public C0077n f623l0;

    /* renamed from: m0, reason: collision with root package name */
    public A0 f624m0;

    /* renamed from: n0, reason: collision with root package name */
    public E f625n0;

    /* renamed from: o0, reason: collision with root package name */
    public k f626o0;

    /* renamed from: p0, reason: collision with root package name */
    public u0 f627p0;

    /* renamed from: q0, reason: collision with root package name */
    public C0001a0 f628q0;

    /* renamed from: t0, reason: collision with root package name */
    public View f631t0;

    /* renamed from: u0, reason: collision with root package name */
    public V2.e f632u0;

    /* renamed from: v0, reason: collision with root package name */
    public View f633v0;

    /* renamed from: w0, reason: collision with root package name */
    public BottomNavigationBarView f634w0;

    /* renamed from: i0, reason: collision with root package name */
    public int f620i0 = R.id.projects_tab;

    /* renamed from: r0, reason: collision with root package name */
    public final N f629r0 = new N(this, 2);

    /* renamed from: s0, reason: collision with root package name */
    public final t0 f630s0 = new t0(this, 1);

    /* renamed from: x0, reason: collision with root package name */
    public final h f635x0 = new Object();

    /* renamed from: y0, reason: collision with root package name */
    public final i f636y0 = new i(this, 0);

    /* renamed from: z0, reason: collision with root package name */
    public final i f637z0 = new i(this, 1);

    /* renamed from: B0, reason: collision with root package name */
    public final Nu f615B0 = new Nu(this, 18);

    /* renamed from: C0, reason: collision with root package name */
    public final A0.a f616C0 = new A0.a(24, this);

    /* renamed from: D0, reason: collision with root package name */
    public final HashSet f617D0 = new HashSet();

    public static void P(p pVar, Runnable runnable) {
        DrawerLayout drawerLayout = pVar.f618g0;
        Nu nu = pVar.f615B0;
        drawerLayout.removeCallbacks(nu);
        nu.f6409p = runnable;
        pVar.f618g0.postDelayed(nu, 300L);
    }

    public static void Q(p pVar, int i4, boolean z4) {
        t0 t0Var = pVar.f630s0;
        if (z4) {
            pVar.f618g0.removeCallbacks(t0Var);
            t0Var.f400p = i4;
            pVar.f618g0.postDelayed(t0Var, 200L);
        } else {
            E e4 = pVar.f625n0;
            if (e4 != null) {
                ((MainActivity) e4).F(z0.P(i4));
            }
        }
    }

    public static void R(p pVar, int i4) {
        pVar.f620i0 = i4;
        pVar.f634w0.setSelected(i4);
        pVar.f619h0.e();
        if (i4 == R.id.tutorials_tab) {
            pVar.f614A0.setVisibility(8);
        } else if (i4 == R.id.learning_tab) {
            pVar.f614A0.setVisibility(8);
        } else {
            pVar.f614A0.setVisibility(0);
        }
    }

    public static void S(p pVar, int i4) {
        if (i4 == R.id.projects_tab) {
            l0.a(pVar.f619h0, false);
        } else if (i4 == R.id.tutorials_tab) {
            u0.a(pVar.f627p0, false);
        } else {
            C0001a0.a(pVar.f628q0, false);
        }
    }

    @Override // C0.H
    public final boolean K() {
        boolean a4 = c0.a(this.f622k0);
        if (!a4) {
            View f4 = this.f618g0.f(8388611);
            if (f4 != null ? DrawerLayout.l(f4) : false) {
                this.f618g0.c(8388611);
                a4 = true;
            }
        }
        if (!a4) {
            this.f619h0.getClass();
        }
        return a4;
    }

    @Override // C0.H
    public final void M() {
        AbstractActivityC1671f h4 = h();
        if (h4 != null) {
            this.f633v0.setVisibility((AbstractC1959n.d(h4) || AbstractC1959n.b(h4) || AbstractC1959n.c(h4)) ? 8 : 0);
        }
        if (this.f633v0.getVisibility() == 0) {
            ((TextView) this.f633v0.findViewById(R.id.buy_banner_text)).setText(h4.getString(R.string.unlock_full_version_for));
        }
        d();
        c();
    }

    @Override // C0.H
    public final void N(E e4) {
        this.f625n0 = e4;
    }

    @Override // C0.H
    public final void O(A0 a02) {
        this.f624m0 = a02;
    }

    public final void T(String str, boolean z4) {
        if (z4) {
            DrawerLayout drawerLayout = this.f618g0;
            N n4 = this.f629r0;
            drawerLayout.removeCallbacks(n4);
            n4.f240q = str;
            this.f618g0.postDelayed(n4, 100L);
            return;
        }
        E e4 = this.f625n0;
        if (e4 != null) {
            D d = new D();
            Bundle bundle = new Bundle();
            bundle.putString("project_name", str);
            d.G(bundle);
            ((MainActivity) e4).F(d);
        }
    }

    @Override // q1.InterfaceC1958m
    public final void c() {
        if (AbstractC1806a.f14007Q) {
            ((TextView) this.f633v0.findViewById(R.id.buy_banner_text)).setText(R.string.your_payment_is_pending);
        }
    }

    @Override // q1.InterfaceC1958m
    public final void d() {
        AbstractActivityC1671f h4 = h();
        if (h4 != null && AbstractC1806a.O(h4)) {
            ((TextView) this.f633v0.findViewById(R.id.buy_banner_text)).setText(R.string.payment_error);
            c();
        }
    }

    @Override // q1.InterfaceC1958m
    public final void g() {
        ViewGroup viewGroup = (ViewGroup) this.f2835R;
        AbstractActivityC1671f h4 = h();
        if (this.f632u0 != null && viewGroup != null && h4 != null) {
            V2.e.d(h4, viewGroup);
        }
        if (h4 != null) {
            this.f633v0.setVisibility((AbstractC1959n.d(h4) || AbstractC1959n.b(h4) || AbstractC1959n.c(h4)) ? 8 : 0);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void o(int i4, int i5, Intent intent) {
        if (i5 == 0) {
            return;
        }
        if (i4 == 0) {
            c0 c0Var = this.f622k0;
            c0Var.getClass();
            if (intent == null || intent.getData() == null) {
                return;
            }
            c0Var.d(intent.getData());
            return;
        }
        if (i4 == 1) {
            p pVar = this.f626o0.f589o;
            if (intent == null || intent.getData() == null) {
                return;
            }
            try {
                i1.c.j(null, i1.c.c(pVar.h().getContentResolver().openInputStream(intent.getData()), i1.c.f(pVar.h())), new File(i1.c.g(pVar.l())), null);
            } catch (Throwable unused) {
                if (pVar.l() != null) {
                    Toast.makeText(pVar.l(), R.string.err_import_project, 1).show();
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final View r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.recents, viewGroup, false);
        try {
            if (viewGroup.getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
                ((ImageView) inflate.findViewById(R.id.recents_logo_img)).setScaleType(ImageView.ScaleType.FIT_END);
            }
        } catch (Throwable unused) {
        }
        DrawerLayout drawerLayout = (DrawerLayout) inflate.findViewById(R.id.drawer_layout);
        this.f618g0 = drawerLayout;
        drawerLayout.a(this.f635x0);
        BottomNavigationBarView bottomNavigationBarView = (BottomNavigationBarView) inflate.findViewById(R.id.recents_bottom_navigation);
        this.f634w0 = bottomNavigationBarView;
        bottomNavigationBarView.setListener(this.f636y0);
        this.f619h0 = new l0(this, (ViewGroup) inflate.findViewById(R.id.recents_new_container));
        this.f621j0 = inflate.findViewById(R.id.recent_loading_container);
        View findViewById = inflate.findViewById(R.id.fab);
        this.f614A0 = findViewById;
        findViewById.setOnClickListener(this.f637z0);
        this.f622k0 = new c0(this, (ViewGroup) inflate.findViewById(R.id.profile_info_container));
        this.f623l0 = new C0077n(this, (ViewGroup) inflate.findViewById(R.id.drawer_profile_info));
        this.f626o0 = new k(this);
        this.f627p0 = new u0(this, (ViewGroup) inflate.findViewById(R.id.tutorials_container));
        this.f628q0 = new C0001a0(this, (ViewGroup) inflate.findViewById(R.id.learns_container));
        this.f631t0 = inflate.findViewById(R.id.empty_recents);
        this.f633v0 = inflate.findViewById(R.id.buy_banner);
        AbstractActivityC1671f h4 = h();
        if (h4 != null) {
            this.f633v0.setVisibility((AbstractC1959n.d(h4) || AbstractC1959n.b(h4) || AbstractC1959n.c(h4)) ? 8 : 0);
            TextView textView = (TextView) this.f633v0.findViewById(R.id.buy_banner_text);
            if (AbstractC1806a.O(h4)) {
                textView.setText(R.string.payment_error);
            } else {
                textView.setText(h4.getString(R.string.unlock_full_version_for));
            }
            c();
        }
        this.f633v0.setOnClickListener(new i(this, 2));
        inflate.findViewById(R.id.empty_projects_create).setOnClickListener(new i(this, 3));
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new V(this, inflate, 1));
        if (bundle != null) {
            this.f620i0 = bundle.getInt("current_tab", this.f620i0);
            this.f619h0.getClass();
            c0 c0Var = this.f622k0;
            c0Var.getClass();
            if (bundle.getBoolean("profile_visible", false)) {
                c0Var.c();
                c0Var.c.setVisibility(0);
                c0Var.f287b.setName(bundle.getString("profile_avatar", ""));
                c0Var.d((Uri) bundle.getParcelable("profile_avatar"));
            }
        }
        this.f632u0 = new V2.e(h(), (ViewGroup) inflate, new k(this));
        new m0(this, 1).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        i1.c.c.add(this.f619h0);
        return inflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void s() {
        i1.c.c.remove(this.f619h0);
        this.f2833P = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final void v() {
        this.f2833P = true;
        AbstractC1959n.f14703f.remove(this);
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
        bundle.putInt("current_tab", this.f620i0);
        this.f619h0.getClass();
        c0 c0Var = this.f622k0;
        if (c0Var.c.getVisibility() == 0) {
            bundle.putBoolean("profile_visible", true);
            bundle.putString("profile_name", c0Var.f287b.getName());
            bundle.putParcelable("profile_avatar", c0Var.f290g);
        }
    }
}
