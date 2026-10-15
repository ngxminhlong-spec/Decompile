package C0;

import android.content.SharedPreferences;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class N implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f238o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f239p;

    /* renamed from: q, reason: collision with root package name */
    public Object f240q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f241r;

    public /* synthetic */ N(H h4, int i4) {
        this.f238o = i4;
        this.f241r = h4;
    }

    public N(androidx.lifecycle.k kVar, androidx.lifecycle.f fVar) {
        this.f238o = 4;
        S3.e.e(kVar, "registry");
        S3.e.e(fVar, "event");
        this.f240q = kVar;
        this.f241r = fVar;
    }

    public N(MainActivity mainActivity, boolean z4, View view) {
        this.f238o = 0;
        this.f241r = mainActivity;
        this.f239p = z4;
        this.f240q = view;
    }

    public N(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z4) {
        this.f238o = 3;
        this.f241r = swipeDismissBehavior;
        this.f240q = view;
        this.f239p = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W2.g gVar;
        int i4 = this.f238o;
        Object obj = this.f241r;
        switch (i4) {
            case 0:
                View view = (View) this.f240q;
                boolean z4 = this.f239p;
                MainActivity mainActivity = (MainActivity) obj;
                if (z4 == AbstractC1806a.C(mainActivity)) {
                    return;
                }
                SharedPreferences.Editor edit = mainActivity.getPreferences(0).edit();
                edit.putBoolean("dark_mode", z4);
                edit.apply();
                AbstractC1806a.f14012V = Boolean.valueOf(z4);
                f.h.f(z4 ? 2 : 1);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(500L);
                view.startAnimation(alphaAnimation);
                view.postDelayed(new A0.a(10, this), 500L);
                return;
            case 1:
                v0 v0Var = (v0) obj;
                if (this.f239p) {
                    return;
                }
                this.f239p = true;
                v0Var.U((String) this.f240q, false);
                v0Var.f426h0.postDelayed(new A0.a(16, this), 1000L);
                return;
            case 2:
                D0.p pVar = (D0.p) obj;
                if (this.f239p) {
                    return;
                }
                this.f239p = true;
                pVar.T((String) this.f240q, false);
                pVar.f618g0.postDelayed(new A0.a(27, this), 1000L);
                return;
            case 3:
                View view2 = (View) this.f240q;
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj;
                M.e eVar = swipeDismissBehavior.f12280a;
                if (eVar != null && eVar.g()) {
                    WeakHashMap weakHashMap = H.A.f779a;
                    view2.postOnAnimation(this);
                    return;
                } else {
                    if (!this.f239p || (gVar = swipeDismissBehavior.f12281b) == null) {
                        return;
                    }
                    view2.setVisibility(8);
                    gVar.f2031a.a(0);
                    return;
                }
            default:
                if (this.f239p) {
                    return;
                }
                ((androidx.lifecycle.k) this.f240q).d((androidx.lifecycle.f) obj);
                this.f239p = true;
                return;
        }
    }
}
