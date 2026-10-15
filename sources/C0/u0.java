package C0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import androidx.recyclerview.widget.GridLayoutManager;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.RecentsRecyclerView;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TutorialView2;
import m2.AbstractC1806a;
import n1.AbstractC1810c;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f408a;

    /* renamed from: b, reason: collision with root package name */
    public final RecentsRecyclerView f409b;
    public final ViewGroup c;
    public final ViewGroup d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f410e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f411f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f412g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ H f413h;

    public u0(v0 v0Var, ViewGroup viewGroup) {
        this.f413h = v0Var;
        this.f408a = v0Var.m().getDimensionPixelSize(R.dimen.tutorials_min_width);
        boolean H3 = AbstractC1806a.H(viewGroup.getContext());
        this.f412g = H3;
        if (H3) {
            viewGroup.findViewById(R.id.tutorials_tutorial_container_scroll).setVisibility(0);
        }
        this.d = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.tutorials_tutorial_container);
        this.c = viewGroup2;
        this.f410e = (ViewGroup) viewGroup.findViewById(R.id.tutorial_scroller);
        RecentsRecyclerView recentsRecyclerView = (RecentsRecyclerView) viewGroup.findViewById(R.id.tutorials_recycler);
        this.f409b = recentsRecyclerView;
        q0 q0Var = new q0();
        q0Var.f370f = new D3.d(5, this);
        q0Var.f369e = AbstractC1810c.f14110a;
        recentsRecyclerView.setAdapter(q0Var);
        recentsRecyclerView.setLayoutManager(new GridLayoutManager());
        recentsRecyclerView.setListener(new x0.f(7, this));
        if (H3) {
            viewGroup2.removeAllViews();
            TutorialView2 tutorialView2 = (TutorialView2) LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.tutorial_view_layout2, viewGroup2, false);
            tutorialView2.a(AbstractC1810c.a(0), z0.Q(0));
            viewGroup2.addView(tutorialView2);
        }
    }

    public u0(D0.p pVar, ViewGroup viewGroup) {
        this.f413h = pVar;
        this.f408a = pVar.m().getDimensionPixelSize(R.dimen.tutorials_min_width);
        boolean H3 = AbstractC1806a.H(viewGroup.getContext());
        this.f412g = H3;
        if (H3) {
            viewGroup.findViewById(R.id.tutorials_tutorial_container_scroll).setVisibility(0);
        }
        this.d = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.tutorials_tutorial_container);
        this.c = viewGroup2;
        this.f410e = (ViewGroup) viewGroup.findViewById(R.id.tutorial_scroller);
        RecentsRecyclerView recentsRecyclerView = (RecentsRecyclerView) viewGroup.findViewById(R.id.tutorials_recycler);
        this.f409b = recentsRecyclerView;
        q0 q0Var = new q0();
        q0Var.f370f = new x0.f(8, this);
        q0Var.f369e = AbstractC1810c.f14110a;
        recentsRecyclerView.setAdapter(q0Var);
        recentsRecyclerView.setLayoutManager(new GridLayoutManager());
        recentsRecyclerView.setListener(new D3.d(9, this));
        if (H3) {
            viewGroup2.removeAllViews();
            TutorialView2 tutorialView2 = (TutorialView2) LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.tutorial_view_layout2, viewGroup2, false);
            tutorialView2.a(AbstractC1810c.a(0), z0.Q(0));
            viewGroup2.addView(tutorialView2);
        }
    }

    public static void a(u0 u0Var, boolean z4) {
        D0.p pVar = (D0.p) u0Var.f413h;
        ViewGroup viewGroup = u0Var.d;
        int visibility = viewGroup.getVisibility();
        int i4 = z4 ? 0 : 8;
        if (visibility == i4) {
            if (visibility != 0 || u0Var.f411f) {
                return;
            }
            D0.p.R(pVar, R.id.tutorials_tab);
            return;
        }
        if (i4 != 0) {
            u0Var.f411f = true;
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(100L);
            viewGroup.startAnimation(alphaAnimation);
            viewGroup.postDelayed(new D0.o(1, u0Var), 100L);
            return;
        }
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(100L);
        viewGroup.setVisibility(0);
        viewGroup.startAnimation(alphaAnimation2);
        D0.p.S(pVar, pVar.f620i0);
        D0.p.R(pVar, R.id.tutorials_tab);
    }

    public static void b(u0 u0Var, boolean z4) {
        v0 v0Var = (v0) u0Var.f413h;
        ViewGroup viewGroup = u0Var.d;
        int visibility = viewGroup.getVisibility();
        int i4 = z4 ? 0 : 8;
        if (visibility == i4) {
            if (visibility != 0 || u0Var.f411f) {
                return;
            }
            v0.R(v0Var, R.id.tutorials_tab);
            return;
        }
        if (i4 != 0) {
            u0Var.f411f = true;
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(100L);
            viewGroup.startAnimation(alphaAnimation);
            viewGroup.postDelayed(new A0.a(21, u0Var), 100L);
            return;
        }
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(100L);
        viewGroup.setVisibility(0);
        viewGroup.startAnimation(alphaAnimation2);
        v0.S(v0Var, v0Var.f428j0);
        v0.R(v0Var, R.id.tutorials_tab);
    }
}
