package D0;

import C0.G;
import C0.c0;
import C0.u0;
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
public final /* synthetic */ class j implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f587o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f588p;

    public /* synthetic */ j(k kVar, int i4) {
        this.f587o = i4;
        this.f588p = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f587o) {
            case 0:
                c0 c0Var = this.f588p.f589o.f622k0;
                ViewGroup viewGroup = c0Var.c;
                if (!c0Var.f288e) {
                    c0Var.c();
                }
                ((p) c0Var.f291h).f618g0.setDrawerLockMode(1);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(200L);
                viewGroup.setVisibility(0);
                viewGroup.startAnimation(alphaAnimation);
                return;
            case 1:
                ((MainActivity) this.f588p.f589o.f625n0).F(new G());
                return;
            case 2:
                u0.a(this.f588p.f589o.f627p0, true);
                return;
            default:
                p pVar = this.f588p.f589o;
                AbstractActivityC1671f h4 = pVar.h();
                if (h4 == null) {
                    return;
                }
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.setType("*/*");
                intent.addFlags(1);
                try {
                    pVar.J(intent, 1);
                    return;
                } catch (ActivityNotFoundException unused) {
                    Toast.makeText(h4, R.string.no_activity_to_import, 1).show();
                    return;
                }
        }
    }
}
