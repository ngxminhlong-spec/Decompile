package C0;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: C0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0011k implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f335o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0008h f336p;

    public /* synthetic */ RunnableC0011k(C0008h c0008h, int i4) {
        this.f335o = i4;
        this.f336p = c0008h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f335o) {
            case 0:
                D d = this.f336p.f323p;
                z0 P4 = z0.P(-1);
                d.f223v0.clearFocus();
                ((MainActivity) d.f219r0).F(P4);
                return;
            case 1:
                D d4 = this.f336p.f323p;
                Context l4 = d4.l();
                if (l4 == null) {
                    return;
                }
                try {
                    Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                    intent.addFlags(2);
                    d4.J(intent, 0);
                    return;
                } catch (Throwable unused) {
                    Toast.makeText(l4, R.string.no_activity_to_import, 1).show();
                    return;
                }
            case 2:
                D d5 = this.f336p.f323p;
                G g4 = new G();
                d5.f223v0.clearFocus();
                ((MainActivity) d5.f219r0).F(g4);
                return;
            default:
                D d6 = this.f336p.f323p;
                Context l5 = d6.l();
                if (l5 == null) {
                    return;
                }
                try {
                    Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                    intent2.addFlags(2);
                    d6.J(intent2, 1);
                    return;
                } catch (Throwable unused2) {
                    Toast.makeText(l5, R.string.no_activity_to_import, 1).show();
                    return;
                }
        }
    }
}
