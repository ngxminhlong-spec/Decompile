package C0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class w0 extends H {
    @Override // C0.H
    public final boolean K() {
        return false;
    }

    @Override // C0.H
    public final void N(E e4) {
    }

    @Override // C0.H
    public final void O(A0 a02) {
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0157f
    public final View r(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.terms_fragment, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.privacy_text_view)).setText(android.support.v4.media.session.a.m(l(), "terms.html"));
        return inflate;
    }
}
