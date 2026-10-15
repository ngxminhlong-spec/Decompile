package M;

import H.A;
import I.g;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
import x0.f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b f1102q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(14);
        this.f1102q = bVar;
    }

    @Override // x0.f
    public final g n(int i4) {
        return new g(AccessibilityNodeInfo.obtain(this.f1102q.n(i4).f918a));
    }

    @Override // x0.f
    public final g v(int i4) {
        b bVar = this.f1102q;
        int i5 = i4 == 2 ? bVar.f1112k : bVar.f1113l;
        if (i5 == Integer.MIN_VALUE) {
            return null;
        }
        return n(i5);
    }

    @Override // x0.f
    public final boolean z(int i4, int i5, Bundle bundle) {
        int i6;
        b bVar = this.f1102q;
        Chip chip = bVar.f1110i;
        if (i4 == -1) {
            WeakHashMap weakHashMap = A.f779a;
            return chip.performAccessibilityAction(i5, bundle);
        }
        if (i5 == 1) {
            return bVar.p(i4);
        }
        if (i5 == 2) {
            return bVar.j(i4);
        }
        boolean z4 = false;
        if (i5 == 64) {
            AccessibilityManager accessibilityManager = bVar.f1109h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i6 = bVar.f1112k) == i4) {
                return false;
            }
            if (i6 != Integer.MIN_VALUE) {
                bVar.f1112k = Integer.MIN_VALUE;
                chip.invalidate();
                bVar.q(i6, 65536);
            }
            bVar.f1112k = i4;
            chip.invalidate();
            bVar.q(i4, 32768);
            return true;
        }
        if (i5 == 128) {
            if (bVar.f1112k != i4) {
                return false;
            }
            bVar.f1112k = Integer.MIN_VALUE;
            chip.invalidate();
            bVar.q(i4, 65536);
            return true;
        }
        Chip chip2 = ((J2.c) bVar).f963q;
        if (i5 == 16) {
            if (i4 == 0) {
                return chip2.performClick();
            }
            if (i4 == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f12346u;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z4 = true;
                }
                chip2.f12339D.q(1, 1);
            }
        }
        return z4;
    }
}
