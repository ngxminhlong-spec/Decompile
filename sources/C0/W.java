package C0;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Toast;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import f.AbstractActivityC1671f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class W implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f258o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ X f259p;

    public /* synthetic */ W(X x4, int i4) {
        this.f258o = i4;
        this.f259p = x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f258o) {
            case 0:
                u0.b(this.f259p.f260o.f435q0, true);
                return;
            case 1:
                v0 v0Var = this.f259p.f260o;
                AbstractActivityC1671f h4 = v0Var.h();
                if (h4 == null) {
                    return;
                }
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.setType("*/*");
                intent.addFlags(1);
                try {
                    v0Var.J(intent, 1);
                    return;
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(h4, R.string.no_activity_to_import, 1).show();
                    return;
                }
            case 2:
                ((MainActivity) this.f259p.f260o.f433o0).F(new G());
                return;
            default:
                c0 c0Var = this.f259p.f260o.f430l0;
                ViewGroup viewGroup = c0Var.c;
                if (!c0Var.f288e) {
                    c0Var.c();
                }
                ((v0) c0Var.f291h).f426h0.setDrawerLockMode(1);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(200L);
                viewGroup.setVisibility(0);
                viewGroup.startAnimation(alphaAnimation);
                return;
        }
    }
}
