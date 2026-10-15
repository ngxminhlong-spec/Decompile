package C0;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import f.AbstractActivityC1671f;
import q1.AbstractC1949d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class F implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f228o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G f229p;

    public /* synthetic */ F(G g4, int i4) {
        this.f228o = i4;
        this.f229p = g4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f228o) {
            case 0:
                AbstractActivityC1671f h4 = this.f229p.h();
                if (h4 != null) {
                    h4.onBackPressed();
                    return;
                }
                return;
            case 1:
                G g4 = this.f229p;
                try {
                    AbstractActivityC1671f h5 = g4.h();
                    if (h5 != null) {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.EMAIL", new String[]{"logic.circuit.sim.pro@gmail.com"});
                        intent.putExtra("android.intent.extra.SUBJECT", "Logic Circuit Simulator Support");
                        if (intent.resolveActivity(h5.getPackageManager()) != null) {
                            try {
                                g4.I(intent);
                            } catch (Throwable unused) {
                                Toast.makeText(h5, "logic.circuit.sim.pro@gmail.com", 1).show();
                            }
                        } else {
                            Toast.makeText(h5, "logic.circuit.sim.pro@gmail.com", 1).show();
                        }
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 2:
                E e4 = this.f229p.f230g0;
                if (e4 != null) {
                    ((MainActivity) e4).F(new P());
                    return;
                }
                return;
            case 3:
                E e5 = this.f229p.f230g0;
                if (e5 != null) {
                    ((MainActivity) e5).F(new w0());
                    return;
                }
                return;
            default:
                AbstractC1949d.c(this.f229p.h(), true);
                return;
        }
    }
}
