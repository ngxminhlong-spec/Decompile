package f;

import H.A;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.gms.internal.ads.C0831kn;
import java.util.WeakHashMap;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class u extends AbstractC1806a {

    /* renamed from: n0, reason: collision with root package name */
    public final /* synthetic */ int f12921n0;

    /* renamed from: o0, reason: collision with root package name */
    public final /* synthetic */ w f12922o0;

    public /* synthetic */ u(w wVar, int i4) {
        this.f12921n0 = i4;
        this.f12922o0 = wVar;
    }

    @Override // H.G
    public final void a() {
        View view;
        int i4 = this.f12921n0;
        w wVar = this.f12922o0;
        switch (i4) {
            case 0:
                if (wVar.f12949v && (view = wVar.f12941n) != null) {
                    view.setTranslationY(0.0f);
                    wVar.f12938k.setTranslationY(0.0f);
                }
                wVar.f12938k.setVisibility(8);
                wVar.f12938k.setTransitioning(false);
                wVar.f12952z = null;
                C0831kn c0831kn = wVar.f12945r;
                if (c0831kn != null) {
                    c0831kn.t(wVar.f12944q);
                    wVar.f12944q = null;
                    wVar.f12945r = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = wVar.f12937j;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = A.f779a;
                    H.r.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                wVar.f12952z = null;
                wVar.f12938k.requestLayout();
                return;
        }
    }
}
