package D0;

import C0.A0;
import C0.E;
import C0.H;
import C0.q0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.RecentsRecyclerView;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TutorialView2;
import java.util.ArrayList;
import m2.AbstractC1806a;
import n1.AbstractC1810c;
import o1.C1841Q;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class r extends H {

    /* renamed from: g0, reason: collision with root package name */
    public View f640g0;

    /* renamed from: h0, reason: collision with root package name */
    public ViewGroup f641h0;

    /* renamed from: i0, reason: collision with root package name */
    public ViewGroup f642i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f643j0;

    @Override // C0.H
    public final boolean K() {
        Bundle bundle = this.f2853s;
        if ((bundle == null ? -1 : bundle.getInt(" tutorial_id")) != -1 || this.f640g0.getVisibility() == 0) {
            return false;
        }
        if (this.f643j0) {
            return true;
        }
        this.f640g0.setVisibility(0);
        this.f641h0.setVisibility(8);
        return true;
    }

    @Override // C0.H
    public final void N(E e4) {
    }

    @Override // C0.H
    public final void O(A0 a02) {
    }

    public final void P(int i4) {
        if (this.f643j0) {
            return;
        }
        this.f640g0.setVisibility(8);
        this.f641h0.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.f641h0.getChildAt(0);
        viewGroup.removeAllViews();
        TutorialView2 tutorialView2 = (TutorialView2) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tutorial_view_layout2, viewGroup, false);
        int a4 = AbstractC1810c.a(i4);
        ArrayList arrayList = new ArrayList();
        if (i4 == 0) {
            arrayList.add(new C1841Q(R.drawable.ic_tut_1_1, 0, R.string.tut_create_proj_1));
            arrayList.add(new C1841Q(R.drawable.ic_tut_1_2, 0, R.string.tut_create_proj_2));
            arrayList.add(new C1841Q(R.drawable.ic_tut_1_3, 0, R.string.tut_create_proj_3));
            arrayList.add(new C1841Q(R.drawable.ic_tut_1_4, 0, R.string.tut_create_proj_4));
            arrayList.add(new C1841Q(R.drawable.ic_tut_1_5, 0, R.string.tut_create_proj_5));
        } else if (i4 == 1) {
            arrayList.add(new C1841Q(R.drawable.ic_tut_2_1, 0, R.string.tut_create_trigger_1));
            arrayList.add(new C1841Q(R.drawable.ic_tut_2_2, 0, R.string.tut_create_trigger_2));
            arrayList.add(new C1841Q(R.drawable.ic_tut_2_3, 0, R.string.tut_create_trigger_3));
            arrayList.add(new C1841Q(R.drawable.ic_tut_2_4, 0, R.string.tut_create_trigger_4));
            arrayList.add(new C1841Q(R.drawable.ic_tut_1_5, 0, R.string.tut_create_trigger_5));
        } else if (i4 == 2) {
            arrayList.add(new C1841Q(R.drawable.ic_tut_3_1, 0, R.string.tut_use_generators_1));
            arrayList.add(new C1841Q(R.drawable.ic_tut_3_2, 0, R.string.tut_use_generators_2));
            arrayList.add(new C1841Q(R.drawable.ic_tut_3_3, 0, R.string.tut_use_generators_3));
            arrayList.add(new C1841Q(R.drawable.ic_tut_3_4, 0, R.string.tut_use_generators_4));
        } else if (i4 == 3) {
            arrayList.add(new C1841Q(R.drawable.ic_tut_4_1, 0, R.string.tut_selection_modes_1));
            arrayList.add(new C1841Q(R.drawable.ic_tut_4_2, 0, R.string.tut_selection_modes_2));
            arrayList.add(new C1841Q(R.drawable.ic_tut_4_3, 0, R.string.tut_selection_modes_3));
            arrayList.add(new C1841Q(R.drawable.ic_tut_2_3, 0, R.string.tut_selection_modes_4));
        } else if (i4 == 4) {
            arrayList.add(new C1841Q(R.drawable.ic_tut_5_1, 0, R.string.tut_import_1));
            arrayList.add(new C1841Q(R.drawable.ic_tut_5_2, 0, R.string.tut_import_2));
            arrayList.add(new C1841Q(R.drawable.ic_tut_5_3, 0, R.string.tut_import_3));
        } else if (i4 == 5) {
            arrayList.add(new C1841Q(R.drawable.ic_tut_6_1, 0, R.string.tut_grid_1));
            arrayList.add(new C1841Q(R.drawable.ic_tut_6_2, 0, R.string.tut_grid_2));
            arrayList.add(new C1841Q(R.drawable.ic_tut_6_3, 0, R.string.tut_grid_3));
        } else if (i4 == 6) {
            arrayList.add(new C1841Q(R.drawable.ic_tut_7_1, 0, R.string.tut_styling_1));
            arrayList.add(new C1841Q(R.drawable.ic_tut_7_2, 0, R.string.tut_styling_2));
        } else if (i4 == 7) {
            arrayList.add(new C1841Q(R.drawable.ic_tut_4_3, 0, R.string.tut_selection_modes_3));
            arrayList.add(new C1841Q(R.drawable.ic_tut_8_1, 0, R.string.tut_interactive));
        } else if (i4 == 8) {
            arrayList.add(new C1841Q(R.drawable.ic_tut_9_1, 0, R.string.tut_cut_1));
            arrayList.add(new C1841Q(R.drawable.ic_tut_9_2, 0, R.string.tut_cut_2));
            arrayList.add(new C1841Q(R.drawable.ic_tut_9_3, 0, R.string.tut_cut_3));
            arrayList.add(new C1841Q(R.drawable.ic_tut_9_4, 0, R.string.tut_cut_4));
        }
        tutorialView2.a(a4, arrayList);
        tutorialView2.findViewById(R.id.tut_back_arrow).setOnClickListener(new q(this, 1));
        viewGroup.addView(tutorialView2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final View r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.tutorials_fragment, viewGroup, false);
        RecentsRecyclerView recentsRecyclerView = (RecentsRecyclerView) inflate.findViewById(R.id.tutorials_recycler);
        this.f641h0 = (ViewGroup) inflate.findViewById(R.id.tutorials_container);
        this.f642i0 = (ViewGroup) inflate.findViewById(R.id.tutorials_tutorial_container);
        this.f640g0 = inflate.findViewById(R.id.tutorials_recycler_container);
        q0 q0Var = new q0();
        boolean H3 = AbstractC1806a.H(viewGroup.getContext());
        this.f643j0 = H3;
        if (H3) {
            this.f641h0.setVisibility(8);
            inflate.findViewById(R.id.tutorials_tutorial_container_scroll).setVisibility(0);
        }
        q0Var.f370f = new x0.f(9, this);
        q0Var.f369e = AbstractC1810c.f14110a;
        recentsRecyclerView.setAdapter(q0Var);
        Bundle bundle2 = this.f2853s;
        int i4 = bundle2 == null ? -1 : bundle2.getInt(" tutorial_id");
        if (i4 != -1) {
            P(i4);
        } else {
            this.f640g0.setVisibility(0);
            this.f641h0.setVisibility(8);
        }
        viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.tutorials_min_width);
        inflate.findViewById(R.id.back_arrow).setOnClickListener(new q(this, 0));
        return inflate;
    }
}
