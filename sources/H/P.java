package H;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class P extends O {
    public P(a0 a0Var, WindowInsets windowInsets) {
        super(a0Var, windowInsets);
    }

    @Override // H.W
    public a0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.c.consumeDisplayCutout();
        return a0.d(consumeDisplayCutout, null);
    }

    @Override // H.W
    public C0029d e() {
        DisplayCutout displayCutout;
        displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0029d(displayCutout);
    }

    @Override // H.N, H.W
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p3 = (P) obj;
        return Objects.equals(this.c, p3.c) && Objects.equals(this.f799g, p3.f799g) && N.x(this.f800h, p3.f800h);
    }

    @Override // H.W
    public int hashCode() {
        return this.c.hashCode();
    }
}
