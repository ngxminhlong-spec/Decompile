package Y2;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.duracodefactory.logiccircuitsimulatorpro.ui.CircuitExploreDialog;
import com.google.android.gms.internal.ads.C0831kn;
import h1.AbstractC1698a;
import p1.C1921g;
import p1.b0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k implements View.OnTouchListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2168o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f2169p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f2170q;

    public /* synthetic */ k(int i4, Object obj, Object obj2) {
        this.f2168o = i4;
        this.f2170q = obj;
        this.f2169p = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f2168o) {
            case 0:
                m mVar = (m) this.f2170q;
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - mVar.f2178k;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        mVar.f2176i = false;
                    }
                    m.e(mVar, (AutoCompleteTextView) this.f2169p);
                }
                return false;
            default:
                AbstractC1698a abstractC1698a = (AbstractC1698a) this.f2169p;
                if ((abstractC1698a instanceof C1921g) || (abstractC1698a instanceof b0)) {
                    if (motionEvent.getActionMasked() == 0) {
                        abstractC1698a.v();
                    } else if (motionEvent.getActionMasked() == 1) {
                        abstractC1698a.w();
                    }
                    CircuitExploreDialog circuitExploreDialog = (CircuitExploreDialog) ((C0831kn) this.f2170q).f9320q;
                    circuitExploreDialog.f3592v.k(circuitExploreDialog.getContext(), abstractC1698a);
                }
                return true;
        }
    }
}
