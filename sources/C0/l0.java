package C0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import androidx.recyclerview.widget.GridLayoutManager;
import b0.AbstractC0171E;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.RecentsRecyclerView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f339a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final RecentsRecyclerView f340b;
    public boolean c;
    public final ViewGroup d;

    /* renamed from: e, reason: collision with root package name */
    public final View f341e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0171E f342f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ H f343g;

    public l0(v0 v0Var, ViewGroup viewGroup) {
        this.f343g = v0Var;
        v0Var.m().getDimensionPixelSize(R.dimen.recent_project_min_width);
        this.d = viewGroup;
        RecentsRecyclerView recentsRecyclerView = (RecentsRecyclerView) viewGroup.findViewById(R.id.projects_recycler);
        this.f340b = recentsRecyclerView;
        j0 j0Var = new j0(v0Var);
        this.f342f = j0Var;
        recentsRecyclerView.setAdapter(j0Var);
        recentsRecyclerView.setLayoutManager(new GridLayoutManager());
        this.f341e = viewGroup.findViewById(R.id.recent_recent_text);
        recentsRecyclerView.setListener(new x0.f(5, this));
        recentsRecyclerView.h(new k0(0, this));
    }

    public l0(D0.p pVar, ViewGroup viewGroup) {
        this.f343g = pVar;
        pVar.m().getDimensionPixelSize(R.dimen.recent_project_min_width);
        this.d = viewGroup;
        RecentsRecyclerView recentsRecyclerView = (RecentsRecyclerView) viewGroup.findViewById(R.id.projects_recycler);
        this.f340b = recentsRecyclerView;
        j0 j0Var = new j0(pVar);
        this.f342f = j0Var;
        recentsRecyclerView.setAdapter(j0Var);
        recentsRecyclerView.setLayoutManager(new GridLayoutManager());
        this.f341e = viewGroup.findViewById(R.id.recent_recent_text);
        recentsRecyclerView.setListener(new D3.d(8, this));
        recentsRecyclerView.h(new k0(1, this));
    }

    public static void a(l0 l0Var, boolean z4) {
        D0.p pVar = (D0.p) l0Var.f343g;
        ViewGroup viewGroup = l0Var.d;
        int visibility = viewGroup.getVisibility();
        int i4 = z4 ? 0 : 8;
        if (visibility == i4) {
            if (visibility != 0 || l0Var.c) {
                return;
            }
            D0.p.R(pVar, R.id.projects_tab);
            return;
        }
        if (i4 != 0) {
            l0Var.c = true;
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(100L);
            viewGroup.startAnimation(alphaAnimation);
            viewGroup.postDelayed(new A0.a(29, l0Var), 100L);
            return;
        }
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(100L);
        viewGroup.setVisibility(0);
        viewGroup.startAnimation(alphaAnimation2);
        D0.p.S(pVar, pVar.f620i0);
        D0.p.R(pVar, R.id.projects_tab);
    }

    public static void b(l0 l0Var, boolean z4) {
        v0 v0Var = (v0) l0Var.f343g;
        ViewGroup viewGroup = l0Var.d;
        int visibility = viewGroup.getVisibility();
        int i4 = z4 ? 0 : 8;
        if (visibility == i4) {
            if (visibility != 0 || l0Var.c) {
                return;
            }
            v0.R(v0Var, R.id.projects_tab);
            return;
        }
        if (i4 != 0) {
            l0Var.c = true;
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(100L);
            viewGroup.startAnimation(alphaAnimation);
            viewGroup.postDelayed(new A0.a(18, l0Var), 100L);
            return;
        }
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(100L);
        viewGroup.setVisibility(0);
        viewGroup.startAnimation(alphaAnimation2);
        v0.S(v0Var, v0Var.f428j0);
        v0.R(v0Var, R.id.projects_tab);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r8, i1.d r9) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.l0.c(int, i1.d):void");
    }

    public void d() {
        v0 v0Var = (v0) this.f343g;
        if (v0Var.f428j0 == R.id.projects_tab && ((j0) this.f342f).d.size() == 0) {
            v0Var.f441w0.setVisibility(0);
        } else {
            v0Var.f441w0.setVisibility(8);
        }
    }

    public void e() {
        D0.p pVar = (D0.p) this.f343g;
        if (pVar.f620i0 == R.id.projects_tab && ((j0) this.f342f).d.size() == 0) {
            pVar.f631t0.setVisibility(0);
        } else {
            pVar.f631t0.setVisibility(8);
        }
    }
}
