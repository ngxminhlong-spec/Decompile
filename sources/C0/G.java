package C0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import q1.AbstractC1949d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class G extends H {

    /* renamed from: g0, reason: collision with root package name */
    public E f230g0;

    @Override // C0.H
    public final boolean K() {
        return false;
    }

    @Override // C0.H
    public final void N(E e4) {
        this.f230g0 = e4;
    }

    @Override // C0.H
    public final void O(A0 a02) {
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final View r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.help_fragment, viewGroup, false);
        inflate.findViewById(R.id.back_arrow).setOnClickListener(new F(this, 0));
        inflate.findViewById(R.id.help_dialog_contact_us).setOnClickListener(new F(this, 1));
        inflate.findViewById(R.id.help_dialog_privacy).setOnClickListener(new F(this, 2));
        inflate.findViewById(R.id.help_dialog_terms).setOnClickListener(new F(this, 3));
        View findViewById = inflate.findViewById(R.id.ads_consent);
        t2.L l4 = AbstractC1949d.f14653f;
        findViewById.setVisibility((l4 == null || l4.b() != 3) ? 8 : 0);
        findViewById.setOnClickListener(new F(this, 4));
        return inflate;
    }
}
