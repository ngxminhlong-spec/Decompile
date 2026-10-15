package n1;

import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: n1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1810c {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f14110a;

    static {
        ArrayList arrayList = new ArrayList();
        f14110a = arrayList;
        arrayList.add(new C1808a(0, R.string.tut_title_create_new_proj, R.string.tut_description_create_new_proj, R.drawable.ic_tut_new_proj));
        arrayList.add(new C1808a(1, R.string.tut_title_create_trigger, R.string.tut_description_create_new_trigger, R.drawable.ic_tut_trigger));
        arrayList.add(new C1808a(2, R.string.tut_title_use_generators, R.string.tut_description_use_generators, R.drawable.ic_tut_freq_new));
        arrayList.add(new C1808a(3, R.string.tut_title_selection_modes, R.string.tut_description_selection_modes, R.drawable.ic_tut_sel_new));
        arrayList.add(new C1808a(4, R.string.tut_title_import, R.string.tut_description_import, R.drawable.ic_tut_export_new));
        arrayList.add(new C1808a(5, R.string.tut_title_grid, R.string.tut_description_grid, R.drawable.ic_tut_grid_new));
        arrayList.add(new C1808a(6, R.string.tut_title_styling, R.string.tut_description_styling, R.drawable.ic_tut_style));
        arrayList.add(new C1808a(7, R.string.tut_title_interactive, R.string.tut_description_interactive, R.drawable.ic_tut_interactive));
        arrayList.add(new C1808a(8, R.string.tut_title_cut, R.string.tut_description_cut, R.drawable.ic_tut_cut));
    }

    public static int a(int i4) {
        switch (i4) {
            case 0:
                return R.string.tut_title_create_new_proj;
            case 1:
                return R.string.tut_title_create_trigger;
            case 2:
                return R.string.tut_title_use_generators;
            case 3:
                return R.string.tut_title_selection_modes;
            case 4:
                return R.string.tut_title_import;
            case 5:
                return R.string.tut_title_grid;
            case 6:
                return R.string.tut_title_styling;
            case 7:
                return R.string.tut_title_interactive;
            case 8:
                return R.string.tut_title_cut;
            default:
                return 0;
        }
    }
}
