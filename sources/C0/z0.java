package C0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.RecentsRecyclerView;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TutorialView2;
import java.util.ArrayList;
import m2.AbstractC1806a;
import n1.AbstractC1810c;
import o1.C1841Q;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class z0 extends H {

    /* renamed from: g0, reason: collision with root package name */
    public View f463g0;

    /* renamed from: h0, reason: collision with root package name */
    public ViewGroup f464h0;

    /* renamed from: i0, reason: collision with root package name */
    public ViewGroup f465i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f466j0;

    public static z0 P(int i4) {
        Bundle bundle = new Bundle();
        bundle.putInt(" tutorial_id", i4);
        z0 z0Var = new z0();
        z0Var.G(bundle);
        return z0Var;
    }

    public static ArrayList Q(int i4) {
        ArrayList arrayList = new ArrayList();
        if (i4 == 0) {
            arrayList.add(new C1841Q(R.drawable.ic_tut_1_1, 0, R.string.tut_create_proj_1));
            arrayList.add(new C1841Q(R.drawable.ic_tut_1_2, 0, R.string.tut_create_proj_2));
            arrayList.add(new C1841Q(R.drawable.ic_tut_1_3, 0, R.string.tut_create_proj_3));
            arrayList.add(new C1841Q(R.drawable.ic_tut_1_4, 0, R.string.tut_create_proj_4));
            arrayList.add(new C1841Q(R.drawable.ic_tut_1_5, 0, R.string.tut_create_proj_5));
            return arrayList;
        }
        if (i4 == 1) {
            arrayList.add(new C1841Q(R.drawable.ic_tut_2_1, 0, R.string.tut_create_trigger_1));
            arrayList.add(new C1841Q(R.drawable.ic_tut_2_2, 0, R.string.tut_create_trigger_2));
            arrayList.add(new C1841Q(R.drawable.ic_tut_2_3, 0, R.string.tut_create_trigger_3));
            arrayList.add(new C1841Q(R.drawable.ic_tut_2_4, 0, R.string.tut_create_trigger_4));
            arrayList.add(new C1841Q(R.drawable.ic_tut_1_5, 0, R.string.tut_create_trigger_5));
            return arrayList;
        }
        if (i4 == 2) {
            arrayList.add(new C1841Q(R.drawable.ic_tut_3_1, 0, R.string.tut_use_generators_1));
            arrayList.add(new C1841Q(R.drawable.ic_tut_3_2, 0, R.string.tut_use_generators_2));
            arrayList.add(new C1841Q(R.drawable.ic_tut_3_3, 0, R.string.tut_use_generators_3));
            arrayList.add(new C1841Q(R.drawable.ic_tut_3_4, 0, R.string.tut_use_generators_4));
            return arrayList;
        }
        if (i4 == 3) {
            arrayList.add(new C1841Q(R.drawable.ic_tut_4_1, 0, R.string.tut_selection_modes_1));
            arrayList.add(new C1841Q(R.drawable.ic_tut_4_2, 0, R.string.tut_selection_modes_2));
            arrayList.add(new C1841Q(R.drawable.ic_tut_4_3, 0, R.string.tut_selection_modes_3));
            arrayList.add(new C1841Q(R.drawable.ic_tut_2_3, 0, R.string.tut_selection_modes_4));
            return arrayList;
        }
        if (i4 == 4) {
            arrayList.add(new C1841Q(R.drawable.ic_tut_5_1, 0, R.string.tut_import_1));
            arrayList.add(new C1841Q(R.drawable.ic_tut_5_2, 0, R.string.tut_import_2));
            arrayList.add(new C1841Q(R.drawable.ic_tut_5_3, 0, R.string.tut_import_3));
            return arrayList;
        }
        if (i4 == 5) {
            arrayList.add(new C1841Q(R.drawable.ic_tut_6_1, 0, R.string.tut_grid_1));
            arrayList.add(new C1841Q(R.drawable.ic_tut_6_2, 0, R.string.tut_grid_2));
            arrayList.add(new C1841Q(R.drawable.ic_tut_6_3, 0, R.string.tut_grid_3));
            return arrayList;
        }
        if (i4 == 6) {
            arrayList.add(new C1841Q(R.drawable.ic_tut_7_1, 0, R.string.tut_styling_1));
            arrayList.add(new C1841Q(R.drawable.ic_tut_7_2, 0, R.string.tut_styling_2));
            return arrayList;
        }
        if (i4 == 7) {
            arrayList.add(new C1841Q(R.drawable.ic_tut_4_3, 0, R.string.tut_selection_modes_3));
            arrayList.add(new C1841Q(R.drawable.ic_tut_8_1, 0, R.string.tut_interactive));
            return arrayList;
        }
        if (i4 == 8) {
            arrayList.add(new C1841Q(R.drawable.ic_tut_9_1, 0, R.string.tut_cut_1));
            arrayList.add(new C1841Q(R.drawable.ic_tut_9_2, 0, R.string.tut_cut_2));
            arrayList.add(new C1841Q(R.drawable.ic_tut_9_3, 0, R.string.tut_cut_3));
            arrayList.add(new C1841Q(R.drawable.ic_tut_9_4, 0, R.string.tut_cut_4));
        }
        return arrayList;
    }

    @Override // C0.H
    public final boolean K() {
        Bundle bundle = this.f2853s;
        if ((bundle == null ? -1 : bundle.getInt(" tutorial_id")) != -1 || this.f463g0.getVisibility() == 0) {
            return false;
        }
        if (this.f466j0) {
            return true;
        }
        this.f463g0.setVisibility(0);
        this.f464h0.setVisibility(8);
        return true;
    }

    @Override // C0.H
    public final void N(E e4) {
    }

    @Override // C0.H
    public final void O(A0 a02) {
    }

    public final void R(int i4) {
        if (this.f466j0) {
            return;
        }
        this.f463g0.setVisibility(8);
        this.f464h0.setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) this.f464h0.getChildAt(0);
        viewGroup.removeAllViews();
        TutorialView2 tutorialView2 = (TutorialView2) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tutorial_view_layout2, viewGroup, false);
        tutorialView2.a(AbstractC1810c.a(i4), Q(i4));
        tutorialView2.findViewById(R.id.tut_back_arrow).setOnClickListener(new y0(this, 1));
        viewGroup.addView(tutorialView2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final View r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.tutorials_fragment, viewGroup, false);
        RecentsRecyclerView recentsRecyclerView = (RecentsRecyclerView) inflate.findViewById(R.id.tutorials_recycler);
        this.f464h0 = (ViewGroup) inflate.findViewById(R.id.tutorials_container);
        this.f465i0 = (ViewGroup) inflate.findViewById(R.id.tutorials_tutorial_container);
        this.f463g0 = inflate.findViewById(R.id.tutorials_recycler_container);
        q0 q0Var = new q0();
        boolean H3 = AbstractC1806a.H(viewGroup.getContext());
        this.f466j0 = H3;
        if (H3) {
            this.f464h0.setVisibility(8);
            inflate.findViewById(R.id.tutorials_tutorial_container_scroll).setVisibility(0);
        }
        q0Var.f370f = new D3.d(6, this);
        q0Var.f369e = AbstractC1810c.f14110a;
        recentsRecyclerView.setAdapter(q0Var);
        Bundle bundle2 = this.f2853s;
        int i4 = bundle2 == null ? -1 : bundle2.getInt(" tutorial_id");
        if (i4 != -1) {
            R(i4);
        } else {
            this.f463g0.setVisibility(0);
            this.f464h0.setVisibility(8);
        }
        int dimensionPixelSize = viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.tutorials_min_width);
        GridLayoutManager gridLayoutManager = new GridLayoutManager();
        recentsRecyclerView.setLayoutManager(gridLayoutManager);
        recentsRecyclerView.setListener(new x0(this, recentsRecyclerView, dimensionPixelSize, gridLayoutManager, q0Var));
        inflate.findViewById(R.id.back_arrow).setOnClickListener(new y0(this, 0));
        return inflate;
    }
}
