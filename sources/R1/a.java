package R1;

import H1.e;
import O1.r;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1249uc;
import com.google.android.gms.internal.ads.H8;
import com.google.android.gms.internal.ads.L6;
import h2.y;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class a {
    public static void a(Context context, String str, e eVar, b bVar) {
        y.j(context, "Context cannot be null.");
        y.j(str, "AdUnitId cannot be null.");
        y.j(eVar, "AdRequest cannot be null.");
        y.d("#008 Must be called on the main UI thread.");
        AbstractC1066q6.a(context);
        if (((Boolean) L6.f6129i.r()).booleanValue()) {
            if (((Boolean) r.d.c.a(AbstractC1066q6.x9)).booleanValue()) {
                AbstractC1249uc.f10789b.execute(new J1.a(context, str, eVar, bVar, 1));
                return;
            }
        }
        new H8(context, str).c(eVar.f863a, bVar);
    }

    public abstract void b(Activity activity);
}
