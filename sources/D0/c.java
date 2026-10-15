package D0;

import C0.G;
import C0.z0;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f533o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d f534p;

    public /* synthetic */ c(d dVar, int i4) {
        this.f533o = i4;
        this.f534p = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f533o) {
            case 0:
                g gVar = this.f534p.f536p;
                ((MainActivity) gVar.f573o0).F(new G());
                return;
            case 1:
                Context l4 = this.f534p.f536p.l();
                if (l4 == null) {
                    return;
                }
                try {
                    new Intent("android.intent.action.OPEN_DOCUMENT_TREE").addFlags(2);
                    return;
                } catch (Throwable unused) {
                    Toast.makeText(l4, R.string.no_activity_to_import, 1).show();
                    return;
                }
            case 2:
                g gVar2 = this.f534p.f536p;
                ((MainActivity) gVar2.f573o0).F(z0.P(-1));
                return;
            default:
                g gVar3 = this.f534p.f536p;
                Context l5 = gVar3.l();
                if (l5 == null) {
                    return;
                }
                try {
                    Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                    intent.addFlags(2);
                    gVar3.J(intent, 1);
                    return;
                } catch (Throwable unused2) {
                    Toast.makeText(l5, R.string.no_activity_to_import, 1).show();
                    return;
                }
        }
    }
}
