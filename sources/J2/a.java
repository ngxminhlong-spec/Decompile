package J2;

import P2.u;
import P2.v;
import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends AbstractC1806a {

    /* renamed from: n0, reason: collision with root package name */
    public final /* synthetic */ int f960n0;

    /* renamed from: o0, reason: collision with root package name */
    public final /* synthetic */ Object f961o0;

    public /* synthetic */ a(int i4, Object obj) {
        this.f960n0 = i4;
        this.f961o0 = obj;
    }

    private final void V(int i4) {
    }

    @Override // m2.AbstractC1806a
    public final void L(int i4) {
        switch (this.f960n0) {
            case 0:
                return;
            default:
                v vVar = (v) this.f961o0;
                vVar.d = true;
                u uVar = (u) vVar.f1607e.get();
                if (uVar != null) {
                    e eVar = (e) uVar;
                    eVar.t();
                    eVar.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override // m2.AbstractC1806a
    public final void M(Typeface typeface, boolean z4) {
        switch (this.f960n0) {
            case 0:
                Chip chip = (Chip) this.f961o0;
                e eVar = chip.f12343r;
                chip.setText(eVar.f985Q0 ? eVar.f988S : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (z4) {
                    return;
                }
                v vVar = (v) this.f961o0;
                vVar.d = true;
                u uVar = (u) vVar.f1607e.get();
                if (uVar != null) {
                    e eVar2 = (e) uVar;
                    eVar2.t();
                    eVar2.invalidateSelf();
                    return;
                }
                return;
        }
    }
}
