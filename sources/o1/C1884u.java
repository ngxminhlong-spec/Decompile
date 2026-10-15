package o1;

import H.AbstractC0044t;
import android.view.View;
import b0.AbstractC0204q;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.ui.IcSetup;
import com.google.android.gms.internal.ads.Jn;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1884u extends AbstractC0204q {
    public final C1881r d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ IcSetup f14305e;

    public C1884u(IcSetup icSetup, C1881r c1881r) {
        this.f14305e = icSetup;
        this.f3381a = -1;
        this.d = c1881r;
    }

    public final void e(b0.c0 c0Var) {
        View view = c0Var.f3244a;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = H.A.f779a;
            AbstractC0044t.j(view, floatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        this.f14305e.post(new Jn(this, c0Var, 20, false));
    }
}
