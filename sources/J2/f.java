package J2;

import android.widget.CompoundButton;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TextSetup;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramLayout;
import com.google.android.material.chip.ChipGroup;
import o1.InterfaceC1827C;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1024b;

    public /* synthetic */ f(int i4, Object obj) {
        this.f1023a = i4;
        this.f1024b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
        switch (this.f1023a) {
            case 0:
                ChipGroup chipGroup = (ChipGroup) this.f1024b;
                if (chipGroup.f12357z) {
                    return;
                }
                if (chipGroup.getCheckedChipIds().isEmpty() && chipGroup.f12354v) {
                    chipGroup.b(compoundButton.getId(), true);
                    chipGroup.y = compoundButton.getId();
                    return;
                }
                int id = compoundButton.getId();
                if (!z4) {
                    if (chipGroup.y == id) {
                        ChipGroup.a(chipGroup, -1);
                        return;
                    }
                    return;
                } else {
                    int i4 = chipGroup.y;
                    if (i4 != -1 && i4 != id && chipGroup.f12353u) {
                        chipGroup.b(i4, false);
                    }
                    ChipGroup.a(chipGroup, id);
                    return;
                }
            case 1:
                ((InterfaceC1827C) this.f1024b).m(z4);
                return;
            case 2:
                TextSetup textSetup = (TextSetup) this.f1024b;
                if (z4) {
                    textSetup.f3716q.setVisibility(4);
                    textSetup.f3717r.setVisibility(0);
                    return;
                } else {
                    textSetup.f3716q.setVisibility(0);
                    textSetup.f3717r.setVisibility(4);
                    return;
                }
            case 3:
                m1.b bVar = ((TimeDiagramLayout) this.f1024b).f3725o;
                if (bVar == null) {
                    return;
                }
                bVar.f13986e = z4;
                return;
            default:
                ((m1.b) this.f1024b).f13986e = z4;
                return;
        }
    }
}
